package org.telegram.ui.iv;

import android.view.View;
import android.view.ViewParent;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.VoIPFragment$8$$ExternalSyntheticLambda1;

public final class RichEditorHistory {
    public final PhotoViewer.AnonymousClass24 delegate;
    public boolean dirty;
    public boolean restoring;
    public final ArrayDeque undoStack = new ArrayDeque();
    public final ArrayDeque redoStack = new ArrayDeque();
    public final VoIPFragment$8$$ExternalSyntheticLambda1 commitRunnable = new VoIPFragment$8$$ExternalSyntheticLambda1(this, 18);
    public Snapshot baseline = capture();

    public final class FocusState {
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

    public final class RowState {
        public final byte[] blockData;
        public final boolean checkbox;
        public final boolean checked;
        public final boolean detailsEnd;
        public final long id;
        public final int level;
        public final MediaUploadState media;
        public final ArrayList medias;
        public final int num;
        public final ArrayList quoteIds;

        public RowState(long j, byte[] bArr, int i, int i2, boolean z, boolean z2, boolean z3, MediaUploadState mediaUploadState, ArrayList arrayList, ArrayList arrayList2) {
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

    public final class Snapshot {
        public final FocusState focus;
        public final RowState[] rows;

        public Snapshot(RowState[] rowStateArr, FocusState focusState) {
            this.rows = rowStateArr;
            this.focus = focusState;
        }
    }

    public RichEditorHistory(PhotoViewer.AnonymousClass24 anonymousClass24) {
        this.delegate = anonymousClass24;
    }

    public static void normalize(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return;
        }
        if (pageBlock.text == null) {
            pageBlock.text = new TL_iv.textEmpty();
        }
        if (pageBlock.caption == null) {
            TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
            pageCaption.text = new TL_iv.textEmpty();
            pageCaption.credit = new TL_iv.textEmpty();
            pageBlock.caption = pageCaption;
        }
        int i = 0;
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
            if (pageblockblockquote.caption == null) {
                pageblockblockquote.caption = new TL_iv.textEmpty();
            }
        } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
            TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
            if (pageblockblockquoteblocks.blocks == null) {
                pageblockblockquoteblocks.blocks = new ArrayList<>();
            }
            ArrayList<TL_iv.PageBlock> arrayList = pageblockblockquoteblocks.blocks;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                TL_iv.PageBlock pageBlock2 = arrayList.get(i2);
                i2++;
                normalize(pageBlock2);
            }
            if (pageblockblockquoteblocks.caption == null) {
                pageblockblockquoteblocks.caption = new TL_iv.textEmpty();
            }
        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
            if (pageblockpullquote.caption == null) {
                pageblockpullquote.caption = new TL_iv.textEmpty();
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
                pageblocktable.title = new TL_iv.textEmpty();
            }
            if (pageblocktable.rows == null) {
                pageblocktable.rows = new ArrayList<>();
            }
            ArrayList<TL_iv.pageTableRow> arrayList2 = pageblocktable.rows;
            int size2 = arrayList2.size();
            int i3 = 0;
            while (i3 < size2) {
                TL_iv.pageTableRow pagetablerow = arrayList2.get(i3);
                i3++;
                TL_iv.pageTableRow pagetablerow2 = pagetablerow;
                if (pagetablerow2 != null) {
                    if (pagetablerow2.cells == null) {
                        pagetablerow2.cells = new ArrayList<>();
                    }
                    ArrayList<TL_iv.pageTableCell> arrayList3 = pagetablerow2.cells;
                    int size3 = arrayList3.size();
                    int i4 = 0;
                    while (i4 < size3) {
                        TL_iv.pageTableCell pagetablecell = arrayList3.get(i4);
                        i4++;
                        TL_iv.pageTableCell pagetablecell2 = pagetablecell;
                        if (pagetablecell2 != null && pagetablecell2.text == null) {
                            pagetablecell2.text = new TL_iv.textEmpty();
                        }
                    }
                }
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
            TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
            if (pageblockbuttonrow.buttons == null) {
                pageblockbuttonrow.buttons = new ArrayList<>();
            }
            ArrayList<TL_keyboard.PageButton> arrayList4 = pageblockbuttonrow.buttons;
            int size4 = arrayList4.size();
            while (i < size4) {
                TL_keyboard.PageButton pageButton = arrayList4.get(i);
                i++;
                TL_keyboard.PageButton pageButton2 = pageButton;
                if (pageButton2 != null && pageButton2.text == null) {
                    pageButton2.text = new TL_iv.textEmpty();
                }
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
            if (pageblockcollage.items == null) {
                pageblockcollage.items = new ArrayList<>();
            }
            ArrayList<TL_iv.PageBlock> arrayList5 = pageblockcollage.items;
            int size5 = arrayList5.size();
            while (i < size5) {
                TL_iv.PageBlock pageBlock3 = arrayList5.get(i);
                i++;
                normalize(pageBlock3);
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
            if (pageblockslideshow.items == null) {
                pageblockslideshow.items = new ArrayList<>();
            }
            ArrayList<TL_iv.PageBlock> arrayList6 = pageblockslideshow.items;
            int size6 = arrayList6.size();
            while (i < size6) {
                TL_iv.PageBlock pageBlock4 = arrayList6.get(i);
                i++;
                normalize(pageBlock4);
            }
        }
    }

    public final void applyRestore(Snapshot snapshot) {
        TL_iv.PageBlock pageblockparagraph;
        this.dirty = false;
        this.restoring = true;
        ArrayList arrayList = new ArrayList(snapshot.rows.length);
        for (RowState rowState : snapshot.rows) {
            try {
                SerializedData serializedData = new SerializedData(rowState.blockData);
                pageblockparagraph = TL_iv.PageBlock.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                serializedData.cleanup();
                if (pageblockparagraph == null) {
                    pageblockparagraph = new TL_iv.pageBlockParagraph();
                    pageblockparagraph.text = new TL_iv.textEmpty();
                }
            } catch (Throwable th) {
                FileLog.e(th);
            }
            BlockRow blockRow = new BlockRow(pageblockparagraph, rowState.level, rowState.num, rowState.id);
            blockRow.checkbox = rowState.checkbox;
            blockRow.checked = rowState.checked;
            blockRow.detailsEnd = rowState.detailsEnd;
            blockRow.media = rowState.media;
            ArrayList arrayList2 = rowState.medias;
            blockRow.medias = arrayList2 != null ? new ArrayList(arrayList2) : null;
            blockRow.quoteIds.addAll(rowState.quoteIds);
            arrayList.add(blockRow);
        }
        PhotoViewer.AnonymousClass24 anonymousClass24 = this.delegate;
        RichEditorListView richEditorListView = (RichEditorListView) anonymousClass24.this$0;
        richEditorListView.textSelectionHelper.clear(false);
        ArrayList arrayList3 = richEditorListView.rows;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        richEditorListView.renumberAllRuns();
        richEditorListView.adapter.update(false);
        FocusState focusState = snapshot.focus;
        if (focusState.rowId >= 0) {
            richEditorListView.post(new RichTableCell$$ExternalSyntheticLambda3(13, richEditorListView, focusState));
        }
        richEditorListView.delegate.onContentChanged();
        this.restoring = false;
        ((RichEditorListView) anonymousClass24.this$0).delegate.onHistoryChanged();
    }

    public final boolean canUndo() {
        return this.dirty || !this.undoStack.isEmpty();
    }

    public final Snapshot capture() {
        RichCaptionHost richCaptionHost;
        FocusState focusState;
        int i;
        int iIndexOf;
        ArrayList arrayList;
        PhotoViewer.AnonymousClass24 anonymousClass24 = this.delegate;
        ArrayList arrayList2 = ((RichEditorListView) anonymousClass24.this$0).rows;
        HashMap map = new HashMap();
        Snapshot snapshot = this.baseline;
        if (snapshot != null) {
            for (RowState rowState : snapshot.rows) {
                map.put(Long.valueOf(rowState.id), rowState);
            }
        }
        RowState[] rowStateArr = new RowState[arrayList2.size()];
        int i2 = 0;
        while (i2 < arrayList2.size()) {
            BlockRow blockRow = (BlockRow) arrayList2.get(i2);
            TL_iv.PageBlock pageBlock = blockRow.block;
            normalize(pageBlock);
            SerializedData serializedData = new SerializedData(pageBlock.getObjectSize());
            pageBlock.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            RowState rowState2 = (RowState) map.get(Long.valueOf(blockRow.id));
            ArrayList arrayList3 = blockRow.quoteIds;
            if (rowState2 != null && rowState2.level == blockRow.level && rowState2.num == blockRow.num && rowState2.checkbox == blockRow.checkbox && rowState2.checked == blockRow.checked && rowState2.detailsEnd == blockRow.detailsEnd && rowState2.media == blockRow.media) {
                ArrayList arrayList4 = blockRow.medias;
                ArrayList arrayList5 = rowState2.medias;
                if (arrayList5 != arrayList4) {
                    if (arrayList5 != null && arrayList4 != null && arrayList5.size() == arrayList4.size()) {
                        int i3 = 0;
                        while (true) {
                            if (i3 < arrayList5.size()) {
                                if (arrayList5.get(i3) == arrayList4.get(i3)) {
                                    i3++;
                                }
                            } else if (rowState2.quoteIds.equals(arrayList3) && Arrays.equals(rowState2.blockData, byteArray)) {
                                rowStateArr[i2] = rowState2;
                                arrayList2 = arrayList2;
                            }
                        }
                    }
                    int i4 = blockRow.level;
                    int i5 = blockRow.num;
                    boolean z = blockRow.checkbox;
                    boolean z2 = blockRow.checked;
                    boolean z3 = blockRow.detailsEnd;
                    MediaUploadState mediaUploadState = blockRow.media;
                    if (blockRow.medias != null) {
                        arrayList = new ArrayList(blockRow.medias);
                    } else {
                        arrayList = null;
                    }
                    rowStateArr[i2] = new RowState(blockRow.id, byteArray, i4, i5, z, z2, z3, mediaUploadState, arrayList, new ArrayList(arrayList3));
                } else if (rowState2.quoteIds.equals(arrayList3)) {
                    int i6 = blockRow.level;
                    int i7 = blockRow.num;
                    boolean z4 = blockRow.checkbox;
                    boolean z5 = blockRow.checked;
                    boolean z6 = blockRow.detailsEnd;
                    MediaUploadState mediaUploadState2 = blockRow.media;
                    if (blockRow.medias != null) {
                        arrayList = new ArrayList(blockRow.medias);
                    } else {
                        arrayList = null;
                    }
                    rowStateArr[i2] = new RowState(blockRow.id, byteArray, i6, i7, z4, z5, z6, mediaUploadState2, arrayList, new ArrayList(arrayList3));
                } else {
                    int i8 = blockRow.level;
                    int i9 = blockRow.num;
                    boolean z7 = blockRow.checkbox;
                    boolean z8 = blockRow.checked;
                    boolean z9 = blockRow.detailsEnd;
                    MediaUploadState mediaUploadState3 = blockRow.media;
                    if (blockRow.medias != null) {
                        arrayList = new ArrayList(blockRow.medias);
                    } else {
                        arrayList = null;
                    }
                    rowStateArr[i2] = new RowState(blockRow.id, byteArray, i8, i9, z7, z8, z9, mediaUploadState3, arrayList, new ArrayList(arrayList3));
                }
            } else {
                int i10 = blockRow.level;
                int i11 = blockRow.num;
                boolean z10 = blockRow.checkbox;
                boolean z11 = blockRow.checked;
                boolean z12 = blockRow.detailsEnd;
                MediaUploadState mediaUploadState4 = blockRow.media;
                if (blockRow.medias != null) {
                    arrayList = new ArrayList(blockRow.medias);
                } else {
                    arrayList = null;
                }
                rowStateArr[i2] = new RowState(blockRow.id, byteArray, i10, i11, z10, z11, z12, mediaUploadState4, arrayList, new ArrayList(arrayList3));
            }
            i2++;
            map = map;
            arrayList2 = arrayList2;
        }
        View viewFindFocus = ((RichEditorListView) anonymousClass24.this$0).findFocus();
        boolean z13 = viewFindFocus instanceof RichEditText;
        FocusState focusState2 = FocusState.NONE;
        if (z13) {
            ?? r1 = (RichEditText) viewFindFocus;
            int selectionStart = r1.getSelectionStart();
            int selectionEnd = r1.getSelectionEnd();
            ?? FindTableCellAncestor = RichEditorListView.findTableCellAncestor(r1);
            if (FindTableCellAncestor == 0 || FindTableCellAncestor.getRow() == null) {
                if (!(r1 instanceof RichCaptionHost)) {
                    ViewParent parent = r1.getParent();
                    while (true) {
                        if (parent == null) {
                            richCaptionHost = null;
                            break;
                        }
                        if (parent instanceof RichCaptionHost) {
                            richCaptionHost = (RichCaptionHost) parent;
                            break;
                        }
                        parent = parent.getParent();
                    }
                } else {
                    richCaptionHost = (RichCaptionHost) r1;
                }
                if (richCaptionHost == null || richCaptionHost.getRow() == null) {
                    while (r1 != 0 && !(r1 instanceof RichTextCell)) {
                        Object parent2 = r1.getParent();
                        r1 = parent2 instanceof View ? (View) parent2 : 0;
                    }
                    if (r1 instanceof RichTextCell) {
                        RichTextCell richTextCell = (RichTextCell) r1;
                        if (richTextCell.getRow() != null) {
                            focusState = new FocusState(richTextCell.getRow().id, -1, selectionStart, selectionEnd);
                        }
                    }
                } else {
                    focusState = new FocusState(richCaptionHost.getRow().id, -1, selectionStart, selectionEnd);
                }
            } else if (r1 == FindTableCellAncestor.getTitleEditText()) {
                focusState = new FocusState(FindTableCellAncestor.getRow().id, 0, selectionStart, selectionEnd);
            } else {
                RichTableCellHost richTableCellHostFindHostContaining = FindTableCellAncestor.findHostContaining(r1);
                if (richTableCellHostFindHostContaining != null) {
                    TL_iv.pageTableCell pagetablecell = richTableCellHostFindHostContaining.cell;
                    TableModel tableModel = FindTableCellAncestor.model;
                    if (tableModel != null && (iIndexOf = tableModel.anchorsRowMajor.indexOf(pagetablecell)) >= 0) {
                        i = iIndexOf + 1;
                    } else {
                        i = -1;
                    }
                } else {
                    i = -1;
                }
                focusState = new FocusState(FindTableCellAncestor.getRow().id, i, selectionStart, selectionEnd);
            }
            focusState2 = focusState;
        }
        return new Snapshot(rowStateArr, focusState2);
    }

    public final void commit() {
        AndroidUtilities.cancelRunOnUIThread(this.commitRunnable);
        if (!this.dirty || this.restoring) {
            return;
        }
        Snapshot snapshotCapture = capture();
        this.dirty = false;
        Snapshot snapshot = this.baseline;
        if (snapshot != null) {
            RowState[] rowStateArr = snapshot.rows;
            int length = rowStateArr.length;
            RowState[] rowStateArr2 = snapshotCapture.rows;
            if (length == rowStateArr2.length) {
                for (int i = 0; i < rowStateArr.length; i++) {
                    if (rowStateArr[i] == rowStateArr2[i]) {
                    }
                }
                return;
            }
        }
        ArrayDeque arrayDeque = this.undoStack;
        arrayDeque.addLast(this.baseline);
        while (arrayDeque.size() > 150) {
            arrayDeque.removeFirst();
        }
        this.redoStack.clear();
        this.baseline = snapshotCapture;
        ((RichEditorListView) this.delegate.this$0).delegate.onHistoryChanged();
    }

    public final void onBeforeChange(int i, int i2) {
        if (this.restoring) {
            return;
        }
        if (i > 16 || i2 > 16) {
            AndroidUtilities.cancelRunOnUIThread(this.commitRunnable);
            commit();
        }
    }

    public final void onTyping() {
        if (this.restoring) {
            return;
        }
        this.dirty = true;
        VoIPFragment$8$$ExternalSyntheticLambda1 voIPFragment$8$$ExternalSyntheticLambda1 = this.commitRunnable;
        AndroidUtilities.cancelRunOnUIThread(voIPFragment$8$$ExternalSyntheticLambda1);
        AndroidUtilities.runOnUIThread(voIPFragment$8$$ExternalSyntheticLambda1, 800L);
        ((RichEditorListView) this.delegate.this$0).delegate.onHistoryChanged();
    }

    public final void record() {
        if (this.restoring) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.commitRunnable);
        this.dirty = true;
        commit();
    }

    public final void redo() {
        AndroidUtilities.cancelRunOnUIThread(this.commitRunnable);
        commit();
        ArrayDeque arrayDeque = this.redoStack;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.undoStack.addLast(this.baseline);
        Snapshot snapshot = (Snapshot) arrayDeque.removeLast();
        this.baseline = snapshot;
        applyRestore(snapshot);
    }

    public final void resetBaseline() {
        AndroidUtilities.cancelRunOnUIThread(this.commitRunnable);
        this.undoStack.clear();
        this.redoStack.clear();
        this.baseline = capture();
        this.dirty = false;
        ((RichEditorListView) this.delegate.this$0).delegate.onHistoryChanged();
    }

    public final void undo() {
        AndroidUtilities.cancelRunOnUIThread(this.commitRunnable);
        commit();
        ArrayDeque arrayDeque = this.undoStack;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.redoStack.addLast(this.baseline);
        Snapshot snapshot = (Snapshot) arrayDeque.removeLast();
        this.baseline = snapshot;
        applyRestore(snapshot);
    }
}
