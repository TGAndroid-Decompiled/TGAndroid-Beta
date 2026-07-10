package org.telegram.ui.iv;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

public class RichEditorHistory {
    private final Delegate delegate;
    private boolean dirty;
    private boolean restoring;
    private final ArrayDeque undoStack = new ArrayDeque();
    private final ArrayDeque redoStack = new ArrayDeque();
    private final Runnable commitRunnable = new Runnable() {
        @Override
        public final void run() {
            this.f$0.commit();
        }
    };
    private Snapshot baseline = capture();

    public interface Delegate {
        FocusState captureFocus();

        ArrayList getRows();

        void onHistoryChanged();

        void restoreRows(List list, FocusState focusState);
    }

    public static final class FocusState {
        public static final FocusState NONE = new FocusState(-1, -1, 0, 0);
        public final int childIndex;
        public final long rowId;
        public final int selEnd;
        public final int selStart;

        public FocusState(long j, int i, int i2, int i3) {
            this.rowId = j;
            this.childIndex = i;
            this.selStart = i2;
            this.selEnd = i3;
        }
    }

    private static final class RowState {
        final byte[] blockData;
        final boolean checkbox;
        final boolean checked;
        final boolean detailsEnd;
        final long id;
        final int level;
        final MediaUploadState media;
        final ArrayList medias;
        final int num;
        final ArrayList quoteIds;

        RowState(long j, byte[] bArr, int i, int i2, boolean z, boolean z2, boolean z3, MediaUploadState mediaUploadState, ArrayList arrayList, ArrayList arrayList2) {
            this.id = j;
            this.blockData = bArr;
            this.level = i;
            this.num = i2;
            this.checkbox = z;
            this.checked = z2;
            this.detailsEnd = z3;
            this.media = mediaUploadState;
            this.medias = arrayList;
            this.quoteIds = arrayList2;
        }
    }

    private static final class Snapshot {
        final FocusState focus;
        final RowState[] rows;

        Snapshot(RowState[] rowStateArr, FocusState focusState) {
            this.rows = rowStateArr;
            this.focus = focusState;
        }
    }

    public RichEditorHistory(Delegate delegate) {
        this.delegate = delegate;
    }

    public void onTyping() {
        if (this.restoring) {
            return;
        }
        this.dirty = true;
        AndroidUtilities.cancelRunOnUIThread(this.commitRunnable);
        AndroidUtilities.runOnUIThread(this.commitRunnable, 800L);
        this.delegate.onHistoryChanged();
    }

    public void onBeforeChange(int i, int i2) {
        if (this.restoring) {
            return;
        }
        if (i > 16 || i2 > 16) {
            flush();
        }
    }

    public void flush() {
        AndroidUtilities.cancelRunOnUIThread(this.commitRunnable);
        commit();
    }

    public void record() {
        if (this.restoring) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.commitRunnable);
        this.dirty = true;
        commit();
    }

    public void resetBaseline() {
        AndroidUtilities.cancelRunOnUIThread(this.commitRunnable);
        this.undoStack.clear();
        this.redoStack.clear();
        this.baseline = capture();
        this.dirty = false;
        this.delegate.onHistoryChanged();
    }

    public boolean canUndo() {
        return this.dirty || !this.undoStack.isEmpty();
    }

    public boolean canRedo() {
        return !this.redoStack.isEmpty();
    }

    public void undo() {
        flush();
        if (this.undoStack.isEmpty()) {
            return;
        }
        this.redoStack.addLast(this.baseline);
        Snapshot snapshot = (Snapshot) this.undoStack.removeLast();
        this.baseline = snapshot;
        applyRestore(snapshot);
    }

    public void redo() {
        flush();
        if (this.redoStack.isEmpty()) {
            return;
        }
        this.undoStack.addLast(this.baseline);
        Snapshot snapshot = (Snapshot) this.redoStack.removeLast();
        this.baseline = snapshot;
        applyRestore(snapshot);
    }

    public void commit() {
        AndroidUtilities.cancelRunOnUIThread(this.commitRunnable);
        if (!this.dirty || this.restoring) {
            return;
        }
        Snapshot snapshotCapture = capture();
        this.dirty = false;
        if (sameAs(this.baseline, snapshotCapture)) {
            return;
        }
        this.undoStack.addLast(this.baseline);
        while (this.undoStack.size() > 150) {
            this.undoStack.removeFirst();
        }
        this.redoStack.clear();
        this.baseline = snapshotCapture;
        this.delegate.onHistoryChanged();
    }

    private void applyRestore(Snapshot snapshot) {
        this.dirty = false;
        this.restoring = true;
        ArrayList arrayList = new ArrayList(snapshot.rows.length);
        for (RowState rowState : snapshot.rows) {
            BlockRow blockRow = new BlockRow(deserializeBlock(rowState.blockData), rowState.level, rowState.num, rowState.id);
            blockRow.checkbox = rowState.checkbox;
            blockRow.checked = rowState.checked;
            blockRow.detailsEnd = rowState.detailsEnd;
            blockRow.media = rowState.media;
            blockRow.medias = rowState.medias != null ? new ArrayList(rowState.medias) : null;
            ArrayList arrayList2 = rowState.quoteIds;
            if (arrayList2 != null) {
                blockRow.quoteIds.addAll(arrayList2);
            }
            arrayList.add(blockRow);
        }
        this.delegate.restoreRows(arrayList, snapshot.focus);
        this.restoring = false;
        this.delegate.onHistoryChanged();
    }

    private Snapshot capture() {
        ArrayList arrayList;
        HashMap map;
        ArrayList arrayList2;
        ArrayList rows = this.delegate.getRows();
        HashMap map2 = new HashMap();
        Snapshot snapshot = this.baseline;
        int i = 0;
        if (snapshot != null) {
            for (RowState rowState : snapshot.rows) {
                map2.put(Long.valueOf(rowState.id), rowState);
            }
        }
        RowState[] rowStateArr = new RowState[rows.size()];
        while (i < rows.size()) {
            BlockRow blockRow = (BlockRow) rows.get(i);
            byte[] bArrSerializeBlock = serializeBlock(blockRow.block);
            RowState rowState2 = (RowState) map2.get(Long.valueOf(blockRow.id));
            if (rowState2 != null && rowState2.level == blockRow.level && rowState2.num == blockRow.num && rowState2.checkbox == blockRow.checkbox && rowState2.checked == blockRow.checked && rowState2.detailsEnd == blockRow.detailsEnd && rowState2.media == blockRow.media && sameMedias(rowState2.medias, blockRow.medias) && rowState2.quoteIds.equals(blockRow.quoteIds) && Arrays.equals(rowState2.blockData, bArrSerializeBlock)) {
                rowStateArr[i] = rowState2;
                arrayList = rows;
                map = map2;
            } else {
                long j = blockRow.id;
                int i2 = blockRow.level;
                int i3 = blockRow.num;
                boolean z = blockRow.checkbox;
                boolean z2 = blockRow.checked;
                boolean z3 = blockRow.detailsEnd;
                MediaUploadState mediaUploadState = blockRow.media;
                arrayList = rows;
                if (blockRow.medias != null) {
                    map = map2;
                    arrayList2 = new ArrayList(blockRow.medias);
                } else {
                    map = map2;
                    arrayList2 = null;
                }
                rowStateArr[i] = new RowState(j, bArrSerializeBlock, i2, i3, z, z2, z3, mediaUploadState, arrayList2, new ArrayList(blockRow.quoteIds));
            }
            i++;
            rows = arrayList;
            map2 = map;
        }
        return new Snapshot(rowStateArr, this.delegate.captureFocus());
    }

    private static boolean sameAs(Snapshot snapshot, Snapshot snapshot2) {
        if (snapshot == null || snapshot2 == null || snapshot.rows.length != snapshot2.rows.length) {
            return false;
        }
        int i = 0;
        while (true) {
            RowState[] rowStateArr = snapshot.rows;
            if (i >= rowStateArr.length) {
                return true;
            }
            if (rowStateArr[i] != snapshot2.rows[i]) {
                return false;
            }
            i++;
        }
    }

    private static boolean sameMedias(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList == arrayList2) {
            return true;
        }
        if (arrayList == null || arrayList2 == null || arrayList.size() != arrayList2.size()) {
            return false;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) != arrayList2.get(i)) {
                return false;
            }
        }
        return true;
    }

    private static byte[] serializeBlock(TL_iv.PageBlock pageBlock) {
        normalize(pageBlock);
        SerializedData serializedData = new SerializedData(pageBlock.getObjectSize());
        pageBlock.serializeToStream(serializedData);
        byte[] byteArray = serializedData.toByteArray();
        serializedData.cleanup();
        return byteArray;
    }

    private static TL_iv.PageBlock deserializeBlock(byte[] bArr) {
        try {
            SerializedData serializedData = new SerializedData(bArr);
            TL_iv.PageBlock pageBlockTLdeserialize = TL_iv.PageBlock.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            serializedData.cleanup();
            if (pageBlockTLdeserialize != null) {
                return pageBlockTLdeserialize;
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        pageblockparagraph.text = new TL_iv.textEmpty();
        return pageblockparagraph;
    }

    private static void normalize(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return;
        }
        if (pageBlock.text == null) {
            pageBlock.text = emptyRichText();
        }
        if (pageBlock.caption == null) {
            pageBlock.caption = emptyCaption();
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
            if (pageblockblockquote.caption == null) {
                pageblockblockquote.caption = emptyRichText();
            }
        } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
            TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
            if (pageblockblockquoteblocks.blocks == null) {
                pageblockblockquoteblocks.blocks = new ArrayList<>();
            }
            Iterator<TL_iv.PageBlock> it = pageblockblockquoteblocks.blocks.iterator();
            while (it.hasNext()) {
                normalize(it.next());
            }
            if (pageblockblockquoteblocks.caption == null) {
                pageblockblockquoteblocks.caption = emptyRichText();
            }
        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
            if (pageblockpullquote.caption == null) {
                pageblockpullquote.caption = emptyRichText();
            }
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
            if (pageblockpreformatted.language == null) {
                pageblockpreformatted.language = "";
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockMath) {
            TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) pageBlock;
            if (pageblockmath.source == null) {
                pageblockmath.source = "";
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockMap) {
            TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
            if (pageblockmap.geo == null) {
                pageblockmap.geo = new TLRPC.TL_geoPointEmpty();
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock;
            if (pageblocktable.title == null) {
                pageblocktable.title = emptyRichText();
            }
            if (pageblocktable.rows == null) {
                pageblocktable.rows = new ArrayList<>();
            }
            Iterator<TL_iv.pageTableRow> it2 = pageblocktable.rows.iterator();
            while (it2.hasNext()) {
                TL_iv.pageTableRow next = it2.next();
                if (next != null) {
                    if (next.cells == null) {
                        next.cells = new ArrayList<>();
                    }
                    Iterator<TL_iv.pageTableCell> it3 = next.cells.iterator();
                    while (it3.hasNext()) {
                        TL_iv.pageTableCell next2 = it3.next();
                        if (next2 != null && next2.text == null) {
                            next2.text = emptyRichText();
                        }
                    }
                }
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
            if (pageblockcollage.items == null) {
                pageblockcollage.items = new ArrayList<>();
            }
            Iterator<TL_iv.PageBlock> it4 = pageblockcollage.items.iterator();
            while (it4.hasNext()) {
                normalize(it4.next());
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
            if (pageblockslideshow.items == null) {
                pageblockslideshow.items = new ArrayList<>();
            }
            Iterator<TL_iv.PageBlock> it5 = pageblockslideshow.items.iterator();
            while (it5.hasNext()) {
                normalize(it5.next());
            }
        }
    }

    private static TL_iv.RichText emptyRichText() {
        return new TL_iv.textEmpty();
    }

    private static TL_iv.PageCaption emptyCaption() {
        TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
        pageCaption.text = emptyRichText();
        pageCaption.credit = emptyRichText();
        return pageCaption;
    }
}
