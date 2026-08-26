package org.telegram.ui.iv;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.webkit.MimeTypeMap;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.internal.mlkit_language_id_common.zzhr;
import com.google.android.gms.internal.mlkit_language_id_common.zziq;
import com.google.android.gms.internal.mlkit_language_id_common.zzit;
import com.google.android.gms.internal.mlkit_vision_label.zzdu;
import com.google.android.gms.internal.mlkit_vision_label.zzdv;
import j$.util.Comparator$CC;
import j$.util.Map;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline2;
import org.telegram.messenger.RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.FloatingToolbar;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda174;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ReplyMessageLine;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.PhotoPickerActivity$$ExternalSyntheticLambda9;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ThemeActivity$$ExternalSyntheticLambda19;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda17;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda2;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda3;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda8;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda7;
import org.webrtc.EglRenderer$$ExternalSyntheticLambda6;
import org.webrtc.EglRenderer$$ExternalSyntheticLambda8;

public final class RichEditorListView extends UniversalRecyclerView {
    public static final ArrayList EMPTY_QUOTE_IDS = new ArrayList();
    public RichTableCell activeCellSelectionTable;
    public boolean adaptiveLinkDialogs;
    public boolean allowTapAboveContent;
    public final AnonymousClass7 audioDelegate;
    public int bottomInset;
    public final AnonymousClass5 buttonRowDelegate;
    public final AnonymousClass14 cellDelegate;
    public boolean cellSelectionDragActive;
    public TL_iv.pageTableCell cellSelectionDragAnchor;
    public TL_iv.pageTableCell cellSelectionDragEnd;
    public final RichEditorListView$$ExternalSyntheticLambda37 cellSelectionListener;
    public boolean clearDraggedMultiCellSelectionOnMenuDismiss;
    public final IdentityHashMap converters;
    public final int currentAccount;
    public final Delegate delegate;
    public final AnonymousClass13 detailsDelegate;
    public final RichEditorListView$$ExternalSyntheticLambda36 dividerDelegate;
    public final AnonymousClass8 documentDelegate;
    public int dotSelectedCol;
    public int dotSelectedRow;
    public boolean draggingOverTrash;
    public BlockRow draggingRow;
    public int emojiPadding;
    public MessageObject fileRefParentObject;
    public RichEditText focusedEditText;
    public RichEditorHistory history;
    public final PhotoViewer.AnonymousClass24 historyDelegate;
    public final RichEditor$$ExternalSyntheticLambda14 imeFocusListener;
    public int imeInset;
    public ArrayList initialSelectionRows;
    public final ArrayList itemRows;
    public int lastExternalImageId;
    public int lastListHeight;
    public long lastTapDownTime;
    public float lastTapDownX;
    public float lastTapDownY;
    public TL_iv.RichMessage loadedRichMessage;
    public boolean longPressConsumed;
    public RichEditorListView$$ExternalSyntheticLambda4 longPressRunnable;
    public final AnonymousClass9 mapDelegate;
    public final AnonymousClass10 mathDelegate;
    public final AnonymousClass6 mediaDelegate;
    public BlockRow pendingInsertRow;
    public BlockRow pendingMediaRow;
    public boolean pendingTapDismiss;
    public float pendingTapRawX;
    public float pendingTapRawY;
    public boolean pressMoved;
    public View pressTarget;
    public float pressX;
    public float pressY;
    public final AnonymousClass11 quoteAuthorDelegate;
    public final HashMap quoteAuthors;
    public ReplyMessageLine quoteLine;
    public final Theme.ResourcesProvider resourcesProvider;
    public int restoreFocusCell;
    public int restoreFocusChildPosition;
    public int restoreFocusOffset;
    public final ArrayList rows;
    public boolean suppressSpansChanged;
    public ItemOptions tableCellMenu;
    public final AnonymousClass12 tableDelegate;
    public final AnonymousClass1 textSelectionHelper;
    public final TextSelectionHelper.TextSelectionOverlay textSelectionOverlay;
    public final IdentityHashMap uploaders;

    public final class AnonymousClass10 {
        public AnonymousClass10() {
        }
    }

    public final class AnonymousClass11 implements RichQuoteAuthorCell.Delegate {
        public AnonymousClass11() {
        }
    }

    public final class AnonymousClass12 {
        public AnonymousClass12() {
        }

        public final void onTextChanged() {
            RichEditorListView richEditorListView = RichEditorListView.this;
            RichEditorHistory richEditorHistory = richEditorListView.history;
            if (richEditorHistory != null) {
                richEditorHistory.onTyping();
            }
            richEditorListView.delegate.onContentChanged();
        }
    }

    public final class AnonymousClass13 {
        public AnonymousClass13() {
        }
    }

    public final class AnonymousClass14 implements RichTextCell.Delegate {
        public AnonymousClass14() {
        }

        public final void onCommand(BlockRow blockRow, int i) {
            RichEditorListView richEditorListView = RichEditorListView.this;
            if (i == 7) {
                richEditorListView.getClass();
                richEditorListView.transformRow(blockRow, new TL_iv.pageBlockButtonRow(), 0, 0, false, false);
            }
            richEditorListView.pendingMediaRow = null;
            richEditorListView.pendingInsertRow = blockRow;
            RichEditorHistory richEditorHistory = richEditorListView.history;
            if (richEditorHistory != null) {
                AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
                richEditorHistory.commit();
            }
            if (blockRow != null) {
                TL_iv.PageBlock pageBlock = blockRow.block;
                int i2 = RichTextCell.$r8$clinit;
                TL_iv.textPlain textplain = new TL_iv.textPlain();
                textplain.text = "";
                pageBlock.text = textplain;
                View viewFindViewByItemObject = richEditorListView.findViewByItemObject(blockRow);
                if (viewFindViewByItemObject instanceof RichTextCell) {
                    ((RichTextCell) viewFindViewByItemObject).getEditText().setTextSilently("");
                }
            }
            RichEditorHistory richEditorHistory2 = richEditorListView.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
            Delegate delegate = richEditorListView.delegate;
            switch (i) {
                case 1:
                    delegate.onOpenAttachRequest(3);
                    break;
                case 2:
                    delegate.onOpenAttachRequest(6);
                    break;
                case 3:
                    ChatAttachAlertRichLayout.showEditLatexSheet(richEditorListView.getContext(), "", new VoIPFragment$$ExternalSyntheticLambda7(richEditorListView, 29), richEditorListView.resourcesProvider);
                    break;
                case 4:
                case 5:
                    delegate.onOpenAttachRequest(1);
                    break;
                case 6:
                    richEditorListView.insertDetails();
                    break;
            }
        }
    }

    public final class AnonymousClass18 {
        public final RichEditorListView this$0;
        public final MediaUploadState val$media;
        public final BlockRow val$row;

        public AnonymousClass18(BlockRow blockRow, MediaUploadState mediaUploadState, RichEditorListView richEditorListView) {
            this.this$0 = richEditorListView;
            this.val$media = mediaUploadState;
            this.val$row = blockRow;
        }
    }

    public final class AnonymousClass19 implements RichMediaUploader.Listener {
        public final RichEditorListView this$0;
        public final MediaUploadState val$media;
        public final BlockRow val$row;

        public AnonymousClass19(BlockRow blockRow, MediaUploadState mediaUploadState, RichEditorListView richEditorListView) {
            this.this$0 = richEditorListView;
            this.val$media = mediaUploadState;
            this.val$row = blockRow;
        }

        @Override
        public final void onAudioUploaded(TLRPC.Document document) {
        }

        @Override
        public final void onDocumentUploaded(TLRPC.Document document) {
        }

        @Override
        public final void onError() {
            MediaUploadState mediaUploadState = this.val$media;
            mediaUploadState.state = 3;
            RichEditorListView richEditorListView = this.this$0;
            richEditorListView.uploaders.remove(mediaUploadState);
            richEditorListView.removeMediaFromRow(this.val$row, mediaUploadState);
            richEditorListView.delegate.onContentChanged();
        }

        @Override
        public final void onPhotoUploaded(TLRPC.Photo photo) {
            int i;
            int i2;
            MediaUploadState mediaUploadState = this.val$media;
            mediaUploadState.photo = photo;
            mediaUploadState.state = 2;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
            if (closestPhotoSizeWithSize != null && (i = closestPhotoSizeWithSize.w) > 0 && (i2 = closestPhotoSizeWithSize.h) > 0) {
                mediaUploadState.width = i;
                mediaUploadState.height = i2;
            }
            BlockRow blockRow = this.val$row;
            TL_iv.PageBlock pageBlockItemBlockFor = RichEditorListView.itemBlockFor(blockRow, mediaUploadState);
            if (pageBlockItemBlockFor instanceof TL_iv.pageBlockPhoto) {
                ((TL_iv.pageBlockPhoto) pageBlockItemBlockFor).photo_id = photo.id;
            }
            RichEditorListView richEditorListView = this.this$0;
            richEditorListView.uploaders.remove(mediaUploadState);
            richEditorListView.refreshMediaCell(blockRow);
            richEditorListView.delegate.onContentChanged();
        }

        @Override
        public final void onProgress(float f) {
            this.val$media.progress = f;
            BlockRow blockRow = this.val$row;
            RichEditorListView richEditorListView = this.this$0;
            View viewFindViewByItemObject = richEditorListView.findViewByItemObject(blockRow);
            if (viewFindViewByItemObject instanceof RichMediaCell) {
                viewFindViewByItemObject.requestLayout();
                viewFindViewByItemObject.invalidate();
            }
            richEditorListView.delegate.onContentChanged();
        }

        @Override
        public final void onVideoUploaded(TLRPC.Document document) {
            MediaUploadState mediaUploadState = this.val$media;
            mediaUploadState.document = document;
            mediaUploadState.state = 2;
            BlockRow blockRow = this.val$row;
            TL_iv.PageBlock pageBlockItemBlockFor = RichEditorListView.itemBlockFor(blockRow, mediaUploadState);
            if (pageBlockItemBlockFor instanceof TL_iv.pageBlockVideo) {
                ((TL_iv.pageBlockVideo) pageBlockItemBlockFor).video_id = document.id;
            }
            RichEditorListView richEditorListView = this.this$0;
            richEditorListView.uploaders.remove(mediaUploadState);
            richEditorListView.refreshMediaCell(blockRow);
            richEditorListView.delegate.onContentChanged();
        }

        @Override
        public final void onWidthHeightResolved(int i, int i2) {
            if (i > 0 && i2 > 0) {
                MediaUploadState mediaUploadState = this.val$media;
                mediaUploadState.width = i;
                mediaUploadState.height = i2;
            }
            View viewFindViewByItemObject = this.this$0.findViewByItemObject(this.val$row);
            if (viewFindViewByItemObject instanceof RichMediaCell) {
                viewFindViewByItemObject.requestLayout();
                viewFindViewByItemObject.invalidate();
            }
        }
    }

    public final class AnonymousClass2 extends TextSelectionHelper.Callback {
        public final Delegate val$delegate;

        public AnonymousClass2(Delegate delegate) {
            this.val$delegate = delegate;
        }

        @Override
        public final void onStateChanged(boolean z) {
            this.val$delegate.onSelectionChanged();
            RichEditorListView richEditorListView = RichEditorListView.this;
            if (z) {
                AnonymousClass1 anonymousClass1 = richEditorListView.textSelectionHelper;
                richEditorListView.restoreFocusCell = anonymousClass1.anchorViewPosition;
                richEditorListView.restoreFocusOffset = anonymousClass1.anchorOffset;
                richEditorListView.restoreFocusChildPosition = anonymousClass1.anchorChildPosition;
                richEditorListView.setEditTextsLocked(true);
                richEditorListView.hideEditTextActionModes();
                richEditorListView.finishEditTextActionModes();
                return;
            }
            final int i = richEditorListView.restoreFocusCell;
            final int i2 = richEditorListView.restoreFocusOffset;
            final int i3 = richEditorListView.restoreFocusChildPosition;
            richEditorListView.restoreFocusCell = -1;
            richEditorListView.restoreFocusOffset = -1;
            richEditorListView.restoreFocusChildPosition = 0;
            boolean z2 = richEditorListView.pendingTapDismiss;
            final float f = richEditorListView.pendingTapRawX;
            final float f2 = richEditorListView.pendingTapRawY;
            richEditorListView.pendingTapDismiss = false;
            richEditorListView.setEditTextsLocked(false);
            richEditorListView.finishEditTextActionModes();
            if (z2) {
                richEditorListView.post(new Runnable() {
                    @Override
                    public final void run() {
                        int i4 = 0;
                        while (true) {
                            RichEditorListView richEditorListView2 = RichEditorListView.this;
                            if (i4 >= richEditorListView2.getChildCount()) {
                                int i5 = i;
                                if (i5 >= 0) {
                                    RichEditorListView.access$1400(richEditorListView2, i5, i3, i2);
                                    return;
                                }
                                return;
                            }
                            KeyEvent.Callback childAt = richEditorListView2.getChildAt(i4);
                            boolean z3 = childAt instanceof RichTextCell;
                            float f3 = f;
                            float f4 = f2;
                            if (z3) {
                                RichTextCell richTextCell = (RichTextCell) childAt;
                                if (RichEditorListView.placeCaretAtScreenPoint(richTextCell.getEditText(), f3, f4)) {
                                    return;
                                }
                                if (richTextCell.isAuthorVisible() && RichEditorListView.placeCaretAtScreenPoint(richTextCell.getAuthorEditText(), f3, f4)) {
                                    return;
                                }
                            } else if (childAt instanceof RichCaptionHost) {
                                if (RichEditorListView.placeCaretAtScreenPoint(((RichCaptionHost) childAt).getCaptionEditText(), f3, f4)) {
                                    return;
                                }
                            } else if ((childAt instanceof RichDetailsCell) && RichEditorListView.placeCaretAtScreenPoint(((RichDetailsCell) childAt).getEditText(), f3, f4)) {
                                return;
                            }
                            i4++;
                        }
                    }
                });
                return;
            }
            if (i >= 0) {
                richEditorListView.post(new RichEditorListView$$ExternalSyntheticLambda53(this, i, i3, i2, 3));
                return;
            }
            View viewFindFocus = richEditorListView.findFocus();
            if (viewFindFocus instanceof RichEditText) {
                RichEditText richEditText = (RichEditText) viewFindFocus;
                Objects.requireNonNull(richEditText);
                richEditorListView.post(new RichEditText$$ExternalSyntheticLambda2(richEditText, 2));
            }
        }
    }

    public final class AnonymousClass4 {
        public final int val$eOff;
        public final int val$endRowIdx;
        public final int val$sOff;
        public final int val$startRowIdx;

        public AnonymousClass4(int i, int i2, int i3, int i4) {
            this.val$startRowIdx = i;
            this.val$endRowIdx = i2;
            this.val$sOff = i3;
            this.val$eOff = i4;
        }

        public final TL_iv.RichMessage extractRichMessage() {
            RichEditorListView richEditorListView = RichEditorListView.this;
            ArrayList arrayList = richEditorListView.rows;
            int i = this.val$startRowIdx;
            BlockRow blockRow = (BlockRow) arrayList.get(i);
            ArrayList arrayList2 = richEditorListView.rows;
            int i2 = this.val$endRowIdx;
            BlockRow blockRow2 = (BlockRow) arrayList2.get(i2);
            TL_iv.PageBlock pageBlock = blockRow.block;
            TL_iv.PageBlock pageBlock2 = blockRow2.block;
            int i3 = this.val$eOff;
            TL_iv.PageBlock pageBlockAccess$2300 = RichEditorListView.access$2300(richEditorListView, blockRow, this.val$sOff, i == i2 ? i3 : -1);
            TL_iv.PageBlock pageBlockAccess$2301 = i == i2 ? null : RichEditorListView.access$2300(richEditorListView, blockRow2, 0, i3);
            if (pageBlockAccess$2300 != null) {
                blockRow.block = pageBlockAccess$2300;
            }
            if (pageBlockAccess$2301 != null) {
                blockRow2.block = pageBlockAccess$2301;
            }
            try {
                ArrayList<TL_iv.PageBlock> arrayListFlattenRange = richEditorListView.flattenRange(i, i2 + 1, 0, false);
                ArrayList<TLRPC.Photo> arrayListCollectMediaPhotos = richEditorListView.collectMediaPhotos(i, i2);
                ArrayList<TLRPC.Document> arrayListCollectMediaDocuments = richEditorListView.collectMediaDocuments(i, i2);
                blockRow.block = pageBlock;
                blockRow2.block = pageBlock2;
                TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                richMessage.blocks = arrayListFlattenRange;
                richMessage.photos = arrayListCollectMediaPhotos;
                richMessage.documents = arrayListCollectMediaDocuments;
                return richMessage;
            } catch (Throwable th) {
                blockRow.block = pageBlock;
                blockRow2.block = pageBlock2;
                throw th;
            }
        }
    }

    public final class AnonymousClass5 implements RichButtonRowCell.Delegate {
        public AnonymousClass5() {
        }
    }

    public final class AnonymousClass6 {
        public AnonymousClass6() {
        }
    }

    public final class AnonymousClass7 {
        public AnonymousClass7() {
        }
    }

    public final class AnonymousClass8 {
        public AnonymousClass8() {
        }
    }

    public final class AnonymousClass9 implements RichMapCell.Delegate {
        public AnonymousClass9() {
        }
    }

    public final class BlockButtonEdit {
        public final int index;
        public final BlockRow row;

        public BlockButtonEdit(BlockRow blockRow, int i) {
            this.row = blockRow;
            this.index = i;
        }

        public final void apply(String str, TL_keyboard.InlineButtonType inlineButtonType) {
            TL_iv.pageBlockButtonRow pageblockbuttonrow;
            if (TextUtils.isEmpty(str) || !RichInlineButtonSpan.isSupported(inlineButtonType)) {
                return;
            }
            BlockRow blockRow = this.row;
            if (blockRow != null) {
                TL_iv.PageBlock pageBlock = blockRow.block;
                if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                    pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                } else {
                    pageblockbuttonrow = null;
                }
            } else {
                pageblockbuttonrow = null;
            }
            if (pageblockbuttonrow == null) {
                return;
            }
            int i = this.index;
            boolean z = i >= 0 && i < pageblockbuttonrow.buttons.size();
            if (z || pageblockbuttonrow.buttons.size() < 8) {
                RichEditorListView richEditorListView = RichEditorListView.this;
                RichEditorHistory richEditorHistory = richEditorListView.history;
                if (richEditorHistory != null) {
                    AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
                    richEditorHistory.commit();
                }
                TL_keyboard.PageButton pageButton = z ? pageblockbuttonrow.buttons.get(i) : new TL_keyboard.PageButton();
                pageButton.text = RichTextStyle.fromSpannable(str);
                pageButton.type = inlineButtonType;
                if (pageButton.style == null) {
                    pageButton.style = new TL_keyboard.RichButtonStyle();
                }
                if (!z) {
                    pageblockbuttonrow.buttons.add(pageButton);
                }
                richEditorListView.adapter.update(false);
                RichEditorHistory richEditorHistory2 = richEditorListView.history;
                if (richEditorHistory2 != null) {
                    richEditorHistory2.record();
                }
                richEditorListView.delegate.onContentChanged();
            }
        }

        public final void delete() {
            TL_iv.pageBlockButtonRow pageblockbuttonrow;
            int i;
            BlockRow blockRow = this.row;
            if (blockRow != null) {
                TL_iv.PageBlock pageBlock = blockRow.block;
                if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                    pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                } else {
                    pageblockbuttonrow = null;
                }
            } else {
                pageblockbuttonrow = null;
            }
            if (pageblockbuttonrow == null || (i = this.index) < 0 || i >= pageblockbuttonrow.buttons.size()) {
                return;
            }
            RichEditorListView richEditorListView = RichEditorListView.this;
            RichEditorHistory richEditorHistory = richEditorListView.history;
            if (richEditorHistory != null) {
                AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
                richEditorHistory.commit();
            }
            pageblockbuttonrow.buttons.remove(i);
            richEditorListView.adapter.update(false);
            RichEditorHistory richEditorHistory2 = richEditorListView.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
            richEditorListView.delegate.onContentChanged();
        }

        public final boolean exists() {
            TL_iv.pageBlockButtonRow pageblockbuttonrow;
            int i;
            BlockRow blockRow = this.row;
            if (blockRow != null) {
                TL_iv.PageBlock pageBlock = blockRow.block;
                if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                    pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                } else {
                    pageblockbuttonrow = null;
                }
            } else {
                pageblockbuttonrow = null;
            }
            return pageblockbuttonrow != null && (i = this.index) >= 0 && i < pageblockbuttonrow.buttons.size();
        }
    }

    public interface Delegate {
        void makeEditTextFocusable(RichEditText richEditText);

        ItemOptions makeMenu(View view);

        void onBlockButtonEditRequested(BlockButtonEdit blockButtonEdit, View view);

        void onContentChanged();

        void onHistoryChanged();

        void onInlineButtonEditRequested(InlineButtonEdit inlineButtonEdit, View view);

        void onListLayoutUpdated();

        void onListScrolled(int i);

        void onOpenAttachRequest(int i);

        void onOpenLocationRequest(BlockRow blockRow);

        void onReorderEnd();

        boolean onReorderMove(float f);

        void onReorderStart();

        void onSelectionChanged();

        void onSlashSuggest(RichTextCell richTextCell, String str);
    }

    public final class InlineButtonEdit {
        public final RichEditText editText;
        public final RichInlineButtonSpan existingSpan;
        public final int from;
        public final TL_iv.RichText label;
        public final int to;

        public InlineButtonEdit(RichEditText richEditText, int i, int i2, RichInlineButtonSpan richInlineButtonSpan) {
            TL_iv.textButton textbutton;
            this.editText = richEditText;
            this.from = i;
            this.to = i2;
            this.existingSpan = richInlineButtonSpan;
            if (richInlineButtonSpan == null || (textbutton = richInlineButtonSpan.button) == null) {
                this.label = RichTextStyle.fromSpannable(new SpannableStringBuilder(richEditText.getText().subSequence(i, i2)));
            } else {
                this.label = textbutton.text;
            }
        }

        public final void apply(TL_keyboard.InlineButtonType inlineButtonType) {
            RichEditText richEditText;
            Editable text;
            int i;
            TL_iv.textButton textbutton;
            RichEditText richEditText2;
            if (RichInlineButtonSpan.isSupported(inlineButtonType) && (text = (richEditText = this.editText).getText()) != null && (i = this.from) >= 0) {
                int length = text.length();
                int i2 = this.to;
                if (i2 > length || i >= i2) {
                    return;
                }
                RichEditorListView richEditorListView = RichEditorListView.this;
                RichEditorHistory richEditorHistory = richEditorListView.history;
                if (richEditorHistory != null) {
                    AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
                    richEditorHistory.commit();
                }
                AnonymousClass1 anonymousClass1 = richEditorListView.textSelectionHelper;
                if (anonymousClass1 != null) {
                    anonymousClass1.clear(false);
                }
                richEditText.setLocked(false);
                for (RichInlineButtonSpan richInlineButtonSpan : (RichInlineButtonSpan[]) text.getSpans(i, i2, RichInlineButtonSpan.class)) {
                    text.removeSpan(richInlineButtonSpan);
                }
                RichTextStyle.removeLink(text, i, i2);
                RichTextStyle.removeDate(text, i, i2);
                RichInlineButtonSpan richInlineButtonSpan2 = this.existingSpan;
                if (richInlineButtonSpan2 == null || (textbutton = richInlineButtonSpan2.button) == null) {
                    textbutton = new TL_iv.textButton();
                }
                textbutton.text = this.label;
                textbutton.type = inlineButtonType;
                if (textbutton.style == null) {
                    textbutton.style = new TL_keyboard.RichButtonStyle();
                }
                RichInlineButtonSpan richInlineButtonSpan3 = new RichInlineButtonSpan(textbutton);
                RichMessageLayout.RichButtonSpan richButtonSpan = richInlineButtonSpan3.renderedSpan;
                if (richButtonSpan != null && (richEditText2 = richInlineButtonSpan3.attachedView) != null) {
                    richButtonSpan.detach(richEditText2);
                }
                richInlineButtonSpan3.attachedView = richEditText;
                richInlineButtonSpan3.currentAccount = richEditorListView.currentAccount;
                richInlineButtonSpan3.resourcesProvider = richEditorListView.resourcesProvider;
                richInlineButtonSpan3.renderedSpan = null;
                richInlineButtonSpan3.ensureRenderer();
                text.setSpan(richInlineButtonSpan3, i, i2, 33);
                richInlineButtonSpan3.removeNestedReplacementSpans(text);
                richEditText.setSelection(Math.min(i2, richEditText.length()));
                richEditorListView.suppressSpansChanged = true;
                try {
                    richEditText.notifyInlineContentChanged();
                    richEditorListView.suppressSpansChanged = false;
                    RichEditorHistory richEditorHistory2 = richEditorListView.history;
                    if (richEditorHistory2 != null) {
                        richEditorHistory2.record();
                    }
                    richEditorListView.delegate.onContentChanged();
                } catch (Throwable th) {
                    richEditorListView.suppressSpansChanged = false;
                    throw th;
                }
            }
        }
    }

    public RichEditorListView(Context context, int i, Theme.ResourcesProvider resourcesProvider, final Delegate delegate, RichEditorListView[] richEditorListViewArr) {
        super(context, i, 0, false, new TodoItemMenu$$ExternalSyntheticLambda17(richEditorListViewArr, 20), new TodoItemMenu$$ExternalSyntheticLambda3(richEditorListViewArr, 12), null, resourcesProvider, -1, 1);
        this.adaptiveLinkDialogs = true;
        this.rows = new ArrayList();
        this.quoteAuthors = new HashMap();
        this.restoreFocusCell = -1;
        this.restoreFocusOffset = -1;
        this.restoreFocusChildPosition = 0;
        this.imeFocusListener = new RichEditor$$ExternalSyntheticLambda14(this, 3);
        this.allowTapAboveContent = true;
        this.buttonRowDelegate = new AnonymousClass5();
        this.dividerDelegate = new RichEditorListView$$ExternalSyntheticLambda36(this);
        this.mediaDelegate = new AnonymousClass6();
        this.audioDelegate = new AnonymousClass7();
        this.documentDelegate = new AnonymousClass8();
        this.uploaders = new IdentityHashMap();
        this.converters = new IdentityHashMap();
        this.mapDelegate = new AnonymousClass9();
        this.mathDelegate = new AnonymousClass10();
        this.quoteAuthorDelegate = new AnonymousClass11();
        this.tableDelegate = new AnonymousClass12();
        this.detailsDelegate = new AnonymousClass13();
        this.dotSelectedRow = -1;
        this.dotSelectedCol = -1;
        this.cellSelectionListener = new RichEditorListView$$ExternalSyntheticLambda37(this);
        this.cellDelegate = new AnonymousClass14();
        PhotoViewer.AnonymousClass24 anonymousClass24 = new PhotoViewer.AnonymousClass24(this, 11);
        this.historyDelegate = anonymousClass24;
        this.itemRows = new ArrayList();
        this.lastExternalImageId = -1;
        richEditorListViewArr[0] = this;
        this.currentAccount = i;
        this.resourcesProvider = resourcesProvider;
        this.delegate = delegate;
        this.adapter.applyBackground = false;
        setClipToPadding(false);
        setClipChildren(false);
        listenReorder(new TodoItemMenu$$ExternalSyntheticLambda17(this, 21), false);
        setReorderLongPressEnabled(false);
        allowReorder(true);
        ?? r15 = new TextSelectionHelper.ArticleTextSelectionHelper() {
            @Override
            public final boolean forceShowSelectAll() {
                RichEditorListView richEditorListView = RichEditorListView.this;
                boolean z = false;
                if (!richEditorListView.rows.isEmpty()) {
                    AnonymousClass1 anonymousClass1 = richEditorListView.textSelectionHelper;
                    if (anonymousClass1.isInSelectionMode() && anonymousClass1.startViewPosition == 0 && anonymousClass1.startViewChildPosition == 0 && anonymousClass1.startViewOffset <= 0) {
                        ArrayList arrayList = richEditorListView.rows;
                        int size = arrayList.size() - 1;
                        if (anonymousClass1.endViewPosition == size) {
                            BlockRow blockRow = (BlockRow) arrayList.get(size);
                            String strPlainOf = RichTextCell.isQuoteBlock(blockRow.block) ? RichTextStyle.plainOf(RichTextCell.extractCaption(blockRow.block)) : "";
                            boolean z2 = !strPlainOf.isEmpty();
                            if (anonymousClass1.endViewChildPosition == z2) {
                                if (anonymousClass1.endViewOffset >= (z2 ? strPlainOf.length() : RichTextCell.readPlainText(blockRow.block).length())) {
                                    z = true;
                                }
                            }
                        }
                    }
                }
                return !z;
            }

            @Override
            public final int getParentBottomPadding() {
                return RichEditorListView.this.getPaddingBottom();
            }

            @Override
            public final int getParentTopPadding() {
                return RichEditorListView.this.getPaddingTop();
            }

            @Override
            public final boolean onCopyOverride() {
                RichEditorListView richEditorListView = RichEditorListView.this;
                CharSequence selectedText = richEditorListView.textSelectionHelper.getSelectedText();
                if (selectedText == null || selectedText.length() == 0) {
                    return true;
                }
                richEditorListView.writeSelectionToClipboard(selectedText);
                return true;
            }

            @Override
            public final void onCutAction() {
                RichEditorListView richEditorListView = RichEditorListView.this;
                CharSequence selectedText = richEditorListView.textSelectionHelper.getSelectedText();
                if (selectedText != null && selectedText.length() > 0) {
                    richEditorListView.writeSelectionToClipboard(selectedText);
                }
                AnonymousClass1 anonymousClass1 = richEditorListView.textSelectionHelper;
                int i2 = anonymousClass1.startViewPosition;
                int i3 = anonymousClass1.startViewOffset;
                int i4 = anonymousClass1.endViewPosition;
                if (richEditorListView.applyEditRange(i2, i3, i4, anonymousClass1.endViewOffset, new String[]{""})) {
                    return;
                }
                richEditorListView.removeSelectedBlocks(i2, i4);
            }

            @Override
            public final void onOffsetChanged() {
                super.onOffsetChanged();
                delegate.onSelectionChanged();
            }

            @Override
            public final void onPasteAction() {
                RichEditorListView.this.pasteAtHelperSelection();
            }

            @Override
            public final boolean onSelectAllOverride() {
                if (expandSelectionToWholeCurrentBlock()) {
                    return true;
                }
                return RichEditorListView.this.tryEscalateSelectAll();
            }

            @Override
            public final void onTapToDismiss(float f, float f2) {
                RichEditorListView richEditorListView = RichEditorListView.this;
                richEditorListView.pendingTapDismiss = true;
                richEditorListView.pendingTapRawX = f;
                richEditorListView.pendingTapRawY = f2;
            }
        };
        this.textSelectionHelper = r15;
        r15.setParentView(this);
        r15.layoutManager = this.layoutManager;
        TextSelectionHelper.TextSelectionOverlay overlayView = r15.getOverlayView(context);
        this.textSelectionOverlay = overlayView;
        AndroidUtilities.removeFromParent(overlayView);
        r15.callback = new AnonymousClass2(delegate);
        addOnScrollListener(new ChatActivity.AnonymousClass35(9, this, delegate));
        this.history = new RichEditorHistory(anonymousClass24);
    }

    public static void access$1400(RichEditorListView richEditorListView, int i, int i2, int i3) {
        if (i < 0) {
            richEditorListView.getClass();
            return;
        }
        KeyEvent.Callback callbackFindViewByPosition = richEditorListView.layoutManager.findViewByPosition(i);
        if (callbackFindViewByPosition instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) callbackFindViewByPosition;
            RichEditText authorEditText = (i2 == 1 && richTextCell.isAuthorVisible()) ? richTextCell.getAuthorEditText() : richTextCell.getEditText();
            authorEditText.requestEditFocusRebuild();
            authorEditText.setSelection(Math.max(0, Math.min(i3, authorEditText.length())));
            return;
        }
        if (!(callbackFindViewByPosition instanceof RichTableCell)) {
            if (callbackFindViewByPosition instanceof RichCaptionHost) {
                RichEditText captionEditText = ((RichCaptionHost) callbackFindViewByPosition).getCaptionEditText();
                captionEditText.requestEditFocusRebuild();
                captionEditText.setSelection(Math.max(0, Math.min(i3, captionEditText.length())));
                return;
            }
            return;
        }
        RichTableCell richTableCell = (RichTableCell) callbackFindViewByPosition;
        RichEditText richEditTextEditTextForChildPos = richTableCell.editTextForChildPos(i2);
        if (richEditTextEditTextForChildPos == null) {
            richEditTextEditTextForChildPos = richTableCell.editTextForChildPos(0);
        }
        if (richEditTextEditTextForChildPos == null) {
            return;
        }
        richEditTextEditTextForChildPos.requestEditFocusRebuild();
        richEditTextEditTextForChildPos.setSelection(Math.max(0, Math.min(i3, richEditTextEditTextForChildPos.length())));
    }

    public static TL_iv.PageBlock access$2300(RichEditorListView richEditorListView, BlockRow blockRow, int i, int i2) {
        TL_iv.PageBlock pageBlockTLdeserialize;
        richEditorListView.getClass();
        if (!isFormattable(blockRow.block)) {
            return null;
        }
        View viewFindViewByItemObject = richEditorListView.findViewByItemObject(blockRow);
        Editable text = viewFindViewByItemObject instanceof RichTextCell ? ((RichTextCell) viewFindViewByItemObject).getEditText().getText() : RichTextCell.readStyledText(blockRow.block);
        int length = text.length();
        int iMax = Math.max(0, Math.min(i, length));
        if (i2 >= 0) {
            length = Math.max(0, Math.min(i2, length));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text.subSequence(Math.min(iMax, length), Math.max(iMax, length)));
        TL_iv.PageBlock pageBlock = blockRow.block;
        if (pageBlock != null) {
            try {
                ensureSerializable(pageBlock);
                SerializedData serializedData = new SerializedData(pageBlock.getObjectSize());
                pageBlock.serializeToStream(serializedData);
                SerializedData serializedData2 = new SerializedData(serializedData.toByteArray());
                pageBlockTLdeserialize = TL_iv.PageBlock.TLdeserialize(serializedData2, serializedData2.readInt32(true), true);
                serializedData.cleanup();
                serializedData2.cleanup();
                if (pageBlockTLdeserialize == null) {
                    pageBlockTLdeserialize = new TL_iv.pageBlockParagraph();
                    pageBlockTLdeserialize.text = new TL_iv.textEmpty();
                }
            } catch (Throwable th) {
                FileLog.e(th);
            }
        } else {
            pageBlockTLdeserialize = new TL_iv.pageBlockParagraph();
            pageBlockTLdeserialize.text = new TL_iv.textEmpty();
        }
        int i3 = RichTextCell.$r8$clinit;
        pageBlockTLdeserialize.text = RichTextStyle.fromSpannable(spannableStringBuilder);
        return pageBlockTLdeserialize;
    }

    public static void access$3500(BlockRow blockRow, MediaUploadState mediaUploadState, RichEditorListView richEditorListView) {
        if (mediaUploadState != null) {
            RichMediaUploader richMediaUploader = (RichMediaUploader) richEditorListView.uploaders.remove(mediaUploadState);
            if (richMediaUploader != null) {
                richMediaUploader.cancel();
            }
            RichMediaConverter richMediaConverter = (RichMediaConverter) richEditorListView.converters.remove(mediaUploadState);
            if (richMediaConverter != null) {
                richMediaConverter.cancel();
            }
            RichEditorHistory richEditorHistory = richEditorListView.history;
            if (richEditorHistory != null) {
                AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
                richEditorHistory.commit();
            }
            richEditorListView.removeMediaFromRow(blockRow, mediaUploadState);
            RichEditorHistory richEditorHistory2 = richEditorListView.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
            richEditorListView.delegate.onContentChanged();
            return;
        }
        richEditorListView.getClass();
        for (MediaUploadState mediaUploadState2 : mediasOf(blockRow)) {
            RichMediaUploader richMediaUploader2 = (RichMediaUploader) richEditorListView.uploaders.remove(mediaUploadState2);
            if (richMediaUploader2 != null) {
                richMediaUploader2.cancel();
            }
            RichMediaConverter richMediaConverter2 = (RichMediaConverter) richEditorListView.converters.remove(mediaUploadState2);
            if (richMediaConverter2 != null) {
                richMediaConverter2.cancel();
            }
        }
        ArrayList arrayList = richEditorListView.rows;
        int iIndexOf = arrayList.indexOf(blockRow);
        if (iIndexOf >= 0) {
            RichEditorHistory richEditorHistory3 = richEditorListView.history;
            if (richEditorHistory3 != null) {
                AndroidUtilities.cancelRunOnUIThread(richEditorHistory3.commitRunnable);
                richEditorHistory3.commit();
            }
            arrayList.remove(iIndexOf);
            richEditorListView.adapter.update(true);
            RichEditorHistory richEditorHistory4 = richEditorListView.history;
            if (richEditorHistory4 != null) {
                richEditorHistory4.record();
            }
        }
        richEditorListView.delegate.onContentChanged();
    }

    public static void access$3700(RichEditorListView richEditorListView) {
        if (richEditorListView.suppressSpansChanged) {
            return;
        }
        RichEditorHistory richEditorHistory = richEditorListView.history;
        if (richEditorHistory != null) {
            richEditorHistory.record();
        }
        richEditorListView.delegate.onSelectionChanged();
        richEditorListView.refreshSelectionHighlight();
    }

    public static void addListItemRow(ArrayList arrayList, TL_iv.RichText richText, int i, int i2, boolean z, boolean z2) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        if (richText == null) {
            richText = new TL_iv.textEmpty();
        }
        pageblockparagraph.text = richText;
        BlockRow blockRow = new BlockRow(pageblockparagraph, i, i2);
        blockRow.checkbox = z;
        blockRow.checked = z2;
        arrayList.add(blockRow);
    }

    public static int clearMaskFor(int i) {
        if (i == 4) {
            return 114971;
        }
        if (i == 16384) {
            return 32772;
        }
        return i == 32768 ? 16388 : 4;
    }

    public static void emitLeafBlock(BlockRow blockRow, ArrayList arrayList) {
        TLRPC.Document document;
        TL_iv.PageBlock pageBlock;
        TL_iv.PageBlock pageBlock2 = blockRow.block;
        if (pageBlock2 instanceof TL_iv.pageBlockDivider) {
            arrayList.add(pageBlock2);
            return;
        }
        if (pageBlock2 instanceof TL_iv.pageBlockPhoto) {
            MediaUploadState mediaUploadState = blockRow.media;
            if (mediaUploadState == null || !mediaUploadState.isReady()) {
                return;
            }
            TL_iv.PageBlock pageBlock3 = blockRow.block;
            if (((TL_iv.pageBlockPhoto) pageBlock3).photo_id != 0) {
                if (pageBlock3.caption == null) {
                    pageBlock3.caption = new TL_iv.PageCaption();
                    blockRow.block.caption.text = new TL_iv.textEmpty();
                    blockRow.block.caption.credit = new TL_iv.textEmpty();
                }
                arrayList.add(blockRow.block);
                return;
            }
            return;
        }
        if (pageBlock2 instanceof TL_iv.pageBlockVideo) {
            MediaUploadState mediaUploadState2 = blockRow.media;
            if (mediaUploadState2 == null || !mediaUploadState2.isReady()) {
                return;
            }
            TL_iv.PageBlock pageBlock4 = blockRow.block;
            if (((TL_iv.pageBlockVideo) pageBlock4).video_id != 0) {
                if (pageBlock4.caption == null) {
                    pageBlock4.caption = new TL_iv.PageCaption();
                    blockRow.block.caption.text = new TL_iv.textEmpty();
                    blockRow.block.caption.credit = new TL_iv.textEmpty();
                }
                arrayList.add(blockRow.block);
                return;
            }
            return;
        }
        if (isGallery(pageBlock2)) {
            ArrayList arrayListGalleryItems = galleryItems(blockRow.block);
            List listMediasOf = mediasOf(blockRow);
            ArrayList<TL_iv.PageBlock> arrayList2 = new ArrayList<>();
            for (int i = 0; arrayListGalleryItems != null && i < arrayListGalleryItems.size() && i < listMediasOf.size(); i++) {
                TL_iv.PageBlock pageBlock5 = (TL_iv.PageBlock) arrayListGalleryItems.get(i);
                if (((MediaUploadState) listMediasOf.get(i)).isReady()) {
                    if ((pageBlock5 instanceof TL_iv.pageBlockPhoto ? ((TL_iv.pageBlockPhoto) pageBlock5).photo_id : pageBlock5 instanceof TL_iv.pageBlockVideo ? ((TL_iv.pageBlockVideo) pageBlock5).video_id : 0L) != 0) {
                        RichCaptionController.ensureCaption(pageBlock5);
                        arrayList2.add(pageBlock5);
                    }
                }
            }
            if (arrayList2.size() < 2) {
                if (arrayList2.size() == 1) {
                    arrayList.add(arrayList2.get(0));
                    return;
                }
                return;
            }
            if (blockRow.block instanceof TL_iv.pageBlockSlideshow) {
                TL_iv.pageBlockSlideshow pageblockslideshow = new TL_iv.pageBlockSlideshow();
                pageblockslideshow.items = arrayList2;
                pageblockslideshow.caption = blockRow.block.caption;
                pageBlock = pageblockslideshow;
            } else {
                TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                pageblockcollage.items = arrayList2;
                pageblockcollage.caption = blockRow.block.caption;
                pageBlock = pageblockcollage;
            }
            RichCaptionController.ensureCaption(pageBlock);
            arrayList.add(pageBlock);
            return;
        }
        TL_iv.PageBlock pageBlock6 = blockRow.block;
        if (pageBlock6 instanceof TL_iv.pageBlockAudio) {
            MediaUploadState mediaUploadState3 = blockRow.media;
            if (mediaUploadState3 == null || !mediaUploadState3.isReady()) {
                return;
            }
            TL_iv.PageBlock pageBlock7 = blockRow.block;
            if (((TL_iv.pageBlockAudio) pageBlock7).audio_id != 0) {
                if (pageBlock7.caption == null) {
                    pageBlock7.caption = new TL_iv.PageCaption();
                    blockRow.block.caption.text = new TL_iv.textEmpty();
                    blockRow.block.caption.credit = new TL_iv.textEmpty();
                }
                arrayList.add(blockRow.block);
                return;
            }
            return;
        }
        if (pageBlock6 instanceof TL_iv.pageBlockDocument) {
            MediaUploadState mediaUploadState4 = blockRow.media;
            if (mediaUploadState4 != null && (document = mediaUploadState4.document) != null) {
                ((TL_iv.pageBlockDocument) pageBlock6).document_id = document.id;
            }
            if (mediaUploadState4 == null || !mediaUploadState4.isReady()) {
                return;
            }
            TL_iv.PageBlock pageBlock8 = blockRow.block;
            if (((TL_iv.pageBlockDocument) pageBlock8).document_id != 0) {
                RichCaptionController.ensureCaption(pageBlock8);
                arrayList.add(blockRow.block);
                return;
            }
            return;
        }
        if (pageBlock6 instanceof TL_iv.pageBlockMap) {
            TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock6;
            int i2 = RichMapCell.$r8$clinit;
            if (pageblockmap == null || !(pageblockmap.geo instanceof TLRPC.TL_geoPoint)) {
                return;
            }
            if (pageblockmap.caption == null) {
                TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
                pageblockmap.caption = pageCaption;
                pageCaption.text = new TL_iv.textEmpty();
                pageblockmap.caption.credit = new TL_iv.textEmpty();
            }
            arrayList.add(pageblockmap);
            return;
        }
        if (pageBlock6 instanceof TL_iv.pageBlockMath) {
            if (TextUtils.isEmpty(((TL_iv.pageBlockMath) pageBlock6).source)) {
                return;
            }
            arrayList.add(blockRow.block);
            return;
        }
        if (!(pageBlock6 instanceof TL_iv.pageBlockTable)) {
            if (!(pageBlock6 instanceof TL_iv.pageBlockButtonRow)) {
                arrayList.add(pageBlock6);
                return;
            }
            TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock6;
            ArrayList<TL_keyboard.PageButton> arrayList3 = pageblockbuttonrow.buttons;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                return;
            }
            arrayList.add(pageblockbuttonrow);
            return;
        }
        TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock6;
        if (pageblocktable != null) {
            if (pageblocktable.title == null) {
                pageblocktable.title = new TL_iv.textEmpty();
            }
            if (pageblocktable.rows != null) {
                for (int i3 = 0; i3 < pageblocktable.rows.size(); i3++) {
                    TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i3);
                    if (pagetablerow.cells != null) {
                        for (int i4 = 0; i4 < pagetablerow.cells.size(); i4++) {
                            TL_iv.pageTableCell pagetablecell = pagetablerow.cells.get(i4);
                            if (pagetablecell.text == null) {
                                TableModel.applyPlainText(pagetablecell, "");
                            } else {
                                pagetablecell.flags |= 128;
                            }
                            pagetablecell.flags = pagetablecell.colspan > 1 ? pagetablecell.flags | 2 : pagetablecell.flags & (-3);
                            pagetablecell.flags = pagetablecell.rowspan > 1 ? pagetablecell.flags | 4 : pagetablecell.flags & (-5);
                        }
                    }
                }
            }
        }
        if (tableHasText(pageblocktable)) {
            arrayList.add(pageblocktable);
        }
    }

    public static void ensureSerializable(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return;
        }
        if (pageBlock.text == null) {
            pageBlock.text = new TL_iv.textEmpty();
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
            if (pageblockpreformatted.language == null) {
                pageblockpreformatted.language = "";
                return;
            }
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
            if (pageblockblockquote.caption == null) {
                pageblockblockquote.caption = new TL_iv.textEmpty();
                return;
            }
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
            if (pageblockpullquote.caption == null) {
                pageblockpullquote.caption = new TL_iv.textEmpty();
            }
        }
    }

    public static void expandItemBlocks(ArrayList arrayList, ArrayList arrayList2, int i, boolean z, int i2, boolean z2, boolean z3) {
        boolean z4 = false;
        if (arrayList2 != null) {
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList2.get(i3);
                if ((pageBlock instanceof TL_iv.pageBlockList) || (pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                    if (!z4) {
                        addListItemRow(arrayList, null, i, i2, z2, z3);
                        z4 = true;
                    }
                    expandListBlock(arrayList, pageBlock, i + 1);
                } else if (z4) {
                    arrayList.add(new BlockRow(pageBlock, i, z ? 1 : 0));
                } else {
                    if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                        addListItemRow(arrayList, ((TL_iv.pageBlockParagraph) pageBlock).text, i, i2, z2, z3);
                    } else {
                        BlockRow blockRow = new BlockRow(pageBlock, i, i2);
                        blockRow.checkbox = z2;
                        blockRow.checked = z3;
                        arrayList.add(blockRow);
                    }
                    z4 = true;
                }
            }
        }
        if (z4) {
            return;
        }
        addListItemRow(arrayList, null, i, i2, z2, z3);
    }

    public static void expandListBlock(ArrayList arrayList, TL_iv.PageBlock pageBlock, int i) {
        int i2 = 0;
        if (!(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
            ArrayList<TL_iv.PageListItem> arrayList2 = ((TL_iv.pageBlockList) pageBlock).items;
            int size = arrayList2.size();
            while (i2 < size) {
                TL_iv.PageListItem pageListItem = arrayList2.get(i2);
                i2++;
                TL_iv.PageListItem pageListItem2 = pageListItem;
                if (pageListItem2 instanceof TL_iv.TL_pageListItemText) {
                    addListItemRow(arrayList, ((TL_iv.TL_pageListItemText) pageListItem2).text, i, 0, pageListItem2.checkbox, pageListItem2.checked);
                } else if (pageListItem2 instanceof TL_iv.TL_pageListItemBlocks) {
                    expandItemBlocks(arrayList, ((TL_iv.TL_pageListItemBlocks) pageListItem2).blocks, i, false, 0, pageListItem2.checkbox, pageListItem2.checked);
                }
            }
            return;
        }
        ArrayList<TL_iv.PageListOrderedItem> arrayList3 = ((TL_iv.pageBlockOrderedList) pageBlock).items;
        int size2 = arrayList3.size();
        int i3 = 1;
        while (i2 < size2) {
            TL_iv.PageListOrderedItem pageListOrderedItem = arrayList3.get(i2);
            i2++;
            TL_iv.PageListOrderedItem pageListOrderedItem2 = pageListOrderedItem;
            if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemText) {
                addListItemRow(arrayList, ((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem2).text, i, i3, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
            } else if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                int i4 = i3;
                expandItemBlocks(arrayList, ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem2).blocks, i, true, i4, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
                i3 = i4;
            }
            i3++;
        }
    }

    public static RichTableCell findTableCellAncestor(RichEditText richEditText) {
        for (ViewParent parent = richEditText == null ? null : richEditText.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof RichTableCell) {
                return (RichTableCell) parent;
            }
        }
        return null;
    }

    public static void flattenBlocks(ArrayList arrayList, ArrayList arrayList2, HashMap map) {
        TL_iv.RichText richText;
        if (arrayList2 == null) {
            return;
        }
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj;
            if ((pageBlock instanceof TL_iv.pageBlockList) || (pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                expandListBlock(arrayList, pageBlock, 1);
            } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
                if (pageblockdetails.title == null) {
                    pageblockdetails.title = new TL_iv.textEmpty();
                }
                arrayList.add(new BlockRow(pageblockdetails, 0, 0));
                int size2 = arrayList.size();
                flattenBlocks(arrayList, pageblockdetails.blocks, map);
                if (arrayList.size() == size2) {
                    arrayList.add(new BlockRow(new TL_iv.pageBlockParagraph(), 0, 0));
                }
                BlockRow blockRow = new BlockRow(new TL_iv.pageBlockParagraph(), 0, 0);
                blockRow.detailsEnd = true;
                arrayList.add(blockRow);
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                long j = RichContainer.ID_GEN;
                RichContainer.ID_GEN = 1 + j;
                flattenBlocks(arrayList, pageblockblockquoteblocks.blocks, map);
                for (int size3 = arrayList.size(); size3 < arrayList.size(); size3++) {
                    ((BlockRow) arrayList.get(size3)).quoteIds.add(0, Long.valueOf(j));
                }
                if (map != null && (richText = pageblockblockquoteblocks.caption) != null && !(richText instanceof TL_iv.textEmpty)) {
                    map.put(Long.valueOf(j), pageblockblockquoteblocks.caption);
                }
            } else {
                arrayList.add(new BlockRow(pageBlock, 0, 0));
            }
        }
    }

    public static ArrayList flattenForCopy(TL_iv.RichMessage richMessage, HashMap map) {
        ArrayList arrayList = new ArrayList();
        flattenBlocks(arrayList, richMessage.blocks, map);
        return arrayList;
    }

    public static ArrayList galleryItems(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            return ((TL_iv.pageBlockCollage) pageBlock).items;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            return ((TL_iv.pageBlockSlideshow) pageBlock).items;
        }
        return null;
    }

    public static boolean hasCaption(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument) || isMedia(pageBlock);
    }

    public static boolean isDetailsHeader(BlockRow blockRow) {
        return blockRow != null && (blockRow.block instanceof TL_iv.pageBlockDetails);
    }

    public static boolean isFormattable(TL_iv.PageBlock pageBlock) {
        return (isNonText(pageBlock) || (pageBlock instanceof TL_iv.pageBlockDetails)) ? false : true;
    }

    public static boolean isGallery(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow);
    }

    public static boolean isHeading(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
    }

    public static boolean isMedia(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockVideo) || isGallery(pageBlock);
    }

    public static boolean isNonText(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockDivider) || (pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument) || (pageBlock instanceof TL_iv.pageBlockMath) || (pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockTable) || (pageBlock instanceof TL_iv.pageBlockButtonRow) || (pageBlock instanceof TL_iv.pageBlockList) || (pageBlock instanceof TL_iv.pageBlockOrderedList);
    }

    public static boolean isPlainParagraphRow(BlockRow blockRow) {
        return blockRow != null && !blockRow.detailsEnd && !isDetailsHeader(blockRow) && (blockRow.block instanceof TL_iv.pageBlockParagraph) && blockRow.level == 0 && blockRow.num == 0 && !blockRow.checkbox && blockRow.quoteIds.isEmpty();
    }

    public static TL_iv.PageBlock itemBlockFor(BlockRow blockRow, MediaUploadState mediaUploadState) {
        if (!isGallery(blockRow.block)) {
            return blockRow.block;
        }
        ArrayList arrayListGalleryItems = galleryItems(blockRow.block);
        ArrayList arrayList = blockRow.medias;
        int iIndexOf = arrayList != null ? arrayList.indexOf(mediaUploadState) : -1;
        if (iIndexOf < 0 || arrayListGalleryItems == null || iIndexOf >= arrayListGalleryItems.size()) {
            return null;
        }
        return (TL_iv.PageBlock) arrayListGalleryItems.get(iIndexOf);
    }

    public static List mediasOf(BlockRow blockRow) {
        if (blockRow == null) {
            return Collections.EMPTY_LIST;
        }
        if (isGallery(blockRow.block)) {
            ArrayList arrayList = blockRow.medias;
            return arrayList != null ? arrayList : Collections.EMPTY_LIST;
        }
        MediaUploadState mediaUploadState = blockRow.media;
        return mediaUploadState != null ? Collections.singletonList(mediaUploadState) : Collections.EMPTY_LIST;
    }

    public static TL_iv.PageBlock newSameTypeBlock(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            return new TL_iv.pageBlockHeading1();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return new TL_iv.pageBlockHeading2();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            return new TL_iv.pageBlockHeading3();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            return new TL_iv.pageBlockHeading4();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            return new TL_iv.pageBlockHeading5();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            return new TL_iv.pageBlockHeading6();
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            return new TL_iv.pageBlockBlockquote();
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            return new TL_iv.pageBlockPullquote();
        }
        if (!(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
            return pageBlock instanceof TL_iv.pageBlockFooter ? new TL_iv.pageBlockFooter() : new TL_iv.pageBlockParagraph();
        }
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.language = ((TL_iv.pageBlockPreformatted) pageBlock).language;
        return pageblockpreformatted;
    }

    public static MediaUploadState newUploadingMedia(MediaController.PhotoEntry photoEntry, String str) {
        MediaUploadState mediaUploadState = new MediaUploadState();
        mediaUploadState.isVideo = photoEntry.isVideo;
        mediaUploadState.localPath = str;
        mediaUploadState.width = photoEntry.width;
        mediaUploadState.height = photoEntry.height;
        String str2 = photoEntry.imagePath;
        boolean z = (str2 == null || str == null || !str.equals(str2)) ? false : true;
        mediaUploadState.orientation = z ? 0 : photoEntry.orientation;
        mediaUploadState.invert = z ? 0 : photoEntry.invert;
        mediaUploadState.state = 1;
        mediaUploadState.progress = 0.0f;
        return mediaUploadState;
    }

    public static boolean placeCaretAtScreenPoint(RichEditText richEditText, float f, float f2) {
        if (richEditText != null && richEditText.getVisibility() == 0) {
            int[] iArr = new int[2];
            richEditText.getLocationOnScreen(iArr);
            float f3 = f - iArr[0];
            float f4 = f2 - iArr[1];
            if (f3 >= 0.0f && f4 >= 0.0f && f3 <= richEditText.getWidth() && f4 <= richEditText.getHeight()) {
                int offsetForPosition = richEditText.getOffsetForPosition(f3, f4);
                if (offsetForPosition < 0) {
                    offsetForPosition = 0;
                }
                richEditText.requestEditFocusRebuild();
                richEditText.setSelection(Math.max(0, Math.min(offsetForPosition, richEditText.length())));
                return true;
            }
        }
        return false;
    }

    public void setEditTextsLocked(boolean z) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof RichTextCell) {
                ((RichTextCell) childAt).setLocked(z);
            } else if (childAt instanceof RichTableCell) {
                ((RichTableCell) childAt).setLocked(z);
            } else if (childAt instanceof RichCaptionHost) {
                ((RichCaptionHost) childAt).getCaptionEditText().setLocked(z);
            } else if (childAt instanceof RichDetailsCell) {
                ((RichDetailsCell) childAt).setLocked(z);
            } else if (childAt instanceof RichDividerCell) {
                childAt.invalidate();
            }
        }
    }

    public static boolean tableHasText(TL_iv.pageBlockTable pageblocktable) {
        TL_iv.RichText richText;
        TL_iv.RichText richText2 = pageblocktable.title;
        if (richText2 != null && !TextUtils.isEmpty(RichTextStyle.plainOf(richText2))) {
            return true;
        }
        if (pageblocktable.rows == null) {
            return false;
        }
        for (int i = 0; i < pageblocktable.rows.size(); i++) {
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i);
            for (int i2 = 0; i2 < pagetablerow.cells.size(); i2++) {
                TL_iv.pageTableCell pagetablecell = pagetablerow.cells.get(i2);
                if (!((pagetablecell == null || (richText = pagetablecell.text) == null) ? "" : RichTextStyle.plainOf(richText)).isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static FrameLayout tableMenuAnchor(RichTableCell richTableCell, boolean z) {
        RichTableCellHost richTableCellHostHostForAnchor;
        int iAnchorRowOf;
        TableModel model = richTableCell.getModel();
        if (model != null) {
            int i = Integer.MAX_VALUE;
            int i2 = z ? -1 : Integer.MAX_VALUE;
            TL_iv.pageTableCell pagetablecell = null;
            for (TL_iv.pageTableCell pagetablecell2 : richTableCell.getSelectedCells()) {
                int iAnchorColOf = model.anchorColOf(pagetablecell2);
                if (z) {
                    int iAnchorRowOf2 = model.anchorRowOf(pagetablecell2);
                    int i3 = pagetablecell2.rowspan;
                    if (i3 == 0) {
                        i3 = 1;
                    }
                    iAnchorRowOf = (iAnchorRowOf2 + i3) - 1;
                } else {
                    iAnchorRowOf = model.anchorRowOf(pagetablecell2);
                }
                if (z) {
                    if (iAnchorRowOf > i2 || (iAnchorRowOf == i2 && iAnchorColOf < i)) {
                        pagetablecell = pagetablecell2;
                        i = iAnchorColOf;
                        i2 = iAnchorRowOf;
                    }
                } else if (iAnchorRowOf < i2 || (iAnchorRowOf == i2 && iAnchorColOf < i)) {
                    pagetablecell = pagetablecell2;
                    i = iAnchorColOf;
                    i2 = iAnchorRowOf;
                }
            }
            if (pagetablecell != null && (richTableCellHostHostForAnchor = richTableCell.getGrid().hostForAnchor(pagetablecell)) != null) {
                return richTableCellHostHostForAnchor;
            }
        }
        return richTableCell;
    }

    public final void addBlock(TL_iv.PageBlock pageBlock) {
        BlockRow blockRow;
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
            richEditorHistory.commit();
        }
        BlockRow blockRowFindFocusedRow = findFocusedRow();
        if (blockRowFindFocusedRow == null) {
            blockRowFindFocusedRow = this.pendingInsertRow;
        }
        ArrayList arrayList = this.rows;
        int iIndexOf = blockRowFindFocusedRow != null ? arrayList.indexOf(blockRowFindFocusedRow) : -1;
        if (iIndexOf >= 0) {
            TL_iv.PageBlock pageBlock2 = blockRowFindFocusedRow.block;
            if (pageBlock2 instanceof TL_iv.pageBlockBlockquote) {
                long j = RichContainer.ID_GEN;
                RichContainer.ID_GEN = 1 + j;
                TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) pageBlock2).caption;
                if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                    this.quoteAuthors.put(Long.valueOf(j), richText);
                }
                blockRowFindFocusedRow.quoteIds.add(Long.valueOf(j));
                blockRowFindFocusedRow.block = new TL_iv.pageBlockParagraph();
            }
        }
        boolean z = iIndexOf >= 0 && !blockRowFindFocusedRow.quoteIds.isEmpty();
        if (iIndexOf >= 0) {
            TL_iv.PageBlock pageBlock3 = blockRowFindFocusedRow.block;
            if ((pageBlock3 instanceof TL_iv.pageBlockParagraph) && blockRowFindFocusedRow.media == null && RichTextCell.readPlainText(pageBlock3).isEmpty()) {
                blockRowFindFocusedRow.block = pageBlock;
            } else {
                blockRow = new BlockRow(pageBlock, 0, 0);
                if (z) {
                    blockRow.quoteIds.addAll(blockRowFindFocusedRow.quoteIds);
                }
                if (iIndexOf >= 0) {
                    arrayList.add(iIndexOf + 1, blockRow);
                } else {
                    arrayList.add(blockRow);
                }
                blockRowFindFocusedRow = blockRow;
            }
        } else {
            blockRow = new BlockRow(pageBlock, 0, 0);
            if (z) {
                blockRow.quoteIds.addAll(blockRowFindFocusedRow.quoteIds);
            }
            if (iIndexOf >= 0) {
                arrayList.add(iIndexOf + 1, blockRow);
            } else {
                arrayList.add(blockRow);
            }
            blockRowFindFocusedRow = blockRow;
        }
        this.pendingInsertRow = blockRowFindFocusedRow;
        if (hasCaption(pageBlock)) {
            int iIndexOf2 = arrayList.indexOf(blockRowFindFocusedRow) + 1;
            if (iIndexOf2 >= arrayList.size() || isNonText(((BlockRow) arrayList.get(iIndexOf2)).block)) {
                BlockRow blockRow2 = new BlockRow(new TL_iv.pageBlockParagraph(), 0, 0);
                if (z) {
                    blockRow2.quoteIds.addAll(blockRowFindFocusedRow.quoteIds);
                }
                arrayList.add(iIndexOf2, blockRow2);
                blockRowFindFocusedRow = blockRow2;
            } else {
                blockRowFindFocusedRow = (BlockRow) arrayList.get(iIndexOf2);
            }
        }
        this.adapter.update(false);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        post(new RichEditorListView$$ExternalSyntheticLambda2(this, blockRowFindFocusedRow, 2));
    }

    public final void addMediaToRow(BlockRow blockRow, MediaController.PhotoEntry photoEntry) {
        if (blockRow == null || photoEntry == null || !isMedia(blockRow.block)) {
            return;
        }
        String str = photoEntry.imagePath;
        if (str == null) {
            str = photoEntry.path;
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
            richEditorHistory.commit();
        }
        MediaUploadState mediaUploadStateNewUploadingMedia = newUploadingMedia(photoEntry, str2);
        boolean zHasAnimatedMediaEntities = RichMediaConverter.hasAnimatedMediaEntities(photoEntry);
        TL_iv.PageBlock pageblockvideo = (photoEntry.isVideo || zHasAnimatedMediaEntities) ? new TL_iv.pageBlockVideo() : new TL_iv.pageBlockPhoto();
        if (isGallery(blockRow.block)) {
            galleryItems(blockRow.block).add(pageblockvideo);
            if (blockRow.medias == null) {
                blockRow.medias = new ArrayList();
            }
            blockRow.medias.add(mediaUploadStateNewUploadingMedia);
        } else {
            MediaUploadState mediaUploadState = blockRow.media;
            if (mediaUploadState == null || mediaUploadState.state == 0) {
                blockRow.block = pageblockvideo;
                blockRow.media = mediaUploadStateNewUploadingMedia;
            } else {
                TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                pageblockcollage.caption = blockRow.block.caption;
                RichCaptionController.ensureCaption(pageblockcollage);
                ArrayList<TL_iv.PageBlock> arrayList = new ArrayList<>();
                pageblockcollage.items = arrayList;
                arrayList.add(blockRow.block);
                pageblockcollage.items.add(pageblockvideo);
                ArrayList arrayList2 = new ArrayList();
                blockRow.medias = arrayList2;
                arrayList2.add(blockRow.media);
                blockRow.medias.add(mediaUploadStateNewUploadingMedia);
                blockRow.media = null;
                blockRow.block = pageblockcollage;
            }
        }
        this.adapter.update(false);
        refreshMediaCell(blockRow);
        if (zHasAnimatedMediaEntities) {
            startMediaConvertAndUpload(blockRow, mediaUploadStateNewUploadingMedia, photoEntry);
        } else {
            boolean z = photoEntry.isVideo;
            int i = photoEntry.width;
            int i2 = photoEntry.height;
            int i3 = photoEntry.duration;
            IdentityHashMap identityHashMap = this.uploaders;
            RichMediaUploader richMediaUploader = (RichMediaUploader) identityHashMap.remove(mediaUploadStateNewUploadingMedia);
            if (richMediaUploader != null) {
                richMediaUploader.cancel();
            }
            RichMediaUploader richMediaUploader2 = new RichMediaUploader(this.currentAccount, str2, z, i, i2, i3, new AnonymousClass19(blockRow, mediaUploadStateNewUploadingMedia, this));
            identityHashMap.put(mediaUploadStateNewUploadingMedia, richMediaUploader2);
            richMediaUploader2.start();
        }
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        this.delegate.onContentChanged();
    }

    public final void addRichMessage(TL_iv.RichMessage richMessage) {
        ArrayList<TL_iv.PageBlock> arrayList;
        int iIndexOf;
        if (richMessage == null || (arrayList = richMessage.blocks) == null || arrayList.isEmpty()) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
            richEditorHistory.commit();
        }
        TL_iv.RichMessage richMessage2 = this.loadedRichMessage;
        if (richMessage2 == null) {
            this.loadedRichMessage = richMessage;
        } else {
            ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
            if (arrayList2 != null) {
                richMessage2.photos.addAll(arrayList2);
            }
            ArrayList<TLRPC.Document> arrayList3 = richMessage.documents;
            if (arrayList3 != null) {
                this.loadedRichMessage.documents.addAll(arrayList3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        flattenBlocks(arrayList4, richMessage.blocks, this.quoteAuthors);
        if (arrayList4.isEmpty()) {
            return;
        }
        for (int i = 0; i < arrayList4.size(); i++) {
            resolveLoadedMedia((BlockRow) arrayList4.get(i));
        }
        ArrayList arrayList5 = this.rows;
        int size = arrayList5.size();
        BlockRow blockRowFindFocusedRow = findFocusedRow();
        if (blockRowFindFocusedRow != null && (iIndexOf = arrayList5.indexOf(blockRowFindFocusedRow)) >= 0) {
            TL_iv.PageBlock pageBlock = blockRowFindFocusedRow.block;
            if ((pageBlock instanceof TL_iv.pageBlockParagraph) && RichTextCell.readPlainText(pageBlock).isEmpty()) {
                arrayList5.remove(iIndexOf);
                size = iIndexOf;
            } else {
                size = iIndexOf + 1;
            }
        }
        arrayList5.addAll(size, arrayList4);
        normalizeNestedQuotes();
        renumberAllRuns();
        this.adapter.update(false);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        Delegate delegate = this.delegate;
        if (delegate != null) {
            delegate.onContentChanged();
        }
    }

    public final boolean applyEditRange(int i, int i2, int i3, int i4, String[] strArr) {
        RichTableCell richTableCell;
        TableModel model;
        int iMax;
        int length;
        TL_iv.RichText richText;
        TL_iv.RichText richText2;
        TL_iv.RichText richText3;
        int length2;
        int i5;
        ?? r6;
        int length3;
        RichEditorHistory richEditorHistory;
        int i6 = i2;
        int i7 = i4;
        ArrayList arrayList = this.rows;
        int iIndexOf = arrayList.indexOf(rowForCell(i));
        int iIndexOf2 = arrayList.indexOf(rowForCell(i3));
        if (iIndexOf >= 0 && iIndexOf2 >= 0 && iIndexOf < arrayList.size() && iIndexOf2 < arrayList.size()) {
            BlockRow blockRow = (BlockRow) arrayList.get(iIndexOf);
            BlockRow blockRow2 = (BlockRow) arrayList.get(iIndexOf2);
            AnonymousClass1 anonymousClass1 = this.textSelectionHelper;
            if (iIndexOf == iIndexOf2 && isDetailsHeader(blockRow)) {
                View viewFindViewByItemObject = findViewByItemObject(blockRow);
                if (!(viewFindViewByItemObject instanceof RichDetailsCell) || !(blockRow.block instanceof TL_iv.pageBlockDetails)) {
                    return true;
                }
                RichEditText editText = ((RichDetailsCell) viewFindViewByItemObject).getEditText();
                RichEditorHistory richEditorHistory2 = this.history;
                if (richEditorHistory2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(richEditorHistory2.commitRunnable);
                    richEditorHistory2.commit();
                }
                StringBuilder sb = new StringBuilder();
                for (int i8 = 0; i8 < strArr.length; i8++) {
                    if (i8 > 0) {
                        sb.append(' ');
                    }
                    sb.append(strArr[i8]);
                }
                String string = sb.toString();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editText.getText());
                int length4 = spannableStringBuilder.length();
                int iM = zzdv.m(i6, i7, length4);
                spannableStringBuilder.replace(iM, zzdu.m(i6, i7, length4), (CharSequence) string);
                editText.setTextSilently(spannableStringBuilder);
                editText.invalidateEffects();
                ((TL_iv.pageBlockDetails) blockRow.block).title = RichTextStyle.fromSpannable(spannableStringBuilder);
                int length5 = string.length() + iM;
                anonymousClass1.clear(false);
                RichEditorHistory richEditorHistory3 = this.history;
                if (richEditorHistory3 != null) {
                    richEditorHistory3.record();
                }
                post(new RichEditorListView$$ExternalSyntheticLambda63(editText, length5, 0));
                return true;
            }
            int i9 = iIndexOf;
            while (true) {
                UniversalAdapter universalAdapter = this.adapter;
                String strPlainOf = "";
                if (i9 > iIndexOf2) {
                    RichEditorHistory richEditorHistory4 = this.history;
                    if (richEditorHistory4 != null) {
                        AndroidUtilities.cancelRunOnUIThread(richEditorHistory4.commitRunnable);
                        richEditorHistory4.commit();
                    }
                    TL_iv.PageBlock pageBlock = blockRow.block;
                    boolean z = pageBlock instanceof TL_iv.pageBlockTable;
                    boolean z2 = blockRow2.block instanceof TL_iv.pageBlockTable;
                    Delegate delegate = this.delegate;
                    if (z || z2) {
                        if (!z || !z2 || iIndexOf != iIndexOf2) {
                            break;
                            break;
                            break;
                        }
                        int i10 = anonymousClass1.startViewChildPosition;
                        int i11 = anonymousClass1.endViewChildPosition;
                        View viewFindViewByItemObject2 = findViewByItemObject(blockRow);
                        if ((viewFindViewByItemObject2 instanceof RichTableCell) && (model = (richTableCell = (RichTableCell) viewFindViewByItemObject2).getModel()) != null) {
                            if (i10 == 0 && i11 == 0) {
                                TL_iv.PageBlock pageBlock2 = blockRow.block;
                                if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                                    TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                                    RichEditorHistory richEditorHistory5 = this.history;
                                    if (richEditorHistory5 != null) {
                                        AndroidUtilities.cancelRunOnUIThread(richEditorHistory5.commitRunnable);
                                        richEditorHistory5.commit();
                                    }
                                    String strPlainOf2 = RichTextStyle.plainOf(pageblocktable.title);
                                    int iMax2 = Math.max(0, Math.min(Math.min(i6, i7), strPlainOf2.length()));
                                    int iMax3 = Math.max(0, Math.min(Math.max(i6, i7), strPlainOf2.length()));
                                    StringBuilder sb2 = new StringBuilder();
                                    for (int i12 = 0; i12 < strArr.length; i12++) {
                                        if (i12 > 0) {
                                            sb2.append(' ');
                                        }
                                        sb2.append(strArr[i12]);
                                    }
                                    String string2 = sb2.toString();
                                    String str = strPlainOf2.substring(0, iMax2) + string2 + strPlainOf2.substring(iMax3);
                                    TL_iv.textPlain textplain = new TL_iv.textPlain();
                                    textplain.text = str;
                                    pageblocktable.title = textplain;
                                    RichEditText titleEditText = richTableCell.getTitleEditText();
                                    titleEditText.setTextSilently(str);
                                    titleEditText.invalidateEffects();
                                    int length6 = string2.length() + iMax2;
                                    anonymousClass1.clear(false);
                                    RichEditorHistory richEditorHistory6 = this.history;
                                    if (richEditorHistory6 != null) {
                                        richEditorHistory6.record();
                                    }
                                    delegate.onContentChanged();
                                    post(new RichEditorListView$$ExternalSyntheticLambda63(titleEditText, length6, 4));
                                    return true;
                                }
                            } else {
                                int i13 = i10 - 1;
                                int i14 = i11 - 1;
                                ArrayList arrayList2 = model.anchorsRowMajor;
                                int size = arrayList2.size();
                                if (i13 >= 0 && i13 < size && i14 >= 0 && i14 < size) {
                                    RichEditorHistory richEditorHistory7 = this.history;
                                    if (richEditorHistory7 != null) {
                                        AndroidUtilities.cancelRunOnUIThread(richEditorHistory7.commitRunnable);
                                        richEditorHistory7.commit();
                                    }
                                    if (i13 > i14 || (i13 == i14 && i6 > i7)) {
                                        i7 = i6;
                                        i6 = i7;
                                        i14 = i13;
                                        i13 = i14;
                                    }
                                    StringBuilder sb3 = new StringBuilder();
                                    for (int i15 = 0; i15 < strArr.length; i15++) {
                                        if (i15 > 0) {
                                            sb3.append('\n');
                                        }
                                        sb3.append(strArr[i15]);
                                    }
                                    String string3 = sb3.toString();
                                    TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) arrayList2.get(i13);
                                    TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) arrayList2.get(i14);
                                    if (i13 == i14) {
                                        if (pagetablecell != null && (richText3 = pagetablecell.text) != null) {
                                            strPlainOf = RichTextStyle.plainOf(richText3);
                                        }
                                        iMax = Math.max(0, Math.min(i6, strPlainOf.length()));
                                        String str2 = strPlainOf.substring(0, iMax) + string3 + strPlainOf.substring(Math.max(0, Math.min(i7, strPlainOf.length())));
                                        TableModel.applyPlainText(pagetablecell, str2);
                                        RichTableCellHost richTableCellHostHostForAnchor = richTableCell.getGrid().hostForAnchor(pagetablecell);
                                        if (richTableCellHostHostForAnchor != null) {
                                            richTableCellHostHostForAnchor.editText.setTextSilently(str2);
                                        }
                                        length = string3.length();
                                    } else {
                                        String strPlainOf3 = (pagetablecell == null || (richText2 = pagetablecell.text) == null) ? "" : RichTextStyle.plainOf(richText2);
                                        iMax = Math.max(0, Math.min(i6, strPlainOf3.length()));
                                        String str3 = strPlainOf3.substring(0, iMax) + string3;
                                        TableModel.applyPlainText(pagetablecell, str3);
                                        RichTableCellHost richTableCellHostHostForAnchor2 = richTableCell.getGrid().hostForAnchor(pagetablecell);
                                        if (richTableCellHostHostForAnchor2 != null) {
                                            richTableCellHostHostForAnchor2.editText.setTextSilently(str3);
                                        }
                                        while (true) {
                                            i13++;
                                            if (i13 >= i14) {
                                                break;
                                            }
                                            TL_iv.pageTableCell pagetablecell3 = (TL_iv.pageTableCell) arrayList2.get(i13);
                                            TableModel.applyPlainText(pagetablecell3, "");
                                            RichTableCellHost richTableCellHostHostForAnchor3 = richTableCell.getGrid().hostForAnchor(pagetablecell3);
                                            if (richTableCellHostHostForAnchor3 != null) {
                                                richTableCellHostHostForAnchor3.editText.setTextSilently("");
                                            }
                                        }
                                        if (pagetablecell2 != null && (richText = pagetablecell2.text) != null) {
                                            strPlainOf = RichTextStyle.plainOf(richText);
                                        }
                                        String strSubstring = strPlainOf.substring(Math.max(0, Math.min(i7, strPlainOf.length())));
                                        TableModel.applyPlainText(pagetablecell2, strSubstring);
                                        RichTableCellHost richTableCellHostHostForAnchor4 = richTableCell.getGrid().hostForAnchor(pagetablecell2);
                                        if (richTableCellHostHostForAnchor4 != null) {
                                            richTableCellHostHostForAnchor4.editText.setTextSilently(strSubstring);
                                        }
                                        length = string3.length();
                                    }
                                    int i16 = length + iMax;
                                    anonymousClass1.clear(false);
                                    RichEditorHistory richEditorHistory8 = this.history;
                                    if (richEditorHistory8 != null) {
                                        richEditorHistory8.record();
                                    }
                                    post(new TodoItemMenu$$ExternalSyntheticLambda2(richTableCell, pagetablecell, i16, 18));
                                    return true;
                                }
                            }
                        }
                        return true;
                    }
                    boolean zHasCaption = hasCaption(pageBlock);
                    boolean zHasCaption2 = hasCaption(blockRow2.block);
                    if (zHasCaption || zHasCaption2) {
                        if (!zHasCaption || !zHasCaption2 || iIndexOf != iIndexOf2) {
                            break;
                            break;
                            break;
                        }
                        KeyEvent.Callback callbackFindViewByItemObject = findViewByItemObject(blockRow);
                        if (callbackFindViewByItemObject instanceof RichCaptionHost) {
                            RichCaptionHost richCaptionHost = (RichCaptionHost) callbackFindViewByItemObject;
                            RichEditText captionEditText = richCaptionHost.getCaptionEditText();
                            RichEditorHistory richEditorHistory9 = this.history;
                            if (richEditorHistory9 != null) {
                                AndroidUtilities.cancelRunOnUIThread(richEditorHistory9.commitRunnable);
                                richEditorHistory9.commit();
                            }
                            StringBuilder sb4 = new StringBuilder();
                            for (int i17 = 0; i17 < strArr.length; i17++) {
                                if (i17 > 0) {
                                    sb4.append(' ');
                                }
                                sb4.append(strArr[i17]);
                            }
                            String string4 = sb4.toString();
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(captionEditText.getText());
                            int length7 = spannableStringBuilder2.length();
                            int iM2 = zzdv.m(i6, i7, length7);
                            spannableStringBuilder2.replace(iM2, zzdu.m(i6, i7, length7), (CharSequence) string4);
                            captionEditText.setTextSilently(spannableStringBuilder2);
                            captionEditText.invalidateEffects();
                            richCaptionHost.persistCaption();
                            int length8 = string4.length() + iM2;
                            anonymousClass1.clear(false);
                            RichEditorHistory richEditorHistory10 = this.history;
                            if (richEditorHistory10 != null) {
                                richEditorHistory10.record();
                            }
                            post(new RichEditorListView$$ExternalSyntheticLambda63(captionEditText, length8, 2));
                            return true;
                        }
                    } else {
                        if (iIndexOf != iIndexOf2 || !RichTextCell.isQuoteBlock(blockRow.block) || anonymousClass1.startViewChildPosition != 1 || anonymousClass1.endViewChildPosition != 1) {
                            String plainText = RichTextCell.readPlainText(blockRow.block);
                            String plainText2 = iIndexOf == iIndexOf2 ? plainText : RichTextCell.readPlainText(blockRow2.block);
                            int iMax4 = Math.max(0, Math.min(i6, plainText.length()));
                            int iMax5 = Math.max(0, Math.min(i7, plainText2.length()));
                            String strSubstring2 = plainText.substring(0, iMax4);
                            String strSubstring3 = plainText2.substring(iMax5);
                            if (strArr.length <= 1) {
                                strPlainOf = strArr.length != 0 ? strArr[0] : "";
                                TL_iv.PageBlock pageBlock3 = blockRow.block;
                                String strM = zzit.m(strSubstring2, strPlainOf, strSubstring3);
                                TL_iv.textPlain textplain2 = new TL_iv.textPlain();
                                textplain2.text = strM;
                                pageBlock3.text = textplain2;
                                if (iIndexOf2 > iIndexOf) {
                                    while (iIndexOf2 > iIndexOf) {
                                        arrayList.remove(iIndexOf2);
                                        iIndexOf2--;
                                    }
                                }
                                length2 = strPlainOf.length() + strSubstring2.length();
                            } else {
                                TL_iv.PageBlock pageBlock4 = blockRow.block;
                                StringBuilder sbM = Log.m(strSubstring2);
                                sbM.append(strArr[0]);
                                String string5 = sbM.toString();
                                TL_iv.textPlain textplain3 = new TL_iv.textPlain();
                                textplain3.text = string5;
                                pageBlock4.text = textplain3;
                                if (iIndexOf2 > iIndexOf) {
                                    while (iIndexOf2 > iIndexOf) {
                                        arrayList.remove(iIndexOf2);
                                        iIndexOf2--;
                                    }
                                }
                                for (int i18 = 1; i18 < strArr.length - 1; i18++) {
                                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                                    String str4 = strArr[i18];
                                    TL_iv.textPlain textplain4 = new TL_iv.textPlain();
                                    textplain4.text = str4;
                                    pageblockparagraph.text = textplain4;
                                    int i19 = iIndexOf + i18;
                                    int i20 = blockRow.level;
                                    int i21 = blockRow.num;
                                    if (i21 > 0) {
                                        i21 += i18;
                                    }
                                    arrayList.add(i19, new BlockRow(pageblockparagraph, i20, i21));
                                }
                                String str5 = strArr[strArr.length - 1];
                                TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                String strM2 = zzhr.m(str5, strSubstring3);
                                TL_iv.textPlain textplain5 = new TL_iv.textPlain();
                                textplain5.text = strM2;
                                pageblockparagraph2.text = textplain5;
                                int length9 = (strArr.length + iIndexOf) - 1;
                                int i22 = blockRow.level;
                                int length10 = blockRow.num;
                                if (length10 > 0) {
                                    length10 = (length10 + strArr.length) - 1;
                                }
                                arrayList.add(length9, new BlockRow(pageblockparagraph2, i22, length10));
                                iIndexOf = (iIndexOf + strArr.length) - 1;
                                length2 = str5.length();
                            }
                            renumberAllRuns();
                            BlockRow blockRow3 = (iIndexOf < 0 || iIndexOf >= arrayList.size()) ? null : (BlockRow) arrayList.get(iIndexOf);
                            anonymousClass1.clear(false);
                            universalAdapter.update(false);
                            RichEditorHistory richEditorHistory11 = this.history;
                            if (richEditorHistory11 != null) {
                                richEditorHistory11.record();
                            }
                            post(new RichEditorListView$$ExternalSyntheticLambda3(this, blockRow3, length2, 1));
                            return true;
                        }
                        View viewFindViewByItemObject3 = findViewByItemObject(blockRow);
                        if (viewFindViewByItemObject3 instanceof RichTextCell) {
                            RichTextCell richTextCell = (RichTextCell) viewFindViewByItemObject3;
                            RichEditText authorEditText = richTextCell.getAuthorEditText();
                            RichEditorHistory richEditorHistory12 = this.history;
                            if (richEditorHistory12 != null) {
                                AndroidUtilities.cancelRunOnUIThread(richEditorHistory12.commitRunnable);
                                richEditorHistory12.commit();
                            }
                            StringBuilder sb5 = new StringBuilder();
                            for (int i23 = 0; i23 < strArr.length; i23++) {
                                if (i23 > 0) {
                                    sb5.append(' ');
                                }
                                sb5.append(strArr[i23]);
                            }
                            String string6 = sb5.toString();
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(authorEditText.getText());
                            int length11 = spannableStringBuilder3.length();
                            int iM3 = zzdv.m(i6, i7, length11);
                            spannableStringBuilder3.replace(iM3, zzdu.m(i6, i7, length11), (CharSequence) string6);
                            authorEditText.setTextSilently(spannableStringBuilder3);
                            authorEditText.invalidateEffects();
                            richTextCell.persistAuthor();
                            int length12 = string6.length() + iM3;
                            anonymousClass1.clear(false);
                            RichEditorHistory richEditorHistory13 = this.history;
                            if (richEditorHistory13 != null) {
                                richEditorHistory13.record();
                            }
                            delegate.onContentChanged();
                            post(new RichEditorListView$$ExternalSyntheticLambda63(authorEditText, length12, 1));
                            return true;
                        }
                    }
                    return true;
                }
                if (((BlockRow) arrayList.get(i9)).detailsEnd || isDetailsHeader((BlockRow) arrayList.get(i9))) {
                    int i24 = iIndexOf;
                    while (i24 > 0 && detailsDepthBefore(i24) > 0) {
                        i24--;
                    }
                    int i25 = iIndexOf2;
                    while (true) {
                        i5 = i25 + 1;
                        if (i5 >= arrayList.size() || detailsDepthBefore(i5) <= 0) {
                            break;
                        }
                        i25 = i5;
                    }
                    BlockRow blockRow4 = (BlockRow) arrayList.get(iIndexOf);
                    BlockRow blockRow5 = (BlockRow) arrayList.get(iIndexOf2);
                    boolean z3 = i24 != iIndexOf || isDetailsHeader(blockRow4) || blockRow4.detailsEnd;
                    boolean z4 = i25 != iIndexOf2 || isDetailsHeader(blockRow5) || blockRow5.detailsEnd;
                    StringBuilder sb6 = new StringBuilder();
                    boolean z5 = z3;
                    boolean z6 = z4;
                    for (int i26 = 0; i26 < strArr.length; i26++) {
                        if (i26 > 0) {
                            sb6.append(' ');
                        }
                        sb6.append(strArr[i26]);
                    }
                    String string7 = sb6.toString();
                    RichEditorHistory richEditorHistory14 = this.history;
                    if (richEditorHistory14 != null) {
                        AndroidUtilities.cancelRunOnUIThread(richEditorHistory14.commitRunnable);
                        richEditorHistory14.commit();
                    }
                    if (z5) {
                        if (z6) {
                            arrayList.subList(i24, i5).clear();
                            TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                            TL_iv.textPlain textplain6 = new TL_iv.textPlain();
                            textplain6.text = string7;
                            pageblockparagraph3.text = textplain6;
                            r6 = 0;
                            blockRow4 = new BlockRow(pageblockparagraph3, 0, 0);
                            arrayList.add(Math.min(i24, arrayList.size()), blockRow4);
                            length3 = string7.length();
                        } else {
                            String plainText3 = RichTextCell.readPlainText(blockRow5.block);
                            String strSubstring4 = plainText3.substring(Math.max(0, Math.min(i7, plainText3.length())));
                            TL_iv.PageBlock pageBlock5 = blockRow5.block;
                            String strM3 = zzhr.m(string7, strSubstring4);
                            TL_iv.textPlain textplain7 = new TL_iv.textPlain();
                            textplain7.text = strM3;
                            pageBlock5.text = textplain7;
                            arrayList.subList(i24, i25).clear();
                            length3 = string7.length();
                            blockRow4 = blockRow5;
                        }
                        if (arrayList.isEmpty()) {
                            blockRow4 = new BlockRow(new TL_iv.pageBlockParagraph(), r6, r6);
                            arrayList.add(blockRow4);
                            length3 = 0;
                        }
                        renumberAllRuns();
                        anonymousClass1.clear(r6);
                        universalAdapter.update(r6);
                        richEditorHistory = this.history;
                        if (richEditorHistory != null) {
                            richEditorHistory.record();
                        }
                        post(new RichEditorListView$$ExternalSyntheticLambda3(this, blockRow4, length3, 3));
                        return true;
                    }
                    String plainText4 = RichTextCell.readPlainText(blockRow4.block);
                    String strSubstring5 = plainText4.substring(0, Math.max(0, Math.min(i6, plainText4.length())));
                    if (!z6) {
                        String plainText5 = RichTextCell.readPlainText(blockRow5.block);
                        strPlainOf = plainText5.substring(Math.max(0, Math.min(i7, plainText5.length())));
                    }
                    TL_iv.PageBlock pageBlock6 = blockRow4.block;
                    String strM4 = zzit.m(strSubstring5, string7, strPlainOf);
                    TL_iv.textPlain textplain8 = new TL_iv.textPlain();
                    textplain8.text = strM4;
                    pageBlock6.text = textplain8;
                    arrayList.subList(i24 + 1, i5).clear();
                    length3 = string7.length() + strSubstring5.length();
                    r6 = 0;
                    if (arrayList.isEmpty()) {
                        blockRow4 = new BlockRow(new TL_iv.pageBlockParagraph(), r6, r6);
                        arrayList.add(blockRow4);
                        length3 = 0;
                    }
                    renumberAllRuns();
                    anonymousClass1.clear(r6);
                    universalAdapter.update(r6);
                    richEditorHistory = this.history;
                    if (richEditorHistory != null) {
                        richEditorHistory.record();
                    }
                    post(new RichEditorListView$$ExternalSyntheticLambda3(this, blockRow4, length3, 3));
                    return true;
                }
                i9++;
            }
        }
        return false;
    }

    public final void applyInPlaceUpdateKeepingFocus() {
        RichTextCell richTextCell;
        BlockRow blockRow;
        RichTextCell.Delegate delegate;
        this.adapter.updateWithoutNotify();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof RichTextCell) && (blockRow = (richTextCell = (RichTextCell) childAt).currentRow) != null && (delegate = richTextCell.delegate) != null) {
                richTextCell.bind(blockRow, delegate, richTextCell.forceHint);
            }
        }
    }

    public final boolean applyInitialSelectionInternal(int i, int i2) {
        AnonymousClass1 anonymousClass1;
        ArrayList arrayList = this.initialSelectionRows;
        if (arrayList != null && !arrayList.isEmpty()) {
            int iMax = Math.max(0, Math.min(i, i2));
            int iMax2 = Math.max(0, Math.max(i, i2));
            int[] iArrMapInitialOffset = mapInitialOffset(iMax);
            int[] iArrMapInitialOffset2 = mapInitialOffset(iMax2);
            BlockRow blockRow = (BlockRow) this.initialSelectionRows.get(iArrMapInitialOffset[0]);
            if (iArrMapInitialOffset[0] != iArrMapInitialOffset2[0] && iMax != iMax2) {
                View viewFindViewByItemObject = findViewByItemObject(blockRow);
                View viewFindViewByItemObject2 = findViewByItemObject(this.initialSelectionRows.get(iArrMapInitialOffset2[0]));
                if (!(viewFindViewByItemObject instanceof RichTextCell) || !(viewFindViewByItemObject2 instanceof RichTextCell)) {
                    return false;
                }
                int i3 = 0;
                while (true) {
                    ArrayList arrayList2 = this.rows;
                    int size = arrayList2.size();
                    anonymousClass1 = this.textSelectionHelper;
                    if (i3 >= size) {
                        break;
                    }
                    anonymousClass1.cacheText(i3, RichTextCell.readPlainText(((BlockRow) arrayList2.get(i3)).block));
                    i3++;
                }
                RichTextCell richTextCell = (RichTextCell) viewFindViewByItemObject;
                int length = richTextCell.getEditText().length();
                if (iArrMapInitialOffset[1] >= length) {
                    length = Math.max(0, length - 1);
                }
                if (!anonymousClass1.selectRangeOf(richTextCell, 0, iArrMapInitialOffset[1], length)) {
                    richTextCell.editText.requestEditFocus();
                    return true;
                }
                anonymousClass1.extendSelectionTo(0, iArrMapInitialOffset2[1], (RichTextCell) viewFindViewByItemObject2);
                return true;
            }
            View viewFindViewByItemObject3 = findViewByItemObject(blockRow);
            if (!(viewFindViewByItemObject3 instanceof RichTextCell)) {
                return false;
            }
            RichTextCell richTextCell2 = (RichTextCell) viewFindViewByItemObject3;
            richTextCell2.editText.requestEditFocus();
            RichEditText editText = richTextCell2.getEditText();
            int length2 = editText.length();
            editText.setSelection(Math.min(iArrMapInitialOffset[1], length2), Math.min(iArrMapInitialOffset2[1], length2));
        }
        return true;
    }

    public final void applyQuote(BlockRow blockRow) {
        if (blockRow == null) {
            blockRow = turnIntoTarget();
        }
        if (blockRow == null || this.rows.indexOf(blockRow) < 0 || isDetailsHeader(blockRow) || blockRow.detailsEnd) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
            richEditorHistory.commit();
        }
        ArrayList arrayList = blockRow.quoteIds;
        boolean z = arrayList.isEmpty() && !RichTextCell.isQuoteBlock(blockRow.block);
        if (z) {
            TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
            pageblockblockquote.caption = new TL_iv.textEmpty();
            blockRow.block = pageblockblockquote;
        } else {
            if (RichTextCell.isQuoteBlock(blockRow.block)) {
                long j = RichContainer.ID_GEN;
                RichContainer.ID_GEN = j + 1;
                TL_iv.RichText richTextExtractCaption = RichTextCell.extractCaption(blockRow.block);
                if (richTextExtractCaption != null && !(richTextExtractCaption instanceof TL_iv.textEmpty)) {
                    this.quoteAuthors.put(Long.valueOf(j), richTextExtractCaption);
                }
                arrayList.add(Long.valueOf(j));
            }
            blockRow.block = new TL_iv.pageBlockParagraph();
            long j2 = RichContainer.ID_GEN;
            RichContainer.ID_GEN = 1 + j2;
            arrayList.add(Long.valueOf(j2));
        }
        renumberAllRuns();
        if (z && (findFocus() instanceof RichEditText)) {
            applyInPlaceUpdateKeepingFocus();
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
            focusRow(blockRow);
            return;
        }
        this.adapter.update(false);
        RichEditorHistory richEditorHistory3 = this.history;
        if (richEditorHistory3 != null) {
            richEditorHistory3.record();
        }
        post(new RichEditorListView$$ExternalSyntheticLambda86(this, blockRow, 5));
    }

    public final void assignContainers() {
        ArrayList arrayList;
        long j;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList7 = this.rows;
            if (i2 >= arrayList7.size()) {
                return;
            }
            BlockRow blockRow = (BlockRow) arrayList7.get(i2);
            blockRow.path.clear();
            if (blockRow.detailsEnd) {
                if (!arrayList2.isEmpty()) {
                    SurfaceContainer$$ExternalSyntheticOutline0.m5m(1, arrayList2);
                }
                arrayList3.clear();
                arrayList4.clear();
                arrayList5.clear();
                arrayList6.clear();
            } else {
                int i3 = 0;
                while (true) {
                    ArrayList arrayList8 = blockRow.quoteIds;
                    int size = arrayList8.size();
                    arrayList = blockRow.path;
                    if (i3 >= size) {
                        break;
                    }
                    ((Long) arrayList8.get(i3)).getClass();
                    arrayList.add(new RichContainer());
                    i3++;
                }
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    arrayList.add((RichContainer) arrayList2.get(i4));
                }
                int iMax = Math.max(i, blockRow.level);
                if (iMax == 0) {
                    arrayList3.clear();
                    arrayList4.clear();
                    arrayList5.clear();
                    arrayList6.clear();
                } else {
                    boolean z = blockRow.num > 0;
                    while (arrayList3.size() > iMax) {
                        arrayList3.remove(arrayList3.size() - 1);
                        arrayList4.remove(arrayList4.size() - 1);
                        arrayList5.remove(arrayList5.size() - 1);
                        arrayList6.remove(arrayList6.size() - 1);
                    }
                    int i5 = 1;
                    while (i5 <= iMax) {
                        int i6 = i5 - 1;
                        boolean z2 = i5 == iMax;
                        boolean z3 = i6 < arrayList3.size();
                        if (z3 && z2) {
                            j = 1;
                            if (((Boolean) arrayList4.get(i6)).booleanValue() != z) {
                                z3 = false;
                            }
                        } else {
                            j = 1;
                        }
                        if (!z3) {
                            while (arrayList3.size() > i6) {
                                arrayList3.remove(arrayList3.size() - 1);
                                arrayList4.remove(arrayList4.size() - 1);
                                arrayList5.remove(arrayList5.size() - 1);
                                arrayList6.remove(arrayList6.size() - 1);
                            }
                            long j2 = RichContainer.ID_GEN;
                            RichContainer.ID_GEN = j2 + j;
                            arrayList3.add(Long.valueOf(j2));
                            arrayList4.add(Boolean.valueOf(z2 ? z : false));
                            arrayList5.add(0);
                            arrayList6.add(0L);
                        }
                        ((Long) arrayList3.get(i6)).getClass();
                        if (z2) {
                            if (((Long) arrayList6.get(i6)).longValue() == 0 || !isNonText(blockRow.block)) {
                                arrayList5.set(i6, Integer.valueOf(((Integer) arrayList5.get(i6)).intValue() + 1));
                                arrayList6.set(i6, Long.valueOf(blockRow.id));
                            } else {
                                ((Integer) arrayList5.get(i6)).getClass();
                                ((Long) arrayList6.get(i6)).getClass();
                            }
                            arrayList.add(new RichContainer());
                        } else {
                            ((Boolean) arrayList4.get(i6)).getClass();
                            arrayList.add(new RichContainer());
                        }
                        i5++;
                    }
                }
                if (isDetailsHeader(blockRow)) {
                    boolean z4 = ((TL_iv.pageBlockDetails) blockRow.block).open;
                    RichContainer.ID_GEN++;
                    arrayList2.add(new RichContainer());
                    arrayList3.clear();
                    arrayList4.clear();
                    arrayList5.clear();
                    arrayList6.clear();
                }
                if (RichTextCell.isQuoteBlock(blockRow.block)) {
                    RichContainer.ID_GEN++;
                    arrayList.add(new RichContainer());
                }
            }
            i2++;
            i = 0;
        }
    }

    public final void attachAudio(MessageObject messageObject) {
        TLRPC.Document document;
        if (messageObject == null || (document = messageObject.getDocument()) == null) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
            richEditorHistory.commit();
        }
        TL_iv.pageBlockAudio pageblockaudio = new TL_iv.pageBlockAudio();
        final BlockRow blockRow = new BlockRow(pageblockaudio, 0, 0);
        MediaUploadState mediaUploadState = new MediaUploadState();
        blockRow.media = mediaUploadState;
        mediaUploadState.isAudio = true;
        long j = document.id;
        boolean z = j == 0 || document.dc_id == 0 || document.access_hash == 0;
        if (z) {
            TLRPC.Message message = messageObject.messageOwner;
            String str = message != null ? message.attachPath : null;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            MediaUploadState mediaUploadState2 = blockRow.media;
            mediaUploadState2.audioDisplayDocument = document;
            mediaUploadState2.localPath = str;
            mediaUploadState2.state = 1;
            mediaUploadState2.progress = 0.0f;
        } else {
            mediaUploadState.document = document;
            mediaUploadState.audioDisplayDocument = document;
            mediaUploadState.state = 2;
            pageblockaudio.audio_id = j;
        }
        insertPreparedRow(blockRow);
        if (z) {
            final MediaUploadState mediaUploadState3 = blockRow.media;
            String str2 = mediaUploadState3.localPath;
            IdentityHashMap identityHashMap = this.uploaders;
            RichMediaUploader richMediaUploader = (RichMediaUploader) identityHashMap.remove(mediaUploadState3);
            if (richMediaUploader != null) {
                richMediaUploader.cancel();
            }
            RichMediaUploader richMediaUploader2 = new RichMediaUploader(this.currentAccount, str2, document, (AnonymousClass17) new RichMediaUploader.Listener() {
                @Override
                public final void onAudioUploaded(TLRPC.Document document2) {
                    MediaUploadState mediaUploadState4 = mediaUploadState3;
                    mediaUploadState4.document = document2;
                    mediaUploadState4.audioDisplayDocument = document2;
                    mediaUploadState4.state = 2;
                    TL_iv.PageBlock pageBlock = blockRow.block;
                    if (pageBlock instanceof TL_iv.pageBlockAudio) {
                        ((TL_iv.pageBlockAudio) pageBlock).audio_id = document2.id;
                    }
                    RichEditorListView richEditorListView = this;
                    richEditorListView.uploaders.remove(mediaUploadState4);
                    richEditorListView.adapter.update(false);
                    richEditorListView.delegate.onContentChanged();
                }

                @Override
                public final void onDocumentUploaded(TLRPC.Document document2) {
                }

                @Override
                public final void onError() {
                    MediaUploadState mediaUploadState4 = mediaUploadState3;
                    mediaUploadState4.state = 3;
                    RichEditorListView richEditorListView = this;
                    richEditorListView.uploaders.remove(mediaUploadState4);
                    int iIndexOf = richEditorListView.rows.indexOf(blockRow);
                    if (iIndexOf >= 0) {
                        richEditorListView.rows.remove(iIndexOf);
                        richEditorListView.adapter.update(true);
                    }
                    richEditorListView.delegate.onContentChanged();
                }

                @Override
                public final void onPhotoUploaded(TLRPC.Photo photo) {
                }

                @Override
                public final void onProgress(float f) {
                    mediaUploadState3.progress = f;
                    BlockRow blockRow2 = blockRow;
                    RichEditorListView richEditorListView = this;
                    View viewFindViewByItemObject = richEditorListView.findViewByItemObject(blockRow2);
                    if (viewFindViewByItemObject instanceof RichAudioCell) {
                        ((RichAudioCell) viewFindViewByItemObject).updateButtonState(false);
                        viewFindViewByItemObject.invalidate();
                    }
                    richEditorListView.delegate.onContentChanged();
                }

                @Override
                public final void onVideoUploaded(TLRPC.Document document2) {
                }

                @Override
                public final void onWidthHeightResolved(int i, int i2) {
                }
            });
            identityHashMap.put(mediaUploadState3, richMediaUploader2);
            richMediaUploader2.start();
        }
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        this.delegate.onContentChanged();
    }

    public final void attachDocument(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            TLRPC.TL_document tL_document = new TLRPC.TL_document();
            tL_document.id = 0L;
            tL_document.dc_id = 0;
            tL_document.size = file.length();
            String name = file.getName();
            int iLastIndexOf = name.lastIndexOf(46);
            String mimeTypeFromExtension = (iLastIndexOf < 0 || (i = iLastIndexOf + 1) >= name.length()) ? null : MimeTypeMap.getSingleton().getMimeTypeFromExtension(name.substring(i).toLowerCase());
            if (TextUtils.isEmpty(mimeTypeFromExtension)) {
                mimeTypeFromExtension = "application/octet-stream";
            }
            tL_document.mime_type = mimeTypeFromExtension;
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = name;
            tL_document.attributes.add(tL_documentAttributeFilename);
            attachDocument(tL_document, str);
        }
    }

    public final void attachExternalMedia(Uri uri) {
        if (uri == null) {
            return;
        }
        BlockRow blockRow = this.pendingMediaRow;
        String type = null;
        this.pendingMediaRow = null;
        Context context = getContext();
        if (context == null) {
            return;
        }
        try {
            type = context.getContentResolver().getType(uri);
        } catch (Exception e) {
            FileLog.e(e);
        }
        String str = type;
        boolean zStartsWith = str != null ? str.startsWith("video") : uri.toString().contains("video");
        int i = this.lastExternalImageId;
        this.lastExternalImageId = i - 1;
        Utilities.globalQueue.postRunnable(new PhotoPickerActivity$$ExternalSyntheticLambda9(this, uri, zStartsWith, str, i, blockRow));
    }

    public final void attachMedia(MediaController.PhotoEntry photoEntry) {
        if (photoEntry == null) {
            return;
        }
        String str = photoEntry.imagePath;
        if (str == null) {
            str = photoEntry.path;
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
            richEditorHistory.commit();
        }
        boolean zHasAnimatedMediaEntities = RichMediaConverter.hasAnimatedMediaEntities(photoEntry);
        BlockRow blockRow = new BlockRow((photoEntry.isVideo || zHasAnimatedMediaEntities) ? new TL_iv.pageBlockVideo() : new TL_iv.pageBlockPhoto(), 0, 0);
        blockRow.media = newUploadingMedia(photoEntry, str2);
        insertPreparedRow(blockRow);
        if (zHasAnimatedMediaEntities) {
            startMediaConvertAndUpload(blockRow, blockRow.media, photoEntry);
        } else {
            MediaUploadState mediaUploadState = blockRow.media;
            boolean z = photoEntry.isVideo;
            int i = photoEntry.width;
            int i2 = photoEntry.height;
            int i3 = photoEntry.duration;
            IdentityHashMap identityHashMap = this.uploaders;
            RichMediaUploader richMediaUploader = (RichMediaUploader) identityHashMap.remove(mediaUploadState);
            if (richMediaUploader != null) {
                richMediaUploader.cancel();
            }
            RichMediaUploader richMediaUploader2 = new RichMediaUploader(this.currentAccount, str2, z, i, i2, i3, new AnonymousClass19(blockRow, mediaUploadState, this));
            identityHashMap.put(mediaUploadState, richMediaUploader2);
            richMediaUploader2.start();
        }
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        this.delegate.onContentChanged();
    }

    public final void beginCellSelection(RichTableCell richTableCell) {
        RichTableCell richTableCell2 = this.activeCellSelectionTable;
        if (richTableCell2 != null && richTableCell2 != richTableCell) {
            LinkedHashSet linkedHashSet = richTableCell2.selectedCells;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                richTableCell2.grid.invalidate();
                richTableCell2.notifyCellSelectionChanged();
            }
        }
        this.activeCellSelectionTable = richTableCell;
        this.clearDraggedMultiCellSelectionOnMenuDismiss = false;
        this.dotSelectedCol = -1;
        this.dotSelectedRow = -1;
        richTableCell.setCellSelectionListener(this.cellSelectionListener);
        AnonymousClass1 anonymousClass1 = this.textSelectionHelper;
        if (anonymousClass1 != null && anonymousClass1.isInSelectionMode()) {
            anonymousClass1.clear(false);
        }
        setEditTextsLocked(true);
    }

    public final AnonymousClass4 beginSelectionEdit() {
        int i;
        int i2;
        AnonymousClass1 anonymousClass1 = this.textSelectionHelper;
        if (anonymousClass1 == null || !anonymousClass1.isInSelectionMode() || isQuoteAuthorSelection()) {
            return null;
        }
        ArrayList arrayList = this.rows;
        int iIndexOf = arrayList.indexOf(rowForCell(anonymousClass1.startViewPosition));
        int iIndexOf2 = arrayList.indexOf(rowForCell(anonymousClass1.endViewPosition));
        if (iIndexOf < 0 || iIndexOf2 < 0) {
            return null;
        }
        if (iIndexOf > iIndexOf2) {
            i2 = iIndexOf;
            i = iIndexOf2;
        } else {
            i = iIndexOf;
            i2 = iIndexOf2;
        }
        for (int i3 = i; i3 <= i2; i3++) {
            BlockRow blockRow = (BlockRow) arrayList.get(i3);
            if (blockRow.detailsEnd || isDetailsHeader(blockRow)) {
                return null;
            }
        }
        return new AnonymousClass4(i, i2, anonymousClass1.startViewOffset, anonymousClass1.endViewOffset);
    }

    public final int blockTextLength(int i) {
        RichEditText richEditTextDetailsEditText = detailsEditText(i);
        if (richEditTextDetailsEditText != null) {
            return richEditTextDetailsEditText.length();
        }
        RichTextCell richTextCellCellAt = cellAt(i);
        if (richTextCellCellAt != null) {
            return richTextCellCellAt.getEditText().length();
        }
        BlockRow blockRowRowForCell = rowForCell(i);
        if (blockRowRowForCell == null) {
            return 0;
        }
        return RichTextCell.readPlainText(blockRowRowForCell.block).length();
    }

    public final TL_iv.PageBlock buildListBlock(int i, int i2, int i3, int i4, boolean z, int[] iArr) {
        int i5;
        boolean zIsNonText;
        TL_iv.RichText textempty;
        int i6;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList<TL_iv.PageBlock> arrayList3;
        BlockRow blockRow;
        int i7;
        boolean z2;
        TL_iv.PageBlock pageBlockBuildListBlock;
        TL_iv.PageBlock pageBlock;
        TL_iv.pageBlockOrderedList pageblockorderedlist = z ? new TL_iv.pageBlockOrderedList() : null;
        TL_iv.pageBlockList pageblocklist = z ? null : new TL_iv.pageBlockList();
        int i8 = i;
        int i9 = 1;
        while (i8 < i3) {
            RichEditorListView richEditorListView = this;
            ArrayList arrayList4 = richEditorListView.rows;
            BlockRow blockRow2 = (BlockRow) arrayList4.get(i8);
            if (blockRow2.quoteIds.size() > i4 || (i5 = blockRow2.level) < i2) {
                break;
            }
            if (i5 == i2) {
                if ((blockRow2.num > 0) != z) {
                    break;
                }
                if (i5 > i2) {
                    break;
                    break;
                }
                zIsNonText = isNonText(blockRow2.block);
                if (zIsNonText) {
                    textempty = null;
                } else {
                    pageBlock = blockRow2.block;
                    if (pageBlock == null) {
                        textempty = null;
                    } else {
                        textempty = pageBlock.text;
                    }
                    if (textempty == null) {
                        textempty = new TL_iv.textEmpty();
                    }
                }
                i6 = i8 + 1;
                arrayList = new ArrayList();
                if (zIsNonText) {
                    emitLeafBlock(blockRow2, arrayList);
                }
                while (true) {
                    if (i6 < i3) {
                        blockRow = (BlockRow) arrayList4.get(i6);
                        if (blockRow.quoteIds.size() > i4) {
                            blockRow2 = blockRow2;
                        } else {
                            blockRow2 = blockRow2;
                            i7 = blockRow.level;
                            if (i7 >= i2) {
                                if (i7 == i2) {
                                    if (blockRow.num > 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    ArrayList arrayList5 = arrayList;
                                    int[] iArr2 = {i6};
                                    RichEditorListView richEditorListView2 = richEditorListView;
                                    i6 = i6;
                                    arrayList2 = arrayList5;
                                    pageBlockBuildListBlock = richEditorListView2.buildListBlock(i6, i7, i3, i4, z2, iArr2);
                                    if (pageBlockBuildListBlock != null) {
                                        arrayList2.add(pageBlockBuildListBlock);
                                    }
                                    i6 = iArr2[0];
                                    if (i6 <= i6) {
                                        richEditorListView = this;
                                        i3 = i3;
                                        i4 = i4;
                                        textempty = textempty;
                                        arrayList = arrayList2;
                                    }
                                } else if (!isNonText(blockRow.block)) {
                                    emitLeafBlock(blockRow, arrayList);
                                    i6++;
                                }
                            }
                        }
                        textempty = textempty;
                        arrayList2 = arrayList;
                    } else {
                        i6 = i6;
                        blockRow2 = blockRow2;
                        textempty = textempty;
                        arrayList2 = arrayList;
                    }
                    if (zIsNonText) {
                        arrayList3 = new ArrayList<>();
                        if (!zIsNonText) {
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            pageblockparagraph.text = textempty;
                            arrayList3.add(pageblockparagraph);
                        }
                        arrayList3.addAll(arrayList2);
                        if (!arrayList3.isEmpty()) {
                            if (z) {
                                TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks = new TL_iv.TL_pageListOrderedItemBlocks();
                                tL_pageListOrderedItemBlocks.num = RendererCapabilities.CC.m(i9, ".");
                                tL_pageListOrderedItemBlocks.blocks = arrayList3;
                                tL_pageListOrderedItemBlocks.checkbox = blockRow2.checkbox;
                                tL_pageListOrderedItemBlocks.checked = blockRow2.checked;
                                pageblockorderedlist.items.add(tL_pageListOrderedItemBlocks);
                            } else {
                                TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks = new TL_iv.TL_pageListItemBlocks();
                                tL_pageListItemBlocks.blocks = arrayList3;
                                tL_pageListItemBlocks.checkbox = blockRow2.checkbox;
                                tL_pageListItemBlocks.checked = blockRow2.checked;
                                pageblocklist.items.add(tL_pageListItemBlocks);
                            }
                            i9++;
                        }
                    } else {
                        arrayList3 = new ArrayList<>();
                        if (!zIsNonText) {
                            TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                            pageblockparagraph2.text = textempty;
                            arrayList3.add(pageblockparagraph2);
                        }
                        arrayList3.addAll(arrayList2);
                        if (!arrayList3.isEmpty()) {
                            if (z) {
                                TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks2 = new TL_iv.TL_pageListOrderedItemBlocks();
                                tL_pageListOrderedItemBlocks2.num = RendererCapabilities.CC.m(i9, ".");
                                tL_pageListOrderedItemBlocks2.blocks = arrayList3;
                                tL_pageListOrderedItemBlocks2.checkbox = blockRow2.checkbox;
                                tL_pageListOrderedItemBlocks2.checked = blockRow2.checked;
                                pageblockorderedlist.items.add(tL_pageListOrderedItemBlocks2);
                            } else {
                                TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks2 = new TL_iv.TL_pageListItemBlocks();
                                tL_pageListItemBlocks2.blocks = arrayList3;
                                tL_pageListItemBlocks2.checkbox = blockRow2.checkbox;
                                tL_pageListItemBlocks2.checked = blockRow2.checked;
                                pageblocklist.items.add(tL_pageListItemBlocks2);
                            }
                            i9++;
                        }
                    }
                    i8 = i6;
                }
            } else {
                if (i5 > i2) {
                    break;
                }
                zIsNonText = isNonText(blockRow2.block);
                if (zIsNonText) {
                    pageBlock = blockRow2.block;
                    if (pageBlock == null) {
                        textempty = null;
                    } else {
                        textempty = pageBlock.text;
                    }
                    if (textempty == null) {
                        textempty = new TL_iv.textEmpty();
                    }
                } else {
                    textempty = null;
                }
                i6 = i8 + 1;
                arrayList = new ArrayList();
                if (zIsNonText) {
                    emitLeafBlock(blockRow2, arrayList);
                }
                while (true) {
                    if (i6 < i3) {
                        blockRow = (BlockRow) arrayList4.get(i6);
                        if (blockRow.quoteIds.size() > i4) {
                            blockRow2 = blockRow2;
                        } else {
                            blockRow2 = blockRow2;
                            i7 = blockRow.level;
                            if (i7 >= i2) {
                                if (i7 == i2) {
                                    if (blockRow.num > 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    ArrayList arrayList6 = arrayList;
                                    int[] iArr3 = {i6};
                                    RichEditorListView richEditorListView3 = richEditorListView;
                                    i6 = i6;
                                    arrayList2 = arrayList6;
                                    pageBlockBuildListBlock = richEditorListView3.buildListBlock(i6, i7, i3, i4, z2, iArr3);
                                    if (pageBlockBuildListBlock != null) {
                                        arrayList2.add(pageBlockBuildListBlock);
                                    }
                                    i6 = iArr3[0];
                                    if (i6 <= i6) {
                                        richEditorListView = this;
                                        i3 = i3;
                                        i4 = i4;
                                        textempty = textempty;
                                        arrayList = arrayList2;
                                    }
                                } else if (!isNonText(blockRow.block)) {
                                    emitLeafBlock(blockRow, arrayList);
                                    i6++;
                                }
                            }
                        }
                        textempty = textempty;
                        arrayList2 = arrayList;
                    } else {
                        i6 = i6;
                        blockRow2 = blockRow2;
                        textempty = textempty;
                        arrayList2 = arrayList;
                    }
                    if (zIsNonText || !arrayList2.isEmpty()) {
                        arrayList3 = new ArrayList<>();
                        if (!zIsNonText) {
                            TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                            pageblockparagraph3.text = textempty;
                            arrayList3.add(pageblockparagraph3);
                        }
                        arrayList3.addAll(arrayList2);
                        if (!arrayList3.isEmpty()) {
                            if (z) {
                                TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks3 = new TL_iv.TL_pageListOrderedItemBlocks();
                                tL_pageListOrderedItemBlocks3.num = RendererCapabilities.CC.m(i9, ".");
                                tL_pageListOrderedItemBlocks3.blocks = arrayList3;
                                tL_pageListOrderedItemBlocks3.checkbox = blockRow2.checkbox;
                                tL_pageListOrderedItemBlocks3.checked = blockRow2.checked;
                                pageblockorderedlist.items.add(tL_pageListOrderedItemBlocks3);
                            } else {
                                TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks3 = new TL_iv.TL_pageListItemBlocks();
                                tL_pageListItemBlocks3.blocks = arrayList3;
                                tL_pageListItemBlocks3.checkbox = blockRow2.checkbox;
                                tL_pageListItemBlocks3.checked = blockRow2.checked;
                                pageblocklist.items.add(tL_pageListItemBlocks3);
                            }
                        }
                        i8 = i6;
                    } else if (z) {
                        TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = new TL_iv.TL_pageListOrderedItemText();
                        tL_pageListOrderedItemText.num = RendererCapabilities.CC.m(i9, ".");
                        tL_pageListOrderedItemText.text = textempty;
                        tL_pageListOrderedItemText.checkbox = blockRow2.checkbox;
                        tL_pageListOrderedItemText.checked = blockRow2.checked;
                        pageblockorderedlist.items.add(tL_pageListOrderedItemText);
                    } else {
                        TL_iv.TL_pageListItemText tL_pageListItemText = new TL_iv.TL_pageListItemText();
                        tL_pageListItemText.text = textempty;
                        tL_pageListItemText.checkbox = blockRow2.checkbox;
                        tL_pageListItemText.checked = blockRow2.checked;
                        pageblocklist.items.add(tL_pageListItemText);
                    }
                    i9++;
                    i8 = i6;
                }
            }
        }
        iArr[0] = i8;
        if (z) {
            if (!pageblockorderedlist.items.isEmpty()) {
                return pageblockorderedlist;
            }
        } else if (!pageblocklist.items.isEmpty()) {
            return pageblocklist;
        }
        return null;
    }

    public final boolean canCreateInlineButtonOnSelection() {
        RichEditText editText;
        int length;
        int iM;
        int iM2;
        AnonymousClass1 anonymousClass1 = this.textSelectionHelper;
        if (anonymousClass1 == null || !anonymousClass1.isInSelectionMode() || anonymousClass1.startViewPosition != anonymousClass1.endViewPosition) {
            return false;
        }
        if (isTableSelection()) {
            int i = anonymousClass1.startViewPosition;
            int i2 = anonymousClass1.startViewChildPosition;
            if (i2 != anonymousClass1.endViewChildPosition) {
                return false;
            }
            editText = tableEditText(i, i2);
        } else if (isDetailsSelection()) {
            editText = detailsEditText(anonymousClass1.startViewPosition);
        } else if (isCaptionSelection()) {
            editText = captionEditText(anonymousClass1.startViewPosition);
        } else if (isQuoteAuthorSelection()) {
            editText = quoteAuthorEditText(anonymousClass1.startViewPosition);
        } else {
            RichTextCell richTextCellSingleSelectionCell = singleSelectionCell();
            if (richTextCellSingleSelectionCell == null) {
                return false;
            }
            editText = richTextCellSingleSelectionCell.getEditText();
        }
        if (editText == null || (iM = zzdv.m(anonymousClass1.startViewOffset, anonymousClass1.endViewOffset, (length = editText.length()))) >= (iM2 = zzdu.m(anonymousClass1.startViewOffset, anonymousClass1.endViewOffset, length))) {
            return false;
        }
        Editable text = editText.getText();
        if (text != null && iM < iM2) {
            for (RichInlineButtonSpan richInlineButtonSpan : (RichInlineButtonSpan[]) text.getSpans(iM, iM2, RichInlineButtonSpan.class)) {
                if (text.getSpanStart(richInlineButtonSpan) < iM2 && text.getSpanEnd(richInlineButtonSpan) > iM) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean canIndentTarget(BlockRow blockRow) {
        ArrayList arrayList;
        int iIndexOf;
        if (blockRow != null && (iIndexOf = (arrayList = this.rows).indexOf(blockRow)) >= 0 && iIndexOf >= 0 && iIndexOf < arrayList.size()) {
            BlockRow blockRow2 = (BlockRow) arrayList.get(iIndexOf);
            if (blockRow2.level == 0) {
                TL_iv.PageBlock pageBlock = blockRow2.block;
                if ((pageBlock instanceof TL_iv.pageBlockParagraph) || isHeading(pageBlock) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockFooter) || (iIndexOf > 0 && iIndexOf < arrayList.size() && isNonText(((BlockRow) arrayList.get(iIndexOf)).block) && ((BlockRow) arrayList.get(iIndexOf - 1)).level >= 1)) {
                    if (indentKeepsDepth(iIndexOf)) {
                        return true;
                    }
                }
            } else if (iIndexOf > 0 && ((BlockRow) arrayList.get(iIndexOf - 1)).level >= blockRow2.level) {
                if (indentKeepsDepth(iIndexOf)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final RichEditText captionEditText(int i) {
        KeyEvent.Callback callbackSelectableAt = selectableAt(i);
        if (callbackSelectableAt instanceof RichCaptionHost) {
            return ((RichCaptionHost) callbackSelectableAt).getCaptionEditText();
        }
        return null;
    }

    public final void cascadeOutdent(int i) {
        BlockRow blockRow;
        int i2;
        ArrayList arrayList = this.rows;
        BlockRow blockRow2 = (BlockRow) arrayList.get(i);
        int i3 = blockRow2.level;
        if (i3 <= 0) {
            return;
        }
        int i4 = i3 - 1;
        blockRow2.level = i4;
        if (i4 == 0) {
            blockRow2.num = 0;
            blockRow2.checkbox = false;
            blockRow2.checked = false;
        }
        while (true) {
            i++;
            if (i >= arrayList.size() || (i2 = (blockRow = (BlockRow) arrayList.get(i)).level) <= i3) {
                return;
            } else {
                blockRow.level = i2 - 1;
            }
        }
    }

    public final RichTextCell cellAt(int i) {
        if (i < 0) {
            return null;
        }
        View viewFindViewByPosition = this.layoutManager.findViewByPosition(i);
        if (viewFindViewByPosition instanceof RichTextCell) {
            return (RichTextCell) viewFindViewByPosition;
        }
        return null;
    }

    public final boolean collapseSingleBlockQuotes() {
        ArrayList arrayList;
        HashMap map = new HashMap();
        int i = 0;
        while (true) {
            arrayList = this.rows;
            if (i >= arrayList.size()) {
                break;
            }
            BlockRow blockRow = (BlockRow) arrayList.get(i);
            if (!blockRow.detailsEnd) {
                int i2 = 0;
                while (true) {
                    ArrayList arrayList2 = blockRow.quoteIds;
                    if (i2 < arrayList2.size()) {
                        Map.EL.merge(map, (Long) arrayList2.get(i2), 1, new RichEditorListView$$ExternalSyntheticLambda66());
                        i2++;
                    }
                }
            }
            i++;
        }
        boolean z = false;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            BlockRow blockRow2 = (BlockRow) arrayList.get(i3);
            if (blockRow2.quoteIds.size() == 1 && (blockRow2.block instanceof TL_iv.pageBlockParagraph)) {
                ArrayList arrayList3 = blockRow2.quoteIds;
                Long l = (Long) arrayList3.get(0);
                l.getClass();
                Integer num = (Integer) map.get(l);
                if (num != null && num.intValue() == 1) {
                    TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                    TL_iv.RichText textempty = blockRow2.block.text;
                    if (textempty == null) {
                        textempty = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.text = textempty;
                    TL_iv.RichText textempty2 = (TL_iv.RichText) this.quoteAuthors.remove(l);
                    if (textempty2 == null) {
                        textempty2 = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.caption = textempty2;
                    blockRow2.block = pageblockblockquote;
                    arrayList3.clear();
                    z = true;
                }
            }
        }
        return z;
    }

    public final ArrayList collectDocuments() {
        TLRPC.Document document;
        MediaUploadState mediaUploadState;
        TLRPC.Document document2;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.rows;
            if (i >= arrayList2.size()) {
                return arrayList;
            }
            BlockRow blockRow = (BlockRow) arrayList2.get(i);
            if ((blockRow.block instanceof TL_iv.pageBlockDocument) && (mediaUploadState = blockRow.media) != null && mediaUploadState.isReady() && (document2 = blockRow.media.document) != null) {
                ((TL_iv.pageBlockDocument) blockRow.block).document_id = document2.id;
            }
            for (MediaUploadState mediaUploadState2 : mediasOf(blockRow)) {
                if (mediaUploadState2.isReady() && (document = mediaUploadState2.document) != null) {
                    long j = document.id;
                    if (j != 0 && document.access_hash != 0 && hashSet.add(Long.valueOf(j))) {
                        arrayList.add(mediaUploadState2.document);
                    }
                }
            }
            i++;
        }
    }

    public final ArrayList collectMediaDocuments(int i, int i2) {
        TLRPC.Document document;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i <= i2) {
            ArrayList arrayList2 = this.rows;
            if (i >= arrayList2.size()) {
                break;
            }
            for (MediaUploadState mediaUploadState : mediasOf((BlockRow) arrayList2.get(i))) {
                if (mediaUploadState.isReady() && (document = mediaUploadState.document) != null && hashSet.add(Long.valueOf(document.id))) {
                    arrayList.add(mediaUploadState.document);
                }
            }
            i++;
        }
        return arrayList;
    }

    public final ArrayList collectMediaPhotos(int i, int i2) {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i <= i2) {
            ArrayList arrayList2 = this.rows;
            if (i >= arrayList2.size()) {
                break;
            }
            for (MediaUploadState mediaUploadState : mediasOf((BlockRow) arrayList2.get(i))) {
                if (mediaUploadState.isReady() && (photo = mediaUploadState.photo) != null && hashSet.add(Long.valueOf(photo.id))) {
                    arrayList.add(mediaUploadState.photo);
                }
            }
            i++;
        }
        return arrayList;
    }

    public final ArrayList collectPhotos() {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.rows;
            if (i >= arrayList2.size()) {
                return arrayList;
            }
            for (MediaUploadState mediaUploadState : mediasOf((BlockRow) arrayList2.get(i))) {
                if (mediaUploadState.isReady() && (photo = mediaUploadState.photo) != null && hashSet.add(Long.valueOf(photo.id))) {
                    arrayList.add(mediaUploadState.photo);
                }
            }
            i++;
        }
    }

    public final void convertToSimple() {
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.record();
        }
        ArrayList arrayList = this.rows;
        SpannableStringBuilder spannableStringBuilderRowsToSimpleMessage = RichMessageConvert.rowsToSimpleMessage(arrayList);
        destroy();
        arrayList.clear();
        HashMap map = this.quoteAuthors;
        map.clear();
        this.loadedRichMessage = null;
        flattenBlocks(arrayList, RichMessageConvert.blocksFromCharSequence(spannableStringBuilderRowsToSimpleMessage), map);
        this.adapter.update(false);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        Delegate delegate = this.delegate;
        if (delegate != null) {
            delegate.onContentChanged();
            delegate.onHistoryChanged();
        }
    }

    public final void deleteDetails(BlockRow blockRow) {
        ArrayList arrayList = this.rows;
        int iIndexOf = arrayList.indexOf(blockRow);
        if (iIndexOf < 0 || !isDetailsHeader(blockRow)) {
            return;
        }
        int iMatchingDetailsEnd = matchingDetailsEnd(iIndexOf);
        if (iMatchingDetailsEnd >= arrayList.size()) {
            iMatchingDetailsEnd = arrayList.size() - 1;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
            richEditorHistory.commit();
        }
        while (iMatchingDetailsEnd >= iIndexOf) {
            arrayList.remove(iMatchingDetailsEnd);
            iMatchingDetailsEnd--;
        }
        BlockRow blockRow2 = null;
        BlockRow blockRow3 = iIndexOf > 0 ? (BlockRow) arrayList.get(iIndexOf - 1) : null;
        if (blockRow3 != null && !blockRow3.detailsEnd && !isDetailsHeader(blockRow3) && !isNonText(blockRow3.block)) {
            blockRow2 = blockRow3;
        }
        if (arrayList.isEmpty()) {
            blockRow2 = new BlockRow(new TL_iv.pageBlockParagraph(), 0, 0);
            arrayList.add(blockRow2);
        }
        this.adapter.update(false);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        if (blockRow2 != null) {
            post(new RichEditorListView$$ExternalSyntheticLambda2(this, blockRow2, 22));
        }
    }

    public final boolean deselectIfAny() {
        AnonymousClass1 anonymousClass1 = this.textSelectionHelper;
        if (anonymousClass1 != null && anonymousClass1.isInSelectionMode()) {
            anonymousClass1.clear(false);
            return true;
        }
        if (this.activeCellSelectionTable == null) {
            return false;
        }
        exitCellSelectionMode();
        return true;
    }

    public final void destroy() {
        AnonymousClass1 anonymousClass1 = this.textSelectionHelper;
        if (anonymousClass1 != null) {
            anonymousClass1.clear(true);
        }
        exitCellSelectionMode();
        hideEditTextActionModes();
        IdentityHashMap identityHashMap = this.uploaders;
        Iterator it = identityHashMap.values().iterator();
        while (it.hasNext()) {
            ((RichMediaUploader) it.next()).cancel();
        }
        identityHashMap.clear();
        IdentityHashMap identityHashMap2 = this.converters;
        Iterator it2 = identityHashMap2.values().iterator();
        while (it2.hasNext()) {
            ((RichMediaConverter) it2.next()).cancel();
        }
        identityHashMap2.clear();
    }

    public final int detailsDepthBefore(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            ArrayList arrayList = this.rows;
            if (i3 >= arrayList.size()) {
                break;
            }
            if (isDetailsHeader((BlockRow) arrayList.get(i3))) {
                i2++;
            } else if (((BlockRow) arrayList.get(i3)).detailsEnd) {
                i2--;
            }
        }
        return i2;
    }

    public final RichEditText detailsEditText(int i) {
        if (!isDetailsHeader(rowForCell(i))) {
            return null;
        }
        View viewSelectableAt = selectableAt(i);
        if (viewSelectableAt instanceof RichDetailsCell) {
            return ((RichDetailsCell) viewSelectableAt).getEditText();
        }
        return null;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        Long l;
        BlockRow blockRow;
        View view;
        int i;
        ArrayList arrayList2;
        float f;
        int iM;
        int iM2;
        int childCount = getChildCount();
        if (childCount != 0) {
            int i2 = 0;
            int size = 0;
            while (true) {
                arrayList = this.itemRows;
                if (i2 >= childCount) {
                    break;
                }
                int childAdapterPosition = RecyclerView.getChildAdapterPosition(getChildAt(i2));
                BlockRow blockRow2 = (childAdapterPosition < 0 || childAdapterPosition >= arrayList.size()) ? null : (BlockRow) arrayList.get(childAdapterPosition);
                if (blockRow2 != null) {
                    ArrayList arrayList3 = blockRow2.quoteIds;
                    if (arrayList3.size() > size) {
                        size = arrayList3.size();
                    }
                }
                i2++;
            }
            if (size != 0) {
                if (this.quoteLine == null) {
                    ReplyMessageLine replyMessageLine = new ReplyMessageLine(this);
                    this.quoteLine = replyMessageLine;
                    replyMessageLine.check(null, null, null, this.resourcesProvider, 1);
                    ReplyMessageLine replyMessageLine2 = this.quoteLine;
                    Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
                    boolean zIsDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.currentTheme.isDark();
                    int color = Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider);
                    replyMessageLine2.reversedOut = false;
                    replyMessageLine2.hasColor3 = false;
                    replyMessageLine2.hasColor2 = false;
                    replyMessageLine2.color3 = color;
                    replyMessageLine2.color2 = color;
                    replyMessageLine2.color1 = color;
                    replyMessageLine2.backgroundColor = Theme.multAlpha(zIsDark ? 0.12f : 0.1f, color);
                    replyMessageLine2.emojiColor = color;
                }
                int i3 = 0;
                while (i3 < size) {
                    float f2 = 0.0f;
                    long jLongValue = 0;
                    float f3 = 0.0f;
                    int i4 = 0;
                    boolean z = false;
                    BlockRow blockRow3 = null;
                    BlockRow blockRow4 = null;
                    float fMin = 1.0f;
                    while (i4 <= childCount) {
                        if (i4 < childCount) {
                            View childAt = getChildAt(i4);
                            int childAdapterPosition2 = RecyclerView.getChildAdapterPosition(childAt);
                            blockRow = (childAdapterPosition2 < 0 || childAdapterPosition2 >= arrayList.size()) ? null : (BlockRow) arrayList.get(childAdapterPosition2);
                            if (blockRow != null) {
                                ArrayList arrayList4 = blockRow.quoteIds;
                                if (i3 < arrayList4.size()) {
                                    l = (Long) arrayList4.get(i3);
                                    view = childAt;
                                } else {
                                    view = childAt;
                                    l = null;
                                }
                            } else {
                                view = childAt;
                                l = null;
                            }
                        } else {
                            l = null;
                            blockRow = null;
                            view = null;
                        }
                        if (!z || (l != null && l.longValue() == jLongValue)) {
                            childCount = childCount;
                            l = l;
                            i3 = i3;
                            i = size;
                            arrayList2 = arrayList;
                            f = fMin;
                        } else {
                            if (blockRow3 == null) {
                                iM = AndroidUtilities.dp(2.0f);
                            } else {
                                iM = RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(Math.max(0, i3 - (blockRow3.quoteIds.size() - blockRow3.quoteTopEdge)), 16.0f, AndroidUtilities.dp(2.0f));
                            }
                            if (blockRow4 == null) {
                                iM2 = AndroidUtilities.dp(2.0f);
                            } else {
                                iM2 = RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(Math.max(0, i3 - (blockRow4.quoteIds.size() - blockRow4.quoteBottomEdge)), 16.0f, AndroidUtilities.dp(2.0f));
                            }
                            if (f2 - f3 <= AndroidUtilities.dp(4.0f)) {
                                i = size;
                                arrayList2 = arrayList;
                                f = fMin;
                            } else {
                                int iDp = AndroidUtilities.dp(16.0f) * i3;
                                int iDp2 = AndroidUtilities.dp(16.0f) + iDp;
                                i = size;
                                arrayList2 = arrayList;
                                int iM3 = RichMessageLayout$$ExternalSyntheticOutline2.m(getWidth(), 16.0f, iDp);
                                if (iM3 - iDp2 <= AndroidUtilities.dp(8.0f)) {
                                    f = fMin;
                                } else {
                                    float fFloor = (float) Math.floor(SharedConfig.bubbleRadius / 3.0f);
                                    RectF rectF = AndroidUtilities.rectTmp;
                                    rectF.set(iDp2, iM + f3, iM3, f2 - iM2);
                                    this.quoteLine.drawBackground(canvas, rectF, fFloor, fFloor, fFloor, fMin, false, false);
                                    f = fMin;
                                    this.quoteLine.drawLine(canvas, rectF, f);
                                }
                            }
                            z = false;
                        }
                        if (view == null || l == null) {
                            fMin = f;
                        } else {
                            if (!z) {
                                jLongValue = l.longValue();
                                z = true;
                                f3 = Float.MAX_VALUE;
                                f2 = -3.4028235E38f;
                                blockRow3 = blockRow;
                                f = 1.0f;
                            }
                            if (blockRow == null || blockRow != this.draggingRow) {
                                float y = view.getY();
                                float height = view.getHeight() + y;
                                if (y < f3) {
                                    f3 = y;
                                }
                                if (height > f2) {
                                    f2 = height;
                                }
                                fMin = Math.min(f, view.getAlpha());
                            } else {
                                fMin = f;
                            }
                            blockRow4 = blockRow;
                        }
                        i4++;
                        childCount = childCount;
                        i3 = i3;
                        size = i;
                        arrayList = arrayList2;
                    }
                    i3++;
                    size = size;
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void exitCellSelectionMode() {
        if (this.cellSelectionDragActive) {
            requestDisallowInterceptTouchEvent(false);
        }
        this.cellSelectionDragActive = false;
        this.clearDraggedMultiCellSelectionOnMenuDismiss = false;
        this.cellSelectionDragAnchor = null;
        this.cellSelectionDragEnd = null;
        ItemOptions itemOptions = this.tableCellMenu;
        if (itemOptions != null) {
            this.tableCellMenu = null;
            itemOptions.dismiss();
        }
        RichTableCell richTableCell = this.activeCellSelectionTable;
        if (richTableCell != null) {
            LinkedHashSet linkedHashSet = richTableCell.selectedCells;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                richTableCell.grid.invalidate();
                richTableCell.notifyCellSelectionChanged();
            }
            this.activeCellSelectionTable = null;
        }
        this.dotSelectedCol = -1;
        this.dotSelectedRow = -1;
        setEditTextsLocked(false);
    }

    public final RichEditText findFocusedEditText() {
        View viewFindFocus = findFocus();
        if (viewFindFocus instanceof RichEditText) {
            return (RichEditText) viewFindFocus;
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof RichTextCell) {
                return ((RichTextCell) childAt).getEditText();
            }
        }
        return null;
    }

    public final BlockRow findFocusedRow() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof RichTextCell) {
                RichTextCell richTextCell = (RichTextCell) childAt;
                if (richTextCell.getEditText().isFocused() || (richTextCell.isAuthorVisible() && richTextCell.authorEditText.isFocused())) {
                    return richTextCell.getRow();
                }
            }
        }
        return null;
    }

    public final TLRPC.Document findLoadedDocument(long j) {
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document;
        if (j == 0) {
            return null;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.rows.size(); i2++) {
            for (MediaUploadState mediaUploadState : mediasOf((BlockRow) this.rows.get(i2))) {
                if (mediaUploadState != null && (document = mediaUploadState.document) != null && document.id == j) {
                    return document;
                }
            }
        }
        TL_iv.RichMessage richMessage = this.loadedRichMessage;
        if (richMessage != null && (arrayList = richMessage.documents) != null) {
            int size = arrayList.size();
            while (i < size) {
                TLRPC.Document document2 = arrayList.get(i);
                i++;
                TLRPC.Document document3 = document2;
                if (document3 != null && document3.id == j) {
                    return document3;
                }
            }
        }
        synchronized (RichMediaClipboard.class) {
            try {
                if (j != 0) {
                    return (TLRPC.Document) RichMediaClipboard.documents.get(Long.valueOf(j));
                }
                HashMap map = RichMediaClipboard.photos;
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int findNextNavigableRow(int i, int i2) {
        while (i >= 0) {
            ArrayList arrayList = this.rows;
            if (i >= arrayList.size()) {
                break;
            }
            BlockRow blockRow = (BlockRow) arrayList.get(i);
            if (!blockRow.detailsEnd) {
                int i3 = 0;
                int i4 = -1;
                for (int i5 = 0; i5 < i; i5++) {
                    BlockRow blockRow2 = (BlockRow) arrayList.get(i5);
                    if (isDetailsHeader(blockRow2)) {
                        i3++;
                        if (i4 == -1 && !((TL_iv.pageBlockDetails) blockRow2.block).open) {
                            i4 = i3;
                        }
                    } else if (blockRow2.detailsEnd) {
                        if (i4 != -1 && i3 == i4) {
                            i4 = -1;
                        }
                        i3--;
                    }
                }
                if (i4 != -1) {
                    continue;
                } else {
                    TL_iv.PageBlock pageBlock = blockRow.block;
                    if (!isNonText(pageBlock) || hasCaption(pageBlock) || (pageBlock instanceof TL_iv.pageBlockTable)) {
                        return i;
                    }
                }
            }
            i += i2;
        }
        return -1;
    }

    public final void finishEditTextActionModes() {
        for (int i = 0; i < getChildCount(); i++) {
            KeyEvent.Callback childAt = getChildAt(i);
            if (childAt instanceof RichTextCell) {
                RichTextCell richTextCell = (RichTextCell) childAt;
                richTextCell.editText.finishActionMode();
                richTextCell.authorEditText.finishActionMode();
            } else if (childAt instanceof RichCaptionHost) {
                ((RichCaptionHost) childAt).getCaptionEditText().finishActionMode();
            } else if (childAt instanceof RichDetailsCell) {
                ((RichDetailsCell) childAt).getEditText().finishActionMode();
            }
        }
    }

    public final ArrayList flattenRange(int i, int i2, int i3, boolean z) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        int i4 = i;
        while (i4 < i2) {
            ArrayList arrayList2 = this.rows;
            BlockRow blockRow = (BlockRow) arrayList2.get(i4);
            if (!blockRow.detailsEnd) {
                ArrayList arrayList3 = blockRow.quoteIds;
                if (arrayList3.size() > i3) {
                    Long l = (Long) arrayList3.get(i3);
                    long jLongValue = l.longValue();
                    int i5 = i4 + 1;
                    while (i5 < i2) {
                        BlockRow blockRow2 = (BlockRow) arrayList2.get(i5);
                        if (blockRow2.quoteIds.size() <= i3 || ((Long) blockRow2.quoteIds.get(i3)).longValue() != jLongValue) {
                            break;
                        }
                        i5++;
                    }
                    ArrayList<TL_iv.PageBlock> arrayListFlattenRange = flattenRange(i4, i5, i3 + 1, true);
                    if (arrayListFlattenRange.isEmpty()) {
                        obj = null;
                    } else {
                        TL_iv.RichText textempty = (TL_iv.RichText) this.quoteAuthors.get(l);
                        if (textempty == null) {
                            textempty = new TL_iv.textEmpty();
                        }
                        if (arrayListFlattenRange.size() == 1 && (arrayListFlattenRange.get(0) instanceof TL_iv.pageBlockParagraph)) {
                            TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                            pageblockblockquote.text = arrayListFlattenRange.get(0).text != null ? arrayListFlattenRange.get(0).text : new TL_iv.textEmpty();
                            pageblockblockquote.caption = textempty;
                            obj = pageblockblockquote;
                        } else {
                            TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = new TL_iv.pageBlockBlockquoteBlocks();
                            pageblockblockquoteblocks.blocks = arrayListFlattenRange;
                            pageblockblockquoteblocks.caption = textempty;
                            obj = pageblockblockquoteblocks;
                        }
                    }
                    if (obj != null) {
                        arrayList.add(obj);
                    }
                    i4 = i5;
                } else if (isDetailsHeader(blockRow)) {
                    TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) blockRow.block;
                    if (pageblockdetails.title == null) {
                        pageblockdetails.title = new TL_iv.textEmpty();
                    }
                    int iMatchingDetailsEnd = matchingDetailsEnd(i4);
                    pageblockdetails.blocks = flattenRange(i4 + 1, Math.min(iMatchingDetailsEnd, i2), i3, true);
                    arrayList.add(pageblockdetails);
                    i4 = iMatchingDetailsEnd + 1;
                } else {
                    int i6 = blockRow.level;
                    if (i6 <= 0) {
                        emitLeafBlock(blockRow, arrayList);
                    } else {
                        int[] iArr = {i4};
                        int i7 = i2;
                        int i8 = i3;
                        TL_iv.PageBlock pageBlockBuildListBlock = buildListBlock(i4, i6, i7, i8, blockRow.num > 0, iArr);
                        if (pageBlockBuildListBlock != null) {
                            arrayList.add(pageBlockBuildListBlock);
                        }
                        i4 = iArr[0];
                        i2 = i7;
                        if (i4 <= 0) {
                            i4 = i2;
                        }
                        i3 = i8;
                    }
                }
            }
            i4++;
        }
        if (!z) {
            while (!arrayList.isEmpty()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(0);
                if ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) || (pageBlock instanceof TL_iv.pageBlockPullquote) || isNonText(pageBlock) || (pageBlock instanceof TL_iv.pageBlockDetails) || !RichTextCell.readPlainText(pageBlock).isEmpty()) {
                    break;
                }
                arrayList.remove(0);
            }
            while (!arrayList.isEmpty()) {
                TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList);
                if ((pageBlock2 instanceof TL_iv.pageBlockBlockquote) || (pageBlock2 instanceof TL_iv.pageBlockBlockquoteBlocks) || (pageBlock2 instanceof TL_iv.pageBlockPullquote) || isNonText(pageBlock2) || (pageBlock2 instanceof TL_iv.pageBlockDetails) || !RichTextCell.readPlainText(pageBlock2).isEmpty()) {
                    break;
                }
                SurfaceContainer$$ExternalSyntheticOutline0.m5m(1, arrayList);
            }
        }
        return arrayList;
    }

    public final ArrayList flattenRowsToBlocks() {
        return flattenRange(0, this.rows.size(), 0, false);
    }

    public final boolean focusForDraftInternal() {
        ArrayList arrayList = this.rows;
        BlockRow blockRow = arrayList.isEmpty() ? null : (BlockRow) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList);
        if (blockRow != null && !isNonText(blockRow.block) && !blockRow.detailsEnd && !isDetailsHeader(blockRow)) {
            TL_iv.PageBlock pageBlock = blockRow.block;
            if (!(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockBlockquote) && !(pageBlock instanceof TL_iv.pageBlockPullquote)) {
                if (!(findViewByItemObject(blockRow) instanceof RichTextCell)) {
                    return false;
                }
                focusRowAtEnd(blockRow);
                return true;
            }
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
            richEditorHistory.commit();
        }
        BlockRow blockRow2 = new BlockRow(new TL_iv.pageBlockParagraph(), 0, 0);
        arrayList.add(blockRow2);
        this.adapter.update(false);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        post(new RichEditorListView$$ExternalSyntheticLambda2(this, blockRow2, 21));
        return true;
    }

    public final void focusItemRow(BlockRow blockRow, boolean z) {
        View viewFindViewByItemObject = findViewByItemObject(blockRow);
        if (!(viewFindViewByItemObject instanceof RichQuoteAuthorCell)) {
            focusNavRow(blockRow, z);
            return;
        }
        RichEditText richEditText = ((RichQuoteAuthorCell) viewFindViewByItemObject).authorEditText;
        richEditText.requestEditFocus();
        richEditText.setSelection(z ? richEditText.length() : 0);
    }

    public final void focusNavRow(BlockRow blockRow, boolean z) {
        RichEditText editText;
        KeyEvent.Callback callbackFindViewByItemObject = findViewByItemObject(blockRow);
        if (callbackFindViewByItemObject instanceof RichTableCell) {
            RichTableCell richTableCell = (RichTableCell) callbackFindViewByItemObject;
            TableModel tableModel = richTableCell.model;
            if (tableModel == null) {
                return;
            }
            if (!z) {
                RichEditText richEditText = richTableCell.titleEditText;
                richEditText.requestEditFocus();
                richEditText.setSelection(0);
                return;
            } else {
                if (tableModel.anchorsRowMajor.isEmpty()) {
                    return;
                }
                RichTableCellHost richTableCellHostHostForAnchor = richTableCell.grid.hostForAnchor((TL_iv.pageTableCell) zziq.m(1, richTableCell.model.anchorsRowMajor));
                if (richTableCellHostHostForAnchor == null) {
                    return;
                }
                RichEditText richEditText2 = richTableCellHostHostForAnchor.editText;
                richEditText2.requestEditFocus();
                richEditText2.setSelection(richEditText2.length());
                return;
            }
        }
        if (z && (callbackFindViewByItemObject instanceof RichTextCell)) {
            RichTextCell richTextCell = (RichTextCell) callbackFindViewByItemObject;
            if (richTextCell.isAuthorVisible()) {
                BlockRow blockRow2 = richTextCell.currentRow;
                if (blockRow2 != null) {
                    TL_iv.PageBlock pageBlock = blockRow2.block;
                    if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
                        if (pageblockblockquote.caption == null) {
                            pageblockblockquote.caption = new TL_iv.textEmpty();
                        }
                    } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                        TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
                        if (pageblockpullquote.caption == null) {
                            pageblockpullquote.caption = new TL_iv.textEmpty();
                        }
                    }
                }
                RichEditText richEditText3 = richTextCell.authorEditText;
                if (richEditText3.getVisibility() != 0) {
                    richEditText3.setVisibility(0);
                    richTextCell.requestLayout();
                }
                richEditText3.requestEditFocus();
                richEditText3.setSelection(richEditText3.length());
                return;
            }
        }
        if (callbackFindViewByItemObject instanceof RichTextCell) {
            editText = ((RichTextCell) callbackFindViewByItemObject).getEditText();
        } else if (callbackFindViewByItemObject instanceof RichCaptionHost) {
            editText = ((RichCaptionHost) callbackFindViewByItemObject).getCaptionEditText();
        } else {
            editText = callbackFindViewByItemObject instanceof RichDetailsCell ? ((RichDetailsCell) callbackFindViewByItemObject).getEditText() : null;
        }
        if (editText == null) {
            focusRow(blockRow);
            return;
        }
        editText.requestEditFocus();
        if (z) {
            editText.setSelection(editText.length());
        }
    }

    public final void focusRow(BlockRow blockRow) {
        View viewFindViewByItemObject = findViewByItemObject(blockRow);
        if (viewFindViewByItemObject instanceof RichTextCell) {
            ((RichTextCell) viewFindViewByItemObject).editText.requestEditFocus();
        } else if (viewFindViewByItemObject instanceof RichDetailsCell) {
            ((RichDetailsCell) viewFindViewByItemObject).editText.requestEditFocus();
        }
    }

    public final void focusRowAtEnd(BlockRow blockRow) {
        View viewFindViewByItemObject = findViewByItemObject(blockRow);
        if (viewFindViewByItemObject instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) viewFindViewByItemObject;
            richTextCell.editText.requestEditFocus();
            RichEditText editText = richTextCell.getEditText();
            editText.setSelection(editText.length());
            return;
        }
        if (viewFindViewByItemObject instanceof RichDetailsCell) {
            RichDetailsCell richDetailsCell = (RichDetailsCell) viewFindViewByItemObject;
            richDetailsCell.editText.requestEditFocus();
            RichEditText editText2 = richDetailsCell.getEditText();
            editText2.setSelection(editText2.length());
        }
    }

    public RichEditText getFocusedEditTextOrNull() {
        View viewFindFocus = findFocus();
        if (viewFindFocus instanceof RichEditText) {
            return (RichEditText) viewFindFocus;
        }
        return null;
    }

    public RichMapCell.Delegate getMapDelegate() {
        return this.mapDelegate;
    }

    public View getOverlayView() {
        return this.textSelectionOverlay;
    }

    public TextSelectionHelper.ArticleTextSelectionHelper getTextSelectionHelper() {
        return this.textSelectionHelper;
    }

    public final boolean handleKeyEvent(android.view.KeyEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iv.RichEditorListView.handleKeyEvent(android.view.KeyEvent):boolean");
    }

    public final boolean handleSelectionTouch(MotionEvent motionEvent) {
        int i;
        View childAt;
        BlockRow row;
        int top;
        RichEditorHistory richEditorHistory;
        RichEditorHistory richEditorHistory2;
        RichEditorHistory richEditorHistory3;
        RichEditorHistory richEditorHistory4;
        RichTableCell richTableCell;
        int action = motionEvent.getAction();
        AnonymousClass1 anonymousClass1 = this.textSelectionHelper;
        View view = null;
        if (action == 0) {
            this.pressX = motionEvent.getX();
            float y = motionEvent.getY();
            this.pressY = y;
            this.pressMoved = false;
            this.longPressConsumed = false;
            int i2 = (int) this.pressX;
            int top2 = ((int) y) - getTop();
            RichTableCell richTableCellFindTableCellAncestor = this.activeCellSelectionTable;
            if (richTableCellFindTableCellAncestor == null) {
                View viewFindFocus = findFocus();
                richTableCellFindTableCellAncestor = viewFindFocus instanceof RichEditText ? findTableCellAncestor((RichEditText) viewFindFocus) : null;
            }
            if (richTableCellFindTableCellAncestor == null || richTableCellFindTableCellAncestor.getParent() != this) {
                for (i = 0; i < getChildCount(); i++) {
                    childAt = getChildAt(i);
                    if (top2 < childAt.getTop() && top2 < childAt.getBottom() && i2 >= childAt.getLeft() && i2 < childAt.getRight()) {
                        view = childAt;
                        break;
                    }
                }
            } else {
                int left = i2 - richTableCellFindTableCellAncestor.getLeft();
                int top3 = top2 - richTableCellFindTableCellAncestor.getTop();
                if (richTableCellFindTableCellAncestor.findRowHandleAt(left, top3) >= 0 || richTableCellFindTableCellAncestor.findColHandleAt(left, top3) >= 0) {
                    view = richTableCellFindTableCellAncestor;
                } else {
                    while (i < getChildCount()) {
                        childAt = getChildAt(i);
                        if (top2 < childAt.getTop()) {
                        }
                    }
                }
            }
            this.pressTarget = view;
            long eventTime = motionEvent.getEventTime();
            boolean z = !anonymousClass1.isInSelectionMode() && eventTime - this.lastTapDownTime <= ((long) ViewConfiguration.getDoubleTapTimeout()) && Math.abs(this.pressX - this.lastTapDownX) <= ((float) AndroidUtilities.dp(24.0f)) && Math.abs(this.pressY - this.lastTapDownY) <= ((float) AndroidUtilities.dp(24.0f));
            this.lastTapDownTime = eventTime;
            float f = this.pressX;
            this.lastTapDownX = f;
            float f2 = this.pressY;
            this.lastTapDownY = f2;
            if (z && tryStartTextSelection(this.pressTarget, f, f2)) {
                this.longPressConsumed = true;
                this.lastTapDownTime = 0L;
                if (!anonymousClass1.isInSelectionMode()) {
                    return true;
                }
                anonymousClass1.movingHandle = false;
                anonymousClass1.movingDirectionSettling = false;
                anonymousClass1.isOneTouch = false;
                TextSelectionHelper.TextSelectionOverlay textSelectionOverlay = anonymousClass1.textSelectionOverlay;
                if (textSelectionOverlay != null) {
                    textSelectionOverlay.invalidate();
                }
                ChatActivity$$ExternalSyntheticLambda174 chatActivity$$ExternalSyntheticLambda174 = anonymousClass1.showActionsRunnable;
                AndroidUtilities.cancelRunOnUIThread(chatActivity$$ExternalSyntheticLambda174);
                AndroidUtilities.runOnUIThread(chatActivity$$ExternalSyntheticLambda174);
                return true;
            }
            if (this.pressTarget != null) {
                Runnable runnable = this.longPressRunnable;
                if (runnable != null) {
                    removeCallbacks(runnable);
                }
                RichEditorListView$$ExternalSyntheticLambda4 richEditorListView$$ExternalSyntheticLambda4 = new RichEditorListView$$ExternalSyntheticLambda4(this, 3);
                this.longPressRunnable = richEditorListView$$ExternalSyntheticLambda4;
                postDelayed(richEditorListView$$ExternalSyntheticLambda4, ViewConfiguration.getLongPressTimeout());
            }
        } else {
            if (action == 1) {
                Runnable runnable2 = this.longPressRunnable;
                if (runnable2 != null) {
                    removeCallbacks(runnable2);
                    this.longPressRunnable = null;
                }
                if (this.cellSelectionDragActive) {
                    updateCellSelectionDrag(motionEvent.getX(), motionEvent.getY());
                    RichTableCell richTableCell2 = this.activeCellSelectionTable;
                    if (this.cellSelectionDragActive) {
                        requestDisallowInterceptTouchEvent(false);
                    }
                    this.cellSelectionDragActive = false;
                    this.cellSelectionDragAnchor = null;
                    this.cellSelectionDragEnd = null;
                    this.clearDraggedMultiCellSelectionOnMenuDismiss = richTableCell2 != null && richTableCell2.getSelectedCells().size() > 1;
                    if (richTableCell2 != null && !richTableCell2.selectedCells.isEmpty()) {
                        showTableCellMenu(richTableCell2);
                    }
                    this.pressTarget = null;
                    this.longPressConsumed = false;
                    return true;
                }
                if (!this.pressMoved && !this.longPressConsumed) {
                    View view2 = this.pressTarget;
                    if (view2 instanceof RichTableCell) {
                        RichTableCell richTableCell3 = (RichTableCell) view2;
                        if (handleTableHandleTap(richTableCell3, (int) ((motionEvent.getX() - richTableCell3.getLeft()) - getLeft()), (int) ((motionEvent.getY() - richTableCell3.getTop()) - getTop()))) {
                            this.pressTarget = null;
                            this.longPressConsumed = false;
                            return false;
                        }
                    }
                }
                if (!this.pressMoved && !this.longPressConsumed && (richTableCell = this.activeCellSelectionTable) != null) {
                    View view3 = this.pressTarget;
                    if (view3 == richTableCell) {
                        RichTableCell richTableCell4 = (RichTableCell) view3;
                        TL_iv.pageTableCell pagetablecellFindCellAt = richTableCell4.findCellAt((int) ((motionEvent.getX() - richTableCell4.getLeft()) - getLeft()), (int) ((motionEvent.getY() - richTableCell4.getTop()) - getTop()));
                        if (pagetablecellFindCellAt != null) {
                            if (this.dotSelectedRow >= 0 || this.dotSelectedCol >= 0) {
                                exitCellSelectionMode();
                            } else {
                                LinkedHashSet linkedHashSet = richTableCell4.selectedCells;
                                if (!linkedHashSet.remove(pagetablecellFindCellAt)) {
                                    linkedHashSet.add(pagetablecellFindCellAt);
                                }
                                richTableCell4.grid.invalidate();
                                richTableCell4.notifyCellSelectionChanged();
                            }
                        }
                    } else if (view3 != null) {
                        exitCellSelectionMode();
                    }
                }
                boolean z2 = this.pressMoved;
                UniversalAdapter universalAdapter = this.adapter;
                ArrayList arrayList = this.rows;
                if (!z2 && !this.longPressConsumed && this.pressTarget == null && !anonymousClass1.isInSelectionMode() && this.activeCellSelectionTable == null) {
                    float x = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    View view4 = (View) getParent();
                    if (view4 != null && x >= getLeft() && x <= getRight()) {
                        int paddingTop = getPaddingTop() + getTop();
                        for (int i3 = 0; i3 < getChildCount(); i3++) {
                            paddingTop = Math.max(paddingTop, getChildAt(i3).getBottom() + getTop());
                        }
                        int iM = RichMessageLayout$$ExternalSyntheticOutline2.m(view4.getHeight(), 60.0f, Math.max(Math.max(this.emojiPadding, this.bottomInset), this.imeInset));
                        if (y2 >= paddingTop && y2 <= iM) {
                            BlockRow blockRow = arrayList.isEmpty() ? null : (BlockRow) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList);
                            if (blockRow == null || !blockRow.quoteIds.isEmpty() || isNonText(blockRow.block) || blockRow.detailsEnd || isDetailsHeader(blockRow)) {
                                richEditorHistory3 = this.history;
                                if (richEditorHistory3 != null) {
                                    AndroidUtilities.cancelRunOnUIThread(richEditorHistory3.commitRunnable);
                                    richEditorHistory3.commit();
                                }
                                BlockRow blockRow2 = new BlockRow(new TL_iv.pageBlockParagraph(), 0, 0);
                                arrayList.add(blockRow2);
                                universalAdapter.update(false);
                                richEditorHistory4 = this.history;
                                if (richEditorHistory4 != null) {
                                    richEditorHistory4.record();
                                }
                                post(new RichEditorListView$$ExternalSyntheticLambda2(this, blockRow2, 19));
                            } else {
                                TL_iv.PageBlock pageBlock = blockRow.block;
                                if ((pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote)) {
                                    richEditorHistory3 = this.history;
                                    if (richEditorHistory3 != null) {
                                        AndroidUtilities.cancelRunOnUIThread(richEditorHistory3.commitRunnable);
                                        richEditorHistory3.commit();
                                    }
                                    BlockRow blockRow3 = new BlockRow(new TL_iv.pageBlockParagraph(), 0, 0);
                                    arrayList.add(blockRow3);
                                    universalAdapter.update(false);
                                    richEditorHistory4 = this.history;
                                    if (richEditorHistory4 != null) {
                                        richEditorHistory4.record();
                                    }
                                    post(new RichEditorListView$$ExternalSyntheticLambda2(this, blockRow3, 19));
                                } else {
                                    focusRowAtEnd(blockRow);
                                }
                            }
                        }
                    }
                }
                if (!this.pressMoved && !this.longPressConsumed && this.pressTarget == null && !anonymousClass1.isInSelectionMode() && this.activeCellSelectionTable == null) {
                    float x2 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    if (this.allowTapAboveContent && x2 >= getLeft() && x2 <= getRight()) {
                        int i4 = 0;
                        while (true) {
                            if (i4 >= getChildCount()) {
                                top = Integer.MAX_VALUE;
                                break;
                            }
                            View childAt2 = getChildAt(i4);
                            if (RecyclerView.getChildAdapterPosition(childAt2) == 0) {
                                top = childAt2.getTop() + getTop();
                                break;
                            }
                            i4++;
                        }
                        if (top != Integer.MAX_VALUE) {
                            if (y3 >= AndroidUtilities.dp(60.0f) + getTop() && y3 <= top) {
                                BlockRow blockRow4 = arrayList.isEmpty() ? null : (BlockRow) arrayList.get(0);
                                if (blockRow4 == null || isNonText(blockRow4.block) || blockRow4.detailsEnd || isDetailsHeader(blockRow4)) {
                                    richEditorHistory = this.history;
                                    if (richEditorHistory != null) {
                                        AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
                                        richEditorHistory.commit();
                                    }
                                    BlockRow blockRow5 = new BlockRow(new TL_iv.pageBlockParagraph(), 0, 0);
                                    arrayList.add(0, blockRow5);
                                    universalAdapter.update(false);
                                    richEditorHistory2 = this.history;
                                    if (richEditorHistory2 != null) {
                                        richEditorHistory2.record();
                                    }
                                    post(new RichEditorListView$$ExternalSyntheticLambda2(this, blockRow5, 16));
                                } else {
                                    TL_iv.PageBlock pageBlock2 = blockRow4.block;
                                    if ((pageBlock2 instanceof TL_iv.pageBlockPreformatted) || (pageBlock2 instanceof TL_iv.pageBlockBlockquote) || (pageBlock2 instanceof TL_iv.pageBlockPullquote)) {
                                        richEditorHistory = this.history;
                                        if (richEditorHistory != null) {
                                            AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
                                            richEditorHistory.commit();
                                        }
                                        BlockRow blockRow6 = new BlockRow(new TL_iv.pageBlockParagraph(), 0, 0);
                                        arrayList.add(0, blockRow6);
                                        universalAdapter.update(false);
                                        richEditorHistory2 = this.history;
                                        if (richEditorHistory2 != null) {
                                            richEditorHistory2.record();
                                        }
                                        post(new RichEditorListView$$ExternalSyntheticLambda2(this, blockRow6, 16));
                                    } else {
                                        View viewFindViewByItemObject = findViewByItemObject(blockRow4);
                                        if (viewFindViewByItemObject instanceof RichTextCell) {
                                            RichTextCell richTextCell = (RichTextCell) viewFindViewByItemObject;
                                            richTextCell.editText.requestEditFocus();
                                            richTextCell.getEditText().setSelection(0);
                                        } else if (viewFindViewByItemObject instanceof RichDetailsCell) {
                                            RichDetailsCell richDetailsCell = (RichDetailsCell) viewFindViewByItemObject;
                                            richDetailsCell.editText.requestEditFocus();
                                            richDetailsCell.getEditText().setSelection(0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (!this.pressMoved && !this.longPressConsumed && (this.pressTarget instanceof RichMathCell) && !anonymousClass1.isInSelectionMode() && this.activeCellSelectionTable == null && (row = ((RichMathCell) this.pressTarget).getRow()) != null) {
                    TL_iv.PageBlock pageBlock3 = row.block;
                    if (pageBlock3 instanceof TL_iv.pageBlockMath) {
                        TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) pageBlock3;
                        ChatAttachAlertRichLayout.showEditLatexSheet(getContext(), TextUtils.isEmpty(pageblockmath.source) ? "" : pageblockmath.source, new ThemeActivity$$ExternalSyntheticLambda19(20, this, pageblockmath), this.resourcesProvider);
                    }
                }
                this.pressTarget = null;
                this.longPressConsumed = false;
                return false;
            }
            if (action == 2) {
                if (this.cellSelectionDragActive && this.pressTarget == this.activeCellSelectionTable) {
                    updateCellSelectionDrag(motionEvent.getX(), motionEvent.getY());
                    this.pressMoved = true;
                    return true;
                }
                float x3 = motionEvent.getX() - this.pressX;
                float y4 = motionEvent.getY() - this.pressY;
                if ((y4 * y4) + (x3 * x3) > AndroidUtilities.dp(8.0f) * AndroidUtilities.dp(8.0f)) {
                    this.pressMoved = true;
                    Runnable runnable3 = this.longPressRunnable;
                    if (runnable3 != null) {
                        removeCallbacks(runnable3);
                        this.longPressRunnable = null;
                        return false;
                    }
                }
            } else if (action == 3) {
                Runnable runnable4 = this.longPressRunnable;
                if (runnable4 != null) {
                    removeCallbacks(runnable4);
                    this.longPressRunnable = null;
                }
                if (this.cellSelectionDragActive) {
                    exitCellSelectionMode();
                }
                this.pressTarget = null;
                this.longPressConsumed = false;
                return false;
            }
        }
        return false;
    }

    public final boolean handleTableHandleTap(RichTableCell richTableCell, int i, int i2) {
        TableModel tableModel;
        int i3;
        int i4;
        TableModel tableModel2;
        TL_iv.pageTableCell pagetablecell;
        TableModel tableModel3;
        TableModel tableModel4;
        int i5;
        int i6;
        TableModel tableModel5;
        TL_iv.pageTableCell pagetablecell2;
        TableModel tableModel6;
        int iFindRowHandleAt = richTableCell.findRowHandleAt(i, i2);
        RichTableCellGrid richTableCellGrid = richTableCell.grid;
        LinkedHashSet linkedHashSet = richTableCell.selectedCells;
        if (iFindRowHandleAt >= 0) {
            int iLastSelectedRow = (richTableCellGrid.useCombinedRowHandle() && iFindRowHandleAt == richTableCellGrid.firstSelectedRow()) ? richTableCellGrid.lastSelectedRow() : iFindRowHandleAt;
            if (richTableCell != this.activeCellSelectionTable || (tableModel6 = richTableCell.model) == null || iFindRowHandleAt < 0 || iLastSelectedRow < iFindRowHandleAt || iLastSelectedRow >= tableModel6.rowCount || linkedHashSet.isEmpty()) {
                beginCellSelection(richTableCell);
                tableModel4 = richTableCell.model;
                if (tableModel4 != null && iFindRowHandleAt >= 0 && iLastSelectedRow >= iFindRowHandleAt && iLastSelectedRow < tableModel4.rowCount) {
                    linkedHashSet.clear();
                    for (i5 = iFindRowHandleAt; i5 <= iLastSelectedRow; i5++) {
                        i6 = 0;
                        while (true) {
                            tableModel5 = richTableCell.model;
                            if (i6 < tableModel5.colCount) {
                                pagetablecell2 = tableModel5.grid[i5][i6];
                                if (pagetablecell2 != null) {
                                    linkedHashSet.add(pagetablecell2);
                                }
                                i6++;
                            }
                        }
                    }
                    richTableCellGrid.invalidate();
                    richTableCell.notifyCellSelectionChanged();
                }
                this.dotSelectedRow = iFindRowHandleAt;
            } else {
                int i7 = iFindRowHandleAt;
                loop0: while (true) {
                    if (i7 <= iLastSelectedRow) {
                        int i8 = 0;
                        while (true) {
                            TableModel tableModel7 = richTableCell.model;
                            if (i8 < tableModel7.colCount) {
                                if (!linkedHashSet.contains(tableModel7.grid[i7][i8])) {
                                    break loop0;
                                }
                                i8++;
                            }
                        }
                        i7++;
                    } else {
                        showTableCellMenu(richTableCell);
                    }
                }
                beginCellSelection(richTableCell);
                tableModel4 = richTableCell.model;
                if (tableModel4 != null) {
                    linkedHashSet.clear();
                    while (i5 <= iLastSelectedRow) {
                        i6 = 0;
                        while (true) {
                            tableModel5 = richTableCell.model;
                            if (i6 < tableModel5.colCount) {
                                pagetablecell2 = tableModel5.grid[i5][i6];
                                if (pagetablecell2 != null) {
                                    linkedHashSet.add(pagetablecell2);
                                }
                                i6++;
                            }
                        }
                    }
                    richTableCellGrid.invalidate();
                    richTableCell.notifyCellSelectionChanged();
                }
                this.dotSelectedRow = iFindRowHandleAt;
            }
            return true;
        }
        int iFindColHandleAt = richTableCell.findColHandleAt(i, i2);
        if (iFindColHandleAt < 0) {
            return false;
        }
        int iLastSelectedCol = (richTableCellGrid.useCombinedColHandle() && iFindColHandleAt == richTableCellGrid.firstSelectedCol()) ? richTableCellGrid.lastSelectedCol() : iFindColHandleAt;
        if (richTableCell != this.activeCellSelectionTable || (tableModel3 = richTableCell.model) == null || iFindColHandleAt < 0 || iLastSelectedCol < iFindColHandleAt || iLastSelectedCol >= tableModel3.colCount || linkedHashSet.isEmpty()) {
            beginCellSelection(richTableCell);
            tableModel = richTableCell.model;
            if (tableModel != null && iFindColHandleAt >= 0 && iLastSelectedCol >= iFindColHandleAt && iLastSelectedCol < tableModel.colCount) {
                linkedHashSet.clear();
                for (i3 = iFindColHandleAt; i3 <= iLastSelectedCol; i3++) {
                    i4 = 0;
                    while (true) {
                        tableModel2 = richTableCell.model;
                        if (i4 < tableModel2.rowCount) {
                            pagetablecell = tableModel2.grid[i4][i3];
                            if (pagetablecell != null) {
                                linkedHashSet.add(pagetablecell);
                            }
                            i4++;
                        }
                    }
                }
                richTableCellGrid.invalidate();
                richTableCell.notifyCellSelectionChanged();
            }
            this.dotSelectedCol = iFindColHandleAt;
        } else {
            int i9 = iFindColHandleAt;
            loop4: while (true) {
                if (i9 <= iLastSelectedCol) {
                    int i10 = 0;
                    while (true) {
                        TableModel tableModel8 = richTableCell.model;
                        if (i10 < tableModel8.rowCount) {
                            if (!linkedHashSet.contains(tableModel8.grid[i10][i9])) {
                                break loop4;
                            }
                            i10++;
                        }
                    }
                    i9++;
                } else {
                    showTableCellMenu(richTableCell);
                }
            }
            beginCellSelection(richTableCell);
            tableModel = richTableCell.model;
            if (tableModel != null) {
                linkedHashSet.clear();
                while (i3 <= iLastSelectedCol) {
                    i4 = 0;
                    while (true) {
                        tableModel2 = richTableCell.model;
                        if (i4 < tableModel2.rowCount) {
                            pagetablecell = tableModel2.grid[i4][i3];
                            if (pagetablecell != null) {
                                linkedHashSet.add(pagetablecell);
                            }
                            i4++;
                        }
                    }
                }
                richTableCellGrid.invalidate();
                richTableCell.notifyCellSelectionChanged();
            }
            this.dotSelectedCol = iFindColHandleAt;
        }
        return true;
    }

    public final boolean hasAnyText() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.rows;
            if (i >= arrayList.size()) {
                return false;
            }
            BlockRow blockRow = (BlockRow) arrayList.get(i);
            if (!RichTextCell.readPlainText(blockRow.block).isEmpty()) {
                return true;
            }
            if (isMedia(blockRow.block)) {
                for (MediaUploadState mediaUploadState : mediasOf(blockRow)) {
                    if (!mediaUploadState.isReady()) {
                    }
                    return true;
                }
            }
            TL_iv.PageBlock pageBlock = blockRow.block;
            if ((pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument)) {
                while (r4.hasNext()) {
                    if (!mediaUploadState.isReady() || mediaUploadState.isPending()) {
                        return true;
                    }
                }
            }
            TL_iv.PageBlock pageBlock2 = blockRow.block;
            if ((pageBlock2 instanceof TL_iv.pageBlockMath) && !TextUtils.isEmpty(((TL_iv.pageBlockMath) pageBlock2).source)) {
                return true;
            }
            TL_iv.PageBlock pageBlock3 = blockRow.block;
            if (pageBlock3 instanceof TL_iv.pageBlockMap) {
                TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock3;
                int i2 = RichMapCell.$r8$clinit;
                if (pageblockmap != null && (pageblockmap.geo instanceof TLRPC.TL_geoPoint)) {
                    return true;
                }
            }
            if ((pageBlock3 instanceof TL_iv.pageBlockTable) && tableHasText((TL_iv.pageBlockTable) pageBlock3)) {
                return true;
            }
            TL_iv.PageBlock pageBlock4 = blockRow.block;
            if ((pageBlock4 instanceof TL_iv.pageBlockButtonRow) && !((TL_iv.pageBlockButtonRow) pageBlock4).buttons.isEmpty()) {
                return true;
            }
            i++;
        }
    }

    public final boolean hasPendingUploads() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.rows;
            if (i >= arrayList.size()) {
                return false;
            }
            Iterator it = mediasOf((BlockRow) arrayList.get(i)).iterator();
            while (it.hasNext()) {
                if (((MediaUploadState) it.next()).isPending()) {
                    return true;
                }
            }
            i++;
        }
    }

    public final void hideEditTextActionModes() {
        for (int i = 0; i < getChildCount(); i++) {
            KeyEvent.Callback childAt = getChildAt(i);
            if (childAt instanceof RichTextCell) {
                RichTextCell richTextCell = (RichTextCell) childAt;
                richTextCell.editText.hideActionMode();
                richTextCell.authorEditText.hideActionMode();
            } else if (childAt instanceof RichTableCell) {
                RichTableCell richTableCell = (RichTableCell) childAt;
                richTableCell.titleEditText.hideActionMode();
                int i2 = 0;
                while (true) {
                    RichTableCellGrid richTableCellGrid = richTableCell.grid;
                    if (i2 < richTableCellGrid.getChildCount()) {
                        View childAt2 = richTableCellGrid.getChildAt(i2);
                        if (childAt2 instanceof RichTableCellHost) {
                            ((RichTableCellHost) childAt2).editText.hideActionMode();
                        }
                        i2++;
                    }
                }
            } else if (childAt instanceof RichCaptionHost) {
                ((RichCaptionHost) childAt).getCaptionEditText().hideActionMode();
            } else if (childAt instanceof RichDetailsCell) {
                ((RichDetailsCell) childAt).getEditText().hideActionMode();
            }
        }
    }

    public final void hideTextSelectionUi(boolean z) {
        AnonymousClass1 anonymousClass1 = this.textSelectionHelper;
        if (anonymousClass1 != null) {
            if (z) {
                anonymousClass1.clear(false);
            } else {
                AndroidUtilities.cancelRunOnUIThread(anonymousClass1.showActionsRunnable);
                anonymousClass1.hideActions();
            }
        }
        if (z) {
            finishEditTextActionModes();
        } else {
            hideEditTextActionModes();
        }
    }

    public final boolean indentKeepsDepth(int i) {
        return ((BlockRow) this.rows.get(i)).level + 1 <= MessagesController.getInstance(this.currentAccount).config.richMessageMaxDepth.get() + (-6);
    }

    public final boolean indentRow(int i, boolean z, boolean z2) {
        int i2 = 0;
        if (i >= 0) {
            ArrayList arrayList = this.rows;
            if (i < arrayList.size()) {
                BlockRow blockRow = (BlockRow) arrayList.get(i);
                if (z) {
                    if (blockRow.level > 0) {
                        cascadeOutdent(i);
                        return true;
                    }
                } else if (blockRow.level == 0) {
                    TL_iv.PageBlock pageBlock = blockRow.block;
                    boolean z3 = (pageBlock instanceof TL_iv.pageBlockParagraph) || isHeading(pageBlock) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockFooter);
                    if ((z3 || (i > 0 && i < arrayList.size() && isNonText(((BlockRow) arrayList.get(i)).block) && ((BlockRow) arrayList.get(i - 1)).level >= 1)) && indentKeepsDepth(i)) {
                        BlockRow blockRow2 = i > 0 ? (BlockRow) arrayList.get(i - 1) : null;
                        if (!z3) {
                            blockRow.level = blockRow2.level;
                            blockRow.num = blockRow2.num > 0 ? 1 : 0;
                            blockRow.checkbox = false;
                            blockRow.checked = false;
                            return true;
                        }
                        blockRow.level = 1;
                        if (blockRow2 != null && blockRow2.num > 0) {
                            i2 = 1;
                        }
                        blockRow.num = i2;
                        return true;
                    }
                } else if ((z2 || (i != 0 && ((BlockRow) arrayList.get(i - 1)).level >= blockRow.level)) && indentKeepsDepth(i)) {
                    blockRow.level++;
                    return true;
                }
            }
        }
        return false;
    }

    public final void indentSelection(boolean z) {
        BlockRow blockRowFindFocusedRow;
        AnonymousClass1 anonymousClass1;
        int i;
        int i2;
        int i3;
        int[] iArrSelectionRowRange = selectionRowRange();
        if (iArrSelectionRowRange != null && (i2 = iArrSelectionRowRange[0]) != (i3 = iArrSelectionRowRange[1])) {
            rangeIndent(i2, i3, z);
            return;
        }
        if (iArrSelectionRowRange == null) {
            blockRowFindFocusedRow = findFocusedRow();
            if (blockRowFindFocusedRow == null && ((anonymousClass1 = this.textSelectionHelper) == null || (i = anonymousClass1.startViewPosition) < 0 || (blockRowFindFocusedRow = rowForCell(i)) == null)) {
                blockRowFindFocusedRow = null;
            }
        } else {
            blockRowFindFocusedRow = (BlockRow) this.rows.get(iArrSelectionRowRange[0]);
        }
        if (blockRowFindFocusedRow != null) {
            onCellIndent(blockRowFindFocusedRow, z);
        }
    }

    public final void injectClosingQuoteAuthors(BlockRow blockRow, ArrayList arrayList, HashMap map, ArrayList arrayList2) {
        ArrayList arrayList3 = blockRow.quoteIds;
        int size = arrayList3.size();
        int i = 0;
        while (i < size && i < arrayList.size() && ((Long) arrayList3.get(i)).equals(arrayList.get(i))) {
            i++;
        }
        for (int i2 = size - 1; i2 >= i; i2--) {
            Long l = (Long) arrayList3.get(i2);
            long jLongValue = l.longValue();
            Integer num = (Integer) map.get(l);
            if (num != null && (num.intValue() >= 2 || i2 != 0 || this.quoteAuthors.containsKey(l))) {
                BlockRow blockRow2 = new BlockRow(new TL_iv.pageBlockParagraph(), 0, 0);
                blockRow2.authorQuoteId = jLongValue;
                for (int i3 = 0; i3 <= i2; i3++) {
                    blockRow2.quoteIds.add((Long) arrayList3.get(i3));
                }
                int i4 = RichQuoteAuthorCell.Factory.$r8$clinit;
                UItem uItemOfFactory = UItem.ofFactory(RichQuoteAuthorCell.Factory.class);
                uItemOfFactory.object = blockRow2;
                uItemOfFactory.object2 = this.quoteAuthorDelegate;
                arrayList2.add(uItemOfFactory);
                this.itemRows.add(blockRow2);
            }
        }
    }

    public final void insertDetails() {
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
            richEditorHistory.commit();
        }
        TL_iv.pageBlockDetails pageblockdetails = new TL_iv.pageBlockDetails();
        pageblockdetails.open = true;
        pageblockdetails.title = new TL_iv.textEmpty();
        BlockRow blockRow = new BlockRow(pageblockdetails, 0, 0);
        BlockRow blockRow2 = new BlockRow(new TL_iv.pageBlockParagraph(), 0, 0);
        BlockRow blockRow3 = new BlockRow(new TL_iv.pageBlockParagraph(), 0, 0);
        blockRow3.detailsEnd = true;
        BlockRow blockRowFindFocusedRow = findFocusedRow();
        ArrayList arrayList = this.rows;
        int iIndexOf = blockRowFindFocusedRow != null ? arrayList.indexOf(blockRowFindFocusedRow) : -1;
        if (blockRowFindFocusedRow != null) {
            TL_iv.PageBlock pageBlock = blockRowFindFocusedRow.block;
            if ((pageBlock instanceof TL_iv.pageBlockParagraph) && blockRowFindFocusedRow.media == null && !blockRowFindFocusedRow.detailsEnd && RichTextCell.readPlainText(pageBlock).isEmpty()) {
                arrayList.remove(iIndexOf);
            } else if (iIndexOf >= 0) {
                iIndexOf++;
            } else {
                iIndexOf = arrayList.size();
            }
        } else if (iIndexOf >= 0) {
            iIndexOf++;
        } else {
            iIndexOf = arrayList.size();
        }
        arrayList.add(iIndexOf, blockRow3);
        arrayList.add(iIndexOf, blockRow2);
        arrayList.add(iIndexOf, blockRow);
        this.adapter.update(false);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        post(new RichEditorListView$$ExternalSyntheticLambda2(this, blockRow, 20));
    }

    public final void insertPreparedRow(BlockRow blockRow) {
        boolean z;
        BlockRow blockRowFindFocusedRow = findFocusedRow();
        if (blockRowFindFocusedRow == null) {
            blockRowFindFocusedRow = this.pendingInsertRow;
        }
        ArrayList arrayList = this.rows;
        int iIndexOf = blockRowFindFocusedRow != null ? arrayList.indexOf(blockRowFindFocusedRow) : -1;
        if (iIndexOf >= 0) {
            TL_iv.PageBlock pageBlock = blockRowFindFocusedRow.block;
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                long j = RichContainer.ID_GEN;
                RichContainer.ID_GEN = 1 + j;
                TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) pageBlock).caption;
                if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                    this.quoteAuthors.put(Long.valueOf(j), richText);
                }
                blockRowFindFocusedRow.quoteIds.add(Long.valueOf(j));
                blockRowFindFocusedRow.block = new TL_iv.pageBlockParagraph();
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        boolean z2 = iIndexOf >= 0 && !blockRowFindFocusedRow.quoteIds.isEmpty();
        ArrayList arrayList2 = blockRow.quoteIds;
        if (z2) {
            arrayList2.clear();
            arrayList2.addAll(blockRowFindFocusedRow.quoteIds);
        }
        if (iIndexOf >= 0) {
            TL_iv.PageBlock pageBlock2 = blockRowFindFocusedRow.block;
            if ((pageBlock2 instanceof TL_iv.pageBlockParagraph) && blockRowFindFocusedRow.media == null && RichTextCell.readPlainText(pageBlock2).isEmpty()) {
                arrayList.set(iIndexOf, blockRow);
            } else if (iIndexOf >= 0) {
                arrayList.add(iIndexOf + 1, blockRow);
            } else {
                arrayList.add(blockRow);
            }
        } else if (iIndexOf >= 0) {
            arrayList.add(iIndexOf + 1, blockRow);
        } else {
            arrayList.add(blockRow);
        }
        this.pendingInsertRow = blockRow;
        int iIndexOf2 = arrayList.indexOf(blockRow);
        if (iIndexOf2 >= arrayList.size() - 1 || isNonText(((BlockRow) arrayList.get(iIndexOf2 + 1)).block)) {
            BlockRow blockRow2 = new BlockRow(new TL_iv.pageBlockParagraph(), 0, 0);
            if (z2) {
                blockRow2.quoteIds.addAll(arrayList2);
            }
            arrayList.add(iIndexOf2 + 1, blockRow2);
        }
        this.adapter.update(!z);
        int iIndexOf3 = arrayList.indexOf(blockRow) + 1;
        if (iIndexOf3 <= 0 || iIndexOf3 >= arrayList.size() || isNonText(((BlockRow) arrayList.get(iIndexOf3)).block)) {
            return;
        }
        post(new RichEditorListView$$ExternalSyntheticLambda2(this, (BlockRow) arrayList.get(iIndexOf3), 17));
    }

    public final boolean isCaptionSelection() {
        int i;
        AnonymousClass1 anonymousClass1 = this.textSelectionHelper;
        if (anonymousClass1 == null || !anonymousClass1.isInSelectionMode() || (i = anonymousClass1.startViewPosition) != anonymousClass1.endViewPosition || i < 0 || i >= this.itemRows.size()) {
            return false;
        }
        return selectableAt(i) instanceof RichCaptionHost;
    }

    public final boolean isDetailsSelection() {
        int i;
        AnonymousClass1 anonymousClass1 = this.textSelectionHelper;
        return anonymousClass1 != null && anonymousClass1.isInSelectionMode() && (i = anonymousClass1.startViewPosition) == anonymousClass1.endViewPosition && isDetailsHeader(rowForCell(i));
    }

    public final boolean isQuoteAuthorSelection() {
        int i;
        BlockRow blockRowRowForCell;
        AnonymousClass1 anonymousClass1 = this.textSelectionHelper;
        return anonymousClass1 != null && anonymousClass1.isInSelectionMode() && (i = anonymousClass1.startViewPosition) == anonymousClass1.endViewPosition && i >= 0 && i < this.itemRows.size() && anonymousClass1.startViewChildPosition == 1 && anonymousClass1.endViewChildPosition == 1 && (blockRowRowForCell = rowForCell(i)) != null && RichTextCell.isQuoteBlock(blockRowRowForCell.block);
    }

    public final boolean isRangeQuoted(int i, int i2) {
        if (i >= 0) {
            ArrayList arrayList = this.rows;
            if (i2 < arrayList.size() && i <= i2) {
                boolean z = false;
                while (i <= i2) {
                    BlockRow blockRow = (BlockRow) arrayList.get(i);
                    if (!blockRow.detailsEnd && !isDetailsHeader(blockRow)) {
                        if (!blockRow.quoteIds.isEmpty() || RichTextCell.isQuoteBlock(blockRow.block)) {
                            z = true;
                        }
                    }
                    i++;
                }
                return z;
            }
        }
        return false;
    }

    @Override
    public final boolean isReorderRemoving() {
        return this.draggingOverTrash;
    }

    public final boolean isSelectionAllHeadings() {
        AnonymousClass1 anonymousClass1 = this.textSelectionHelper;
        if (anonymousClass1 != null && anonymousClass1.isInSelectionMode()) {
            int i = anonymousClass1.startViewPosition;
            int i2 = anonymousClass1.endViewPosition;
            if (i >= 0 && i2 >= 0 && i2 >= i) {
                boolean z = false;
                while (i <= i2) {
                    BlockRow blockRowRowForCell = rowForCell(i);
                    if (blockRowRowForCell != null) {
                        if (isHeading(blockRowRowForCell.block)) {
                            z = true;
                        }
                    }
                    i++;
                }
                return z;
            }
        }
        return false;
    }

    public final boolean isStyleFullyApplied(int i, int i2, int i3, int i4, int i5) {
        boolean zHasStyle;
        int length;
        int iM;
        int iM2;
        int iMax;
        int iMax2;
        if (isDetailsSelection()) {
            RichEditText richEditTextDetailsEditText = detailsEditText(i2);
            if (richEditTextDetailsEditText == null || (iMax = Math.max(0, Math.min(Math.min(i3, i5), richEditTextDetailsEditText.length()))) >= (iMax2 = Math.max(0, Math.min(Math.max(i3, i5), richEditTextDetailsEditText.length()))) || (i & richEditTextDetailsEditText.getCurrentStyle(iMax, iMax2)) == 0) {
                return false;
            }
            return true;
        }
        if (!isQuoteAuthorSelection()) {
            int i6 = i2;
            boolean z = false;
            while (i6 <= i4) {
                BlockRow blockRowRowForCell = rowForCell(i6);
                if (blockRowRowForCell != null) {
                    TL_iv.PageBlock pageBlock = blockRowRowForCell.block;
                    if (isFormattable(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
                        int iBlockTextLength = blockTextLength(i6);
                        int i7 = i6 == i2 ? i3 : 0;
                        int i8 = i6 == i4 ? i5 : iBlockTextLength;
                        int iMax3 = Math.max(0, Math.min(i7, iBlockTextLength));
                        int iMax4 = Math.max(0, Math.min(i8, iBlockTextLength));
                        if (iMax3 < iMax4) {
                            RichTextCell richTextCellCellAt = cellAt(i6);
                            if (richTextCellCellAt != null) {
                                zHasStyle = (richTextCellCellAt.getStyleDelegate().getCurrentStyle(iMax3, iMax4) & i) != 0;
                            } else {
                                zHasStyle = RichTextStyle.hasStyle(iMax3, iMax4, i, RichTextCell.readStyledText(rowForCell(i6).block));
                            }
                            if (zHasStyle) {
                                z = true;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                i6++;
            }
            return z;
        }
        RichEditText richEditTextQuoteAuthorEditText = quoteAuthorEditText(i2);
        if (richEditTextQuoteAuthorEditText != null && (iM = zzdv.m(i3, i5, (length = richEditTextQuoteAuthorEditText.length()))) < (iM2 = zzdu.m(i3, i5, length)) && (i & richEditTextQuoteAuthorEditText.getCurrentStyle(iM, iM2)) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isStyleFullyAppliedTable(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i3;
        boolean z = false;
        while (i7 <= i5) {
            RichEditText richEditTextTableEditText = tableEditText(i2, i7);
            if (richEditTextTableEditText != null) {
                int length = richEditTextTableEditText.length();
                int iMin = i7 == i3 ? i4 : 0;
                int iMax = i7 == i5 ? i6 : length;
                if (i3 == i5) {
                    iMin = Math.min(i4, i6);
                    iMax = Math.max(i4, i6);
                }
                int iMax2 = Math.max(0, Math.min(iMin, length));
                int iMax3 = Math.max(0, Math.min(iMax, length));
                if (iMax2 >= iMax3) {
                    continue;
                } else {
                    if ((richEditTextTableEditText.getCurrentStyle(iMax2, iMax3) & i) == 0) {
                        return false;
                    }
                    z = true;
                }
            }
            i7++;
        }
        return z;
    }

    public final boolean isTableSelection() {
        AnonymousClass1 anonymousClass1 = this.textSelectionHelper;
        if (anonymousClass1 == null || !anonymousClass1.isInSelectionMode()) {
            return false;
        }
        int i = anonymousClass1.startViewPosition;
        int i2 = anonymousClass1.endViewPosition;
        BlockRow blockRowRowForCell = rowForCell(i);
        return i == i2 && blockRowRowForCell != null && (blockRowRowForCell.block instanceof TL_iv.pageBlockTable);
    }

    public final boolean isWithinLimits() {
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(this.currentAccount).config;
        int i = 0;
        int size = 0;
        while (true) {
            ArrayList arrayList = this.rows;
            if (i >= arrayList.size()) {
                break;
            }
            size += mediasOf((BlockRow) arrayList.get(i)).size();
            i++;
        }
        ArrayList arrayListFlattenRowsToBlocks = flattenRowsToBlocks();
        RichEditorLimits richEditorLimits = new RichEditorLimits();
        richEditorLimits.media = size;
        richEditorLimits.blocks = arrayListFlattenRowsToBlocks.size() + richEditorLimits.blocks;
        for (int i2 = 0; i2 < arrayListFlattenRowsToBlocks.size(); i2++) {
            RichEditorLimits.measureBlock((TL_iv.PageBlock) arrayListFlattenRowsToBlocks.get(i2), 1, richEditorLimits);
        }
        return richEditorLimits.length <= appGlobalConfig.richMessageLengthLimit.get() && richEditorLimits.blocks <= appGlobalConfig.richMessageMaxBlocks.get() && richEditorLimits.depth <= appGlobalConfig.richMessageMaxDepth.get() && richEditorLimits.media <= appGlobalConfig.richMessageMaxMedia.get() && richEditorLimits.tableCols <= appGlobalConfig.richMessageMaxTableCols.get();
    }

    public final int[] mapInitialOffset(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < this.initialSelectionRows.size(); i3++) {
            int length = RichTextCell.readPlainText(((BlockRow) this.initialSelectionRows.get(i3)).block).length();
            if (i <= i2 + length) {
                return new int[]{i3, i - i2};
            }
            i2 += length + 1;
        }
        int size = this.initialSelectionRows.size() - 1;
        return new int[]{size, RichTextCell.readPlainText(((BlockRow) this.initialSelectionRows.get(size)).block).length()};
    }

    public final int matchingDetailsEnd(int i) {
        int i2 = 1;
        int i3 = i + 1;
        while (true) {
            ArrayList arrayList = this.rows;
            if (i3 >= arrayList.size()) {
                return arrayList.size();
            }
            BlockRow blockRow = (BlockRow) arrayList.get(i3);
            if (isDetailsHeader(blockRow)) {
                i2++;
            } else if (blockRow.detailsEnd && (i2 = i2 - 1) == 0) {
                return i3;
            }
            i3++;
        }
    }

    public final BlockRow nextNavItemRow(int i, int i2) {
        while (i >= 0) {
            ArrayList arrayList = this.itemRows;
            if (i >= arrayList.size()) {
                return null;
            }
            BlockRow blockRow = (BlockRow) arrayList.get(i);
            if (!blockRow.detailsEnd) {
                if (blockRow.authorQuoteId == 0) {
                    TL_iv.PageBlock pageBlock = blockRow.block;
                    if (!isNonText(pageBlock) || hasCaption(pageBlock) || (pageBlock instanceof TL_iv.pageBlockTable)) {
                    }
                }
                return blockRow;
            }
            i += i2;
        }
        return null;
    }

    public final void normalizeNestedQuotes() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.rows;
            if (i >= arrayList.size()) {
                return;
            }
            BlockRow blockRow = (BlockRow) arrayList.get(i);
            if (!blockRow.quoteIds.isEmpty() && RichTextCell.isQuoteBlock(blockRow.block)) {
                long j = RichContainer.ID_GEN;
                RichContainer.ID_GEN = 1 + j;
                TL_iv.RichText richTextExtractCaption = RichTextCell.extractCaption(blockRow.block);
                if (richTextExtractCaption != null && !(richTextExtractCaption instanceof TL_iv.textEmpty)) {
                    this.quoteAuthors.put(Long.valueOf(j), richTextExtractCaption);
                }
                blockRow.quoteIds.add(Long.valueOf(j));
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                pageblockparagraph.text = blockRow.block.text;
                blockRow.block = pageblockparagraph;
            }
            i++;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.imeFocusListener);
    }

    public final void onCaptionEnter(BlockRow blockRow) {
        ArrayList arrayList = this.rows;
        int iIndexOf = arrayList.indexOf(blockRow);
        if (iIndexOf < 0) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
            richEditorHistory.commit();
        }
        BlockRow blockRow2 = new BlockRow(new TL_iv.pageBlockParagraph(), 0, 0);
        blockRow2.quoteIds.addAll(blockRow.quoteIds);
        arrayList.add(iIndexOf + 1, blockRow2);
        renumberAllRuns();
        this.adapter.update(false);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        post(new RichEditorListView$$ExternalSyntheticLambda2(this, blockRow2, 23));
    }

    public final boolean onCellBackspaceAtStart(org.telegram.ui.iv.BlockRow r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iv.RichEditorListView.onCellBackspaceAtStart(org.telegram.ui.iv.BlockRow, boolean):boolean");
    }

    public final void onCellIndent(BlockRow blockRow, boolean z) {
        int selectionEnd;
        int iIndexOf = this.rows.indexOf(blockRow);
        if (iIndexOf < 0) {
            return;
        }
        View viewFindViewByItemObject = findViewByItemObject(blockRow);
        if (viewFindViewByItemObject instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) viewFindViewByItemObject;
            if (richTextCell.getEditText().isFocused()) {
                selectionEnd = richTextCell.getEditText().getSelectionEnd();
            } else {
                selectionEnd = -1;
            }
        } else {
            selectionEnd = -1;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
            richEditorHistory.commit();
        }
        if (indentRow(iIndexOf, z, false)) {
            renumberAllRuns();
            if (findFocus() instanceof RichEditText) {
                applyInPlaceUpdateKeepingFocus();
            } else {
                this.adapter.update(false);
            }
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
            if (selectionEnd < 0) {
                return;
            }
            post(new RichEditorListView$$ExternalSyntheticLambda3(this, blockRow, selectionEnd, 0));
        }
    }

    public final void onDateClicked() {
        int length;
        int iM;
        int iM2;
        int length2;
        int iM3;
        int iM4;
        int length3;
        int iM5;
        int iM6;
        int length4;
        int iM7;
        int iM8;
        RichEditText richEditTextTableEditText;
        int length5;
        int iM9;
        int iM10;
        boolean zIsTableSelection = isTableSelection();
        AnonymousClass1 anonymousClass1 = this.textSelectionHelper;
        if (zIsTableSelection) {
            int i = anonymousClass1.startViewPosition;
            int i2 = anonymousClass1.startViewChildPosition;
            if (i2 == anonymousClass1.endViewChildPosition && (richEditTextTableEditText = tableEditText(i, i2)) != null && (iM9 = zzdv.m(anonymousClass1.startViewOffset, anonymousClass1.endViewOffset, (length5 = richEditTextTableEditText.length()))) < (iM10 = zzdu.m(anonymousClass1.startViewOffset, anonymousClass1.endViewOffset, length5))) {
                RichEditorHistory richEditorHistory = this.history;
                if (richEditorHistory != null) {
                    AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
                    richEditorHistory.commit();
                }
                if (RichTextStyle.hasLink(richEditTextTableEditText.getText(), iM9, iM10)) {
                    RichTextStyle.removeLink(richEditTextTableEditText.getText(), iM9, iM10);
                    richEditTextTableEditText.invalidateEffects();
                    persistTableCell(i, i2);
                    RichEditorHistory richEditorHistory2 = this.history;
                    if (richEditorHistory2 != null) {
                        richEditorHistory2.record();
                    }
                    refreshSelectionHighlight();
                }
                richEditTextTableEditText.setSelectionOverride(iM9, iM10);
                richEditTextTableEditText.makeSelectedDate();
                return;
            }
            return;
        }
        if (isDetailsSelection()) {
            int i3 = anonymousClass1.startViewPosition;
            RichEditText richEditTextDetailsEditText = detailsEditText(i3);
            if (richEditTextDetailsEditText != null && (iM7 = zzdv.m(anonymousClass1.startViewOffset, anonymousClass1.endViewOffset, (length4 = richEditTextDetailsEditText.length()))) < (iM8 = zzdu.m(anonymousClass1.startViewOffset, anonymousClass1.endViewOffset, length4))) {
                RichEditorHistory richEditorHistory3 = this.history;
                if (richEditorHistory3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(richEditorHistory3.commitRunnable);
                    richEditorHistory3.commit();
                }
                if (RichTextStyle.hasLink(richEditTextDetailsEditText.getText(), iM7, iM8)) {
                    RichTextStyle.removeLink(richEditTextDetailsEditText.getText(), iM7, iM8);
                    richEditTextDetailsEditText.invalidateEffects();
                    persistDetailsTitle(i3);
                    RichEditorHistory richEditorHistory4 = this.history;
                    if (richEditorHistory4 != null) {
                        richEditorHistory4.record();
                    }
                    refreshSelectionHighlight();
                }
                richEditTextDetailsEditText.setSelectionOverride(iM7, iM8);
                richEditTextDetailsEditText.makeSelectedDate();
                return;
            }
            return;
        }
        if (isCaptionSelection()) {
            int i4 = anonymousClass1.startViewPosition;
            RichEditText richEditTextCaptionEditText = captionEditText(i4);
            if (richEditTextCaptionEditText != null && (iM5 = zzdv.m(anonymousClass1.startViewOffset, anonymousClass1.endViewOffset, (length3 = richEditTextCaptionEditText.length()))) < (iM6 = zzdu.m(anonymousClass1.startViewOffset, anonymousClass1.endViewOffset, length3))) {
                RichEditorHistory richEditorHistory5 = this.history;
                if (richEditorHistory5 != null) {
                    AndroidUtilities.cancelRunOnUIThread(richEditorHistory5.commitRunnable);
                    richEditorHistory5.commit();
                }
                if (RichTextStyle.hasLink(richEditTextCaptionEditText.getText(), iM5, iM6)) {
                    RichTextStyle.removeLink(richEditTextCaptionEditText.getText(), iM5, iM6);
                    richEditTextCaptionEditText.invalidateEffects();
                    KeyEvent.Callback callbackSelectableAt = selectableAt(i4);
                    if (callbackSelectableAt instanceof RichCaptionHost) {
                        ((RichCaptionHost) callbackSelectableAt).persistCaption();
                    }
                    RichEditorHistory richEditorHistory6 = this.history;
                    if (richEditorHistory6 != null) {
                        richEditorHistory6.record();
                    }
                    refreshSelectionHighlight();
                }
                richEditTextCaptionEditText.setSelectionOverride(iM5, iM6);
                richEditTextCaptionEditText.makeSelectedDate();
                return;
            }
            return;
        }
        if (!isQuoteAuthorSelection()) {
            RichTextCell richTextCellSingleSelectionCell = singleSelectionCell();
            if (richTextCellSingleSelectionCell != null && (iM = zzdv.m(anonymousClass1.startViewOffset, anonymousClass1.endViewOffset, (length = richTextCellSingleSelectionCell.getEditText().length()))) < (iM2 = zzdu.m(anonymousClass1.startViewOffset, anonymousClass1.endViewOffset, length))) {
                RichEditorHistory richEditorHistory7 = this.history;
                if (richEditorHistory7 != null) {
                    AndroidUtilities.cancelRunOnUIThread(richEditorHistory7.commitRunnable);
                    richEditorHistory7.commit();
                }
                if (RichTextStyle.hasLink(richTextCellSingleSelectionCell.getEditText().getText(), iM, iM2)) {
                    RichTextStyle.removeLink(richTextCellSingleSelectionCell.getEditText().getText(), iM, iM2);
                    richTextCellSingleSelectionCell.getEditText().invalidateEffects();
                    richTextCellSingleSelectionCell.persistStyle();
                    RichEditorHistory richEditorHistory8 = this.history;
                    if (richEditorHistory8 != null) {
                        richEditorHistory8.record();
                    }
                    refreshSelectionHighlight();
                }
                richTextCellSingleSelectionCell.getEditText().setSelectionOverride(iM, iM2);
                richTextCellSingleSelectionCell.getEditText().makeSelectedDate();
                return;
            }
            return;
        }
        int i5 = anonymousClass1.startViewPosition;
        RichEditText richEditTextQuoteAuthorEditText = quoteAuthorEditText(i5);
        if (richEditTextQuoteAuthorEditText != null && (iM3 = zzdv.m(anonymousClass1.startViewOffset, anonymousClass1.endViewOffset, (length2 = richEditTextQuoteAuthorEditText.length()))) < (iM4 = zzdu.m(anonymousClass1.startViewOffset, anonymousClass1.endViewOffset, length2))) {
            RichEditorHistory richEditorHistory9 = this.history;
            if (richEditorHistory9 != null) {
                AndroidUtilities.cancelRunOnUIThread(richEditorHistory9.commitRunnable);
                richEditorHistory9.commit();
            }
            if (RichTextStyle.hasLink(richEditTextQuoteAuthorEditText.getText(), iM3, iM4)) {
                RichTextStyle.removeLink(richEditTextQuoteAuthorEditText.getText(), iM3, iM4);
                richEditTextQuoteAuthorEditText.invalidateEffects();
                View viewSelectableAt = selectableAt(i5);
                if (viewSelectableAt instanceof RichTextCell) {
                    ((RichTextCell) viewSelectableAt).persistAuthor();
                }
                RichEditorHistory richEditorHistory10 = this.history;
                if (richEditorHistory10 != null) {
                    richEditorHistory10.record();
                }
                refreshSelectionHighlight();
            }
            richEditTextQuoteAuthorEditText.setSelectionOverride(iM3, iM4);
            richEditTextQuoteAuthorEditText.makeSelectedDate();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.imeFocusListener);
        this.doNotDetachViews = false;
    }

    public final void onFormattingClicked(int i) {
        RichEditorHistory richEditorHistory;
        SpannableStringBuilder spannableStringBuilder;
        int i2;
        int length;
        int iM;
        int iM2;
        int length2;
        int iM3;
        int iM4;
        int length3;
        int iM5;
        int iM6;
        RichEditorHistory richEditorHistory2;
        int i3;
        AnonymousClass1 anonymousClass1 = this.textSelectionHelper;
        if (anonymousClass1 != null && anonymousClass1.isInSelectionMode()) {
            boolean zIsTableSelection = isTableSelection();
            Delegate delegate = this.delegate;
            int i4 = 0;
            if (zIsTableSelection) {
                int i5 = anonymousClass1.startViewPosition;
                int i6 = anonymousClass1.startViewChildPosition;
                int i7 = anonymousClass1.endViewChildPosition;
                int i8 = anonymousClass1.startViewOffset;
                int i9 = anonymousClass1.endViewOffset;
                boolean zIsStyleFullyAppliedTable = isStyleFullyAppliedTable(i, i5, i6, i8, i7, i9);
                int iClearMaskFor = !zIsStyleFullyAppliedTable ? clearMaskFor(i) : 0;
                RichEditorHistory richEditorHistory3 = this.history;
                if (richEditorHistory3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(richEditorHistory3.commitRunnable);
                    richEditorHistory3.commit();
                }
                this.suppressSpansChanged = true;
                int i10 = i6;
                boolean z = false;
                while (i10 <= i7) {
                    RichEditText richEditTextTableEditText = tableEditText(i5, i10);
                    if (richEditTextTableEditText == null) {
                        i3 = i6;
                    } else {
                        int length4 = richEditTextTableEditText.length();
                        int iMin = i10 == i6 ? i8 : 0;
                        int iMax = i10 == i7 ? i9 : length4;
                        if (i6 == i7) {
                            iMin = Math.min(i8, i9);
                            iMax = Math.max(i8, i9);
                        }
                        int i11 = iMin;
                        i3 = i6;
                        int iMax2 = Math.max(0, Math.min(i11, length4));
                        int iMax3 = Math.max(0, Math.min(iMax, length4));
                        if (iMax2 < iMax3) {
                            if (zIsStyleFullyAppliedTable) {
                                richEditTextTableEditText.removeStyle(i, iMax2, iMax3);
                            } else {
                                if (iClearMaskFor != 0) {
                                    richEditTextTableEditText.removeStyle(iClearMaskFor, iMax2, iMax3);
                                }
                                richEditTextTableEditText.addStyle(i, iMax2, iMax3);
                            }
                            richEditTextTableEditText.invalidateEffects();
                            richEditTextTableEditText.requestLayout();
                            persistTableCell(i5, i10);
                            z = true;
                        }
                    }
                    i10++;
                    i6 = i3;
                }
                this.suppressSpansChanged = false;
                if (z && (richEditorHistory2 = this.history) != null) {
                    richEditorHistory2.record();
                }
                delegate.onSelectionChanged();
                if (z) {
                    refreshSelectionHighlight();
                }
            } else if (isDetailsSelection()) {
                int i12 = anonymousClass1.startViewPosition;
                RichEditText richEditTextDetailsEditText = detailsEditText(i12);
                if (richEditTextDetailsEditText != null && (iM5 = zzdv.m(anonymousClass1.startViewOffset, anonymousClass1.endViewOffset, (length3 = richEditTextDetailsEditText.length()))) < (iM6 = zzdu.m(anonymousClass1.startViewOffset, anonymousClass1.endViewOffset, length3))) {
                    boolean z2 = (richEditTextDetailsEditText.getCurrentStyle(iM5, iM6) & i) == 0;
                    RichEditorHistory richEditorHistory4 = this.history;
                    if (richEditorHistory4 != null) {
                        AndroidUtilities.cancelRunOnUIThread(richEditorHistory4.commitRunnable);
                        richEditorHistory4.commit();
                    }
                    this.suppressSpansChanged = true;
                    if (z2) {
                        int iClearMaskFor2 = clearMaskFor(i);
                        if (iClearMaskFor2 != 0) {
                            richEditTextDetailsEditText.removeStyle(iClearMaskFor2, iM5, iM6);
                        }
                        richEditTextDetailsEditText.addStyle(i, iM5, iM6);
                    } else {
                        richEditTextDetailsEditText.removeStyle(i, iM5, iM6);
                    }
                    this.suppressSpansChanged = false;
                    persistDetailsTitle(i12);
                    richEditTextDetailsEditText.invalidateEffects();
                    richEditTextDetailsEditText.requestLayout();
                    RichEditorHistory richEditorHistory5 = this.history;
                    if (richEditorHistory5 != null) {
                        richEditorHistory5.record();
                    }
                    delegate.onSelectionChanged();
                    refreshSelectionHighlight();
                }
            } else if (isCaptionSelection()) {
                int i13 = anonymousClass1.startViewPosition;
                RichEditText richEditTextCaptionEditText = captionEditText(i13);
                if (richEditTextCaptionEditText != null && (iM3 = zzdv.m(anonymousClass1.startViewOffset, anonymousClass1.endViewOffset, (length2 = richEditTextCaptionEditText.length()))) < (iM4 = zzdu.m(anonymousClass1.startViewOffset, anonymousClass1.endViewOffset, length2))) {
                    boolean z3 = (richEditTextCaptionEditText.getCurrentStyle(iM3, iM4) & i) == 0;
                    int iClearMaskFor3 = z3 ? clearMaskFor(i) : 0;
                    RichEditorHistory richEditorHistory6 = this.history;
                    if (richEditorHistory6 != null) {
                        AndroidUtilities.cancelRunOnUIThread(richEditorHistory6.commitRunnable);
                        richEditorHistory6.commit();
                    }
                    this.suppressSpansChanged = true;
                    if (z3) {
                        if (iClearMaskFor3 != 0) {
                            richEditTextCaptionEditText.removeStyle(iClearMaskFor3, iM3, iM4);
                        }
                        richEditTextCaptionEditText.addStyle(i, iM3, iM4);
                    } else {
                        richEditTextCaptionEditText.removeStyle(i, iM3, iM4);
                    }
                    richEditTextCaptionEditText.invalidateEffects();
                    richEditTextCaptionEditText.requestLayout();
                    KeyEvent.Callback callbackSelectableAt = selectableAt(i13);
                    if (callbackSelectableAt instanceof RichCaptionHost) {
                        ((RichCaptionHost) callbackSelectableAt).persistCaption();
                    }
                    this.suppressSpansChanged = false;
                    RichEditorHistory richEditorHistory7 = this.history;
                    if (richEditorHistory7 != null) {
                        richEditorHistory7.record();
                    }
                    delegate.onSelectionChanged();
                    refreshSelectionHighlight();
                }
            } else if (isQuoteAuthorSelection()) {
                int i14 = anonymousClass1.startViewPosition;
                RichEditText richEditTextQuoteAuthorEditText = quoteAuthorEditText(i14);
                if (richEditTextQuoteAuthorEditText != null && (iM = zzdv.m(anonymousClass1.startViewOffset, anonymousClass1.endViewOffset, (length = richEditTextQuoteAuthorEditText.length()))) < (iM2 = zzdu.m(anonymousClass1.startViewOffset, anonymousClass1.endViewOffset, length))) {
                    boolean z4 = (richEditTextQuoteAuthorEditText.getCurrentStyle(iM, iM2) & i) == 0;
                    int iClearMaskFor4 = z4 ? clearMaskFor(i) : 0;
                    RichEditorHistory richEditorHistory8 = this.history;
                    if (richEditorHistory8 != null) {
                        AndroidUtilities.cancelRunOnUIThread(richEditorHistory8.commitRunnable);
                        richEditorHistory8.commit();
                    }
                    this.suppressSpansChanged = true;
                    if (z4) {
                        if (iClearMaskFor4 != 0) {
                            richEditTextQuoteAuthorEditText.removeStyle(iClearMaskFor4, iM, iM2);
                        }
                        richEditTextQuoteAuthorEditText.addStyle(i, iM, iM2);
                    } else {
                        richEditTextQuoteAuthorEditText.removeStyle(i, iM, iM2);
                    }
                    richEditTextQuoteAuthorEditText.invalidateEffects();
                    richEditTextQuoteAuthorEditText.requestLayout();
                    View viewSelectableAt = selectableAt(i14);
                    if (viewSelectableAt instanceof RichTextCell) {
                        ((RichTextCell) viewSelectableAt).persistAuthor();
                    }
                    this.suppressSpansChanged = false;
                    RichEditorHistory richEditorHistory9 = this.history;
                    if (richEditorHistory9 != null) {
                        richEditorHistory9.record();
                    }
                    delegate.onSelectionChanged();
                    refreshSelectionHighlight();
                }
            } else {
                int i15 = anonymousClass1.startViewPosition;
                int i16 = anonymousClass1.endViewPosition;
                int i17 = anonymousClass1.startViewOffset;
                int i18 = anonymousClass1.endViewOffset;
                if (i15 >= 0 && i16 >= 0 && i16 >= i15 && i16 < this.itemRows.size()) {
                    int i19 = i;
                    boolean zIsStyleFullyApplied = isStyleFullyApplied(i19, i15, i17, i16, i18);
                    boolean z5 = !zIsStyleFullyApplied;
                    int iClearMaskFor5 = !zIsStyleFullyApplied ? clearMaskFor(i19) : 0;
                    RichEditorHistory richEditorHistory10 = this.history;
                    if (richEditorHistory10 != null) {
                        AndroidUtilities.cancelRunOnUIThread(richEditorHistory10.commitRunnable);
                        richEditorHistory10.commit();
                    }
                    this.suppressSpansChanged = true;
                    int i20 = i15;
                    boolean z6 = false;
                    while (i20 <= i16) {
                        BlockRow blockRowRowForCell = rowForCell(i20);
                        if (blockRowRowForCell != null) {
                            TL_iv.PageBlock pageBlock = blockRowRowForCell.block;
                            if (isFormattable(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
                                int iBlockTextLength = blockTextLength(i20);
                                int i21 = i20 == i15 ? i17 : 0;
                                int i22 = i20 == i16 ? i18 : iBlockTextLength;
                                int iMax4 = Math.max(i4, Math.min(i21, iBlockTextLength));
                                int iMax5 = Math.max(i4, Math.min(i22, iBlockTextLength));
                                if (iMax4 < iMax5) {
                                    RichTextCell richTextCellCellAt = cellAt(i20);
                                    if (richTextCellCellAt != null) {
                                        FloatingToolbar.StyleDelegate styleDelegate = richTextCellCellAt.getStyleDelegate();
                                        if (zIsStyleFullyApplied) {
                                            styleDelegate.removeStyle(i19, iMax4, iMax5);
                                        } else {
                                            if (iClearMaskFor5 != 0) {
                                                styleDelegate.removeStyle(iClearMaskFor5, iMax4, iMax5);
                                            }
                                            styleDelegate.addStyle(i19, iMax4, iMax5);
                                        }
                                        richTextCellCellAt.getEditText().invalidateEffects();
                                        richTextCellCellAt.getEditText().requestLayout();
                                        richTextCellCellAt.persistStyle();
                                        iClearMaskFor5 = iClearMaskFor5;
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(RichTextCell.readStyledText(blockRowRowForCell.block));
                                        if (zIsStyleFullyApplied || iClearMaskFor5 == 0) {
                                            iClearMaskFor5 = iClearMaskFor5;
                                            spannableStringBuilder = spannableStringBuilder2;
                                            i2 = iMax4;
                                        } else {
                                            iClearMaskFor5 = iClearMaskFor5;
                                            i2 = iMax4;
                                            RichTextStyle.setStyle(spannableStringBuilder2, i2, iMax5, iClearMaskFor5, false, null);
                                            spannableStringBuilder = spannableStringBuilder2;
                                        }
                                        RichTextStyle.setStyle(spannableStringBuilder, i2, iMax5, i19, z5, null);
                                        blockRowRowForCell.block.text = RichTextStyle.fromSpannable(spannableStringBuilder);
                                    }
                                    z6 = true;
                                }
                            }
                            z6 = z6;
                        } else {
                            z6 = z6;
                        }
                        i20++;
                        i19 = i;
                        iClearMaskFor5 = iClearMaskFor5;
                        i4 = 0;
                    }
                    boolean z7 = z6;
                    this.suppressSpansChanged = false;
                    if (z7 && (richEditorHistory = this.history) != null) {
                        richEditorHistory.record();
                    }
                    delegate.onSelectionChanged();
                    if (z7) {
                        refreshSelectionHighlight();
                    }
                }
            }
        }
    }

    public final void onInlineButtonClicked(View view) {
        InlineButtonEdit inlineButtonEdit;
        RichEditorListView richEditorListView;
        RichEditText editText;
        RichEditText richEditText;
        if (canCreateInlineButtonOnSelection()) {
            boolean zIsTableSelection = isTableSelection();
            AnonymousClass1 anonymousClass1 = this.textSelectionHelper;
            if (zIsTableSelection) {
                int i = anonymousClass1.startViewPosition;
                int i2 = anonymousClass1.startViewChildPosition;
                if (i2 == anonymousClass1.endViewChildPosition) {
                    editText = tableEditText(i, i2);
                    richEditText = editText;
                    if (richEditText == null) {
                        int length = richEditText.length();
                        richEditorListView = this;
                        inlineButtonEdit = richEditorListView.new InlineButtonEdit(richEditText, zzdv.m(anonymousClass1.startViewOffset, anonymousClass1.endViewOffset, length), zzdu.m(anonymousClass1.startViewOffset, anonymousClass1.endViewOffset, length), null);
                    }
                }
            } else {
                if (isDetailsSelection()) {
                    editText = detailsEditText(anonymousClass1.startViewPosition);
                } else if (isCaptionSelection()) {
                    editText = captionEditText(anonymousClass1.startViewPosition);
                } else if (isQuoteAuthorSelection()) {
                    editText = quoteAuthorEditText(anonymousClass1.startViewPosition);
                } else {
                    RichTextCell richTextCellSingleSelectionCell = singleSelectionCell();
                    if (richTextCellSingleSelectionCell != null) {
                        editText = richTextCellSingleSelectionCell.getEditText();
                    }
                }
                richEditText = editText;
                if (richEditText == null) {
                    int length2 = richEditText.length();
                    richEditorListView = this;
                    inlineButtonEdit = richEditorListView.new InlineButtonEdit(richEditText, zzdv.m(anonymousClass1.startViewOffset, anonymousClass1.endViewOffset, length2), zzdu.m(anonymousClass1.startViewOffset, anonymousClass1.endViewOffset, length2), null);
                }
            }
            inlineButtonEdit = null;
            richEditorListView = this;
        } else {
            inlineButtonEdit = null;
            richEditorListView = this;
        }
        if (inlineButtonEdit != null) {
            hideTextSelectionUi(false);
            richEditorListView.delegate.onInlineButtonEditRequested(inlineButtonEdit, view);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i4 - i2;
        int i6 = this.lastListHeight;
        boolean z2 = i6 > 0 && i5 < i6;
        super.onLayout(z, i, i2, i3, i4);
        if (z2) {
            View viewFindFocus = findFocus();
            View viewFindContainingItemView = viewFindFocus == null ? null : findContainingItemView(viewFindFocus);
            if (viewFindContainingItemView != null) {
                int iDp = (AndroidUtilities.dp(8.0f) + viewFindContainingItemView.getBottom()) - (i5 - getPaddingBottom());
                if (iDp > 0) {
                    post(new RichEditorListView$$ExternalSyntheticLambda5(this, iDp, 0));
                }
            }
        }
        this.lastListHeight = i5;
    }

    @Override
    public final void onLayoutUpdate() {
        Delegate delegate = this.delegate;
        if (delegate != null) {
            delegate.onListLayoutUpdated();
        }
    }

    public final void onLinkClicked() {
        int length;
        int iM;
        int iM2;
        int length2;
        int iM3;
        int iM4;
        int length3;
        int iM5;
        int iM6;
        int length4;
        int iM7;
        int iM8;
        RichEditText richEditTextTableEditText;
        int length5;
        int iM9;
        int iM10;
        boolean zIsTableSelection = isTableSelection();
        Delegate delegate = this.delegate;
        AnonymousClass1 anonymousClass1 = this.textSelectionHelper;
        if (zIsTableSelection) {
            int i = anonymousClass1.startViewPosition;
            int i2 = anonymousClass1.startViewChildPosition;
            if (i2 == anonymousClass1.endViewChildPosition && (richEditTextTableEditText = tableEditText(i, i2)) != null && (iM9 = zzdv.m(anonymousClass1.startViewOffset, anonymousClass1.endViewOffset, (length5 = richEditTextTableEditText.length()))) < (iM10 = zzdu.m(anonymousClass1.startViewOffset, anonymousClass1.endViewOffset, length5))) {
                if (RichTextStyle.hasLink(richEditTextTableEditText.getText(), iM9, iM10)) {
                    RichEditorHistory richEditorHistory = this.history;
                    if (richEditorHistory != null) {
                        AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
                        richEditorHistory.commit();
                    }
                    RichTextStyle.removeLink(richEditTextTableEditText.getText(), iM9, iM10);
                    richEditTextTableEditText.invalidateEffects();
                    persistTableCell(i, i2);
                    RichEditorHistory richEditorHistory2 = this.history;
                    if (richEditorHistory2 != null) {
                        richEditorHistory2.record();
                    }
                    delegate.onSelectionChanged();
                    refreshSelectionHighlight();
                    return;
                }
                RichEditorHistory richEditorHistory3 = this.history;
                if (richEditorHistory3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(richEditorHistory3.commitRunnable);
                    richEditorHistory3.commit();
                }
                if (RichTextStyle.hasDate(richEditTextTableEditText.getText(), iM9, iM10)) {
                    RichTextStyle.removeDate(richEditTextTableEditText.getText(), iM9, iM10);
                    richEditTextTableEditText.invalidateEffects();
                    persistTableCell(i, i2);
                    RichEditorHistory richEditorHistory4 = this.history;
                    if (richEditorHistory4 != null) {
                        richEditorHistory4.record();
                    }
                    refreshSelectionHighlight();
                }
                richEditTextTableEditText.setSelectionOverride(iM9, iM10);
                hideTextSelectionUi(false);
                showSelectedUrlDialog(richEditTextTableEditText);
                return;
            }
            return;
        }
        if (isDetailsSelection()) {
            int i3 = anonymousClass1.startViewPosition;
            RichEditText richEditTextDetailsEditText = detailsEditText(i3);
            if (richEditTextDetailsEditText != null && (iM7 = zzdv.m(anonymousClass1.startViewOffset, anonymousClass1.endViewOffset, (length4 = richEditTextDetailsEditText.length()))) < (iM8 = zzdu.m(anonymousClass1.startViewOffset, anonymousClass1.endViewOffset, length4))) {
                if (RichTextStyle.hasLink(richEditTextDetailsEditText.getText(), iM7, iM8)) {
                    RichEditorHistory richEditorHistory5 = this.history;
                    if (richEditorHistory5 != null) {
                        AndroidUtilities.cancelRunOnUIThread(richEditorHistory5.commitRunnable);
                        richEditorHistory5.commit();
                    }
                    RichTextStyle.removeLink(richEditTextDetailsEditText.getText(), iM7, iM8);
                    richEditTextDetailsEditText.invalidateEffects();
                    persistDetailsTitle(i3);
                    RichEditorHistory richEditorHistory6 = this.history;
                    if (richEditorHistory6 != null) {
                        richEditorHistory6.record();
                    }
                    delegate.onSelectionChanged();
                    refreshSelectionHighlight();
                    return;
                }
                RichEditorHistory richEditorHistory7 = this.history;
                if (richEditorHistory7 != null) {
                    AndroidUtilities.cancelRunOnUIThread(richEditorHistory7.commitRunnable);
                    richEditorHistory7.commit();
                }
                if (RichTextStyle.hasDate(richEditTextDetailsEditText.getText(), iM7, iM8)) {
                    RichTextStyle.removeDate(richEditTextDetailsEditText.getText(), iM7, iM8);
                    richEditTextDetailsEditText.invalidateEffects();
                    persistDetailsTitle(i3);
                    RichEditorHistory richEditorHistory8 = this.history;
                    if (richEditorHistory8 != null) {
                        richEditorHistory8.record();
                    }
                    refreshSelectionHighlight();
                }
                richEditTextDetailsEditText.setSelectionOverride(iM7, iM8);
                hideTextSelectionUi(false);
                showSelectedUrlDialog(richEditTextDetailsEditText);
                return;
            }
            return;
        }
        if (isCaptionSelection()) {
            int i4 = anonymousClass1.startViewPosition;
            RichEditText richEditTextCaptionEditText = captionEditText(i4);
            if (richEditTextCaptionEditText != null && (iM5 = zzdv.m(anonymousClass1.startViewOffset, anonymousClass1.endViewOffset, (length3 = richEditTextCaptionEditText.length()))) < (iM6 = zzdu.m(anonymousClass1.startViewOffset, anonymousClass1.endViewOffset, length3))) {
                if (RichTextStyle.hasLink(richEditTextCaptionEditText.getText(), iM5, iM6)) {
                    RichEditorHistory richEditorHistory9 = this.history;
                    if (richEditorHistory9 != null) {
                        AndroidUtilities.cancelRunOnUIThread(richEditorHistory9.commitRunnable);
                        richEditorHistory9.commit();
                    }
                    RichTextStyle.removeLink(richEditTextCaptionEditText.getText(), iM5, iM6);
                    richEditTextCaptionEditText.invalidateEffects();
                    KeyEvent.Callback callbackSelectableAt = selectableAt(i4);
                    if (callbackSelectableAt instanceof RichCaptionHost) {
                        ((RichCaptionHost) callbackSelectableAt).persistCaption();
                    }
                    RichEditorHistory richEditorHistory10 = this.history;
                    if (richEditorHistory10 != null) {
                        richEditorHistory10.record();
                    }
                    delegate.onSelectionChanged();
                    refreshSelectionHighlight();
                    return;
                }
                RichEditorHistory richEditorHistory11 = this.history;
                if (richEditorHistory11 != null) {
                    AndroidUtilities.cancelRunOnUIThread(richEditorHistory11.commitRunnable);
                    richEditorHistory11.commit();
                }
                if (RichTextStyle.hasDate(richEditTextCaptionEditText.getText(), iM5, iM6)) {
                    RichTextStyle.removeDate(richEditTextCaptionEditText.getText(), iM5, iM6);
                    richEditTextCaptionEditText.invalidateEffects();
                    KeyEvent.Callback callbackSelectableAt2 = selectableAt(i4);
                    if (callbackSelectableAt2 instanceof RichCaptionHost) {
                        ((RichCaptionHost) callbackSelectableAt2).persistCaption();
                    }
                    RichEditorHistory richEditorHistory12 = this.history;
                    if (richEditorHistory12 != null) {
                        richEditorHistory12.record();
                    }
                    refreshSelectionHighlight();
                }
                richEditTextCaptionEditText.setSelectionOverride(iM5, iM6);
                hideTextSelectionUi(false);
                showSelectedUrlDialog(richEditTextCaptionEditText);
                return;
            }
            return;
        }
        if (!isQuoteAuthorSelection()) {
            RichTextCell richTextCellSingleSelectionCell = singleSelectionCell();
            if (richTextCellSingleSelectionCell != null && (iM = zzdv.m(anonymousClass1.startViewOffset, anonymousClass1.endViewOffset, (length = richTextCellSingleSelectionCell.getEditText().length()))) < (iM2 = zzdu.m(anonymousClass1.startViewOffset, anonymousClass1.endViewOffset, length))) {
                if (RichTextStyle.hasLink(richTextCellSingleSelectionCell.getEditText().getText(), iM, iM2)) {
                    RichEditorHistory richEditorHistory13 = this.history;
                    if (richEditorHistory13 != null) {
                        AndroidUtilities.cancelRunOnUIThread(richEditorHistory13.commitRunnable);
                        richEditorHistory13.commit();
                    }
                    RichTextStyle.removeLink(richTextCellSingleSelectionCell.getEditText().getText(), iM, iM2);
                    richTextCellSingleSelectionCell.getEditText().invalidateEffects();
                    richTextCellSingleSelectionCell.persistStyle();
                    RichEditorHistory richEditorHistory14 = this.history;
                    if (richEditorHistory14 != null) {
                        richEditorHistory14.record();
                    }
                    delegate.onSelectionChanged();
                    refreshSelectionHighlight();
                    return;
                }
                RichEditorHistory richEditorHistory15 = this.history;
                if (richEditorHistory15 != null) {
                    AndroidUtilities.cancelRunOnUIThread(richEditorHistory15.commitRunnable);
                    richEditorHistory15.commit();
                }
                if (RichTextStyle.hasDate(richTextCellSingleSelectionCell.getEditText().getText(), iM, iM2)) {
                    RichTextStyle.removeDate(richTextCellSingleSelectionCell.getEditText().getText(), iM, iM2);
                    richTextCellSingleSelectionCell.getEditText().invalidateEffects();
                    richTextCellSingleSelectionCell.persistStyle();
                    RichEditorHistory richEditorHistory16 = this.history;
                    if (richEditorHistory16 != null) {
                        richEditorHistory16.record();
                    }
                    refreshSelectionHighlight();
                }
                richTextCellSingleSelectionCell.getEditText().setSelectionOverride(iM, iM2);
                hideTextSelectionUi(false);
                showSelectedUrlDialog(richTextCellSingleSelectionCell.getEditText());
                return;
            }
            return;
        }
        int i5 = anonymousClass1.startViewPosition;
        RichEditText richEditTextQuoteAuthorEditText = quoteAuthorEditText(i5);
        if (richEditTextQuoteAuthorEditText != null && (iM3 = zzdv.m(anonymousClass1.startViewOffset, anonymousClass1.endViewOffset, (length2 = richEditTextQuoteAuthorEditText.length()))) < (iM4 = zzdu.m(anonymousClass1.startViewOffset, anonymousClass1.endViewOffset, length2))) {
            if (RichTextStyle.hasLink(richEditTextQuoteAuthorEditText.getText(), iM3, iM4)) {
                RichEditorHistory richEditorHistory17 = this.history;
                if (richEditorHistory17 != null) {
                    AndroidUtilities.cancelRunOnUIThread(richEditorHistory17.commitRunnable);
                    richEditorHistory17.commit();
                }
                RichTextStyle.removeLink(richEditTextQuoteAuthorEditText.getText(), iM3, iM4);
                richEditTextQuoteAuthorEditText.invalidateEffects();
                View viewSelectableAt = selectableAt(i5);
                if (viewSelectableAt instanceof RichTextCell) {
                    ((RichTextCell) viewSelectableAt).persistAuthor();
                }
                RichEditorHistory richEditorHistory18 = this.history;
                if (richEditorHistory18 != null) {
                    richEditorHistory18.record();
                }
                delegate.onSelectionChanged();
                refreshSelectionHighlight();
                return;
            }
            RichEditorHistory richEditorHistory19 = this.history;
            if (richEditorHistory19 != null) {
                AndroidUtilities.cancelRunOnUIThread(richEditorHistory19.commitRunnable);
                richEditorHistory19.commit();
            }
            if (RichTextStyle.hasDate(richEditTextQuoteAuthorEditText.getText(), iM3, iM4)) {
                RichTextStyle.removeDate(richEditTextQuoteAuthorEditText.getText(), iM3, iM4);
                richEditTextQuoteAuthorEditText.invalidateEffects();
                View viewSelectableAt2 = selectableAt(i5);
                if (viewSelectableAt2 instanceof RichTextCell) {
                    ((RichTextCell) viewSelectableAt2).persistAuthor();
                }
                RichEditorHistory richEditorHistory20 = this.history;
                if (richEditorHistory20 != null) {
                    richEditorHistory20.record();
                }
                refreshSelectionHighlight();
            }
            richEditTextQuoteAuthorEditText.setSelectionOverride(iM3, iM4);
            hideTextSelectionUi(false);
            showSelectedUrlDialog(richEditTextQuoteAuthorEditText);
        }
    }

    public final void onMathClicked() {
        RichEditText editText;
        Runnable richTextCell$$ExternalSyntheticLambda7;
        int length;
        final int iM;
        final int iM2;
        String string;
        int i = 1;
        AnonymousClass1 anonymousClass1 = this.textSelectionHelper;
        if (anonymousClass1 == null || !anonymousClass1.isInSelectionMode()) {
            return;
        }
        if (isTableSelection()) {
            int i2 = anonymousClass1.startViewPosition;
            int i3 = anonymousClass1.startViewChildPosition;
            if (i3 != anonymousClass1.endViewChildPosition) {
                return;
            }
            editText = tableEditText(i2, i3);
            richTextCell$$ExternalSyntheticLambda7 = new RichEditorListView$$ExternalSyntheticLambda0(this, i2, i3, 1);
        } else if (isDetailsSelection()) {
            int i4 = anonymousClass1.startViewPosition;
            editText = detailsEditText(i4);
            richTextCell$$ExternalSyntheticLambda7 = new RichEditorListView$$ExternalSyntheticLambda5(this, i4, i);
        } else if (isCaptionSelection()) {
            int i5 = anonymousClass1.startViewPosition;
            editText = captionEditText(i5);
            richTextCell$$ExternalSyntheticLambda7 = new RichEditorListView$$ExternalSyntheticLambda5(this, i5, 2);
        } else if (isQuoteAuthorSelection()) {
            int i6 = anonymousClass1.startViewPosition;
            editText = quoteAuthorEditText(i6);
            richTextCell$$ExternalSyntheticLambda7 = new RichEditorListView$$ExternalSyntheticLambda5(this, i6, 3);
        } else {
            RichTextCell richTextCellSingleSelectionCell = singleSelectionCell();
            if (richTextCellSingleSelectionCell == null) {
                return;
            }
            editText = richTextCellSingleSelectionCell.getEditText();
            richTextCell$$ExternalSyntheticLambda7 = new RichTextCell$$ExternalSyntheticLambda7(richTextCellSingleSelectionCell, i);
        }
        final RichEditText richEditText = editText;
        final Runnable runnable = richTextCell$$ExternalSyntheticLambda7;
        if (richEditText != null && (iM = zzdv.m(anonymousClass1.startViewOffset, anonymousClass1.endViewOffset, (length = richEditText.length()))) <= (iM2 = zzdu.m(anonymousClass1.startViewOffset, anonymousClass1.endViewOffset, length))) {
            Editable text = richEditText.getText();
            int i7 = MathSpan.$r8$clinit;
            if (text != null) {
                MathSpan[] mathSpanArr = (MathSpan[]) text.getSpans(iM, iM2, MathSpan.class);
                if (mathSpanArr.length > 0) {
                    string = mathSpanArr[0].source;
                } else {
                    string = null;
                }
            } else {
                string = null;
            }
            if (string == null) {
                string = richEditText.getText().subSequence(iM, iM2).toString();
            }
            final float fDp = AndroidUtilities.dp(SharedConfig.fontSize + 4);
            int i8 = Theme.key_windowBackgroundWhiteBlackText;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            final int color = Theme.getColor(i8, resourcesProvider);
            ChatAttachAlertRichLayout.showEditLatexSheet(getContext(), string, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    String str = (String) obj;
                    RichEditorListView richEditorListView = this.f$0;
                    richEditorListView.getClass();
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    MathSpan mathSpanCreate = MathSpan.create(str, color, fDp);
                    if (mathSpanCreate == null) {
                        return;
                    }
                    RichEditorHistory richEditorHistory = richEditorListView.history;
                    if (richEditorHistory != null) {
                        AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
                        richEditorHistory.commit();
                    }
                    RichEditorListView.AnonymousClass1 anonymousClass2 = richEditorListView.textSelectionHelper;
                    if (anonymousClass2 != null) {
                        anonymousClass2.clear(false);
                    }
                    RichEditText richEditText2 = richEditText;
                    richEditText2.setLocked(false);
                    SpannableString spannableString = new SpannableString(" ");
                    spannableString.setSpan(mathSpanCreate, 0, 1, 33);
                    Editable text2 = richEditText2.getText();
                    int iMax = Math.max(0, Math.min(iM, text2.length()));
                    text2.replace(iMax, Math.max(iMax, Math.min(iM2, text2.length())), spannableString);
                    runnable.run();
                    RichEditorHistory richEditorHistory2 = richEditorListView.history;
                    if (richEditorHistory2 != null) {
                        richEditorHistory2.record();
                    }
                    richEditorListView.delegate.onContentChanged();
                    int iMin = Math.min(iMax + 1, richEditText2.length());
                    richEditText2.requestEditFocus();
                    richEditorListView.post(new RichEditorListView$$ExternalSyntheticLambda63(richEditText2, iMin, 3));
                }
            }, resourcesProvider);
        }
    }

    @Override
    public final void onReorderEnd() {
        Delegate delegate = this.delegate;
        if (delegate != null) {
            delegate.onReorderEnd();
        }
        resyncInsetCells();
    }

    @Override
    public final void onReorderMoved(RecyclerView.ViewHolder viewHolder) {
        Delegate delegate = this.delegate;
        if (delegate == null || viewHolder == null) {
            return;
        }
        int[] iArr = new int[2];
        View view = viewHolder.itemView;
        view.getLocationOnScreen(iArr);
        view.getWidth();
        this.draggingOverTrash = delegate.onReorderMove(view.getHeight() + iArr[1]);
    }

    @Override
    public final void onReorderRemove(RecyclerView.ViewHolder viewHolder) {
        BlockRow blockRow = this.draggingRow;
        this.draggingRow = null;
        this.draggingOverTrash = false;
        if (blockRow == null) {
            if (viewHolder != null) {
                View view = viewHolder.itemView;
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                return;
            }
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
            richEditorHistory.commit();
        }
        ArrayList arrayList = this.rows;
        int iIndexOf = arrayList.indexOf(blockRow);
        if (iIndexOf >= 0) {
            arrayList.remove(iIndexOf);
            this.adapter.update(true);
        }
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        Delegate delegate = this.delegate;
        if (delegate != null) {
            delegate.onContentChanged();
        }
    }

    @Override
    public final void onReorderStart(RecyclerView.ViewHolder viewHolder) {
        BlockRow blockRow;
        int adapterPosition;
        UItem item;
        if (viewHolder == null || (adapterPosition = viewHolder.getAdapterPosition()) < 0 || (item = this.adapter.getItem(adapterPosition)) == null) {
            blockRow = null;
        } else {
            Object obj = item.object;
            if (obj instanceof BlockRow) {
                blockRow = (BlockRow) obj;
            } else {
                blockRow = null;
            }
        }
        this.draggingRow = blockRow;
        this.draggingOverTrash = false;
        Delegate delegate = this.delegate;
        if (delegate != null) {
            delegate.onReorderStart();
        }
    }

    public final void pasteAtHelperSelection() {
        ClipData primaryClip;
        String htmlText;
        RichEditorListView richEditorListView;
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (clipboardManager == null || !clipboardManager.hasPrimaryClip() || (primaryClip = clipboardManager.getPrimaryClip()) == null || primaryClip.getItemCount() == 0) {
            return;
        }
        ClipData.Item itemAt = primaryClip.getItemAt(0);
        if (primaryClip.getDescription() == null || !primaryClip.getDescription().hasMimeType("text/html")) {
            htmlText = null;
        } else {
            try {
                htmlText = itemAt.getHtmlText();
            } catch (Exception unused) {
                htmlText = null;
            }
        }
        boolean zIsEmpty = TextUtils.isEmpty(htmlText);
        AnonymousClass1 anonymousClass1 = this.textSelectionHelper;
        if (zIsEmpty) {
            richEditorListView = this;
        } else {
            try {
                HashMap map = new HashMap();
                ArrayList arrayListResolvePastedMedia = resolvePastedMedia(RichHtml.parse(htmlText, map));
                if (arrayListResolvePastedMedia.isEmpty()) {
                    richEditorListView = this;
                } else {
                    ArrayList arrayList = this.rows;
                    richEditorListView = this;
                    try {
                        if (richEditorListView.spliceBlocksInto(arrayList.indexOf(rowForCell(anonymousClass1.startViewPosition)), arrayList.indexOf(rowForCell(anonymousClass1.endViewPosition)), anonymousClass1.startViewOffset, anonymousClass1.endViewOffset, arrayListResolvePastedMedia)) {
                            if (map.isEmpty()) {
                                return;
                            }
                            richEditorListView.quoteAuthors.putAll(map);
                            return;
                        }
                    } catch (Exception e) {
                        e = e;
                        FileLog.e(e);
                    }
                }
            } catch (Exception e2) {
                e = e2;
                richEditorListView = this;
            }
        }
        CharSequence charSequenceCoerceToText = itemAt.coerceToText(getContext());
        if (charSequenceCoerceToText == null) {
            charSequenceCoerceToText = "";
        }
        richEditorListView.applyEditRange(anonymousClass1.startViewPosition, anonymousClass1.startViewOffset, anonymousClass1.endViewPosition, anonymousClass1.endViewOffset, charSequenceCoerceToText.toString().split("\n", -1));
    }

    public final void persistDetailsTitle(int i) {
        BlockRow blockRowRowForCell = rowForCell(i);
        RichEditText richEditTextDetailsEditText = detailsEditText(i);
        if (!isDetailsHeader(blockRowRowForCell) || richEditTextDetailsEditText == null) {
            return;
        }
        ((TL_iv.pageBlockDetails) blockRowRowForCell.block).title = RichTextStyle.fromSpannable(richEditTextDetailsEditText.getText());
    }

    public final void persistTableCell(int i, int i2) {
        RichTableCellHost richTableCellHostHostForAnchor;
        int i3;
        View viewSelectableAt = selectableAt(i);
        if (viewSelectableAt instanceof RichTableCell) {
            RichTableCell richTableCell = (RichTableCell) viewSelectableAt;
            richTableCell.getClass();
            if (i2 != 0) {
                TableModel tableModel = richTableCell.model;
                TL_iv.pageTableCell pagetablecell = (tableModel == null || i2 <= 0 || (i3 = i2 + (-1)) >= tableModel.anchorsRowMajor.size()) ? null : (TL_iv.pageTableCell) richTableCell.model.anchorsRowMajor.get(i3);
                if (pagetablecell == null || (richTableCellHostHostForAnchor = richTableCell.getGrid().hostForAnchor(pagetablecell)) == null) {
                    return;
                }
                TableModel.applyStyledText(pagetablecell, richTableCellHostHostForAnchor.editText.getText());
                return;
            }
            BlockRow blockRow = richTableCell.currentRow;
            if (blockRow != null) {
                TL_iv.PageBlock pageBlock = blockRow.block;
                if (pageBlock instanceof TL_iv.pageBlockTable) {
                    ((TL_iv.pageBlockTable) pageBlock).title = RichTextStyle.fromSpannable(richTableCell.titleEditText.getText());
                }
            }
        }
    }

    public final void prepareEditText(RichEditText richEditText) {
        if (richEditText == null) {
            return;
        }
        richEditText.adaptiveCreateLinkDialog = this.adaptiveLinkDialogs;
        richEditText.setInlineButtonContext(this.currentAccount);
        richEditText.setInlineButtonClickListener(new RichEditorListView$$ExternalSyntheticLambda37(this));
    }

    public final int prevTextOffset(int i) {
        Layout layout;
        View viewSelectableAt = selectableAt(i);
        if (!(viewSelectableAt instanceof RichTextCell) || (layout = ((RichTextCell) viewSelectableAt).getEditText().getLayout()) == null) {
            return 0;
        }
        return layout.getText().length();
    }

    public final RichEditText quoteAuthorEditText(int i) {
        View viewSelectableAt = selectableAt(i);
        if (viewSelectableAt instanceof RichTextCell) {
            return ((RichTextCell) viewSelectableAt).getAuthorEditText();
        }
        return null;
    }

    public final void rangeIndent(int i, int i2, boolean z) {
        boolean z2;
        if (i < 0 || i2 < i) {
            return;
        }
        ArrayList arrayList = this.rows;
        if (i2 >= arrayList.size()) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
            richEditorHistory.commit();
        }
        if (z) {
            z2 = false;
            while (i2 >= i) {
                if (indentRow(i2, true, true)) {
                    z2 = true;
                }
                i2--;
            }
        } else {
            BlockRow blockRow = (BlockRow) arrayList.get(i);
            if (blockRow.level >= 1 && (i == 0 || ((BlockRow) arrayList.get(i - 1)).level < blockRow.level)) {
                return;
            }
            z2 = false;
            while (i <= i2) {
                if (indentRow(i, false, true)) {
                    z2 = true;
                }
                i++;
            }
        }
        if (z2) {
            renumberAllRuns();
            if (findFocus() instanceof RichEditText) {
                applyInPlaceUpdateKeepingFocus();
            } else {
                this.adapter.update(false);
            }
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
        }
    }

    public final void refreshMediaCell(BlockRow blockRow) {
        View viewFindViewByItemObject = findViewByItemObject(blockRow);
        if (viewFindViewByItemObject instanceof RichMediaCell) {
            RichMediaCell richMediaCell = (RichMediaCell) viewFindViewByItemObject;
            if (richMediaCell.currentRow == null) {
                return;
            }
            richMediaCell.rebuildItems();
            int i = richMediaCell.currentPage;
            ArrayList arrayList = richMediaCell.items;
            if (i >= arrayList.size()) {
                richMediaCell.currentPage = Math.max(0, arrayList.size() - 1);
            }
            richMediaCell.updateSwitchButton(false);
            richMediaCell.requestLayout();
            richMediaCell.invalidate();
        }
    }

    public final void refreshSelectionHighlight() {
        post(new RichEditorListView$$ExternalSyntheticLambda4(this, 4));
    }

    public final void refreshVisibleListPaddingAround(int i) {
        ArrayList arrayList = this.rows;
        int iMin = Math.min(arrayList.size() - 1, i + 1);
        for (int iMax = Math.max(0, i - 1); iMax <= iMin; iMax++) {
            BlockRow blockRow = (BlockRow) arrayList.get(iMax);
            if (blockRow.level > 0) {
                View viewFindViewByItemObject = findViewByItemObject(blockRow);
                if (viewFindViewByItemObject instanceof RichTextCell) {
                    ((RichTextCell) viewFindViewByItemObject).syncLiveListVerticalPadding();
                }
            }
        }
    }

    public final void removeMediaFromRow(BlockRow blockRow, MediaUploadState mediaUploadState) {
        if (blockRow == null) {
            return;
        }
        boolean zIsGallery = isGallery(blockRow.block);
        UniversalAdapter universalAdapter = this.adapter;
        ArrayList arrayList = this.rows;
        if (!zIsGallery) {
            int iIndexOf = arrayList.indexOf(blockRow);
            if (iIndexOf >= 0) {
                arrayList.remove(iIndexOf);
                universalAdapter.update(true);
                return;
            }
            return;
        }
        ArrayList arrayListGalleryItems = galleryItems(blockRow.block);
        ArrayList arrayList2 = blockRow.medias;
        int iIndexOf2 = arrayList2 != null ? arrayList2.indexOf(mediaUploadState) : -1;
        if (iIndexOf2 >= 0) {
            blockRow.medias.remove(iIndexOf2);
            if (arrayListGalleryItems != null && iIndexOf2 < arrayListGalleryItems.size()) {
                arrayListGalleryItems.remove(iIndexOf2);
            }
        }
        if (blockRow.medias.isEmpty()) {
            int iIndexOf3 = arrayList.indexOf(blockRow);
            if (iIndexOf3 >= 0) {
                arrayList.remove(iIndexOf3);
                universalAdapter.update(true);
                return;
            }
            return;
        }
        if (blockRow.medias.size() != 1) {
            universalAdapter.update(true);
            refreshMediaCell(blockRow);
            return;
        }
        TL_iv.PageCaption pageCaption = blockRow.block.caption;
        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayListGalleryItems.get(0);
        blockRow.block = pageBlock;
        pageBlock.caption = pageCaption;
        blockRow.media = (MediaUploadState) blockRow.medias.get(0);
        blockRow.medias = null;
        universalAdapter.update(true);
        refreshMediaCell(blockRow);
    }

    public final void removeSelectedBlocks(int i, int i2) {
        ArrayList arrayList;
        if (i > i2) {
            i2 = i;
            i = i2;
        }
        ArrayList arrayList2 = new ArrayList();
        int iMax = Math.max(0, i);
        while (true) {
            arrayList = this.rows;
            if (iMax > i2) {
                break;
            }
            ArrayList arrayList3 = this.itemRows;
            if (iMax >= arrayList3.size()) {
                break;
            }
            BlockRow blockRow = (BlockRow) arrayList3.get(iMax);
            if (blockRow.authorQuoteId == 0 && arrayList.indexOf(blockRow) >= 0) {
                arrayList2.add(blockRow);
            }
            iMax++;
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
            richEditorHistory.commit();
        }
        int iIndexOf = arrayList.indexOf(arrayList2.get(0));
        arrayList.removeAll(arrayList2);
        if (arrayList.isEmpty()) {
            arrayList.add(new BlockRow(new TL_iv.pageBlockParagraph(), 0, 0));
        }
        HashMap map = this.quoteAuthors;
        if (!map.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                hashSet.addAll(((BlockRow) arrayList.get(i3)).quoteIds);
            }
            map.keySet().retainAll(hashSet);
        }
        collapseSingleBlockQuotes();
        normalizeNestedQuotes();
        renumberAllRuns();
        AnonymousClass1 anonymousClass1 = this.textSelectionHelper;
        if (anonymousClass1 != null) {
            anonymousClass1.clear(false);
        }
        this.adapter.update(false);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        post(new RichEditorListView$$ExternalSyntheticLambda2(this, (BlockRow) arrayList.get(Math.max(0, Math.min(iIndexOf, arrayList.size() - 1))), 1));
    }

    public final void renumberAllRuns() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.rows;
            if (i >= arrayList.size()) {
                return;
            }
            BlockRow blockRow = (BlockRow) arrayList.get(i);
            if (blockRow.level > 0 && blockRow.num > 0 && !isNonText(blockRow.block)) {
                int i2 = blockRow.level;
                int i3 = 1;
                for (int i4 = i - 1; i4 >= 0; i4--) {
                    BlockRow blockRow2 = (BlockRow) arrayList.get(i4);
                    int i5 = blockRow2.level;
                    if (i5 < i2) {
                        break;
                    }
                    if (i5 == i2 && !isNonText(blockRow2.block)) {
                        if (blockRow2.num <= 0) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                blockRow.num = i3;
            }
            i++;
        }
    }

    public final void replaceHelperSelectionWith(String str) {
        AnonymousClass1 anonymousClass1 = this.textSelectionHelper;
        applyEditRange(anonymousClass1.startViewPosition, anonymousClass1.startViewOffset, anonymousClass1.endViewPosition, anonymousClass1.endViewOffset, str.split("\n", -1));
    }

    public final MediaUploadState resolveBlockMedia(TL_iv.PageBlock pageBlock) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.Photo> arrayList;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            TLRPC.Document documentFindLoadedDocument = findLoadedDocument(((TL_iv.pageBlockAudio) pageBlock).audio_id);
            if (documentFindLoadedDocument == null) {
                return null;
            }
            MediaUploadState mediaUploadState = new MediaUploadState();
            mediaUploadState.isAudio = true;
            mediaUploadState.state = 2;
            mediaUploadState.document = documentFindLoadedDocument;
            mediaUploadState.audioDisplayDocument = documentFindLoadedDocument;
            return mediaUploadState;
        }
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            TLRPC.Document documentFindLoadedDocument2 = findLoadedDocument(((TL_iv.pageBlockDocument) pageBlock).document_id);
            if (documentFindLoadedDocument2 == null) {
                return null;
            }
            MediaUploadState mediaUploadState2 = new MediaUploadState();
            mediaUploadState2.isDocument = true;
            mediaUploadState2.state = 2;
            mediaUploadState2.document = documentFindLoadedDocument2;
            return mediaUploadState2;
        }
        int i = 0;
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            TLRPC.Document documentFindLoadedDocument3 = findLoadedDocument(pageblockvideo.video_id);
            if (documentFindLoadedDocument3 == null) {
                return null;
            }
            MediaUploadState mediaUploadState3 = new MediaUploadState();
            mediaUploadState3.isVideo = true;
            mediaUploadState3.state = 2;
            mediaUploadState3.document = documentFindLoadedDocument3;
            mediaUploadState3.hasSpoiler = pageblockvideo.spoiler;
            while (i < documentFindLoadedDocument3.attributes.size()) {
                if (documentFindLoadedDocument3.attributes.get(i) instanceof TLRPC.TL_documentAttributeVideo) {
                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) documentFindLoadedDocument3.attributes.get(i);
                    mediaUploadState3.width = tL_documentAttributeVideo.w;
                    mediaUploadState3.height = tL_documentAttributeVideo.h;
                    return mediaUploadState3;
                }
                i++;
            }
            return mediaUploadState3;
        }
        if (!(pageBlock instanceof TL_iv.pageBlockPhoto)) {
            return null;
        }
        TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
        long j = pageblockphoto.photo_id;
        if (j == 0) {
            photo = null;
            break;
        }
        int i2 = 0;
        loop1: while (true) {
            if (i2 >= this.rows.size()) {
                TL_iv.RichMessage richMessage = this.loadedRichMessage;
                if (richMessage != null && (arrayList = richMessage.photos) != null) {
                    int size = arrayList.size();
                    while (true) {
                        if (i >= size) {
                            synchronized (RichMediaClipboard.class) {
                                if (j == 0) {
                                    photo = (TLRPC.Photo) RichMediaClipboard.photos.get(Long.valueOf(j));
                                    break;
                                }
                                HashMap map = RichMediaClipboard.photos;
                                photo = null;
                                break;
                            }
                        }
                        TLRPC.Photo photo2 = arrayList.get(i);
                        i++;
                        photo = photo2;
                        if (photo != null && photo.id == j) {
                            break;
                        }
                    }
                } else {
                    synchronized (RichMediaClipboard.class) {
                        try {
                            if (j == 0) {
                                photo = (TLRPC.Photo) RichMediaClipboard.photos.get(Long.valueOf(j));
                                break;
                            }
                            HashMap map2 = RichMediaClipboard.photos;
                            photo = null;
                            break;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } else {
                for (MediaUploadState mediaUploadState4 : mediasOf((BlockRow) this.rows.get(i2))) {
                    if (mediaUploadState4 != null && (photo = mediaUploadState4.photo) != null && photo.id == j) {
                        break loop1;
                    }
                }
                i2++;
            }
        }
        if (photo == null) {
            return null;
        }
        MediaUploadState mediaUploadState5 = new MediaUploadState();
        mediaUploadState5.state = 2;
        mediaUploadState5.photo = photo;
        mediaUploadState5.hasSpoiler = pageblockphoto.spoiler;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize != null) {
            mediaUploadState5.width = closestPhotoSizeWithSize.w;
            mediaUploadState5.height = closestPhotoSizeWithSize.h;
        }
        return mediaUploadState5;
    }

    public final void resolveLoadedMedia(BlockRow blockRow) {
        TL_iv.PageBlock pageBlock;
        if (this.loadedRichMessage == null || blockRow == null || (pageBlock = blockRow.block) == null) {
            return;
        }
        if (!isGallery(pageBlock)) {
            MediaUploadState mediaUploadStateResolveBlockMedia = resolveBlockMedia(blockRow.block);
            if (mediaUploadStateResolveBlockMedia != null) {
                blockRow.media = mediaUploadStateResolveBlockMedia;
                return;
            }
            return;
        }
        ArrayList arrayListGalleryItems = galleryItems(blockRow.block);
        blockRow.medias = new ArrayList();
        if (arrayListGalleryItems != null) {
            for (int i = 0; i < arrayListGalleryItems.size(); i++) {
                MediaUploadState mediaUploadStateResolveBlockMedia2 = resolveBlockMedia((TL_iv.PageBlock) arrayListGalleryItems.get(i));
                ArrayList arrayList = blockRow.medias;
                if (mediaUploadStateResolveBlockMedia2 == null) {
                    mediaUploadStateResolveBlockMedia2 = new MediaUploadState();
                }
                arrayList.add(mediaUploadStateResolveBlockMedia2);
            }
        }
    }

    public final ArrayList resolvePastedMedia(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            BlockRow blockRow = (BlockRow) obj;
            if (isGallery(blockRow.block)) {
                ArrayList arrayListGalleryItems = galleryItems(blockRow.block);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                if (arrayListGalleryItems != null) {
                    int size2 = arrayListGalleryItems.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayListGalleryItems.get(i2);
                        i2++;
                        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj2;
                        MediaUploadState mediaUploadStateResolveBlockMedia = resolveBlockMedia(pageBlock);
                        if (mediaUploadStateResolveBlockMedia != null) {
                            arrayList3.add(pageBlock);
                            arrayList4.add(mediaUploadStateResolveBlockMedia);
                        }
                    }
                    arrayListGalleryItems.clear();
                    arrayListGalleryItems.addAll(arrayList3);
                }
                if (!arrayList4.isEmpty()) {
                    blockRow.medias = arrayList4;
                    arrayList2.add(blockRow);
                }
            } else {
                TL_iv.PageBlock pageBlock2 = blockRow.block;
                if ((pageBlock2 instanceof TL_iv.pageBlockPhoto) || (pageBlock2 instanceof TL_iv.pageBlockVideo) || (pageBlock2 instanceof TL_iv.pageBlockAudio) || (pageBlock2 instanceof TL_iv.pageBlockDocument)) {
                    MediaUploadState mediaUploadStateResolveBlockMedia2 = resolveBlockMedia(pageBlock2);
                    if (mediaUploadStateResolveBlockMedia2 != null) {
                        blockRow.media = mediaUploadStateResolveBlockMedia2;
                        arrayList2.add(blockRow);
                    }
                } else {
                    arrayList2.add(blockRow);
                }
            }
        }
        return arrayList2;
    }

    public final void resyncInsetCells() {
        for (int i = 0; i < getChildCount(); i++) {
            KeyEvent.Callback childAt = getChildAt(i);
            if (childAt instanceof RichInsetCell) {
                RichBlockCell richBlockCell = (RichBlockCell) ((RichInsetCell) childAt);
                richBlockCell.insetAnim.apply(richBlockCell.currentRow, new RichBlockCell$$ExternalSyntheticLambda0(richBlockCell, 0));
            }
        }
        invalidate();
    }

    public final BlockRow rowForCell(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.itemRows;
        if (i < arrayList.size()) {
            return (BlockRow) arrayList.get(i);
        }
        return null;
    }

    public final View selectableAt(int i) {
        if (i < 0) {
            return null;
        }
        return this.layoutManager.findViewByPosition(i);
    }

    public final int[] selectedRowRange() {
        ArrayList arrayList = this.rows;
        AnonymousClass1 anonymousClass1 = this.textSelectionHelper;
        if (anonymousClass1 == null || !anonymousClass1.isInSelectionMode()) {
            BlockRow blockRowFindFocusedRow = findFocusedRow();
            int iIndexOf = blockRowFindFocusedRow != null ? arrayList.indexOf(blockRowFindFocusedRow) : -1;
            if (iIndexOf >= 0) {
                return new int[]{iIndexOf, iIndexOf};
            }
            return null;
        }
        int iIndexOf2 = arrayList.indexOf(rowForCell(anonymousClass1.startViewPosition));
        int iIndexOf3 = arrayList.indexOf(rowForCell(anonymousClass1.endViewPosition));
        if (iIndexOf2 < 0 || iIndexOf3 < 0) {
            return null;
        }
        return new int[]{Math.min(iIndexOf2, iIndexOf3), Math.max(iIndexOf2, iIndexOf3)};
    }

    public final boolean selectionHasInlineFormattable() {
        int iBlockTextLength;
        int i;
        int i2;
        AnonymousClass1 anonymousClass1 = this.textSelectionHelper;
        if (anonymousClass1 != null && anonymousClass1.isInSelectionMode()) {
            if (isTableSelection()) {
                int i3 = anonymousClass1.startViewPosition;
                int i4 = anonymousClass1.startViewChildPosition;
                int i5 = anonymousClass1.endViewChildPosition;
                int i6 = anonymousClass1.startViewOffset;
                int i7 = anonymousClass1.endViewOffset;
                int i8 = i4;
                while (i8 <= i5) {
                    RichEditText richEditTextTableEditText = tableEditText(i3, i8);
                    if (richEditTextTableEditText != null) {
                        int length = richEditTextTableEditText.length();
                        int iMin = i8 == i4 ? i6 : 0;
                        int iMax = i8 == i5 ? i7 : length;
                        if (i4 == i5) {
                            iMin = Math.min(i6, i7);
                            iMax = Math.max(i6, i7);
                        }
                        if (Math.max(0, Math.min(iMin, length)) < Math.max(0, Math.min(iMax, length))) {
                            return true;
                        }
                    }
                    i8++;
                }
            } else if (isDetailsSelection()) {
                RichEditText richEditTextDetailsEditText = detailsEditText(anonymousClass1.startViewPosition);
                if (richEditTextDetailsEditText != null && Math.max(0, Math.min(Math.min(anonymousClass1.startViewOffset, anonymousClass1.endViewOffset), richEditTextDetailsEditText.length())) < Math.max(0, Math.min(Math.max(anonymousClass1.startViewOffset, anonymousClass1.endViewOffset), richEditTextDetailsEditText.length()))) {
                    return true;
                }
            } else if (isCaptionSelection()) {
                RichEditText richEditTextCaptionEditText = captionEditText(anonymousClass1.startViewPosition);
                if (richEditTextCaptionEditText != null) {
                    int i9 = anonymousClass1.startViewOffset;
                    int i10 = anonymousClass1.endViewOffset;
                    if (Math.max(0, Math.min(Math.min(i9, i10), richEditTextCaptionEditText.length())) < Math.max(0, Math.min(Math.max(i9, i10), richEditTextCaptionEditText.length()))) {
                        return true;
                    }
                }
            } else if (isQuoteAuthorSelection()) {
                RichEditText richEditTextQuoteAuthorEditText = quoteAuthorEditText(anonymousClass1.startViewPosition);
                if (richEditTextQuoteAuthorEditText != null) {
                    int i11 = anonymousClass1.startViewOffset;
                    int i12 = anonymousClass1.endViewOffset;
                    if (Math.max(0, Math.min(Math.min(i11, i12), richEditTextQuoteAuthorEditText.length())) < Math.max(0, Math.min(Math.max(i11, i12), richEditTextQuoteAuthorEditText.length()))) {
                        return true;
                    }
                }
            } else {
                int i13 = anonymousClass1.startViewPosition;
                int i14 = anonymousClass1.endViewPosition;
                int i15 = anonymousClass1.startViewOffset;
                int i16 = anonymousClass1.endViewOffset;
                if (i13 >= 0 && i14 >= 0 && i14 >= i13 && i14 < this.itemRows.size()) {
                    for (int i17 = i13; i17 <= i14; i17++) {
                        BlockRow blockRowRowForCell = rowForCell(i17);
                        if (blockRowRowForCell != null) {
                            if (blockRowRowForCell.authorQuoteId == 0) {
                                TL_iv.PageBlock pageBlock = blockRowRowForCell.block;
                                if (isFormattable(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
                                    iBlockTextLength = blockTextLength(i17);
                                    if (i17 == i13) {
                                        i = i15;
                                    } else {
                                        i = 0;
                                    }
                                    if (i17 == i14) {
                                        i2 = i16;
                                    } else {
                                        i2 = iBlockTextLength;
                                    }
                                    if (Math.max(0, Math.min(i, iBlockTextLength)) < Math.max(0, Math.min(i2, iBlockTextLength))) {
                                        return true;
                                    }
                                }
                            } else {
                                iBlockTextLength = blockTextLength(i17);
                                if (i17 == i13) {
                                    i = i15;
                                } else {
                                    i = 0;
                                }
                                if (i17 == i14) {
                                    i2 = i16;
                                } else {
                                    i2 = iBlockTextLength;
                                }
                                if (Math.max(0, Math.min(i, iBlockTextLength)) < Math.max(0, Math.min(i2, iBlockTextLength))) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int[] selectionRowRange() {
        AnonymousClass1 anonymousClass1 = this.textSelectionHelper;
        if (anonymousClass1 == null) {
            return null;
        }
        int i = anonymousClass1.startViewPosition;
        int i2 = anonymousClass1.endViewPosition;
        if (i < 0 || i2 < 0) {
            return null;
        }
        BlockRow blockRowRowForCell = rowForCell(i);
        BlockRow blockRowRowForCell2 = rowForCell(i2);
        if (blockRowRowForCell == null || blockRowRowForCell2 == null) {
            return null;
        }
        ArrayList arrayList = this.rows;
        int iIndexOf = arrayList.indexOf(blockRowRowForCell);
        int iIndexOf2 = arrayList.indexOf(blockRowRowForCell2);
        if (iIndexOf < 0 || iIndexOf2 < 0) {
            return null;
        }
        if (iIndexOf > iIndexOf2) {
            iIndexOf = iIndexOf2;
            iIndexOf2 = iIndexOf;
        }
        return new int[]{iIndexOf, iIndexOf2};
    }

    public void setAdaptiveLinkDialogs(boolean z) {
        this.adaptiveLinkDialogs = z;
    }

    public void setAllowTapAboveContent(boolean z) {
        this.allowTapAboveContent = z;
    }

    public void setFileRefParentObject(MessageObject messageObject) {
        this.fileRefParentObject = messageObject;
    }

    public void setInitialText(CharSequence charSequence) {
        if (charSequence == null) {
            return;
        }
        this.initialSelectionRows = new ArrayList();
        ArrayList arrayList = this.rows;
        flattenBlocks(arrayList, RichMessageConvert.blocksFromCharSequence(charSequence), this.quoteAuthors);
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            this.initialSelectionRows.add((BlockRow) arrayList.get(size));
        }
        this.adapter.update(false);
    }

    public final void showSelectedUrlDialog(RichEditText richEditText) {
        richEditText.adaptiveCreateLinkDialog = this.adaptiveLinkDialogs;
        richEditText.makeSelectedUrl(new RichEditorListView$$ExternalSyntheticLambda4(this, 5));
    }

    public final void showTableCellMenu(RichTableCell richTableCell) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean zEquals;
        int i3;
        int i4;
        ?? r1;
        boolean z3;
        String string;
        final ?? r12;
        ItemOptions itemOptions;
        int i5;
        int i6;
        boolean z4;
        boolean zEquals2;
        final RichTableCell richTableCell2 = richTableCell;
        final TableModel model = richTableCell2.getModel();
        if (model == null) {
            return;
        }
        Set<TL_iv.pageTableCell> selectedCells = richTableCell2.getSelectedCells();
        if (selectedCells.isEmpty()) {
            return;
        }
        int size = selectedCells.size();
        if (size >= 2) {
            int iMin = Integer.MAX_VALUE;
            int iMax = -1;
            int iMin2 = Integer.MAX_VALUE;
            int iMax2 = -1;
            for (TL_iv.pageTableCell pagetablecell : selectedCells) {
                int iAnchorRowOf = model.anchorRowOf(pagetablecell);
                int iAnchorColOf = model.anchorColOf(pagetablecell);
                int i7 = pagetablecell.rowspan;
                if (i7 == 0) {
                    i7 = 1;
                }
                int i8 = pagetablecell.colspan;
                if (i8 == 0) {
                    i8 = 1;
                }
                iMin = Math.min(iMin, iAnchorRowOf);
                iMin2 = Math.min(iMin2, iAnchorColOf);
                iMax2 = Math.max(iMax2, (iAnchorRowOf + i7) - 1);
                iMax = Math.max(iMax, (iAnchorColOf + i8) - 1);
            }
            HashSet hashSet = new HashSet();
            loop1: while (true) {
                if (iMin > iMax2) {
                    zEquals2 = hashSet.equals(new HashSet(selectedCells));
                    break;
                }
                for (int i9 = iMin2; i9 <= iMax; i9++) {
                    if (iMin < 0 || i9 < 0 || iMin >= model.rowCount || i9 >= model.colCount) {
                        zEquals2 = false;
                        break loop1;
                    }
                    hashSet.add(model.grid[iMin][i9]);
                }
                iMin++;
            }
            if (zEquals2) {
                i = 1;
            } else {
                i = 0;
            }
        } else {
            i = 0;
        }
        if (size != 1) {
            i2 = 0;
        } else {
            TL_iv.pageTableCell next = selectedCells.iterator().next();
            int i10 = next.colspan;
            if (i10 == 0) {
                i10 = 1;
            }
            if (i10 > 1) {
                z4 = true;
            } else {
                int i11 = next.rowspan;
                if (i11 == 0) {
                    i11 = 1;
                }
                if (i11 > 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
            if (z4) {
                i2 = 1;
            } else {
                i2 = 0;
            }
        }
        HashSet hashSet2 = new HashSet();
        Iterator<TL_iv.pageTableCell> it = selectedCells.iterator();
        while (it.hasNext()) {
            hashSet2.add(Integer.valueOf(model.anchorRowOf(it.next())));
        }
        if (!hashSet2.isEmpty()) {
            Iterator it2 = hashSet2.iterator();
            loop4: while (true) {
                if (!it2.hasNext()) {
                    z = true;
                    break;
                }
                int iIntValue = ((Integer) it2.next()).intValue();
                if (iIntValue >= 0 && iIntValue < model.rowCount) {
                    int i12 = 0;
                    while (true) {
                        if (i12 < model.colCount) {
                            if (model.anchorR[iIntValue][i12] == iIntValue && selectedCells.contains(model.grid[iIntValue][i12])) {
                                i12++;
                            }
                        }
                    }
                }
                z = false;
                break;
            }
        }
        z = false;
        break;
        HashSet hashSet3 = new HashSet();
        Iterator<TL_iv.pageTableCell> it3 = selectedCells.iterator();
        while (it3.hasNext()) {
            hashSet3.add(Integer.valueOf(model.anchorColOf(it3.next())));
        }
        if (!hashSet3.isEmpty()) {
            Iterator it4 = hashSet3.iterator();
            loop7: while (true) {
                if (!it4.hasNext()) {
                    z2 = true;
                    break;
                }
                int iIntValue2 = ((Integer) it4.next()).intValue();
                if (iIntValue2 >= 0 && iIntValue2 < model.colCount) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < model.rowCount) {
                            if (model.anchorC[i13][iIntValue2] == iIntValue2 && selectedCells.contains(model.grid[i13][iIntValue2])) {
                                i13++;
                            }
                        }
                    }
                }
                z2 = false;
                break;
            }
        }
        z2 = false;
        break;
        if (selectedCells.isEmpty() || model.rowCount <= 0 || model.colCount <= 0) {
            zEquals = false;
        } else {
            HashSet hashSet4 = new HashSet();
            for (int i14 = 0; i14 < model.rowCount; i14++) {
                for (int i15 = 0; i15 < model.colCount; i15++) {
                    hashSet4.add(model.grid[i14][i15]);
                }
            }
            zEquals = hashSet4.equals(new HashSet(selectedCells));
        }
        boolean z5 = !zEquals || (model.rowCount == 1 && model.colCount == 1);
        if (!z || zEquals) {
            i3 = 0;
        } else {
            HashSet hashSet5 = new HashSet();
            Iterator<TL_iv.pageTableCell> it5 = selectedCells.iterator();
            while (it5.hasNext()) {
                hashSet5.add(Integer.valueOf(model.anchorRowOf(it5.next())));
            }
            if (hashSet5.size() < model.rowCount) {
                i3 = 1;
            } else {
                i3 = 0;
            }
        }
        if (!z2 || zEquals) {
            i4 = 0;
        } else {
            HashSet hashSet6 = new HashSet();
            Iterator<TL_iv.pageTableCell> it6 = selectedCells.iterator();
            while (it6.hasNext()) {
                hashSet6.add(Integer.valueOf(model.anchorColOf(it6.next())));
            }
            if (hashSet6.size() < model.colCount) {
                i4 = 1;
            } else {
                i4 = 0;
            }
        }
        boolean z6 = z5 && z2 && model.colCount < MessagesController.getInstance(this.currentAccount).config.richMessageMaxTableCols.get();
        boolean z7 = z5 && z;
        ItemOptions itemOptions2 = this.tableCellMenu;
        if (itemOptions2 != null) {
            this.tableCellMenu = null;
            itemOptions2.dismiss();
        }
        int iDp = AndroidUtilities.dp(((i + 1 + i2 + (z6 ? 2 : 0) + (z7 ? 2 : 0) + i4 + i3 + (zEquals ? 3 : 0)) * 48) + 68 + (zEquals ? 8 : 0));
        FrameLayout frameLayoutTableMenuAnchor = tableMenuAnchor(richTableCell2, false);
        int i16 = i;
        int[] iArr = new int[2];
        frameLayoutTableMenuAnchor.getLocationOnScreen(iArr);
        if ((iArr[1] - iDp) - AndroidUtilities.dp(8.0f) >= AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight) {
            r1 = 1;
        } else {
            r1 = 1;
            frameLayoutTableMenuAnchor = tableMenuAnchor(richTableCell2, true);
        }
        ItemOptions itemOptionsMakeMenu = this.delegate.makeMenu(frameLayoutTableMenuAnchor);
        itemOptionsMakeMenu.dimAlpha = 0;
        itemOptionsMakeMenu.drawScrim = false;
        itemOptionsMakeMenu.allowShowingOnTopOfKeyboard = r1;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setMinimumWidth(AndroidUtilities.dp(208.0f));
        linearLayout.setOrientation(r1);
        TextView textView = new TextView(getContext());
        textView.setText(LocaleController.getString(R.string.ArticleAlignment));
        int i17 = i2;
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, super.resourcesProvider));
        linearLayout.addView(textView, LayoutHelper.createLinear(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        boolean z8 = z;
        boolean z9 = z2;
        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-2, -2, 17));
        Context context = getContext();
        int i18 = R.drawable.iv_align_horiz_left;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        RichEditor.Button button = new RichEditor.Button(context, i18, resourcesProvider);
        button.roundRadius = 4;
        button.updateColors$1();
        button.setAccent();
        int i19 = Theme.key_actionBarDefaultSubmenuBackground;
        button.setBackgroundColorKey(i19);
        int i20 = i4;
        linearLayout2.addView(button, LayoutHelper.createLinear(32, 32));
        RichEditor.Button button2 = new RichEditor.Button(getContext(), R.drawable.iv_align_horiz_middle, resourcesProvider);
        button2.roundRadius = 4;
        button2.updateColors$1();
        button2.setAccent();
        button2.setBackgroundColorKey(i19);
        linearLayout2.addView(button2, LayoutHelper.createLinear(32, 32));
        RichEditor.Button button3 = new RichEditor.Button(getContext(), R.drawable.iv_align_horiz_right, resourcesProvider);
        button3.roundRadius = 4;
        button3.updateColors$1();
        button3.setAccent();
        button3.setBackgroundColorKey(i19);
        final RichEditor.Button[] buttonArr = {button, button2, button3};
        boolean z10 = zEquals;
        linearLayout2.addView(button3, LayoutHelper.createLinear(32, 32));
        boolean z11 = z7;
        linearLayout2.addView(new Space(getContext()), LayoutHelper.createLinear(8, 0));
        RichEditor.Button button4 = new RichEditor.Button(getContext(), R.drawable.iv_align_vert_top, resourcesProvider);
        button4.roundRadius = 4;
        button4.updateColors$1();
        button4.setAccent();
        button4.setBackgroundColorKey(i19);
        linearLayout2.addView(button4, LayoutHelper.createLinear(32, 32));
        RichEditor.Button button5 = new RichEditor.Button(getContext(), R.drawable.iv_align_vert_middle, resourcesProvider);
        button5.roundRadius = 4;
        button5.updateColors$1();
        button5.setAccent();
        button5.setBackgroundColorKey(i19);
        linearLayout2.addView(button5, LayoutHelper.createLinear(32, 32));
        RichEditor.Button button6 = new RichEditor.Button(getContext(), R.drawable.iv_align_vert_bottom, resourcesProvider);
        button6.roundRadius = 4;
        button6.updateColors$1();
        button6.setAccent();
        button6.setBackgroundColorKey(i19);
        final RichEditor.Button[] buttonArr2 = {button4, button5, button6};
        linearLayout2.addView(button6, LayoutHelper.createLinear(32, 32));
        itemOptionsMakeMenu.addView(linearLayout);
        LinkedHashSet<TL_iv.pageTableCell> linkedHashSet = richTableCell2.selectedCells;
        int i21 = -1;
        for (TL_iv.pageTableCell pagetablecell2 : linkedHashSet) {
            if (pagetablecell2 == null) {
                i6 = 0;
            } else if (pagetablecell2.align_right) {
                i6 = 2;
            } else if (pagetablecell2.align_center) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            if (i21 != -1) {
                if (i21 != i6) {
                    i21 = -1;
                    break;
                }
            } else {
                i21 = i6;
            }
        }
        int i22 = -1;
        for (TL_iv.pageTableCell pagetablecell3 : linkedHashSet) {
            if (pagetablecell3 == null) {
                i5 = 0;
            } else if (pagetablecell3.valign_bottom) {
                i5 = 2;
            } else if (pagetablecell3.valign_middle) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            if (i22 != -1) {
                if (i22 != i5) {
                    i22 = -1;
                    break;
                }
            } else {
                i22 = i5;
            }
        }
        int i23 = 0;
        while (i23 < 3) {
            buttonArr[i23].setSelected(i23 == i21);
            i23++;
        }
        final int i24 = 1;
        int i25 = 0;
        while (i25 < 3) {
            buttonArr2[i25].setSelected(i25 == i22);
            i25++;
        }
        for (final int i26 = 0; i26 < 3; i26++) {
            final int i27 = 0;
            buttonArr[i26].setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (i27) {
                        case 0:
                            RichTableCell richTableCell3 = richTableCell2;
                            Iterator it7 = richTableCell3.selectedCells.iterator();
                            while (true) {
                                boolean zHasNext = it7.hasNext();
                                int i28 = i26;
                                RichTableCellGrid richTableCellGrid = richTableCell3.grid;
                                if (!zHasNext) {
                                    richTableCellGrid.invalidate();
                                    RichEditorListView.AnonymousClass12 anonymousClass12 = richTableCell3.delegate;
                                    if (anonymousClass12 != null && richTableCell3.currentRow != null) {
                                        anonymousClass12.onTextChanged();
                                    }
                                    int i29 = 0;
                                    while (i29 < 3) {
                                        buttonArr[i29].setSelected(i29 == i28);
                                        i29++;
                                    }
                                    break;
                                } else {
                                    TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) it7.next();
                                    TableModel.setAlign(pagetablecell4, i28);
                                    RichTableCellHost richTableCellHostHostForAnchor = richTableCellGrid.hostForAnchor(pagetablecell4);
                                    if (richTableCellHostHostForAnchor != null && richTableCellHostHostForAnchor.cell != null) {
                                        richTableCellHostHostForAnchor.applyAlignment();
                                        richTableCellHostHostForAnchor.invalidate();
                                    }
                                }
                            }
                            break;
                        default:
                            RichTableCell richTableCell4 = richTableCell2;
                            Iterator it8 = richTableCell4.selectedCells.iterator();
                            while (true) {
                                boolean zHasNext2 = it8.hasNext();
                                int i30 = i26;
                                RichTableCellGrid richTableCellGrid2 = richTableCell4.grid;
                                if (!zHasNext2) {
                                    richTableCellGrid2.invalidate();
                                    RichEditorListView.AnonymousClass12 anonymousClass13 = richTableCell4.delegate;
                                    if (anonymousClass13 != null && richTableCell4.currentRow != null) {
                                        anonymousClass13.onTextChanged();
                                    }
                                    int i31 = 0;
                                    while (i31 < 3) {
                                        buttonArr[i31].setSelected(i31 == i30);
                                        i31++;
                                    }
                                    break;
                                } else {
                                    TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it8.next();
                                    TableModel.setVAlign(pagetablecell5, i30);
                                    RichTableCellHost richTableCellHostHostForAnchor2 = richTableCellGrid2.hostForAnchor(pagetablecell5);
                                    if (richTableCellHostHostForAnchor2 != null && richTableCellHostHostForAnchor2.cell != null) {
                                        richTableCellHostHostForAnchor2.applyAlignment();
                                        richTableCellHostHostForAnchor2.invalidate();
                                    }
                                }
                            }
                            break;
                    }
                }
            });
        }
        final int i28 = 0;
        for (int i29 = 3; i28 < i29; i29 = 3) {
            buttonArr2[i28].setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (i24) {
                        case 0:
                            RichTableCell richTableCell3 = richTableCell2;
                            Iterator it7 = richTableCell3.selectedCells.iterator();
                            while (true) {
                                boolean zHasNext = it7.hasNext();
                                int i210 = i28;
                                RichTableCellGrid richTableCellGrid = richTableCell3.grid;
                                if (!zHasNext) {
                                    richTableCellGrid.invalidate();
                                    RichEditorListView.AnonymousClass12 anonymousClass12 = richTableCell3.delegate;
                                    if (anonymousClass12 != null && richTableCell3.currentRow != null) {
                                        anonymousClass12.onTextChanged();
                                    }
                                    int i211 = 0;
                                    while (i211 < 3) {
                                        buttonArr2[i211].setSelected(i211 == i210);
                                        i211++;
                                    }
                                    break;
                                } else {
                                    TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) it7.next();
                                    TableModel.setAlign(pagetablecell4, i210);
                                    RichTableCellHost richTableCellHostHostForAnchor = richTableCellGrid.hostForAnchor(pagetablecell4);
                                    if (richTableCellHostHostForAnchor != null && richTableCellHostHostForAnchor.cell != null) {
                                        richTableCellHostHostForAnchor.applyAlignment();
                                        richTableCellHostHostForAnchor.invalidate();
                                    }
                                }
                            }
                            break;
                        default:
                            RichTableCell richTableCell4 = richTableCell2;
                            Iterator it8 = richTableCell4.selectedCells.iterator();
                            while (true) {
                                boolean zHasNext2 = it8.hasNext();
                                int i30 = i28;
                                RichTableCellGrid richTableCellGrid2 = richTableCell4.grid;
                                if (!zHasNext2) {
                                    richTableCellGrid2.invalidate();
                                    RichEditorListView.AnonymousClass12 anonymousClass13 = richTableCell4.delegate;
                                    if (anonymousClass13 != null && richTableCell4.currentRow != null) {
                                        anonymousClass13.onTextChanged();
                                    }
                                    int i31 = 0;
                                    while (i31 < 3) {
                                        buttonArr2[i31].setSelected(i31 == i30);
                                        i31++;
                                    }
                                    break;
                                } else {
                                    TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it8.next();
                                    TableModel.setVAlign(pagetablecell5, i30);
                                    RichTableCellHost richTableCellHostHostForAnchor2 = richTableCellGrid2.hostForAnchor(pagetablecell5);
                                    if (richTableCellHostHostForAnchor2 != null && richTableCellHostHostForAnchor2.cell != null) {
                                        richTableCellHostHostForAnchor2.applyAlignment();
                                        richTableCellHostHostForAnchor2.invalidate();
                                    }
                                }
                            }
                            break;
                    }
                }
            });
            i28++;
        }
        itemOptionsMakeMenu.addSpaceGap$1();
        itemOptionsMakeMenu.minWidthDp = 208;
        if (linkedHashSet.isEmpty()) {
            z3 = false;
            break;
        }
        Iterator it7 = linkedHashSet.iterator();
        while (true) {
            if (it7.hasNext()) {
                if (!((TL_iv.pageTableCell) it7.next()).header) {
                    z3 = false;
                    break;
                }
            } else {
                z3 = true;
                break;
            }
        }
        if (z3) {
            string = LocaleController.getString(R.string.ArticleRemoveHighlight);
        } else if (z10 || !(size <= 1 || z9 || z8)) {
            string = LocaleController.getString(R.string.ArticleHighlightCells);
        } else {
            string = LocaleController.getString(z9 ? R.string.ArticleHighlightColumn : z8 ? R.string.ArticleHighlightRow : R.string.ArticleHighlightCell);
        }
        itemOptionsMakeMenu.add(z3 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, string, new EglRenderer$$ExternalSyntheticLambda8(this, richTableCell2, z3, 13), false);
        if (i16 != 0) {
            final int i30 = 2;
            itemOptionsMakeMenu.add(R.drawable.iv_table_merge, LocaleController.getString(R.string.ArticleMergeCells), new Runnable(this) {
                public final RichEditorListView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    RichEditorListView richEditorListView;
                    boolean z12;
                    int iAnchorRowOf2;
                    TL_iv.RichText richText;
                    int iAnchorRowOf3;
                    int iAnchorColOf2;
                    int iAnchorRowOf4;
                    boolean z13;
                    String str = "";
                    int iMin3 = Integer.MAX_VALUE;
                    RichTableCell richTableCell3 = richTableCell2;
                    RichEditorListView richEditorListView2 = this.f$0;
                    int i31 = 1;
                    switch (i30) {
                        case 0:
                            richEditorListView2.getClass();
                            if (richTableCell3.model != null) {
                                LinkedHashSet linkedHashSet2 = richTableCell3.selectedCells;
                                if (linkedHashSet2.isEmpty()) {
                                    richEditorListView = richEditorListView2;
                                } else {
                                    HashSet hashSet7 = new HashSet();
                                    Iterator it8 = linkedHashSet2.iterator();
                                    while (it8.hasNext()) {
                                        int iAnchorRowOf5 = richTableCell3.model.anchorRowOf((TL_iv.pageTableCell) it8.next());
                                        hashSet7.add(Integer.valueOf(iAnchorRowOf5));
                                        iMin3 = Math.min(iMin3, iAnchorRowOf5);
                                    }
                                    linkedHashSet2.clear();
                                    TableModel tableModel = richTableCell3.model;
                                    tableModel.getClass();
                                    if (hashSet7.isEmpty()) {
                                        richEditorListView = richEditorListView2;
                                        z12 = false;
                                    } else {
                                        boolean[] zArr = new boolean[tableModel.rowCount];
                                        Iterator it9 = hashSet7.iterator();
                                        while (it9.hasNext()) {
                                            int iIntValue3 = ((Integer) it9.next()).intValue();
                                            if (iIntValue3 >= 0 && iIntValue3 < tableModel.rowCount) {
                                                zArr[iIntValue3] = true;
                                            }
                                        }
                                        int[] iArr2 = new int[tableModel.rowCount];
                                        int i32 = 0;
                                        for (int i33 = 0; i33 < tableModel.rowCount; i33++) {
                                            iArr2[i33] = i32;
                                            if (!zArr[i33]) {
                                                i32++;
                                            }
                                        }
                                        if (i32 == 0) {
                                            tableModel.block.rows.clear();
                                            tableModel.rebuildFromBlock();
                                            richEditorListView = richEditorListView2;
                                        } else {
                                            IdentityHashMap identityHashMap = new IdentityHashMap();
                                            ArrayList arrayList = tableModel.anchorsRowMajor;
                                            int size2 = arrayList.size();
                                            int i34 = 0;
                                            while (i34 < size2) {
                                                Object obj = arrayList.get(i34);
                                                i34++;
                                                TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                int iAnchorRowOf6 = tableModel.anchorRowOf(pagetablecell4);
                                                int iAnchorColOf3 = tableModel.anchorColOf(pagetablecell4);
                                                int i35 = pagetablecell4.rowspan;
                                                if (i35 == 0) {
                                                    i35 = 1;
                                                }
                                                int i36 = pagetablecell4.colspan;
                                                if (i36 == 0) {
                                                    i36 = 1;
                                                }
                                                int[] iArr3 = iArr2;
                                                boolean[] zArr2 = zArr;
                                                RichEditorListView richEditorListView3 = richEditorListView2;
                                                int i37 = 0;
                                                int i38 = -1;
                                                for (int i39 = iAnchorRowOf6; i39 < iAnchorRowOf6 + i35 && i39 < tableModel.rowCount; i39++) {
                                                    if (!zArr2[i39]) {
                                                        if (i38 < 0) {
                                                            i38 = i39;
                                                        }
                                                        i37++;
                                                    }
                                                }
                                                if (i38 >= 0) {
                                                    identityHashMap.put(pagetablecell4, new int[]{iArr3[i38], iAnchorColOf3, i37, i36});
                                                }
                                                iArr2 = iArr3;
                                                zArr = zArr2;
                                                richEditorListView2 = richEditorListView3;
                                            }
                                            richEditorListView = richEditorListView2;
                                            tableModel.rewriteBlockRows(identityHashMap, i32);
                                            tableModel.rebuildFromBlock();
                                        }
                                        z12 = true;
                                    }
                                    richTableCell3.refreshAfterModelChange();
                                    if (z12) {
                                        richTableCell3.focusCellAt(iMin3, 0);
                                    }
                                }
                            } else {
                                richEditorListView = richEditorListView2;
                            }
                            richEditorListView.exitCellSelectionMode();
                            break;
                        case 1:
                            richEditorListView2.getClass();
                            BlockRow row = richTableCell3.getRow();
                            richEditorListView2.exitCellSelectionMode();
                            if (row != null) {
                                RichEditorHistory richEditorHistory = richEditorListView2.history;
                                if (richEditorHistory != null) {
                                    AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
                                    richEditorHistory.commit();
                                }
                                ArrayList arrayList2 = richEditorListView2.rows;
                                int iIndexOf = arrayList2.indexOf(row);
                                if (iIndexOf >= 0) {
                                    arrayList2.remove(iIndexOf);
                                    richEditorListView2.adapter.update(true);
                                }
                                RichEditorHistory richEditorHistory2 = richEditorListView2.history;
                                if (richEditorHistory2 != null) {
                                    richEditorHistory2.record();
                                }
                                RichEditorListView.Delegate delegate = richEditorListView2.delegate;
                                if (delegate != null) {
                                    delegate.onContentChanged();
                                }
                            }
                            break;
                        case 2:
                            richEditorListView2.getClass();
                            if (richTableCell3.model != null) {
                                LinkedHashSet linkedHashSet3 = richTableCell3.selectedCells;
                                if (linkedHashSet3.size() >= 2) {
                                    HashSet<TL_iv.pageTableCell> hashSet8 = new HashSet(linkedHashSet3);
                                    int iMin4 = Integer.MAX_VALUE;
                                    int iMin5 = Integer.MAX_VALUE;
                                    for (TL_iv.pageTableCell pagetablecell5 : hashSet8) {
                                        iMin5 = Math.min(iMin5, richTableCell3.model.anchorRowOf(pagetablecell5));
                                        iMin4 = Math.min(iMin4, richTableCell3.model.anchorColOf(pagetablecell5));
                                    }
                                    linkedHashSet3.clear();
                                    TableModel tableModel2 = richTableCell3.model;
                                    tableModel2.getClass();
                                    if (hashSet8.size() < 2) {
                                        linkedHashSet3.addAll(hashSet8);
                                    } else {
                                        int iMax3 = -1;
                                        int iMax4 = -1;
                                        int iMin6 = Integer.MAX_VALUE;
                                        int iMin7 = Integer.MAX_VALUE;
                                        for (TL_iv.pageTableCell pagetablecell6 : hashSet8) {
                                            int iAnchorRowOf7 = tableModel2.anchorRowOf(pagetablecell6);
                                            int iAnchorColOf4 = tableModel2.anchorColOf(pagetablecell6);
                                            int i40 = pagetablecell6.rowspan;
                                            if (i40 == 0) {
                                                i40 = 1;
                                            }
                                            int i41 = pagetablecell6.colspan;
                                            if (i41 == 0) {
                                                i41 = 1;
                                            }
                                            iMin6 = Math.min(iMin6, iAnchorRowOf7);
                                            iMin7 = Math.min(iMin7, iAnchorColOf4);
                                            iMax3 = Math.max(iMax3, (iAnchorRowOf7 + i40) - 1);
                                            iMax4 = Math.max(iMax4, (iAnchorColOf4 + i41) - 1);
                                        }
                                        HashSet<TL_iv.pageTableCell> hashSet9 = new HashSet();
                                        int i42 = iMin6;
                                        while (true) {
                                            if (i42 <= iMax3) {
                                                int i43 = iMin7;
                                                while (true) {
                                                    if (i43 > iMax4) {
                                                        i42++;
                                                    } else if (i42 >= 0 && i43 >= 0 && i42 < tableModel2.rowCount && i43 < tableModel2.colCount) {
                                                        hashSet9.add(tableModel2.grid[i42][i43]);
                                                        i43++;
                                                    }
                                                }
                                            } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                StringBuilder sb = new StringBuilder();
                                                ArrayList arrayList3 = new ArrayList(hashSet9);
                                                Collections.sort(arrayList3, new TableModel$$ExternalSyntheticLambda0(tableModel2, 0));
                                                int size3 = arrayList3.size();
                                                int i44 = 0;
                                                while (i44 < size3) {
                                                    Object obj2 = arrayList3.get(i44);
                                                    i44++;
                                                    TL_iv.pageTableCell pagetablecell7 = (TL_iv.pageTableCell) obj2;
                                                    String strPlainOf = (pagetablecell7 == null || (richText = pagetablecell7.text) == null) ? "" : RichTextStyle.plainOf(richText);
                                                    if (!strPlainOf.isEmpty()) {
                                                        if (sb.length() > 0) {
                                                            sb.append("\n");
                                                        }
                                                        sb.append(strPlainOf);
                                                    }
                                                }
                                                TL_iv.pageTableCell pagetablecell8 = tableModel2.grid[iMin6][iMin7];
                                                int i45 = (iMax4 - iMin7) + 1;
                                                int i46 = (iMax3 - iMin6) + 1;
                                                if (i45 <= 1) {
                                                    i45 = 0;
                                                }
                                                pagetablecell8.colspan = i45;
                                                if (i46 <= 1) {
                                                    i46 = 0;
                                                }
                                                pagetablecell8.rowspan = i46;
                                                pagetablecell8.flags = i45 > 0 ? pagetablecell8.flags | 2 : pagetablecell8.flags & (-3);
                                                pagetablecell8.flags = i46 > 0 ? pagetablecell8.flags | 4 : pagetablecell8.flags & (-5);
                                                TableModel.applyPlainText(pagetablecell8, sb.toString());
                                                for (TL_iv.pageTableCell pagetablecell9 : hashSet9) {
                                                    if (pagetablecell9 != pagetablecell8 && (iAnchorRowOf2 = tableModel2.anchorRowOf(pagetablecell9)) >= 0) {
                                                        TL_iv.pageBlockTable pageblocktable = tableModel2.block;
                                                        if (iAnchorRowOf2 < pageblocktable.rows.size()) {
                                                            pageblocktable.rows.get(iAnchorRowOf2).cells.remove(pagetablecell9);
                                                        }
                                                    }
                                                }
                                                tableModel2.rebuildFromBlock();
                                                richTableCell3.refreshAfterModelChange();
                                                richTableCell3.grid.invalidate();
                                                richTableCell3.focusCellAt(iMin5, iMin4);
                                                richTableCell3.notifyCellSelectionChanged();
                                            }
                                        }
                                        linkedHashSet3.addAll(hashSet8);
                                    }
                                }
                            }
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 3:
                            richEditorListView2.getClass();
                            if (richTableCell3.model != null) {
                                LinkedHashSet linkedHashSet4 = richTableCell3.selectedCells;
                                if (linkedHashSet4.size() == 1) {
                                    TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                    int i47 = pagetablecell10.colspan;
                                    if (i47 == 0) {
                                        i47 = 1;
                                    }
                                    if (i47 > 1) {
                                        iAnchorRowOf3 = richTableCell3.model.anchorRowOf(pagetablecell10);
                                        iAnchorColOf2 = richTableCell3.model.anchorColOf(pagetablecell10);
                                        linkedHashSet4.clear();
                                        TableModel tableModel3 = richTableCell3.model;
                                        iAnchorRowOf4 = tableModel3.anchorRowOf(pagetablecell10);
                                        int iAnchorColOf5 = tableModel3.anchorColOf(pagetablecell10);
                                        if (iAnchorRowOf4 >= 0 || iAnchorColOf5 < 0) {
                                            z13 = false;
                                        } else {
                                            int i48 = pagetablecell10.rowspan;
                                            if (i48 == 0) {
                                                i48 = 1;
                                            }
                                            int i49 = pagetablecell10.colspan;
                                            if (i49 == 0) {
                                                i49 = 1;
                                            }
                                            if (i48 > 1 || i49 > 1) {
                                                pagetablecell10.rowspan = 0;
                                                pagetablecell10.colspan = 0;
                                                pagetablecell10.flags &= -7;
                                                int i50 = iAnchorRowOf4;
                                                while (i50 < iAnchorRowOf4 + i48 && i50 < tableModel3.rowCount) {
                                                    TL_iv.pageTableRow pagetablerow = tableModel3.block.rows.get(i50);
                                                    ArrayList arrayList4 = new ArrayList();
                                                    ArrayList<TL_iv.pageTableCell> arrayList5 = pagetablerow.cells;
                                                    int i51 = i48;
                                                    int size4 = arrayList5.size();
                                                    int i52 = i49;
                                                    int i53 = 0;
                                                    while (i53 < size4) {
                                                        TL_iv.pageTableCell pagetablecell11 = arrayList5.get(i53);
                                                        i53++;
                                                        ArrayList<TL_iv.pageTableCell> arrayList6 = arrayList5;
                                                        TL_iv.pageTableCell pagetablecell12 = pagetablecell11;
                                                        arrayList4.add(new Object[]{pagetablecell12, Integer.valueOf(tableModel3.anchorColOf(pagetablecell12))});
                                                        arrayList5 = arrayList6;
                                                        tableModel3 = tableModel3;
                                                    }
                                                    TableModel tableModel4 = tableModel3;
                                                    int i54 = iAnchorColOf5;
                                                    while (i54 < iAnchorColOf5 + i52) {
                                                        if (i50 != iAnchorRowOf4 || i54 != iAnchorColOf5) {
                                                            TL_iv.pageTableCell pagetablecell13 = new TL_iv.pageTableCell();
                                                            pagetablecell13.header = pagetablecell10.header;
                                                            pagetablecell13.align_center = pagetablecell10.align_center;
                                                            pagetablecell13.align_right = pagetablecell10.align_right;
                                                            pagetablecell13.valign_middle = pagetablecell10.valign_middle;
                                                            pagetablecell13.valign_bottom = pagetablecell10.valign_bottom;
                                                            TableModel.applyPlainText(pagetablecell13, str);
                                                            arrayList4.add(new Object[]{pagetablecell13, Integer.valueOf(i54)});
                                                        }
                                                        i54++;
                                                        str = str;
                                                    }
                                                    String str2 = str;
                                                    Collections.sort(arrayList4, Comparator$CC.comparingInt(new TableModel$$ExternalSyntheticLambda1(0)));
                                                    pagetablerow.cells.clear();
                                                    int size5 = arrayList4.size();
                                                    int i55 = 0;
                                                    while (i55 < size5) {
                                                        Object obj3 = arrayList4.get(i55);
                                                        i55++;
                                                        pagetablerow.cells.add((TL_iv.pageTableCell) ((Object[]) obj3)[0]);
                                                    }
                                                    i50++;
                                                    i48 = i51;
                                                    i49 = i52;
                                                    str = str2;
                                                    tableModel3 = tableModel4;
                                                }
                                                tableModel3.rebuildFromBlock();
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                        }
                                        if (z13) {
                                            richTableCell3.refreshAfterModelChange();
                                            richTableCell3.grid.invalidate();
                                            richTableCell3.focusCellAt(iAnchorRowOf3, iAnchorColOf2);
                                            richTableCell3.notifyCellSelectionChanged();
                                        } else {
                                            linkedHashSet4.add(pagetablecell10);
                                        }
                                    } else {
                                        int i56 = pagetablecell10.rowspan;
                                        if (i56 == 0) {
                                            i56 = 1;
                                        }
                                        if (i56 > 1) {
                                            iAnchorRowOf3 = richTableCell3.model.anchorRowOf(pagetablecell10);
                                            iAnchorColOf2 = richTableCell3.model.anchorColOf(pagetablecell10);
                                            linkedHashSet4.clear();
                                            TableModel tableModel5 = richTableCell3.model;
                                            iAnchorRowOf4 = tableModel5.anchorRowOf(pagetablecell10);
                                            int iAnchorColOf6 = tableModel5.anchorColOf(pagetablecell10);
                                            if (iAnchorRowOf4 >= 0) {
                                                z13 = false;
                                            } else {
                                                z13 = false;
                                            }
                                            if (z13) {
                                                richTableCell3.refreshAfterModelChange();
                                                richTableCell3.grid.invalidate();
                                                richTableCell3.focusCellAt(iAnchorRowOf3, iAnchorColOf2);
                                                richTableCell3.notifyCellSelectionChanged();
                                            } else {
                                                linkedHashSet4.add(pagetablecell10);
                                            }
                                        }
                                    }
                                }
                            }
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 4:
                            richEditorListView2.getClass();
                            richTableCell3.applyInsertColumnFromSelection(true);
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 5:
                            richEditorListView2.getClass();
                            richTableCell3.applyInsertColumnFromSelection(false);
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 6:
                            richEditorListView2.getClass();
                            richTableCell3.applyInsertRowFromSelection(true);
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 7:
                            richEditorListView2.getClass();
                            richTableCell3.applyInsertRowFromSelection(false);
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        default:
                            richEditorListView2.getClass();
                            if (richTableCell3.model != null) {
                                LinkedHashSet linkedHashSet5 = richTableCell3.selectedCells;
                                if (!linkedHashSet5.isEmpty()) {
                                    HashSet hashSet10 = new HashSet();
                                    Iterator it10 = linkedHashSet5.iterator();
                                    while (it10.hasNext()) {
                                        int iAnchorColOf7 = richTableCell3.model.anchorColOf((TL_iv.pageTableCell) it10.next());
                                        hashSet10.add(Integer.valueOf(iAnchorColOf7));
                                        iMin3 = Math.min(iMin3, iAnchorColOf7);
                                    }
                                    linkedHashSet5.clear();
                                    TableModel tableModel6 = richTableCell3.model;
                                    tableModel6.getClass();
                                    if (hashSet10.isEmpty()) {
                                        i31 = 0;
                                    } else {
                                        boolean[] zArr3 = new boolean[tableModel6.colCount];
                                        Iterator it11 = hashSet10.iterator();
                                        while (it11.hasNext()) {
                                            int iIntValue4 = ((Integer) it11.next()).intValue();
                                            if (iIntValue4 >= 0 && iIntValue4 < tableModel6.colCount) {
                                                zArr3[iIntValue4] = true;
                                            }
                                        }
                                        int[] iArr4 = new int[tableModel6.colCount];
                                        int i57 = 0;
                                        for (int i58 = 0; i58 < tableModel6.colCount; i58++) {
                                            iArr4[i58] = i57;
                                            if (!zArr3[i58]) {
                                                i57++;
                                            }
                                        }
                                        if (i57 == 0) {
                                            tableModel6.block.rows.clear();
                                            tableModel6.rebuildFromBlock();
                                        } else {
                                            IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                            ArrayList arrayList7 = tableModel6.anchorsRowMajor;
                                            int size6 = arrayList7.size();
                                            int i59 = 0;
                                            while (i59 < size6) {
                                                Object obj4 = arrayList7.get(i59);
                                                i59 += i31;
                                                TL_iv.pageTableCell pagetablecell14 = (TL_iv.pageTableCell) obj4;
                                                int iAnchorRowOf8 = tableModel6.anchorRowOf(pagetablecell14);
                                                int iAnchorColOf8 = tableModel6.anchorColOf(pagetablecell14);
                                                int i60 = pagetablecell14.rowspan;
                                                if (i60 == 0) {
                                                    i60 = 1;
                                                }
                                                int i61 = pagetablecell14.colspan;
                                                if (i61 == 0) {
                                                    i61 = 1;
                                                }
                                                int[] iArr5 = iArr4;
                                                int i62 = 0;
                                                int i63 = -1;
                                                for (int i64 = iAnchorColOf8; i64 < iAnchorColOf8 + i61 && i64 < tableModel6.colCount; i64++) {
                                                    if (!zArr3[i64]) {
                                                        if (i63 < 0) {
                                                            i63 = i64;
                                                        }
                                                        i62++;
                                                    }
                                                }
                                                if (i63 >= 0) {
                                                    identityHashMap2.put(pagetablecell14, new int[]{iAnchorRowOf8, iArr5[i63], i60, i62});
                                                }
                                                iArr4 = iArr5;
                                                i31 = 1;
                                            }
                                            tableModel6.rewriteBlockRows(identityHashMap2, tableModel6.rowCount);
                                            tableModel6.rebuildFromBlock();
                                            i31 = 1;
                                        }
                                    }
                                    richTableCell3.refreshAfterModelChange();
                                    if (i31 != 0) {
                                        richTableCell3.focusCellAt(0, iMin3);
                                    }
                                }
                            }
                            richEditorListView2.exitCellSelectionMode();
                            break;
                    }
                }
            }, false);
        }
        if (i17 != 0) {
            final int i31 = 3;
            itemOptionsMakeMenu.add(R.drawable.iv_table_unmerge, LocaleController.getString(R.string.ArticleSplitCells), new Runnable(this) {
                public final RichEditorListView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    RichEditorListView richEditorListView;
                    boolean z12;
                    int iAnchorRowOf2;
                    TL_iv.RichText richText;
                    int iAnchorRowOf3;
                    int iAnchorColOf2;
                    int iAnchorRowOf4;
                    boolean z13;
                    String str = "";
                    int iMin3 = Integer.MAX_VALUE;
                    RichTableCell richTableCell3 = richTableCell2;
                    RichEditorListView richEditorListView2 = this.f$0;
                    int i32 = 1;
                    switch (i31) {
                        case 0:
                            richEditorListView2.getClass();
                            if (richTableCell3.model != null) {
                                LinkedHashSet linkedHashSet2 = richTableCell3.selectedCells;
                                if (linkedHashSet2.isEmpty()) {
                                    richEditorListView = richEditorListView2;
                                } else {
                                    HashSet hashSet7 = new HashSet();
                                    Iterator it8 = linkedHashSet2.iterator();
                                    while (it8.hasNext()) {
                                        int iAnchorRowOf5 = richTableCell3.model.anchorRowOf((TL_iv.pageTableCell) it8.next());
                                        hashSet7.add(Integer.valueOf(iAnchorRowOf5));
                                        iMin3 = Math.min(iMin3, iAnchorRowOf5);
                                    }
                                    linkedHashSet2.clear();
                                    TableModel tableModel = richTableCell3.model;
                                    tableModel.getClass();
                                    if (hashSet7.isEmpty()) {
                                        richEditorListView = richEditorListView2;
                                        z12 = false;
                                    } else {
                                        boolean[] zArr = new boolean[tableModel.rowCount];
                                        Iterator it9 = hashSet7.iterator();
                                        while (it9.hasNext()) {
                                            int iIntValue3 = ((Integer) it9.next()).intValue();
                                            if (iIntValue3 >= 0 && iIntValue3 < tableModel.rowCount) {
                                                zArr[iIntValue3] = true;
                                            }
                                        }
                                        int[] iArr2 = new int[tableModel.rowCount];
                                        int i33 = 0;
                                        for (int i34 = 0; i34 < tableModel.rowCount; i34++) {
                                            iArr2[i34] = i33;
                                            if (!zArr[i34]) {
                                                i33++;
                                            }
                                        }
                                        if (i33 == 0) {
                                            tableModel.block.rows.clear();
                                            tableModel.rebuildFromBlock();
                                            richEditorListView = richEditorListView2;
                                        } else {
                                            IdentityHashMap identityHashMap = new IdentityHashMap();
                                            ArrayList arrayList = tableModel.anchorsRowMajor;
                                            int size2 = arrayList.size();
                                            int i35 = 0;
                                            while (i35 < size2) {
                                                Object obj = arrayList.get(i35);
                                                i35++;
                                                TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                int iAnchorRowOf6 = tableModel.anchorRowOf(pagetablecell4);
                                                int iAnchorColOf3 = tableModel.anchorColOf(pagetablecell4);
                                                int i36 = pagetablecell4.rowspan;
                                                if (i36 == 0) {
                                                    i36 = 1;
                                                }
                                                int i37 = pagetablecell4.colspan;
                                                if (i37 == 0) {
                                                    i37 = 1;
                                                }
                                                int[] iArr3 = iArr2;
                                                boolean[] zArr2 = zArr;
                                                RichEditorListView richEditorListView3 = richEditorListView2;
                                                int i38 = 0;
                                                int i39 = -1;
                                                for (int i310 = iAnchorRowOf6; i310 < iAnchorRowOf6 + i36 && i310 < tableModel.rowCount; i310++) {
                                                    if (!zArr2[i310]) {
                                                        if (i39 < 0) {
                                                            i39 = i310;
                                                        }
                                                        i38++;
                                                    }
                                                }
                                                if (i39 >= 0) {
                                                    identityHashMap.put(pagetablecell4, new int[]{iArr3[i39], iAnchorColOf3, i38, i37});
                                                }
                                                iArr2 = iArr3;
                                                zArr = zArr2;
                                                richEditorListView2 = richEditorListView3;
                                            }
                                            richEditorListView = richEditorListView2;
                                            tableModel.rewriteBlockRows(identityHashMap, i33);
                                            tableModel.rebuildFromBlock();
                                        }
                                        z12 = true;
                                    }
                                    richTableCell3.refreshAfterModelChange();
                                    if (z12) {
                                        richTableCell3.focusCellAt(iMin3, 0);
                                    }
                                }
                            } else {
                                richEditorListView = richEditorListView2;
                            }
                            richEditorListView.exitCellSelectionMode();
                            break;
                        case 1:
                            richEditorListView2.getClass();
                            BlockRow row = richTableCell3.getRow();
                            richEditorListView2.exitCellSelectionMode();
                            if (row != null) {
                                RichEditorHistory richEditorHistory = richEditorListView2.history;
                                if (richEditorHistory != null) {
                                    AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
                                    richEditorHistory.commit();
                                }
                                ArrayList arrayList2 = richEditorListView2.rows;
                                int iIndexOf = arrayList2.indexOf(row);
                                if (iIndexOf >= 0) {
                                    arrayList2.remove(iIndexOf);
                                    richEditorListView2.adapter.update(true);
                                }
                                RichEditorHistory richEditorHistory2 = richEditorListView2.history;
                                if (richEditorHistory2 != null) {
                                    richEditorHistory2.record();
                                }
                                RichEditorListView.Delegate delegate = richEditorListView2.delegate;
                                if (delegate != null) {
                                    delegate.onContentChanged();
                                }
                            }
                            break;
                        case 2:
                            richEditorListView2.getClass();
                            if (richTableCell3.model != null) {
                                LinkedHashSet linkedHashSet3 = richTableCell3.selectedCells;
                                if (linkedHashSet3.size() >= 2) {
                                    HashSet<TL_iv.pageTableCell> hashSet8 = new HashSet(linkedHashSet3);
                                    int iMin4 = Integer.MAX_VALUE;
                                    int iMin5 = Integer.MAX_VALUE;
                                    for (TL_iv.pageTableCell pagetablecell5 : hashSet8) {
                                        iMin5 = Math.min(iMin5, richTableCell3.model.anchorRowOf(pagetablecell5));
                                        iMin4 = Math.min(iMin4, richTableCell3.model.anchorColOf(pagetablecell5));
                                    }
                                    linkedHashSet3.clear();
                                    TableModel tableModel2 = richTableCell3.model;
                                    tableModel2.getClass();
                                    if (hashSet8.size() < 2) {
                                        linkedHashSet3.addAll(hashSet8);
                                    } else {
                                        int iMax3 = -1;
                                        int iMax4 = -1;
                                        int iMin6 = Integer.MAX_VALUE;
                                        int iMin7 = Integer.MAX_VALUE;
                                        for (TL_iv.pageTableCell pagetablecell6 : hashSet8) {
                                            int iAnchorRowOf7 = tableModel2.anchorRowOf(pagetablecell6);
                                            int iAnchorColOf4 = tableModel2.anchorColOf(pagetablecell6);
                                            int i40 = pagetablecell6.rowspan;
                                            if (i40 == 0) {
                                                i40 = 1;
                                            }
                                            int i41 = pagetablecell6.colspan;
                                            if (i41 == 0) {
                                                i41 = 1;
                                            }
                                            iMin6 = Math.min(iMin6, iAnchorRowOf7);
                                            iMin7 = Math.min(iMin7, iAnchorColOf4);
                                            iMax3 = Math.max(iMax3, (iAnchorRowOf7 + i40) - 1);
                                            iMax4 = Math.max(iMax4, (iAnchorColOf4 + i41) - 1);
                                        }
                                        HashSet<TL_iv.pageTableCell> hashSet9 = new HashSet();
                                        int i42 = iMin6;
                                        while (true) {
                                            if (i42 <= iMax3) {
                                                int i43 = iMin7;
                                                while (true) {
                                                    if (i43 > iMax4) {
                                                        i42++;
                                                    } else if (i42 >= 0 && i43 >= 0 && i42 < tableModel2.rowCount && i43 < tableModel2.colCount) {
                                                        hashSet9.add(tableModel2.grid[i42][i43]);
                                                        i43++;
                                                    }
                                                }
                                            } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                StringBuilder sb = new StringBuilder();
                                                ArrayList arrayList3 = new ArrayList(hashSet9);
                                                Collections.sort(arrayList3, new TableModel$$ExternalSyntheticLambda0(tableModel2, 0));
                                                int size3 = arrayList3.size();
                                                int i44 = 0;
                                                while (i44 < size3) {
                                                    Object obj2 = arrayList3.get(i44);
                                                    i44++;
                                                    TL_iv.pageTableCell pagetablecell7 = (TL_iv.pageTableCell) obj2;
                                                    String strPlainOf = (pagetablecell7 == null || (richText = pagetablecell7.text) == null) ? "" : RichTextStyle.plainOf(richText);
                                                    if (!strPlainOf.isEmpty()) {
                                                        if (sb.length() > 0) {
                                                            sb.append("\n");
                                                        }
                                                        sb.append(strPlainOf);
                                                    }
                                                }
                                                TL_iv.pageTableCell pagetablecell8 = tableModel2.grid[iMin6][iMin7];
                                                int i45 = (iMax4 - iMin7) + 1;
                                                int i46 = (iMax3 - iMin6) + 1;
                                                if (i45 <= 1) {
                                                    i45 = 0;
                                                }
                                                pagetablecell8.colspan = i45;
                                                if (i46 <= 1) {
                                                    i46 = 0;
                                                }
                                                pagetablecell8.rowspan = i46;
                                                pagetablecell8.flags = i45 > 0 ? pagetablecell8.flags | 2 : pagetablecell8.flags & (-3);
                                                pagetablecell8.flags = i46 > 0 ? pagetablecell8.flags | 4 : pagetablecell8.flags & (-5);
                                                TableModel.applyPlainText(pagetablecell8, sb.toString());
                                                for (TL_iv.pageTableCell pagetablecell9 : hashSet9) {
                                                    if (pagetablecell9 != pagetablecell8 && (iAnchorRowOf2 = tableModel2.anchorRowOf(pagetablecell9)) >= 0) {
                                                        TL_iv.pageBlockTable pageblocktable = tableModel2.block;
                                                        if (iAnchorRowOf2 < pageblocktable.rows.size()) {
                                                            pageblocktable.rows.get(iAnchorRowOf2).cells.remove(pagetablecell9);
                                                        }
                                                    }
                                                }
                                                tableModel2.rebuildFromBlock();
                                                richTableCell3.refreshAfterModelChange();
                                                richTableCell3.grid.invalidate();
                                                richTableCell3.focusCellAt(iMin5, iMin4);
                                                richTableCell3.notifyCellSelectionChanged();
                                            }
                                        }
                                        linkedHashSet3.addAll(hashSet8);
                                    }
                                }
                            }
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 3:
                            richEditorListView2.getClass();
                            if (richTableCell3.model != null) {
                                LinkedHashSet linkedHashSet4 = richTableCell3.selectedCells;
                                if (linkedHashSet4.size() == 1) {
                                    TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                    int i47 = pagetablecell10.colspan;
                                    if (i47 == 0) {
                                        i47 = 1;
                                    }
                                    if (i47 > 1) {
                                        iAnchorRowOf3 = richTableCell3.model.anchorRowOf(pagetablecell10);
                                        iAnchorColOf2 = richTableCell3.model.anchorColOf(pagetablecell10);
                                        linkedHashSet4.clear();
                                        TableModel tableModel5 = richTableCell3.model;
                                        iAnchorRowOf4 = tableModel5.anchorRowOf(pagetablecell10);
                                        int iAnchorColOf6 = tableModel5.anchorColOf(pagetablecell10);
                                        if (iAnchorRowOf4 >= 0 || iAnchorColOf6 < 0) {
                                            z13 = false;
                                        } else {
                                            int i48 = pagetablecell10.rowspan;
                                            if (i48 == 0) {
                                                i48 = 1;
                                            }
                                            int i49 = pagetablecell10.colspan;
                                            if (i49 == 0) {
                                                i49 = 1;
                                            }
                                            if (i48 > 1 || i49 > 1) {
                                                pagetablecell10.rowspan = 0;
                                                pagetablecell10.colspan = 0;
                                                pagetablecell10.flags &= -7;
                                                int i50 = iAnchorRowOf4;
                                                while (i50 < iAnchorRowOf4 + i48 && i50 < tableModel5.rowCount) {
                                                    TL_iv.pageTableRow pagetablerow = tableModel5.block.rows.get(i50);
                                                    ArrayList arrayList4 = new ArrayList();
                                                    ArrayList<TL_iv.pageTableCell> arrayList5 = pagetablerow.cells;
                                                    int i51 = i48;
                                                    int size4 = arrayList5.size();
                                                    int i52 = i49;
                                                    int i53 = 0;
                                                    while (i53 < size4) {
                                                        TL_iv.pageTableCell pagetablecell11 = arrayList5.get(i53);
                                                        i53++;
                                                        ArrayList<TL_iv.pageTableCell> arrayList6 = arrayList5;
                                                        TL_iv.pageTableCell pagetablecell12 = pagetablecell11;
                                                        arrayList4.add(new Object[]{pagetablecell12, Integer.valueOf(tableModel5.anchorColOf(pagetablecell12))});
                                                        arrayList5 = arrayList6;
                                                        tableModel5 = tableModel5;
                                                    }
                                                    TableModel tableModel4 = tableModel5;
                                                    int i54 = iAnchorColOf6;
                                                    while (i54 < iAnchorColOf6 + i52) {
                                                        if (i50 != iAnchorRowOf4 || i54 != iAnchorColOf6) {
                                                            TL_iv.pageTableCell pagetablecell13 = new TL_iv.pageTableCell();
                                                            pagetablecell13.header = pagetablecell10.header;
                                                            pagetablecell13.align_center = pagetablecell10.align_center;
                                                            pagetablecell13.align_right = pagetablecell10.align_right;
                                                            pagetablecell13.valign_middle = pagetablecell10.valign_middle;
                                                            pagetablecell13.valign_bottom = pagetablecell10.valign_bottom;
                                                            TableModel.applyPlainText(pagetablecell13, str);
                                                            arrayList4.add(new Object[]{pagetablecell13, Integer.valueOf(i54)});
                                                        }
                                                        i54++;
                                                        str = str;
                                                    }
                                                    String str2 = str;
                                                    Collections.sort(arrayList4, Comparator$CC.comparingInt(new TableModel$$ExternalSyntheticLambda1(0)));
                                                    pagetablerow.cells.clear();
                                                    int size5 = arrayList4.size();
                                                    int i55 = 0;
                                                    while (i55 < size5) {
                                                        Object obj3 = arrayList4.get(i55);
                                                        i55++;
                                                        pagetablerow.cells.add((TL_iv.pageTableCell) ((Object[]) obj3)[0]);
                                                    }
                                                    i50++;
                                                    i48 = i51;
                                                    i49 = i52;
                                                    str = str2;
                                                    tableModel5 = tableModel4;
                                                }
                                                tableModel5.rebuildFromBlock();
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                        }
                                        if (z13) {
                                            richTableCell3.refreshAfterModelChange();
                                            richTableCell3.grid.invalidate();
                                            richTableCell3.focusCellAt(iAnchorRowOf3, iAnchorColOf2);
                                            richTableCell3.notifyCellSelectionChanged();
                                        } else {
                                            linkedHashSet4.add(pagetablecell10);
                                        }
                                    } else {
                                        int i56 = pagetablecell10.rowspan;
                                        if (i56 == 0) {
                                            i56 = 1;
                                        }
                                        if (i56 > 1) {
                                            iAnchorRowOf3 = richTableCell3.model.anchorRowOf(pagetablecell10);
                                            iAnchorColOf2 = richTableCell3.model.anchorColOf(pagetablecell10);
                                            linkedHashSet4.clear();
                                            TableModel tableModel6 = richTableCell3.model;
                                            iAnchorRowOf4 = tableModel6.anchorRowOf(pagetablecell10);
                                            int iAnchorColOf7 = tableModel6.anchorColOf(pagetablecell10);
                                            if (iAnchorRowOf4 >= 0) {
                                                z13 = false;
                                            } else {
                                                z13 = false;
                                            }
                                            if (z13) {
                                                richTableCell3.refreshAfterModelChange();
                                                richTableCell3.grid.invalidate();
                                                richTableCell3.focusCellAt(iAnchorRowOf3, iAnchorColOf2);
                                                richTableCell3.notifyCellSelectionChanged();
                                            } else {
                                                linkedHashSet4.add(pagetablecell10);
                                            }
                                        }
                                    }
                                }
                            }
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 4:
                            richEditorListView2.getClass();
                            richTableCell3.applyInsertColumnFromSelection(true);
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 5:
                            richEditorListView2.getClass();
                            richTableCell3.applyInsertColumnFromSelection(false);
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 6:
                            richEditorListView2.getClass();
                            richTableCell3.applyInsertRowFromSelection(true);
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 7:
                            richEditorListView2.getClass();
                            richTableCell3.applyInsertRowFromSelection(false);
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        default:
                            richEditorListView2.getClass();
                            if (richTableCell3.model != null) {
                                LinkedHashSet linkedHashSet5 = richTableCell3.selectedCells;
                                if (!linkedHashSet5.isEmpty()) {
                                    HashSet hashSet10 = new HashSet();
                                    Iterator it10 = linkedHashSet5.iterator();
                                    while (it10.hasNext()) {
                                        int iAnchorColOf8 = richTableCell3.model.anchorColOf((TL_iv.pageTableCell) it10.next());
                                        hashSet10.add(Integer.valueOf(iAnchorColOf8));
                                        iMin3 = Math.min(iMin3, iAnchorColOf8);
                                    }
                                    linkedHashSet5.clear();
                                    TableModel tableModel7 = richTableCell3.model;
                                    tableModel7.getClass();
                                    if (hashSet10.isEmpty()) {
                                        i32 = 0;
                                    } else {
                                        boolean[] zArr3 = new boolean[tableModel7.colCount];
                                        Iterator it11 = hashSet10.iterator();
                                        while (it11.hasNext()) {
                                            int iIntValue4 = ((Integer) it11.next()).intValue();
                                            if (iIntValue4 >= 0 && iIntValue4 < tableModel7.colCount) {
                                                zArr3[iIntValue4] = true;
                                            }
                                        }
                                        int[] iArr4 = new int[tableModel7.colCount];
                                        int i57 = 0;
                                        for (int i58 = 0; i58 < tableModel7.colCount; i58++) {
                                            iArr4[i58] = i57;
                                            if (!zArr3[i58]) {
                                                i57++;
                                            }
                                        }
                                        if (i57 == 0) {
                                            tableModel7.block.rows.clear();
                                            tableModel7.rebuildFromBlock();
                                        } else {
                                            IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                            ArrayList arrayList7 = tableModel7.anchorsRowMajor;
                                            int size6 = arrayList7.size();
                                            int i59 = 0;
                                            while (i59 < size6) {
                                                Object obj4 = arrayList7.get(i59);
                                                i59 += i32;
                                                TL_iv.pageTableCell pagetablecell14 = (TL_iv.pageTableCell) obj4;
                                                int iAnchorRowOf8 = tableModel7.anchorRowOf(pagetablecell14);
                                                int iAnchorColOf9 = tableModel7.anchorColOf(pagetablecell14);
                                                int i60 = pagetablecell14.rowspan;
                                                if (i60 == 0) {
                                                    i60 = 1;
                                                }
                                                int i61 = pagetablecell14.colspan;
                                                if (i61 == 0) {
                                                    i61 = 1;
                                                }
                                                int[] iArr5 = iArr4;
                                                int i62 = 0;
                                                int i63 = -1;
                                                for (int i64 = iAnchorColOf9; i64 < iAnchorColOf9 + i61 && i64 < tableModel7.colCount; i64++) {
                                                    if (!zArr3[i64]) {
                                                        if (i63 < 0) {
                                                            i63 = i64;
                                                        }
                                                        i62++;
                                                    }
                                                }
                                                if (i63 >= 0) {
                                                    identityHashMap2.put(pagetablecell14, new int[]{iAnchorRowOf8, iArr5[i63], i60, i62});
                                                }
                                                iArr4 = iArr5;
                                                i32 = 1;
                                            }
                                            tableModel7.rewriteBlockRows(identityHashMap2, tableModel7.rowCount);
                                            tableModel7.rebuildFromBlock();
                                            i32 = 1;
                                        }
                                    }
                                    richTableCell3.refreshAfterModelChange();
                                    if (i32 != 0) {
                                        richTableCell3.focusCellAt(0, iMin3);
                                    }
                                }
                            }
                            richEditorListView2.exitCellSelectionMode();
                            break;
                    }
                }
            }, false);
        }
        if (z6) {
            final int i32 = 4;
            itemOptionsMakeMenu.add(R.drawable.iv_table_insert_left, LocaleController.getString(R.string.ArticleInsertLeft), new Runnable(this) {
                public final RichEditorListView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    RichEditorListView richEditorListView;
                    boolean z12;
                    int iAnchorRowOf2;
                    TL_iv.RichText richText;
                    int iAnchorRowOf3;
                    int iAnchorColOf2;
                    int iAnchorRowOf4;
                    boolean z13;
                    String str = "";
                    int iMin3 = Integer.MAX_VALUE;
                    RichTableCell richTableCell3 = richTableCell2;
                    RichEditorListView richEditorListView2 = this.f$0;
                    int i33 = 1;
                    switch (i32) {
                        case 0:
                            richEditorListView2.getClass();
                            if (richTableCell3.model != null) {
                                LinkedHashSet linkedHashSet2 = richTableCell3.selectedCells;
                                if (linkedHashSet2.isEmpty()) {
                                    richEditorListView = richEditorListView2;
                                } else {
                                    HashSet hashSet7 = new HashSet();
                                    Iterator it8 = linkedHashSet2.iterator();
                                    while (it8.hasNext()) {
                                        int iAnchorRowOf5 = richTableCell3.model.anchorRowOf((TL_iv.pageTableCell) it8.next());
                                        hashSet7.add(Integer.valueOf(iAnchorRowOf5));
                                        iMin3 = Math.min(iMin3, iAnchorRowOf5);
                                    }
                                    linkedHashSet2.clear();
                                    TableModel tableModel = richTableCell3.model;
                                    tableModel.getClass();
                                    if (hashSet7.isEmpty()) {
                                        richEditorListView = richEditorListView2;
                                        z12 = false;
                                    } else {
                                        boolean[] zArr = new boolean[tableModel.rowCount];
                                        Iterator it9 = hashSet7.iterator();
                                        while (it9.hasNext()) {
                                            int iIntValue3 = ((Integer) it9.next()).intValue();
                                            if (iIntValue3 >= 0 && iIntValue3 < tableModel.rowCount) {
                                                zArr[iIntValue3] = true;
                                            }
                                        }
                                        int[] iArr2 = new int[tableModel.rowCount];
                                        int i34 = 0;
                                        for (int i35 = 0; i35 < tableModel.rowCount; i35++) {
                                            iArr2[i35] = i34;
                                            if (!zArr[i35]) {
                                                i34++;
                                            }
                                        }
                                        if (i34 == 0) {
                                            tableModel.block.rows.clear();
                                            tableModel.rebuildFromBlock();
                                            richEditorListView = richEditorListView2;
                                        } else {
                                            IdentityHashMap identityHashMap = new IdentityHashMap();
                                            ArrayList arrayList = tableModel.anchorsRowMajor;
                                            int size2 = arrayList.size();
                                            int i36 = 0;
                                            while (i36 < size2) {
                                                Object obj = arrayList.get(i36);
                                                i36++;
                                                TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                int iAnchorRowOf6 = tableModel.anchorRowOf(pagetablecell4);
                                                int iAnchorColOf3 = tableModel.anchorColOf(pagetablecell4);
                                                int i37 = pagetablecell4.rowspan;
                                                if (i37 == 0) {
                                                    i37 = 1;
                                                }
                                                int i38 = pagetablecell4.colspan;
                                                if (i38 == 0) {
                                                    i38 = 1;
                                                }
                                                int[] iArr3 = iArr2;
                                                boolean[] zArr2 = zArr;
                                                RichEditorListView richEditorListView3 = richEditorListView2;
                                                int i39 = 0;
                                                int i310 = -1;
                                                for (int i311 = iAnchorRowOf6; i311 < iAnchorRowOf6 + i37 && i311 < tableModel.rowCount; i311++) {
                                                    if (!zArr2[i311]) {
                                                        if (i310 < 0) {
                                                            i310 = i311;
                                                        }
                                                        i39++;
                                                    }
                                                }
                                                if (i310 >= 0) {
                                                    identityHashMap.put(pagetablecell4, new int[]{iArr3[i310], iAnchorColOf3, i39, i38});
                                                }
                                                iArr2 = iArr3;
                                                zArr = zArr2;
                                                richEditorListView2 = richEditorListView3;
                                            }
                                            richEditorListView = richEditorListView2;
                                            tableModel.rewriteBlockRows(identityHashMap, i34);
                                            tableModel.rebuildFromBlock();
                                        }
                                        z12 = true;
                                    }
                                    richTableCell3.refreshAfterModelChange();
                                    if (z12) {
                                        richTableCell3.focusCellAt(iMin3, 0);
                                    }
                                }
                            } else {
                                richEditorListView = richEditorListView2;
                            }
                            richEditorListView.exitCellSelectionMode();
                            break;
                        case 1:
                            richEditorListView2.getClass();
                            BlockRow row = richTableCell3.getRow();
                            richEditorListView2.exitCellSelectionMode();
                            if (row != null) {
                                RichEditorHistory richEditorHistory = richEditorListView2.history;
                                if (richEditorHistory != null) {
                                    AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
                                    richEditorHistory.commit();
                                }
                                ArrayList arrayList2 = richEditorListView2.rows;
                                int iIndexOf = arrayList2.indexOf(row);
                                if (iIndexOf >= 0) {
                                    arrayList2.remove(iIndexOf);
                                    richEditorListView2.adapter.update(true);
                                }
                                RichEditorHistory richEditorHistory2 = richEditorListView2.history;
                                if (richEditorHistory2 != null) {
                                    richEditorHistory2.record();
                                }
                                RichEditorListView.Delegate delegate = richEditorListView2.delegate;
                                if (delegate != null) {
                                    delegate.onContentChanged();
                                }
                            }
                            break;
                        case 2:
                            richEditorListView2.getClass();
                            if (richTableCell3.model != null) {
                                LinkedHashSet linkedHashSet3 = richTableCell3.selectedCells;
                                if (linkedHashSet3.size() >= 2) {
                                    HashSet<TL_iv.pageTableCell> hashSet8 = new HashSet(linkedHashSet3);
                                    int iMin4 = Integer.MAX_VALUE;
                                    int iMin5 = Integer.MAX_VALUE;
                                    for (TL_iv.pageTableCell pagetablecell5 : hashSet8) {
                                        iMin5 = Math.min(iMin5, richTableCell3.model.anchorRowOf(pagetablecell5));
                                        iMin4 = Math.min(iMin4, richTableCell3.model.anchorColOf(pagetablecell5));
                                    }
                                    linkedHashSet3.clear();
                                    TableModel tableModel2 = richTableCell3.model;
                                    tableModel2.getClass();
                                    if (hashSet8.size() < 2) {
                                        linkedHashSet3.addAll(hashSet8);
                                    } else {
                                        int iMax3 = -1;
                                        int iMax4 = -1;
                                        int iMin6 = Integer.MAX_VALUE;
                                        int iMin7 = Integer.MAX_VALUE;
                                        for (TL_iv.pageTableCell pagetablecell6 : hashSet8) {
                                            int iAnchorRowOf7 = tableModel2.anchorRowOf(pagetablecell6);
                                            int iAnchorColOf4 = tableModel2.anchorColOf(pagetablecell6);
                                            int i40 = pagetablecell6.rowspan;
                                            if (i40 == 0) {
                                                i40 = 1;
                                            }
                                            int i41 = pagetablecell6.colspan;
                                            if (i41 == 0) {
                                                i41 = 1;
                                            }
                                            iMin6 = Math.min(iMin6, iAnchorRowOf7);
                                            iMin7 = Math.min(iMin7, iAnchorColOf4);
                                            iMax3 = Math.max(iMax3, (iAnchorRowOf7 + i40) - 1);
                                            iMax4 = Math.max(iMax4, (iAnchorColOf4 + i41) - 1);
                                        }
                                        HashSet<TL_iv.pageTableCell> hashSet9 = new HashSet();
                                        int i42 = iMin6;
                                        while (true) {
                                            if (i42 <= iMax3) {
                                                int i43 = iMin7;
                                                while (true) {
                                                    if (i43 > iMax4) {
                                                        i42++;
                                                    } else if (i42 >= 0 && i43 >= 0 && i42 < tableModel2.rowCount && i43 < tableModel2.colCount) {
                                                        hashSet9.add(tableModel2.grid[i42][i43]);
                                                        i43++;
                                                    }
                                                }
                                            } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                StringBuilder sb = new StringBuilder();
                                                ArrayList arrayList3 = new ArrayList(hashSet9);
                                                Collections.sort(arrayList3, new TableModel$$ExternalSyntheticLambda0(tableModel2, 0));
                                                int size3 = arrayList3.size();
                                                int i44 = 0;
                                                while (i44 < size3) {
                                                    Object obj2 = arrayList3.get(i44);
                                                    i44++;
                                                    TL_iv.pageTableCell pagetablecell7 = (TL_iv.pageTableCell) obj2;
                                                    String strPlainOf = (pagetablecell7 == null || (richText = pagetablecell7.text) == null) ? "" : RichTextStyle.plainOf(richText);
                                                    if (!strPlainOf.isEmpty()) {
                                                        if (sb.length() > 0) {
                                                            sb.append("\n");
                                                        }
                                                        sb.append(strPlainOf);
                                                    }
                                                }
                                                TL_iv.pageTableCell pagetablecell8 = tableModel2.grid[iMin6][iMin7];
                                                int i45 = (iMax4 - iMin7) + 1;
                                                int i46 = (iMax3 - iMin6) + 1;
                                                if (i45 <= 1) {
                                                    i45 = 0;
                                                }
                                                pagetablecell8.colspan = i45;
                                                if (i46 <= 1) {
                                                    i46 = 0;
                                                }
                                                pagetablecell8.rowspan = i46;
                                                pagetablecell8.flags = i45 > 0 ? pagetablecell8.flags | 2 : pagetablecell8.flags & (-3);
                                                pagetablecell8.flags = i46 > 0 ? pagetablecell8.flags | 4 : pagetablecell8.flags & (-5);
                                                TableModel.applyPlainText(pagetablecell8, sb.toString());
                                                for (TL_iv.pageTableCell pagetablecell9 : hashSet9) {
                                                    if (pagetablecell9 != pagetablecell8 && (iAnchorRowOf2 = tableModel2.anchorRowOf(pagetablecell9)) >= 0) {
                                                        TL_iv.pageBlockTable pageblocktable = tableModel2.block;
                                                        if (iAnchorRowOf2 < pageblocktable.rows.size()) {
                                                            pageblocktable.rows.get(iAnchorRowOf2).cells.remove(pagetablecell9);
                                                        }
                                                    }
                                                }
                                                tableModel2.rebuildFromBlock();
                                                richTableCell3.refreshAfterModelChange();
                                                richTableCell3.grid.invalidate();
                                                richTableCell3.focusCellAt(iMin5, iMin4);
                                                richTableCell3.notifyCellSelectionChanged();
                                            }
                                        }
                                        linkedHashSet3.addAll(hashSet8);
                                    }
                                }
                            }
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 3:
                            richEditorListView2.getClass();
                            if (richTableCell3.model != null) {
                                LinkedHashSet linkedHashSet4 = richTableCell3.selectedCells;
                                if (linkedHashSet4.size() == 1) {
                                    TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                    int i47 = pagetablecell10.colspan;
                                    if (i47 == 0) {
                                        i47 = 1;
                                    }
                                    if (i47 > 1) {
                                        iAnchorRowOf3 = richTableCell3.model.anchorRowOf(pagetablecell10);
                                        iAnchorColOf2 = richTableCell3.model.anchorColOf(pagetablecell10);
                                        linkedHashSet4.clear();
                                        TableModel tableModel6 = richTableCell3.model;
                                        iAnchorRowOf4 = tableModel6.anchorRowOf(pagetablecell10);
                                        int iAnchorColOf7 = tableModel6.anchorColOf(pagetablecell10);
                                        if (iAnchorRowOf4 >= 0 || iAnchorColOf7 < 0) {
                                            z13 = false;
                                        } else {
                                            int i48 = pagetablecell10.rowspan;
                                            if (i48 == 0) {
                                                i48 = 1;
                                            }
                                            int i49 = pagetablecell10.colspan;
                                            if (i49 == 0) {
                                                i49 = 1;
                                            }
                                            if (i48 > 1 || i49 > 1) {
                                                pagetablecell10.rowspan = 0;
                                                pagetablecell10.colspan = 0;
                                                pagetablecell10.flags &= -7;
                                                int i50 = iAnchorRowOf4;
                                                while (i50 < iAnchorRowOf4 + i48 && i50 < tableModel6.rowCount) {
                                                    TL_iv.pageTableRow pagetablerow = tableModel6.block.rows.get(i50);
                                                    ArrayList arrayList4 = new ArrayList();
                                                    ArrayList<TL_iv.pageTableCell> arrayList5 = pagetablerow.cells;
                                                    int i51 = i48;
                                                    int size4 = arrayList5.size();
                                                    int i52 = i49;
                                                    int i53 = 0;
                                                    while (i53 < size4) {
                                                        TL_iv.pageTableCell pagetablecell11 = arrayList5.get(i53);
                                                        i53++;
                                                        ArrayList<TL_iv.pageTableCell> arrayList6 = arrayList5;
                                                        TL_iv.pageTableCell pagetablecell12 = pagetablecell11;
                                                        arrayList4.add(new Object[]{pagetablecell12, Integer.valueOf(tableModel6.anchorColOf(pagetablecell12))});
                                                        arrayList5 = arrayList6;
                                                        tableModel6 = tableModel6;
                                                    }
                                                    TableModel tableModel4 = tableModel6;
                                                    int i54 = iAnchorColOf7;
                                                    while (i54 < iAnchorColOf7 + i52) {
                                                        if (i50 != iAnchorRowOf4 || i54 != iAnchorColOf7) {
                                                            TL_iv.pageTableCell pagetablecell13 = new TL_iv.pageTableCell();
                                                            pagetablecell13.header = pagetablecell10.header;
                                                            pagetablecell13.align_center = pagetablecell10.align_center;
                                                            pagetablecell13.align_right = pagetablecell10.align_right;
                                                            pagetablecell13.valign_middle = pagetablecell10.valign_middle;
                                                            pagetablecell13.valign_bottom = pagetablecell10.valign_bottom;
                                                            TableModel.applyPlainText(pagetablecell13, str);
                                                            arrayList4.add(new Object[]{pagetablecell13, Integer.valueOf(i54)});
                                                        }
                                                        i54++;
                                                        str = str;
                                                    }
                                                    String str2 = str;
                                                    Collections.sort(arrayList4, Comparator$CC.comparingInt(new TableModel$$ExternalSyntheticLambda1(0)));
                                                    pagetablerow.cells.clear();
                                                    int size5 = arrayList4.size();
                                                    int i55 = 0;
                                                    while (i55 < size5) {
                                                        Object obj3 = arrayList4.get(i55);
                                                        i55++;
                                                        pagetablerow.cells.add((TL_iv.pageTableCell) ((Object[]) obj3)[0]);
                                                    }
                                                    i50++;
                                                    i48 = i51;
                                                    i49 = i52;
                                                    str = str2;
                                                    tableModel6 = tableModel4;
                                                }
                                                tableModel6.rebuildFromBlock();
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                        }
                                        if (z13) {
                                            richTableCell3.refreshAfterModelChange();
                                            richTableCell3.grid.invalidate();
                                            richTableCell3.focusCellAt(iAnchorRowOf3, iAnchorColOf2);
                                            richTableCell3.notifyCellSelectionChanged();
                                        } else {
                                            linkedHashSet4.add(pagetablecell10);
                                        }
                                    } else {
                                        int i56 = pagetablecell10.rowspan;
                                        if (i56 == 0) {
                                            i56 = 1;
                                        }
                                        if (i56 > 1) {
                                            iAnchorRowOf3 = richTableCell3.model.anchorRowOf(pagetablecell10);
                                            iAnchorColOf2 = richTableCell3.model.anchorColOf(pagetablecell10);
                                            linkedHashSet4.clear();
                                            TableModel tableModel7 = richTableCell3.model;
                                            iAnchorRowOf4 = tableModel7.anchorRowOf(pagetablecell10);
                                            int iAnchorColOf8 = tableModel7.anchorColOf(pagetablecell10);
                                            if (iAnchorRowOf4 >= 0) {
                                                z13 = false;
                                            } else {
                                                z13 = false;
                                            }
                                            if (z13) {
                                                richTableCell3.refreshAfterModelChange();
                                                richTableCell3.grid.invalidate();
                                                richTableCell3.focusCellAt(iAnchorRowOf3, iAnchorColOf2);
                                                richTableCell3.notifyCellSelectionChanged();
                                            } else {
                                                linkedHashSet4.add(pagetablecell10);
                                            }
                                        }
                                    }
                                }
                            }
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 4:
                            richEditorListView2.getClass();
                            richTableCell3.applyInsertColumnFromSelection(true);
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 5:
                            richEditorListView2.getClass();
                            richTableCell3.applyInsertColumnFromSelection(false);
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 6:
                            richEditorListView2.getClass();
                            richTableCell3.applyInsertRowFromSelection(true);
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 7:
                            richEditorListView2.getClass();
                            richTableCell3.applyInsertRowFromSelection(false);
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        default:
                            richEditorListView2.getClass();
                            if (richTableCell3.model != null) {
                                LinkedHashSet linkedHashSet5 = richTableCell3.selectedCells;
                                if (!linkedHashSet5.isEmpty()) {
                                    HashSet hashSet10 = new HashSet();
                                    Iterator it10 = linkedHashSet5.iterator();
                                    while (it10.hasNext()) {
                                        int iAnchorColOf9 = richTableCell3.model.anchorColOf((TL_iv.pageTableCell) it10.next());
                                        hashSet10.add(Integer.valueOf(iAnchorColOf9));
                                        iMin3 = Math.min(iMin3, iAnchorColOf9);
                                    }
                                    linkedHashSet5.clear();
                                    TableModel tableModel8 = richTableCell3.model;
                                    tableModel8.getClass();
                                    if (hashSet10.isEmpty()) {
                                        i33 = 0;
                                    } else {
                                        boolean[] zArr3 = new boolean[tableModel8.colCount];
                                        Iterator it11 = hashSet10.iterator();
                                        while (it11.hasNext()) {
                                            int iIntValue4 = ((Integer) it11.next()).intValue();
                                            if (iIntValue4 >= 0 && iIntValue4 < tableModel8.colCount) {
                                                zArr3[iIntValue4] = true;
                                            }
                                        }
                                        int[] iArr4 = new int[tableModel8.colCount];
                                        int i57 = 0;
                                        for (int i58 = 0; i58 < tableModel8.colCount; i58++) {
                                            iArr4[i58] = i57;
                                            if (!zArr3[i58]) {
                                                i57++;
                                            }
                                        }
                                        if (i57 == 0) {
                                            tableModel8.block.rows.clear();
                                            tableModel8.rebuildFromBlock();
                                        } else {
                                            IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                            ArrayList arrayList7 = tableModel8.anchorsRowMajor;
                                            int size6 = arrayList7.size();
                                            int i59 = 0;
                                            while (i59 < size6) {
                                                Object obj4 = arrayList7.get(i59);
                                                i59 += i33;
                                                TL_iv.pageTableCell pagetablecell14 = (TL_iv.pageTableCell) obj4;
                                                int iAnchorRowOf8 = tableModel8.anchorRowOf(pagetablecell14);
                                                int iAnchorColOf10 = tableModel8.anchorColOf(pagetablecell14);
                                                int i60 = pagetablecell14.rowspan;
                                                if (i60 == 0) {
                                                    i60 = 1;
                                                }
                                                int i61 = pagetablecell14.colspan;
                                                if (i61 == 0) {
                                                    i61 = 1;
                                                }
                                                int[] iArr5 = iArr4;
                                                int i62 = 0;
                                                int i63 = -1;
                                                for (int i64 = iAnchorColOf10; i64 < iAnchorColOf10 + i61 && i64 < tableModel8.colCount; i64++) {
                                                    if (!zArr3[i64]) {
                                                        if (i63 < 0) {
                                                            i63 = i64;
                                                        }
                                                        i62++;
                                                    }
                                                }
                                                if (i63 >= 0) {
                                                    identityHashMap2.put(pagetablecell14, new int[]{iAnchorRowOf8, iArr5[i63], i60, i62});
                                                }
                                                iArr4 = iArr5;
                                                i33 = 1;
                                            }
                                            tableModel8.rewriteBlockRows(identityHashMap2, tableModel8.rowCount);
                                            tableModel8.rebuildFromBlock();
                                            i33 = 1;
                                        }
                                    }
                                    richTableCell3.refreshAfterModelChange();
                                    if (i33 != 0) {
                                        richTableCell3.focusCellAt(0, iMin3);
                                    }
                                }
                            }
                            richEditorListView2.exitCellSelectionMode();
                            break;
                    }
                }
            }, false);
            final int i33 = 5;
            itemOptionsMakeMenu.add(R.drawable.iv_table_insert_right, LocaleController.getString(R.string.ArticleInsertRight), new Runnable(this) {
                public final RichEditorListView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    RichEditorListView richEditorListView;
                    boolean z12;
                    int iAnchorRowOf2;
                    TL_iv.RichText richText;
                    int iAnchorRowOf3;
                    int iAnchorColOf2;
                    int iAnchorRowOf4;
                    boolean z13;
                    String str = "";
                    int iMin3 = Integer.MAX_VALUE;
                    RichTableCell richTableCell3 = richTableCell2;
                    RichEditorListView richEditorListView2 = this.f$0;
                    int i34 = 1;
                    switch (i33) {
                        case 0:
                            richEditorListView2.getClass();
                            if (richTableCell3.model != null) {
                                LinkedHashSet linkedHashSet2 = richTableCell3.selectedCells;
                                if (linkedHashSet2.isEmpty()) {
                                    richEditorListView = richEditorListView2;
                                } else {
                                    HashSet hashSet7 = new HashSet();
                                    Iterator it8 = linkedHashSet2.iterator();
                                    while (it8.hasNext()) {
                                        int iAnchorRowOf5 = richTableCell3.model.anchorRowOf((TL_iv.pageTableCell) it8.next());
                                        hashSet7.add(Integer.valueOf(iAnchorRowOf5));
                                        iMin3 = Math.min(iMin3, iAnchorRowOf5);
                                    }
                                    linkedHashSet2.clear();
                                    TableModel tableModel = richTableCell3.model;
                                    tableModel.getClass();
                                    if (hashSet7.isEmpty()) {
                                        richEditorListView = richEditorListView2;
                                        z12 = false;
                                    } else {
                                        boolean[] zArr = new boolean[tableModel.rowCount];
                                        Iterator it9 = hashSet7.iterator();
                                        while (it9.hasNext()) {
                                            int iIntValue3 = ((Integer) it9.next()).intValue();
                                            if (iIntValue3 >= 0 && iIntValue3 < tableModel.rowCount) {
                                                zArr[iIntValue3] = true;
                                            }
                                        }
                                        int[] iArr2 = new int[tableModel.rowCount];
                                        int i35 = 0;
                                        for (int i36 = 0; i36 < tableModel.rowCount; i36++) {
                                            iArr2[i36] = i35;
                                            if (!zArr[i36]) {
                                                i35++;
                                            }
                                        }
                                        if (i35 == 0) {
                                            tableModel.block.rows.clear();
                                            tableModel.rebuildFromBlock();
                                            richEditorListView = richEditorListView2;
                                        } else {
                                            IdentityHashMap identityHashMap = new IdentityHashMap();
                                            ArrayList arrayList = tableModel.anchorsRowMajor;
                                            int size2 = arrayList.size();
                                            int i37 = 0;
                                            while (i37 < size2) {
                                                Object obj = arrayList.get(i37);
                                                i37++;
                                                TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                int iAnchorRowOf6 = tableModel.anchorRowOf(pagetablecell4);
                                                int iAnchorColOf3 = tableModel.anchorColOf(pagetablecell4);
                                                int i38 = pagetablecell4.rowspan;
                                                if (i38 == 0) {
                                                    i38 = 1;
                                                }
                                                int i39 = pagetablecell4.colspan;
                                                if (i39 == 0) {
                                                    i39 = 1;
                                                }
                                                int[] iArr3 = iArr2;
                                                boolean[] zArr2 = zArr;
                                                RichEditorListView richEditorListView3 = richEditorListView2;
                                                int i310 = 0;
                                                int i311 = -1;
                                                for (int i312 = iAnchorRowOf6; i312 < iAnchorRowOf6 + i38 && i312 < tableModel.rowCount; i312++) {
                                                    if (!zArr2[i312]) {
                                                        if (i311 < 0) {
                                                            i311 = i312;
                                                        }
                                                        i310++;
                                                    }
                                                }
                                                if (i311 >= 0) {
                                                    identityHashMap.put(pagetablecell4, new int[]{iArr3[i311], iAnchorColOf3, i310, i39});
                                                }
                                                iArr2 = iArr3;
                                                zArr = zArr2;
                                                richEditorListView2 = richEditorListView3;
                                            }
                                            richEditorListView = richEditorListView2;
                                            tableModel.rewriteBlockRows(identityHashMap, i35);
                                            tableModel.rebuildFromBlock();
                                        }
                                        z12 = true;
                                    }
                                    richTableCell3.refreshAfterModelChange();
                                    if (z12) {
                                        richTableCell3.focusCellAt(iMin3, 0);
                                    }
                                }
                            } else {
                                richEditorListView = richEditorListView2;
                            }
                            richEditorListView.exitCellSelectionMode();
                            break;
                        case 1:
                            richEditorListView2.getClass();
                            BlockRow row = richTableCell3.getRow();
                            richEditorListView2.exitCellSelectionMode();
                            if (row != null) {
                                RichEditorHistory richEditorHistory = richEditorListView2.history;
                                if (richEditorHistory != null) {
                                    AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
                                    richEditorHistory.commit();
                                }
                                ArrayList arrayList2 = richEditorListView2.rows;
                                int iIndexOf = arrayList2.indexOf(row);
                                if (iIndexOf >= 0) {
                                    arrayList2.remove(iIndexOf);
                                    richEditorListView2.adapter.update(true);
                                }
                                RichEditorHistory richEditorHistory2 = richEditorListView2.history;
                                if (richEditorHistory2 != null) {
                                    richEditorHistory2.record();
                                }
                                RichEditorListView.Delegate delegate = richEditorListView2.delegate;
                                if (delegate != null) {
                                    delegate.onContentChanged();
                                }
                            }
                            break;
                        case 2:
                            richEditorListView2.getClass();
                            if (richTableCell3.model != null) {
                                LinkedHashSet linkedHashSet3 = richTableCell3.selectedCells;
                                if (linkedHashSet3.size() >= 2) {
                                    HashSet<TL_iv.pageTableCell> hashSet8 = new HashSet(linkedHashSet3);
                                    int iMin4 = Integer.MAX_VALUE;
                                    int iMin5 = Integer.MAX_VALUE;
                                    for (TL_iv.pageTableCell pagetablecell5 : hashSet8) {
                                        iMin5 = Math.min(iMin5, richTableCell3.model.anchorRowOf(pagetablecell5));
                                        iMin4 = Math.min(iMin4, richTableCell3.model.anchorColOf(pagetablecell5));
                                    }
                                    linkedHashSet3.clear();
                                    TableModel tableModel2 = richTableCell3.model;
                                    tableModel2.getClass();
                                    if (hashSet8.size() < 2) {
                                        linkedHashSet3.addAll(hashSet8);
                                    } else {
                                        int iMax3 = -1;
                                        int iMax4 = -1;
                                        int iMin6 = Integer.MAX_VALUE;
                                        int iMin7 = Integer.MAX_VALUE;
                                        for (TL_iv.pageTableCell pagetablecell6 : hashSet8) {
                                            int iAnchorRowOf7 = tableModel2.anchorRowOf(pagetablecell6);
                                            int iAnchorColOf4 = tableModel2.anchorColOf(pagetablecell6);
                                            int i40 = pagetablecell6.rowspan;
                                            if (i40 == 0) {
                                                i40 = 1;
                                            }
                                            int i41 = pagetablecell6.colspan;
                                            if (i41 == 0) {
                                                i41 = 1;
                                            }
                                            iMin6 = Math.min(iMin6, iAnchorRowOf7);
                                            iMin7 = Math.min(iMin7, iAnchorColOf4);
                                            iMax3 = Math.max(iMax3, (iAnchorRowOf7 + i40) - 1);
                                            iMax4 = Math.max(iMax4, (iAnchorColOf4 + i41) - 1);
                                        }
                                        HashSet<TL_iv.pageTableCell> hashSet9 = new HashSet();
                                        int i42 = iMin6;
                                        while (true) {
                                            if (i42 <= iMax3) {
                                                int i43 = iMin7;
                                                while (true) {
                                                    if (i43 > iMax4) {
                                                        i42++;
                                                    } else if (i42 >= 0 && i43 >= 0 && i42 < tableModel2.rowCount && i43 < tableModel2.colCount) {
                                                        hashSet9.add(tableModel2.grid[i42][i43]);
                                                        i43++;
                                                    }
                                                }
                                            } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                StringBuilder sb = new StringBuilder();
                                                ArrayList arrayList3 = new ArrayList(hashSet9);
                                                Collections.sort(arrayList3, new TableModel$$ExternalSyntheticLambda0(tableModel2, 0));
                                                int size3 = arrayList3.size();
                                                int i44 = 0;
                                                while (i44 < size3) {
                                                    Object obj2 = arrayList3.get(i44);
                                                    i44++;
                                                    TL_iv.pageTableCell pagetablecell7 = (TL_iv.pageTableCell) obj2;
                                                    String strPlainOf = (pagetablecell7 == null || (richText = pagetablecell7.text) == null) ? "" : RichTextStyle.plainOf(richText);
                                                    if (!strPlainOf.isEmpty()) {
                                                        if (sb.length() > 0) {
                                                            sb.append("\n");
                                                        }
                                                        sb.append(strPlainOf);
                                                    }
                                                }
                                                TL_iv.pageTableCell pagetablecell8 = tableModel2.grid[iMin6][iMin7];
                                                int i45 = (iMax4 - iMin7) + 1;
                                                int i46 = (iMax3 - iMin6) + 1;
                                                if (i45 <= 1) {
                                                    i45 = 0;
                                                }
                                                pagetablecell8.colspan = i45;
                                                if (i46 <= 1) {
                                                    i46 = 0;
                                                }
                                                pagetablecell8.rowspan = i46;
                                                pagetablecell8.flags = i45 > 0 ? pagetablecell8.flags | 2 : pagetablecell8.flags & (-3);
                                                pagetablecell8.flags = i46 > 0 ? pagetablecell8.flags | 4 : pagetablecell8.flags & (-5);
                                                TableModel.applyPlainText(pagetablecell8, sb.toString());
                                                for (TL_iv.pageTableCell pagetablecell9 : hashSet9) {
                                                    if (pagetablecell9 != pagetablecell8 && (iAnchorRowOf2 = tableModel2.anchorRowOf(pagetablecell9)) >= 0) {
                                                        TL_iv.pageBlockTable pageblocktable = tableModel2.block;
                                                        if (iAnchorRowOf2 < pageblocktable.rows.size()) {
                                                            pageblocktable.rows.get(iAnchorRowOf2).cells.remove(pagetablecell9);
                                                        }
                                                    }
                                                }
                                                tableModel2.rebuildFromBlock();
                                                richTableCell3.refreshAfterModelChange();
                                                richTableCell3.grid.invalidate();
                                                richTableCell3.focusCellAt(iMin5, iMin4);
                                                richTableCell3.notifyCellSelectionChanged();
                                            }
                                        }
                                        linkedHashSet3.addAll(hashSet8);
                                    }
                                }
                            }
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 3:
                            richEditorListView2.getClass();
                            if (richTableCell3.model != null) {
                                LinkedHashSet linkedHashSet4 = richTableCell3.selectedCells;
                                if (linkedHashSet4.size() == 1) {
                                    TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                    int i47 = pagetablecell10.colspan;
                                    if (i47 == 0) {
                                        i47 = 1;
                                    }
                                    if (i47 > 1) {
                                        iAnchorRowOf3 = richTableCell3.model.anchorRowOf(pagetablecell10);
                                        iAnchorColOf2 = richTableCell3.model.anchorColOf(pagetablecell10);
                                        linkedHashSet4.clear();
                                        TableModel tableModel7 = richTableCell3.model;
                                        iAnchorRowOf4 = tableModel7.anchorRowOf(pagetablecell10);
                                        int iAnchorColOf8 = tableModel7.anchorColOf(pagetablecell10);
                                        if (iAnchorRowOf4 >= 0 || iAnchorColOf8 < 0) {
                                            z13 = false;
                                        } else {
                                            int i48 = pagetablecell10.rowspan;
                                            if (i48 == 0) {
                                                i48 = 1;
                                            }
                                            int i49 = pagetablecell10.colspan;
                                            if (i49 == 0) {
                                                i49 = 1;
                                            }
                                            if (i48 > 1 || i49 > 1) {
                                                pagetablecell10.rowspan = 0;
                                                pagetablecell10.colspan = 0;
                                                pagetablecell10.flags &= -7;
                                                int i50 = iAnchorRowOf4;
                                                while (i50 < iAnchorRowOf4 + i48 && i50 < tableModel7.rowCount) {
                                                    TL_iv.pageTableRow pagetablerow = tableModel7.block.rows.get(i50);
                                                    ArrayList arrayList4 = new ArrayList();
                                                    ArrayList<TL_iv.pageTableCell> arrayList5 = pagetablerow.cells;
                                                    int i51 = i48;
                                                    int size4 = arrayList5.size();
                                                    int i52 = i49;
                                                    int i53 = 0;
                                                    while (i53 < size4) {
                                                        TL_iv.pageTableCell pagetablecell11 = arrayList5.get(i53);
                                                        i53++;
                                                        ArrayList<TL_iv.pageTableCell> arrayList6 = arrayList5;
                                                        TL_iv.pageTableCell pagetablecell12 = pagetablecell11;
                                                        arrayList4.add(new Object[]{pagetablecell12, Integer.valueOf(tableModel7.anchorColOf(pagetablecell12))});
                                                        arrayList5 = arrayList6;
                                                        tableModel7 = tableModel7;
                                                    }
                                                    TableModel tableModel4 = tableModel7;
                                                    int i54 = iAnchorColOf8;
                                                    while (i54 < iAnchorColOf8 + i52) {
                                                        if (i50 != iAnchorRowOf4 || i54 != iAnchorColOf8) {
                                                            TL_iv.pageTableCell pagetablecell13 = new TL_iv.pageTableCell();
                                                            pagetablecell13.header = pagetablecell10.header;
                                                            pagetablecell13.align_center = pagetablecell10.align_center;
                                                            pagetablecell13.align_right = pagetablecell10.align_right;
                                                            pagetablecell13.valign_middle = pagetablecell10.valign_middle;
                                                            pagetablecell13.valign_bottom = pagetablecell10.valign_bottom;
                                                            TableModel.applyPlainText(pagetablecell13, str);
                                                            arrayList4.add(new Object[]{pagetablecell13, Integer.valueOf(i54)});
                                                        }
                                                        i54++;
                                                        str = str;
                                                    }
                                                    String str2 = str;
                                                    Collections.sort(arrayList4, Comparator$CC.comparingInt(new TableModel$$ExternalSyntheticLambda1(0)));
                                                    pagetablerow.cells.clear();
                                                    int size5 = arrayList4.size();
                                                    int i55 = 0;
                                                    while (i55 < size5) {
                                                        Object obj3 = arrayList4.get(i55);
                                                        i55++;
                                                        pagetablerow.cells.add((TL_iv.pageTableCell) ((Object[]) obj3)[0]);
                                                    }
                                                    i50++;
                                                    i48 = i51;
                                                    i49 = i52;
                                                    str = str2;
                                                    tableModel7 = tableModel4;
                                                }
                                                tableModel7.rebuildFromBlock();
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                        }
                                        if (z13) {
                                            richTableCell3.refreshAfterModelChange();
                                            richTableCell3.grid.invalidate();
                                            richTableCell3.focusCellAt(iAnchorRowOf3, iAnchorColOf2);
                                            richTableCell3.notifyCellSelectionChanged();
                                        } else {
                                            linkedHashSet4.add(pagetablecell10);
                                        }
                                    } else {
                                        int i56 = pagetablecell10.rowspan;
                                        if (i56 == 0) {
                                            i56 = 1;
                                        }
                                        if (i56 > 1) {
                                            iAnchorRowOf3 = richTableCell3.model.anchorRowOf(pagetablecell10);
                                            iAnchorColOf2 = richTableCell3.model.anchorColOf(pagetablecell10);
                                            linkedHashSet4.clear();
                                            TableModel tableModel8 = richTableCell3.model;
                                            iAnchorRowOf4 = tableModel8.anchorRowOf(pagetablecell10);
                                            int iAnchorColOf9 = tableModel8.anchorColOf(pagetablecell10);
                                            if (iAnchorRowOf4 >= 0) {
                                                z13 = false;
                                            } else {
                                                z13 = false;
                                            }
                                            if (z13) {
                                                richTableCell3.refreshAfterModelChange();
                                                richTableCell3.grid.invalidate();
                                                richTableCell3.focusCellAt(iAnchorRowOf3, iAnchorColOf2);
                                                richTableCell3.notifyCellSelectionChanged();
                                            } else {
                                                linkedHashSet4.add(pagetablecell10);
                                            }
                                        }
                                    }
                                }
                            }
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 4:
                            richEditorListView2.getClass();
                            richTableCell3.applyInsertColumnFromSelection(true);
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 5:
                            richEditorListView2.getClass();
                            richTableCell3.applyInsertColumnFromSelection(false);
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 6:
                            richEditorListView2.getClass();
                            richTableCell3.applyInsertRowFromSelection(true);
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 7:
                            richEditorListView2.getClass();
                            richTableCell3.applyInsertRowFromSelection(false);
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        default:
                            richEditorListView2.getClass();
                            if (richTableCell3.model != null) {
                                LinkedHashSet linkedHashSet5 = richTableCell3.selectedCells;
                                if (!linkedHashSet5.isEmpty()) {
                                    HashSet hashSet10 = new HashSet();
                                    Iterator it10 = linkedHashSet5.iterator();
                                    while (it10.hasNext()) {
                                        int iAnchorColOf10 = richTableCell3.model.anchorColOf((TL_iv.pageTableCell) it10.next());
                                        hashSet10.add(Integer.valueOf(iAnchorColOf10));
                                        iMin3 = Math.min(iMin3, iAnchorColOf10);
                                    }
                                    linkedHashSet5.clear();
                                    TableModel tableModel9 = richTableCell3.model;
                                    tableModel9.getClass();
                                    if (hashSet10.isEmpty()) {
                                        i34 = 0;
                                    } else {
                                        boolean[] zArr3 = new boolean[tableModel9.colCount];
                                        Iterator it11 = hashSet10.iterator();
                                        while (it11.hasNext()) {
                                            int iIntValue4 = ((Integer) it11.next()).intValue();
                                            if (iIntValue4 >= 0 && iIntValue4 < tableModel9.colCount) {
                                                zArr3[iIntValue4] = true;
                                            }
                                        }
                                        int[] iArr4 = new int[tableModel9.colCount];
                                        int i57 = 0;
                                        for (int i58 = 0; i58 < tableModel9.colCount; i58++) {
                                            iArr4[i58] = i57;
                                            if (!zArr3[i58]) {
                                                i57++;
                                            }
                                        }
                                        if (i57 == 0) {
                                            tableModel9.block.rows.clear();
                                            tableModel9.rebuildFromBlock();
                                        } else {
                                            IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                            ArrayList arrayList7 = tableModel9.anchorsRowMajor;
                                            int size6 = arrayList7.size();
                                            int i59 = 0;
                                            while (i59 < size6) {
                                                Object obj4 = arrayList7.get(i59);
                                                i59 += i34;
                                                TL_iv.pageTableCell pagetablecell14 = (TL_iv.pageTableCell) obj4;
                                                int iAnchorRowOf8 = tableModel9.anchorRowOf(pagetablecell14);
                                                int iAnchorColOf11 = tableModel9.anchorColOf(pagetablecell14);
                                                int i60 = pagetablecell14.rowspan;
                                                if (i60 == 0) {
                                                    i60 = 1;
                                                }
                                                int i61 = pagetablecell14.colspan;
                                                if (i61 == 0) {
                                                    i61 = 1;
                                                }
                                                int[] iArr5 = iArr4;
                                                int i62 = 0;
                                                int i63 = -1;
                                                for (int i64 = iAnchorColOf11; i64 < iAnchorColOf11 + i61 && i64 < tableModel9.colCount; i64++) {
                                                    if (!zArr3[i64]) {
                                                        if (i63 < 0) {
                                                            i63 = i64;
                                                        }
                                                        i62++;
                                                    }
                                                }
                                                if (i63 >= 0) {
                                                    identityHashMap2.put(pagetablecell14, new int[]{iAnchorRowOf8, iArr5[i63], i60, i62});
                                                }
                                                iArr4 = iArr5;
                                                i34 = 1;
                                            }
                                            tableModel9.rewriteBlockRows(identityHashMap2, tableModel9.rowCount);
                                            tableModel9.rebuildFromBlock();
                                            i34 = 1;
                                        }
                                    }
                                    richTableCell3.refreshAfterModelChange();
                                    if (i34 != 0) {
                                        richTableCell3.focusCellAt(0, iMin3);
                                    }
                                }
                            }
                            richEditorListView2.exitCellSelectionMode();
                            break;
                    }
                }
            }, false);
        }
        if (z11) {
            final int i34 = 6;
            itemOptionsMakeMenu.add(R.drawable.iv_table_insert_top, LocaleController.getString(R.string.ArticleInsertAbove), new Runnable(this) {
                public final RichEditorListView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    RichEditorListView richEditorListView;
                    boolean z12;
                    int iAnchorRowOf2;
                    TL_iv.RichText richText;
                    int iAnchorRowOf3;
                    int iAnchorColOf2;
                    int iAnchorRowOf4;
                    boolean z13;
                    String str = "";
                    int iMin3 = Integer.MAX_VALUE;
                    RichTableCell richTableCell3 = richTableCell2;
                    RichEditorListView richEditorListView2 = this.f$0;
                    int i35 = 1;
                    switch (i34) {
                        case 0:
                            richEditorListView2.getClass();
                            if (richTableCell3.model != null) {
                                LinkedHashSet linkedHashSet2 = richTableCell3.selectedCells;
                                if (linkedHashSet2.isEmpty()) {
                                    richEditorListView = richEditorListView2;
                                } else {
                                    HashSet hashSet7 = new HashSet();
                                    Iterator it8 = linkedHashSet2.iterator();
                                    while (it8.hasNext()) {
                                        int iAnchorRowOf5 = richTableCell3.model.anchorRowOf((TL_iv.pageTableCell) it8.next());
                                        hashSet7.add(Integer.valueOf(iAnchorRowOf5));
                                        iMin3 = Math.min(iMin3, iAnchorRowOf5);
                                    }
                                    linkedHashSet2.clear();
                                    TableModel tableModel = richTableCell3.model;
                                    tableModel.getClass();
                                    if (hashSet7.isEmpty()) {
                                        richEditorListView = richEditorListView2;
                                        z12 = false;
                                    } else {
                                        boolean[] zArr = new boolean[tableModel.rowCount];
                                        Iterator it9 = hashSet7.iterator();
                                        while (it9.hasNext()) {
                                            int iIntValue3 = ((Integer) it9.next()).intValue();
                                            if (iIntValue3 >= 0 && iIntValue3 < tableModel.rowCount) {
                                                zArr[iIntValue3] = true;
                                            }
                                        }
                                        int[] iArr2 = new int[tableModel.rowCount];
                                        int i36 = 0;
                                        for (int i37 = 0; i37 < tableModel.rowCount; i37++) {
                                            iArr2[i37] = i36;
                                            if (!zArr[i37]) {
                                                i36++;
                                            }
                                        }
                                        if (i36 == 0) {
                                            tableModel.block.rows.clear();
                                            tableModel.rebuildFromBlock();
                                            richEditorListView = richEditorListView2;
                                        } else {
                                            IdentityHashMap identityHashMap = new IdentityHashMap();
                                            ArrayList arrayList = tableModel.anchorsRowMajor;
                                            int size2 = arrayList.size();
                                            int i38 = 0;
                                            while (i38 < size2) {
                                                Object obj = arrayList.get(i38);
                                                i38++;
                                                TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                int iAnchorRowOf6 = tableModel.anchorRowOf(pagetablecell4);
                                                int iAnchorColOf3 = tableModel.anchorColOf(pagetablecell4);
                                                int i39 = pagetablecell4.rowspan;
                                                if (i39 == 0) {
                                                    i39 = 1;
                                                }
                                                int i310 = pagetablecell4.colspan;
                                                if (i310 == 0) {
                                                    i310 = 1;
                                                }
                                                int[] iArr3 = iArr2;
                                                boolean[] zArr2 = zArr;
                                                RichEditorListView richEditorListView3 = richEditorListView2;
                                                int i311 = 0;
                                                int i312 = -1;
                                                for (int i313 = iAnchorRowOf6; i313 < iAnchorRowOf6 + i39 && i313 < tableModel.rowCount; i313++) {
                                                    if (!zArr2[i313]) {
                                                        if (i312 < 0) {
                                                            i312 = i313;
                                                        }
                                                        i311++;
                                                    }
                                                }
                                                if (i312 >= 0) {
                                                    identityHashMap.put(pagetablecell4, new int[]{iArr3[i312], iAnchorColOf3, i311, i310});
                                                }
                                                iArr2 = iArr3;
                                                zArr = zArr2;
                                                richEditorListView2 = richEditorListView3;
                                            }
                                            richEditorListView = richEditorListView2;
                                            tableModel.rewriteBlockRows(identityHashMap, i36);
                                            tableModel.rebuildFromBlock();
                                        }
                                        z12 = true;
                                    }
                                    richTableCell3.refreshAfterModelChange();
                                    if (z12) {
                                        richTableCell3.focusCellAt(iMin3, 0);
                                    }
                                }
                            } else {
                                richEditorListView = richEditorListView2;
                            }
                            richEditorListView.exitCellSelectionMode();
                            break;
                        case 1:
                            richEditorListView2.getClass();
                            BlockRow row = richTableCell3.getRow();
                            richEditorListView2.exitCellSelectionMode();
                            if (row != null) {
                                RichEditorHistory richEditorHistory = richEditorListView2.history;
                                if (richEditorHistory != null) {
                                    AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
                                    richEditorHistory.commit();
                                }
                                ArrayList arrayList2 = richEditorListView2.rows;
                                int iIndexOf = arrayList2.indexOf(row);
                                if (iIndexOf >= 0) {
                                    arrayList2.remove(iIndexOf);
                                    richEditorListView2.adapter.update(true);
                                }
                                RichEditorHistory richEditorHistory2 = richEditorListView2.history;
                                if (richEditorHistory2 != null) {
                                    richEditorHistory2.record();
                                }
                                RichEditorListView.Delegate delegate = richEditorListView2.delegate;
                                if (delegate != null) {
                                    delegate.onContentChanged();
                                }
                            }
                            break;
                        case 2:
                            richEditorListView2.getClass();
                            if (richTableCell3.model != null) {
                                LinkedHashSet linkedHashSet3 = richTableCell3.selectedCells;
                                if (linkedHashSet3.size() >= 2) {
                                    HashSet<TL_iv.pageTableCell> hashSet8 = new HashSet(linkedHashSet3);
                                    int iMin4 = Integer.MAX_VALUE;
                                    int iMin5 = Integer.MAX_VALUE;
                                    for (TL_iv.pageTableCell pagetablecell5 : hashSet8) {
                                        iMin5 = Math.min(iMin5, richTableCell3.model.anchorRowOf(pagetablecell5));
                                        iMin4 = Math.min(iMin4, richTableCell3.model.anchorColOf(pagetablecell5));
                                    }
                                    linkedHashSet3.clear();
                                    TableModel tableModel2 = richTableCell3.model;
                                    tableModel2.getClass();
                                    if (hashSet8.size() < 2) {
                                        linkedHashSet3.addAll(hashSet8);
                                    } else {
                                        int iMax3 = -1;
                                        int iMax4 = -1;
                                        int iMin6 = Integer.MAX_VALUE;
                                        int iMin7 = Integer.MAX_VALUE;
                                        for (TL_iv.pageTableCell pagetablecell6 : hashSet8) {
                                            int iAnchorRowOf7 = tableModel2.anchorRowOf(pagetablecell6);
                                            int iAnchorColOf4 = tableModel2.anchorColOf(pagetablecell6);
                                            int i40 = pagetablecell6.rowspan;
                                            if (i40 == 0) {
                                                i40 = 1;
                                            }
                                            int i41 = pagetablecell6.colspan;
                                            if (i41 == 0) {
                                                i41 = 1;
                                            }
                                            iMin6 = Math.min(iMin6, iAnchorRowOf7);
                                            iMin7 = Math.min(iMin7, iAnchorColOf4);
                                            iMax3 = Math.max(iMax3, (iAnchorRowOf7 + i40) - 1);
                                            iMax4 = Math.max(iMax4, (iAnchorColOf4 + i41) - 1);
                                        }
                                        HashSet<TL_iv.pageTableCell> hashSet9 = new HashSet();
                                        int i42 = iMin6;
                                        while (true) {
                                            if (i42 <= iMax3) {
                                                int i43 = iMin7;
                                                while (true) {
                                                    if (i43 > iMax4) {
                                                        i42++;
                                                    } else if (i42 >= 0 && i43 >= 0 && i42 < tableModel2.rowCount && i43 < tableModel2.colCount) {
                                                        hashSet9.add(tableModel2.grid[i42][i43]);
                                                        i43++;
                                                    }
                                                }
                                            } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                StringBuilder sb = new StringBuilder();
                                                ArrayList arrayList3 = new ArrayList(hashSet9);
                                                Collections.sort(arrayList3, new TableModel$$ExternalSyntheticLambda0(tableModel2, 0));
                                                int size3 = arrayList3.size();
                                                int i44 = 0;
                                                while (i44 < size3) {
                                                    Object obj2 = arrayList3.get(i44);
                                                    i44++;
                                                    TL_iv.pageTableCell pagetablecell7 = (TL_iv.pageTableCell) obj2;
                                                    String strPlainOf = (pagetablecell7 == null || (richText = pagetablecell7.text) == null) ? "" : RichTextStyle.plainOf(richText);
                                                    if (!strPlainOf.isEmpty()) {
                                                        if (sb.length() > 0) {
                                                            sb.append("\n");
                                                        }
                                                        sb.append(strPlainOf);
                                                    }
                                                }
                                                TL_iv.pageTableCell pagetablecell8 = tableModel2.grid[iMin6][iMin7];
                                                int i45 = (iMax4 - iMin7) + 1;
                                                int i46 = (iMax3 - iMin6) + 1;
                                                if (i45 <= 1) {
                                                    i45 = 0;
                                                }
                                                pagetablecell8.colspan = i45;
                                                if (i46 <= 1) {
                                                    i46 = 0;
                                                }
                                                pagetablecell8.rowspan = i46;
                                                pagetablecell8.flags = i45 > 0 ? pagetablecell8.flags | 2 : pagetablecell8.flags & (-3);
                                                pagetablecell8.flags = i46 > 0 ? pagetablecell8.flags | 4 : pagetablecell8.flags & (-5);
                                                TableModel.applyPlainText(pagetablecell8, sb.toString());
                                                for (TL_iv.pageTableCell pagetablecell9 : hashSet9) {
                                                    if (pagetablecell9 != pagetablecell8 && (iAnchorRowOf2 = tableModel2.anchorRowOf(pagetablecell9)) >= 0) {
                                                        TL_iv.pageBlockTable pageblocktable = tableModel2.block;
                                                        if (iAnchorRowOf2 < pageblocktable.rows.size()) {
                                                            pageblocktable.rows.get(iAnchorRowOf2).cells.remove(pagetablecell9);
                                                        }
                                                    }
                                                }
                                                tableModel2.rebuildFromBlock();
                                                richTableCell3.refreshAfterModelChange();
                                                richTableCell3.grid.invalidate();
                                                richTableCell3.focusCellAt(iMin5, iMin4);
                                                richTableCell3.notifyCellSelectionChanged();
                                            }
                                        }
                                        linkedHashSet3.addAll(hashSet8);
                                    }
                                }
                            }
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 3:
                            richEditorListView2.getClass();
                            if (richTableCell3.model != null) {
                                LinkedHashSet linkedHashSet4 = richTableCell3.selectedCells;
                                if (linkedHashSet4.size() == 1) {
                                    TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                    int i47 = pagetablecell10.colspan;
                                    if (i47 == 0) {
                                        i47 = 1;
                                    }
                                    if (i47 > 1) {
                                        iAnchorRowOf3 = richTableCell3.model.anchorRowOf(pagetablecell10);
                                        iAnchorColOf2 = richTableCell3.model.anchorColOf(pagetablecell10);
                                        linkedHashSet4.clear();
                                        TableModel tableModel8 = richTableCell3.model;
                                        iAnchorRowOf4 = tableModel8.anchorRowOf(pagetablecell10);
                                        int iAnchorColOf9 = tableModel8.anchorColOf(pagetablecell10);
                                        if (iAnchorRowOf4 >= 0 || iAnchorColOf9 < 0) {
                                            z13 = false;
                                        } else {
                                            int i48 = pagetablecell10.rowspan;
                                            if (i48 == 0) {
                                                i48 = 1;
                                            }
                                            int i49 = pagetablecell10.colspan;
                                            if (i49 == 0) {
                                                i49 = 1;
                                            }
                                            if (i48 > 1 || i49 > 1) {
                                                pagetablecell10.rowspan = 0;
                                                pagetablecell10.colspan = 0;
                                                pagetablecell10.flags &= -7;
                                                int i50 = iAnchorRowOf4;
                                                while (i50 < iAnchorRowOf4 + i48 && i50 < tableModel8.rowCount) {
                                                    TL_iv.pageTableRow pagetablerow = tableModel8.block.rows.get(i50);
                                                    ArrayList arrayList4 = new ArrayList();
                                                    ArrayList<TL_iv.pageTableCell> arrayList5 = pagetablerow.cells;
                                                    int i51 = i48;
                                                    int size4 = arrayList5.size();
                                                    int i52 = i49;
                                                    int i53 = 0;
                                                    while (i53 < size4) {
                                                        TL_iv.pageTableCell pagetablecell11 = arrayList5.get(i53);
                                                        i53++;
                                                        ArrayList<TL_iv.pageTableCell> arrayList6 = arrayList5;
                                                        TL_iv.pageTableCell pagetablecell12 = pagetablecell11;
                                                        arrayList4.add(new Object[]{pagetablecell12, Integer.valueOf(tableModel8.anchorColOf(pagetablecell12))});
                                                        arrayList5 = arrayList6;
                                                        tableModel8 = tableModel8;
                                                    }
                                                    TableModel tableModel4 = tableModel8;
                                                    int i54 = iAnchorColOf9;
                                                    while (i54 < iAnchorColOf9 + i52) {
                                                        if (i50 != iAnchorRowOf4 || i54 != iAnchorColOf9) {
                                                            TL_iv.pageTableCell pagetablecell13 = new TL_iv.pageTableCell();
                                                            pagetablecell13.header = pagetablecell10.header;
                                                            pagetablecell13.align_center = pagetablecell10.align_center;
                                                            pagetablecell13.align_right = pagetablecell10.align_right;
                                                            pagetablecell13.valign_middle = pagetablecell10.valign_middle;
                                                            pagetablecell13.valign_bottom = pagetablecell10.valign_bottom;
                                                            TableModel.applyPlainText(pagetablecell13, str);
                                                            arrayList4.add(new Object[]{pagetablecell13, Integer.valueOf(i54)});
                                                        }
                                                        i54++;
                                                        str = str;
                                                    }
                                                    String str2 = str;
                                                    Collections.sort(arrayList4, Comparator$CC.comparingInt(new TableModel$$ExternalSyntheticLambda1(0)));
                                                    pagetablerow.cells.clear();
                                                    int size5 = arrayList4.size();
                                                    int i55 = 0;
                                                    while (i55 < size5) {
                                                        Object obj3 = arrayList4.get(i55);
                                                        i55++;
                                                        pagetablerow.cells.add((TL_iv.pageTableCell) ((Object[]) obj3)[0]);
                                                    }
                                                    i50++;
                                                    i48 = i51;
                                                    i49 = i52;
                                                    str = str2;
                                                    tableModel8 = tableModel4;
                                                }
                                                tableModel8.rebuildFromBlock();
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                        }
                                        if (z13) {
                                            richTableCell3.refreshAfterModelChange();
                                            richTableCell3.grid.invalidate();
                                            richTableCell3.focusCellAt(iAnchorRowOf3, iAnchorColOf2);
                                            richTableCell3.notifyCellSelectionChanged();
                                        } else {
                                            linkedHashSet4.add(pagetablecell10);
                                        }
                                    } else {
                                        int i56 = pagetablecell10.rowspan;
                                        if (i56 == 0) {
                                            i56 = 1;
                                        }
                                        if (i56 > 1) {
                                            iAnchorRowOf3 = richTableCell3.model.anchorRowOf(pagetablecell10);
                                            iAnchorColOf2 = richTableCell3.model.anchorColOf(pagetablecell10);
                                            linkedHashSet4.clear();
                                            TableModel tableModel9 = richTableCell3.model;
                                            iAnchorRowOf4 = tableModel9.anchorRowOf(pagetablecell10);
                                            int iAnchorColOf10 = tableModel9.anchorColOf(pagetablecell10);
                                            if (iAnchorRowOf4 >= 0) {
                                                z13 = false;
                                            } else {
                                                z13 = false;
                                            }
                                            if (z13) {
                                                richTableCell3.refreshAfterModelChange();
                                                richTableCell3.grid.invalidate();
                                                richTableCell3.focusCellAt(iAnchorRowOf3, iAnchorColOf2);
                                                richTableCell3.notifyCellSelectionChanged();
                                            } else {
                                                linkedHashSet4.add(pagetablecell10);
                                            }
                                        }
                                    }
                                }
                            }
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 4:
                            richEditorListView2.getClass();
                            richTableCell3.applyInsertColumnFromSelection(true);
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 5:
                            richEditorListView2.getClass();
                            richTableCell3.applyInsertColumnFromSelection(false);
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 6:
                            richEditorListView2.getClass();
                            richTableCell3.applyInsertRowFromSelection(true);
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 7:
                            richEditorListView2.getClass();
                            richTableCell3.applyInsertRowFromSelection(false);
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        default:
                            richEditorListView2.getClass();
                            if (richTableCell3.model != null) {
                                LinkedHashSet linkedHashSet5 = richTableCell3.selectedCells;
                                if (!linkedHashSet5.isEmpty()) {
                                    HashSet hashSet10 = new HashSet();
                                    Iterator it10 = linkedHashSet5.iterator();
                                    while (it10.hasNext()) {
                                        int iAnchorColOf11 = richTableCell3.model.anchorColOf((TL_iv.pageTableCell) it10.next());
                                        hashSet10.add(Integer.valueOf(iAnchorColOf11));
                                        iMin3 = Math.min(iMin3, iAnchorColOf11);
                                    }
                                    linkedHashSet5.clear();
                                    TableModel tableModel10 = richTableCell3.model;
                                    tableModel10.getClass();
                                    if (hashSet10.isEmpty()) {
                                        i35 = 0;
                                    } else {
                                        boolean[] zArr3 = new boolean[tableModel10.colCount];
                                        Iterator it11 = hashSet10.iterator();
                                        while (it11.hasNext()) {
                                            int iIntValue4 = ((Integer) it11.next()).intValue();
                                            if (iIntValue4 >= 0 && iIntValue4 < tableModel10.colCount) {
                                                zArr3[iIntValue4] = true;
                                            }
                                        }
                                        int[] iArr4 = new int[tableModel10.colCount];
                                        int i57 = 0;
                                        for (int i58 = 0; i58 < tableModel10.colCount; i58++) {
                                            iArr4[i58] = i57;
                                            if (!zArr3[i58]) {
                                                i57++;
                                            }
                                        }
                                        if (i57 == 0) {
                                            tableModel10.block.rows.clear();
                                            tableModel10.rebuildFromBlock();
                                        } else {
                                            IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                            ArrayList arrayList7 = tableModel10.anchorsRowMajor;
                                            int size6 = arrayList7.size();
                                            int i59 = 0;
                                            while (i59 < size6) {
                                                Object obj4 = arrayList7.get(i59);
                                                i59 += i35;
                                                TL_iv.pageTableCell pagetablecell14 = (TL_iv.pageTableCell) obj4;
                                                int iAnchorRowOf8 = tableModel10.anchorRowOf(pagetablecell14);
                                                int iAnchorColOf12 = tableModel10.anchorColOf(pagetablecell14);
                                                int i60 = pagetablecell14.rowspan;
                                                if (i60 == 0) {
                                                    i60 = 1;
                                                }
                                                int i61 = pagetablecell14.colspan;
                                                if (i61 == 0) {
                                                    i61 = 1;
                                                }
                                                int[] iArr5 = iArr4;
                                                int i62 = 0;
                                                int i63 = -1;
                                                for (int i64 = iAnchorColOf12; i64 < iAnchorColOf12 + i61 && i64 < tableModel10.colCount; i64++) {
                                                    if (!zArr3[i64]) {
                                                        if (i63 < 0) {
                                                            i63 = i64;
                                                        }
                                                        i62++;
                                                    }
                                                }
                                                if (i63 >= 0) {
                                                    identityHashMap2.put(pagetablecell14, new int[]{iAnchorRowOf8, iArr5[i63], i60, i62});
                                                }
                                                iArr4 = iArr5;
                                                i35 = 1;
                                            }
                                            tableModel10.rewriteBlockRows(identityHashMap2, tableModel10.rowCount);
                                            tableModel10.rebuildFromBlock();
                                            i35 = 1;
                                        }
                                    }
                                    richTableCell3.refreshAfterModelChange();
                                    if (i35 != 0) {
                                        richTableCell3.focusCellAt(0, iMin3);
                                    }
                                }
                            }
                            richEditorListView2.exitCellSelectionMode();
                            break;
                    }
                }
            }, false);
            final int i35 = 7;
            itemOptionsMakeMenu.add(R.drawable.iv_table_insert_bottom, LocaleController.getString(R.string.ArticleInsertBelow), new Runnable(this) {
                public final RichEditorListView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    RichEditorListView richEditorListView;
                    boolean z12;
                    int iAnchorRowOf2;
                    TL_iv.RichText richText;
                    int iAnchorRowOf3;
                    int iAnchorColOf2;
                    int iAnchorRowOf4;
                    boolean z13;
                    String str = "";
                    int iMin3 = Integer.MAX_VALUE;
                    RichTableCell richTableCell3 = richTableCell2;
                    RichEditorListView richEditorListView2 = this.f$0;
                    int i36 = 1;
                    switch (i35) {
                        case 0:
                            richEditorListView2.getClass();
                            if (richTableCell3.model != null) {
                                LinkedHashSet linkedHashSet2 = richTableCell3.selectedCells;
                                if (linkedHashSet2.isEmpty()) {
                                    richEditorListView = richEditorListView2;
                                } else {
                                    HashSet hashSet7 = new HashSet();
                                    Iterator it8 = linkedHashSet2.iterator();
                                    while (it8.hasNext()) {
                                        int iAnchorRowOf5 = richTableCell3.model.anchorRowOf((TL_iv.pageTableCell) it8.next());
                                        hashSet7.add(Integer.valueOf(iAnchorRowOf5));
                                        iMin3 = Math.min(iMin3, iAnchorRowOf5);
                                    }
                                    linkedHashSet2.clear();
                                    TableModel tableModel = richTableCell3.model;
                                    tableModel.getClass();
                                    if (hashSet7.isEmpty()) {
                                        richEditorListView = richEditorListView2;
                                        z12 = false;
                                    } else {
                                        boolean[] zArr = new boolean[tableModel.rowCount];
                                        Iterator it9 = hashSet7.iterator();
                                        while (it9.hasNext()) {
                                            int iIntValue3 = ((Integer) it9.next()).intValue();
                                            if (iIntValue3 >= 0 && iIntValue3 < tableModel.rowCount) {
                                                zArr[iIntValue3] = true;
                                            }
                                        }
                                        int[] iArr2 = new int[tableModel.rowCount];
                                        int i37 = 0;
                                        for (int i38 = 0; i38 < tableModel.rowCount; i38++) {
                                            iArr2[i38] = i37;
                                            if (!zArr[i38]) {
                                                i37++;
                                            }
                                        }
                                        if (i37 == 0) {
                                            tableModel.block.rows.clear();
                                            tableModel.rebuildFromBlock();
                                            richEditorListView = richEditorListView2;
                                        } else {
                                            IdentityHashMap identityHashMap = new IdentityHashMap();
                                            ArrayList arrayList = tableModel.anchorsRowMajor;
                                            int size2 = arrayList.size();
                                            int i39 = 0;
                                            while (i39 < size2) {
                                                Object obj = arrayList.get(i39);
                                                i39++;
                                                TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                int iAnchorRowOf6 = tableModel.anchorRowOf(pagetablecell4);
                                                int iAnchorColOf3 = tableModel.anchorColOf(pagetablecell4);
                                                int i310 = pagetablecell4.rowspan;
                                                if (i310 == 0) {
                                                    i310 = 1;
                                                }
                                                int i311 = pagetablecell4.colspan;
                                                if (i311 == 0) {
                                                    i311 = 1;
                                                }
                                                int[] iArr3 = iArr2;
                                                boolean[] zArr2 = zArr;
                                                RichEditorListView richEditorListView3 = richEditorListView2;
                                                int i312 = 0;
                                                int i313 = -1;
                                                for (int i314 = iAnchorRowOf6; i314 < iAnchorRowOf6 + i310 && i314 < tableModel.rowCount; i314++) {
                                                    if (!zArr2[i314]) {
                                                        if (i313 < 0) {
                                                            i313 = i314;
                                                        }
                                                        i312++;
                                                    }
                                                }
                                                if (i313 >= 0) {
                                                    identityHashMap.put(pagetablecell4, new int[]{iArr3[i313], iAnchorColOf3, i312, i311});
                                                }
                                                iArr2 = iArr3;
                                                zArr = zArr2;
                                                richEditorListView2 = richEditorListView3;
                                            }
                                            richEditorListView = richEditorListView2;
                                            tableModel.rewriteBlockRows(identityHashMap, i37);
                                            tableModel.rebuildFromBlock();
                                        }
                                        z12 = true;
                                    }
                                    richTableCell3.refreshAfterModelChange();
                                    if (z12) {
                                        richTableCell3.focusCellAt(iMin3, 0);
                                    }
                                }
                            } else {
                                richEditorListView = richEditorListView2;
                            }
                            richEditorListView.exitCellSelectionMode();
                            break;
                        case 1:
                            richEditorListView2.getClass();
                            BlockRow row = richTableCell3.getRow();
                            richEditorListView2.exitCellSelectionMode();
                            if (row != null) {
                                RichEditorHistory richEditorHistory = richEditorListView2.history;
                                if (richEditorHistory != null) {
                                    AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
                                    richEditorHistory.commit();
                                }
                                ArrayList arrayList2 = richEditorListView2.rows;
                                int iIndexOf = arrayList2.indexOf(row);
                                if (iIndexOf >= 0) {
                                    arrayList2.remove(iIndexOf);
                                    richEditorListView2.adapter.update(true);
                                }
                                RichEditorHistory richEditorHistory2 = richEditorListView2.history;
                                if (richEditorHistory2 != null) {
                                    richEditorHistory2.record();
                                }
                                RichEditorListView.Delegate delegate = richEditorListView2.delegate;
                                if (delegate != null) {
                                    delegate.onContentChanged();
                                }
                            }
                            break;
                        case 2:
                            richEditorListView2.getClass();
                            if (richTableCell3.model != null) {
                                LinkedHashSet linkedHashSet3 = richTableCell3.selectedCells;
                                if (linkedHashSet3.size() >= 2) {
                                    HashSet<TL_iv.pageTableCell> hashSet8 = new HashSet(linkedHashSet3);
                                    int iMin4 = Integer.MAX_VALUE;
                                    int iMin5 = Integer.MAX_VALUE;
                                    for (TL_iv.pageTableCell pagetablecell5 : hashSet8) {
                                        iMin5 = Math.min(iMin5, richTableCell3.model.anchorRowOf(pagetablecell5));
                                        iMin4 = Math.min(iMin4, richTableCell3.model.anchorColOf(pagetablecell5));
                                    }
                                    linkedHashSet3.clear();
                                    TableModel tableModel2 = richTableCell3.model;
                                    tableModel2.getClass();
                                    if (hashSet8.size() < 2) {
                                        linkedHashSet3.addAll(hashSet8);
                                    } else {
                                        int iMax3 = -1;
                                        int iMax4 = -1;
                                        int iMin6 = Integer.MAX_VALUE;
                                        int iMin7 = Integer.MAX_VALUE;
                                        for (TL_iv.pageTableCell pagetablecell6 : hashSet8) {
                                            int iAnchorRowOf7 = tableModel2.anchorRowOf(pagetablecell6);
                                            int iAnchorColOf4 = tableModel2.anchorColOf(pagetablecell6);
                                            int i40 = pagetablecell6.rowspan;
                                            if (i40 == 0) {
                                                i40 = 1;
                                            }
                                            int i41 = pagetablecell6.colspan;
                                            if (i41 == 0) {
                                                i41 = 1;
                                            }
                                            iMin6 = Math.min(iMin6, iAnchorRowOf7);
                                            iMin7 = Math.min(iMin7, iAnchorColOf4);
                                            iMax3 = Math.max(iMax3, (iAnchorRowOf7 + i40) - 1);
                                            iMax4 = Math.max(iMax4, (iAnchorColOf4 + i41) - 1);
                                        }
                                        HashSet<TL_iv.pageTableCell> hashSet9 = new HashSet();
                                        int i42 = iMin6;
                                        while (true) {
                                            if (i42 <= iMax3) {
                                                int i43 = iMin7;
                                                while (true) {
                                                    if (i43 > iMax4) {
                                                        i42++;
                                                    } else if (i42 >= 0 && i43 >= 0 && i42 < tableModel2.rowCount && i43 < tableModel2.colCount) {
                                                        hashSet9.add(tableModel2.grid[i42][i43]);
                                                        i43++;
                                                    }
                                                }
                                            } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                StringBuilder sb = new StringBuilder();
                                                ArrayList arrayList3 = new ArrayList(hashSet9);
                                                Collections.sort(arrayList3, new TableModel$$ExternalSyntheticLambda0(tableModel2, 0));
                                                int size3 = arrayList3.size();
                                                int i44 = 0;
                                                while (i44 < size3) {
                                                    Object obj2 = arrayList3.get(i44);
                                                    i44++;
                                                    TL_iv.pageTableCell pagetablecell7 = (TL_iv.pageTableCell) obj2;
                                                    String strPlainOf = (pagetablecell7 == null || (richText = pagetablecell7.text) == null) ? "" : RichTextStyle.plainOf(richText);
                                                    if (!strPlainOf.isEmpty()) {
                                                        if (sb.length() > 0) {
                                                            sb.append("\n");
                                                        }
                                                        sb.append(strPlainOf);
                                                    }
                                                }
                                                TL_iv.pageTableCell pagetablecell8 = tableModel2.grid[iMin6][iMin7];
                                                int i45 = (iMax4 - iMin7) + 1;
                                                int i46 = (iMax3 - iMin6) + 1;
                                                if (i45 <= 1) {
                                                    i45 = 0;
                                                }
                                                pagetablecell8.colspan = i45;
                                                if (i46 <= 1) {
                                                    i46 = 0;
                                                }
                                                pagetablecell8.rowspan = i46;
                                                pagetablecell8.flags = i45 > 0 ? pagetablecell8.flags | 2 : pagetablecell8.flags & (-3);
                                                pagetablecell8.flags = i46 > 0 ? pagetablecell8.flags | 4 : pagetablecell8.flags & (-5);
                                                TableModel.applyPlainText(pagetablecell8, sb.toString());
                                                for (TL_iv.pageTableCell pagetablecell9 : hashSet9) {
                                                    if (pagetablecell9 != pagetablecell8 && (iAnchorRowOf2 = tableModel2.anchorRowOf(pagetablecell9)) >= 0) {
                                                        TL_iv.pageBlockTable pageblocktable = tableModel2.block;
                                                        if (iAnchorRowOf2 < pageblocktable.rows.size()) {
                                                            pageblocktable.rows.get(iAnchorRowOf2).cells.remove(pagetablecell9);
                                                        }
                                                    }
                                                }
                                                tableModel2.rebuildFromBlock();
                                                richTableCell3.refreshAfterModelChange();
                                                richTableCell3.grid.invalidate();
                                                richTableCell3.focusCellAt(iMin5, iMin4);
                                                richTableCell3.notifyCellSelectionChanged();
                                            }
                                        }
                                        linkedHashSet3.addAll(hashSet8);
                                    }
                                }
                            }
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 3:
                            richEditorListView2.getClass();
                            if (richTableCell3.model != null) {
                                LinkedHashSet linkedHashSet4 = richTableCell3.selectedCells;
                                if (linkedHashSet4.size() == 1) {
                                    TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                    int i47 = pagetablecell10.colspan;
                                    if (i47 == 0) {
                                        i47 = 1;
                                    }
                                    if (i47 > 1) {
                                        iAnchorRowOf3 = richTableCell3.model.anchorRowOf(pagetablecell10);
                                        iAnchorColOf2 = richTableCell3.model.anchorColOf(pagetablecell10);
                                        linkedHashSet4.clear();
                                        TableModel tableModel9 = richTableCell3.model;
                                        iAnchorRowOf4 = tableModel9.anchorRowOf(pagetablecell10);
                                        int iAnchorColOf10 = tableModel9.anchorColOf(pagetablecell10);
                                        if (iAnchorRowOf4 >= 0 || iAnchorColOf10 < 0) {
                                            z13 = false;
                                        } else {
                                            int i48 = pagetablecell10.rowspan;
                                            if (i48 == 0) {
                                                i48 = 1;
                                            }
                                            int i49 = pagetablecell10.colspan;
                                            if (i49 == 0) {
                                                i49 = 1;
                                            }
                                            if (i48 > 1 || i49 > 1) {
                                                pagetablecell10.rowspan = 0;
                                                pagetablecell10.colspan = 0;
                                                pagetablecell10.flags &= -7;
                                                int i50 = iAnchorRowOf4;
                                                while (i50 < iAnchorRowOf4 + i48 && i50 < tableModel9.rowCount) {
                                                    TL_iv.pageTableRow pagetablerow = tableModel9.block.rows.get(i50);
                                                    ArrayList arrayList4 = new ArrayList();
                                                    ArrayList<TL_iv.pageTableCell> arrayList5 = pagetablerow.cells;
                                                    int i51 = i48;
                                                    int size4 = arrayList5.size();
                                                    int i52 = i49;
                                                    int i53 = 0;
                                                    while (i53 < size4) {
                                                        TL_iv.pageTableCell pagetablecell11 = arrayList5.get(i53);
                                                        i53++;
                                                        ArrayList<TL_iv.pageTableCell> arrayList6 = arrayList5;
                                                        TL_iv.pageTableCell pagetablecell12 = pagetablecell11;
                                                        arrayList4.add(new Object[]{pagetablecell12, Integer.valueOf(tableModel9.anchorColOf(pagetablecell12))});
                                                        arrayList5 = arrayList6;
                                                        tableModel9 = tableModel9;
                                                    }
                                                    TableModel tableModel4 = tableModel9;
                                                    int i54 = iAnchorColOf10;
                                                    while (i54 < iAnchorColOf10 + i52) {
                                                        if (i50 != iAnchorRowOf4 || i54 != iAnchorColOf10) {
                                                            TL_iv.pageTableCell pagetablecell13 = new TL_iv.pageTableCell();
                                                            pagetablecell13.header = pagetablecell10.header;
                                                            pagetablecell13.align_center = pagetablecell10.align_center;
                                                            pagetablecell13.align_right = pagetablecell10.align_right;
                                                            pagetablecell13.valign_middle = pagetablecell10.valign_middle;
                                                            pagetablecell13.valign_bottom = pagetablecell10.valign_bottom;
                                                            TableModel.applyPlainText(pagetablecell13, str);
                                                            arrayList4.add(new Object[]{pagetablecell13, Integer.valueOf(i54)});
                                                        }
                                                        i54++;
                                                        str = str;
                                                    }
                                                    String str2 = str;
                                                    Collections.sort(arrayList4, Comparator$CC.comparingInt(new TableModel$$ExternalSyntheticLambda1(0)));
                                                    pagetablerow.cells.clear();
                                                    int size5 = arrayList4.size();
                                                    int i55 = 0;
                                                    while (i55 < size5) {
                                                        Object obj3 = arrayList4.get(i55);
                                                        i55++;
                                                        pagetablerow.cells.add((TL_iv.pageTableCell) ((Object[]) obj3)[0]);
                                                    }
                                                    i50++;
                                                    i48 = i51;
                                                    i49 = i52;
                                                    str = str2;
                                                    tableModel9 = tableModel4;
                                                }
                                                tableModel9.rebuildFromBlock();
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                        }
                                        if (z13) {
                                            richTableCell3.refreshAfterModelChange();
                                            richTableCell3.grid.invalidate();
                                            richTableCell3.focusCellAt(iAnchorRowOf3, iAnchorColOf2);
                                            richTableCell3.notifyCellSelectionChanged();
                                        } else {
                                            linkedHashSet4.add(pagetablecell10);
                                        }
                                    } else {
                                        int i56 = pagetablecell10.rowspan;
                                        if (i56 == 0) {
                                            i56 = 1;
                                        }
                                        if (i56 > 1) {
                                            iAnchorRowOf3 = richTableCell3.model.anchorRowOf(pagetablecell10);
                                            iAnchorColOf2 = richTableCell3.model.anchorColOf(pagetablecell10);
                                            linkedHashSet4.clear();
                                            TableModel tableModel10 = richTableCell3.model;
                                            iAnchorRowOf4 = tableModel10.anchorRowOf(pagetablecell10);
                                            int iAnchorColOf11 = tableModel10.anchorColOf(pagetablecell10);
                                            if (iAnchorRowOf4 >= 0) {
                                                z13 = false;
                                            } else {
                                                z13 = false;
                                            }
                                            if (z13) {
                                                richTableCell3.refreshAfterModelChange();
                                                richTableCell3.grid.invalidate();
                                                richTableCell3.focusCellAt(iAnchorRowOf3, iAnchorColOf2);
                                                richTableCell3.notifyCellSelectionChanged();
                                            } else {
                                                linkedHashSet4.add(pagetablecell10);
                                            }
                                        }
                                    }
                                }
                            }
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 4:
                            richEditorListView2.getClass();
                            richTableCell3.applyInsertColumnFromSelection(true);
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 5:
                            richEditorListView2.getClass();
                            richTableCell3.applyInsertColumnFromSelection(false);
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 6:
                            richEditorListView2.getClass();
                            richTableCell3.applyInsertRowFromSelection(true);
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 7:
                            richEditorListView2.getClass();
                            richTableCell3.applyInsertRowFromSelection(false);
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        default:
                            richEditorListView2.getClass();
                            if (richTableCell3.model != null) {
                                LinkedHashSet linkedHashSet5 = richTableCell3.selectedCells;
                                if (!linkedHashSet5.isEmpty()) {
                                    HashSet hashSet10 = new HashSet();
                                    Iterator it10 = linkedHashSet5.iterator();
                                    while (it10.hasNext()) {
                                        int iAnchorColOf12 = richTableCell3.model.anchorColOf((TL_iv.pageTableCell) it10.next());
                                        hashSet10.add(Integer.valueOf(iAnchorColOf12));
                                        iMin3 = Math.min(iMin3, iAnchorColOf12);
                                    }
                                    linkedHashSet5.clear();
                                    TableModel tableModel11 = richTableCell3.model;
                                    tableModel11.getClass();
                                    if (hashSet10.isEmpty()) {
                                        i36 = 0;
                                    } else {
                                        boolean[] zArr3 = new boolean[tableModel11.colCount];
                                        Iterator it11 = hashSet10.iterator();
                                        while (it11.hasNext()) {
                                            int iIntValue4 = ((Integer) it11.next()).intValue();
                                            if (iIntValue4 >= 0 && iIntValue4 < tableModel11.colCount) {
                                                zArr3[iIntValue4] = true;
                                            }
                                        }
                                        int[] iArr4 = new int[tableModel11.colCount];
                                        int i57 = 0;
                                        for (int i58 = 0; i58 < tableModel11.colCount; i58++) {
                                            iArr4[i58] = i57;
                                            if (!zArr3[i58]) {
                                                i57++;
                                            }
                                        }
                                        if (i57 == 0) {
                                            tableModel11.block.rows.clear();
                                            tableModel11.rebuildFromBlock();
                                        } else {
                                            IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                            ArrayList arrayList7 = tableModel11.anchorsRowMajor;
                                            int size6 = arrayList7.size();
                                            int i59 = 0;
                                            while (i59 < size6) {
                                                Object obj4 = arrayList7.get(i59);
                                                i59 += i36;
                                                TL_iv.pageTableCell pagetablecell14 = (TL_iv.pageTableCell) obj4;
                                                int iAnchorRowOf8 = tableModel11.anchorRowOf(pagetablecell14);
                                                int iAnchorColOf13 = tableModel11.anchorColOf(pagetablecell14);
                                                int i60 = pagetablecell14.rowspan;
                                                if (i60 == 0) {
                                                    i60 = 1;
                                                }
                                                int i61 = pagetablecell14.colspan;
                                                if (i61 == 0) {
                                                    i61 = 1;
                                                }
                                                int[] iArr5 = iArr4;
                                                int i62 = 0;
                                                int i63 = -1;
                                                for (int i64 = iAnchorColOf13; i64 < iAnchorColOf13 + i61 && i64 < tableModel11.colCount; i64++) {
                                                    if (!zArr3[i64]) {
                                                        if (i63 < 0) {
                                                            i63 = i64;
                                                        }
                                                        i62++;
                                                    }
                                                }
                                                if (i63 >= 0) {
                                                    identityHashMap2.put(pagetablecell14, new int[]{iAnchorRowOf8, iArr5[i63], i60, i62});
                                                }
                                                iArr4 = iArr5;
                                                i36 = 1;
                                            }
                                            tableModel11.rewriteBlockRows(identityHashMap2, tableModel11.rowCount);
                                            tableModel11.rebuildFromBlock();
                                            i36 = 1;
                                        }
                                    }
                                    richTableCell3.refreshAfterModelChange();
                                    if (i36 != 0) {
                                        richTableCell3.focusCellAt(0, iMin3);
                                    }
                                }
                            }
                            richEditorListView2.exitCellSelectionMode();
                            break;
                    }
                }
            }, false);
        }
        if (i20 != 0) {
            final int i36 = 8;
            r12 = 1;
            itemOptionsMakeMenu.add(R.drawable.iv_table_remove, LocaleController.getString(R.string.ArticleDeleteColumn), new Runnable(this) {
                public final RichEditorListView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    RichEditorListView richEditorListView;
                    boolean z12;
                    int iAnchorRowOf2;
                    TL_iv.RichText richText;
                    int iAnchorRowOf3;
                    int iAnchorColOf2;
                    int iAnchorRowOf4;
                    boolean z13;
                    String str = "";
                    int iMin3 = Integer.MAX_VALUE;
                    RichTableCell richTableCell3 = richTableCell2;
                    RichEditorListView richEditorListView2 = this.f$0;
                    int i37 = 1;
                    switch (i36) {
                        case 0:
                            richEditorListView2.getClass();
                            if (richTableCell3.model != null) {
                                LinkedHashSet linkedHashSet2 = richTableCell3.selectedCells;
                                if (linkedHashSet2.isEmpty()) {
                                    richEditorListView = richEditorListView2;
                                } else {
                                    HashSet hashSet7 = new HashSet();
                                    Iterator it8 = linkedHashSet2.iterator();
                                    while (it8.hasNext()) {
                                        int iAnchorRowOf5 = richTableCell3.model.anchorRowOf((TL_iv.pageTableCell) it8.next());
                                        hashSet7.add(Integer.valueOf(iAnchorRowOf5));
                                        iMin3 = Math.min(iMin3, iAnchorRowOf5);
                                    }
                                    linkedHashSet2.clear();
                                    TableModel tableModel = richTableCell3.model;
                                    tableModel.getClass();
                                    if (hashSet7.isEmpty()) {
                                        richEditorListView = richEditorListView2;
                                        z12 = false;
                                    } else {
                                        boolean[] zArr = new boolean[tableModel.rowCount];
                                        Iterator it9 = hashSet7.iterator();
                                        while (it9.hasNext()) {
                                            int iIntValue3 = ((Integer) it9.next()).intValue();
                                            if (iIntValue3 >= 0 && iIntValue3 < tableModel.rowCount) {
                                                zArr[iIntValue3] = true;
                                            }
                                        }
                                        int[] iArr2 = new int[tableModel.rowCount];
                                        int i38 = 0;
                                        for (int i39 = 0; i39 < tableModel.rowCount; i39++) {
                                            iArr2[i39] = i38;
                                            if (!zArr[i39]) {
                                                i38++;
                                            }
                                        }
                                        if (i38 == 0) {
                                            tableModel.block.rows.clear();
                                            tableModel.rebuildFromBlock();
                                            richEditorListView = richEditorListView2;
                                        } else {
                                            IdentityHashMap identityHashMap = new IdentityHashMap();
                                            ArrayList arrayList = tableModel.anchorsRowMajor;
                                            int size2 = arrayList.size();
                                            int i310 = 0;
                                            while (i310 < size2) {
                                                Object obj = arrayList.get(i310);
                                                i310++;
                                                TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                int iAnchorRowOf6 = tableModel.anchorRowOf(pagetablecell4);
                                                int iAnchorColOf3 = tableModel.anchorColOf(pagetablecell4);
                                                int i311 = pagetablecell4.rowspan;
                                                if (i311 == 0) {
                                                    i311 = 1;
                                                }
                                                int i312 = pagetablecell4.colspan;
                                                if (i312 == 0) {
                                                    i312 = 1;
                                                }
                                                int[] iArr3 = iArr2;
                                                boolean[] zArr2 = zArr;
                                                RichEditorListView richEditorListView3 = richEditorListView2;
                                                int i313 = 0;
                                                int i314 = -1;
                                                for (int i315 = iAnchorRowOf6; i315 < iAnchorRowOf6 + i311 && i315 < tableModel.rowCount; i315++) {
                                                    if (!zArr2[i315]) {
                                                        if (i314 < 0) {
                                                            i314 = i315;
                                                        }
                                                        i313++;
                                                    }
                                                }
                                                if (i314 >= 0) {
                                                    identityHashMap.put(pagetablecell4, new int[]{iArr3[i314], iAnchorColOf3, i313, i312});
                                                }
                                                iArr2 = iArr3;
                                                zArr = zArr2;
                                                richEditorListView2 = richEditorListView3;
                                            }
                                            richEditorListView = richEditorListView2;
                                            tableModel.rewriteBlockRows(identityHashMap, i38);
                                            tableModel.rebuildFromBlock();
                                        }
                                        z12 = true;
                                    }
                                    richTableCell3.refreshAfterModelChange();
                                    if (z12) {
                                        richTableCell3.focusCellAt(iMin3, 0);
                                    }
                                }
                            } else {
                                richEditorListView = richEditorListView2;
                            }
                            richEditorListView.exitCellSelectionMode();
                            break;
                        case 1:
                            richEditorListView2.getClass();
                            BlockRow row = richTableCell3.getRow();
                            richEditorListView2.exitCellSelectionMode();
                            if (row != null) {
                                RichEditorHistory richEditorHistory = richEditorListView2.history;
                                if (richEditorHistory != null) {
                                    AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
                                    richEditorHistory.commit();
                                }
                                ArrayList arrayList2 = richEditorListView2.rows;
                                int iIndexOf = arrayList2.indexOf(row);
                                if (iIndexOf >= 0) {
                                    arrayList2.remove(iIndexOf);
                                    richEditorListView2.adapter.update(true);
                                }
                                RichEditorHistory richEditorHistory2 = richEditorListView2.history;
                                if (richEditorHistory2 != null) {
                                    richEditorHistory2.record();
                                }
                                RichEditorListView.Delegate delegate = richEditorListView2.delegate;
                                if (delegate != null) {
                                    delegate.onContentChanged();
                                }
                            }
                            break;
                        case 2:
                            richEditorListView2.getClass();
                            if (richTableCell3.model != null) {
                                LinkedHashSet linkedHashSet3 = richTableCell3.selectedCells;
                                if (linkedHashSet3.size() >= 2) {
                                    HashSet<TL_iv.pageTableCell> hashSet8 = new HashSet(linkedHashSet3);
                                    int iMin4 = Integer.MAX_VALUE;
                                    int iMin5 = Integer.MAX_VALUE;
                                    for (TL_iv.pageTableCell pagetablecell5 : hashSet8) {
                                        iMin5 = Math.min(iMin5, richTableCell3.model.anchorRowOf(pagetablecell5));
                                        iMin4 = Math.min(iMin4, richTableCell3.model.anchorColOf(pagetablecell5));
                                    }
                                    linkedHashSet3.clear();
                                    TableModel tableModel2 = richTableCell3.model;
                                    tableModel2.getClass();
                                    if (hashSet8.size() < 2) {
                                        linkedHashSet3.addAll(hashSet8);
                                    } else {
                                        int iMax3 = -1;
                                        int iMax4 = -1;
                                        int iMin6 = Integer.MAX_VALUE;
                                        int iMin7 = Integer.MAX_VALUE;
                                        for (TL_iv.pageTableCell pagetablecell6 : hashSet8) {
                                            int iAnchorRowOf7 = tableModel2.anchorRowOf(pagetablecell6);
                                            int iAnchorColOf4 = tableModel2.anchorColOf(pagetablecell6);
                                            int i40 = pagetablecell6.rowspan;
                                            if (i40 == 0) {
                                                i40 = 1;
                                            }
                                            int i41 = pagetablecell6.colspan;
                                            if (i41 == 0) {
                                                i41 = 1;
                                            }
                                            iMin6 = Math.min(iMin6, iAnchorRowOf7);
                                            iMin7 = Math.min(iMin7, iAnchorColOf4);
                                            iMax3 = Math.max(iMax3, (iAnchorRowOf7 + i40) - 1);
                                            iMax4 = Math.max(iMax4, (iAnchorColOf4 + i41) - 1);
                                        }
                                        HashSet<TL_iv.pageTableCell> hashSet9 = new HashSet();
                                        int i42 = iMin6;
                                        while (true) {
                                            if (i42 <= iMax3) {
                                                int i43 = iMin7;
                                                while (true) {
                                                    if (i43 > iMax4) {
                                                        i42++;
                                                    } else if (i42 >= 0 && i43 >= 0 && i42 < tableModel2.rowCount && i43 < tableModel2.colCount) {
                                                        hashSet9.add(tableModel2.grid[i42][i43]);
                                                        i43++;
                                                    }
                                                }
                                            } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                StringBuilder sb = new StringBuilder();
                                                ArrayList arrayList3 = new ArrayList(hashSet9);
                                                Collections.sort(arrayList3, new TableModel$$ExternalSyntheticLambda0(tableModel2, 0));
                                                int size3 = arrayList3.size();
                                                int i44 = 0;
                                                while (i44 < size3) {
                                                    Object obj2 = arrayList3.get(i44);
                                                    i44++;
                                                    TL_iv.pageTableCell pagetablecell7 = (TL_iv.pageTableCell) obj2;
                                                    String strPlainOf = (pagetablecell7 == null || (richText = pagetablecell7.text) == null) ? "" : RichTextStyle.plainOf(richText);
                                                    if (!strPlainOf.isEmpty()) {
                                                        if (sb.length() > 0) {
                                                            sb.append("\n");
                                                        }
                                                        sb.append(strPlainOf);
                                                    }
                                                }
                                                TL_iv.pageTableCell pagetablecell8 = tableModel2.grid[iMin6][iMin7];
                                                int i45 = (iMax4 - iMin7) + 1;
                                                int i46 = (iMax3 - iMin6) + 1;
                                                if (i45 <= 1) {
                                                    i45 = 0;
                                                }
                                                pagetablecell8.colspan = i45;
                                                if (i46 <= 1) {
                                                    i46 = 0;
                                                }
                                                pagetablecell8.rowspan = i46;
                                                pagetablecell8.flags = i45 > 0 ? pagetablecell8.flags | 2 : pagetablecell8.flags & (-3);
                                                pagetablecell8.flags = i46 > 0 ? pagetablecell8.flags | 4 : pagetablecell8.flags & (-5);
                                                TableModel.applyPlainText(pagetablecell8, sb.toString());
                                                for (TL_iv.pageTableCell pagetablecell9 : hashSet9) {
                                                    if (pagetablecell9 != pagetablecell8 && (iAnchorRowOf2 = tableModel2.anchorRowOf(pagetablecell9)) >= 0) {
                                                        TL_iv.pageBlockTable pageblocktable = tableModel2.block;
                                                        if (iAnchorRowOf2 < pageblocktable.rows.size()) {
                                                            pageblocktable.rows.get(iAnchorRowOf2).cells.remove(pagetablecell9);
                                                        }
                                                    }
                                                }
                                                tableModel2.rebuildFromBlock();
                                                richTableCell3.refreshAfterModelChange();
                                                richTableCell3.grid.invalidate();
                                                richTableCell3.focusCellAt(iMin5, iMin4);
                                                richTableCell3.notifyCellSelectionChanged();
                                            }
                                        }
                                        linkedHashSet3.addAll(hashSet8);
                                    }
                                }
                            }
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 3:
                            richEditorListView2.getClass();
                            if (richTableCell3.model != null) {
                                LinkedHashSet linkedHashSet4 = richTableCell3.selectedCells;
                                if (linkedHashSet4.size() == 1) {
                                    TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                    int i47 = pagetablecell10.colspan;
                                    if (i47 == 0) {
                                        i47 = 1;
                                    }
                                    if (i47 > 1) {
                                        iAnchorRowOf3 = richTableCell3.model.anchorRowOf(pagetablecell10);
                                        iAnchorColOf2 = richTableCell3.model.anchorColOf(pagetablecell10);
                                        linkedHashSet4.clear();
                                        TableModel tableModel10 = richTableCell3.model;
                                        iAnchorRowOf4 = tableModel10.anchorRowOf(pagetablecell10);
                                        int iAnchorColOf11 = tableModel10.anchorColOf(pagetablecell10);
                                        if (iAnchorRowOf4 >= 0 || iAnchorColOf11 < 0) {
                                            z13 = false;
                                        } else {
                                            int i48 = pagetablecell10.rowspan;
                                            if (i48 == 0) {
                                                i48 = 1;
                                            }
                                            int i49 = pagetablecell10.colspan;
                                            if (i49 == 0) {
                                                i49 = 1;
                                            }
                                            if (i48 > 1 || i49 > 1) {
                                                pagetablecell10.rowspan = 0;
                                                pagetablecell10.colspan = 0;
                                                pagetablecell10.flags &= -7;
                                                int i50 = iAnchorRowOf4;
                                                while (i50 < iAnchorRowOf4 + i48 && i50 < tableModel10.rowCount) {
                                                    TL_iv.pageTableRow pagetablerow = tableModel10.block.rows.get(i50);
                                                    ArrayList arrayList4 = new ArrayList();
                                                    ArrayList<TL_iv.pageTableCell> arrayList5 = pagetablerow.cells;
                                                    int i51 = i48;
                                                    int size4 = arrayList5.size();
                                                    int i52 = i49;
                                                    int i53 = 0;
                                                    while (i53 < size4) {
                                                        TL_iv.pageTableCell pagetablecell11 = arrayList5.get(i53);
                                                        i53++;
                                                        ArrayList<TL_iv.pageTableCell> arrayList6 = arrayList5;
                                                        TL_iv.pageTableCell pagetablecell12 = pagetablecell11;
                                                        arrayList4.add(new Object[]{pagetablecell12, Integer.valueOf(tableModel10.anchorColOf(pagetablecell12))});
                                                        arrayList5 = arrayList6;
                                                        tableModel10 = tableModel10;
                                                    }
                                                    TableModel tableModel4 = tableModel10;
                                                    int i54 = iAnchorColOf11;
                                                    while (i54 < iAnchorColOf11 + i52) {
                                                        if (i50 != iAnchorRowOf4 || i54 != iAnchorColOf11) {
                                                            TL_iv.pageTableCell pagetablecell13 = new TL_iv.pageTableCell();
                                                            pagetablecell13.header = pagetablecell10.header;
                                                            pagetablecell13.align_center = pagetablecell10.align_center;
                                                            pagetablecell13.align_right = pagetablecell10.align_right;
                                                            pagetablecell13.valign_middle = pagetablecell10.valign_middle;
                                                            pagetablecell13.valign_bottom = pagetablecell10.valign_bottom;
                                                            TableModel.applyPlainText(pagetablecell13, str);
                                                            arrayList4.add(new Object[]{pagetablecell13, Integer.valueOf(i54)});
                                                        }
                                                        i54++;
                                                        str = str;
                                                    }
                                                    String str2 = str;
                                                    Collections.sort(arrayList4, Comparator$CC.comparingInt(new TableModel$$ExternalSyntheticLambda1(0)));
                                                    pagetablerow.cells.clear();
                                                    int size5 = arrayList4.size();
                                                    int i55 = 0;
                                                    while (i55 < size5) {
                                                        Object obj3 = arrayList4.get(i55);
                                                        i55++;
                                                        pagetablerow.cells.add((TL_iv.pageTableCell) ((Object[]) obj3)[0]);
                                                    }
                                                    i50++;
                                                    i48 = i51;
                                                    i49 = i52;
                                                    str = str2;
                                                    tableModel10 = tableModel4;
                                                }
                                                tableModel10.rebuildFromBlock();
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                        }
                                        if (z13) {
                                            richTableCell3.refreshAfterModelChange();
                                            richTableCell3.grid.invalidate();
                                            richTableCell3.focusCellAt(iAnchorRowOf3, iAnchorColOf2);
                                            richTableCell3.notifyCellSelectionChanged();
                                        } else {
                                            linkedHashSet4.add(pagetablecell10);
                                        }
                                    } else {
                                        int i56 = pagetablecell10.rowspan;
                                        if (i56 == 0) {
                                            i56 = 1;
                                        }
                                        if (i56 > 1) {
                                            iAnchorRowOf3 = richTableCell3.model.anchorRowOf(pagetablecell10);
                                            iAnchorColOf2 = richTableCell3.model.anchorColOf(pagetablecell10);
                                            linkedHashSet4.clear();
                                            TableModel tableModel11 = richTableCell3.model;
                                            iAnchorRowOf4 = tableModel11.anchorRowOf(pagetablecell10);
                                            int iAnchorColOf12 = tableModel11.anchorColOf(pagetablecell10);
                                            if (iAnchorRowOf4 >= 0) {
                                                z13 = false;
                                            } else {
                                                z13 = false;
                                            }
                                            if (z13) {
                                                richTableCell3.refreshAfterModelChange();
                                                richTableCell3.grid.invalidate();
                                                richTableCell3.focusCellAt(iAnchorRowOf3, iAnchorColOf2);
                                                richTableCell3.notifyCellSelectionChanged();
                                            } else {
                                                linkedHashSet4.add(pagetablecell10);
                                            }
                                        }
                                    }
                                }
                            }
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 4:
                            richEditorListView2.getClass();
                            richTableCell3.applyInsertColumnFromSelection(true);
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 5:
                            richEditorListView2.getClass();
                            richTableCell3.applyInsertColumnFromSelection(false);
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 6:
                            richEditorListView2.getClass();
                            richTableCell3.applyInsertRowFromSelection(true);
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 7:
                            richEditorListView2.getClass();
                            richTableCell3.applyInsertRowFromSelection(false);
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        default:
                            richEditorListView2.getClass();
                            if (richTableCell3.model != null) {
                                LinkedHashSet linkedHashSet5 = richTableCell3.selectedCells;
                                if (!linkedHashSet5.isEmpty()) {
                                    HashSet hashSet10 = new HashSet();
                                    Iterator it10 = linkedHashSet5.iterator();
                                    while (it10.hasNext()) {
                                        int iAnchorColOf13 = richTableCell3.model.anchorColOf((TL_iv.pageTableCell) it10.next());
                                        hashSet10.add(Integer.valueOf(iAnchorColOf13));
                                        iMin3 = Math.min(iMin3, iAnchorColOf13);
                                    }
                                    linkedHashSet5.clear();
                                    TableModel tableModel12 = richTableCell3.model;
                                    tableModel12.getClass();
                                    if (hashSet10.isEmpty()) {
                                        i37 = 0;
                                    } else {
                                        boolean[] zArr3 = new boolean[tableModel12.colCount];
                                        Iterator it11 = hashSet10.iterator();
                                        while (it11.hasNext()) {
                                            int iIntValue4 = ((Integer) it11.next()).intValue();
                                            if (iIntValue4 >= 0 && iIntValue4 < tableModel12.colCount) {
                                                zArr3[iIntValue4] = true;
                                            }
                                        }
                                        int[] iArr4 = new int[tableModel12.colCount];
                                        int i57 = 0;
                                        for (int i58 = 0; i58 < tableModel12.colCount; i58++) {
                                            iArr4[i58] = i57;
                                            if (!zArr3[i58]) {
                                                i57++;
                                            }
                                        }
                                        if (i57 == 0) {
                                            tableModel12.block.rows.clear();
                                            tableModel12.rebuildFromBlock();
                                        } else {
                                            IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                            ArrayList arrayList7 = tableModel12.anchorsRowMajor;
                                            int size6 = arrayList7.size();
                                            int i59 = 0;
                                            while (i59 < size6) {
                                                Object obj4 = arrayList7.get(i59);
                                                i59 += i37;
                                                TL_iv.pageTableCell pagetablecell14 = (TL_iv.pageTableCell) obj4;
                                                int iAnchorRowOf8 = tableModel12.anchorRowOf(pagetablecell14);
                                                int iAnchorColOf14 = tableModel12.anchorColOf(pagetablecell14);
                                                int i60 = pagetablecell14.rowspan;
                                                if (i60 == 0) {
                                                    i60 = 1;
                                                }
                                                int i61 = pagetablecell14.colspan;
                                                if (i61 == 0) {
                                                    i61 = 1;
                                                }
                                                int[] iArr5 = iArr4;
                                                int i62 = 0;
                                                int i63 = -1;
                                                for (int i64 = iAnchorColOf14; i64 < iAnchorColOf14 + i61 && i64 < tableModel12.colCount; i64++) {
                                                    if (!zArr3[i64]) {
                                                        if (i63 < 0) {
                                                            i63 = i64;
                                                        }
                                                        i62++;
                                                    }
                                                }
                                                if (i63 >= 0) {
                                                    identityHashMap2.put(pagetablecell14, new int[]{iAnchorRowOf8, iArr5[i63], i60, i62});
                                                }
                                                iArr4 = iArr5;
                                                i37 = 1;
                                            }
                                            tableModel12.rewriteBlockRows(identityHashMap2, tableModel12.rowCount);
                                            tableModel12.rebuildFromBlock();
                                            i37 = 1;
                                        }
                                    }
                                    richTableCell3.refreshAfterModelChange();
                                    if (i37 != 0) {
                                        richTableCell3.focusCellAt(0, iMin3);
                                    }
                                }
                            }
                            richEditorListView2.exitCellSelectionMode();
                            break;
                    }
                }
            }, true);
        } else {
            r12 = 1;
        }
        if (i3 != 0) {
            final int i37 = 0;
            itemOptionsMakeMenu.add(R.drawable.iv_table_remove, LocaleController.getString(R.string.ArticleDeleteRow), new Runnable(this) {
                public final RichEditorListView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    RichEditorListView richEditorListView;
                    boolean z12;
                    int iAnchorRowOf2;
                    TL_iv.RichText richText;
                    int iAnchorRowOf3;
                    int iAnchorColOf2;
                    int iAnchorRowOf4;
                    boolean z13;
                    String str = "";
                    int iMin3 = Integer.MAX_VALUE;
                    RichTableCell richTableCell3 = richTableCell2;
                    RichEditorListView richEditorListView2 = this.f$0;
                    int i38 = 1;
                    switch (i37) {
                        case 0:
                            richEditorListView2.getClass();
                            if (richTableCell3.model != null) {
                                LinkedHashSet linkedHashSet2 = richTableCell3.selectedCells;
                                if (linkedHashSet2.isEmpty()) {
                                    richEditorListView = richEditorListView2;
                                } else {
                                    HashSet hashSet7 = new HashSet();
                                    Iterator it8 = linkedHashSet2.iterator();
                                    while (it8.hasNext()) {
                                        int iAnchorRowOf5 = richTableCell3.model.anchorRowOf((TL_iv.pageTableCell) it8.next());
                                        hashSet7.add(Integer.valueOf(iAnchorRowOf5));
                                        iMin3 = Math.min(iMin3, iAnchorRowOf5);
                                    }
                                    linkedHashSet2.clear();
                                    TableModel tableModel = richTableCell3.model;
                                    tableModel.getClass();
                                    if (hashSet7.isEmpty()) {
                                        richEditorListView = richEditorListView2;
                                        z12 = false;
                                    } else {
                                        boolean[] zArr = new boolean[tableModel.rowCount];
                                        Iterator it9 = hashSet7.iterator();
                                        while (it9.hasNext()) {
                                            int iIntValue3 = ((Integer) it9.next()).intValue();
                                            if (iIntValue3 >= 0 && iIntValue3 < tableModel.rowCount) {
                                                zArr[iIntValue3] = true;
                                            }
                                        }
                                        int[] iArr2 = new int[tableModel.rowCount];
                                        int i39 = 0;
                                        for (int i310 = 0; i310 < tableModel.rowCount; i310++) {
                                            iArr2[i310] = i39;
                                            if (!zArr[i310]) {
                                                i39++;
                                            }
                                        }
                                        if (i39 == 0) {
                                            tableModel.block.rows.clear();
                                            tableModel.rebuildFromBlock();
                                            richEditorListView = richEditorListView2;
                                        } else {
                                            IdentityHashMap identityHashMap = new IdentityHashMap();
                                            ArrayList arrayList = tableModel.anchorsRowMajor;
                                            int size2 = arrayList.size();
                                            int i311 = 0;
                                            while (i311 < size2) {
                                                Object obj = arrayList.get(i311);
                                                i311++;
                                                TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                int iAnchorRowOf6 = tableModel.anchorRowOf(pagetablecell4);
                                                int iAnchorColOf3 = tableModel.anchorColOf(pagetablecell4);
                                                int i312 = pagetablecell4.rowspan;
                                                if (i312 == 0) {
                                                    i312 = 1;
                                                }
                                                int i313 = pagetablecell4.colspan;
                                                if (i313 == 0) {
                                                    i313 = 1;
                                                }
                                                int[] iArr3 = iArr2;
                                                boolean[] zArr2 = zArr;
                                                RichEditorListView richEditorListView3 = richEditorListView2;
                                                int i314 = 0;
                                                int i315 = -1;
                                                for (int i316 = iAnchorRowOf6; i316 < iAnchorRowOf6 + i312 && i316 < tableModel.rowCount; i316++) {
                                                    if (!zArr2[i316]) {
                                                        if (i315 < 0) {
                                                            i315 = i316;
                                                        }
                                                        i314++;
                                                    }
                                                }
                                                if (i315 >= 0) {
                                                    identityHashMap.put(pagetablecell4, new int[]{iArr3[i315], iAnchorColOf3, i314, i313});
                                                }
                                                iArr2 = iArr3;
                                                zArr = zArr2;
                                                richEditorListView2 = richEditorListView3;
                                            }
                                            richEditorListView = richEditorListView2;
                                            tableModel.rewriteBlockRows(identityHashMap, i39);
                                            tableModel.rebuildFromBlock();
                                        }
                                        z12 = true;
                                    }
                                    richTableCell3.refreshAfterModelChange();
                                    if (z12) {
                                        richTableCell3.focusCellAt(iMin3, 0);
                                    }
                                }
                            } else {
                                richEditorListView = richEditorListView2;
                            }
                            richEditorListView.exitCellSelectionMode();
                            break;
                        case 1:
                            richEditorListView2.getClass();
                            BlockRow row = richTableCell3.getRow();
                            richEditorListView2.exitCellSelectionMode();
                            if (row != null) {
                                RichEditorHistory richEditorHistory = richEditorListView2.history;
                                if (richEditorHistory != null) {
                                    AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
                                    richEditorHistory.commit();
                                }
                                ArrayList arrayList2 = richEditorListView2.rows;
                                int iIndexOf = arrayList2.indexOf(row);
                                if (iIndexOf >= 0) {
                                    arrayList2.remove(iIndexOf);
                                    richEditorListView2.adapter.update(true);
                                }
                                RichEditorHistory richEditorHistory2 = richEditorListView2.history;
                                if (richEditorHistory2 != null) {
                                    richEditorHistory2.record();
                                }
                                RichEditorListView.Delegate delegate = richEditorListView2.delegate;
                                if (delegate != null) {
                                    delegate.onContentChanged();
                                }
                            }
                            break;
                        case 2:
                            richEditorListView2.getClass();
                            if (richTableCell3.model != null) {
                                LinkedHashSet linkedHashSet3 = richTableCell3.selectedCells;
                                if (linkedHashSet3.size() >= 2) {
                                    HashSet<TL_iv.pageTableCell> hashSet8 = new HashSet(linkedHashSet3);
                                    int iMin4 = Integer.MAX_VALUE;
                                    int iMin5 = Integer.MAX_VALUE;
                                    for (TL_iv.pageTableCell pagetablecell5 : hashSet8) {
                                        iMin5 = Math.min(iMin5, richTableCell3.model.anchorRowOf(pagetablecell5));
                                        iMin4 = Math.min(iMin4, richTableCell3.model.anchorColOf(pagetablecell5));
                                    }
                                    linkedHashSet3.clear();
                                    TableModel tableModel2 = richTableCell3.model;
                                    tableModel2.getClass();
                                    if (hashSet8.size() < 2) {
                                        linkedHashSet3.addAll(hashSet8);
                                    } else {
                                        int iMax3 = -1;
                                        int iMax4 = -1;
                                        int iMin6 = Integer.MAX_VALUE;
                                        int iMin7 = Integer.MAX_VALUE;
                                        for (TL_iv.pageTableCell pagetablecell6 : hashSet8) {
                                            int iAnchorRowOf7 = tableModel2.anchorRowOf(pagetablecell6);
                                            int iAnchorColOf4 = tableModel2.anchorColOf(pagetablecell6);
                                            int i40 = pagetablecell6.rowspan;
                                            if (i40 == 0) {
                                                i40 = 1;
                                            }
                                            int i41 = pagetablecell6.colspan;
                                            if (i41 == 0) {
                                                i41 = 1;
                                            }
                                            iMin6 = Math.min(iMin6, iAnchorRowOf7);
                                            iMin7 = Math.min(iMin7, iAnchorColOf4);
                                            iMax3 = Math.max(iMax3, (iAnchorRowOf7 + i40) - 1);
                                            iMax4 = Math.max(iMax4, (iAnchorColOf4 + i41) - 1);
                                        }
                                        HashSet<TL_iv.pageTableCell> hashSet9 = new HashSet();
                                        int i42 = iMin6;
                                        while (true) {
                                            if (i42 <= iMax3) {
                                                int i43 = iMin7;
                                                while (true) {
                                                    if (i43 > iMax4) {
                                                        i42++;
                                                    } else if (i42 >= 0 && i43 >= 0 && i42 < tableModel2.rowCount && i43 < tableModel2.colCount) {
                                                        hashSet9.add(tableModel2.grid[i42][i43]);
                                                        i43++;
                                                    }
                                                }
                                            } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                StringBuilder sb = new StringBuilder();
                                                ArrayList arrayList3 = new ArrayList(hashSet9);
                                                Collections.sort(arrayList3, new TableModel$$ExternalSyntheticLambda0(tableModel2, 0));
                                                int size3 = arrayList3.size();
                                                int i44 = 0;
                                                while (i44 < size3) {
                                                    Object obj2 = arrayList3.get(i44);
                                                    i44++;
                                                    TL_iv.pageTableCell pagetablecell7 = (TL_iv.pageTableCell) obj2;
                                                    String strPlainOf = (pagetablecell7 == null || (richText = pagetablecell7.text) == null) ? "" : RichTextStyle.plainOf(richText);
                                                    if (!strPlainOf.isEmpty()) {
                                                        if (sb.length() > 0) {
                                                            sb.append("\n");
                                                        }
                                                        sb.append(strPlainOf);
                                                    }
                                                }
                                                TL_iv.pageTableCell pagetablecell8 = tableModel2.grid[iMin6][iMin7];
                                                int i45 = (iMax4 - iMin7) + 1;
                                                int i46 = (iMax3 - iMin6) + 1;
                                                if (i45 <= 1) {
                                                    i45 = 0;
                                                }
                                                pagetablecell8.colspan = i45;
                                                if (i46 <= 1) {
                                                    i46 = 0;
                                                }
                                                pagetablecell8.rowspan = i46;
                                                pagetablecell8.flags = i45 > 0 ? pagetablecell8.flags | 2 : pagetablecell8.flags & (-3);
                                                pagetablecell8.flags = i46 > 0 ? pagetablecell8.flags | 4 : pagetablecell8.flags & (-5);
                                                TableModel.applyPlainText(pagetablecell8, sb.toString());
                                                for (TL_iv.pageTableCell pagetablecell9 : hashSet9) {
                                                    if (pagetablecell9 != pagetablecell8 && (iAnchorRowOf2 = tableModel2.anchorRowOf(pagetablecell9)) >= 0) {
                                                        TL_iv.pageBlockTable pageblocktable = tableModel2.block;
                                                        if (iAnchorRowOf2 < pageblocktable.rows.size()) {
                                                            pageblocktable.rows.get(iAnchorRowOf2).cells.remove(pagetablecell9);
                                                        }
                                                    }
                                                }
                                                tableModel2.rebuildFromBlock();
                                                richTableCell3.refreshAfterModelChange();
                                                richTableCell3.grid.invalidate();
                                                richTableCell3.focusCellAt(iMin5, iMin4);
                                                richTableCell3.notifyCellSelectionChanged();
                                            }
                                        }
                                        linkedHashSet3.addAll(hashSet8);
                                    }
                                }
                            }
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 3:
                            richEditorListView2.getClass();
                            if (richTableCell3.model != null) {
                                LinkedHashSet linkedHashSet4 = richTableCell3.selectedCells;
                                if (linkedHashSet4.size() == 1) {
                                    TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                    int i47 = pagetablecell10.colspan;
                                    if (i47 == 0) {
                                        i47 = 1;
                                    }
                                    if (i47 > 1) {
                                        iAnchorRowOf3 = richTableCell3.model.anchorRowOf(pagetablecell10);
                                        iAnchorColOf2 = richTableCell3.model.anchorColOf(pagetablecell10);
                                        linkedHashSet4.clear();
                                        TableModel tableModel11 = richTableCell3.model;
                                        iAnchorRowOf4 = tableModel11.anchorRowOf(pagetablecell10);
                                        int iAnchorColOf12 = tableModel11.anchorColOf(pagetablecell10);
                                        if (iAnchorRowOf4 >= 0 || iAnchorColOf12 < 0) {
                                            z13 = false;
                                        } else {
                                            int i48 = pagetablecell10.rowspan;
                                            if (i48 == 0) {
                                                i48 = 1;
                                            }
                                            int i49 = pagetablecell10.colspan;
                                            if (i49 == 0) {
                                                i49 = 1;
                                            }
                                            if (i48 > 1 || i49 > 1) {
                                                pagetablecell10.rowspan = 0;
                                                pagetablecell10.colspan = 0;
                                                pagetablecell10.flags &= -7;
                                                int i50 = iAnchorRowOf4;
                                                while (i50 < iAnchorRowOf4 + i48 && i50 < tableModel11.rowCount) {
                                                    TL_iv.pageTableRow pagetablerow = tableModel11.block.rows.get(i50);
                                                    ArrayList arrayList4 = new ArrayList();
                                                    ArrayList<TL_iv.pageTableCell> arrayList5 = pagetablerow.cells;
                                                    int i51 = i48;
                                                    int size4 = arrayList5.size();
                                                    int i52 = i49;
                                                    int i53 = 0;
                                                    while (i53 < size4) {
                                                        TL_iv.pageTableCell pagetablecell11 = arrayList5.get(i53);
                                                        i53++;
                                                        ArrayList<TL_iv.pageTableCell> arrayList6 = arrayList5;
                                                        TL_iv.pageTableCell pagetablecell12 = pagetablecell11;
                                                        arrayList4.add(new Object[]{pagetablecell12, Integer.valueOf(tableModel11.anchorColOf(pagetablecell12))});
                                                        arrayList5 = arrayList6;
                                                        tableModel11 = tableModel11;
                                                    }
                                                    TableModel tableModel4 = tableModel11;
                                                    int i54 = iAnchorColOf12;
                                                    while (i54 < iAnchorColOf12 + i52) {
                                                        if (i50 != iAnchorRowOf4 || i54 != iAnchorColOf12) {
                                                            TL_iv.pageTableCell pagetablecell13 = new TL_iv.pageTableCell();
                                                            pagetablecell13.header = pagetablecell10.header;
                                                            pagetablecell13.align_center = pagetablecell10.align_center;
                                                            pagetablecell13.align_right = pagetablecell10.align_right;
                                                            pagetablecell13.valign_middle = pagetablecell10.valign_middle;
                                                            pagetablecell13.valign_bottom = pagetablecell10.valign_bottom;
                                                            TableModel.applyPlainText(pagetablecell13, str);
                                                            arrayList4.add(new Object[]{pagetablecell13, Integer.valueOf(i54)});
                                                        }
                                                        i54++;
                                                        str = str;
                                                    }
                                                    String str2 = str;
                                                    Collections.sort(arrayList4, Comparator$CC.comparingInt(new TableModel$$ExternalSyntheticLambda1(0)));
                                                    pagetablerow.cells.clear();
                                                    int size5 = arrayList4.size();
                                                    int i55 = 0;
                                                    while (i55 < size5) {
                                                        Object obj3 = arrayList4.get(i55);
                                                        i55++;
                                                        pagetablerow.cells.add((TL_iv.pageTableCell) ((Object[]) obj3)[0]);
                                                    }
                                                    i50++;
                                                    i48 = i51;
                                                    i49 = i52;
                                                    str = str2;
                                                    tableModel11 = tableModel4;
                                                }
                                                tableModel11.rebuildFromBlock();
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                        }
                                        if (z13) {
                                            richTableCell3.refreshAfterModelChange();
                                            richTableCell3.grid.invalidate();
                                            richTableCell3.focusCellAt(iAnchorRowOf3, iAnchorColOf2);
                                            richTableCell3.notifyCellSelectionChanged();
                                        } else {
                                            linkedHashSet4.add(pagetablecell10);
                                        }
                                    } else {
                                        int i56 = pagetablecell10.rowspan;
                                        if (i56 == 0) {
                                            i56 = 1;
                                        }
                                        if (i56 > 1) {
                                            iAnchorRowOf3 = richTableCell3.model.anchorRowOf(pagetablecell10);
                                            iAnchorColOf2 = richTableCell3.model.anchorColOf(pagetablecell10);
                                            linkedHashSet4.clear();
                                            TableModel tableModel12 = richTableCell3.model;
                                            iAnchorRowOf4 = tableModel12.anchorRowOf(pagetablecell10);
                                            int iAnchorColOf13 = tableModel12.anchorColOf(pagetablecell10);
                                            if (iAnchorRowOf4 >= 0) {
                                                z13 = false;
                                            } else {
                                                z13 = false;
                                            }
                                            if (z13) {
                                                richTableCell3.refreshAfterModelChange();
                                                richTableCell3.grid.invalidate();
                                                richTableCell3.focusCellAt(iAnchorRowOf3, iAnchorColOf2);
                                                richTableCell3.notifyCellSelectionChanged();
                                            } else {
                                                linkedHashSet4.add(pagetablecell10);
                                            }
                                        }
                                    }
                                }
                            }
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 4:
                            richEditorListView2.getClass();
                            richTableCell3.applyInsertColumnFromSelection(true);
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 5:
                            richEditorListView2.getClass();
                            richTableCell3.applyInsertColumnFromSelection(false);
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 6:
                            richEditorListView2.getClass();
                            richTableCell3.applyInsertRowFromSelection(true);
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 7:
                            richEditorListView2.getClass();
                            richTableCell3.applyInsertRowFromSelection(false);
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        default:
                            richEditorListView2.getClass();
                            if (richTableCell3.model != null) {
                                LinkedHashSet linkedHashSet5 = richTableCell3.selectedCells;
                                if (!linkedHashSet5.isEmpty()) {
                                    HashSet hashSet10 = new HashSet();
                                    Iterator it10 = linkedHashSet5.iterator();
                                    while (it10.hasNext()) {
                                        int iAnchorColOf14 = richTableCell3.model.anchorColOf((TL_iv.pageTableCell) it10.next());
                                        hashSet10.add(Integer.valueOf(iAnchorColOf14));
                                        iMin3 = Math.min(iMin3, iAnchorColOf14);
                                    }
                                    linkedHashSet5.clear();
                                    TableModel tableModel13 = richTableCell3.model;
                                    tableModel13.getClass();
                                    if (hashSet10.isEmpty()) {
                                        i38 = 0;
                                    } else {
                                        boolean[] zArr3 = new boolean[tableModel13.colCount];
                                        Iterator it11 = hashSet10.iterator();
                                        while (it11.hasNext()) {
                                            int iIntValue4 = ((Integer) it11.next()).intValue();
                                            if (iIntValue4 >= 0 && iIntValue4 < tableModel13.colCount) {
                                                zArr3[iIntValue4] = true;
                                            }
                                        }
                                        int[] iArr4 = new int[tableModel13.colCount];
                                        int i57 = 0;
                                        for (int i58 = 0; i58 < tableModel13.colCount; i58++) {
                                            iArr4[i58] = i57;
                                            if (!zArr3[i58]) {
                                                i57++;
                                            }
                                        }
                                        if (i57 == 0) {
                                            tableModel13.block.rows.clear();
                                            tableModel13.rebuildFromBlock();
                                        } else {
                                            IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                            ArrayList arrayList7 = tableModel13.anchorsRowMajor;
                                            int size6 = arrayList7.size();
                                            int i59 = 0;
                                            while (i59 < size6) {
                                                Object obj4 = arrayList7.get(i59);
                                                i59 += i38;
                                                TL_iv.pageTableCell pagetablecell14 = (TL_iv.pageTableCell) obj4;
                                                int iAnchorRowOf8 = tableModel13.anchorRowOf(pagetablecell14);
                                                int iAnchorColOf15 = tableModel13.anchorColOf(pagetablecell14);
                                                int i60 = pagetablecell14.rowspan;
                                                if (i60 == 0) {
                                                    i60 = 1;
                                                }
                                                int i61 = pagetablecell14.colspan;
                                                if (i61 == 0) {
                                                    i61 = 1;
                                                }
                                                int[] iArr5 = iArr4;
                                                int i62 = 0;
                                                int i63 = -1;
                                                for (int i64 = iAnchorColOf15; i64 < iAnchorColOf15 + i61 && i64 < tableModel13.colCount; i64++) {
                                                    if (!zArr3[i64]) {
                                                        if (i63 < 0) {
                                                            i63 = i64;
                                                        }
                                                        i62++;
                                                    }
                                                }
                                                if (i63 >= 0) {
                                                    identityHashMap2.put(pagetablecell14, new int[]{iAnchorRowOf8, iArr5[i63], i60, i62});
                                                }
                                                iArr4 = iArr5;
                                                i38 = 1;
                                            }
                                            tableModel13.rewriteBlockRows(identityHashMap2, tableModel13.rowCount);
                                            tableModel13.rebuildFromBlock();
                                            i38 = 1;
                                        }
                                    }
                                    richTableCell3.refreshAfterModelChange();
                                    if (i38 != 0) {
                                        richTableCell3.focusCellAt(0, iMin3);
                                    }
                                }
                            }
                            richEditorListView2.exitCellSelectionMode();
                            break;
                    }
                }
            }, r12);
        }
        if (z10) {
            itemOptionsMakeMenu.add(R.drawable.iv_table_remove, LocaleController.getString(R.string.ArticleDeleteTable), new Runnable(this) {
                public final RichEditorListView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    RichEditorListView richEditorListView;
                    boolean z12;
                    int iAnchorRowOf2;
                    TL_iv.RichText richText;
                    int iAnchorRowOf3;
                    int iAnchorColOf2;
                    int iAnchorRowOf4;
                    boolean z13;
                    String str = "";
                    int iMin3 = Integer.MAX_VALUE;
                    RichTableCell richTableCell3 = richTableCell2;
                    RichEditorListView richEditorListView2 = this.f$0;
                    int i38 = 1;
                    switch (r12) {
                        case 0:
                            richEditorListView2.getClass();
                            if (richTableCell3.model != null) {
                                LinkedHashSet linkedHashSet2 = richTableCell3.selectedCells;
                                if (linkedHashSet2.isEmpty()) {
                                    richEditorListView = richEditorListView2;
                                } else {
                                    HashSet hashSet7 = new HashSet();
                                    Iterator it8 = linkedHashSet2.iterator();
                                    while (it8.hasNext()) {
                                        int iAnchorRowOf5 = richTableCell3.model.anchorRowOf((TL_iv.pageTableCell) it8.next());
                                        hashSet7.add(Integer.valueOf(iAnchorRowOf5));
                                        iMin3 = Math.min(iMin3, iAnchorRowOf5);
                                    }
                                    linkedHashSet2.clear();
                                    TableModel tableModel = richTableCell3.model;
                                    tableModel.getClass();
                                    if (hashSet7.isEmpty()) {
                                        richEditorListView = richEditorListView2;
                                        z12 = false;
                                    } else {
                                        boolean[] zArr = new boolean[tableModel.rowCount];
                                        Iterator it9 = hashSet7.iterator();
                                        while (it9.hasNext()) {
                                            int iIntValue3 = ((Integer) it9.next()).intValue();
                                            if (iIntValue3 >= 0 && iIntValue3 < tableModel.rowCount) {
                                                zArr[iIntValue3] = true;
                                            }
                                        }
                                        int[] iArr2 = new int[tableModel.rowCount];
                                        int i39 = 0;
                                        for (int i310 = 0; i310 < tableModel.rowCount; i310++) {
                                            iArr2[i310] = i39;
                                            if (!zArr[i310]) {
                                                i39++;
                                            }
                                        }
                                        if (i39 == 0) {
                                            tableModel.block.rows.clear();
                                            tableModel.rebuildFromBlock();
                                            richEditorListView = richEditorListView2;
                                        } else {
                                            IdentityHashMap identityHashMap = new IdentityHashMap();
                                            ArrayList arrayList = tableModel.anchorsRowMajor;
                                            int size2 = arrayList.size();
                                            int i311 = 0;
                                            while (i311 < size2) {
                                                Object obj = arrayList.get(i311);
                                                i311++;
                                                TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                int iAnchorRowOf6 = tableModel.anchorRowOf(pagetablecell4);
                                                int iAnchorColOf3 = tableModel.anchorColOf(pagetablecell4);
                                                int i312 = pagetablecell4.rowspan;
                                                if (i312 == 0) {
                                                    i312 = 1;
                                                }
                                                int i313 = pagetablecell4.colspan;
                                                if (i313 == 0) {
                                                    i313 = 1;
                                                }
                                                int[] iArr3 = iArr2;
                                                boolean[] zArr2 = zArr;
                                                RichEditorListView richEditorListView3 = richEditorListView2;
                                                int i314 = 0;
                                                int i315 = -1;
                                                for (int i316 = iAnchorRowOf6; i316 < iAnchorRowOf6 + i312 && i316 < tableModel.rowCount; i316++) {
                                                    if (!zArr2[i316]) {
                                                        if (i315 < 0) {
                                                            i315 = i316;
                                                        }
                                                        i314++;
                                                    }
                                                }
                                                if (i315 >= 0) {
                                                    identityHashMap.put(pagetablecell4, new int[]{iArr3[i315], iAnchorColOf3, i314, i313});
                                                }
                                                iArr2 = iArr3;
                                                zArr = zArr2;
                                                richEditorListView2 = richEditorListView3;
                                            }
                                            richEditorListView = richEditorListView2;
                                            tableModel.rewriteBlockRows(identityHashMap, i39);
                                            tableModel.rebuildFromBlock();
                                        }
                                        z12 = true;
                                    }
                                    richTableCell3.refreshAfterModelChange();
                                    if (z12) {
                                        richTableCell3.focusCellAt(iMin3, 0);
                                    }
                                }
                            } else {
                                richEditorListView = richEditorListView2;
                            }
                            richEditorListView.exitCellSelectionMode();
                            break;
                        case 1:
                            richEditorListView2.getClass();
                            BlockRow row = richTableCell3.getRow();
                            richEditorListView2.exitCellSelectionMode();
                            if (row != null) {
                                RichEditorHistory richEditorHistory = richEditorListView2.history;
                                if (richEditorHistory != null) {
                                    AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
                                    richEditorHistory.commit();
                                }
                                ArrayList arrayList2 = richEditorListView2.rows;
                                int iIndexOf = arrayList2.indexOf(row);
                                if (iIndexOf >= 0) {
                                    arrayList2.remove(iIndexOf);
                                    richEditorListView2.adapter.update(true);
                                }
                                RichEditorHistory richEditorHistory2 = richEditorListView2.history;
                                if (richEditorHistory2 != null) {
                                    richEditorHistory2.record();
                                }
                                RichEditorListView.Delegate delegate = richEditorListView2.delegate;
                                if (delegate != null) {
                                    delegate.onContentChanged();
                                }
                            }
                            break;
                        case 2:
                            richEditorListView2.getClass();
                            if (richTableCell3.model != null) {
                                LinkedHashSet linkedHashSet3 = richTableCell3.selectedCells;
                                if (linkedHashSet3.size() >= 2) {
                                    HashSet<TL_iv.pageTableCell> hashSet8 = new HashSet(linkedHashSet3);
                                    int iMin4 = Integer.MAX_VALUE;
                                    int iMin5 = Integer.MAX_VALUE;
                                    for (TL_iv.pageTableCell pagetablecell5 : hashSet8) {
                                        iMin5 = Math.min(iMin5, richTableCell3.model.anchorRowOf(pagetablecell5));
                                        iMin4 = Math.min(iMin4, richTableCell3.model.anchorColOf(pagetablecell5));
                                    }
                                    linkedHashSet3.clear();
                                    TableModel tableModel2 = richTableCell3.model;
                                    tableModel2.getClass();
                                    if (hashSet8.size() < 2) {
                                        linkedHashSet3.addAll(hashSet8);
                                    } else {
                                        int iMax3 = -1;
                                        int iMax4 = -1;
                                        int iMin6 = Integer.MAX_VALUE;
                                        int iMin7 = Integer.MAX_VALUE;
                                        for (TL_iv.pageTableCell pagetablecell6 : hashSet8) {
                                            int iAnchorRowOf7 = tableModel2.anchorRowOf(pagetablecell6);
                                            int iAnchorColOf4 = tableModel2.anchorColOf(pagetablecell6);
                                            int i40 = pagetablecell6.rowspan;
                                            if (i40 == 0) {
                                                i40 = 1;
                                            }
                                            int i41 = pagetablecell6.colspan;
                                            if (i41 == 0) {
                                                i41 = 1;
                                            }
                                            iMin6 = Math.min(iMin6, iAnchorRowOf7);
                                            iMin7 = Math.min(iMin7, iAnchorColOf4);
                                            iMax3 = Math.max(iMax3, (iAnchorRowOf7 + i40) - 1);
                                            iMax4 = Math.max(iMax4, (iAnchorColOf4 + i41) - 1);
                                        }
                                        HashSet<TL_iv.pageTableCell> hashSet9 = new HashSet();
                                        int i42 = iMin6;
                                        while (true) {
                                            if (i42 <= iMax3) {
                                                int i43 = iMin7;
                                                while (true) {
                                                    if (i43 > iMax4) {
                                                        i42++;
                                                    } else if (i42 >= 0 && i43 >= 0 && i42 < tableModel2.rowCount && i43 < tableModel2.colCount) {
                                                        hashSet9.add(tableModel2.grid[i42][i43]);
                                                        i43++;
                                                    }
                                                }
                                            } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                StringBuilder sb = new StringBuilder();
                                                ArrayList arrayList3 = new ArrayList(hashSet9);
                                                Collections.sort(arrayList3, new TableModel$$ExternalSyntheticLambda0(tableModel2, 0));
                                                int size3 = arrayList3.size();
                                                int i44 = 0;
                                                while (i44 < size3) {
                                                    Object obj2 = arrayList3.get(i44);
                                                    i44++;
                                                    TL_iv.pageTableCell pagetablecell7 = (TL_iv.pageTableCell) obj2;
                                                    String strPlainOf = (pagetablecell7 == null || (richText = pagetablecell7.text) == null) ? "" : RichTextStyle.plainOf(richText);
                                                    if (!strPlainOf.isEmpty()) {
                                                        if (sb.length() > 0) {
                                                            sb.append("\n");
                                                        }
                                                        sb.append(strPlainOf);
                                                    }
                                                }
                                                TL_iv.pageTableCell pagetablecell8 = tableModel2.grid[iMin6][iMin7];
                                                int i45 = (iMax4 - iMin7) + 1;
                                                int i46 = (iMax3 - iMin6) + 1;
                                                if (i45 <= 1) {
                                                    i45 = 0;
                                                }
                                                pagetablecell8.colspan = i45;
                                                if (i46 <= 1) {
                                                    i46 = 0;
                                                }
                                                pagetablecell8.rowspan = i46;
                                                pagetablecell8.flags = i45 > 0 ? pagetablecell8.flags | 2 : pagetablecell8.flags & (-3);
                                                pagetablecell8.flags = i46 > 0 ? pagetablecell8.flags | 4 : pagetablecell8.flags & (-5);
                                                TableModel.applyPlainText(pagetablecell8, sb.toString());
                                                for (TL_iv.pageTableCell pagetablecell9 : hashSet9) {
                                                    if (pagetablecell9 != pagetablecell8 && (iAnchorRowOf2 = tableModel2.anchorRowOf(pagetablecell9)) >= 0) {
                                                        TL_iv.pageBlockTable pageblocktable = tableModel2.block;
                                                        if (iAnchorRowOf2 < pageblocktable.rows.size()) {
                                                            pageblocktable.rows.get(iAnchorRowOf2).cells.remove(pagetablecell9);
                                                        }
                                                    }
                                                }
                                                tableModel2.rebuildFromBlock();
                                                richTableCell3.refreshAfterModelChange();
                                                richTableCell3.grid.invalidate();
                                                richTableCell3.focusCellAt(iMin5, iMin4);
                                                richTableCell3.notifyCellSelectionChanged();
                                            }
                                        }
                                        linkedHashSet3.addAll(hashSet8);
                                    }
                                }
                            }
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 3:
                            richEditorListView2.getClass();
                            if (richTableCell3.model != null) {
                                LinkedHashSet linkedHashSet4 = richTableCell3.selectedCells;
                                if (linkedHashSet4.size() == 1) {
                                    TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                    int i47 = pagetablecell10.colspan;
                                    if (i47 == 0) {
                                        i47 = 1;
                                    }
                                    if (i47 > 1) {
                                        iAnchorRowOf3 = richTableCell3.model.anchorRowOf(pagetablecell10);
                                        iAnchorColOf2 = richTableCell3.model.anchorColOf(pagetablecell10);
                                        linkedHashSet4.clear();
                                        TableModel tableModel12 = richTableCell3.model;
                                        iAnchorRowOf4 = tableModel12.anchorRowOf(pagetablecell10);
                                        int iAnchorColOf13 = tableModel12.anchorColOf(pagetablecell10);
                                        if (iAnchorRowOf4 >= 0 || iAnchorColOf13 < 0) {
                                            z13 = false;
                                        } else {
                                            int i48 = pagetablecell10.rowspan;
                                            if (i48 == 0) {
                                                i48 = 1;
                                            }
                                            int i49 = pagetablecell10.colspan;
                                            if (i49 == 0) {
                                                i49 = 1;
                                            }
                                            if (i48 > 1 || i49 > 1) {
                                                pagetablecell10.rowspan = 0;
                                                pagetablecell10.colspan = 0;
                                                pagetablecell10.flags &= -7;
                                                int i50 = iAnchorRowOf4;
                                                while (i50 < iAnchorRowOf4 + i48 && i50 < tableModel12.rowCount) {
                                                    TL_iv.pageTableRow pagetablerow = tableModel12.block.rows.get(i50);
                                                    ArrayList arrayList4 = new ArrayList();
                                                    ArrayList<TL_iv.pageTableCell> arrayList5 = pagetablerow.cells;
                                                    int i51 = i48;
                                                    int size4 = arrayList5.size();
                                                    int i52 = i49;
                                                    int i53 = 0;
                                                    while (i53 < size4) {
                                                        TL_iv.pageTableCell pagetablecell11 = arrayList5.get(i53);
                                                        i53++;
                                                        ArrayList<TL_iv.pageTableCell> arrayList6 = arrayList5;
                                                        TL_iv.pageTableCell pagetablecell12 = pagetablecell11;
                                                        arrayList4.add(new Object[]{pagetablecell12, Integer.valueOf(tableModel12.anchorColOf(pagetablecell12))});
                                                        arrayList5 = arrayList6;
                                                        tableModel12 = tableModel12;
                                                    }
                                                    TableModel tableModel4 = tableModel12;
                                                    int i54 = iAnchorColOf13;
                                                    while (i54 < iAnchorColOf13 + i52) {
                                                        if (i50 != iAnchorRowOf4 || i54 != iAnchorColOf13) {
                                                            TL_iv.pageTableCell pagetablecell13 = new TL_iv.pageTableCell();
                                                            pagetablecell13.header = pagetablecell10.header;
                                                            pagetablecell13.align_center = pagetablecell10.align_center;
                                                            pagetablecell13.align_right = pagetablecell10.align_right;
                                                            pagetablecell13.valign_middle = pagetablecell10.valign_middle;
                                                            pagetablecell13.valign_bottom = pagetablecell10.valign_bottom;
                                                            TableModel.applyPlainText(pagetablecell13, str);
                                                            arrayList4.add(new Object[]{pagetablecell13, Integer.valueOf(i54)});
                                                        }
                                                        i54++;
                                                        str = str;
                                                    }
                                                    String str2 = str;
                                                    Collections.sort(arrayList4, Comparator$CC.comparingInt(new TableModel$$ExternalSyntheticLambda1(0)));
                                                    pagetablerow.cells.clear();
                                                    int size5 = arrayList4.size();
                                                    int i55 = 0;
                                                    while (i55 < size5) {
                                                        Object obj3 = arrayList4.get(i55);
                                                        i55++;
                                                        pagetablerow.cells.add((TL_iv.pageTableCell) ((Object[]) obj3)[0]);
                                                    }
                                                    i50++;
                                                    i48 = i51;
                                                    i49 = i52;
                                                    str = str2;
                                                    tableModel12 = tableModel4;
                                                }
                                                tableModel12.rebuildFromBlock();
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                        }
                                        if (z13) {
                                            richTableCell3.refreshAfterModelChange();
                                            richTableCell3.grid.invalidate();
                                            richTableCell3.focusCellAt(iAnchorRowOf3, iAnchorColOf2);
                                            richTableCell3.notifyCellSelectionChanged();
                                        } else {
                                            linkedHashSet4.add(pagetablecell10);
                                        }
                                    } else {
                                        int i56 = pagetablecell10.rowspan;
                                        if (i56 == 0) {
                                            i56 = 1;
                                        }
                                        if (i56 > 1) {
                                            iAnchorRowOf3 = richTableCell3.model.anchorRowOf(pagetablecell10);
                                            iAnchorColOf2 = richTableCell3.model.anchorColOf(pagetablecell10);
                                            linkedHashSet4.clear();
                                            TableModel tableModel13 = richTableCell3.model;
                                            iAnchorRowOf4 = tableModel13.anchorRowOf(pagetablecell10);
                                            int iAnchorColOf14 = tableModel13.anchorColOf(pagetablecell10);
                                            if (iAnchorRowOf4 >= 0) {
                                                z13 = false;
                                            } else {
                                                z13 = false;
                                            }
                                            if (z13) {
                                                richTableCell3.refreshAfterModelChange();
                                                richTableCell3.grid.invalidate();
                                                richTableCell3.focusCellAt(iAnchorRowOf3, iAnchorColOf2);
                                                richTableCell3.notifyCellSelectionChanged();
                                            } else {
                                                linkedHashSet4.add(pagetablecell10);
                                            }
                                        }
                                    }
                                }
                            }
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 4:
                            richEditorListView2.getClass();
                            richTableCell3.applyInsertColumnFromSelection(true);
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 5:
                            richEditorListView2.getClass();
                            richTableCell3.applyInsertColumnFromSelection(false);
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 6:
                            richEditorListView2.getClass();
                            richTableCell3.applyInsertRowFromSelection(true);
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        case 7:
                            richEditorListView2.getClass();
                            richTableCell3.applyInsertRowFromSelection(false);
                            richEditorListView2.exitCellSelectionMode();
                            break;
                        default:
                            richEditorListView2.getClass();
                            if (richTableCell3.model != null) {
                                LinkedHashSet linkedHashSet5 = richTableCell3.selectedCells;
                                if (!linkedHashSet5.isEmpty()) {
                                    HashSet hashSet10 = new HashSet();
                                    Iterator it10 = linkedHashSet5.iterator();
                                    while (it10.hasNext()) {
                                        int iAnchorColOf15 = richTableCell3.model.anchorColOf((TL_iv.pageTableCell) it10.next());
                                        hashSet10.add(Integer.valueOf(iAnchorColOf15));
                                        iMin3 = Math.min(iMin3, iAnchorColOf15);
                                    }
                                    linkedHashSet5.clear();
                                    TableModel tableModel14 = richTableCell3.model;
                                    tableModel14.getClass();
                                    if (hashSet10.isEmpty()) {
                                        i38 = 0;
                                    } else {
                                        boolean[] zArr3 = new boolean[tableModel14.colCount];
                                        Iterator it11 = hashSet10.iterator();
                                        while (it11.hasNext()) {
                                            int iIntValue4 = ((Integer) it11.next()).intValue();
                                            if (iIntValue4 >= 0 && iIntValue4 < tableModel14.colCount) {
                                                zArr3[iIntValue4] = true;
                                            }
                                        }
                                        int[] iArr4 = new int[tableModel14.colCount];
                                        int i57 = 0;
                                        for (int i58 = 0; i58 < tableModel14.colCount; i58++) {
                                            iArr4[i58] = i57;
                                            if (!zArr3[i58]) {
                                                i57++;
                                            }
                                        }
                                        if (i57 == 0) {
                                            tableModel14.block.rows.clear();
                                            tableModel14.rebuildFromBlock();
                                        } else {
                                            IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                            ArrayList arrayList7 = tableModel14.anchorsRowMajor;
                                            int size6 = arrayList7.size();
                                            int i59 = 0;
                                            while (i59 < size6) {
                                                Object obj4 = arrayList7.get(i59);
                                                i59 += i38;
                                                TL_iv.pageTableCell pagetablecell14 = (TL_iv.pageTableCell) obj4;
                                                int iAnchorRowOf8 = tableModel14.anchorRowOf(pagetablecell14);
                                                int iAnchorColOf16 = tableModel14.anchorColOf(pagetablecell14);
                                                int i60 = pagetablecell14.rowspan;
                                                if (i60 == 0) {
                                                    i60 = 1;
                                                }
                                                int i61 = pagetablecell14.colspan;
                                                if (i61 == 0) {
                                                    i61 = 1;
                                                }
                                                int[] iArr5 = iArr4;
                                                int i62 = 0;
                                                int i63 = -1;
                                                for (int i64 = iAnchorColOf16; i64 < iAnchorColOf16 + i61 && i64 < tableModel14.colCount; i64++) {
                                                    if (!zArr3[i64]) {
                                                        if (i63 < 0) {
                                                            i63 = i64;
                                                        }
                                                        i62++;
                                                    }
                                                }
                                                if (i63 >= 0) {
                                                    identityHashMap2.put(pagetablecell14, new int[]{iAnchorRowOf8, iArr5[i63], i60, i62});
                                                }
                                                iArr4 = iArr5;
                                                i38 = 1;
                                            }
                                            tableModel14.rewriteBlockRows(identityHashMap2, tableModel14.rowCount);
                                            tableModel14.rebuildFromBlock();
                                            i38 = 1;
                                        }
                                    }
                                    richTableCell3.refreshAfterModelChange();
                                    if (i38 != 0) {
                                        richTableCell3.focusCellAt(0, iMin3);
                                    }
                                }
                            }
                            richEditorListView2.exitCellSelectionMode();
                            break;
                    }
                }
            }, r12);
            itemOptionsMakeMenu.addSpaceGap$1();
            TL_iv.pageBlockTable pageblocktable = model.block;
            final int i38 = 0;
            final ItemOptions itemOptions3 = itemOptionsMakeMenu;
            itemOptions3.addChecked(new Runnable() {
                @Override
                public final void run() {
                    switch (i38) {
                        case 0:
                            itemOptions3.dontDismiss = true;
                            boolean z12 = !model.block.bordered;
                            RichTableCell richTableCell3 = richTableCell2;
                            TableModel tableModel = richTableCell3.model;
                            if (tableModel != null) {
                                TL_iv.pageBlockTable pageblocktable2 = tableModel.block;
                                if (pageblocktable2.bordered != z12) {
                                    pageblocktable2.bordered = z12;
                                    richTableCell3.grid.invalidate();
                                    RichEditorListView.AnonymousClass12 anonymousClass12 = richTableCell3.delegate;
                                    if (anonymousClass12 != null && richTableCell3.currentRow != null) {
                                        anonymousClass12.onTextChanged();
                                    }
                                }
                            }
                            actionBarMenuSubItemArr[0].setChecked(z12);
                            break;
                        default:
                            itemOptions3.dontDismiss = true;
                            boolean z13 = !model.block.compact;
                            RichTableCell richTableCell4 = richTableCell2;
                            TableModel tableModel2 = richTableCell4.model;
                            if (tableModel2 != null) {
                                TL_iv.pageBlockTable pageblocktable3 = tableModel2.block;
                                if (pageblocktable3.compact != z13) {
                                    pageblocktable3.compact = z13;
                                    RichTableCellGrid richTableCellGrid = richTableCell4.grid;
                                    if (richTableCellGrid.model != null) {
                                        for (int i39 = 0; i39 < richTableCellGrid.getChildCount(); i39++) {
                                            View childAt = richTableCellGrid.getChildAt(i39);
                                            if (childAt instanceof RichTableCellHost) {
                                                ((RichTableCellHost) childAt).setCompact(richTableCellGrid.model.block.compact);
                                            }
                                        }
                                        richTableCellGrid.requestLayout();
                                        richTableCellGrid.invalidate();
                                    }
                                    richTableCell4.scrollContent.requestLayout();
                                    richTableCell4.requestLayout();
                                    RichEditorListView.AnonymousClass12 anonymousClass13 = richTableCell4.delegate;
                                    if (anonymousClass13 != null && richTableCell4.currentRow != null) {
                                        anonymousClass13.onTextChanged();
                                    }
                                }
                            }
                            actionBarMenuSubItemArr[1].setChecked(z13);
                            break;
                    }
                }
            }, LocaleController.getString(R.string.ArticleTableBordered), pageblocktable.bordered);
            final int i39 = 1;
            richTableCell2 = richTableCell;
            itemOptions3.addChecked(new Runnable() {
                @Override
                public final void run() {
                    switch (i39) {
                        case 0:
                            itemOptions3.dontDismiss = true;
                            boolean z12 = !model.block.bordered;
                            RichTableCell richTableCell3 = richTableCell2;
                            TableModel tableModel = richTableCell3.model;
                            if (tableModel != null) {
                                TL_iv.pageBlockTable pageblocktable2 = tableModel.block;
                                if (pageblocktable2.bordered != z12) {
                                    pageblocktable2.bordered = z12;
                                    richTableCell3.grid.invalidate();
                                    RichEditorListView.AnonymousClass12 anonymousClass12 = richTableCell3.delegate;
                                    if (anonymousClass12 != null && richTableCell3.currentRow != null) {
                                        anonymousClass12.onTextChanged();
                                    }
                                }
                            }
                            actionBarMenuSubItemArr[0].setChecked(z12);
                            break;
                        default:
                            itemOptions3.dontDismiss = true;
                            boolean z13 = !model.block.compact;
                            RichTableCell richTableCell4 = richTableCell2;
                            TableModel tableModel2 = richTableCell4.model;
                            if (tableModel2 != null) {
                                TL_iv.pageBlockTable pageblocktable3 = tableModel2.block;
                                if (pageblocktable3.compact != z13) {
                                    pageblocktable3.compact = z13;
                                    RichTableCellGrid richTableCellGrid = richTableCell4.grid;
                                    if (richTableCellGrid.model != null) {
                                        for (int i310 = 0; i310 < richTableCellGrid.getChildCount(); i310++) {
                                            View childAt = richTableCellGrid.getChildAt(i310);
                                            if (childAt instanceof RichTableCellHost) {
                                                ((RichTableCellHost) childAt).setCompact(richTableCellGrid.model.block.compact);
                                            }
                                        }
                                        richTableCellGrid.requestLayout();
                                        richTableCellGrid.invalidate();
                                    }
                                    richTableCell4.scrollContent.requestLayout();
                                    richTableCell4.requestLayout();
                                    RichEditorListView.AnonymousClass12 anonymousClass13 = richTableCell4.delegate;
                                    if (anonymousClass13 != null && richTableCell4.currentRow != null) {
                                        anonymousClass13.onTextChanged();
                                    }
                                }
                            }
                            actionBarMenuSubItemArr[1].setChecked(z13);
                            break;
                    }
                }
            }, LocaleController.getString(R.string.ArticleTableCompact), pageblocktable.compact);
            final ActionBarMenuSubItem[] actionBarMenuSubItemArr = {itemOptions3.getLast(), itemOptions3.getLast()};
            itemOptions = itemOptions3;
        } else {
            itemOptions = itemOptionsMakeMenu;
        }
        itemOptions.dismissListener = new TodoItemMenu$$ExternalSyntheticLambda8(this, itemOptions, richTableCell2, 29);
        this.tableCellMenu = itemOptions;
        itemOptions.show();
    }

    public final RichTextCell singleSelectionCell() {
        AnonymousClass1 anonymousClass1 = this.textSelectionHelper;
        if (anonymousClass1 == null || !anonymousClass1.isInSelectionMode()) {
            return null;
        }
        int i = anonymousClass1.startViewPosition;
        int i2 = anonymousClass1.endViewPosition;
        BlockRow blockRowRowForCell = rowForCell(i);
        if (i == i2 && blockRowRowForCell != null && isFormattable(blockRowRowForCell.block)) {
            return cellAt(i);
        }
        return null;
    }

    public final Editable singleSelectionText(int i, int i2, int i3, int i4) {
        if (i != i3) {
            return null;
        }
        if (isDetailsHeader(rowForCell(i))) {
            RichEditText richEditTextDetailsEditText = detailsEditText(i);
            if (richEditTextDetailsEditText != null) {
                return richEditTextDetailsEditText.getText();
            }
            return null;
        }
        if (isQuoteAuthorSelection()) {
            RichEditText richEditTextQuoteAuthorEditText = quoteAuthorEditText(i);
            if (richEditTextQuoteAuthorEditText != null) {
                return richEditTextQuoteAuthorEditText.getText();
            }
            return null;
        }
        BlockRow blockRowRowForCell = rowForCell(i);
        if (blockRowRowForCell == null || !isFormattable(blockRowRowForCell.block)) {
            return null;
        }
        int iBlockTextLength = blockTextLength(i);
        if (zzdv.m(i2, i4, iBlockTextLength) >= zzdu.m(i2, i4, iBlockTextLength)) {
            return null;
        }
        RichTextCell richTextCellCellAt = cellAt(i);
        return richTextCellCellAt != null ? richTextCellCellAt.getEditText().getText() : RichTextCell.readStyledText(blockRowRowForCell.block);
    }

    public final boolean spliceBlocksInto(int i, int i2, int i3, int i4, ArrayList arrayList) {
        int i5;
        BlockRow blockRow;
        BlockRow blockRow2;
        CharSequence styledText;
        CharSequence styledText2;
        CharSequence charSequenceSubSequence;
        CharSequence charSequenceSubSequence2;
        RichEditorHistory richEditorHistory;
        ArrayList arrayList2;
        int length;
        int i6;
        TL_iv.PageBlock pageBlock;
        SpannableStringBuilder styledText3;
        RichEditorHistory richEditorHistory2;
        BlockRow blockRow3;
        if (i >= 0 && i2 >= 0) {
            ArrayList arrayList3 = this.rows;
            if (i < arrayList3.size() && i2 < arrayList3.size()) {
                if (i <= i2) {
                    if (i == i2 && i3 > i4) {
                    }
                    for (i5 = i; i5 <= i2; i5++) {
                        blockRow3 = (BlockRow) arrayList3.get(i5);
                        if (blockRow3.detailsEnd && !isDetailsHeader(blockRow3) && !isNonText(blockRow3.block) && !hasCaption(blockRow3.block) && !(blockRow3.block instanceof TL_iv.pageBlockTable)) {
                        }
                    }
                    blockRow = (BlockRow) arrayList3.get(i);
                    blockRow2 = (BlockRow) arrayList3.get(i2);
                    styledText = RichTextCell.readStyledText(blockRow.block);
                    if (i == i2) {
                        styledText2 = styledText;
                    } else {
                        styledText2 = RichTextCell.readStyledText(blockRow2.block);
                    }
                    if (styledText == null) {
                        styledText = "";
                    }
                    if (styledText2 == null) {
                        styledText2 = "";
                    }
                    int iMax = Math.max(0, Math.min(i3, styledText.length()));
                    int iMax2 = Math.max(0, Math.min(i4, styledText2.length()));
                    charSequenceSubSequence = styledText.subSequence(0, iMax);
                    charSequenceSubSequence2 = styledText2.subSequence(iMax2, styledText2.length());
                    richEditorHistory = this.history;
                    if (richEditorHistory != null) {
                        AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
                        richEditorHistory.commit();
                    }
                    if (arrayList.size() == 1 || !isPlainParagraphRow((BlockRow) arrayList.get(0))) {
                        arrayList2 = new ArrayList(arrayList);
                        if (charSequenceSubSequence.length() > 0) {
                            TL_iv.PageBlock pageBlockNewSameTypeBlock = newSameTypeBlock(blockRow.block);
                            pageBlockNewSameTypeBlock.text = RichTextStyle.fromSpannable(charSequenceSubSequence);
                            arrayList2.add(0, new BlockRow(pageBlockNewSameTypeBlock, blockRow.level, blockRow.num));
                        }
                        blockRow = (BlockRow) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList);
                        if (blockRow == null) {
                            length = 0;
                        } else if (isDetailsHeader(blockRow)) {
                            length = RichTextStyle.toSpannable(((TL_iv.pageBlockDetails) blockRow.block).title, null).length();
                        } else {
                            pageBlock = blockRow.block;
                            if (((pageBlock instanceof TL_iv.pageBlockParagraph) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockBlockquote) && !(pageBlock instanceof TL_iv.pageBlockPullquote) && !isHeading(pageBlock)) || (styledText3 = RichTextCell.readStyledText(blockRow.block)) == null) {
                                length = 0;
                            }
                        }
                        if (charSequenceSubSequence2.length() > 0) {
                            TL_iv.PageBlock pageBlockNewSameTypeBlock2 = newSameTypeBlock(blockRow2.block);
                            pageBlockNewSameTypeBlock2.text = RichTextStyle.fromSpannable(charSequenceSubSequence2);
                            arrayList2.add(new BlockRow(pageBlockNewSameTypeBlock2, blockRow2.level, blockRow2.num));
                        }
                        while (i2 >= i) {
                            arrayList3.remove(i2);
                            i2--;
                        }
                        for (i6 = 0; i6 < arrayList2.size(); i6++) {
                            arrayList3.add(i + i6, (BlockRow) arrayList2.get(i6));
                        }
                    } else {
                        SpannableStringBuilder styledText4 = RichTextCell.readStyledText(((BlockRow) arrayList.get(0)).block);
                        CharSequence charSequence = styledText4 != null ? styledText4 : "";
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceSubSequence);
                        spannableStringBuilder.append(charSequence);
                        length = spannableStringBuilder.length();
                        spannableStringBuilder.append(charSequenceSubSequence2);
                        blockRow.block.text = RichTextStyle.fromSpannable(spannableStringBuilder);
                        while (i2 > i) {
                            arrayList3.remove(i2);
                            i2--;
                        }
                    }
                    renumberAllRuns();
                    clear(false);
                    this.adapter.update(false);
                    richEditorHistory2 = this.history;
                    if (richEditorHistory2 != null) {
                        richEditorHistory2.record();
                    }
                    post(new RichEditorListView$$ExternalSyntheticLambda3(this, blockRow, length, 2));
                    return true;
                }
                i2 = i;
                i = i2;
                i4 = i3;
                i3 = i4;
                while (i5 <= i2) {
                    blockRow3 = (BlockRow) arrayList3.get(i5);
                    if (blockRow3.detailsEnd) {
                    }
                }
                blockRow = (BlockRow) arrayList3.get(i);
                blockRow2 = (BlockRow) arrayList3.get(i2);
                styledText = RichTextCell.readStyledText(blockRow.block);
                if (i == i2) {
                    styledText2 = styledText;
                } else {
                    styledText2 = RichTextCell.readStyledText(blockRow2.block);
                }
                if (styledText == null) {
                    styledText = "";
                }
                if (styledText2 == null) {
                    styledText2 = "";
                }
                int iMax3 = Math.max(0, Math.min(i3, styledText.length()));
                int iMax4 = Math.max(0, Math.min(i4, styledText2.length()));
                charSequenceSubSequence = styledText.subSequence(0, iMax3);
                charSequenceSubSequence2 = styledText2.subSequence(iMax4, styledText2.length());
                richEditorHistory = this.history;
                if (richEditorHistory != null) {
                    AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
                    richEditorHistory.commit();
                }
                if (arrayList.size() == 1) {
                    arrayList2 = new ArrayList(arrayList);
                    if (charSequenceSubSequence.length() > 0) {
                        TL_iv.PageBlock pageBlockNewSameTypeBlock3 = newSameTypeBlock(blockRow.block);
                        pageBlockNewSameTypeBlock3.text = RichTextStyle.fromSpannable(charSequenceSubSequence);
                        arrayList2.add(0, new BlockRow(pageBlockNewSameTypeBlock3, blockRow.level, blockRow.num));
                    }
                    blockRow = (BlockRow) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList);
                    if (blockRow == null) {
                        length = 0;
                    } else if (isDetailsHeader(blockRow)) {
                        length = RichTextStyle.toSpannable(((TL_iv.pageBlockDetails) blockRow.block).title, null).length();
                    } else {
                        pageBlock = blockRow.block;
                        length = pageBlock instanceof TL_iv.pageBlockParagraph ? styledText3.length() : styledText3.length();
                    }
                    if (charSequenceSubSequence2.length() > 0) {
                        TL_iv.PageBlock pageBlockNewSameTypeBlock4 = newSameTypeBlock(blockRow2.block);
                        pageBlockNewSameTypeBlock4.text = RichTextStyle.fromSpannable(charSequenceSubSequence2);
                        arrayList2.add(new BlockRow(pageBlockNewSameTypeBlock4, blockRow2.level, blockRow2.num));
                    }
                    while (i2 >= i) {
                        arrayList3.remove(i2);
                        i2--;
                    }
                    while (i6 < arrayList2.size()) {
                        arrayList3.add(i + i6, (BlockRow) arrayList2.get(i6));
                    }
                } else {
                    arrayList2 = new ArrayList(arrayList);
                    if (charSequenceSubSequence.length() > 0) {
                        TL_iv.PageBlock pageBlockNewSameTypeBlock5 = newSameTypeBlock(blockRow.block);
                        pageBlockNewSameTypeBlock5.text = RichTextStyle.fromSpannable(charSequenceSubSequence);
                        arrayList2.add(0, new BlockRow(pageBlockNewSameTypeBlock5, blockRow.level, blockRow.num));
                    }
                    blockRow = (BlockRow) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList);
                    if (blockRow == null) {
                        length = 0;
                    } else if (isDetailsHeader(blockRow)) {
                        length = RichTextStyle.toSpannable(((TL_iv.pageBlockDetails) blockRow.block).title, null).length();
                    } else {
                        pageBlock = blockRow.block;
                        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                        }
                    }
                    if (charSequenceSubSequence2.length() > 0) {
                        TL_iv.PageBlock pageBlockNewSameTypeBlock6 = newSameTypeBlock(blockRow2.block);
                        pageBlockNewSameTypeBlock6.text = RichTextStyle.fromSpannable(charSequenceSubSequence2);
                        arrayList2.add(new BlockRow(pageBlockNewSameTypeBlock6, blockRow2.level, blockRow2.num));
                    }
                    while (i2 >= i) {
                        arrayList3.remove(i2);
                        i2--;
                    }
                    while (i6 < arrayList2.size()) {
                        arrayList3.add(i + i6, (BlockRow) arrayList2.get(i6));
                    }
                }
                renumberAllRuns();
                clear(false);
                this.adapter.update(false);
                richEditorHistory2 = this.history;
                if (richEditorHistory2 != null) {
                    richEditorHistory2.record();
                }
                post(new RichEditorListView$$ExternalSyntheticLambda3(this, blockRow, length, 2));
                return true;
            }
        }
        return false;
    }

    public final void startBlockDrag(View view) {
        RecyclerView.ViewHolder childViewHolder;
        int adapterPosition;
        if (view == null || this.itemTouchHelper == null || !this.reorderingAllowed || (childViewHolder = getChildViewHolder(view)) == null || (adapterPosition = childViewHolder.getAdapterPosition()) < 0 || this.adapter.getReorderSectionId(adapterPosition) < 0) {
            return;
        }
        this.longPressConsumed = true;
        AnonymousClass1 anonymousClass1 = this.textSelectionHelper;
        if (anonymousClass1.isInSelectionMode()) {
            anonymousClass1.clear(false);
        }
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        this.itemTouchHelper.startDrag(childViewHolder);
    }

    public final void startMediaConvertAndUpload(BlockRow blockRow, MediaUploadState mediaUploadState, MediaController.PhotoEntry photoEntry) {
        long j;
        RichMediaUploader richMediaUploader = (RichMediaUploader) this.uploaders.remove(mediaUploadState);
        if (richMediaUploader != null) {
            richMediaUploader.cancel();
        }
        IdentityHashMap identityHashMap = this.converters;
        RichMediaConverter richMediaConverter = (RichMediaConverter) identityHashMap.remove(mediaUploadState);
        if (richMediaConverter != null) {
            richMediaConverter.cancel();
        }
        mediaUploadState.state = 1;
        mediaUploadState.progress = 0.0f;
        RichMediaConverter richMediaConverter2 = new RichMediaConverter(this.currentAccount, new AnonymousClass18(blockRow, mediaUploadState, this));
        identityHashMap.put(mediaUploadState, richMediaConverter2);
        if (richMediaConverter2.started || richMediaConverter2.cancelled || richMediaConverter2.finished) {
            return;
        }
        richMediaConverter2.started = true;
        int i = photoEntry.width;
        int i2 = photoEntry.height;
        if (i <= 0 || i2 <= 0) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(photoEntry.path, options);
                i = options.outWidth;
                i2 = options.outHeight;
            } catch (Exception unused) {
            }
        }
        VideoEditedInfo videoEditedInfo = null;
        arrayList = null;
        ArrayList<VideoEditedInfo.MediaEntity> arrayList = null;
        videoEditedInfo = null;
        if (i > 0 && i2 > 0) {
            int i3 = photoEntry.orientation;
            if (i3 == 90 || i3 == 270) {
                int i4 = i2;
                i2 = i;
                i = i4;
            }
            VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
            videoEditedInfo2.startTime = 0L;
            videoEditedInfo2.start = 0L;
            videoEditedInfo2.endTime = Math.min(3000L, photoEntry.averageDuration);
            while (true) {
                j = videoEditedInfo2.endTime;
                if (j <= 0 || j >= 1000) {
                    break;
                } else {
                    videoEditedInfo2.endTime = j * 2;
                }
            }
            if (j <= 0) {
                videoEditedInfo2.endTime = 3000L;
            }
            long j2 = videoEditedInfo2.endTime;
            float f = j2;
            videoEditedInfo2.end = f;
            videoEditedInfo2.compressQuality = 1;
            videoEditedInfo2.rotationValue = 0;
            videoEditedInfo2.originalPath = photoEntry.path;
            videoEditedInfo2.estimatedSize = (int) ((f / 1000.0f) * 115200.0f);
            videoEditedInfo2.estimatedDuration = j2;
            videoEditedInfo2.framerate = 30;
            videoEditedInfo2.originalDuration = j2;
            videoEditedInfo2.filterState = photoEntry.savedFilterState;
            String str = photoEntry.croppedPaintPath;
            if (str != null) {
                videoEditedInfo2.paintPath = str;
                ArrayList<VideoEditedInfo.MediaEntity> arrayList2 = photoEntry.croppedMediaEntities;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList = photoEntry.croppedMediaEntities;
                }
                videoEditedInfo2.mediaEntities = arrayList;
            } else {
                videoEditedInfo2.paintPath = photoEntry.paintPath;
                videoEditedInfo2.mediaEntities = photoEntry.mediaEntities;
            }
            videoEditedInfo2.isPhoto = true;
            MediaController.CropState cropState = photoEntry.cropState;
            if (cropState != null) {
                int i5 = cropState.transformRotation;
                if (i5 != 90 && i5 != 270) {
                    int i6 = i2;
                    i2 = i;
                    i = i6;
                }
                int i7 = (int) (i2 * cropState.cropPw);
                i2 = (int) (i * cropState.cropPh);
                i = i7;
            }
            float f2 = i;
            float f3 = i2;
            float fMax = Math.max(f2 / 854.0f, f3 / 854.0f);
            if (fMax < 1.0f) {
                fMax = 1.0f;
            }
            int iMax = (int) (f2 / fMax);
            int iMax2 = (int) (f3 / fMax);
            if (iMax % 16 != 0) {
                iMax = Math.max(1, Math.round(iMax / 16.0f)) * 16;
            }
            if (iMax2 % 16 != 0) {
                iMax2 = Math.max(1, Math.round(iMax2 / 16.0f)) * 16;
            }
            videoEditedInfo2.resultWidth = iMax;
            videoEditedInfo2.originalWidth = iMax;
            videoEditedInfo2.resultHeight = iMax2;
            videoEditedInfo2.originalHeight = iMax2;
            videoEditedInfo2.bitrate = -1;
            videoEditedInfo2.muted = true;
            videoEditedInfo2.avatarStartTime = 0L;
            videoEditedInfo = videoEditedInfo2;
        }
        richMediaConverter2.info = videoEditedInfo;
        if (videoEditedInfo == null || !videoEditedInfo.needConvert()) {
            richMediaConverter2.fail();
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.id = 1;
        String absolutePath = new File(FileLoader.getDirectory(4), "rich_anim_" + SharedConfig.getLastLocalId() + ".mp4").getAbsolutePath();
        richMediaConverter2.outPath = absolutePath;
        tL_message.attachPath = absolutePath;
        MessageObject messageObject = new MessageObject(richMediaConverter2.currentAccount, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
        richMediaConverter2.messageObject = messageObject;
        messageObject.videoEditedInfo = richMediaConverter2.info;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(richMediaConverter2.currentAccount);
        notificationCenter.addObserver(richMediaConverter2, NotificationCenter.filePreparingStarted);
        notificationCenter.addObserver(richMediaConverter2, NotificationCenter.fileNewChunkAvailable);
        notificationCenter.addObserver(richMediaConverter2, NotificationCenter.filePreparingFailed);
        MediaController.getInstance().scheduleVideoConvert(richMediaConverter2.messageObject, false, false, false);
    }

    public final RichEditText tableEditText(int i, int i2) {
        View viewSelectableAt = selectableAt(i);
        if (viewSelectableAt instanceof RichTableCell) {
            return ((RichTableCell) viewSelectableAt).editTextForChildPos(i2);
        }
        return null;
    }

    public final void toggleQuoteOnSelection() {
        int[] iArrSelectedRowRange = selectedRowRange();
        if (iArrSelectedRowRange == null) {
            return;
        }
        int i = iArrSelectedRowRange[0];
        int i2 = iArrSelectedRowRange[1];
        if (i >= 0) {
            ArrayList arrayList = this.rows;
            if (i2 >= arrayList.size() || i > i2) {
                return;
            }
            RichEditorHistory richEditorHistory = this.history;
            if (richEditorHistory != null) {
                AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
                richEditorHistory.commit();
            }
            if (isRangeQuoted(i, i2)) {
                for (int i3 = i; i3 <= i2; i3++) {
                    BlockRow blockRow = (BlockRow) arrayList.get(i3);
                    if (!blockRow.detailsEnd && !isDetailsHeader(blockRow)) {
                        if (RichTextCell.isQuoteBlock(blockRow.block)) {
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            pageblockparagraph.text = blockRow.block.text;
                            blockRow.block = pageblockparagraph;
                        } else {
                            ArrayList arrayList2 = blockRow.quoteIds;
                            if (!arrayList2.isEmpty()) {
                                SurfaceContainer$$ExternalSyntheticOutline0.m5m(1, arrayList2);
                            }
                        }
                    }
                }
            } else {
                long j = RichContainer.ID_GEN;
                long j2 = 1;
                RichContainer.ID_GEN = j + 1;
                int i4 = i;
                while (i4 <= i2) {
                    BlockRow blockRow2 = (BlockRow) arrayList.get(i4);
                    if (!blockRow2.detailsEnd && !isDetailsHeader(blockRow2)) {
                        boolean zIsQuoteBlock = RichTextCell.isQuoteBlock(blockRow2.block);
                        ArrayList arrayList3 = blockRow2.quoteIds;
                        if (zIsQuoteBlock) {
                            long j3 = RichContainer.ID_GEN;
                            RichContainer.ID_GEN = j3 + j2;
                            TL_iv.RichText richTextExtractCaption = RichTextCell.extractCaption(blockRow2.block);
                            if (richTextExtractCaption != null && !(richTextExtractCaption instanceof TL_iv.textEmpty)) {
                                this.quoteAuthors.put(Long.valueOf(j3), richTextExtractCaption);
                            }
                            arrayList3.add(Long.valueOf(j3));
                            TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                            pageblockparagraph2.text = blockRow2.block.text;
                            blockRow2.block = pageblockparagraph2;
                        }
                        arrayList3.add(0, Long.valueOf(j));
                    }
                    i4++;
                    j2 = 1;
                }
            }
            collapseSingleBlockQuotes();
            normalizeNestedQuotes();
            renumberAllRuns();
            AnonymousClass1 anonymousClass1 = this.textSelectionHelper;
            boolean z = anonymousClass1 != null && anonymousClass1.isInSelectionMode();
            BlockRow blockRow3 = (BlockRow) arrayList.get(Math.max(0, Math.min(i, arrayList.size() - 1)));
            BlockRow blockRow4 = (BlockRow) arrayList.get(Math.max(0, Math.min(i2, arrayList.size() - 1)));
            this.adapter.update(false);
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
            if (z) {
                post(new EglRenderer$$ExternalSyntheticLambda6(this, blockRow3, blockRow4, 1));
            } else {
                post(new RichEditorListView$$ExternalSyntheticLambda2(this, blockRow3, 0));
            }
        }
    }

    public final void transformRow(BlockRow blockRow, TL_iv.PageBlock pageBlock, int i, int i2, boolean z, boolean z2) {
        BlockRow blockRow2;
        RichEditorHistory richEditorHistory;
        ArrayList arrayList = this.rows;
        int iIndexOf = arrayList.indexOf(blockRow);
        if (iIndexOf < 0) {
            return;
        }
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            AndroidUtilities.cancelRunOnUIThread(richEditorHistory2.commitRunnable);
            richEditorHistory2.commit();
        }
        blockRow.block = pageBlock;
        blockRow.level = i;
        blockRow.num = i2;
        blockRow.checkbox = z;
        blockRow.checked = z2;
        renumberAllRuns();
        boolean z3 = pageBlock instanceof TL_iv.pageBlockTable;
        if (!z3) {
            if (isNonText(pageBlock)) {
                if (isMedia(pageBlock) && blockRow.media == null) {
                    blockRow.media = new MediaUploadState();
                }
                int i3 = iIndexOf + 1;
                if (i3 >= arrayList.size() || isNonText(((BlockRow) arrayList.get(i3)).block)) {
                    blockRow2 = new BlockRow(new TL_iv.pageBlockParagraph(), 0, 0);
                    arrayList.add(i3, blockRow2);
                } else {
                    blockRow2 = (BlockRow) arrayList.get(i3);
                }
            }
            if (blockRow2 == blockRow || z3 || isNonText(pageBlock) || !(findFocus() instanceof RichEditText)) {
                this.adapter.update(false);
                richEditorHistory = this.history;
                if (richEditorHistory != null) {
                    richEditorHistory.record();
                }
                post(new RichEditorListView$$ExternalSyntheticLambda2(this, blockRow2, 18));
            }
            applyInPlaceUpdateKeepingFocus();
            RichEditorHistory richEditorHistory3 = this.history;
            if (richEditorHistory3 != null) {
                richEditorHistory3.record();
            }
            View viewFindViewByItemObject = findViewByItemObject(blockRow);
            if (viewFindViewByItemObject instanceof RichTextCell) {
                RichTextCell richTextCell = (RichTextCell) viewFindViewByItemObject;
                richTextCell.editText.requestEditFocus();
                richTextCell.getEditText().setSelection(richTextCell.getEditText().length());
                return;
            }
            return;
        }
        int i4 = iIndexOf + 1;
        if (i4 >= arrayList.size() || isNonText(((BlockRow) arrayList.get(i4)).block)) {
            arrayList.add(i4, new BlockRow(new TL_iv.pageBlockParagraph(), 0, 0));
        }
        blockRow2 = blockRow;
        if (blockRow2 == blockRow) {
        }
        this.adapter.update(false);
        richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.record();
        }
        post(new RichEditorListView$$ExternalSyntheticLambda2(this, blockRow2, 18));
    }

    public final boolean tryEscalateSelectAll() {
        boolean z;
        int[] iArr;
        int[] iArr2;
        int i;
        ArrayList arrayList;
        int size;
        SparseIntArray sparseIntArray;
        int size2;
        BlockRow blockRow;
        String strPlainOf;
        int length;
        TextSelectionHelper.TextSelectionOverlay textSelectionOverlay;
        TextSelectionHelper.Callback callback;
        int i2;
        KeyEvent.Callback childAt;
        TextSelectionHelper.ArticleSelectableView articleSelectableView;
        BlockRow blockRow2;
        long j;
        String strPlainOf2;
        boolean zSelectRangeOf;
        int length2;
        RichCaptionHost richCaptionHost;
        RichTextCell richTextCell;
        int i3;
        int iIndexOf;
        if (this.rows.isEmpty()) {
            return false;
        }
        AnonymousClass1 anonymousClass1 = this.textSelectionHelper;
        boolean zIsInSelectionMode = anonymousClass1.isInSelectionMode();
        ChatActivity$$ExternalSyntheticLambda174 chatActivity$$ExternalSyntheticLambda174 = anonymousClass1.showActionsRunnable;
        TextSelectionHelper.ArticleSelectableView articleSelectableView2 = null;
        if (zIsInSelectionMode) {
            int i4 = anonymousClass1.startViewPosition;
            if (i4 != anonymousClass1.endViewPosition) {
                z = false;
            } else {
                View viewSelectableAt = selectableAt(i4);
                if (viewSelectableAt instanceof RichTableCell) {
                    RichTableCell richTableCell = (RichTableCell) viewSelectableAt;
                    TableModel tableModel = richTableCell.model;
                    int size3 = tableModel != null ? tableModel.anchorsRowMajor.size() : 0;
                    while (true) {
                        if (size3 < 0) {
                            iArr = null;
                            break;
                        }
                        RichEditText richEditTextEditTextForChildPos = richTableCell.editTextForChildPos(size3);
                        int length3 = richEditTextEditTextForChildPos != null ? richEditTextEditTextForChildPos.length() : 0;
                        if (length3 > 0) {
                            iArr = new int[]{size3, length3};
                            break;
                        }
                        size3--;
                    }
                    if (iArr != null && anonymousClass1.startViewChildPosition == 0 && anonymousClass1.startViewOffset == 0 && anonymousClass1.endViewChildPosition == iArr[0] && anonymousClass1.endViewOffset == iArr[1]) {
                        z = false;
                    } else {
                        TableModel tableModel2 = richTableCell.model;
                        int size4 = tableModel2 != null ? tableModel2.anchorsRowMajor.size() : 0;
                        while (true) {
                            if (size4 < 0) {
                                iArr2 = null;
                                break;
                            }
                            RichEditText richEditTextEditTextForChildPos2 = richTableCell.editTextForChildPos(size4);
                            int length4 = richEditTextEditTextForChildPos2 != null ? richEditTextEditTextForChildPos2.length() : 0;
                            if (length4 > 0) {
                                iArr2 = new int[]{size4, length4};
                                break;
                            }
                            size4--;
                        }
                        if (iArr2 == null) {
                            z = false;
                        } else {
                            int i5 = iArr2[0];
                            int i6 = iArr2[1];
                            int adapterPosition = anonymousClass1.getAdapterPosition(richTableCell);
                            if (adapterPosition >= 0 && !(i5 == 0 && i6 == 0)) {
                                anonymousClass1.selectedView = richTableCell;
                                anonymousClass1.endViewPosition = adapterPosition;
                                anonymousClass1.startViewPosition = adapterPosition;
                                anonymousClass1.startViewChildPosition = 0;
                                anonymousClass1.endViewChildPosition = i5;
                                anonymousClass1.startViewOffset = 0;
                                anonymousClass1.endViewOffset = i6;
                                anonymousClass1.selectionStart = 0;
                                anonymousClass1.selectionEnd = i6;
                                anonymousClass1.anchorViewPosition = adapterPosition;
                                anonymousClass1.anchorChildPosition = 0;
                                anonymousClass1.anchorOffset = 0;
                                anonymousClass1.populateTextCacheForView(richTableCell, adapterPosition);
                                ArrayList arrayList2 = anonymousClass1.arrayList;
                                arrayList2.clear();
                                richTableCell.fillTextLayoutBlocks(arrayList2);
                                if ((!arrayList2.isEmpty() && arrayList2.size() > 0) || !arrayList2.isEmpty()) {
                                    anonymousClass1.textX = ((TextSelectionHelper.TextLayoutBlock) arrayList2.get(0)).getX();
                                    anonymousClass1.textY = ((TextSelectionHelper.TextLayoutBlock) arrayList2.get(0)).getY();
                                }
                                TextSelectionHelper.TextSelectionOverlay textSelectionOverlay2 = anonymousClass1.textSelectionOverlay;
                                if (textSelectionOverlay2 != null) {
                                    textSelectionOverlay2.setVisibility(0);
                                }
                                anonymousClass1.showHandleViews();
                                anonymousClass1.invalidate();
                                anonymousClass1.hideActions();
                                AndroidUtilities.cancelRunOnUIThread(chatActivity$$ExternalSyntheticLambda174);
                                AndroidUtilities.runOnUIThread(chatActivity$$ExternalSyntheticLambda174);
                                TextSelectionHelper.Callback callback2 = anonymousClass1.callback;
                                if (callback2 != null) {
                                    callback2.onStateChanged(true);
                                }
                                richTableCell.invalidate();
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                    }
                } else {
                    z = false;
                }
            }
            if (!z) {
                i = 0;
                while (true) {
                    arrayList = this.itemRows;
                    size = arrayList.size();
                    sparseIntArray = anonymousClass1.childCountByPosition;
                    if (i < size) {
                        break;
                        break;
                    }
                    blockRow2 = (BlockRow) arrayList.get(i);
                    j = blockRow2.authorQuoteId;
                    if (j != 0) {
                        anonymousClass1.cacheText(i, RichTextStyle.plainOf((TL_iv.RichText) this.quoteAuthors.get(Long.valueOf(j))));
                    } else {
                        anonymousClass1.cacheText(i, RichTextCell.readPlainText(blockRow2.block));
                        if (RichTextCell.isQuoteBlock(blockRow2.block)) {
                            strPlainOf2 = RichTextStyle.plainOf(RichTextCell.extractCaption(blockRow2.block));
                            if (!strPlainOf2.isEmpty()) {
                                anonymousClass1.textByPosition.put(65536 + i, TextSelectionHelper.ArticleTextSelectionHelper.detachedText(strPlainOf2));
                                sparseIntArray.put(i, Math.max(2, sparseIntArray.get(i)));
                            }
                        }
                    }
                    i++;
                }
                size2 = arrayList.size() - 1;
                blockRow = (BlockRow) arrayList.get(size2);
                if (blockRow.authorQuoteId == 0) {
                    strPlainOf = "";
                } else {
                    strPlainOf = "";
                }
                if (!strPlainOf.isEmpty()) {
                    anonymousClass1.selectAllBlocksRange(0, size2);
                    return true;
                }
                length = strPlainOf.length();
                if (size2 >= 0) {
                    if (anonymousClass1.parentView != null) {
                        for (i2 = 0; i2 < anonymousClass1.parentView.getChildCount(); i2++) {
                            childAt = anonymousClass1.parentView.getChildAt(i2);
                            if (childAt instanceof TextSelectionHelper.ArticleSelectableView) {
                                articleSelectableView = (TextSelectionHelper.ArticleSelectableView) childAt;
                                if (anonymousClass1.getAdapterPosition(articleSelectableView) == size2) {
                                    articleSelectableView2 = articleSelectableView;
                                    break;
                                }
                            }
                        }
                    }
                    anonymousClass1.selectedView = articleSelectableView2;
                    anonymousClass1.selectionStart = 0;
                    anonymousClass1.selectionEnd = length;
                    anonymousClass1.startViewPosition = 0;
                    anonymousClass1.endViewPosition = size2;
                    anonymousClass1.startViewChildPosition = 0;
                    anonymousClass1.endViewChildPosition = 1;
                    anonymousClass1.startViewOffset = 0;
                    anonymousClass1.endViewOffset = length;
                    sparseIntArray.put(0, Math.max(1, sparseIntArray.get(0)));
                    sparseIntArray.put(size2, Math.max(2, sparseIntArray.get(size2)));
                    anonymousClass1.anchorViewPosition = 0;
                    anonymousClass1.anchorChildPosition = 0;
                    anonymousClass1.anchorOffset = 0;
                    textSelectionOverlay = anonymousClass1.textSelectionOverlay;
                    if (textSelectionOverlay != null) {
                        textSelectionOverlay.setVisibility(0);
                    }
                    anonymousClass1.showHandleViews();
                    anonymousClass1.invalidate();
                    anonymousClass1.hideActions();
                    AndroidUtilities.cancelRunOnUIThread(chatActivity$$ExternalSyntheticLambda174);
                    AndroidUtilities.runOnUIThread(chatActivity$$ExternalSyntheticLambda174);
                    callback = anonymousClass1.callback;
                    if (callback != null) {
                        callback.onStateChanged(true);
                    }
                }
            }
        } else {
            RichEditText richEditTextFindFocusedEditText = findFocusedEditText();
            if (richEditTextFindFocusedEditText == 0 || richEditTextFindFocusedEditText.getText() == null || (length2 = richEditTextFindFocusedEditText.getText().length()) <= 0) {
                zSelectRangeOf = false;
            } else {
                RichTableCell richTableCellFindTableCellAncestor = findTableCellAncestor(richEditTextFindFocusedEditText);
                if (richTableCellFindTableCellAncestor != null) {
                    if (richEditTextFindFocusedEditText == richTableCellFindTableCellAncestor.getTitleEditText()) {
                        i3 = 0;
                    } else {
                        RichTableCellHost richTableCellHostFindHostContaining = richTableCellFindTableCellAncestor.findHostContaining(richEditTextFindFocusedEditText);
                        i3 = -1;
                        if (richTableCellHostFindHostContaining != null) {
                            TL_iv.pageTableCell pagetablecell = richTableCellHostFindHostContaining.cell;
                            TableModel tableModel3 = richTableCellFindTableCellAncestor.model;
                            if (tableModel3 != null && (iIndexOf = tableModel3.anchorsRowMajor.indexOf(pagetablecell)) >= 0) {
                                i3 = iIndexOf + 1;
                            }
                        }
                    }
                    if (i3 < 0) {
                        zSelectRangeOf = false;
                    } else {
                        richEditTextFindFocusedEditText.setSelection(richEditTextFindFocusedEditText.getSelectionEnd());
                        zSelectRangeOf = anonymousClass1.selectRangeOf(richTableCellFindTableCellAncestor, i3, 0, length2);
                    }
                } else {
                    if (!(richEditTextFindFocusedEditText instanceof RichCaptionHost)) {
                        ViewParent parent = richEditTextFindFocusedEditText.getParent();
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
                        richCaptionHost = (RichCaptionHost) richEditTextFindFocusedEditText;
                    }
                    if (richCaptionHost instanceof TextSelectionHelper.ArticleSelectableView) {
                        richEditTextFindFocusedEditText.setSelection(richEditTextFindFocusedEditText.getSelectionEnd());
                        zSelectRangeOf = anonymousClass1.selectRangeOf((TextSelectionHelper.ArticleSelectableView) richCaptionHost, 0, 0, length2);
                    } else {
                        ViewParent parent2 = richEditTextFindFocusedEditText.getParent();
                        while (true) {
                            if (parent2 == null) {
                                richTextCell = null;
                                break;
                            }
                            if (parent2 instanceof RichTextCell) {
                                richTextCell = (RichTextCell) parent2;
                                break;
                            }
                            parent2 = parent2.getParent();
                        }
                        if (richTextCell != null) {
                            int i7 = richEditTextFindFocusedEditText == richTextCell.getAuthorEditText() ? 1 : 0;
                            richEditTextFindFocusedEditText.setSelection(richEditTextFindFocusedEditText.getSelectionEnd());
                            zSelectRangeOf = anonymousClass1.selectRangeOf(richTextCell, i7, 0, length2);
                        } else {
                            zSelectRangeOf = false;
                        }
                    }
                }
            }
            if (!zSelectRangeOf) {
                i = 0;
                while (true) {
                    arrayList = this.itemRows;
                    size = arrayList.size();
                    sparseIntArray = anonymousClass1.childCountByPosition;
                    if (i < size) {
                        break;
                    }
                    blockRow2 = (BlockRow) arrayList.get(i);
                    j = blockRow2.authorQuoteId;
                    if (j != 0) {
                        anonymousClass1.cacheText(i, RichTextStyle.plainOf((TL_iv.RichText) this.quoteAuthors.get(Long.valueOf(j))));
                    } else {
                        anonymousClass1.cacheText(i, RichTextCell.readPlainText(blockRow2.block));
                        if (RichTextCell.isQuoteBlock(blockRow2.block)) {
                            strPlainOf2 = RichTextStyle.plainOf(RichTextCell.extractCaption(blockRow2.block));
                            if (!strPlainOf2.isEmpty()) {
                                anonymousClass1.textByPosition.put(65536 + i, TextSelectionHelper.ArticleTextSelectionHelper.detachedText(strPlainOf2));
                                sparseIntArray.put(i, Math.max(2, sparseIntArray.get(i)));
                            }
                        }
                    }
                    i++;
                }
                size2 = arrayList.size() - 1;
                blockRow = (BlockRow) arrayList.get(size2);
                if (blockRow.authorQuoteId == 0 || !RichTextCell.isQuoteBlock(blockRow.block)) {
                    strPlainOf = "";
                } else {
                    strPlainOf = RichTextStyle.plainOf(RichTextCell.extractCaption(blockRow.block));
                }
                if (!strPlainOf.isEmpty()) {
                    anonymousClass1.selectAllBlocksRange(0, size2);
                    return true;
                }
                length = strPlainOf.length();
                if (size2 >= 0) {
                    if (anonymousClass1.parentView != null) {
                        while (i2 < anonymousClass1.parentView.getChildCount()) {
                            childAt = anonymousClass1.parentView.getChildAt(i2);
                            if (childAt instanceof TextSelectionHelper.ArticleSelectableView) {
                                articleSelectableView = (TextSelectionHelper.ArticleSelectableView) childAt;
                                if (anonymousClass1.getAdapterPosition(articleSelectableView) == size2) {
                                    articleSelectableView2 = articleSelectableView;
                                    break;
                                }
                            }
                        }
                    }
                    anonymousClass1.selectedView = articleSelectableView2;
                    anonymousClass1.selectionStart = 0;
                    anonymousClass1.selectionEnd = length;
                    anonymousClass1.startViewPosition = 0;
                    anonymousClass1.endViewPosition = size2;
                    anonymousClass1.startViewChildPosition = 0;
                    anonymousClass1.endViewChildPosition = 1;
                    anonymousClass1.startViewOffset = 0;
                    anonymousClass1.endViewOffset = length;
                    sparseIntArray.put(0, Math.max(1, sparseIntArray.get(0)));
                    sparseIntArray.put(size2, Math.max(2, sparseIntArray.get(size2)));
                    anonymousClass1.anchorViewPosition = 0;
                    anonymousClass1.anchorChildPosition = 0;
                    anonymousClass1.anchorOffset = 0;
                    textSelectionOverlay = anonymousClass1.textSelectionOverlay;
                    if (textSelectionOverlay != null) {
                        textSelectionOverlay.setVisibility(0);
                    }
                    anonymousClass1.showHandleViews();
                    anonymousClass1.invalidate();
                    anonymousClass1.hideActions();
                    AndroidUtilities.cancelRunOnUIThread(chatActivity$$ExternalSyntheticLambda174);
                    AndroidUtilities.runOnUIThread(chatActivity$$ExternalSyntheticLambda174);
                    callback = anonymousClass1.callback;
                    if (callback != null) {
                        callback.onStateChanged(true);
                    }
                }
            }
        }
        return true;
    }

    public final boolean tryStartTextSelection(android.view.View r11, float r12, float r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iv.RichEditorListView.tryStartTextSelection(android.view.View, float, float):boolean");
    }

    public final void turnInto(BlockRow blockRow, TL_iv.PageBlock pageBlock, int i, int i2, boolean z, boolean z2) {
        if (blockRow == null) {
            blockRow = turnIntoTarget();
        }
        BlockRow blockRow2 = blockRow;
        if (blockRow2 == null || pageBlock == null) {
            return;
        }
        ArrayList arrayList = this.rows;
        if (arrayList.indexOf(blockRow2) < 0 || isDetailsHeader(blockRow2) || blockRow2.detailsEnd) {
            return;
        }
        TL_iv.PageBlock pageBlock2 = blockRow2.block;
        if (pageBlock != pageBlock2 && isFormattable(pageBlock2) && isFormattable(pageBlock)) {
            RichTextCell richTextCellCellAt = cellAt(arrayList.indexOf(blockRow2));
            Editable text = richTextCellCellAt != null ? richTextCellCellAt.getEditText().getText() : RichTextCell.readStyledText(blockRow2.block);
            int i3 = RichTextCell.$r8$clinit;
            pageBlock.text = RichTextStyle.fromSpannable(text);
            TL_iv.RichText richTextExtractCaption = RichTextCell.extractCaption(blockRow2.block);
            if (richTextExtractCaption != null && RichTextCell.extractCaption(pageBlock) != null) {
                if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                    ((TL_iv.pageBlockBlockquote) pageBlock).caption = richTextExtractCaption;
                } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                    ((TL_iv.pageBlockPullquote) pageBlock).caption = richTextExtractCaption;
                }
            }
        }
        transformRow(blockRow2, pageBlock, i, i2, z, z2);
    }

    public final void turnIntoKeepList(BlockRow blockRow, TL_iv.PageBlock pageBlock) {
        if (blockRow == null) {
            blockRow = turnIntoTarget();
        }
        BlockRow blockRow2 = blockRow;
        if (blockRow2 == null) {
            return;
        }
        turnInto(blockRow2, pageBlock, blockRow2.level, blockRow2.num, blockRow2.checkbox, blockRow2.checked);
    }

    public final void turnIntoList(BlockRow blockRow, int i) {
        if (blockRow == null) {
            blockRow = turnIntoTarget();
        }
        BlockRow blockRow2 = blockRow;
        if (blockRow2 == null) {
            return;
        }
        if (i == 0) {
            turnInto(blockRow2, blockRow2.block, 0, 0, false, false);
            return;
        }
        int iMax = Math.max(1, blockRow2.level);
        int iMax2 = i == 2 ? Math.max(1, blockRow2.num) : 0;
        boolean z = i == 3;
        TL_iv.PageBlock pageblockparagraph = blockRow2.block;
        if (!(pageblockparagraph instanceof TL_iv.pageBlockParagraph)) {
            pageblockparagraph = new TL_iv.pageBlockParagraph();
        }
        turnInto(blockRow2, pageblockparagraph, iMax, iMax2, z, z && blockRow2.checked);
    }

    public final BlockRow turnIntoTarget() {
        AnonymousClass1 anonymousClass1;
        int i;
        BlockRow blockRowFindFocusedRow = findFocusedRow();
        return (blockRowFindFocusedRow == null && (anonymousClass1 = this.textSelectionHelper) != null && anonymousClass1.isInSelectionMode() && (i = anonymousClass1.startViewPosition) == anonymousClass1.endViewPosition) ? rowForCell(i) : blockRowFindFocusedRow;
    }

    public final void updateCellSelectionDrag(float f, float f2) {
        TL_iv.pageTableCell pagetablecellFindCellAt;
        RichTableCell richTableCell = this.activeCellSelectionTable;
        if (!this.cellSelectionDragActive || richTableCell == null || this.pressTarget != richTableCell || (pagetablecellFindCellAt = richTableCell.findCellAt((int) ((f - richTableCell.getLeft()) - getLeft()), (int) ((f2 - richTableCell.getTop()) - getTop()))) == null || pagetablecellFindCellAt == this.cellSelectionDragEnd) {
            return;
        }
        this.cellSelectionDragEnd = pagetablecellFindCellAt;
        richTableCell.selectCellRectangle(this.cellSelectionDragAnchor, pagetablecellFindCellAt);
    }

    public final void updateLanguageOf(BlockRow blockRow, String str) {
        BlockRow blockRow2;
        if (blockRow != null) {
            TL_iv.PageBlock pageBlock = blockRow.block;
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                if (TextUtils.equals(pageblockpreformatted.language, str)) {
                    return;
                }
                RichEditorHistory richEditorHistory = this.history;
                if (richEditorHistory != null) {
                    AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
                    richEditorHistory.commit();
                }
                pageblockpreformatted.language = str;
                RichTextCell richTextCellCellAt = cellAt(this.rows.indexOf(blockRow));
                if (richTextCellCellAt != null && (blockRow2 = richTextCellCellAt.currentRow) != null) {
                    richTextCellCellAt.updateLanguageButton(blockRow2.block, true);
                    richTextCellCellAt.highlightedSnapshot = null;
                    richTextCellCellAt.scheduleHighlight();
                }
                RichEditorHistory richEditorHistory2 = this.history;
                if (richEditorHistory2 != null) {
                    richEditorHistory2.record();
                }
            }
        }
    }

    public final void writeSelectionToClipboard(CharSequence charSequence) {
        int i;
        int i2;
        int i3;
        ArrayList arrayList = this.rows;
        AnonymousClass1 anonymousClass1 = this.textSelectionHelper;
        int iIndexOf = arrayList.indexOf(rowForCell(anonymousClass1.startViewPosition));
        int iIndexOf2 = arrayList.indexOf(rowForCell(anonymousClass1.endViewPosition));
        int i4 = anonymousClass1.startViewOffset;
        int i5 = anonymousClass1.endViewOffset;
        String str = null;
        if (iIndexOf >= 0 && iIndexOf2 >= 0 && iIndexOf < arrayList.size() && iIndexOf2 < arrayList.size()) {
            if (iIndexOf > iIndexOf2) {
                i2 = i5;
                i = i4;
                i3 = iIndexOf2;
                iIndexOf2 = iIndexOf;
            } else {
                if (iIndexOf != iIndexOf2 || i4 <= i5) {
                    i = i5;
                    i2 = i4;
                } else {
                    i2 = i5;
                    i = i4;
                }
                i3 = iIndexOf;
            }
            try {
                HashMap map = this.quoteAuthors;
                StringBuilder sb = new StringBuilder();
                PhotoViewer.AnonymousClass49 anonymousClass49 = new PhotoViewer.AnonymousClass49();
                RichHtml.serializeRange(sb, arrayList, new int[]{i3}, iIndexOf2, i3, iIndexOf2, i2, i, anonymousClass49, false, 0, map);
                anonymousClass49.closeAll(sb);
                String string = sb.toString();
                if (!TextUtils.isEmpty(string)) {
                    RichMediaClipboard.set(collectMediaPhotos(i3, iIndexOf2), collectMediaDocuments(i3, iIndexOf2));
                    str = string;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        try {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                return;
            }
            clipboardManager.setPrimaryClip(str != null ? ClipData.newHtmlText("label", charSequence, str) : ClipData.newPlainText("label", charSequence));
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    public final void attachDocument(TLRPC.Document document, final String str) {
        if (document == null) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
            richEditorHistory.commit();
        }
        TL_iv.pageBlockDocument pageblockdocument = new TL_iv.pageBlockDocument();
        final BlockRow blockRow = new BlockRow(pageblockdocument, 0, 0);
        MediaUploadState mediaUploadState = new MediaUploadState();
        blockRow.media = mediaUploadState;
        mediaUploadState.isDocument = true;
        long j = document.id;
        boolean z = j == 0 || document.dc_id == 0 || document.access_hash == 0;
        if (z) {
            if (TextUtils.isEmpty(str) || !ArticleViewer.IBlock.CC.m(str)) {
                return;
            }
            MediaUploadState mediaUploadState2 = blockRow.media;
            mediaUploadState2.document = document;
            mediaUploadState2.localPath = str;
            mediaUploadState2.state = 1;
            mediaUploadState2.progress = 0.0f;
        } else {
            mediaUploadState.document = document;
            mediaUploadState.state = 2;
            pageblockdocument.document_id = j;
        }
        insertPreparedRow(blockRow);
        if (z) {
            final MediaUploadState mediaUploadState3 = blockRow.media;
            IdentityHashMap identityHashMap = this.uploaders;
            RichMediaUploader richMediaUploader = (RichMediaUploader) identityHashMap.remove(mediaUploadState3);
            if (richMediaUploader != null) {
                richMediaUploader.cancel();
            }
            RichMediaUploader richMediaUploader2 = new RichMediaUploader(this.currentAccount, str, document, (AnonymousClass16) new RichMediaUploader.Listener() {
                @Override
                public final void onAudioUploaded(TLRPC.Document document2) {
                }

                @Override
                public final void onDocumentUploaded(TLRPC.Document document2) {
                    String str2 = str;
                    document2.localPath = str2;
                    RichEditorListView richEditorListView = RichEditorListView.this;
                    FileLoader.getInstance(richEditorListView.currentAccount).setLocalPathTo(document2, str2);
                    MediaUploadState mediaUploadState4 = mediaUploadState3;
                    mediaUploadState4.document = document2;
                    mediaUploadState4.state = 2;
                    TL_iv.PageBlock pageBlock = blockRow.block;
                    if (pageBlock instanceof TL_iv.pageBlockDocument) {
                        ((TL_iv.pageBlockDocument) pageBlock).document_id = document2.id;
                    }
                    richEditorListView.uploaders.remove(mediaUploadState4);
                    richEditorListView.adapter.update(false);
                    richEditorListView.delegate.onContentChanged();
                }

                @Override
                public final void onError() {
                    MediaUploadState mediaUploadState4 = mediaUploadState3;
                    mediaUploadState4.state = 3;
                    RichEditorListView richEditorListView = RichEditorListView.this;
                    richEditorListView.uploaders.remove(mediaUploadState4);
                    richEditorListView.rows.remove(blockRow);
                    richEditorListView.adapter.update(true);
                    richEditorListView.delegate.onContentChanged();
                }

                @Override
                public final void onPhotoUploaded(TLRPC.Photo photo) {
                }

                @Override
                public final void onProgress(float f) {
                    mediaUploadState3.progress = f;
                    BlockRow blockRow2 = blockRow;
                    RichEditorListView richEditorListView = RichEditorListView.this;
                    View viewFindViewByItemObject = richEditorListView.findViewByItemObject(blockRow2);
                    if (viewFindViewByItemObject instanceof RichDocumentCell) {
                        RichDocumentCell richDocumentCell = (RichDocumentCell) viewFindViewByItemObject;
                        richDocumentCell.bindPreview(richDocumentCell.document());
                        richDocumentCell.rebuildLayouts();
                        richDocumentCell.updateButtonState(false);
                        richDocumentCell.requestLayout();
                        richDocumentCell.invalidate();
                    }
                    richEditorListView.delegate.onContentChanged();
                }

                @Override
                public final void onVideoUploaded(TLRPC.Document document2) {
                }

                @Override
                public final void onWidthHeightResolved(int i, int i2) {
                }
            });
            identityHashMap.put(mediaUploadState3, richMediaUploader2);
            richMediaUploader2.start();
        }
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        this.delegate.onContentChanged();
    }
}
