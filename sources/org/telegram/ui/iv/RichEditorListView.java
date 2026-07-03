package org.telegram.ui.iv;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.FloatingToolbar;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.iv.RichAudioCell;
import org.telegram.ui.iv.RichDetailsCell;
import org.telegram.ui.iv.RichDetailsEndCell;
import org.telegram.ui.iv.RichDividerCell;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.iv.RichEditorHistory;
import org.telegram.ui.iv.RichMapCell;
import org.telegram.ui.iv.RichMathCell;
import org.telegram.ui.iv.RichMediaCell;
import org.telegram.ui.iv.RichMediaConverter;
import org.telegram.ui.iv.RichMediaUploader;
import org.telegram.ui.iv.RichTableCell;
import org.telegram.ui.iv.RichTextCell;

public class RichEditorListView extends UniversalRecyclerView {
    RichTableCell activeCellSelectionTable;
    private boolean allowTapAboveContent;
    private final RichAudioCell.Delegate audioDelegate;
    private int bottomInset;
    private final RichTextCell.Delegate cellDelegate;
    private final RichTableCell.CellSelectionListener cellSelectionListener;
    private final IdentityHashMap converters;
    private int currentAccount;
    private Delegate delegate;
    private final RichDetailsCell.Delegate detailsDelegate;
    private final RichDividerCell.Delegate dividerDelegate;
    private int dotSelectedCol;
    private int dotSelectedRow;
    private boolean draggingOverTrash;
    private BlockRow draggingRow;
    private int emojiPadding;
    private RichEditText focusedEditText;
    RichEditorHistory history;
    private final RichEditorHistory.Delegate historyDelegate;
    private final ViewTreeObserver.OnGlobalFocusChangeListener imeFocusListener;
    private int imeInset;
    private ArrayList initialSelectionRows;
    final ArrayList itemRows;
    private int lastExternalImageId;
    private int lastListHeight;
    private long lastTapDownTime;
    private float lastTapDownX;
    private float lastTapDownY;
    TL_iv.RichMessage loadedRichMessage;
    private boolean longPressConsumed;
    private Runnable longPressRunnable;
    private final RichMapCell.Delegate mapDelegate;
    private final RichMathCell.Delegate mathDelegate;
    private final RichMediaCell.Delegate mediaDelegate;
    BlockRow pendingMediaRow;
    private boolean pendingTapDismiss;
    private float pendingTapRawX;
    private float pendingTapRawY;
    private boolean pressMoved;
    private View pressTarget;
    private float pressX;
    private float pressY;
    private Theme.ResourcesProvider resourcesProvider;
    private int restoreFocusCell;
    private int restoreFocusChildPosition;
    private int restoreFocusOffset;
    final ArrayList rows;
    private boolean suppressSpansChanged;
    private ItemOptions tableCellMenu;
    private final RichTableCell.Delegate tableDelegate;
    TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper;
    TextSelectionHelper.TextSelectionOverlay textSelectionOverlay;
    private final IdentityHashMap uploaders;

    public interface Delegate {
        void makeEditTextFocusable(RichEditText richEditText, boolean z);

        ItemOptions makeMenu(View view);

        void onContentChanged();

        void onHistoryChanged();

        void onListLayoutUpdated();

        void onListScrolled(int i);

        void onOpenAttachRequest(int i, int i2);

        void onOpenLocationRequest(BlockRow blockRow);

        void onReorderEnd();

        boolean onReorderMove(float f, float f2);

        void onReorderStart();

        void onSelectionChanged();

        void onSlashSuggest(RichTextCell richTextCell, String str);
    }

    public interface SelectionEdit {
        TL_iv.RichMessage extractRichMessage();

        void replaceWith(TL_iv.RichMessage richMessage);
    }

    private static int clearMaskFor(int i) {
        if (i == 4) {
            return 114971;
        }
        if (i == 16384) {
            return 32772;
        }
        return i == 32768 ? 16388 : 4;
    }

    private static boolean isArrowKey(int i) {
        return i == 21 || i == 22 || i == 19 || i == 20;
    }

    public RichEditorListView(Context context, int i, Theme.ResourcesProvider resourcesProvider, Delegate delegate) {
        this(context, i, resourcesProvider, delegate, new RichEditorListView[1]);
    }

    private RichEditorListView(Context context, int i, Theme.ResourcesProvider resourcesProvider, final Delegate delegate, final RichEditorListView[] richEditorListViewArr) {
        super(context, i, 0, false, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                RichEditorListView.lambda$new$0(richEditorListViewArr, (ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, new Utilities.Callback5() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                RichEditorListView.lambda$new$1(richEditorListViewArr, (UItem) obj, (View) obj2, (Integer) obj3, (Float) obj4, (Float) obj5);
            }
        }, null, resourcesProvider);
        this.rows = new ArrayList();
        this.restoreFocusCell = -1;
        this.restoreFocusOffset = -1;
        this.restoreFocusChildPosition = 0;
        this.imeFocusListener = new ViewTreeObserver.OnGlobalFocusChangeListener() {
            @Override
            public final void onGlobalFocusChanged(View view, View view2) {
                this.f$0.lambda$new$2(view, view2);
            }
        };
        this.allowTapAboveContent = true;
        this.dividerDelegate = new RichDividerCell.Delegate() {
            @Override
            public final TextSelectionHelper.ArticleTextSelectionHelper getSelectionHelper() {
                return this.f$0.getTextSelectionHelper();
            }
        };
        this.mediaDelegate = new RichMediaCell.Delegate() {
            @Override
            public void onRequestWindowFocusable(RichEditText richEditText, boolean z) {
                RichEditorListView.this.delegate.makeEditTextFocusable(richEditText, z);
            }

            @Override
            public void onMediaPick(BlockRow blockRow) {
                RichEditorListView richEditorListView = RichEditorListView.this;
                richEditorListView.pendingMediaRow = blockRow;
                richEditorListView.delegate.onOpenAttachRequest(74, 0);
            }

            @Override
            public void onAddMedia(BlockRow blockRow) {
                RichEditorListView richEditorListView = RichEditorListView.this;
                richEditorListView.pendingMediaRow = blockRow;
                richEditorListView.delegate.onOpenAttachRequest(74, 0);
            }

            @Override
            public void onSwitchMode(BlockRow blockRow) {
                RichEditorListView.this.switchGalleryMode(blockRow);
            }

            @Override
            public void onCancelUpload(BlockRow blockRow, MediaUploadState mediaUploadState) {
                RichEditorListView.this.cancelMediaUpload(blockRow, mediaUploadState);
            }

            @Override
            public void onDeleteMedia(BlockRow blockRow, MediaUploadState mediaUploadState) {
                RichEditorListView.this.cancelMediaUpload(blockRow, mediaUploadState);
            }

            @Override
            public TextSelectionHelper.ArticleTextSelectionHelper getSelectionHelper() {
                return RichEditorListView.this.getTextSelectionHelper();
            }

            @Override
            public void onCaptionWillChange(BlockRow blockRow, int i2, int i3) {
                RichEditorHistory richEditorHistory = RichEditorListView.this.history;
                if (richEditorHistory != null) {
                    richEditorHistory.onBeforeChange(i2, i3);
                }
            }

            @Override
            public void onCaptionChanged(BlockRow blockRow) {
                RichEditorHistory richEditorHistory = RichEditorListView.this.history;
                if (richEditorHistory != null) {
                    richEditorHistory.onTyping();
                }
                RichEditorListView.this.delegate.onContentChanged();
            }

            @Override
            public void onCaptionSpansChanged(BlockRow blockRow) {
                RichEditorListView.this.onCellSpansChanged();
            }

            @Override
            public void onCaptionEnter(BlockRow blockRow) {
                RichEditorListView.this.onCaptionEnter(blockRow);
            }

            @Override
            public void onCaptionLockedInsert(CharSequence charSequence) {
                if (charSequence == null || charSequence.length() <= 0) {
                    return;
                }
                RichEditorListView.this.replaceHelperSelectionWith(charSequence.toString());
            }

            @Override
            public boolean onCaptionSelectAll(BlockRow blockRow) {
                return RichEditorListView.this.tryEscalateSelectAll();
            }
        };
        this.audioDelegate = new RichAudioCell.Delegate() {
            @Override
            public void onRequestWindowFocusable(RichEditText richEditText, boolean z) {
                RichEditorListView.this.delegate.makeEditTextFocusable(richEditText, z);
            }

            @Override
            public void onCancelUpload(BlockRow blockRow) {
                RichEditorListView.this.cancelAudioUpload(blockRow);
            }

            @Override
            public TextSelectionHelper.ArticleTextSelectionHelper getSelectionHelper() {
                return RichEditorListView.this.getTextSelectionHelper();
            }

            @Override
            public void onCaptionWillChange(BlockRow blockRow, int i2, int i3) {
                RichEditorHistory richEditorHistory = RichEditorListView.this.history;
                if (richEditorHistory != null) {
                    richEditorHistory.onBeforeChange(i2, i3);
                }
            }

            @Override
            public void onCaptionChanged(BlockRow blockRow) {
                RichEditorHistory richEditorHistory = RichEditorListView.this.history;
                if (richEditorHistory != null) {
                    richEditorHistory.onTyping();
                }
                RichEditorListView.this.delegate.onContentChanged();
            }

            @Override
            public void onCaptionSpansChanged(BlockRow blockRow) {
                RichEditorListView.this.onCellSpansChanged();
            }

            @Override
            public void onCaptionEnter(BlockRow blockRow) {
                RichEditorListView.this.onCaptionEnter(blockRow);
            }

            @Override
            public void onCaptionLockedInsert(CharSequence charSequence) {
                if (charSequence == null || charSequence.length() <= 0) {
                    return;
                }
                RichEditorListView.this.replaceHelperSelectionWith(charSequence.toString());
            }

            @Override
            public boolean onCaptionSelectAll(BlockRow blockRow) {
                return RichEditorListView.this.tryEscalateSelectAll();
            }
        };
        this.uploaders = new IdentityHashMap();
        this.converters = new IdentityHashMap();
        this.mapDelegate = new RichMapCell.Delegate() {
            @Override
            public void onRequestWindowFocusable(RichEditText richEditText, boolean z) {
                RichEditorListView.this.delegate.makeEditTextFocusable(richEditText, z);
            }

            @Override
            public void onPickLocation(BlockRow blockRow) {
                RichEditorListView.this.delegate.onOpenLocationRequest(blockRow);
            }

            @Override
            public TextSelectionHelper.ArticleTextSelectionHelper getSelectionHelper() {
                return RichEditorListView.this.getTextSelectionHelper();
            }

            @Override
            public void onCaptionWillChange(BlockRow blockRow, int i2, int i3) {
                RichEditorHistory richEditorHistory = RichEditorListView.this.history;
                if (richEditorHistory != null) {
                    richEditorHistory.onBeforeChange(i2, i3);
                }
            }

            @Override
            public void onCaptionChanged(BlockRow blockRow) {
                RichEditorHistory richEditorHistory = RichEditorListView.this.history;
                if (richEditorHistory != null) {
                    richEditorHistory.onTyping();
                }
                RichEditorListView.this.delegate.onContentChanged();
            }

            @Override
            public void onCaptionSpansChanged(BlockRow blockRow) {
                RichEditorListView.this.onCellSpansChanged();
            }

            @Override
            public void onCaptionEnter(BlockRow blockRow) {
                RichEditorListView.this.onCaptionEnter(blockRow);
            }

            @Override
            public void onCaptionLockedInsert(CharSequence charSequence) {
                if (charSequence == null || charSequence.length() <= 0) {
                    return;
                }
                RichEditorListView.this.replaceHelperSelectionWith(charSequence.toString());
            }

            @Override
            public boolean onCaptionSelectAll(BlockRow blockRow) {
                return RichEditorListView.this.tryEscalateSelectAll();
            }
        };
        this.mathDelegate = new RichMathCell.Delegate() {
            @Override
            public TextSelectionHelper.ArticleTextSelectionHelper getSelectionHelper() {
                return RichEditorListView.this.getTextSelectionHelper();
            }
        };
        this.tableDelegate = new RichTableCell.Delegate() {
            @Override
            public void onRequestWindowFocusable(RichEditText richEditText, boolean z) {
                RichEditorListView.this.delegate.makeEditTextFocusable(richEditText, z);
            }

            @Override
            public void onTextChanged(BlockRow blockRow) {
                RichEditorHistory richEditorHistory = RichEditorListView.this.history;
                if (richEditorHistory != null) {
                    richEditorHistory.onTyping();
                }
                RichEditorListView.this.delegate.onContentChanged();
            }

            @Override
            public void onTextWillChange(BlockRow blockRow, int i2, int i3) {
                RichEditorHistory richEditorHistory = RichEditorListView.this.history;
                if (richEditorHistory != null) {
                    richEditorHistory.onBeforeChange(i2, i3);
                }
            }

            @Override
            public void onSpansChanged(BlockRow blockRow) {
                RichEditorListView.this.onCellSpansChanged();
            }

            @Override
            public TextSelectionHelper.ArticleTextSelectionHelper getSelectionHelper() {
                return RichEditorListView.this.getTextSelectionHelper();
            }

            @Override
            public void onLockedInsert(CharSequence charSequence) {
                if (charSequence == null || charSequence.length() <= 0) {
                    return;
                }
                RichEditorListView.this.replaceHelperSelectionWith(charSequence.toString());
            }

            @Override
            public boolean onSelectAll(BlockRow blockRow) {
                return RichEditorListView.this.tryEscalateSelectAll();
            }
        };
        this.detailsDelegate = new RichDetailsCell.Delegate() {
            @Override
            public void onRequestWindowFocusable(RichEditText richEditText, boolean z) {
                RichEditorListView.this.delegate.makeEditTextFocusable(richEditText, z);
            }

            @Override
            public void onToggle(BlockRow blockRow) {
                RichEditorListView.this.toggleDetails(blockRow);
            }

            @Override
            public void onTitleChanged(BlockRow blockRow) {
                RichEditorHistory richEditorHistory = RichEditorListView.this.history;
                if (richEditorHistory != null) {
                    richEditorHistory.onTyping();
                }
                RichEditorListView.this.delegate.onContentChanged();
            }

            @Override
            public void onTitleEnter(BlockRow blockRow) {
                RichEditorListView.this.onDetailsTitleEnter(blockRow);
            }

            @Override
            public void onTitleBackspace(BlockRow blockRow) {
                RichEditorListView.this.deleteDetails(blockRow);
            }

            @Override
            public void onSpansChanged(BlockRow blockRow) {
                RichEditorListView.this.onCellSpansChanged();
            }

            @Override
            public void onLockedInsert(CharSequence charSequence) {
                if (charSequence == null || charSequence.length() <= 0) {
                    return;
                }
                RichEditorListView.this.replaceHelperSelectionWith(charSequence.toString());
            }

            @Override
            public boolean onSelectAll(BlockRow blockRow) {
                return RichEditorListView.this.tryEscalateSelectAll();
            }

            @Override
            public TextSelectionHelper.ArticleTextSelectionHelper getSelectionHelper() {
                return RichEditorListView.this.getTextSelectionHelper();
            }
        };
        this.dotSelectedRow = -1;
        this.dotSelectedCol = -1;
        this.cellSelectionListener = new RichTableCell.CellSelectionListener() {
            @Override
            public final void onCellSelectionChanged(RichTableCell richTableCell) {
                this.f$0.lambda$new$17(richTableCell);
            }
        };
        this.cellDelegate = new RichTextCell.Delegate() {
            @Override
            public void onRequestWindowFocusable(RichEditText richEditText, boolean z) {
                RichEditorListView.this.delegate.makeEditTextFocusable(richEditText, z);
            }

            @Override
            public void onEnter(BlockRow blockRow) {
                RichEditorListView.this.onCellEnter(blockRow);
            }

            @Override
            public void onQuoteAuthorEnter(BlockRow blockRow) {
                RichEditorListView.this.onCaptionEnter(blockRow);
            }

            @Override
            public void onBackspace(BlockRow blockRow) {
                RichEditorListView.this.onCellBackspaceAtStart(blockRow, true);
            }

            @Override
            public boolean onBackspaceAtStart(BlockRow blockRow) {
                return RichEditorListView.this.onCellBackspaceAtStart(blockRow, false);
            }

            @Override
            public void onTextChanged(BlockRow blockRow) {
                RichEditorHistory richEditorHistory = RichEditorListView.this.history;
                if (richEditorHistory != null) {
                    richEditorHistory.onTyping();
                }
                RichEditorListView.this.delegate.onContentChanged();
            }

            @Override
            public void onTextWillChange(BlockRow blockRow, int i2, int i3) {
                RichEditorHistory richEditorHistory = RichEditorListView.this.history;
                if (richEditorHistory != null) {
                    richEditorHistory.onBeforeChange(i2, i3);
                }
            }

            @Override
            public void onTransform(BlockRow blockRow, TL_iv.PageBlock pageBlock, int i2, int i3, boolean z, boolean z2) {
                RichEditorListView.this.transformRow(blockRow, pageBlock, i2, i3, z, z2);
            }

            @Override
            public void onCheckboxToggle(BlockRow blockRow, boolean z) {
                RichEditorListView.this.onChecklistToggle(blockRow, z);
            }

            @Override
            public void onSpansChanged(BlockRow blockRow) {
                RichEditorListView.this.onCellSpansChanged();
            }

            @Override
            public TextSelectionHelper.ArticleTextSelectionHelper getSelectionHelper() {
                return RichEditorListView.this.getTextSelectionHelper();
            }

            @Override
            public boolean onIndent(BlockRow blockRow, boolean z) {
                return RichEditorListView.this.onCellIndent(blockRow, z);
            }

            @Override
            public void onLockedInsert(CharSequence charSequence) {
                if (charSequence == null || charSequence.length() <= 0) {
                    return;
                }
                RichEditorListView.this.replaceHelperSelectionWith(charSequence.toString());
            }

            @Override
            public void onLanguageClick(BlockRow blockRow, View view) {
                RichEditorListView.this.onLanguageClick(blockRow, view);
            }

            @Override
            public boolean onSelectAll(BlockRow blockRow) {
                return RichEditorListView.this.tryEscalateSelectAll();
            }

            @Override
            public boolean onPaste(BlockRow blockRow, RichEditText richEditText) {
                return RichEditorListView.this.onCellPaste(blockRow, richEditText);
            }

            @Override
            public void onCommand(BlockRow blockRow, int i2) {
                RichEditorListView.this.handleSlashCommand(blockRow, i2);
            }

            @Override
            public void onSlashSuggest(RichTextCell richTextCell, String str) {
                RichEditorListView.this.delegate.onSlashSuggest(richTextCell, str);
            }
        };
        RichEditorHistory.Delegate delegate2 = new RichEditorHistory.Delegate() {
            @Override
            public ArrayList getRows() {
                return RichEditorListView.this.rows;
            }

            @Override
            public void restoreRows(List list, RichEditorHistory.FocusState focusState) {
                RichEditorListView.this.restoreFromHistory(list, focusState);
            }

            @Override
            public void onHistoryChanged() {
                RichEditorListView.this.delegate.onHistoryChanged();
            }

            @Override
            public RichEditorHistory.FocusState captureFocus() {
                return RichEditorListView.this.captureFocusState();
            }
        };
        this.historyDelegate = delegate2;
        this.itemRows = new ArrayList();
        this.lastExternalImageId = -1;
        richEditorListViewArr[0] = this;
        this.currentAccount = i;
        this.resourcesProvider = resourcesProvider;
        this.delegate = delegate;
        this.adapter.setApplyBackground(false);
        setClipToPadding(false);
        setClipChildren(false);
        listenReorder(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.onRowsReordered(((Integer) obj).intValue(), (ArrayList) obj2);
            }
        });
        setReorderLongPressEnabled(false);
        allowReorder(true);
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = new TextSelectionHelper.ArticleTextSelectionHelper() {
            @Override
            protected boolean canCut() {
                return true;
            }

            @Override
            protected boolean canPaste() {
                return true;
            }

            @Override
            protected void onOffsetChanged() {
                super.onOffsetChanged();
                delegate.onSelectionChanged();
            }

            @Override
            protected boolean forceShowSelectAll() {
                return !RichEditorListView.this.isWholeDocumentSelected();
            }

            @Override
            protected boolean onSelectAllOverride() {
                if (expandSelectionToWholeCurrentBlock()) {
                    return true;
                }
                return RichEditorListView.this.tryEscalateSelectAll();
            }

            @Override
            public int getParentTopPadding() {
                return RichEditorListView.this.getPaddingTop();
            }

            @Override
            public int getParentBottomPadding() {
                return RichEditorListView.this.getPaddingBottom();
            }

            @Override
            protected boolean onCopyOverride() {
                RichEditorListView.this.copyHelperSelection();
                return true;
            }

            @Override
            protected void onCutAction() {
                RichEditorListView.this.cutHelperSelection();
            }

            @Override
            protected void onPasteAction() {
                RichEditorListView.this.pasteAtHelperSelection();
            }

            @Override
            protected void onTapToDismiss(float f, float f2) {
                RichEditorListView.this.pendingTapDismiss = true;
                RichEditorListView.this.pendingTapRawX = f;
                RichEditorListView.this.pendingTapRawY = f2;
            }
        };
        this.textSelectionHelper = articleTextSelectionHelper;
        articleTextSelectionHelper.setParentView(this);
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper2 = this.textSelectionHelper;
        articleTextSelectionHelper2.layoutManager = this.layoutManager;
        TextSelectionHelper.TextSelectionOverlay overlayView = articleTextSelectionHelper2.getOverlayView(context);
        this.textSelectionOverlay = overlayView;
        AndroidUtilities.removeFromParent(overlayView);
        this.textSelectionHelper.setCallback(new AnonymousClass2(delegate));
        addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                Delegate delegate3 = delegate;
                if (delegate3 != null) {
                    delegate3.onListScrolled(i3);
                }
                RichEditorListView.this.textSelectionHelper.onParentScrolled();
                RichEditorListView.this.hideKeyboardIfFocusScrolledAway();
            }

            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i2) {
                if (i2 == 0) {
                    RichEditorListView.this.textSelectionHelper.stopScrolling();
                }
            }
        });
        this.history = new RichEditorHistory(delegate2);
    }

    public static void lambda$new$0(RichEditorListView[] richEditorListViewArr, ArrayList arrayList, UniversalAdapter universalAdapter) {
        RichEditorListView richEditorListView = richEditorListViewArr[0];
        if (richEditorListView != null) {
            richEditorListView.fillItems(arrayList, universalAdapter);
        }
    }

    public static void lambda$new$1(RichEditorListView[] richEditorListViewArr, UItem uItem, View view, Integer num, Float f, Float f2) {
        RichEditorListView richEditorListView = richEditorListViewArr[0];
        if (richEditorListView != null) {
            richEditorListView.onItemClick(uItem, view, num.intValue(), f.floatValue(), f2.floatValue());
        }
    }

    class AnonymousClass2 extends TextSelectionHelper.Callback {
        final Delegate val$delegate;

        AnonymousClass2(Delegate delegate) {
            this.val$delegate = delegate;
        }

        @Override
        public void onStateChanged(boolean z) {
            this.val$delegate.onSelectionChanged();
            if (!z) {
                final int i = RichEditorListView.this.restoreFocusCell;
                final int i2 = RichEditorListView.this.restoreFocusOffset;
                final int i3 = RichEditorListView.this.restoreFocusChildPosition;
                RichEditorListView.this.restoreFocusCell = -1;
                RichEditorListView.this.restoreFocusOffset = -1;
                RichEditorListView.this.restoreFocusChildPosition = 0;
                boolean z2 = RichEditorListView.this.pendingTapDismiss;
                final float f = RichEditorListView.this.pendingTapRawX;
                final float f2 = RichEditorListView.this.pendingTapRawY;
                RichEditorListView.this.pendingTapDismiss = false;
                RichEditorListView.this.setEditTextsLocked(false);
                RichEditorListView.this.finishEditTextActionModes();
                if (z2) {
                    RichEditorListView.this.post(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$onStateChanged$0(f, f2, i, i3, i2);
                        }
                    });
                    return;
                }
                if (i >= 0) {
                    RichEditorListView.this.post(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$onStateChanged$1(i, i3, i2);
                        }
                    });
                    return;
                }
                View viewFindFocus = RichEditorListView.this.findFocus();
                if (viewFindFocus instanceof RichEditText) {
                    RichEditorListView richEditorListView = RichEditorListView.this;
                    final RichEditText richEditText = (RichEditText) viewFindFocus;
                    Objects.requireNonNull(richEditText);
                    richEditorListView.post(new Runnable() {
                        @Override
                        public final void run() {
                            richEditText.requestEditFocusRebuild();
                        }
                    });
                    return;
                }
                return;
            }
            RichEditorListView richEditorListView2 = RichEditorListView.this;
            richEditorListView2.restoreFocusCell = richEditorListView2.textSelectionHelper.getAnchorCell();
            RichEditorListView richEditorListView3 = RichEditorListView.this;
            richEditorListView3.restoreFocusOffset = richEditorListView3.textSelectionHelper.getAnchorOffset();
            RichEditorListView richEditorListView4 = RichEditorListView.this;
            richEditorListView4.restoreFocusChildPosition = richEditorListView4.textSelectionHelper.getAnchorChildPosition();
            RichEditorListView.this.setEditTextsLocked(true);
            RichEditorListView.this.hideEditTextActionModes();
            RichEditorListView.this.finishEditTextActionModes();
        }

        public void lambda$onStateChanged$0(float f, float f2, int i, int i2, int i3) {
            if (RichEditorListView.this.restoreFocusAtScreenPoint(f, f2) || i < 0) {
                return;
            }
            RichEditorListView.this.restoreFocusAt(i, i2, i3);
        }

        public void lambda$onStateChanged$1(int i, int i2, int i3) {
            RichEditorListView.this.restoreFocusAt(i, i2, i3);
        }
    }

    private boolean isInList(View view) {
        return (view == null || findContainingItemView(view) == null) ? false : true;
    }

    public void lambda$new$2(View view, View view2) {
        doNotDetachViews(isInList(view2));
        if (view2 instanceof RichEditText) {
            this.focusedEditText = (RichEditText) view2;
        }
    }

    public void hideKeyboardIfFocusScrolledAway() {
        RichEditText richEditText = this.focusedEditText;
        if (richEditText == null) {
            return;
        }
        View viewFindContainingItemView = findContainingItemView(richEditText);
        if (viewFindContainingItemView == null || viewFindContainingItemView.getBottom() <= 0 || viewFindContainingItemView.getTop() >= getHeight()) {
            this.focusedEditText = null;
            richEditText.clearFocus();
            AndroidUtilities.hideKeyboard(this);
        }
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i4 - i2;
        int i6 = this.lastListHeight;
        if (i6 > 0 && i5 < i6) {
            View viewFindFocus = findFocus();
            View viewFindContainingItemView = viewFindFocus == null ? null : findContainingItemView(viewFindFocus);
            if (viewFindContainingItemView != null) {
                int childAdapterPosition = getChildAdapterPosition(viewFindContainingItemView);
                int bottom = (viewFindContainingItemView.getBottom() + AndroidUtilities.dp(8.0f)) - (i5 - getPaddingBottom());
                if (childAdapterPosition != -1 && bottom > 0) {
                    this.layoutManager.scrollToPositionWithOffset(childAdapterPosition, viewFindContainingItemView.getTop() - bottom);
                }
            }
        }
        super.onLayout(z, i, i2, i3, i4);
        this.lastListHeight = i5;
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.imeFocusListener);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.imeFocusListener);
        doNotDetachViews(false);
    }

    public View getOverlayView() {
        return this.textSelectionOverlay;
    }

    @Override
    protected void onLayoutUpdate() {
        super.onLayoutUpdate();
        Delegate delegate = this.delegate;
        if (delegate != null) {
            delegate.onListLayoutUpdated();
        }
    }

    public void seedEmptyArticle() {
        this.rows.clear();
        this.rows.add(new BlockRow(new TL_iv.pageBlockHeading1()));
        this.rows.add(new BlockRow(new TL_iv.pageBlockParagraph()));
        this.adapter.update(false);
    }

    public void clearContent() {
        destroy();
        this.loadedRichMessage = null;
        this.pendingMediaRow = null;
        this.history = new RichEditorHistory(this.historyDelegate);
        seedEmptyArticle();
        Delegate delegate = this.delegate;
        if (delegate != null) {
            delegate.onHistoryChanged();
        }
    }

    public void undo() {
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.undo();
        }
    }

    public void redo() {
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.redo();
        }
    }

    public boolean canUndo() {
        RichEditorHistory richEditorHistory = this.history;
        return richEditorHistory != null && richEditorHistory.canUndo();
    }

    public boolean canRedo() {
        RichEditorHistory richEditorHistory = this.history;
        return richEditorHistory != null && richEditorHistory.canRedo();
    }

    public boolean isInSelectionMode() {
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
        return articleTextSelectionHelper != null && articleTextSelectionHelper.isInSelectionMode();
    }

    private ArrayList splitToLines(CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (charSequence.charAt(i2) == '\n') {
                arrayList.add(charSequence.subSequence(i, i2));
                i = i2 + 1;
            }
        }
        if (i <= charSequence.length()) {
            arrayList.add(charSequence.subSequence(i, charSequence.length()));
        }
        return arrayList;
    }

    public void setInitialText(CharSequence charSequence) {
        if (charSequence == null) {
            return;
        }
        this.initialSelectionRows = new ArrayList();
        Iterator it = splitToLines(charSequence).iterator();
        while (it.hasNext()) {
            CharSequence charSequence2 = (CharSequence) it.next();
            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = RichTextStyle.fromSpannable(charSequence2);
            BlockRow blockRow = new BlockRow(pageblockparagraph);
            this.rows.add(blockRow);
            this.initialSelectionRows.add(blockRow);
        }
        this.adapter.update(false);
    }

    private int[] mapInitialOffset(int i) {
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

    public void applyInitialSelection(final int i, final int i2) {
        if (lambda$applyInitialSelection$3(i, i2)) {
            return;
        }
        post(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$applyInitialSelection$3(i, i2);
            }
        });
    }

    public boolean lambda$applyInitialSelection$3(int i, int i2) {
        ArrayList arrayList = this.initialSelectionRows;
        if (arrayList != null && !arrayList.isEmpty()) {
            int iMax = Math.max(0, Math.min(i, i2));
            int iMax2 = Math.max(0, Math.max(i, i2));
            int[] iArrMapInitialOffset = mapInitialOffset(iMax);
            int[] iArrMapInitialOffset2 = mapInitialOffset(iMax2);
            BlockRow blockRow = (BlockRow) this.initialSelectionRows.get(iArrMapInitialOffset[0]);
            if (iArrMapInitialOffset[0] == iArrMapInitialOffset2[0] || iMax == iMax2) {
                View viewFindViewByItemObject = findViewByItemObject(blockRow);
                if (!(viewFindViewByItemObject instanceof RichTextCell)) {
                    return false;
                }
                RichTextCell richTextCell = (RichTextCell) viewFindViewByItemObject;
                richTextCell.requestEditFocus();
                RichEditText editText = richTextCell.getEditText();
                int length = editText.length();
                editText.setSelection(Math.min(iArrMapInitialOffset[1], length), Math.min(iArrMapInitialOffset2[1], length));
            } else {
                View viewFindViewByItemObject2 = findViewByItemObject(blockRow);
                View viewFindViewByItemObject3 = findViewByItemObject(this.initialSelectionRows.get(iArrMapInitialOffset2[0]));
                if (!(viewFindViewByItemObject2 instanceof RichTextCell) || !(viewFindViewByItemObject3 instanceof RichTextCell)) {
                    return false;
                }
                for (int i3 = 0; i3 < this.rows.size(); i3++) {
                    this.textSelectionHelper.cacheText(i3, RichTextCell.readPlainText(((BlockRow) this.rows.get(i3)).block), null);
                }
                RichTextCell richTextCell2 = (RichTextCell) viewFindViewByItemObject2;
                int length2 = richTextCell2.getEditText().length();
                if (iArrMapInitialOffset[1] >= length2) {
                    length2 = Math.max(0, length2 - 1);
                }
                if (!this.textSelectionHelper.selectRangeOf(richTextCell2, iArrMapInitialOffset[1], length2)) {
                    richTextCell2.requestEditFocus();
                    return true;
                }
                this.textSelectionHelper.extendSelectionTo((RichTextCell) viewFindViewByItemObject3, iArrMapInitialOffset2[1]);
                return true;
            }
        }
        return true;
    }

    public void loadRichMessage(TL_iv.RichMessage richMessage) {
        if (richMessage == null) {
            return;
        }
        this.loadedRichMessage = richMessage;
        flattenBlocks(this.rows, richMessage.blocks);
        for (int i = 0; i < this.rows.size(); i++) {
            resolveLoadedMedia((BlockRow) this.rows.get(i));
        }
        this.adapter.update(false);
    }

    public void addRichMessage(TL_iv.RichMessage richMessage) {
        ArrayList<TL_iv.PageBlock> arrayList;
        int iIndexOf;
        if (richMessage == null || (arrayList = richMessage.blocks) == null || arrayList.isEmpty()) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
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
        flattenBlocks(arrayList4, richMessage.blocks);
        if (arrayList4.isEmpty()) {
            return;
        }
        for (int i = 0; i < arrayList4.size(); i++) {
            resolveLoadedMedia((BlockRow) arrayList4.get(i));
        }
        int size = this.rows.size();
        BlockRow blockRowFindFocusedRow = findFocusedRow();
        if (blockRowFindFocusedRow != null && (iIndexOf = this.rows.indexOf(blockRowFindFocusedRow)) >= 0) {
            TL_iv.PageBlock pageBlock = blockRowFindFocusedRow.block;
            if ((pageBlock instanceof TL_iv.pageBlockParagraph) && RichTextCell.readPlainText(pageBlock).isEmpty()) {
                this.rows.remove(iIndexOf);
                size = iIndexOf;
            } else {
                size = iIndexOf + 1;
            }
        }
        this.rows.addAll(size, arrayList4);
        renumberAllRuns();
        this.adapter.update(false);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
    }

    public void destroy() {
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
        if (articleTextSelectionHelper != null) {
            articleTextSelectionHelper.clear(true);
        }
        exitCellSelectionMode();
        hideEditTextActionModes();
        Iterator it = this.uploaders.values().iterator();
        while (it.hasNext()) {
            ((RichMediaUploader) it.next()).cancel();
        }
        this.uploaders.clear();
        Iterator it2 = this.converters.values().iterator();
        while (it2.hasNext()) {
            ((RichMediaConverter) it2.next()).cancel();
        }
        this.converters.clear();
    }

    private TLRPC.Document findLoadedDocument(long j) {
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document;
        if (j == 0) {
            return null;
        }
        for (int i = 0; i < this.rows.size(); i++) {
            for (MediaUploadState mediaUploadState : mediasOf((BlockRow) this.rows.get(i))) {
                if (mediaUploadState != null && (document = mediaUploadState.document) != null && document.id == j) {
                    return document;
                }
            }
        }
        TL_iv.RichMessage richMessage = this.loadedRichMessage;
        if (richMessage != null && (arrayList = richMessage.documents) != null) {
            Iterator<TLRPC.Document> it = arrayList.iterator();
            while (it.hasNext()) {
                TLRPC.Document next = it.next();
                if (next != null && next.id == j) {
                    return next;
                }
            }
        }
        return null;
    }

    private TLRPC.Photo findLoadedPhoto(long j) {
        ArrayList<TLRPC.Photo> arrayList;
        TLRPC.Photo photo;
        if (j == 0) {
            return null;
        }
        for (int i = 0; i < this.rows.size(); i++) {
            for (MediaUploadState mediaUploadState : mediasOf((BlockRow) this.rows.get(i))) {
                if (mediaUploadState != null && (photo = mediaUploadState.photo) != null && photo.id == j) {
                    return photo;
                }
            }
        }
        TL_iv.RichMessage richMessage = this.loadedRichMessage;
        if (richMessage != null && (arrayList = richMessage.photos) != null) {
            Iterator<TLRPC.Photo> it = arrayList.iterator();
            while (it.hasNext()) {
                TLRPC.Photo next = it.next();
                if (next != null && next.id == j) {
                    return next;
                }
            }
        }
        return null;
    }

    public void resolveLoadedMedia(BlockRow blockRow) {
        TL_iv.PageBlock pageBlock;
        if (this.loadedRichMessage == null || blockRow == null || (pageBlock = blockRow.block) == null) {
            return;
        }
        if (isGallery(pageBlock)) {
            ArrayList arrayListGalleryItems = galleryItems(blockRow.block);
            blockRow.medias = new ArrayList();
            if (arrayListGalleryItems != null) {
                for (int i = 0; i < arrayListGalleryItems.size(); i++) {
                    MediaUploadState mediaUploadStateResolveBlockMedia = resolveBlockMedia((TL_iv.PageBlock) arrayListGalleryItems.get(i));
                    ArrayList arrayList = blockRow.medias;
                    if (mediaUploadStateResolveBlockMedia == null) {
                        mediaUploadStateResolveBlockMedia = new MediaUploadState();
                    }
                    arrayList.add(mediaUploadStateResolveBlockMedia);
                }
                return;
            }
            return;
        }
        MediaUploadState mediaUploadStateResolveBlockMedia2 = resolveBlockMedia(blockRow.block);
        if (mediaUploadStateResolveBlockMedia2 != null) {
            blockRow.media = mediaUploadStateResolveBlockMedia2;
        }
    }

    private MediaUploadState resolveBlockMedia(TL_iv.PageBlock pageBlock) {
        TLRPC.Photo photoFindLoadedPhoto;
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
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            TLRPC.Document documentFindLoadedDocument2 = findLoadedDocument(((TL_iv.pageBlockVideo) pageBlock).video_id);
            if (documentFindLoadedDocument2 == null) {
                return null;
            }
            MediaUploadState mediaUploadState2 = new MediaUploadState();
            mediaUploadState2.isVideo = true;
            mediaUploadState2.state = 2;
            mediaUploadState2.document = documentFindLoadedDocument2;
            int i = 0;
            while (true) {
                if (i >= documentFindLoadedDocument2.attributes.size()) {
                    break;
                }
                if (documentFindLoadedDocument2.attributes.get(i) instanceof TLRPC.TL_documentAttributeVideo) {
                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) documentFindLoadedDocument2.attributes.get(i);
                    mediaUploadState2.width = tL_documentAttributeVideo.w;
                    mediaUploadState2.height = tL_documentAttributeVideo.h;
                    mediaUploadState2.duration = (int) tL_documentAttributeVideo.duration;
                    break;
                }
                i++;
            }
            return mediaUploadState2;
        }
        if (!(pageBlock instanceof TL_iv.pageBlockPhoto) || (photoFindLoadedPhoto = findLoadedPhoto(((TL_iv.pageBlockPhoto) pageBlock).photo_id)) == null) {
            return null;
        }
        MediaUploadState mediaUploadState3 = new MediaUploadState();
        mediaUploadState3.state = 2;
        mediaUploadState3.photo = photoFindLoadedPhoto;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photoFindLoadedPhoto.sizes, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize != null) {
            mediaUploadState3.width = closestPhotoSizeWithSize.w;
            mediaUploadState3.height = closestPhotoSizeWithSize.h;
        }
        return mediaUploadState3;
    }

    private List resolvePastedMedia(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BlockRow blockRow = (BlockRow) it.next();
            if (isGallery(blockRow.block)) {
                ArrayList arrayListGalleryItems = galleryItems(blockRow.block);
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                if (arrayListGalleryItems != null) {
                    Iterator it2 = arrayListGalleryItems.iterator();
                    while (it2.hasNext()) {
                        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) it2.next();
                        MediaUploadState mediaUploadStateResolveBlockMedia = resolveBlockMedia(pageBlock);
                        if (mediaUploadStateResolveBlockMedia != null) {
                            arrayList2.add(pageBlock);
                            arrayList3.add(mediaUploadStateResolveBlockMedia);
                        }
                    }
                    arrayListGalleryItems.clear();
                    arrayListGalleryItems.addAll(arrayList2);
                }
                if (!arrayList3.isEmpty()) {
                    blockRow.medias = arrayList3;
                    arrayList.add(blockRow);
                }
            } else {
                TL_iv.PageBlock pageBlock2 = blockRow.block;
                if ((pageBlock2 instanceof TL_iv.pageBlockPhoto) || (pageBlock2 instanceof TL_iv.pageBlockVideo) || (pageBlock2 instanceof TL_iv.pageBlockAudio)) {
                    MediaUploadState mediaUploadStateResolveBlockMedia2 = resolveBlockMedia(pageBlock2);
                    if (mediaUploadStateResolveBlockMedia2 != null) {
                        blockRow.media = mediaUploadStateResolveBlockMedia2;
                        arrayList.add(blockRow);
                    }
                } else {
                    arrayList.add(blockRow);
                }
            }
        }
        return arrayList;
    }

    static void flattenBlocks(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            return;
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) it.next();
            if ((pageBlock instanceof TL_iv.pageBlockList) || (pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                expandListBlock(arrayList, pageBlock, 1);
            } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                flattenDetails(arrayList, (TL_iv.pageBlockDetails) pageBlock);
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                arrayList.add(new BlockRow(blockquoteFromBlocks((TL_iv.pageBlockBlockquoteBlocks) pageBlock)));
            } else {
                arrayList.add(new BlockRow(pageBlock));
            }
        }
    }

    private static TL_iv.pageBlockBlockquote blockquoteFromBlocks(TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks) {
        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
        ArrayList arrayList = new ArrayList();
        ArrayList<TL_iv.PageBlock> arrayList2 = pageblockblockquoteblocks.blocks;
        if (arrayList2 != null) {
            Iterator<TL_iv.PageBlock> it = arrayList2.iterator();
            while (it.hasNext()) {
                appendQuoteLines(it.next(), arrayList);
            }
        }
        pageblockblockquote.text = joinRichLines(arrayList);
        TL_iv.RichText textempty = pageblockblockquoteblocks.caption;
        if (textempty == null) {
            textempty = new TL_iv.textEmpty();
        }
        pageblockblockquote.caption = textempty;
        return pageblockblockquote;
    }

    private static void appendQuoteLines(TL_iv.PageBlock pageBlock, ArrayList arrayList) {
        TL_iv.RichText richTextOrderedItemText;
        TL_iv.RichText richTextListItemText;
        if (pageBlock == null) {
            return;
        }
        if (isHeading(pageBlock)) {
            TL_iv.textBold textbold = new TL_iv.textBold();
            textbold.text = textOrEmpty(pageBlock.text);
            arrayList.add(textbold);
            return;
        }
        if ((pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockFooter)) {
            arrayList.add(textOrEmpty(pageBlock.text));
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockList) {
            Iterator<TL_iv.PageListItem> it = ((TL_iv.pageBlockList) pageBlock).items.iterator();
            while (it.hasNext()) {
                TL_iv.PageListItem next = it.next();
                if (!next.checkbox && (richTextListItemText = listItemText(next)) != null) {
                    arrayList.add(prefixedLine("-  ", richTextListItemText));
                }
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
            Iterator<TL_iv.PageListOrderedItem> it2 = ((TL_iv.pageBlockOrderedList) pageBlock).items.iterator();
            int i = 1;
            while (it2.hasNext()) {
                TL_iv.PageListOrderedItem next2 = it2.next();
                if (!next2.checkbox && (richTextOrderedItemText = orderedItemText(next2)) != null) {
                    arrayList.add(prefixedLine(i + ". ", richTextOrderedItemText));
                    i++;
                }
            }
        }
    }

    private static TL_iv.RichText listItemText(TL_iv.PageListItem pageListItem) {
        if (pageListItem instanceof TL_iv.TL_pageListItemText) {
            return textOrEmpty(((TL_iv.TL_pageListItemText) pageListItem).text);
        }
        if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
            return textOrEmpty(firstParagraphText(((TL_iv.TL_pageListItemBlocks) pageListItem).blocks));
        }
        return null;
    }

    private static TL_iv.RichText orderedItemText(TL_iv.PageListOrderedItem pageListOrderedItem) {
        if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
            return textOrEmpty(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text);
        }
        if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
            return textOrEmpty(firstParagraphText(((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem).blocks));
        }
        return null;
    }

    private static TL_iv.RichText prefixedLine(String str, TL_iv.RichText richText) {
        TL_iv.textConcat textconcat = new TL_iv.textConcat();
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        textconcat.texts.add(textplain);
        textconcat.texts.add(richText);
        return textconcat;
    }

    private static TL_iv.RichText textOrEmpty(TL_iv.RichText richText) {
        return richText != null ? richText : new TL_iv.textEmpty();
    }

    private static TL_iv.RichText joinRichLines(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return new TL_iv.textEmpty();
        }
        if (arrayList.size() == 1) {
            return (TL_iv.RichText) arrayList.get(0);
        }
        TL_iv.textConcat textconcat = new TL_iv.textConcat();
        for (int i = 0; i < arrayList.size(); i++) {
            if (i > 0) {
                TL_iv.textPlain textplain = new TL_iv.textPlain();
                textplain.text = "\n";
                textconcat.texts.add(textplain);
            }
            textconcat.texts.add((TL_iv.RichText) arrayList.get(i));
        }
        return textconcat;
    }

    public static ArrayList flattenForCopy(TL_iv.RichMessage richMessage) {
        ArrayList arrayList = new ArrayList();
        if (richMessage != null) {
            flattenBlocks(arrayList, richMessage.blocks);
        }
        return arrayList;
    }

    private static void flattenDetails(ArrayList arrayList, TL_iv.pageBlockDetails pageblockdetails) {
        if (pageblockdetails.title == null) {
            pageblockdetails.title = new TL_iv.textEmpty();
        }
        arrayList.add(new BlockRow(pageblockdetails));
        int size = arrayList.size();
        flattenBlocks(arrayList, pageblockdetails.blocks);
        if (arrayList.size() == size) {
            arrayList.add(new BlockRow(new TL_iv.pageBlockParagraph()));
        }
        arrayList.add(newDetailsEndRow());
    }

    private static BlockRow newDetailsEndRow() {
        BlockRow blockRow = new BlockRow(new TL_iv.pageBlockParagraph());
        blockRow.detailsEnd = true;
        return blockRow;
    }

    static boolean isDetailsHeader(BlockRow blockRow) {
        return blockRow != null && (blockRow.block instanceof TL_iv.pageBlockDetails);
    }

    private int matchingDetailsEnd(int i) {
        int i2 = 1;
        for (int i3 = i + 1; i3 < this.rows.size(); i3++) {
            BlockRow blockRow = (BlockRow) this.rows.get(i3);
            if (isDetailsHeader(blockRow)) {
                i2++;
            } else if (blockRow.detailsEnd && i2 - 1 == 0) {
                return i3;
            }
        }
        return this.rows.size();
    }

    private static void expandListBlock(ArrayList arrayList, TL_iv.PageBlock pageBlock, int i) {
        TL_iv.RichText richTextFirstParagraphText;
        ArrayList<TL_iv.PageBlock> arrayList2;
        TL_iv.RichText richTextFirstParagraphText2;
        ArrayList<TL_iv.PageBlock> arrayList3;
        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
            Iterator<TL_iv.PageListOrderedItem> it = ((TL_iv.pageBlockOrderedList) pageBlock).items.iterator();
            int i2 = 1;
            while (it.hasNext()) {
                TL_iv.PageListOrderedItem next = it.next();
                if (next instanceof TL_iv.TL_pageListOrderedItemText) {
                    richTextFirstParagraphText2 = ((TL_iv.TL_pageListOrderedItemText) next).text;
                    arrayList3 = null;
                } else if (next instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                    ArrayList<TL_iv.PageBlock> arrayList4 = ((TL_iv.TL_pageListOrderedItemBlocks) next).blocks;
                    arrayList3 = arrayList4;
                    richTextFirstParagraphText2 = firstParagraphText(arrayList4);
                }
                addListItemRow(arrayList, richTextFirstParagraphText2, i, i2, next.checkbox, next.checked);
                expandChildLists(arrayList, arrayList3, i);
                i2++;
            }
            return;
        }
        Iterator<TL_iv.PageListItem> it2 = ((TL_iv.pageBlockList) pageBlock).items.iterator();
        while (it2.hasNext()) {
            TL_iv.PageListItem next2 = it2.next();
            if (next2 instanceof TL_iv.TL_pageListItemText) {
                richTextFirstParagraphText = ((TL_iv.TL_pageListItemText) next2).text;
                arrayList2 = null;
            } else if (next2 instanceof TL_iv.TL_pageListItemBlocks) {
                arrayList2 = ((TL_iv.TL_pageListItemBlocks) next2).blocks;
                richTextFirstParagraphText = firstParagraphText(arrayList2);
            }
            addListItemRow(arrayList, richTextFirstParagraphText, i, 0, next2.checkbox, next2.checked);
            expandChildLists(arrayList, arrayList2, i);
        }
    }

    private static void addListItemRow(ArrayList arrayList, TL_iv.RichText richText, int i, int i2, boolean z, boolean z2) {
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

    private static void expandChildLists(ArrayList arrayList, ArrayList arrayList2, int i) {
        if (arrayList2 == null) {
            return;
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList2.get(i2);
            if ((pageBlock instanceof TL_iv.pageBlockList) || (pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                expandListBlock(arrayList, pageBlock, i + 1);
            }
        }
    }

    private static TL_iv.RichText firstParagraphText(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty() || !(arrayList.get(0) instanceof TL_iv.pageBlockParagraph)) {
            return null;
        }
        return ((TL_iv.pageBlockParagraph) arrayList.get(0)).text;
    }

    void onFormattingClicked(int i) {
        RichEditorHistory richEditorHistory;
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
        if (articleTextSelectionHelper == null || !articleTextSelectionHelper.isInSelectionMode()) {
            return;
        }
        if (isTableSelection()) {
            onFormattingClickedTable(i);
            return;
        }
        if (isCaptionSelection()) {
            onFormattingClickedCaption(i);
            return;
        }
        if (isQuoteAuthorSelection()) {
            onFormattingClickedAuthor(i);
            return;
        }
        int startCell = this.textSelectionHelper.getStartCell();
        int endCell = this.textSelectionHelper.getEndCell();
        int startOffset = this.textSelectionHelper.getStartOffset();
        int endOffset = this.textSelectionHelper.getEndOffset();
        if (startCell < 0 || endCell < 0 || endCell < startCell || endCell >= this.itemRows.size()) {
            return;
        }
        boolean zIsStyleFullyApplied = isStyleFullyApplied(i, startCell, startOffset, endCell, endOffset);
        boolean z = !zIsStyleFullyApplied;
        int iClearMaskFor = !zIsStyleFullyApplied ? clearMaskFor(i) : 0;
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.flush();
        }
        this.suppressSpansChanged = true;
        int i2 = startCell;
        boolean z2 = false;
        while (i2 <= endCell) {
            BlockRow blockRowRowForCell = rowForCell(i2);
            if (blockRowRowForCell != null && isInlineFormattable(blockRowRowForCell.block)) {
                int iBlockTextLength = blockTextLength(i2);
                int i3 = i2 == startCell ? startOffset : 0;
                int i4 = i2 == endCell ? endOffset : iBlockTextLength;
                int iMax = Math.max(0, Math.min(i3, iBlockTextLength));
                int iMax2 = Math.max(0, Math.min(i4, iBlockTextLength));
                if (iMax < iMax2) {
                    RichTextCell richTextCellCellAt = cellAt(i2);
                    if (richTextCellCellAt != null) {
                        FloatingToolbar.StyleDelegate styleDelegate = richTextCellCellAt.getStyleDelegate();
                        if (!zIsStyleFullyApplied) {
                            if (iClearMaskFor != 0) {
                                styleDelegate.removeStyle(iClearMaskFor, iMax, iMax2);
                            }
                            styleDelegate.addStyle(i, iMax, iMax2);
                        } else {
                            styleDelegate.removeStyle(i, iMax, iMax2);
                        }
                        richTextCellCellAt.getEditText().invalidateEffects();
                        richTextCellCellAt.getEditText().requestLayout();
                        richTextCellCellAt.persistStyle();
                    } else {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(RichTextCell.readStyledText(blockRowRowForCell.block));
                        if (!zIsStyleFullyApplied && iClearMaskFor != 0) {
                            RichTextStyle.setStyle(spannableStringBuilder, iMax, iMax2, iClearMaskFor, false);
                        }
                        RichTextStyle.setStyle(spannableStringBuilder, iMax, iMax2, i, z);
                        RichTextCell.applyStyledTextToBlock(blockRowRowForCell.block, spannableStringBuilder);
                    }
                    z2 = true;
                }
            }
            i2++;
        }
        this.suppressSpansChanged = false;
        if (z2 && (richEditorHistory = this.history) != null) {
            richEditorHistory.record();
        }
        this.delegate.onSelectionChanged();
        if (z2) {
            refreshSelectionHighlight();
        }
    }

    private void refreshSelectionHighlight() {
        post(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$refreshSelectionHighlight$4();
            }
        });
    }

    public void lambda$refreshSelectionHighlight$4() {
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
        if (articleTextSelectionHelper == null || !articleTextSelectionHelper.isInSelectionMode()) {
            return;
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof RichTextCell) || (childAt instanceof RichTableCell) || (childAt instanceof RichCaptionHost) || (childAt instanceof RichDetailsCell)) {
                childAt.invalidate();
            }
        }
        this.textSelectionHelper.invalidate();
    }

    public void onCellSpansChanged() {
        if (this.suppressSpansChanged) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.record();
        }
        this.delegate.onSelectionChanged();
        refreshSelectionHighlight();
    }

    private RichTextCell singleSelectionCell() {
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
        if (articleTextSelectionHelper != null && articleTextSelectionHelper.isInSelectionMode()) {
            int startCell = this.textSelectionHelper.getStartCell();
            int endCell = this.textSelectionHelper.getEndCell();
            BlockRow blockRowRowForCell = rowForCell(startCell);
            if (startCell == endCell && blockRowRowForCell != null && isFormattable(blockRowRowForCell.block)) {
                return cellAt(startCell);
            }
            return null;
        }
        return null;
    }

    void onLinkClicked() {
        if (isTableSelection()) {
            onLinkClickedTable();
            return;
        }
        if (isCaptionSelection()) {
            onLinkClickedCaption();
            return;
        }
        if (isQuoteAuthorSelection()) {
            onLinkClickedAuthor();
            return;
        }
        RichTextCell richTextCellSingleSelectionCell = singleSelectionCell();
        if (richTextCellSingleSelectionCell == null) {
            return;
        }
        int length = richTextCellSingleSelectionCell.getEditText().length();
        int iMax = Math.max(0, Math.min(Math.min(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        int iMax2 = Math.max(0, Math.min(Math.max(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        if (iMax >= iMax2) {
            return;
        }
        if (RichTextStyle.hasLink(richTextCellSingleSelectionCell.getEditText().getText(), iMax, iMax2)) {
            RichEditorHistory richEditorHistory = this.history;
            if (richEditorHistory != null) {
                richEditorHistory.flush();
            }
            RichTextStyle.removeLink(richTextCellSingleSelectionCell.getEditText().getText(), iMax, iMax2);
            richTextCellSingleSelectionCell.getEditText().invalidateEffects();
            richTextCellSingleSelectionCell.persistStyle();
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
            this.delegate.onSelectionChanged();
            refreshSelectionHighlight();
            return;
        }
        RichEditorHistory richEditorHistory3 = this.history;
        if (richEditorHistory3 != null) {
            richEditorHistory3.flush();
        }
        if (RichTextStyle.hasDate(richTextCellSingleSelectionCell.getEditText().getText(), iMax, iMax2)) {
            RichTextStyle.removeDate(richTextCellSingleSelectionCell.getEditText().getText(), iMax, iMax2);
            richTextCellSingleSelectionCell.getEditText().invalidateEffects();
            richTextCellSingleSelectionCell.persistStyle();
            RichEditorHistory richEditorHistory4 = this.history;
            if (richEditorHistory4 != null) {
                richEditorHistory4.record();
            }
            refreshSelectionHighlight();
        }
        richTextCellSingleSelectionCell.getEditText().setSelectionOverride(iMax, iMax2);
        richTextCellSingleSelectionCell.getEditText().makeSelectedUrl();
    }

    void onDateClicked() {
        if (isTableSelection()) {
            onDateClickedTable();
            return;
        }
        if (isCaptionSelection()) {
            onDateClickedCaption();
            return;
        }
        if (isQuoteAuthorSelection()) {
            onDateClickedAuthor();
            return;
        }
        RichTextCell richTextCellSingleSelectionCell = singleSelectionCell();
        if (richTextCellSingleSelectionCell == null) {
            return;
        }
        int length = richTextCellSingleSelectionCell.getEditText().length();
        int iMax = Math.max(0, Math.min(Math.min(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        int iMax2 = Math.max(0, Math.min(Math.max(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        if (iMax >= iMax2) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        if (RichTextStyle.hasLink(richTextCellSingleSelectionCell.getEditText().getText(), iMax, iMax2)) {
            RichTextStyle.removeLink(richTextCellSingleSelectionCell.getEditText().getText(), iMax, iMax2);
            richTextCellSingleSelectionCell.getEditText().invalidateEffects();
            richTextCellSingleSelectionCell.persistStyle();
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
            refreshSelectionHighlight();
        }
        richTextCellSingleSelectionCell.getEditText().setSelectionOverride(iMax, iMax2);
        richTextCellSingleSelectionCell.getEditText().makeSelectedDate();
    }

    void onMathClicked() {
        RichEditText editText;
        Runnable runnable;
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
        if (articleTextSelectionHelper == null || !articleTextSelectionHelper.isInSelectionMode()) {
            return;
        }
        if (isTableSelection()) {
            final int startCell = this.textSelectionHelper.getStartCell();
            final int startChildPosition = this.textSelectionHelper.getStartChildPosition();
            if (startChildPosition != this.textSelectionHelper.getEndChildPosition()) {
                return;
            }
            editText = tableEditText(startCell, startChildPosition);
            runnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onMathClicked$5(startCell, startChildPosition);
                }
            };
        } else if (isCaptionSelection()) {
            final int startCell2 = this.textSelectionHelper.getStartCell();
            editText = captionEditText(startCell2);
            runnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onMathClicked$6(startCell2);
                }
            };
        } else if (isQuoteAuthorSelection()) {
            final int startCell3 = this.textSelectionHelper.getStartCell();
            editText = quoteAuthorEditText(startCell3);
            runnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onMathClicked$7(startCell3);
                }
            };
        } else {
            final RichTextCell richTextCellSingleSelectionCell = singleSelectionCell();
            if (richTextCellSingleSelectionCell == null) {
                return;
            }
            editText = richTextCellSingleSelectionCell.getEditText();
            runnable = new Runnable() {
                @Override
                public final void run() {
                    richTextCellSingleSelectionCell.persistStyle();
                }
            };
        }
        if (editText == null) {
            return;
        }
        int length = editText.length();
        int iMax = Math.max(0, Math.min(Math.min(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        int iMax2 = Math.max(0, Math.min(Math.max(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        if (iMax > iMax2) {
            return;
        }
        insertInlineMath(editText, iMax, iMax2, runnable);
    }

    private void insertInlineMath(final RichEditText richEditText, final int i, final int i2, final Runnable runnable) {
        String strSourceAt = MathSpan.sourceAt(richEditText.getText(), i, i2);
        if (strSourceAt == null) {
            strSourceAt = richEditText.getText().subSequence(i, i2).toString();
        }
        final float fDp = AndroidUtilities.dp(SharedConfig.fontSize + 4);
        final int color = Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider);
        ChatAttachAlertRichLayout.showEditLatexSheet(getContext(), strSourceAt, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$insertInlineMath$9(color, fDp, richEditText, i, i2, runnable, (String) obj);
            }
        }, this.resourcesProvider);
    }

    public void lambda$insertInlineMath$9(int i, float f, final RichEditText richEditText, int i2, int i3, Runnable runnable, String str) {
        MathSpan mathSpanCreate;
        if (TextUtils.isEmpty(str) || (mathSpanCreate = MathSpan.create(str, i, f)) == null) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
        if (articleTextSelectionHelper != null) {
            articleTextSelectionHelper.clear();
        }
        richEditText.setLocked(false);
        SpannableString spannableString = new SpannableString(" ");
        spannableString.setSpan(mathSpanCreate, 0, 1, 33);
        Editable text = richEditText.getText();
        int iMax = Math.max(0, Math.min(i2, text.length()));
        text.replace(iMax, Math.max(iMax, Math.min(i3, text.length())), spannableString);
        runnable.run();
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        this.delegate.onContentChanged();
        final int iMin = Math.min(iMax + 1, richEditText.length());
        richEditText.requestEditFocus();
        post(new Runnable() {
            @Override
            public final void run() {
                RichEditorListView.lambda$insertInlineMath$8(richEditText, iMin);
            }
        });
    }

    public static void lambda$insertInlineMath$8(RichEditText richEditText, int i) {
        richEditText.requestEditFocus();
        richEditText.setSelection(Math.min(i, richEditText.length()));
    }

    public SelectionEdit beginSelectionEdit() {
        int i;
        int i2;
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
        if (articleTextSelectionHelper == null || !articleTextSelectionHelper.isInSelectionMode() || isQuoteAuthorSelection()) {
            return null;
        }
        int iIndexOf = this.rows.indexOf(rowForCell(this.textSelectionHelper.getStartCell()));
        int iIndexOf2 = this.rows.indexOf(rowForCell(this.textSelectionHelper.getEndCell()));
        if (iIndexOf >= 0 && iIndexOf2 >= 0) {
            if (iIndexOf > iIndexOf2) {
                i2 = iIndexOf;
                i = iIndexOf2;
            } else {
                i = iIndexOf;
                i2 = iIndexOf2;
            }
            for (int i3 = i; i3 <= i2; i3++) {
                BlockRow blockRow = (BlockRow) this.rows.get(i3);
                if (blockRow.detailsEnd || isDetailsHeader(blockRow)) {
                    return null;
                }
            }
            return new AnonymousClass4(i, i2, this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset());
        }
        return null;
    }

    class AnonymousClass4 implements SelectionEdit {
        final int val$eOff;
        final int val$endRowIdx;
        final int val$sOff;
        final int val$startRowIdx;

        AnonymousClass4(int i, int i2, int i3, int i4) {
            this.val$startRowIdx = i;
            this.val$endRowIdx = i2;
            this.val$sOff = i3;
            this.val$eOff = i4;
        }

        @Override
        public TL_iv.RichMessage extractRichMessage() {
            BlockRow blockRow = (BlockRow) RichEditorListView.this.rows.get(this.val$startRowIdx);
            BlockRow blockRow2 = (BlockRow) RichEditorListView.this.rows.get(this.val$endRowIdx);
            TL_iv.PageBlock pageBlock = blockRow.block;
            TL_iv.PageBlock pageBlock2 = blockRow2.block;
            TL_iv.PageBlock pageBlockSliceClone = RichEditorListView.this.sliceClone(blockRow, this.val$sOff, this.val$startRowIdx == this.val$endRowIdx ? this.val$eOff : -1);
            TL_iv.PageBlock pageBlockSliceClone2 = this.val$startRowIdx == this.val$endRowIdx ? null : RichEditorListView.this.sliceClone(blockRow2, 0, this.val$eOff);
            if (pageBlockSliceClone != null) {
                blockRow.block = pageBlockSliceClone;
            }
            if (pageBlockSliceClone2 != null) {
                blockRow2.block = pageBlockSliceClone2;
            }
            try {
                ArrayList<TL_iv.PageBlock> arrayListFlattenRange = RichEditorListView.this.flattenRange(this.val$startRowIdx, this.val$endRowIdx + 1, false);
                ArrayList<TLRPC.Photo> arrayListCollectMediaPhotos = RichEditorListView.this.collectMediaPhotos(this.val$startRowIdx, this.val$endRowIdx);
                ArrayList<TLRPC.Document> arrayListCollectMediaDocuments = RichEditorListView.this.collectMediaDocuments(this.val$startRowIdx, this.val$endRowIdx);
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

        @Override
        public void replaceWith(TL_iv.RichMessage richMessage) {
            int i;
            if (richMessage != null && this.val$startRowIdx < RichEditorListView.this.rows.size() && this.val$endRowIdx < RichEditorListView.this.rows.size()) {
                RichEditorHistory richEditorHistory = RichEditorListView.this.history;
                if (richEditorHistory != null) {
                    richEditorHistory.flush();
                }
                TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = RichEditorListView.this.textSelectionHelper;
                if (articleTextSelectionHelper != null) {
                    articleTextSelectionHelper.clear();
                }
                BlockRow blockRow = (BlockRow) RichEditorListView.this.rows.get(this.val$startRowIdx);
                BlockRow blockRow2 = (BlockRow) RichEditorListView.this.rows.get(this.val$endRowIdx);
                String strStyledTextOf = RichEditorListView.isFormattable(blockRow.block) ? RichEditorListView.this.styledTextOf(blockRow) : "";
                CharSequence charSequenceStyledTextOf = RichEditorListView.isFormattable(blockRow2.block) ? RichEditorListView.this.styledTextOf(blockRow2) : "";
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strStyledTextOf.subSequence(0, Math.max(0, Math.min(this.val$sOff, strStyledTextOf.length()))));
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequenceStyledTextOf.subSequence(Math.max(0, Math.min(this.val$eOff, charSequenceStyledTextOf.length())), charSequenceStyledTextOf.length()));
                ArrayList arrayList = new ArrayList();
                RichEditorListView.flattenBlocks(arrayList, richMessage.blocks);
                if (arrayList.isEmpty()) {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                    spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    RichTextCell.applyStyledTextToBlock(pageblockparagraph, spannableStringBuilder3);
                    arrayList.add(new BlockRow(pageblockparagraph, blockRow.level, blockRow.num));
                } else {
                    if (spannableStringBuilder.length() > 0) {
                        BlockRow blockRow3 = (BlockRow) arrayList.get(0);
                        if (RichEditorListView.isFormattable(blockRow3.block)) {
                            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder4.append(RichTextCell.readStyledText(blockRow3.block));
                            RichTextCell.applyStyledTextToBlock(blockRow3.block, spannableStringBuilder4);
                        } else {
                            TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                            RichTextCell.applyStyledTextToBlock(pageblockparagraph2, spannableStringBuilder);
                            arrayList.add(0, new BlockRow(pageblockparagraph2, blockRow.level, blockRow.num));
                        }
                    }
                    if (spannableStringBuilder2.length() > 0) {
                        BlockRow blockRow4 = (BlockRow) arrayList.get(arrayList.size() - 1);
                        if (RichEditorListView.isFormattable(blockRow4.block)) {
                            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(RichTextCell.readStyledText(blockRow4.block));
                            spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                            RichTextCell.applyStyledTextToBlock(blockRow4.block, spannableStringBuilder5);
                        } else {
                            TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                            RichTextCell.applyStyledTextToBlock(pageblockparagraph3, spannableStringBuilder2);
                            arrayList.add(new BlockRow(pageblockparagraph3, blockRow2.level, blockRow2.num));
                        }
                    }
                }
                RichEditorListView richEditorListView = RichEditorListView.this;
                TL_iv.RichMessage richMessage2 = richEditorListView.loadedRichMessage;
                if (richMessage2 == null) {
                    richEditorListView.loadedRichMessage = richMessage;
                } else {
                    ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
                    if (arrayList2 != null) {
                        richMessage2.photos.addAll(arrayList2);
                    }
                    ArrayList<TLRPC.Document> arrayList3 = richMessage.documents;
                    if (arrayList3 != null) {
                        RichEditorListView.this.loadedRichMessage.documents.addAll(arrayList3);
                    }
                }
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    RichEditorListView.this.resolveLoadedMedia((BlockRow) arrayList.get(i2));
                }
                int i3 = this.val$endRowIdx;
                while (true) {
                    i = this.val$startRowIdx;
                    if (i3 < i) {
                        break;
                    }
                    RichEditorListView.this.rows.remove(i3);
                    i3--;
                }
                RichEditorListView.this.rows.addAll(i, arrayList);
                RichEditorListView.this.renumberAllRuns();
                RichEditorListView.this.adapter.update(false);
                RichEditorHistory richEditorHistory2 = RichEditorListView.this.history;
                if (richEditorHistory2 != null) {
                    richEditorHistory2.record();
                }
                RichEditorListView.this.delegate.onContentChanged();
                final BlockRow blockRow5 = arrayList.isEmpty() ? null : (BlockRow) arrayList.get(arrayList.size() - 1);
                RichEditorListView.this.post(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$replaceWith$0(blockRow5);
                    }
                });
            }
        }

        public void lambda$replaceWith$0(BlockRow blockRow) {
            View viewFindViewByItemObject = blockRow == null ? null : RichEditorListView.this.findViewByItemObject(blockRow);
            if (viewFindViewByItemObject instanceof RichTextCell) {
                RichTextCell richTextCell = (RichTextCell) viewFindViewByItemObject;
                richTextCell.requestEditFocus();
                richTextCell.getEditText().setSelection(richTextCell.getEditText().length());
            }
        }
    }

    public CharSequence styledTextOf(BlockRow blockRow) {
        View viewFindViewByItemObject = findViewByItemObject(blockRow);
        return viewFindViewByItemObject instanceof RichTextCell ? ((RichTextCell) viewFindViewByItemObject).getEditText().getText() : RichTextCell.readStyledText(blockRow.block);
    }

    public TL_iv.PageBlock sliceClone(BlockRow blockRow, int i, int i2) {
        if (!isFormattable(blockRow.block)) {
            return null;
        }
        CharSequence charSequenceStyledTextOf = styledTextOf(blockRow);
        int length = charSequenceStyledTextOf.length();
        int iMax = Math.max(0, Math.min(i, length));
        if (i2 >= 0) {
            length = Math.max(0, Math.min(i2, length));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceStyledTextOf.subSequence(Math.min(iMax, length), Math.max(iMax, length)));
        TL_iv.PageBlock pageBlockCloneBlock = cloneBlock(blockRow.block);
        RichTextCell.applyStyledTextToBlock(pageBlockCloneBlock, spannableStringBuilder);
        return pageBlockCloneBlock;
    }

    public ArrayList collectMediaPhotos(int i, int i2) {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i <= i2 && i < this.rows.size()) {
            for (MediaUploadState mediaUploadState : mediasOf((BlockRow) this.rows.get(i))) {
                if (mediaUploadState.isReady() && (photo = mediaUploadState.photo) != null && hashSet.add(Long.valueOf(photo.id))) {
                    arrayList.add(mediaUploadState.photo);
                }
            }
            i++;
        }
        return arrayList;
    }

    public ArrayList collectMediaDocuments(int i, int i2) {
        TLRPC.Document document;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i <= i2 && i < this.rows.size()) {
            for (MediaUploadState mediaUploadState : mediasOf((BlockRow) this.rows.get(i))) {
                if (mediaUploadState.isReady() && (document = mediaUploadState.document) != null && hashSet.add(Long.valueOf(document.id))) {
                    arrayList.add(mediaUploadState.document);
                }
            }
            i++;
        }
        return arrayList;
    }

    private static TL_iv.PageBlock cloneBlock(TL_iv.PageBlock pageBlock) {
        if (pageBlock != null) {
            try {
                ensureSerializable(pageBlock);
                SerializedData serializedData = new SerializedData(pageBlock.getObjectSize());
                pageBlock.serializeToStream(serializedData);
                SerializedData serializedData2 = new SerializedData(serializedData.toByteArray());
                TL_iv.PageBlock pageBlockTLdeserialize = TL_iv.PageBlock.TLdeserialize(serializedData2, serializedData2.readInt32(true), true);
                serializedData.cleanup();
                serializedData2.cleanup();
                if (pageBlockTLdeserialize != null) {
                    return pageBlockTLdeserialize;
                }
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        pageblockparagraph.text = new TL_iv.textEmpty();
        return pageblockparagraph;
    }

    private static void ensureSerializable(TL_iv.PageBlock pageBlock) {
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

    boolean isLinkApplied(int i, int i2, int i3, int i4) {
        CharSequence charSequenceSingleSelectionText = singleSelectionText(i, i2, i3, i4);
        if (charSequenceSingleSelectionText == null) {
            return false;
        }
        return RichTextStyle.hasLink(charSequenceSingleSelectionText, Math.max(0, Math.min(i2, i4)), Math.max(i2, i4));
    }

    boolean isDateApplied(int i, int i2, int i3, int i4) {
        CharSequence charSequenceSingleSelectionText = singleSelectionText(i, i2, i3, i4);
        if (charSequenceSingleSelectionText == null) {
            return false;
        }
        return RichTextStyle.hasDate(charSequenceSingleSelectionText, Math.max(0, Math.min(i2, i4)), Math.max(i2, i4));
    }

    private CharSequence singleSelectionText(int i, int i2, int i3, int i4) {
        if (i != i3) {
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
        if (Math.max(0, Math.min(Math.min(i2, i4), iBlockTextLength)) >= Math.max(0, Math.min(Math.max(i2, i4), iBlockTextLength))) {
            return null;
        }
        RichTextCell richTextCellCellAt = cellAt(i);
        return richTextCellCellAt != null ? richTextCellCellAt.getEditText().getText() : RichTextCell.readStyledText(blockRowRowForCell.block);
    }

    boolean isStyleFullyApplied(int i, int i2, int i3, int i4, int i5) {
        boolean zHasStyle;
        if (isQuoteAuthorSelection()) {
            RichEditText richEditTextQuoteAuthorEditText = quoteAuthorEditText(i2);
            if (richEditTextQuoteAuthorEditText == null) {
                return false;
            }
            int length = richEditTextQuoteAuthorEditText.length();
            int iMax = Math.max(0, Math.min(Math.min(i3, i5), length));
            int iMax2 = Math.max(0, Math.min(Math.max(i3, i5), length));
            return iMax < iMax2 && (i & richEditTextQuoteAuthorEditText.getCurrentStyle(iMax, iMax2)) != 0;
        }
        int i6 = i2;
        boolean z = false;
        while (i6 <= i4) {
            BlockRow blockRowRowForCell = rowForCell(i6);
            if (blockRowRowForCell != null && isInlineFormattable(blockRowRowForCell.block)) {
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
                        zHasStyle = RichTextStyle.hasStyle(RichTextCell.readStyledText(rowForCell(i6).block), iMax3, iMax4, i);
                    }
                    if (!zHasStyle) {
                        return false;
                    }
                    z = true;
                } else {
                    continue;
                }
            }
            i6++;
        }
        return z;
    }

    private int blockTextLength(int i) {
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

    public static boolean isFormattable(TL_iv.PageBlock pageBlock) {
        return (isNonText(pageBlock) || (pageBlock instanceof TL_iv.pageBlockDetails)) ? false : true;
    }

    private static boolean isInlineFormattable(TL_iv.PageBlock pageBlock) {
        return isFormattable(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted);
    }

    boolean isTableSelection() {
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
        if (articleTextSelectionHelper == null || !articleTextSelectionHelper.isInSelectionMode()) {
            return false;
        }
        int startCell = this.textSelectionHelper.getStartCell();
        int endCell = this.textSelectionHelper.getEndCell();
        BlockRow blockRowRowForCell = rowForCell(startCell);
        return startCell == endCell && blockRowRowForCell != null && (blockRowRowForCell.block instanceof TL_iv.pageBlockTable);
    }

    RichEditText tableEditText(int i, int i2) {
        View viewSelectableAt = selectableAt(i);
        if (viewSelectableAt instanceof RichTableCell) {
            return ((RichTableCell) viewSelectableAt).editTextForChildPos(i2);
        }
        return null;
    }

    public void lambda$onMathClicked$5(int i, int i2) {
        RichTableCellHost richTableCellHostHostForAnchor;
        View viewSelectableAt = selectableAt(i);
        if (viewSelectableAt instanceof RichTableCell) {
            RichTableCell richTableCell = (RichTableCell) viewSelectableAt;
            if (i2 == richTableCell.titleChildPos()) {
                richTableCell.persistTitleFromEditor();
                return;
            }
            TL_iv.pageTableCell pagetablecellAnchorForChildPos = richTableCell.anchorForChildPos(i2);
            if (pagetablecellAnchorForChildPos == null || (richTableCellHostHostForAnchor = richTableCell.getGrid().hostForAnchor(pagetablecellAnchorForChildPos)) == null) {
                return;
            }
            TableModel.applyStyledText(pagetablecellAnchorForChildPos, richTableCellHostHostForAnchor.editText.getText());
        }
    }

    private boolean tableSelectionHasFormattable() {
        int startCell = this.textSelectionHelper.getStartCell();
        int startChildPosition = this.textSelectionHelper.getStartChildPosition();
        int endChildPosition = this.textSelectionHelper.getEndChildPosition();
        int startOffset = this.textSelectionHelper.getStartOffset();
        int endOffset = this.textSelectionHelper.getEndOffset();
        int i = startChildPosition;
        while (i <= endChildPosition) {
            RichEditText richEditTextTableEditText = tableEditText(startCell, i);
            if (richEditTextTableEditText != null) {
                int length = richEditTextTableEditText.length();
                int iMin = i == startChildPosition ? startOffset : 0;
                int iMax = i == endChildPosition ? endOffset : length;
                if (startChildPosition == endChildPosition) {
                    iMin = Math.min(startOffset, endOffset);
                    iMax = Math.max(startOffset, endOffset);
                }
                if (Math.max(0, Math.min(iMin, length)) < Math.max(0, Math.min(iMax, length))) {
                    return true;
                }
            }
            i++;
        }
        return false;
    }

    private void onFormattingClickedTable(int i) {
        RichEditorHistory richEditorHistory;
        int startCell = this.textSelectionHelper.getStartCell();
        int startChildPosition = this.textSelectionHelper.getStartChildPosition();
        int endChildPosition = this.textSelectionHelper.getEndChildPosition();
        int startOffset = this.textSelectionHelper.getStartOffset();
        int endOffset = this.textSelectionHelper.getEndOffset();
        boolean zIsStyleFullyAppliedTable = isStyleFullyAppliedTable(i, startCell, startChildPosition, startOffset, endChildPosition, endOffset);
        int iClearMaskFor = !zIsStyleFullyAppliedTable ? clearMaskFor(i) : 0;
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.flush();
        }
        this.suppressSpansChanged = true;
        int i2 = startChildPosition;
        boolean z = false;
        while (i2 <= endChildPosition) {
            RichEditText richEditTextTableEditText = tableEditText(startCell, i2);
            if (richEditTextTableEditText != null) {
                int length = richEditTextTableEditText.length();
                int iMin = i2 == startChildPosition ? startOffset : 0;
                int iMax = i2 == endChildPosition ? endOffset : length;
                if (startChildPosition == endChildPosition) {
                    iMin = Math.min(startOffset, endOffset);
                    iMax = Math.max(startOffset, endOffset);
                }
                int iMax2 = Math.max(0, Math.min(iMin, length));
                int iMax3 = Math.max(0, Math.min(iMax, length));
                if (iMax2 < iMax3) {
                    if (!zIsStyleFullyAppliedTable) {
                        if (iClearMaskFor != 0) {
                            richEditTextTableEditText.removeStyle(iClearMaskFor, iMax2, iMax3);
                        }
                        richEditTextTableEditText.addStyle(i, iMax2, iMax3);
                    } else {
                        richEditTextTableEditText.removeStyle(i, iMax2, iMax3);
                    }
                    richEditTextTableEditText.invalidateEffects();
                    richEditTextTableEditText.requestLayout();
                    lambda$onMathClicked$5(startCell, i2);
                    z = true;
                }
            }
            i2++;
        }
        this.suppressSpansChanged = false;
        if (z && (richEditorHistory = this.history) != null) {
            richEditorHistory.record();
        }
        this.delegate.onSelectionChanged();
        if (z) {
            refreshSelectionHighlight();
        }
    }

    boolean isStyleFullyAppliedTable(int i, int i2, int i3, int i4, int i5, int i6) {
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

    private void onLinkClickedTable() {
        RichEditText richEditTextTableEditText;
        int startCell = this.textSelectionHelper.getStartCell();
        int startChildPosition = this.textSelectionHelper.getStartChildPosition();
        if (startChildPosition == this.textSelectionHelper.getEndChildPosition() && (richEditTextTableEditText = tableEditText(startCell, startChildPosition)) != null) {
            int length = richEditTextTableEditText.length();
            int iMax = Math.max(0, Math.min(Math.min(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
            int iMax2 = Math.max(0, Math.min(Math.max(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
            if (iMax >= iMax2) {
                return;
            }
            if (RichTextStyle.hasLink(richEditTextTableEditText.getText(), iMax, iMax2)) {
                RichEditorHistory richEditorHistory = this.history;
                if (richEditorHistory != null) {
                    richEditorHistory.flush();
                }
                RichTextStyle.removeLink(richEditTextTableEditText.getText(), iMax, iMax2);
                richEditTextTableEditText.invalidateEffects();
                lambda$onMathClicked$5(startCell, startChildPosition);
                RichEditorHistory richEditorHistory2 = this.history;
                if (richEditorHistory2 != null) {
                    richEditorHistory2.record();
                }
                this.delegate.onSelectionChanged();
                refreshSelectionHighlight();
                return;
            }
            RichEditorHistory richEditorHistory3 = this.history;
            if (richEditorHistory3 != null) {
                richEditorHistory3.flush();
            }
            if (RichTextStyle.hasDate(richEditTextTableEditText.getText(), iMax, iMax2)) {
                RichTextStyle.removeDate(richEditTextTableEditText.getText(), iMax, iMax2);
                richEditTextTableEditText.invalidateEffects();
                lambda$onMathClicked$5(startCell, startChildPosition);
                RichEditorHistory richEditorHistory4 = this.history;
                if (richEditorHistory4 != null) {
                    richEditorHistory4.record();
                }
                refreshSelectionHighlight();
            }
            richEditTextTableEditText.setSelectionOverride(iMax, iMax2);
            richEditTextTableEditText.makeSelectedUrl();
        }
    }

    private void onDateClickedTable() {
        RichEditText richEditTextTableEditText;
        int startCell = this.textSelectionHelper.getStartCell();
        int startChildPosition = this.textSelectionHelper.getStartChildPosition();
        if (startChildPosition == this.textSelectionHelper.getEndChildPosition() && (richEditTextTableEditText = tableEditText(startCell, startChildPosition)) != null) {
            int length = richEditTextTableEditText.length();
            int iMax = Math.max(0, Math.min(Math.min(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
            int iMax2 = Math.max(0, Math.min(Math.max(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
            if (iMax >= iMax2) {
                return;
            }
            RichEditorHistory richEditorHistory = this.history;
            if (richEditorHistory != null) {
                richEditorHistory.flush();
            }
            if (RichTextStyle.hasLink(richEditTextTableEditText.getText(), iMax, iMax2)) {
                RichTextStyle.removeLink(richEditTextTableEditText.getText(), iMax, iMax2);
                richEditTextTableEditText.invalidateEffects();
                lambda$onMathClicked$5(startCell, startChildPosition);
                RichEditorHistory richEditorHistory2 = this.history;
                if (richEditorHistory2 != null) {
                    richEditorHistory2.record();
                }
                refreshSelectionHighlight();
            }
            richEditTextTableEditText.setSelectionOverride(iMax, iMax2);
            richEditTextTableEditText.makeSelectedDate();
        }
    }

    boolean isCaptionSelection() {
        int startCell;
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
        if (articleTextSelectionHelper == null || !articleTextSelectionHelper.isInSelectionMode() || (startCell = this.textSelectionHelper.getStartCell()) != this.textSelectionHelper.getEndCell() || startCell < 0 || startCell >= this.itemRows.size()) {
            return false;
        }
        return selectableAt(startCell) instanceof RichCaptionHost;
    }

    RichEditText captionEditText(int i) {
        KeyEvent.Callback callbackSelectableAt = selectableAt(i);
        if (callbackSelectableAt instanceof RichCaptionHost) {
            return ((RichCaptionHost) callbackSelectableAt).getCaptionEditText();
        }
        return null;
    }

    boolean isQuoteAuthorSelection() {
        int startCell;
        BlockRow blockRowRowForCell;
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
        return articleTextSelectionHelper != null && articleTextSelectionHelper.isInSelectionMode() && (startCell = this.textSelectionHelper.getStartCell()) == this.textSelectionHelper.getEndCell() && startCell >= 0 && startCell < this.itemRows.size() && this.textSelectionHelper.getStartChildPosition() == 1 && this.textSelectionHelper.getEndChildPosition() == 1 && (blockRowRowForCell = rowForCell(startCell)) != null && RichTextCell.isQuoteBlock(blockRowRowForCell.block);
    }

    RichEditText quoteAuthorEditText(int i) {
        View viewSelectableAt = selectableAt(i);
        if (viewSelectableAt instanceof RichTextCell) {
            return ((RichTextCell) viewSelectableAt).getAuthorEditText();
        }
        return null;
    }

    public void lambda$onMathClicked$7(int i) {
        View viewSelectableAt = selectableAt(i);
        if (viewSelectableAt instanceof RichTextCell) {
            ((RichTextCell) viewSelectableAt).persistAuthor();
        }
    }

    public void lambda$onMathClicked$6(int i) {
        KeyEvent.Callback callbackSelectableAt = selectableAt(i);
        if (callbackSelectableAt instanceof RichCaptionHost) {
            ((RichCaptionHost) callbackSelectableAt).persistCaption();
        }
    }

    private RichCaptionHost findCaptionHostAncestor(View view) {
        if (view instanceof RichCaptionHost) {
            return (RichCaptionHost) view;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof RichCaptionHost) {
                return (RichCaptionHost) parent;
            }
        }
        return null;
    }

    private void onFormattingClickedCaption(int i) {
        int startCell = this.textSelectionHelper.getStartCell();
        RichEditText richEditTextCaptionEditText = captionEditText(startCell);
        if (richEditTextCaptionEditText == null) {
            return;
        }
        int length = richEditTextCaptionEditText.length();
        int iMax = Math.max(0, Math.min(Math.min(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        int iMax2 = Math.max(0, Math.min(Math.max(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        if (iMax >= iMax2) {
            return;
        }
        boolean z = (richEditTextCaptionEditText.getCurrentStyle(iMax, iMax2) & i) == 0;
        int iClearMaskFor = z ? clearMaskFor(i) : 0;
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        this.suppressSpansChanged = true;
        if (z) {
            if (iClearMaskFor != 0) {
                richEditTextCaptionEditText.removeStyle(iClearMaskFor, iMax, iMax2);
            }
            richEditTextCaptionEditText.addStyle(i, iMax, iMax2);
        } else {
            richEditTextCaptionEditText.removeStyle(i, iMax, iMax2);
        }
        richEditTextCaptionEditText.invalidateEffects();
        richEditTextCaptionEditText.requestLayout();
        lambda$onMathClicked$6(startCell);
        this.suppressSpansChanged = false;
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        this.delegate.onSelectionChanged();
        refreshSelectionHighlight();
    }

    private void onLinkClickedCaption() {
        int startCell = this.textSelectionHelper.getStartCell();
        RichEditText richEditTextCaptionEditText = captionEditText(startCell);
        if (richEditTextCaptionEditText == null) {
            return;
        }
        int length = richEditTextCaptionEditText.length();
        int iMax = Math.max(0, Math.min(Math.min(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        int iMax2 = Math.max(0, Math.min(Math.max(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        if (iMax >= iMax2) {
            return;
        }
        if (RichTextStyle.hasLink(richEditTextCaptionEditText.getText(), iMax, iMax2)) {
            RichEditorHistory richEditorHistory = this.history;
            if (richEditorHistory != null) {
                richEditorHistory.flush();
            }
            RichTextStyle.removeLink(richEditTextCaptionEditText.getText(), iMax, iMax2);
            richEditTextCaptionEditText.invalidateEffects();
            lambda$onMathClicked$6(startCell);
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
            this.delegate.onSelectionChanged();
            refreshSelectionHighlight();
            return;
        }
        RichEditorHistory richEditorHistory3 = this.history;
        if (richEditorHistory3 != null) {
            richEditorHistory3.flush();
        }
        if (RichTextStyle.hasDate(richEditTextCaptionEditText.getText(), iMax, iMax2)) {
            RichTextStyle.removeDate(richEditTextCaptionEditText.getText(), iMax, iMax2);
            richEditTextCaptionEditText.invalidateEffects();
            lambda$onMathClicked$6(startCell);
            RichEditorHistory richEditorHistory4 = this.history;
            if (richEditorHistory4 != null) {
                richEditorHistory4.record();
            }
            refreshSelectionHighlight();
        }
        richEditTextCaptionEditText.setSelectionOverride(iMax, iMax2);
        richEditTextCaptionEditText.makeSelectedUrl();
    }

    private void onDateClickedCaption() {
        int startCell = this.textSelectionHelper.getStartCell();
        RichEditText richEditTextCaptionEditText = captionEditText(startCell);
        if (richEditTextCaptionEditText == null) {
            return;
        }
        int length = richEditTextCaptionEditText.length();
        int iMax = Math.max(0, Math.min(Math.min(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        int iMax2 = Math.max(0, Math.min(Math.max(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        if (iMax >= iMax2) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        if (RichTextStyle.hasLink(richEditTextCaptionEditText.getText(), iMax, iMax2)) {
            RichTextStyle.removeLink(richEditTextCaptionEditText.getText(), iMax, iMax2);
            richEditTextCaptionEditText.invalidateEffects();
            lambda$onMathClicked$6(startCell);
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
            refreshSelectionHighlight();
        }
        richEditTextCaptionEditText.setSelectionOverride(iMax, iMax2);
        richEditTextCaptionEditText.makeSelectedDate();
    }

    private boolean captionSelectionHasFormattable() {
        RichEditText richEditTextCaptionEditText = captionEditText(this.textSelectionHelper.getStartCell());
        if (richEditTextCaptionEditText == null) {
            return false;
        }
        int startOffset = this.textSelectionHelper.getStartOffset();
        int endOffset = this.textSelectionHelper.getEndOffset();
        return Math.max(0, Math.min(Math.min(startOffset, endOffset), richEditTextCaptionEditText.length())) < Math.max(0, Math.min(Math.max(startOffset, endOffset), richEditTextCaptionEditText.length()));
    }

    private void onFormattingClickedAuthor(int i) {
        int startCell = this.textSelectionHelper.getStartCell();
        RichEditText richEditTextQuoteAuthorEditText = quoteAuthorEditText(startCell);
        if (richEditTextQuoteAuthorEditText == null) {
            return;
        }
        int length = richEditTextQuoteAuthorEditText.length();
        int iMax = Math.max(0, Math.min(Math.min(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        int iMax2 = Math.max(0, Math.min(Math.max(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        if (iMax >= iMax2) {
            return;
        }
        boolean z = (richEditTextQuoteAuthorEditText.getCurrentStyle(iMax, iMax2) & i) == 0;
        int iClearMaskFor = z ? clearMaskFor(i) : 0;
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        this.suppressSpansChanged = true;
        if (z) {
            if (iClearMaskFor != 0) {
                richEditTextQuoteAuthorEditText.removeStyle(iClearMaskFor, iMax, iMax2);
            }
            richEditTextQuoteAuthorEditText.addStyle(i, iMax, iMax2);
        } else {
            richEditTextQuoteAuthorEditText.removeStyle(i, iMax, iMax2);
        }
        richEditTextQuoteAuthorEditText.invalidateEffects();
        richEditTextQuoteAuthorEditText.requestLayout();
        lambda$onMathClicked$7(startCell);
        this.suppressSpansChanged = false;
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        this.delegate.onSelectionChanged();
        refreshSelectionHighlight();
    }

    private void onLinkClickedAuthor() {
        int startCell = this.textSelectionHelper.getStartCell();
        RichEditText richEditTextQuoteAuthorEditText = quoteAuthorEditText(startCell);
        if (richEditTextQuoteAuthorEditText == null) {
            return;
        }
        int length = richEditTextQuoteAuthorEditText.length();
        int iMax = Math.max(0, Math.min(Math.min(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        int iMax2 = Math.max(0, Math.min(Math.max(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        if (iMax >= iMax2) {
            return;
        }
        if (RichTextStyle.hasLink(richEditTextQuoteAuthorEditText.getText(), iMax, iMax2)) {
            RichEditorHistory richEditorHistory = this.history;
            if (richEditorHistory != null) {
                richEditorHistory.flush();
            }
            RichTextStyle.removeLink(richEditTextQuoteAuthorEditText.getText(), iMax, iMax2);
            richEditTextQuoteAuthorEditText.invalidateEffects();
            lambda$onMathClicked$7(startCell);
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
            this.delegate.onSelectionChanged();
            refreshSelectionHighlight();
            return;
        }
        RichEditorHistory richEditorHistory3 = this.history;
        if (richEditorHistory3 != null) {
            richEditorHistory3.flush();
        }
        if (RichTextStyle.hasDate(richEditTextQuoteAuthorEditText.getText(), iMax, iMax2)) {
            RichTextStyle.removeDate(richEditTextQuoteAuthorEditText.getText(), iMax, iMax2);
            richEditTextQuoteAuthorEditText.invalidateEffects();
            lambda$onMathClicked$7(startCell);
            RichEditorHistory richEditorHistory4 = this.history;
            if (richEditorHistory4 != null) {
                richEditorHistory4.record();
            }
            refreshSelectionHighlight();
        }
        richEditTextQuoteAuthorEditText.setSelectionOverride(iMax, iMax2);
        richEditTextQuoteAuthorEditText.makeSelectedUrl();
    }

    private void onDateClickedAuthor() {
        int startCell = this.textSelectionHelper.getStartCell();
        RichEditText richEditTextQuoteAuthorEditText = quoteAuthorEditText(startCell);
        if (richEditTextQuoteAuthorEditText == null) {
            return;
        }
        int length = richEditTextQuoteAuthorEditText.length();
        int iMax = Math.max(0, Math.min(Math.min(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        int iMax2 = Math.max(0, Math.min(Math.max(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        if (iMax >= iMax2) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        if (RichTextStyle.hasLink(richEditTextQuoteAuthorEditText.getText(), iMax, iMax2)) {
            RichTextStyle.removeLink(richEditTextQuoteAuthorEditText.getText(), iMax, iMax2);
            richEditTextQuoteAuthorEditText.invalidateEffects();
            lambda$onMathClicked$7(startCell);
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
            refreshSelectionHighlight();
        }
        richEditTextQuoteAuthorEditText.setSelectionOverride(iMax, iMax2);
        richEditTextQuoteAuthorEditText.makeSelectedDate();
    }

    private boolean quoteAuthorSelectionHasFormattable() {
        RichEditText richEditTextQuoteAuthorEditText = quoteAuthorEditText(this.textSelectionHelper.getStartCell());
        if (richEditTextQuoteAuthorEditText == null) {
            return false;
        }
        int startOffset = this.textSelectionHelper.getStartOffset();
        int endOffset = this.textSelectionHelper.getEndOffset();
        return Math.max(0, Math.min(Math.min(startOffset, endOffset), richEditTextQuoteAuthorEditText.length())) < Math.max(0, Math.min(Math.max(startOffset, endOffset), richEditTextQuoteAuthorEditText.length()));
    }

    boolean selectionHasInlineFormattable() {
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
        if (articleTextSelectionHelper != null && articleTextSelectionHelper.isInSelectionMode()) {
            if (isTableSelection()) {
                return tableSelectionHasFormattable();
            }
            if (isCaptionSelection()) {
                return captionSelectionHasFormattable();
            }
            if (isQuoteAuthorSelection()) {
                return quoteAuthorSelectionHasFormattable();
            }
            int startCell = this.textSelectionHelper.getStartCell();
            int endCell = this.textSelectionHelper.getEndCell();
            int startOffset = this.textSelectionHelper.getStartOffset();
            int endOffset = this.textSelectionHelper.getEndOffset();
            if (startCell >= 0 && endCell >= 0 && endCell >= startCell && endCell < this.rows.size()) {
                int i = startCell;
                while (i <= endCell) {
                    if (isInlineFormattable(((BlockRow) this.rows.get(i)).block)) {
                        int iBlockTextLength = blockTextLength(i);
                        if (Math.max(0, Math.min(i == startCell ? startOffset : 0, iBlockTextLength)) < Math.max(0, Math.min(i == endCell ? endOffset : iBlockTextLength, iBlockTextLength))) {
                            return true;
                        }
                    }
                    i++;
                }
            }
        }
        return false;
    }

    static boolean isHeading(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
    }

    boolean isSelectionAllHeadings() {
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
        if (articleTextSelectionHelper != null && articleTextSelectionHelper.isInSelectionMode()) {
            int startCell = this.textSelectionHelper.getStartCell();
            int endCell = this.textSelectionHelper.getEndCell();
            if (startCell >= 0 && endCell >= 0 && endCell >= startCell) {
                boolean z = false;
                while (startCell <= endCell) {
                    BlockRow blockRowRowForCell = rowForCell(startCell);
                    if (blockRowRowForCell != null) {
                        if (!isHeading(blockRowRowForCell.block)) {
                            return false;
                        }
                        z = true;
                    }
                    startCell++;
                }
                return z;
            }
        }
        return false;
    }

    private static boolean endsWithOwnParagraph(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote);
    }

    private static boolean demotesToParagraph(TL_iv.PageBlock pageBlock) {
        return isHeading(pageBlock) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote);
    }

    public void setAllowTapAboveContent(boolean z) {
        this.allowTapAboveContent = z;
    }

    public void setInsets(int i, int i2, int i3) {
        this.bottomInset = i;
        this.imeInset = i2;
        this.emojiPadding = i3;
    }

    public boolean handleSelectionTouch(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iv.RichEditorListView.handleSelectionTouch(android.view.MotionEvent):boolean");
    }

    public void lambda$handleSelectionTouch$10() {
        if (this.pressTarget == null || this.textSelectionHelper.isInSelectionMode()) {
            return;
        }
        if (tryStartTextSelection(this.pressTarget, this.pressX, this.pressY)) {
            this.longPressConsumed = true;
            return;
        }
        int left = (int) ((this.pressX - this.pressTarget.getLeft()) - getLeft());
        int top = (int) ((this.pressY - this.pressTarget.getTop()) - getTop());
        View view = this.pressTarget;
        if (view instanceof RichTableCell) {
            RichTableCell richTableCell = (RichTableCell) view;
            if (handleTableHandleTap(richTableCell, left, top)) {
                try {
                    richTableCell.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                this.longPressConsumed = true;
                return;
            }
            TL_iv.pageTableCell pagetablecellFindCellAt = richTableCell.findCellAt(left, top);
            if (pagetablecellFindCellAt != null) {
                enterCellSelectionMode(richTableCell, pagetablecellFindCellAt);
                try {
                    richTableCell.performHapticFeedback(0);
                } catch (Exception unused2) {
                }
                this.longPressConsumed = true;
                return;
            }
            startBlockDrag(this.pressTarget);
            return;
        }
        if (isPressOnEmptyEditText(view, left, top)) {
            this.longPressConsumed = true;
        } else {
            startBlockDrag(this.pressTarget);
        }
    }

    private boolean tryStartTextSelection(View view, float f, float f2) {
        if (view != 0 && !this.textSelectionHelper.isInSelectionMode()) {
            int left = (int) ((f - view.getLeft()) - getLeft());
            int top = (int) ((f2 - view.getTop()) - getTop());
            if (view instanceof RichTextCell) {
                RichTextCell richTextCell = (RichTextCell) view;
                if (richTextCell.isPressOnText(left, top)) {
                    this.textSelectionHelper.setMaybeView(left, top, richTextCell);
                    this.textSelectionHelper.trySelect(richTextCell);
                    return true;
                }
            } else if (view instanceof RichTableCell) {
                RichTableCell richTableCell = (RichTableCell) view;
                if (richTableCell.isPressOnText(left, top) || richTableCell.isPressOnTitle(left, top)) {
                    this.textSelectionHelper.setMaybeView(left, top, richTableCell);
                    this.textSelectionHelper.trySelect(richTableCell);
                    return true;
                }
            } else if (view instanceof RichCaptionHost) {
                if (((RichCaptionHost) view).isPressOnCaption(left, top)) {
                    this.textSelectionHelper.setMaybeView(left, top, view);
                    this.textSelectionHelper.trySelect(view);
                    return true;
                }
            } else if (view instanceof RichDetailsCell) {
                RichDetailsCell richDetailsCell = (RichDetailsCell) view;
                if (richDetailsCell.isPressOnText(left, top)) {
                    this.textSelectionHelper.setMaybeView(left, top, richDetailsCell);
                    this.textSelectionHelper.trySelect(richDetailsCell);
                    return true;
                }
            } else if ((view instanceof RichMathCell) && ((RichMathCell) view).isPressOnMath(left, top)) {
                this.textSelectionHelper.setMaybeView(left, top, view);
                this.textSelectionHelper.trySelect(view);
                return true;
            }
        }
        return false;
    }

    private View findCellUnder(int i, int i2) {
        int top = i2 - getTop();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (top >= childAt.getTop() && top < childAt.getBottom() && i >= childAt.getLeft() && i < childAt.getRight()) {
                return childAt;
            }
        }
        return null;
    }

    private boolean isTapBelowContent(float f, float f2) {
        View view = (View) getParent();
        if (view == null || f < getLeft() || f > getRight()) {
            return false;
        }
        int top = getTop() + getPaddingTop();
        for (int i = 0; i < getChildCount(); i++) {
            top = Math.max(top, getTop() + getChildAt(i).getBottom());
        }
        return f2 >= ((float) top) && f2 <= ((float) ((view.getHeight() - AndroidUtilities.dp(60.0f)) - Math.max(Math.max(this.emojiPadding, this.bottomInset), this.imeInset)));
    }

    private boolean isTapAboveContent(float f, float f2) {
        int top;
        if (!this.allowTapAboveContent || f < getLeft() || f > getRight()) {
            return false;
        }
        int i = 0;
        while (true) {
            if (i >= getChildCount()) {
                top = Integer.MAX_VALUE;
                break;
            }
            View childAt = getChildAt(i);
            if (getChildAdapterPosition(childAt) == 0) {
                top = getTop() + childAt.getTop();
                break;
            }
            i++;
        }
        return top != Integer.MAX_VALUE && f2 >= ((float) (getTop() + AndroidUtilities.dp(60.0f))) && f2 <= ((float) top);
    }

    private void onTapAboveContent() {
        BlockRow blockRow = this.rows.isEmpty() ? null : (BlockRow) this.rows.get(0);
        if (blockRow != null && !isNonText(blockRow.block) && !blockRow.detailsEnd && !isDetailsHeader(blockRow) && !endsWithOwnParagraph(blockRow.block)) {
            lambda$onTapAboveContent$11(blockRow);
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        final BlockRow blockRow2 = new BlockRow(new TL_iv.pageBlockParagraph());
        this.rows.add(0, blockRow2);
        this.adapter.update(false);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        post(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onTapAboveContent$11(blockRow2);
            }
        });
    }

    public void focusForDraft() {
        if (focusForDraftInternal()) {
            return;
        }
        post(new Runnable() {
            @Override
            public final void run() {
                this.f$0.focusForDraftInternal();
            }
        });
    }

    public boolean focusForDraftInternal() {
        BlockRow blockRow;
        if (this.rows.isEmpty()) {
            blockRow = null;
        } else {
            ArrayList arrayList = this.rows;
            blockRow = (BlockRow) arrayList.get(arrayList.size() - 1);
        }
        if (blockRow != null && !isNonText(blockRow.block) && !blockRow.detailsEnd && !isDetailsHeader(blockRow) && !endsWithOwnParagraph(blockRow.block)) {
            if (!(findViewByItemObject(blockRow) instanceof RichTextCell)) {
                return false;
            }
            lambda$onTapBelowContent$13(blockRow);
        } else {
            RichEditorHistory richEditorHistory = this.history;
            if (richEditorHistory != null) {
                richEditorHistory.flush();
            }
            final BlockRow blockRow2 = new BlockRow(new TL_iv.pageBlockParagraph());
            this.rows.add(blockRow2);
            this.adapter.update(false);
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
            post(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$focusForDraftInternal$12(blockRow2);
                }
            });
        }
        return true;
    }

    private void onTapBelowContent() {
        BlockRow blockRow;
        if (this.rows.isEmpty()) {
            blockRow = null;
        } else {
            blockRow = (BlockRow) this.rows.get(r0.size() - 1);
        }
        if (blockRow != null && !isNonText(blockRow.block) && !blockRow.detailsEnd && !isDetailsHeader(blockRow) && !endsWithOwnParagraph(blockRow.block)) {
            lambda$onTapBelowContent$13(blockRow);
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        final BlockRow blockRow2 = new BlockRow(new TL_iv.pageBlockParagraph());
        this.rows.add(blockRow2);
        this.adapter.update(false);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        post(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onTapBelowContent$13(blockRow2);
            }
        });
    }

    @Override
    protected void onReorderStart(RecyclerView.ViewHolder viewHolder) {
        this.draggingRow = rowFromHolder(viewHolder);
        this.draggingOverTrash = false;
        Delegate delegate = this.delegate;
        if (delegate != null) {
            delegate.onReorderStart();
        }
    }

    @Override
    protected void onReorderMoved(RecyclerView.ViewHolder viewHolder) {
        if (this.delegate == null || viewHolder == null) {
            return;
        }
        viewHolder.itemView.getLocationOnScreen(new int[2]);
        this.draggingOverTrash = this.delegate.onReorderMove(r0[0] + (r5.getWidth() / 2.0f), r0[1] + r5.getHeight());
    }

    @Override
    protected void onReorderEnd(RecyclerView.ViewHolder viewHolder) {
        Delegate delegate = this.delegate;
        if (delegate != null) {
            delegate.onReorderEnd();
        }
    }

    @Override
    protected boolean isReorderRemoving() {
        return this.draggingOverTrash;
    }

    @Override
    protected void onReorderRemove(RecyclerView.ViewHolder viewHolder) {
        BlockRow blockRow = this.draggingRow;
        this.draggingRow = null;
        this.draggingOverTrash = false;
        if (blockRow == null) {
            if (viewHolder != null) {
                viewHolder.itemView.setTranslationX(0.0f);
                viewHolder.itemView.setTranslationY(0.0f);
                return;
            }
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        removeRow(blockRow);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        Delegate delegate = this.delegate;
        if (delegate != null) {
            delegate.onContentChanged();
        }
    }

    private BlockRow rowFromHolder(RecyclerView.ViewHolder viewHolder) {
        int adapterPosition;
        UItem item;
        if (viewHolder == null || (adapterPosition = viewHolder.getAdapterPosition()) < 0 || (item = this.adapter.getItem(adapterPosition)) == null) {
            return null;
        }
        Object obj = item.object;
        if (obj instanceof BlockRow) {
            return (BlockRow) obj;
        }
        return null;
    }

    private boolean isPressOnEmptyEditText(View view, int i, int i2) {
        if (view instanceof RichTextCell) {
            return ((RichTextCell) view).isPressOnEmptyEditText(i, i2);
        }
        if (view instanceof RichDetailsCell) {
            return ((RichDetailsCell) view).isPressOnEmptyEditText(i, i2);
        }
        return false;
    }

    private void startBlockDrag(View view) {
        RecyclerView.ViewHolder childViewHolder;
        int adapterPosition;
        if (view == null || this.itemTouchHelper == null || !isReorderAllowed() || (childViewHolder = getChildViewHolder(view)) == null || (adapterPosition = childViewHolder.getAdapterPosition()) < 0 || !this.adapter.isReorderItem(adapterPosition)) {
            return;
        }
        this.longPressConsumed = true;
        if (this.textSelectionHelper.isInSelectionMode()) {
            this.textSelectionHelper.clear();
        }
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        this.itemTouchHelper.startDrag(childViewHolder);
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

    public void hideEditTextActionModes() {
        for (int i = 0; i < getChildCount(); i++) {
            KeyEvent.Callback childAt = getChildAt(i);
            if (childAt instanceof RichTextCell) {
                ((RichTextCell) childAt).hideActionModes();
            } else if (childAt instanceof RichTableCell) {
                ((RichTableCell) childAt).hideActionModes();
            } else if (childAt instanceof RichCaptionHost) {
                ((RichCaptionHost) childAt).getCaptionEditText().hideActionMode();
            } else if (childAt instanceof RichDetailsCell) {
                ((RichDetailsCell) childAt).getEditText().hideActionMode();
            }
        }
    }

    public void finishEditTextActionModes() {
        for (int i = 0; i < getChildCount(); i++) {
            KeyEvent.Callback childAt = getChildAt(i);
            if (childAt instanceof RichTextCell) {
                ((RichTextCell) childAt).finishActionModes();
            } else if (childAt instanceof RichCaptionHost) {
                ((RichCaptionHost) childAt).getCaptionEditText().finishActionMode();
            } else if (childAt instanceof RichDetailsCell) {
                ((RichDetailsCell) childAt).getEditText().finishActionMode();
            }
        }
    }

    public boolean deselectIfAny() {
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
        if (articleTextSelectionHelper != null && articleTextSelectionHelper.isInSelectionMode()) {
            this.textSelectionHelper.clear();
            return true;
        }
        if (this.activeCellSelectionTable == null) {
            return false;
        }
        exitCellSelectionMode();
        return true;
    }

    public void restoreFocusAt(int i, int i2, int i3) {
        if (i < 0) {
            return;
        }
        KeyEvent.Callback callbackFindViewByPosition = this.layoutManager.findViewByPosition(i);
        if (callbackFindViewByPosition instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) callbackFindViewByPosition;
            RichEditText authorEditText = (i2 == 1 && richTextCell.isAuthorVisible()) ? richTextCell.getAuthorEditText() : richTextCell.getEditText();
            authorEditText.requestEditFocusRebuild();
            authorEditText.setSelection(Math.max(0, Math.min(i3, authorEditText.length())));
            return;
        }
        if (callbackFindViewByPosition instanceof RichTableCell) {
            RichTableCell richTableCell = (RichTableCell) callbackFindViewByPosition;
            RichEditText richEditTextEditTextForChildPos = richTableCell.editTextForChildPos(i2);
            if (richEditTextEditTextForChildPos == null) {
                richEditTextEditTextForChildPos = richTableCell.editTextForChildPos(richTableCell.titleChildPos());
            }
            if (richEditTextEditTextForChildPos == null) {
                return;
            }
            richEditTextEditTextForChildPos.requestEditFocusRebuild();
            richEditTextEditTextForChildPos.setSelection(Math.max(0, Math.min(i3, richEditTextEditTextForChildPos.length())));
            return;
        }
        if (callbackFindViewByPosition instanceof RichCaptionHost) {
            RichEditText captionEditText = ((RichCaptionHost) callbackFindViewByPosition).getCaptionEditText();
            captionEditText.requestEditFocusRebuild();
            captionEditText.setSelection(Math.max(0, Math.min(i3, captionEditText.length())));
        }
    }

    public boolean restoreFocusAtScreenPoint(float f, float f2) {
        for (int i = 0; i < getChildCount(); i++) {
            KeyEvent.Callback childAt = getChildAt(i);
            if (childAt instanceof RichTextCell) {
                RichTextCell richTextCell = (RichTextCell) childAt;
                if (placeCaretAtScreenPoint(richTextCell.getEditText(), f, f2)) {
                    return true;
                }
                if (richTextCell.isAuthorVisible() && placeCaretAtScreenPoint(richTextCell.getAuthorEditText(), f, f2)) {
                    return true;
                }
            } else if (childAt instanceof RichCaptionHost) {
                if (placeCaretAtScreenPoint(((RichCaptionHost) childAt).getCaptionEditText(), f, f2)) {
                    return true;
                }
            } else if ((childAt instanceof RichDetailsCell) && placeCaretAtScreenPoint(((RichDetailsCell) childAt).getEditText(), f, f2)) {
                return true;
            }
        }
        return false;
    }

    private boolean placeCaretAtScreenPoint(RichEditText richEditText, float f, float f2) {
        if (richEditText != null && richEditText.getVisibility() == 0) {
            richEditText.getLocationOnScreen(new int[2]);
            float f3 = f - r1[0];
            float f4 = f2 - r1[1];
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

    public TextSelectionHelper.ArticleTextSelectionHelper getTextSelectionHelper() {
        return this.textSelectionHelper;
    }

    RichMapCell.Delegate getMapDelegate() {
        return this.mapDelegate;
    }

    private void openMathEditor(BlockRow blockRow) {
        if (blockRow != null) {
            TL_iv.PageBlock pageBlock = blockRow.block;
            if (pageBlock instanceof TL_iv.pageBlockMath) {
                final TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                ChatAttachAlertRichLayout.showEditLatexSheet(getContext(), TextUtils.isEmpty(pageblockmath.source) ? "" : pageblockmath.source, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        this.f$0.lambda$openMathEditor$14(pageblockmath, (String) obj);
                    }
                }, this.resourcesProvider);
            }
        }
    }

    public void lambda$openMathEditor$14(TL_iv.pageBlockMath pageblockmath, String str) {
        if (TextUtils.equals(str, pageblockmath.source)) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        pageblockmath.source = str;
        this.adapter.update(false);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        this.delegate.onContentChanged();
    }

    public void deleteDetails(BlockRow blockRow) {
        int iIndexOf = this.rows.indexOf(blockRow);
        if (iIndexOf < 0 || !isDetailsHeader(blockRow)) {
            return;
        }
        int iMatchingDetailsEnd = matchingDetailsEnd(iIndexOf);
        if (iMatchingDetailsEnd >= this.rows.size()) {
            iMatchingDetailsEnd = this.rows.size() - 1;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        while (iMatchingDetailsEnd >= iIndexOf) {
            this.rows.remove(iMatchingDetailsEnd);
            iMatchingDetailsEnd--;
        }
        final BlockRow blockRow2 = null;
        BlockRow blockRow3 = iIndexOf > 0 ? (BlockRow) this.rows.get(iIndexOf - 1) : null;
        if (blockRow3 != null && !blockRow3.detailsEnd && !isDetailsHeader(blockRow3) && !isNonText(blockRow3.block)) {
            blockRow2 = blockRow3;
        }
        if (this.rows.isEmpty()) {
            blockRow2 = new BlockRow(new TL_iv.pageBlockParagraph());
            this.rows.add(blockRow2);
        }
        this.adapter.update(false);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        if (blockRow2 != null) {
            post(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$deleteDetails$15(blockRow2);
                }
            });
        }
    }

    public void toggleDetails(BlockRow blockRow) {
        if (isDetailsHeader(blockRow)) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) blockRow.block;
            RichEditorHistory richEditorHistory = this.history;
            if (richEditorHistory != null) {
                richEditorHistory.flush();
            }
            pageblockdetails.open = !pageblockdetails.open;
            this.adapter.update(true);
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
        }
    }

    public void onDetailsTitleEnter(BlockRow blockRow) {
        int iIndexOf = this.rows.indexOf(blockRow);
        if (iIndexOf < 0) {
            return;
        }
        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) blockRow.block;
        if (!pageblockdetails.open) {
            pageblockdetails.open = true;
            this.adapter.update(true);
        }
        int i = iIndexOf + 1;
        if (i >= this.rows.size() || ((BlockRow) this.rows.get(i)).detailsEnd || isDetailsHeader((BlockRow) this.rows.get(i))) {
            return;
        }
        final BlockRow blockRow2 = (BlockRow) this.rows.get(i);
        post(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onDetailsTitleEnter$16(blockRow2);
            }
        });
    }

    public void lambda$new$17(RichTableCell richTableCell) {
        if (richTableCell != this.activeCellSelectionTable) {
            return;
        }
        if (!richTableCell.hasCellSelection()) {
            exitCellSelectionMode();
        } else {
            showTableCellMenu(richTableCell);
        }
    }

    private void beginCellSelection(RichTableCell richTableCell) {
        RichTableCell richTableCell2 = this.activeCellSelectionTable;
        if (richTableCell2 != null && richTableCell2 != richTableCell) {
            richTableCell2.clearCellSelection();
        }
        this.activeCellSelectionTable = richTableCell;
        this.dotSelectedCol = -1;
        this.dotSelectedRow = -1;
        richTableCell.setCellSelectionListener(this.cellSelectionListener);
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
        if (articleTextSelectionHelper != null && articleTextSelectionHelper.isInSelectionMode()) {
            this.textSelectionHelper.clear();
        }
        setEditTextsLocked(true);
    }

    private boolean isDotSelection() {
        return this.dotSelectedRow >= 0 || this.dotSelectedCol >= 0;
    }

    void enterCellSelectionMode(RichTableCell richTableCell, TL_iv.pageTableCell pagetablecell) {
        beginCellSelection(richTableCell);
        richTableCell.addCellToSelection(pagetablecell);
    }

    private boolean handleTableHandleTap(RichTableCell richTableCell, int i, int i2) {
        int iFindRowHandleAt = richTableCell.findRowHandleAt(i, i2);
        if (iFindRowHandleAt >= 0) {
            if (richTableCell == this.activeCellSelectionTable && this.dotSelectedRow == iFindRowHandleAt) {
                exitCellSelectionMode();
            } else {
                beginCellSelection(richTableCell);
                richTableCell.selectWholeRow(iFindRowHandleAt);
                this.dotSelectedRow = iFindRowHandleAt;
            }
            return true;
        }
        int iFindColHandleAt = richTableCell.findColHandleAt(i, i2);
        if (iFindColHandleAt < 0) {
            return false;
        }
        if (richTableCell == this.activeCellSelectionTable && this.dotSelectedCol == iFindColHandleAt) {
            exitCellSelectionMode();
        } else {
            beginCellSelection(richTableCell);
            richTableCell.selectWholeColumn(iFindColHandleAt);
            this.dotSelectedCol = iFindColHandleAt;
        }
        return true;
    }

    private void exitCellSelectionMode() {
        dismissTableCellMenu();
        RichTableCell richTableCell = this.activeCellSelectionTable;
        if (richTableCell != null) {
            richTableCell.clearCellSelection();
            this.activeCellSelectionTable = null;
        }
        this.dotSelectedCol = -1;
        this.dotSelectedRow = -1;
        setEditTextsLocked(false);
    }

    private void dismissTableCellMenu() {
        ItemOptions itemOptions = this.tableCellMenu;
        if (itemOptions != null) {
            this.tableCellMenu = null;
            itemOptions.dismiss();
        }
    }

    RichTableCell findFocusedTableCell() {
        View viewFindFocus = findFocus();
        if (viewFindFocus instanceof RichEditText) {
            return findTableCellAncestor(viewFindFocus);
        }
        return null;
    }

    TL_iv.pageTableCell focusedCellOf(RichTableCell richTableCell) {
        RichTableCellHost richTableCellHostFindHostContaining;
        View viewFindFocus = findFocus();
        if ((viewFindFocus instanceof RichEditText) && (richTableCellHostFindHostContaining = richTableCell.findHostContaining(viewFindFocus)) != null) {
            return richTableCellHostFindHostContaining.cell;
        }
        return null;
    }

    private View tableMenuAnchor(RichTableCell richTableCell, boolean z) {
        RichTableCellHost richTableCellHostHostForAnchor;
        TableModel model = richTableCell.getModel();
        if (model == null) {
            return richTableCell;
        }
        int i = Integer.MAX_VALUE;
        int i2 = z ? -1 : Integer.MAX_VALUE;
        TL_iv.pageTableCell pagetablecell = null;
        for (TL_iv.pageTableCell pagetablecell2 : richTableCell.getSelectedCells()) {
            int iAnchorColOf = model.anchorColOf(pagetablecell2);
            int iAnchorRowOf = z ? (model.anchorRowOf(pagetablecell2) + TableModel.spanRow(pagetablecell2)) - 1 : model.anchorRowOf(pagetablecell2);
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
        return (pagetablecell == null || (richTableCellHostHostForAnchor = richTableCell.getGrid().hostForAnchor(pagetablecell)) == null) ? richTableCell : richTableCellHostHostForAnchor;
    }

    void showTableCellMenu(final RichTableCell richTableCell) {
        int i;
        CharSequence string;
        boolean z;
        TableModel model = richTableCell.getModel();
        if (model == null) {
            return;
        }
        Set<TL_iv.pageTableCell> selectedCells = richTableCell.getSelectedCells();
        if (selectedCells.isEmpty()) {
            return;
        }
        int size = selectedCells.size();
        int i2 = (size < 2 || !computeCanMerge(model, selectedCells)) ? 0 : 1;
        int i3 = (size == 1 && computeHasSpan(selectedCells.iterator().next())) ? 1 : 0;
        boolean zComputeSpansFullRows = computeSpansFullRows(model, selectedCells);
        boolean zComputeSpansFullColumns = computeSpansFullColumns(model, selectedCells);
        boolean zComputeAllSelected = computeAllSelected(model, selectedCells);
        int i4 = (!zComputeSpansFullRows || zComputeAllSelected || distinctSelectedRows(model, selectedCells) >= model.rowCount) ? 0 : 1;
        int i5 = (!zComputeSpansFullColumns || zComputeAllSelected || distinctSelectedCols(model, selectedCells) >= model.colCount) ? 0 : 1;
        boolean z2 = zComputeSpansFullColumns && model.colCount < MessagesController.getInstance(this.currentAccount).config.richMessageMaxTableCols.get();
        dismissTableCellMenu();
        int iDp = AndroidUtilities.dp(((i2 + 1 + i3 + (z2 ? 2 : 0) + (zComputeSpansFullRows ? 2 : 0) + i5 + i4 + (zComputeAllSelected ? 1 : 0)) * 48) + 68);
        View viewTableMenuAnchor = tableMenuAnchor(richTableCell, false);
        int[] iArr = new int[2];
        viewTableMenuAnchor.getLocationOnScreen(iArr);
        if ((iArr[1] - iDp) - AndroidUtilities.dp(8.0f) < AndroidUtilities.statusBarHeight + AndroidUtilities.dp(8.0f)) {
            viewTableMenuAnchor = tableMenuAnchor(richTableCell, true);
        }
        final ItemOptions itemOptionsMakeMenu = this.delegate.makeMenu(viewTableMenuAnchor);
        itemOptionsMakeMenu.setDimAlpha(0);
        itemOptionsMakeMenu.setDrawScrim(false);
        itemOptionsMakeMenu.allowShowingOnTopOfKeyboard();
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(getContext());
        textView.setText(LocaleController.getString(R.string.ArticleAlignment));
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        textView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 0.0f, 5.0f, 0.0f, 4.0f));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-2, -2, 17));
        RichEditor.Button accent = new RichEditor.Button(getContext(), R.drawable.iv_align_horiz_left, this.resourcesProvider).setRoundRadius(4).setAccent(false);
        linearLayout2.addView(accent, LayoutHelper.createLinear(32, 32));
        int i6 = i4;
        RichEditor.Button accent2 = new RichEditor.Button(getContext(), R.drawable.iv_align_horiz_middle, this.resourcesProvider).setRoundRadius(4).setAccent(false);
        linearLayout2.addView(accent2, LayoutHelper.createLinear(32, 32));
        int i7 = i5;
        RichEditor.Button accent3 = new RichEditor.Button(getContext(), R.drawable.iv_align_horiz_right, this.resourcesProvider).setRoundRadius(4).setAccent(false);
        final RichEditor.Button[] buttonArr = {accent, accent2, accent3};
        linearLayout2.addView(accent3, LayoutHelper.createLinear(32, 32));
        linearLayout2.addView(new Space(getContext()), LayoutHelper.createLinear(8, 0));
        RichEditor.Button accent4 = new RichEditor.Button(getContext(), R.drawable.iv_align_vert_top, this.resourcesProvider).setRoundRadius(4).setAccent(false);
        linearLayout2.addView(accent4, LayoutHelper.createLinear(32, 32));
        boolean z3 = z2;
        RichEditor.Button accent5 = new RichEditor.Button(getContext(), R.drawable.iv_align_vert_middle, this.resourcesProvider).setRoundRadius(4).setAccent(false);
        linearLayout2.addView(accent5, LayoutHelper.createLinear(32, 32));
        int i8 = i3;
        RichEditor.Button accent6 = new RichEditor.Button(getContext(), R.drawable.iv_align_vert_bottom, this.resourcesProvider).setRoundRadius(4).setAccent(false);
        final RichEditor.Button[] buttonArr2 = {accent4, accent5, accent6};
        linearLayout2.addView(accent6, LayoutHelper.createLinear(32, 32));
        itemOptionsMakeMenu.addView(linearLayout);
        int iCommonHorizontalAlign = richTableCell.commonHorizontalAlign();
        int iCommonVerticalAlign = richTableCell.commonVerticalAlign();
        int i9 = 0;
        while (i9 < 3) {
            buttonArr[i9].setSelected(i9 == iCommonHorizontalAlign);
            i9++;
        }
        int i10 = 0;
        while (i10 < 3) {
            buttonArr2[i10].setSelected(i10 == iCommonVerticalAlign);
            i10++;
        }
        for (final int i11 = 0; i11 < 3; i11++) {
            buttonArr[i11].setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    RichEditorListView.lambda$showTableCellMenu$18(richTableCell, i11, buttonArr, view);
                }
            });
        }
        for (final int i12 = 0; i12 < 3; i12++) {
            buttonArr2[i12].setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    RichEditorListView.lambda$showTableCellMenu$19(richTableCell, i12, buttonArr2, view);
                }
            });
        }
        itemOptionsMakeMenu.addSpaceGap();
        final boolean zAllSelectedHeader = richTableCell.allSelectedHeader();
        if (zAllSelectedHeader) {
            string = LocaleController.getString(R.string.ArticleRemoveHighlight);
        } else {
            if (zComputeSpansFullColumns) {
                i = R.string.ArticleHighlightColumn;
            } else {
                i = zComputeSpansFullRows ? R.string.ArticleHighlightRow : R.string.ArticleHighlightCell;
            }
            string = LocaleController.getString(i);
        }
        itemOptionsMakeMenu.add(zAllSelectedHeader ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, string, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$showTableCellMenu$20(richTableCell, zAllSelectedHeader);
            }
        });
        if (i2 != 0) {
            itemOptionsMakeMenu.add(R.drawable.iv_table_merge, LocaleController.getString(R.string.ArticleMergeCells), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$showTableCellMenu$21(richTableCell);
                }
            });
        }
        if (i8 != 0) {
            itemOptionsMakeMenu.add(R.drawable.iv_table_unmerge, LocaleController.getString(R.string.ArticleSplitCells), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$showTableCellMenu$22(richTableCell);
                }
            });
        }
        if (z3) {
            itemOptionsMakeMenu.add(R.drawable.iv_table_insert_left, LocaleController.getString(R.string.ArticleInsertLeft), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$showTableCellMenu$23(richTableCell);
                }
            });
            itemOptionsMakeMenu.add(R.drawable.iv_table_insert_right, LocaleController.getString(R.string.ArticleInsertRight), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$showTableCellMenu$24(richTableCell);
                }
            });
        }
        if (zComputeSpansFullRows) {
            itemOptionsMakeMenu.add(R.drawable.iv_table_insert_top, LocaleController.getString(R.string.ArticleInsertAbove), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$showTableCellMenu$25(richTableCell);
                }
            });
            itemOptionsMakeMenu.add(R.drawable.iv_table_insert_bottom, LocaleController.getString(R.string.ArticleInsertBelow), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$showTableCellMenu$26(richTableCell);
                }
            });
        }
        if (i7 != 0) {
            z = true;
            itemOptionsMakeMenu.add(R.drawable.iv_table_remove, LocaleController.getString(R.string.ArticleDeleteColumn), true, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$showTableCellMenu$27(richTableCell);
                }
            });
        } else {
            z = true;
        }
        if (i6 != 0) {
            itemOptionsMakeMenu.add(R.drawable.iv_table_remove, LocaleController.getString(R.string.ArticleDeleteRow), z, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$showTableCellMenu$28(richTableCell);
                }
            });
        }
        if (zComputeAllSelected) {
            itemOptionsMakeMenu.add(R.drawable.iv_table_remove, LocaleController.getString(R.string.ArticleDeleteTable), z, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$showTableCellMenu$29(richTableCell);
                }
            });
        }
        itemOptionsMakeMenu.setOnDismiss(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$showTableCellMenu$30(itemOptionsMakeMenu);
            }
        });
        this.tableCellMenu = itemOptionsMakeMenu;
        itemOptionsMakeMenu.show();
    }

    public static void lambda$showTableCellMenu$18(RichTableCell richTableCell, int i, RichEditor.Button[] buttonArr, View view) {
        richTableCell.applyHorizontalAlign(i);
        int i2 = 0;
        while (i2 < 3) {
            buttonArr[i2].setSelected(i2 == i);
            i2++;
        }
    }

    public static void lambda$showTableCellMenu$19(RichTableCell richTableCell, int i, RichEditor.Button[] buttonArr, View view) {
        richTableCell.applyVerticalAlign(i);
        int i2 = 0;
        while (i2 < 3) {
            buttonArr[i2].setSelected(i2 == i);
            i2++;
        }
    }

    public void lambda$showTableCellMenu$20(RichTableCell richTableCell, boolean z) {
        richTableCell.applyHeaderToggle(!z);
        exitCellSelectionMode();
    }

    public void lambda$showTableCellMenu$21(RichTableCell richTableCell) {
        richTableCell.applyMergeFromSelection();
        exitCellSelectionMode();
    }

    public void lambda$showTableCellMenu$22(RichTableCell richTableCell) {
        richTableCell.applyUnmergeFromSelection();
        exitCellSelectionMode();
    }

    public void lambda$showTableCellMenu$23(RichTableCell richTableCell) {
        richTableCell.applyInsertColumnFromSelection(true);
        exitCellSelectionMode();
    }

    public void lambda$showTableCellMenu$24(RichTableCell richTableCell) {
        richTableCell.applyInsertColumnFromSelection(false);
        exitCellSelectionMode();
    }

    public void lambda$showTableCellMenu$25(RichTableCell richTableCell) {
        richTableCell.applyInsertRowFromSelection(true);
        exitCellSelectionMode();
    }

    public void lambda$showTableCellMenu$26(RichTableCell richTableCell) {
        richTableCell.applyInsertRowFromSelection(false);
        exitCellSelectionMode();
    }

    public void lambda$showTableCellMenu$27(RichTableCell richTableCell) {
        richTableCell.applyDeleteColumnsFromSelection();
        exitCellSelectionMode();
    }

    public void lambda$showTableCellMenu$28(RichTableCell richTableCell) {
        richTableCell.applyDeleteRowsFromSelection();
        exitCellSelectionMode();
    }

    public void lambda$showTableCellMenu$29(RichTableCell richTableCell) {
        BlockRow row = richTableCell.getRow();
        exitCellSelectionMode();
        if (row != null) {
            RichEditorHistory richEditorHistory = this.history;
            if (richEditorHistory != null) {
                richEditorHistory.flush();
            }
            removeRow(row);
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
            Delegate delegate = this.delegate;
            if (delegate != null) {
                delegate.onContentChanged();
            }
        }
    }

    public void lambda$showTableCellMenu$30(ItemOptions itemOptions) {
        if (this.tableCellMenu == itemOptions) {
            this.tableCellMenu = null;
        }
    }

    private static boolean computeHasSpan(TL_iv.pageTableCell pagetablecell) {
        return TableModel.spanCol(pagetablecell) > 1 || TableModel.spanRow(pagetablecell) > 1;
    }

    private static boolean computeCanMerge(TableModel tableModel, Set set) {
        Iterator it = set.iterator();
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax = -1;
        int iMax2 = -1;
        while (it.hasNext()) {
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it.next();
            int iAnchorRowOf = tableModel.anchorRowOf(pagetablecell);
            int iAnchorColOf = tableModel.anchorColOf(pagetablecell);
            int iSpanRow = TableModel.spanRow(pagetablecell);
            int iSpanCol = TableModel.spanCol(pagetablecell);
            iMin2 = Math.min(iMin2, iAnchorRowOf);
            iMin = Math.min(iMin, iAnchorColOf);
            iMax2 = Math.max(iMax2, (iAnchorRowOf + iSpanRow) - 1);
            iMax = Math.max(iMax, (iAnchorColOf + iSpanCol) - 1);
        }
        HashSet hashSet = new HashSet();
        while (iMin2 <= iMax2) {
            for (int i = iMin; i <= iMax; i++) {
                if (iMin2 < 0 || i < 0 || iMin2 >= tableModel.rowCount || i >= tableModel.colCount) {
                    return false;
                }
                hashSet.add(tableModel.grid[iMin2][i]);
            }
            iMin2++;
        }
        return hashSet.equals(new HashSet(set));
    }

    private static boolean computeSpansFullRows(TableModel tableModel, Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(Integer.valueOf(tableModel.anchorRowOf((TL_iv.pageTableCell) it.next())));
        }
        if (hashSet.isEmpty()) {
            return false;
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Integer) it2.next()).intValue();
            if (iIntValue < 0 || iIntValue >= tableModel.rowCount) {
                return false;
            }
            for (int i = 0; i < tableModel.colCount; i++) {
                if (tableModel.anchorR[iIntValue][i] != iIntValue || !set.contains(tableModel.grid[iIntValue][i])) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean computeSpansFullColumns(TableModel tableModel, Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(Integer.valueOf(tableModel.anchorColOf((TL_iv.pageTableCell) it.next())));
        }
        if (hashSet.isEmpty()) {
            return false;
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Integer) it2.next()).intValue();
            if (iIntValue < 0 || iIntValue >= tableModel.colCount) {
                return false;
            }
            for (int i = 0; i < tableModel.rowCount; i++) {
                if (tableModel.anchorC[i][iIntValue] != iIntValue || !set.contains(tableModel.grid[i][iIntValue])) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean computeAllSelected(TableModel tableModel, Set set) {
        if (set.isEmpty() || tableModel.rowCount <= 0 || tableModel.colCount <= 0) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < tableModel.rowCount; i++) {
            for (int i2 = 0; i2 < tableModel.colCount; i2++) {
                hashSet.add(tableModel.grid[i][i2]);
            }
        }
        return hashSet.equals(new HashSet(set));
    }

    private static int distinctSelectedRows(TableModel tableModel, Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(Integer.valueOf(tableModel.anchorRowOf((TL_iv.pageTableCell) it.next())));
        }
        return hashSet.size();
    }

    private static int distinctSelectedCols(TableModel tableModel, Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(Integer.valueOf(tableModel.anchorColOf((TL_iv.pageTableCell) it.next())));
        }
        return hashSet.size();
    }

    void handleSlashCommand(BlockRow blockRow, int i) {
        this.pendingMediaRow = null;
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        clearRowText(blockRow);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        switch (i) {
            case 1:
                this.delegate.onOpenAttachRequest(74, 3);
                break;
            case 2:
                this.delegate.onOpenAttachRequest(74, 6);
                break;
            case 3:
                openLatexEditorAndAdd();
                break;
            case 4:
            case 5:
                this.delegate.onOpenAttachRequest(74, 1);
                break;
            case 6:
                insertDetails();
                break;
        }
    }

    private void clearRowText(BlockRow blockRow) {
        if (blockRow == null) {
            return;
        }
        RichTextCell.applyTextToBlock(blockRow.block, "");
        View viewFindViewByItemObject = findViewByItemObject(blockRow);
        if (viewFindViewByItemObject instanceof RichTextCell) {
            ((RichTextCell) viewFindViewByItemObject).getEditText().setTextSilently("");
        }
    }

    private void openLatexEditorAndAdd() {
        ChatAttachAlertRichLayout.showEditLatexSheet(getContext(), "", new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$openLatexEditorAndAdd$31((String) obj);
            }
        }, this.resourcesProvider);
    }

    public void lambda$openLatexEditorAndAdd$31(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
        pageblockmath.source = str;
        addBlock(pageblockmath);
    }

    public RichEditorHistory.FocusState captureFocusState() {
        View viewFindFocus = findFocus();
        if (!(viewFindFocus instanceof RichEditText)) {
            return RichEditorHistory.FocusState.NONE;
        }
        ?? r0 = (RichEditText) viewFindFocus;
        int selectionStart = r0.getSelectionStart();
        int selectionEnd = r0.getSelectionEnd();
        ?? FindTableCellAncestor = findTableCellAncestor(r0);
        if (FindTableCellAncestor != 0 && FindTableCellAncestor.getRow() != null) {
            if (r0 == FindTableCellAncestor.getTitleEditText()) {
                return new RichEditorHistory.FocusState(FindTableCellAncestor.getRow().id, FindTableCellAncestor.titleChildPos(), selectionStart, selectionEnd);
            }
            RichTableCellHost richTableCellHostFindHostContaining = FindTableCellAncestor.findHostContaining(r0);
            return new RichEditorHistory.FocusState(FindTableCellAncestor.getRow().id, richTableCellHostFindHostContaining != null ? FindTableCellAncestor.childPosForAnchor(richTableCellHostFindHostContaining.cell) : -1, selectionStart, selectionEnd);
        }
        RichCaptionHost richCaptionHostFindCaptionHostAncestor = findCaptionHostAncestor(r0);
        if (richCaptionHostFindCaptionHostAncestor != null && richCaptionHostFindCaptionHostAncestor.getRow() != null) {
            return new RichEditorHistory.FocusState(richCaptionHostFindCaptionHostAncestor.getRow().id, -1, selectionStart, selectionEnd);
        }
        while (r0 != 0 && !(r0 instanceof RichTextCell)) {
            Object parent = r0.getParent();
            r0 = parent instanceof View ? (View) parent : 0;
        }
        if (r0 instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) r0;
            if (richTextCell.getRow() != null) {
                return new RichEditorHistory.FocusState(richTextCell.getRow().id, -1, selectionStart, selectionEnd);
            }
        }
        return RichEditorHistory.FocusState.NONE;
    }

    public void restoreFromHistory(List list, final RichEditorHistory.FocusState focusState) {
        this.textSelectionHelper.clear();
        this.rows.clear();
        this.rows.addAll(list);
        renumberAllRuns();
        this.adapter.update(false);
        if (focusState == null || focusState.rowId < 0) {
            return;
        }
        post(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$restoreFromHistory$32(focusState);
            }
        });
    }

    public void lambda$restoreFromHistory$32(RichEditorHistory.FocusState focusState) {
        int iIndexOfRowId = indexOfRowId(focusState.rowId);
        if (iIndexOfRowId < 0) {
            return;
        }
        KeyEvent.Callback callbackFindViewByPosition = this.layoutManager.findViewByPosition(iIndexOfRowId);
        if (callbackFindViewByPosition instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) callbackFindViewByPosition;
            richTextCell.requestEditFocus();
            RichEditText editText = richTextCell.getEditText();
            int length = editText.length();
            editText.setSelection(Math.max(0, Math.min(focusState.selStart, length)), Math.max(0, Math.min(focusState.selEnd, length)));
            return;
        }
        if (callbackFindViewByPosition instanceof RichTableCell) {
            RichTableCell richTableCell = (RichTableCell) callbackFindViewByPosition;
            RichEditText richEditTextEditTextForChildPos = richTableCell.editTextForChildPos(focusState.childIndex);
            if (richEditTextEditTextForChildPos == null) {
                richEditTextEditTextForChildPos = richTableCell.editTextForChildPos(richTableCell.titleChildPos());
            }
            if (richEditTextEditTextForChildPos == null) {
                return;
            }
            richEditTextEditTextForChildPos.requestEditFocus();
            int length2 = richEditTextEditTextForChildPos.length();
            richEditTextEditTextForChildPos.setSelection(Math.max(0, Math.min(focusState.selStart, length2)), Math.max(0, Math.min(focusState.selEnd, length2)));
            return;
        }
        if (callbackFindViewByPosition instanceof RichCaptionHost) {
            RichEditText captionEditText = ((RichCaptionHost) callbackFindViewByPosition).getCaptionEditText();
            captionEditText.requestEditFocus();
            int length3 = captionEditText.length();
            captionEditText.setSelection(Math.max(0, Math.min(focusState.selStart, length3)), Math.max(0, Math.min(focusState.selEnd, length3)));
        }
    }

    private int indexOfRowId(long j) {
        for (int i = 0; i < this.rows.size(); i++) {
            if (((BlockRow) this.rows.get(i)).id == j) {
                return i;
            }
        }
        return -1;
    }

    BlockRow rowForCell(int i) {
        if (i < 0 || i >= this.itemRows.size()) {
            return null;
        }
        return (BlockRow) this.itemRows.get(i);
    }

    private void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        this.itemRows.clear();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        boolean z = false;
        int size = -1;
        while (i < this.rows.size()) {
            BlockRow blockRow = (BlockRow) this.rows.get(i);
            if (blockRow.detailsEnd) {
                boolean z2 = size != -1;
                if (!arrayList2.isEmpty()) {
                    arrayList2.remove(arrayList2.size() - 1);
                }
                if (size != -1 && arrayList2.size() < size) {
                    size = -1;
                } else if (!z2) {
                    if (z) {
                        universalAdapter.reorderSectionEnd();
                        z = false;
                    }
                    arrayList.add(RichDetailsEndCell.Factory.of(blockRow));
                    this.itemRows.add(blockRow);
                }
            } else {
                boolean z3 = size != -1;
                if (isDetailsHeader(blockRow)) {
                    if (!z3) {
                        boolean z4 = ((TL_iv.pageBlockDetails) blockRow.block).open;
                        if (!arrayList2.isEmpty() || z4) {
                            if (z) {
                                universalAdapter.reorderSectionEnd();
                                z = false;
                            }
                        } else if (!z) {
                            universalAdapter.reorderSectionStart();
                            z = true;
                        }
                        arrayList.add(RichDetailsCell.Factory.of(blockRow, this.detailsDelegate));
                        this.itemRows.add(blockRow);
                        if (!z4) {
                            size = arrayList2.size() + 1;
                        }
                    }
                    arrayList2.add(blockRow);
                } else if (!z3) {
                    if (arrayList2.isEmpty()) {
                        if (!z) {
                            universalAdapter.reorderSectionStart();
                            z = true;
                        }
                    } else if (z) {
                        universalAdapter.reorderSectionEnd();
                        z = false;
                    }
                    TL_iv.PageBlock pageBlock = blockRow.block;
                    if (pageBlock instanceof TL_iv.pageBlockDivider) {
                        arrayList.add(RichDividerCell.Factory.of(blockRow, this.dividerDelegate));
                    } else if (isMedia(pageBlock)) {
                        arrayList.add(RichMediaCell.Factory.of(blockRow, this.mediaDelegate));
                    } else {
                        TL_iv.PageBlock pageBlock2 = blockRow.block;
                        if (pageBlock2 instanceof TL_iv.pageBlockAudio) {
                            arrayList.add(RichAudioCell.Factory.of(blockRow, this.audioDelegate));
                        } else if (pageBlock2 instanceof TL_iv.pageBlockMap) {
                            arrayList.add(RichMapCell.Factory.of(blockRow, this.mapDelegate));
                        } else if (pageBlock2 instanceof TL_iv.pageBlockMath) {
                            arrayList.add(RichMathCell.Factory.of(blockRow, this.mathDelegate));
                        } else if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                            arrayList.add(RichTableCell.Factory.of(blockRow, this.tableDelegate));
                        } else {
                            arrayList.add(RichTextCell.Factory.of(blockRow, this.cellDelegate, this.rows.size() == 2 && i == 1 && (blockRow.block instanceof TL_iv.pageBlockParagraph) && (((BlockRow) this.rows.get(0)).block instanceof TL_iv.pageBlockHeading1)));
                        }
                    }
                    this.itemRows.add(blockRow);
                }
            }
            i++;
        }
        if (z) {
            universalAdapter.reorderSectionEnd();
        }
    }

    public void onRowsReordered(int i, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object obj = ((UItem) it.next()).object;
            if (obj instanceof BlockRow) {
                arrayList2.add((BlockRow) obj);
            }
        }
        if (arrayList2.size() < 2) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        int iMin = Integer.MAX_VALUE;
        int iMax = -1;
        int i2 = 0;
        while (it2.hasNext()) {
            BlockRow blockRow = (BlockRow) it2.next();
            int iIndexOf = this.rows.indexOf(blockRow);
            if (iIndexOf < 0) {
                return;
            }
            int size = iIndexOf + 1;
            if (isDetailsHeader(blockRow) && !((TL_iv.pageBlockDetails) blockRow.block).open) {
                int iMatchingDetailsEnd = matchingDetailsEnd(iIndexOf);
                size = iMatchingDetailsEnd >= this.rows.size() ? this.rows.size() : iMatchingDetailsEnd + 1;
            }
            arrayList3.add(new ArrayList(this.rows.subList(iIndexOf, size)));
            iMin = Math.min(iMin, iIndexOf);
            iMax = Math.max(iMax, size);
            i2 += size - iIndexOf;
        }
        if (i2 != iMax - iMin) {
            return;
        }
        ArrayList arrayList4 = new ArrayList(i2);
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.addAll((ArrayList) it3.next());
        }
        for (int i3 = 0; i3 < arrayList4.size(); i3++) {
            if (this.rows.get(iMin + i3) != arrayList4.get(i3)) {
                RichEditorHistory richEditorHistory = this.history;
                if (richEditorHistory != null) {
                    richEditorHistory.flush();
                }
                for (int i4 = 0; i4 < arrayList4.size(); i4++) {
                    this.rows.set(iMin + i4, (BlockRow) arrayList4.get(i4));
                }
                renumberAllRuns();
                RichEditorHistory richEditorHistory2 = this.history;
                if (richEditorHistory2 != null) {
                    richEditorHistory2.record();
                    return;
                }
                return;
            }
        }
    }

    private static boolean isMedia(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockVideo) || isGallery(pageBlock);
    }

    static boolean isGallery(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow);
    }

    static ArrayList galleryItems(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            return ((TL_iv.pageBlockCollage) pageBlock).items;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            return ((TL_iv.pageBlockSlideshow) pageBlock).items;
        }
        return null;
    }

    static List mediasOf(BlockRow blockRow) {
        if (blockRow == null) {
            return Collections.emptyList();
        }
        if (isGallery(blockRow.block)) {
            ArrayList arrayList = blockRow.medias;
            return arrayList != null ? arrayList : Collections.emptyList();
        }
        MediaUploadState mediaUploadState = blockRow.media;
        return mediaUploadState != null ? Collections.singletonList(mediaUploadState) : Collections.emptyList();
    }

    private static long mediaIdOf(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            return ((TL_iv.pageBlockPhoto) pageBlock).photo_id;
        }
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            return ((TL_iv.pageBlockVideo) pageBlock).video_id;
        }
        return 0L;
    }

    public static TL_iv.PageBlock itemBlockFor(BlockRow blockRow, MediaUploadState mediaUploadState) {
        if (isGallery(blockRow.block)) {
            ArrayList arrayListGalleryItems = galleryItems(blockRow.block);
            ArrayList arrayList = blockRow.medias;
            int iIndexOf = arrayList != null ? arrayList.indexOf(mediaUploadState) : -1;
            if (iIndexOf < 0 || arrayListGalleryItems == null || iIndexOf >= arrayListGalleryItems.size()) {
                return null;
            }
            return (TL_iv.PageBlock) arrayListGalleryItems.get(iIndexOf);
        }
        return blockRow.block;
    }

    private void onItemClick(UItem uItem, View view, int i, float f, float f2) {
        if (view instanceof RichTextCell) {
            ((RichTextCell) view).requestEditFocus();
        }
    }

    public boolean handleKeyEvent(android.view.KeyEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iv.RichEditorListView.handleKeyEvent(android.view.KeyEvent):boolean");
    }

    void addBlock(org.telegram.tgnet.tl.TL_iv.PageBlock r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iv.RichEditorListView.addBlock(org.telegram.tgnet.tl.TL_iv$PageBlock):void");
    }

    public void lambda$addBlock$33(BlockRow blockRow) {
        View viewFindViewByItemObject = findViewByItemObject(blockRow);
        if (viewFindViewByItemObject instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) viewFindViewByItemObject;
            richTextCell.requestEditFocus();
            richTextCell.getEditText().setSelection(0);
        }
    }

    void insertDetails() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iv.RichEditorListView.insertDetails():void");
    }

    public void lambda$insertDetails$34(BlockRow blockRow) {
        View viewFindViewByItemObject = findViewByItemObject(blockRow);
        if (viewFindViewByItemObject instanceof RichDetailsCell) {
            ((RichDetailsCell) viewFindViewByItemObject).requestEditFocus();
        }
    }

    void attachAudio(MessageObject messageObject) {
        TLRPC.Document document;
        if (messageObject == null || (document = messageObject.getDocument()) == null) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        TL_iv.pageBlockAudio pageblockaudio = new TL_iv.pageBlockAudio();
        BlockRow blockRow = new BlockRow(pageblockaudio);
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
            startAudioUpload(blockRow, blockRow.media.localPath, document);
        }
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        this.delegate.onContentChanged();
    }

    private void insertPreparedRow(org.telegram.ui.iv.BlockRow r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iv.RichEditorListView.insertPreparedRow(org.telegram.ui.iv.BlockRow):void");
    }

    public void lambda$insertPreparedRow$35(BlockRow blockRow) {
        View viewFindViewByItemObject = findViewByItemObject(blockRow);
        if (viewFindViewByItemObject instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) viewFindViewByItemObject;
            richTextCell.requestEditFocus();
            richTextCell.getEditText().setSelection(0);
        }
    }

    private void startAudioUpload(final BlockRow blockRow, String str, TLRPC.Document document) {
        final MediaUploadState mediaUploadState = blockRow.media;
        RichMediaUploader richMediaUploader = (RichMediaUploader) this.uploaders.remove(mediaUploadState);
        if (richMediaUploader != null) {
            richMediaUploader.cancel();
        }
        RichMediaUploader richMediaUploaderForAudio = RichMediaUploader.forAudio(this.currentAccount, str, document, new RichMediaUploader.Listener() {
            @Override
            public void onPhotoUploaded(TLRPC.Photo photo) {
                RichMediaUploader.Listener.CC.$default$onPhotoUploaded(this, photo);
            }

            @Override
            public void onVideoUploaded(TLRPC.Document document2) {
                RichMediaUploader.Listener.CC.$default$onVideoUploaded(this, document2);
            }

            @Override
            public void onWidthHeightResolved(int i, int i2) {
                RichMediaUploader.Listener.CC.$default$onWidthHeightResolved(this, i, i2);
            }

            @Override
            public void onProgress(float f) {
                mediaUploadState.progress = f;
                RichEditorListView.this.invalidateAudioCell(blockRow);
                RichEditorListView.this.delegate.onContentChanged();
            }

            @Override
            public void onAudioUploaded(TLRPC.Document document2) {
                MediaUploadState mediaUploadState2 = mediaUploadState;
                mediaUploadState2.document = document2;
                mediaUploadState2.audioDisplayDocument = document2;
                mediaUploadState2.state = 2;
                TL_iv.PageBlock pageBlock = blockRow.block;
                if (pageBlock instanceof TL_iv.pageBlockAudio) {
                    ((TL_iv.pageBlockAudio) pageBlock).audio_id = document2.id;
                }
                RichEditorListView.this.uploaders.remove(mediaUploadState);
                RichEditorListView.this.adapter.update(false);
                RichEditorListView.this.delegate.onContentChanged();
            }

            @Override
            public void onError() {
                mediaUploadState.state = 3;
                RichEditorListView.this.uploaders.remove(mediaUploadState);
                int iIndexOf = RichEditorListView.this.rows.indexOf(blockRow);
                if (iIndexOf >= 0) {
                    RichEditorListView.this.rows.remove(iIndexOf);
                    RichEditorListView.this.adapter.update(true);
                }
                RichEditorListView.this.delegate.onContentChanged();
            }
        });
        this.uploaders.put(mediaUploadState, richMediaUploaderForAudio);
        richMediaUploaderForAudio.start();
    }

    public void cancelAudioUpload(BlockRow blockRow) {
        RichMediaUploader richMediaUploader = (RichMediaUploader) this.uploaders.remove(blockRow.media);
        if (richMediaUploader != null) {
            richMediaUploader.cancel();
        }
        int iIndexOf = this.rows.indexOf(blockRow);
        if (iIndexOf >= 0) {
            RichEditorHistory richEditorHistory = this.history;
            if (richEditorHistory != null) {
                richEditorHistory.flush();
            }
            this.rows.remove(iIndexOf);
            this.adapter.update(true);
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
        }
        this.delegate.onContentChanged();
    }

    public void invalidateAudioCell(BlockRow blockRow) {
        View viewFindViewByItemObject = findViewByItemObject(blockRow);
        if (viewFindViewByItemObject instanceof RichAudioCell) {
            ((RichAudioCell) viewFindViewByItemObject).updateButtonState(false);
            viewFindViewByItemObject.invalidate();
        }
    }

    private static MediaUploadState newUploadingMedia(MediaController.PhotoEntry photoEntry, String str) {
        MediaUploadState mediaUploadState = new MediaUploadState();
        mediaUploadState.isVideo = photoEntry.isVideo;
        mediaUploadState.localPath = str;
        mediaUploadState.width = photoEntry.width;
        mediaUploadState.height = photoEntry.height;
        mediaUploadState.duration = photoEntry.duration;
        String str2 = photoEntry.imagePath;
        boolean z = (str2 == null || str == null || !str.equals(str2)) ? false : true;
        mediaUploadState.orientation = z ? 0 : photoEntry.orientation;
        mediaUploadState.invert = z ? 0 : photoEntry.invert;
        mediaUploadState.state = 1;
        mediaUploadState.progress = 0.0f;
        return mediaUploadState;
    }

    void attachMedia(MediaController.PhotoEntry photoEntry) {
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
            richEditorHistory.flush();
        }
        boolean zHasAnimatedMediaEntities = RichMediaConverter.hasAnimatedMediaEntities(photoEntry);
        BlockRow blockRow = new BlockRow((photoEntry.isVideo || zHasAnimatedMediaEntities) ? new TL_iv.pageBlockVideo() : new TL_iv.pageBlockPhoto());
        blockRow.media = newUploadingMedia(photoEntry, str2);
        insertPreparedRow(blockRow);
        if (zHasAnimatedMediaEntities) {
            startMediaConvertAndUpload(blockRow, blockRow.media, photoEntry);
        } else {
            startMediaUpload(blockRow, blockRow.media, str2, photoEntry.isVideo, photoEntry.width, photoEntry.height, photoEntry.duration);
        }
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        this.delegate.onContentChanged();
    }

    void addMediaToRow(BlockRow blockRow, MediaController.PhotoEntry photoEntry) {
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
            richEditorHistory.flush();
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
            startMediaUpload(blockRow, mediaUploadStateNewUploadingMedia, str2, photoEntry.isVideo, photoEntry.width, photoEntry.height, photoEntry.duration);
        }
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        this.delegate.onContentChanged();
    }

    void attachExternalMedia(final Uri uri) {
        if (uri == null) {
            return;
        }
        final BlockRow blockRow = this.pendingMediaRow;
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
        final String str = type;
        final boolean zStartsWith = str != null ? str.startsWith("video") : uri.toString().contains("video");
        final int i = this.lastExternalImageId;
        this.lastExternalImageId = i - 1;
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$attachExternalMedia$37(uri, zStartsWith, str, i, blockRow);
            }
        });
    }

    public void lambda$attachExternalMedia$37(android.net.Uri r15, final boolean r16, java.lang.String r17, final int r18, final org.telegram.ui.iv.BlockRow r19) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iv.RichEditorListView.lambda$attachExternalMedia$37(android.net.Uri, boolean, java.lang.String, int, org.telegram.ui.iv.BlockRow):void");
    }

    public void lambda$attachExternalMedia$36(int i, String str, boolean z, int i2, int i3, int i4, int i5, int i6, BlockRow blockRow) {
        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i, 0L, str, z ? i2 : 0, z, i3, i4, 0L);
        photoEntry.setOrientation(i5, i6);
        if (blockRow != null && isMedia(blockRow.block)) {
            addMediaToRow(blockRow, photoEntry);
        } else {
            attachMedia(photoEntry);
        }
    }

    private java.lang.String copyUriToCache(android.net.Uri r5, boolean r6, java.lang.String r7, int r8) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iv.RichEditorListView.copyUriToCache(android.net.Uri, boolean, java.lang.String, int):java.lang.String");
    }

    private void startMediaConvertAndUpload(final BlockRow blockRow, final MediaUploadState mediaUploadState, MediaController.PhotoEntry photoEntry) {
        RichMediaUploader richMediaUploader = (RichMediaUploader) this.uploaders.remove(mediaUploadState);
        if (richMediaUploader != null) {
            richMediaUploader.cancel();
        }
        RichMediaConverter richMediaConverter = (RichMediaConverter) this.converters.remove(mediaUploadState);
        if (richMediaConverter != null) {
            richMediaConverter.cancel();
        }
        mediaUploadState.state = 1;
        mediaUploadState.progress = 0.0f;
        RichMediaConverter richMediaConverter2 = new RichMediaConverter(this.currentAccount, photoEntry, new RichMediaConverter.Listener() {
            @Override
            public void onProgress(float f) {
                mediaUploadState.progress = f;
                RichEditorListView.this.invalidateMediaCell(blockRow);
            }

            @Override
            public void onDone(String str, int i, int i2, int i3) {
                RichEditorListView.this.converters.remove(mediaUploadState);
                MediaUploadState mediaUploadState2 = mediaUploadState;
                mediaUploadState2.isVideo = true;
                mediaUploadState2.localPath = str;
                if (i > 0) {
                    mediaUploadState2.width = i;
                }
                if (i2 > 0) {
                    mediaUploadState2.height = i2;
                }
                mediaUploadState2.duration = i3;
                mediaUploadState2.orientation = 0;
                mediaUploadState2.invert = 0;
                mediaUploadState2.progress = 0.0f;
                RichEditorListView.this.refreshMediaCell(blockRow);
                RichEditorListView richEditorListView = RichEditorListView.this;
                BlockRow blockRow2 = blockRow;
                MediaUploadState mediaUploadState3 = mediaUploadState;
                richEditorListView.startMediaUpload(blockRow2, mediaUploadState3, str, true, mediaUploadState3.width, mediaUploadState3.height, i3);
            }

            @Override
            public void onError() {
                RichEditorListView.this.converters.remove(mediaUploadState);
                MediaUploadState mediaUploadState2 = mediaUploadState;
                mediaUploadState2.state = 3;
                RichEditorListView.this.removeMediaFromRow(blockRow, mediaUploadState2);
                RichEditorListView.this.delegate.onContentChanged();
            }
        });
        this.converters.put(mediaUploadState, richMediaConverter2);
        richMediaConverter2.start();
    }

    public void startMediaUpload(final BlockRow blockRow, final MediaUploadState mediaUploadState, String str, boolean z, int i, int i2, int i3) {
        RichMediaUploader richMediaUploader = (RichMediaUploader) this.uploaders.remove(mediaUploadState);
        if (richMediaUploader != null) {
            richMediaUploader.cancel();
        }
        RichMediaUploader richMediaUploader2 = new RichMediaUploader(this.currentAccount, str, z, i, i2, i3, new RichMediaUploader.Listener() {
            @Override
            public void onAudioUploaded(TLRPC.Document document) {
                RichMediaUploader.Listener.CC.$default$onAudioUploaded(this, document);
            }

            @Override
            public void onWidthHeightResolved(int i4, int i5) {
                if (i4 > 0 && i5 > 0) {
                    MediaUploadState mediaUploadState2 = mediaUploadState;
                    mediaUploadState2.width = i4;
                    mediaUploadState2.height = i5;
                }
                RichEditorListView.this.invalidateMediaCell(blockRow);
            }

            @Override
            public void onProgress(float f) {
                mediaUploadState.progress = f;
                RichEditorListView.this.invalidateMediaCell(blockRow);
                RichEditorListView.this.delegate.onContentChanged();
            }

            @Override
            public void onPhotoUploaded(TLRPC.Photo photo) {
                int i4;
                int i5;
                MediaUploadState mediaUploadState2 = mediaUploadState;
                mediaUploadState2.photo = photo;
                mediaUploadState2.state = 2;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                if (closestPhotoSizeWithSize != null && (i4 = closestPhotoSizeWithSize.w) > 0 && (i5 = closestPhotoSizeWithSize.h) > 0) {
                    MediaUploadState mediaUploadState3 = mediaUploadState;
                    mediaUploadState3.width = i4;
                    mediaUploadState3.height = i5;
                }
                TL_iv.PageBlock pageBlockItemBlockFor = RichEditorListView.itemBlockFor(blockRow, mediaUploadState);
                if (pageBlockItemBlockFor instanceof TL_iv.pageBlockPhoto) {
                    ((TL_iv.pageBlockPhoto) pageBlockItemBlockFor).photo_id = photo.id;
                }
                RichEditorListView.this.uploaders.remove(mediaUploadState);
                RichEditorListView.this.refreshMediaCell(blockRow);
                RichEditorListView.this.delegate.onContentChanged();
            }

            @Override
            public void onVideoUploaded(TLRPC.Document document) {
                MediaUploadState mediaUploadState2 = mediaUploadState;
                mediaUploadState2.document = document;
                mediaUploadState2.state = 2;
                TL_iv.PageBlock pageBlockItemBlockFor = RichEditorListView.itemBlockFor(blockRow, mediaUploadState2);
                if (pageBlockItemBlockFor instanceof TL_iv.pageBlockVideo) {
                    ((TL_iv.pageBlockVideo) pageBlockItemBlockFor).video_id = document.id;
                }
                RichEditorListView.this.uploaders.remove(mediaUploadState);
                RichEditorListView.this.refreshMediaCell(blockRow);
                RichEditorListView.this.delegate.onContentChanged();
            }

            @Override
            public void onError() {
                mediaUploadState.state = 3;
                RichEditorListView.this.uploaders.remove(mediaUploadState);
                RichEditorListView.this.removeMediaFromRow(blockRow, mediaUploadState);
                RichEditorListView.this.delegate.onContentChanged();
            }
        });
        this.uploaders.put(mediaUploadState, richMediaUploader2);
        richMediaUploader2.start();
    }

    public void cancelMediaUpload(BlockRow blockRow, MediaUploadState mediaUploadState) {
        if (mediaUploadState == null) {
            cancelMediaUpload(blockRow);
            return;
        }
        RichMediaUploader richMediaUploader = (RichMediaUploader) this.uploaders.remove(mediaUploadState);
        if (richMediaUploader != null) {
            richMediaUploader.cancel();
        }
        RichMediaConverter richMediaConverter = (RichMediaConverter) this.converters.remove(mediaUploadState);
        if (richMediaConverter != null) {
            richMediaConverter.cancel();
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        removeMediaFromRow(blockRow, mediaUploadState);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        this.delegate.onContentChanged();
    }

    private void cancelMediaUpload(BlockRow blockRow) {
        for (MediaUploadState mediaUploadState : mediasOf(blockRow)) {
            RichMediaUploader richMediaUploader = (RichMediaUploader) this.uploaders.remove(mediaUploadState);
            if (richMediaUploader != null) {
                richMediaUploader.cancel();
            }
            RichMediaConverter richMediaConverter = (RichMediaConverter) this.converters.remove(mediaUploadState);
            if (richMediaConverter != null) {
                richMediaConverter.cancel();
            }
        }
        int iIndexOf = this.rows.indexOf(blockRow);
        if (iIndexOf >= 0) {
            RichEditorHistory richEditorHistory = this.history;
            if (richEditorHistory != null) {
                richEditorHistory.flush();
            }
            this.rows.remove(iIndexOf);
            this.adapter.update(true);
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
        }
        this.delegate.onContentChanged();
    }

    public void removeMediaFromRow(BlockRow blockRow, MediaUploadState mediaUploadState) {
        if (blockRow == null) {
            return;
        }
        if (isGallery(blockRow.block)) {
            ArrayList arrayListGalleryItems = galleryItems(blockRow.block);
            ArrayList arrayList = blockRow.medias;
            int iIndexOf = arrayList != null ? arrayList.indexOf(mediaUploadState) : -1;
            if (iIndexOf >= 0) {
                blockRow.medias.remove(iIndexOf);
                if (arrayListGalleryItems != null && iIndexOf < arrayListGalleryItems.size()) {
                    arrayListGalleryItems.remove(iIndexOf);
                }
            }
            if (blockRow.medias.isEmpty()) {
                removeRow(blockRow);
                return;
            }
            if (blockRow.medias.size() == 1) {
                TL_iv.PageCaption pageCaption = blockRow.block.caption;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayListGalleryItems.get(0);
                blockRow.block = pageBlock;
                pageBlock.caption = pageCaption;
                blockRow.media = (MediaUploadState) blockRow.medias.get(0);
                blockRow.medias = null;
                this.adapter.update(true);
                refreshMediaCell(blockRow);
                return;
            }
            this.adapter.update(true);
            refreshMediaCell(blockRow);
            return;
        }
        removeRow(blockRow);
    }

    private void removeRow(BlockRow blockRow) {
        int iIndexOf = this.rows.indexOf(blockRow);
        if (iIndexOf >= 0) {
            this.rows.remove(iIndexOf);
            this.adapter.update(true);
        }
    }

    public void switchGalleryMode(BlockRow blockRow) {
        TL_iv.pageBlockSlideshow pageblockslideshow;
        if (blockRow == null || !isGallery(blockRow.block)) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        ArrayList<TL_iv.PageBlock> arrayListGalleryItems = galleryItems(blockRow.block);
        TL_iv.PageBlock pageBlock = blockRow.block;
        TL_iv.PageCaption pageCaption = pageBlock.caption;
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
            if (arrayListGalleryItems == null) {
                arrayListGalleryItems = new ArrayList<>();
            }
            pageblockcollage.items = arrayListGalleryItems;
            pageblockcollage.caption = pageCaption;
            pageblockslideshow = pageblockcollage;
        } else {
            TL_iv.pageBlockSlideshow pageblockslideshow2 = new TL_iv.pageBlockSlideshow();
            if (arrayListGalleryItems == null) {
                arrayListGalleryItems = new ArrayList<>();
            }
            pageblockslideshow2.items = arrayListGalleryItems;
            pageblockslideshow2.caption = pageCaption;
            pageblockslideshow = pageblockslideshow2;
        }
        blockRow.block = pageblockslideshow;
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        View viewFindViewByItemObject = findViewByItemObject(blockRow);
        if (viewFindViewByItemObject instanceof RichMediaCell) {
            ((RichMediaCell) viewFindViewByItemObject).onModeChanged();
        }
    }

    public void invalidateMediaCell(BlockRow blockRow) {
        View viewFindViewByItemObject = findViewByItemObject(blockRow);
        if (viewFindViewByItemObject instanceof RichMediaCell) {
            viewFindViewByItemObject.requestLayout();
            viewFindViewByItemObject.invalidate();
        }
    }

    public void refreshMediaCell(BlockRow blockRow) {
        View viewFindViewByItemObject = findViewByItemObject(blockRow);
        if (viewFindViewByItemObject instanceof RichMediaCell) {
            ((RichMediaCell) viewFindViewByItemObject).refresh();
        }
    }

    public void onChecklistToggle(BlockRow blockRow, boolean z) {
        if (blockRow == null) {
            return;
        }
        blockRow.checked = z;
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
            this.history.record();
        }
    }

    public void onCaptionEnter(BlockRow blockRow) {
        int iIndexOf = this.rows.indexOf(blockRow);
        if (iIndexOf < 0) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        final BlockRow blockRow2 = new BlockRow(new TL_iv.pageBlockParagraph());
        this.rows.add(iIndexOf + 1, blockRow2);
        renumberAllRuns();
        this.adapter.update(false);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        post(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onCaptionEnter$39(blockRow2);
            }
        });
    }

    public void lambda$onCaptionEnter$39(BlockRow blockRow) {
        View viewFindViewByItemObject = findViewByItemObject(blockRow);
        if (viewFindViewByItemObject instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) viewFindViewByItemObject;
            richTextCell.requestEditFocus();
            richTextCell.getEditText().setSelection(0);
        }
    }

    public void onCellEnter(final BlockRow blockRow) {
        CharSequence styledText;
        int length;
        int i;
        int iIndexOf = this.rows.indexOf(blockRow);
        if (iIndexOf < 0) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        View viewFindViewByItemObject = findViewByItemObject(blockRow);
        boolean z = viewFindViewByItemObject instanceof RichTextCell;
        if (z) {
            RichEditText editText = ((RichTextCell) viewFindViewByItemObject).getEditText();
            styledText = editText.getText();
            length = editText.getSelectionEnd();
        } else {
            styledText = RichTextCell.readStyledText(blockRow.block);
            length = styledText.length();
        }
        if (length < 0 || length > styledText.length()) {
            length = styledText.length();
        }
        if (styledText.length() == 0 && blockRow.level > 0) {
            cascadeOutdent(iIndexOf);
            renumberAllRuns();
            this.adapter.update(false);
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
            post(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onCellEnter$40(blockRow);
                }
            });
            return;
        }
        CharSequence charSequenceSubSequence = styledText.subSequence(0, length);
        CharSequence charSequenceSubSequence2 = styledText.subSequence(length, styledText.length());
        RichTextCell.applyStyledTextToBlock(blockRow.block, charSequenceSubSequence);
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        RichTextCell.applyStyledTextToBlock(pageblockparagraph, charSequenceSubSequence2);
        int i2 = blockRow.num;
        if (i2 > 0) {
            i2++;
        }
        final BlockRow blockRow2 = new BlockRow(pageblockparagraph, blockRow.level, i2);
        blockRow2.checkbox = blockRow.checkbox;
        this.rows.add(iIndexOf + 1, blockRow2);
        renumberAllRuns();
        if (z) {
            ((RichTextCell) viewFindViewByItemObject).getEditText().deleteToEndSilently(length);
        }
        this.adapter.updateWithoutNotify();
        int iIndexOf2 = this.itemRows.indexOf(blockRow2);
        if (iIndexOf2 < 0) {
            this.adapter.notifyDataSetChanged();
        } else {
            final RecyclerView.ItemAnimator itemAnimator = getItemAnimator();
            setItemAnimator(null);
            this.adapter.notifyItemInserted(iIndexOf2);
            if (blockRow.num > 0 && (i = iIndexOf2 + 1) < this.itemRows.size()) {
                this.adapter.notifyItemRangeChanged(i, (this.itemRows.size() - iIndexOf2) - 1);
            }
            post(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onCellEnter$41(itemAnimator);
                }
            });
        }
        RichEditorHistory richEditorHistory3 = this.history;
        if (richEditorHistory3 != null) {
            richEditorHistory3.record();
        }
        post(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onCellEnter$42(blockRow2);
            }
        });
    }

    public void lambda$onCellEnter$41(RecyclerView.ItemAnimator itemAnimator) {
        setItemAnimator(itemAnimator);
    }

    public void lambda$onCellEnter$42(BlockRow blockRow) {
        View viewFindViewByItemObject = findViewByItemObject(blockRow);
        if (viewFindViewByItemObject instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) viewFindViewByItemObject;
            richTextCell.requestEditFocus();
            richTextCell.getEditText().setSelection(0);
        }
    }

    public boolean onCellBackspaceAtStart(final BlockRow blockRow, boolean z) {
        int i;
        int iIndexOf = this.rows.indexOf(blockRow);
        if (iIndexOf < 0) {
            return false;
        }
        if (demotesToParagraph(blockRow.block)) {
            turnInto(blockRow, new TL_iv.pageBlockParagraph(), 0, 0, false, false);
            return true;
        }
        if (blockRow.level > 0) {
            RichEditorHistory richEditorHistory = this.history;
            if (richEditorHistory != null) {
                richEditorHistory.flush();
            }
            cascadeOutdent(iIndexOf);
            renumberAllRuns();
            this.adapter.update(false);
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
            post(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onCellBackspaceAtStart$43(blockRow);
                }
            });
            return true;
        }
        if (iIndexOf <= 0) {
            return false;
        }
        int i2 = iIndexOf - 1;
        final BlockRow blockRow2 = (BlockRow) this.rows.get(i2);
        if (isDetailsHeader(blockRow2) || blockRow2.detailsEnd) {
            if (z && (!isDetailsHeader(blockRow2) || ((i = iIndexOf + 1) < this.rows.size() && !((BlockRow) this.rows.get(i)).detailsEnd))) {
                RichEditorHistory richEditorHistory3 = this.history;
                if (richEditorHistory3 != null) {
                    richEditorHistory3.flush();
                }
                this.rows.remove(iIndexOf);
                renumberAllRuns();
                this.adapter.update(false);
                RichEditorHistory richEditorHistory4 = this.history;
                if (richEditorHistory4 != null) {
                    richEditorHistory4.record();
                }
                post(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onCellBackspaceAtStart$44(blockRow2);
                    }
                });
            }
            return true;
        }
        if (isNonText(blockRow2.block)) {
            RichEditorHistory richEditorHistory5 = this.history;
            if (richEditorHistory5 != null) {
                richEditorHistory5.flush();
            }
            this.rows.remove(i2);
            renumberAllRuns();
            this.adapter.update(false);
            RichEditorHistory richEditorHistory6 = this.history;
            if (richEditorHistory6 != null) {
                richEditorHistory6.record();
            }
            post(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onCellBackspaceAtStart$45(blockRow);
                }
            });
            return true;
        }
        RichEditorHistory richEditorHistory7 = this.history;
        if (richEditorHistory7 != null) {
            richEditorHistory7.flush();
        }
        View viewFindViewByItemObject = findViewByItemObject(blockRow2);
        int iIndexOf2 = this.itemRows.indexOf(blockRow);
        if ((viewFindViewByItemObject instanceof RichTextCell) && iIndexOf2 >= 0) {
            RichTextCell richTextCell = (RichTextCell) viewFindViewByItemObject;
            RichEditText editText = richTextCell.getEditText();
            int length = editText.length();
            editText.appendSilently(RichTextCell.readStyledText(blockRow.block));
            RichTextCell.applyStyledTextToBlock(blockRow2.block, editText.getText());
            View viewFindViewByItemObject2 = findViewByItemObject(blockRow);
            if (viewFindViewByItemObject2 instanceof RichTextCell) {
                ((RichTextCell) viewFindViewByItemObject2).getEditText().deleteToEndSilently(0);
            }
            richTextCell.requestEditFocus();
            editText.setSelection(Math.max(0, Math.min(length, editText.length())));
            this.rows.remove(iIndexOf);
            renumberAllRuns();
            this.adapter.updateWithoutNotify();
            final RecyclerView.ItemAnimator itemAnimator = getItemAnimator();
            setItemAnimator(null);
            this.adapter.notifyItemRemoved(iIndexOf2);
            if ((blockRow2.num > 0 || blockRow.num > 0) && iIndexOf2 < this.itemRows.size()) {
                this.adapter.notifyItemRangeChanged(iIndexOf2, this.itemRows.size() - iIndexOf2);
            }
            post(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onCellBackspaceAtStart$46(itemAnimator);
                }
            });
            RichEditorHistory richEditorHistory8 = this.history;
            if (richEditorHistory8 != null) {
                richEditorHistory8.record();
            }
            return true;
        }
        CharSequence styledText = RichTextCell.readStyledText(blockRow2.block);
        final int length2 = styledText.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(styledText);
        spannableStringBuilder.append(RichTextCell.readStyledText(blockRow.block));
        RichTextCell.applyStyledTextToBlock(blockRow2.block, spannableStringBuilder);
        this.rows.remove(iIndexOf);
        renumberAllRuns();
        this.adapter.update(false);
        RichEditorHistory richEditorHistory9 = this.history;
        if (richEditorHistory9 != null) {
            richEditorHistory9.record();
        }
        post(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onCellBackspaceAtStart$47(blockRow2, length2);
            }
        });
        return true;
    }

    public void lambda$onCellBackspaceAtStart$46(RecyclerView.ItemAnimator itemAnimator) {
        setItemAnimator(itemAnimator);
    }

    public void lambda$onCellBackspaceAtStart$47(BlockRow blockRow, int i) {
        View viewFindViewByItemObject = findViewByItemObject(blockRow);
        if (viewFindViewByItemObject instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) viewFindViewByItemObject;
            richTextCell.requestEditFocus();
            richTextCell.getEditText().setSelection(Math.max(0, Math.min(i, richTextCell.getEditText().length())));
        }
    }

    public void onLanguageClick(final BlockRow blockRow, View view) {
        Set<String> languages;
        if (blockRow == null || !(blockRow.block instanceof TL_iv.pageBlockPreformatted) || (languages = CodeHighlighting.getLanguages()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(languages);
        Collections.sort(arrayList);
        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) blockRow.block;
        ItemOptions itemOptionsMakeMenu = this.delegate.makeMenu(view);
        itemOptionsMakeMenu.setScrimViewBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(3.0f), Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider)));
        itemOptionsMakeMenu.setMaxHeight(AndroidUtilities.dp(350.0f));
        itemOptionsMakeMenu.addChecked(TextUtils.isEmpty(pageblockpreformatted.language), LocaleController.getString(R.string.ArticleNone), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onLanguageClick$48(blockRow);
            }
        });
        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
            itemOptionsMakeMenu.addChecked(true, MessageObject.TextLayoutBlock.capitalizeLanguage(pageblockpreformatted.language), null);
        }
        itemOptionsMakeMenu.addGap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final String str = (String) it.next();
            itemOptionsMakeMenu.addChecked(TextUtils.equals(str, pageblockpreformatted.language), MessageObject.TextLayoutBlock.capitalizeLanguage(str), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onLanguageClick$49(blockRow, str);
                }
            });
        }
        itemOptionsMakeMenu.show();
    }

    public void lambda$onLanguageClick$48(BlockRow blockRow) {
        lambda$onLanguageClick$49(blockRow, "");
    }

    public void lambda$onLanguageClick$49(BlockRow blockRow, String str) {
        if (blockRow != null) {
            TL_iv.PageBlock pageBlock = blockRow.block;
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                if (TextUtils.equals(pageblockpreformatted.language, str)) {
                    return;
                }
                RichEditorHistory richEditorHistory = this.history;
                if (richEditorHistory != null) {
                    richEditorHistory.flush();
                }
                pageblockpreformatted.language = str;
                RichTextCell richTextCellCellAt = cellAt(this.rows.indexOf(blockRow));
                if (richTextCellCellAt != null) {
                    richTextCellCellAt.updateLanguage();
                }
                RichEditorHistory richEditorHistory2 = this.history;
                if (richEditorHistory2 != null) {
                    richEditorHistory2.record();
                }
            }
        }
    }

    public void lambda$onTapBelowContent$13(BlockRow blockRow) {
        View viewFindViewByItemObject = findViewByItemObject(blockRow);
        if (viewFindViewByItemObject instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) viewFindViewByItemObject;
            richTextCell.requestEditFocus();
            RichEditText editText = richTextCell.getEditText();
            editText.setSelection(editText.length());
        }
    }

    public void lambda$onTapAboveContent$11(BlockRow blockRow) {
        View viewFindViewByItemObject = findViewByItemObject(blockRow);
        if (viewFindViewByItemObject instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) viewFindViewByItemObject;
            richTextCell.requestEditFocus();
            richTextCell.getEditText().setSelection(0);
        }
    }

    boolean onCellIndent(BlockRow blockRow, boolean z) {
        int iIndexOf = this.rows.indexOf(blockRow);
        if (iIndexOf < 0) {
            return false;
        }
        int iCaptureCaret = captureCaret(blockRow);
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        if (!indentRow(iIndexOf, z, false)) {
            return false;
        }
        renumberAllRuns();
        this.adapter.update(false);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        restoreCaret(blockRow, iCaptureCaret);
        return true;
    }

    private BlockRow turnIntoTarget() {
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper;
        int startCell;
        BlockRow blockRowFindFocusedRow = findFocusedRow();
        return (blockRowFindFocusedRow == null && (articleTextSelectionHelper = this.textSelectionHelper) != null && articleTextSelectionHelper.isInSelectionMode() && (startCell = this.textSelectionHelper.getStartCell()) == this.textSelectionHelper.getEndCell()) ? rowForCell(startCell) : blockRowFindFocusedRow;
    }

    void turnInto(BlockRow blockRow, TL_iv.PageBlock pageBlock, int i, int i2, boolean z, boolean z2) {
        if (blockRow == null) {
            blockRow = turnIntoTarget();
        }
        BlockRow blockRow2 = blockRow;
        if (blockRow2 == null || pageBlock == null || this.rows.indexOf(blockRow2) < 0 || isDetailsHeader(blockRow2) || blockRow2.detailsEnd) {
            return;
        }
        TL_iv.PageBlock pageBlock2 = blockRow2.block;
        if (pageBlock != pageBlock2 && isFormattable(pageBlock2) && isFormattable(pageBlock)) {
            RichTextCell richTextCellCellAt = cellAt(this.rows.indexOf(blockRow2));
            RichTextCell.applyStyledTextToBlock(pageBlock, richTextCellCellAt != null ? richTextCellCellAt.getEditText().getText() : RichTextCell.readStyledText(blockRow2.block));
            TL_iv.RichText richTextExtractCaption = RichTextCell.extractCaption(blockRow2.block);
            if (richTextExtractCaption != null && RichTextCell.extractCaption(pageBlock) != null) {
                RichTextCell.setCaption(pageBlock, richTextExtractCaption);
            }
        }
        transformRow(blockRow2, pageBlock, i, i2, z, z2);
    }

    void turnIntoList(BlockRow blockRow, int i) {
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

    static TL_iv.pageBlockBlockquote newBlockquote() {
        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
        pageblockblockquote.caption = new TL_iv.textEmpty();
        return pageblockblockquote;
    }

    static TL_iv.pageBlockPullquote newPullquote() {
        TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
        pageblockpullquote.caption = new TL_iv.textEmpty();
        return pageblockpullquote;
    }

    public void transformRow(final BlockRow blockRow, TL_iv.PageBlock pageBlock, int i, int i2, boolean z, boolean z2) {
        int iIndexOf = this.rows.indexOf(blockRow);
        if (iIndexOf < 0) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        blockRow.block = pageBlock;
        blockRow.level = i;
        blockRow.num = i2;
        blockRow.checkbox = z;
        blockRow.checked = z2;
        renumberAllRuns();
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            int i3 = iIndexOf + 1;
            if (i3 >= this.rows.size() || isNonText(((BlockRow) this.rows.get(i3)).block)) {
                this.rows.add(i3, new BlockRow(new TL_iv.pageBlockParagraph()));
            }
        } else if (isNonText(pageBlock)) {
            if (isMedia(pageBlock) && blockRow.media == null) {
                blockRow.media = new MediaUploadState();
            }
            int i4 = iIndexOf + 1;
            if (i4 < this.rows.size() && !isNonText(((BlockRow) this.rows.get(i4)).block)) {
                blockRow = (BlockRow) this.rows.get(i4);
            } else {
                blockRow = new BlockRow(new TL_iv.pageBlockParagraph());
                this.rows.add(i4, blockRow);
            }
        }
        this.adapter.update(false);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        post(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$transformRow$50(blockRow);
            }
        });
    }

    public void lambda$transformRow$50(BlockRow blockRow) {
        View viewFindViewByItemObject = findViewByItemObject(blockRow);
        if (viewFindViewByItemObject instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) viewFindViewByItemObject;
            richTextCell.requestEditFocus();
            richTextCell.getEditText().setSelection(richTextCell.getEditText().length());
            return;
        }
        if (viewFindViewByItemObject instanceof RichTableCell) {
            RichTableCell richTableCell = (RichTableCell) viewFindViewByItemObject;
            if (richTableCell.getGrid().getChildCount() > 0) {
                View childAt = richTableCell.getGrid().getChildAt(0);
                if (childAt instanceof RichTableCellHost) {
                    ((RichTableCellHost) childAt).editText.requestEditFocus();
                }
            }
        }
    }

    private boolean rangeIndent(int i, int i2, boolean z) {
        boolean z2;
        if (i < 0 || i2 < i || i2 >= this.rows.size()) {
            return false;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
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
            BlockRow blockRow = (BlockRow) this.rows.get(i);
            if (blockRow.level >= 1 && (i == 0 || ((BlockRow) this.rows.get(i - 1)).level < blockRow.level)) {
                return false;
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
            this.adapter.update(false);
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
        }
        return z2;
    }

    boolean canIndentRow(int i) {
        boolean z;
        if (i < 0 || i >= this.rows.size()) {
            return false;
        }
        BlockRow blockRow = (BlockRow) this.rows.get(i);
        if (blockRow.level == 0) {
            z = blockRow.block instanceof TL_iv.pageBlockParagraph;
        } else {
            z = i > 0 && ((BlockRow) this.rows.get(i + (-1))).level >= blockRow.level;
        }
        return z && indentKeepsDepth(i);
    }

    boolean canOutdentRow(int i) {
        return i >= 0 && i < this.rows.size() && ((BlockRow) this.rows.get(i)).level > 0;
    }

    private boolean indentRow(int i, boolean z, boolean z2) {
        if (i < 0 || i >= this.rows.size()) {
            return false;
        }
        BlockRow blockRow = (BlockRow) this.rows.get(i);
        if (z) {
            if (blockRow.level <= 0) {
                return false;
            }
            cascadeOutdent(i);
            return true;
        }
        if (blockRow.level == 0) {
            if (!(blockRow.block instanceof TL_iv.pageBlockParagraph) || !indentKeepsDepth(i)) {
                return false;
            }
            blockRow.level = 1;
            if (i > 0) {
                blockRow.num = ((BlockRow) this.rows.get(i - 1)).num > 0 ? 1 : 0;
            } else {
                blockRow.num = 0;
            }
            return true;
        }
        if ((!z2 && (i == 0 || ((BlockRow) this.rows.get(i - 1)).level < blockRow.level)) || !indentKeepsDepth(i)) {
            return false;
        }
        blockRow.level++;
        return true;
    }

    private void cascadeOutdent(int i) {
        BlockRow blockRow;
        int i2;
        BlockRow blockRow2 = (BlockRow) this.rows.get(i);
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
            if (i >= this.rows.size() || (i2 = (blockRow = (BlockRow) this.rows.get(i)).level) <= i3) {
                return;
            } else {
                blockRow.level = i2 - 1;
            }
        }
    }

    public void renumberAllRuns() {
        for (int i = 0; i < this.rows.size(); i++) {
            BlockRow blockRow = (BlockRow) this.rows.get(i);
            int i2 = blockRow.level;
            if (i2 > 0 && blockRow.num > 0) {
                int i3 = 1;
                for (int i4 = i - 1; i4 >= 0; i4--) {
                    BlockRow blockRow2 = (BlockRow) this.rows.get(i4);
                    int i5 = blockRow2.level;
                    if (i5 < i2) {
                        break;
                    }
                    if (i5 == i2) {
                        if (blockRow2.num <= 0) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                blockRow.num = i3;
            }
        }
    }

    private int captureCaret(BlockRow blockRow) {
        View viewFindViewByItemObject = findViewByItemObject(blockRow);
        if (!(viewFindViewByItemObject instanceof RichTextCell)) {
            return -1;
        }
        RichTextCell richTextCell = (RichTextCell) viewFindViewByItemObject;
        if (richTextCell.getEditText().isFocused()) {
            return richTextCell.getEditText().getSelectionEnd();
        }
        return -1;
    }

    private void restoreCaret(final BlockRow blockRow, final int i) {
        if (i < 0) {
            return;
        }
        post(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$restoreCaret$51(blockRow, i);
            }
        });
    }

    public void lambda$restoreCaret$51(BlockRow blockRow, int i) {
        View viewFindViewByItemObject = findViewByItemObject(blockRow);
        if (viewFindViewByItemObject instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) viewFindViewByItemObject;
            richTextCell.requestEditFocus();
            richTextCell.getEditText().setSelection(Math.max(0, Math.min(i, richTextCell.getEditText().length())));
        }
    }

    public void lambda$tryPlainArrowAcrossCells$55(BlockRow blockRow) {
        View viewFindViewByItemObject = findViewByItemObject(blockRow);
        if (viewFindViewByItemObject instanceof RichTextCell) {
            ((RichTextCell) viewFindViewByItemObject).requestEditFocus();
        }
    }

    private static boolean isNonText(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockDivider) || (pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockMath) || (pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockTable) || (pageBlock instanceof TL_iv.pageBlockList) || (pageBlock instanceof TL_iv.pageBlockOrderedList);
    }

    TL_iv.RichMessage buildDraftRichMessage() {
        if (!hasAnyText()) {
            return null;
        }
        ArrayList<TL_iv.PageBlock> arrayListFlattenRowsToBlocks = flattenRowsToBlocks();
        if (arrayListFlattenRowsToBlocks.isEmpty()) {
            return null;
        }
        TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
        richMessage.blocks = arrayListFlattenRowsToBlocks;
        richMessage.photos = collectPhotos();
        richMessage.documents = collectDocuments();
        return richMessage;
    }

    public int findExceededLimit() {
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(this.currentAccount).config;
        int size = 0;
        for (int i = 0; i < this.rows.size(); i++) {
            size += mediasOf((BlockRow) this.rows.get(i)).size();
        }
        return RichEditorLimits.measure(flattenRowsToBlocks(), size).findExceeded(appGlobalConfig);
    }

    private boolean indentKeepsDepth(int i) {
        return ((BlockRow) this.rows.get(i)).level + 1 <= MessagesController.getInstance(this.currentAccount).config.richMessageMaxDepth.get() + (-6);
    }

    public boolean isWithinLimits() {
        return findExceededLimit() == 0;
    }

    boolean hasAnyText() {
        for (int i = 0; i < this.rows.size(); i++) {
            BlockRow blockRow = (BlockRow) this.rows.get(i);
            if (!RichTextCell.readPlainText(blockRow.block).isEmpty()) {
                return true;
            }
            if (isMedia(blockRow.block) || (blockRow.block instanceof TL_iv.pageBlockAudio)) {
                for (MediaUploadState mediaUploadState : mediasOf(blockRow)) {
                    if (mediaUploadState.isReady() || mediaUploadState.isPending()) {
                        return true;
                    }
                }
            }
            TL_iv.PageBlock pageBlock = blockRow.block;
            if ((pageBlock instanceof TL_iv.pageBlockMath) && !TextUtils.isEmpty(((TL_iv.pageBlockMath) pageBlock).source)) {
                return true;
            }
            TL_iv.PageBlock pageBlock2 = blockRow.block;
            if ((pageBlock2 instanceof TL_iv.pageBlockMap) && RichMapCell.hasGeo((TL_iv.pageBlockMap) pageBlock2)) {
                return true;
            }
            TL_iv.PageBlock pageBlock3 = blockRow.block;
            if ((pageBlock3 instanceof TL_iv.pageBlockTable) && tableHasText((TL_iv.pageBlockTable) pageBlock3)) {
                return true;
            }
        }
        return false;
    }

    private static boolean tableHasText(TL_iv.pageBlockTable pageblocktable) {
        TL_iv.RichText richText = pageblocktable.title;
        if (richText != null && !TextUtils.isEmpty(RichTextStyle.plainOf(richText))) {
            return true;
        }
        if (pageblocktable.rows == null) {
            return false;
        }
        for (int i = 0; i < pageblocktable.rows.size(); i++) {
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i);
            for (int i2 = 0; i2 < pagetablerow.cells.size(); i2++) {
                if (!TableModel.readPlainText(pagetablerow.cells.get(i2)).isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    ArrayList collectPhotos() {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.rows.size(); i++) {
            for (MediaUploadState mediaUploadState : mediasOf((BlockRow) this.rows.get(i))) {
                if (mediaUploadState.isReady() && (photo = mediaUploadState.photo) != null && hashSet.add(Long.valueOf(photo.id))) {
                    arrayList.add(mediaUploadState.photo);
                }
            }
        }
        return arrayList;
    }

    ArrayList collectDocuments() {
        TLRPC.Document document;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.rows.size(); i++) {
            for (MediaUploadState mediaUploadState : mediasOf((BlockRow) this.rows.get(i))) {
                if (mediaUploadState.isReady() && (document = mediaUploadState.document) != null && hashSet.add(Long.valueOf(document.id))) {
                    arrayList.add(mediaUploadState.document);
                }
            }
        }
        return arrayList;
    }

    boolean hasPendingUploads() {
        for (int i = 0; i < this.rows.size(); i++) {
            Iterator it = mediasOf((BlockRow) this.rows.get(i)).iterator();
            while (it.hasNext()) {
                if (((MediaUploadState) it.next()).isPending()) {
                    return true;
                }
            }
        }
        return false;
    }

    ArrayList flattenRowsToBlocks() {
        return flattenRange(0, this.rows.size(), false);
    }

    private static boolean isEmptyTextBlock(TL_iv.PageBlock pageBlock) {
        return (isNonText(pageBlock) || (pageBlock instanceof TL_iv.pageBlockDetails) || !RichTextCell.readPlainText(pageBlock).isEmpty()) ? false : true;
    }

    public ArrayList flattenRange(int i, int i2, boolean z) {
        TL_iv.pageBlockCollage pageblockcollage;
        ArrayList arrayList = new ArrayList();
        int i3 = i;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            BlockRow blockRow = (BlockRow) this.rows.get(i3);
            if (!blockRow.detailsEnd) {
                if (isDetailsHeader(blockRow)) {
                    TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) blockRow.block;
                    if (pageblockdetails.title == null) {
                        pageblockdetails.title = new TL_iv.textEmpty();
                    }
                    int iMatchingDetailsEnd = matchingDetailsEnd(i3);
                    pageblockdetails.blocks = flattenRange(i3 + 1, Math.min(iMatchingDetailsEnd, i2), true);
                    arrayList.add(pageblockdetails);
                    i3 = iMatchingDetailsEnd + 1;
                } else {
                    int i4 = blockRow.level;
                    if (i4 <= 0) {
                        TL_iv.PageBlock pageBlock = blockRow.block;
                        if (pageBlock instanceof TL_iv.pageBlockDivider) {
                            arrayList.add(pageBlock);
                        } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                            MediaUploadState mediaUploadState = blockRow.media;
                            if (mediaUploadState != null && mediaUploadState.isReady()) {
                                TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) blockRow.block;
                                if (pageblockphoto.photo_id != 0) {
                                    if (pageblockphoto.caption == null) {
                                        pageblockphoto.caption = new TL_iv.PageCaption();
                                        ((TL_iv.pageBlockPhoto) blockRow.block).caption.text = new TL_iv.textEmpty();
                                        ((TL_iv.pageBlockPhoto) blockRow.block).caption.credit = new TL_iv.textEmpty();
                                    }
                                    arrayList.add(blockRow.block);
                                }
                            }
                        } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
                            MediaUploadState mediaUploadState2 = blockRow.media;
                            if (mediaUploadState2 != null && mediaUploadState2.isReady()) {
                                TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) blockRow.block;
                                if (pageblockvideo.video_id != 0) {
                                    if (pageblockvideo.caption == null) {
                                        pageblockvideo.caption = new TL_iv.PageCaption();
                                        ((TL_iv.pageBlockVideo) blockRow.block).caption.text = new TL_iv.textEmpty();
                                        ((TL_iv.pageBlockVideo) blockRow.block).caption.credit = new TL_iv.textEmpty();
                                    }
                                    arrayList.add(blockRow.block);
                                }
                            }
                        } else if (isGallery(pageBlock)) {
                            ArrayList arrayListGalleryItems = galleryItems(blockRow.block);
                            List listMediasOf = mediasOf(blockRow);
                            ArrayList<TL_iv.PageBlock> arrayList2 = new ArrayList<>();
                            for (int i5 = 0; arrayListGalleryItems != null && i5 < arrayListGalleryItems.size() && i5 < listMediasOf.size(); i5++) {
                                TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) arrayListGalleryItems.get(i5);
                                if (((MediaUploadState) listMediasOf.get(i5)).isReady() && mediaIdOf(pageBlock2) != 0) {
                                    RichCaptionController.ensureCaption(pageBlock2);
                                    arrayList2.add(pageBlock2);
                                }
                            }
                            if (arrayList2.size() >= 2) {
                                if (blockRow.block instanceof TL_iv.pageBlockSlideshow) {
                                    TL_iv.pageBlockSlideshow pageblockslideshow = new TL_iv.pageBlockSlideshow();
                                    pageblockslideshow.items = arrayList2;
                                    pageblockslideshow.caption = blockRow.block.caption;
                                    pageblockcollage = pageblockslideshow;
                                } else {
                                    TL_iv.pageBlockCollage pageblockcollage2 = new TL_iv.pageBlockCollage();
                                    pageblockcollage2.items = arrayList2;
                                    pageblockcollage2.caption = blockRow.block.caption;
                                    pageblockcollage = pageblockcollage2;
                                }
                                RichCaptionController.ensureCaption(pageblockcollage);
                                arrayList.add(pageblockcollage);
                            } else if (arrayList2.size() == 1) {
                                arrayList.add(arrayList2.get(0));
                            }
                        } else {
                            TL_iv.PageBlock pageBlock3 = blockRow.block;
                            if (pageBlock3 instanceof TL_iv.pageBlockAudio) {
                                MediaUploadState mediaUploadState3 = blockRow.media;
                                if (mediaUploadState3 != null && mediaUploadState3.isReady()) {
                                    TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) blockRow.block;
                                    if (pageblockaudio.audio_id != 0) {
                                        if (pageblockaudio.caption == null) {
                                            pageblockaudio.caption = new TL_iv.PageCaption();
                                            ((TL_iv.pageBlockAudio) blockRow.block).caption.text = new TL_iv.textEmpty();
                                            ((TL_iv.pageBlockAudio) blockRow.block).caption.credit = new TL_iv.textEmpty();
                                        }
                                        arrayList.add(blockRow.block);
                                    }
                                }
                            } else if (pageBlock3 instanceof TL_iv.pageBlockMap) {
                                TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock3;
                                if (RichMapCell.hasGeo(pageblockmap)) {
                                    if (pageblockmap.caption == null) {
                                        TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
                                        pageblockmap.caption = pageCaption;
                                        pageCaption.text = new TL_iv.textEmpty();
                                        pageblockmap.caption.credit = new TL_iv.textEmpty();
                                    }
                                    arrayList.add(pageblockmap);
                                }
                            } else if (pageBlock3 instanceof TL_iv.pageBlockMath) {
                                if (!TextUtils.isEmpty(((TL_iv.pageBlockMath) pageBlock3).source)) {
                                    arrayList.add(blockRow.block);
                                }
                            } else if (pageBlock3 instanceof TL_iv.pageBlockTable) {
                                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock3;
                                TableModel.normalizeForSend(pageblocktable);
                                if (tableHasText(pageblocktable)) {
                                    arrayList.add(pageblocktable);
                                }
                            } else {
                                arrayList.add(pageBlock3);
                            }
                        }
                    } else {
                        int[] iArr = {i3};
                        TL_iv.PageBlock pageBlockBuildListBlock = buildListBlock(i3, i4, blockRow.num > 0, iArr);
                        if (pageBlockBuildListBlock != null) {
                            arrayList.add(pageBlockBuildListBlock);
                        }
                        i3 = iArr[0];
                        if (i3 <= 0) {
                            i3 = i2;
                        }
                    }
                }
            }
            i3++;
        }
        if (!z) {
            while (!arrayList.isEmpty() && isEmptyTextBlock((TL_iv.PageBlock) arrayList.get(0))) {
                arrayList.remove(0);
            }
            while (!arrayList.isEmpty() && isEmptyTextBlock((TL_iv.PageBlock) arrayList.get(arrayList.size() - 1))) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
        return arrayList;
    }

    private org.telegram.tgnet.tl.TL_iv.PageBlock buildListBlock(int r17, int r18, boolean r19, int[] r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iv.RichEditorListView.buildListBlock(int, int, boolean, int[]):org.telegram.tgnet.tl.TL_iv$PageBlock");
    }

    BlockRow findFocusedRow() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof RichTextCell) {
                RichTextCell richTextCell = (RichTextCell) childAt;
                if (richTextCell.getEditText().isFocused() || (richTextCell.isAuthorVisible() && richTextCell.isAuthorFocused())) {
                    return richTextCell.getRow();
                }
            }
        }
        return null;
    }

    private boolean tryPlainArrowAcrossCells(int i) {
        int iIndexOf;
        Layout layout;
        int iFindNextNavigableRow;
        Layout layout2;
        boolean z = i == 20;
        RichTableCell richTableCellFocusedTitleTable = focusedTitleTable();
        if (richTableCellFocusedTitleTable != null) {
            int iIndexOf2 = this.rows.indexOf(richTableCellFocusedTitleTable.getRow());
            if (iIndexOf2 < 0) {
                return false;
            }
            if (z) {
                if (richTableCellFocusedTitleTable.focusFirstCell()) {
                    return true;
                }
                int iFindNextNavigableRow2 = findNextNavigableRow(iIndexOf2 + 1, 1);
                if (iFindNextNavigableRow2 < 0) {
                    final BlockRow blockRow = new BlockRow(new TL_iv.pageBlockParagraph());
                    this.rows.add(blockRow);
                    this.adapter.update(false);
                    post(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$tryPlainArrowAcrossCells$52(blockRow);
                        }
                    });
                } else {
                    final BlockRow blockRow2 = (BlockRow) this.rows.get(iFindNextNavigableRow2);
                    post(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$tryPlainArrowAcrossCells$53(blockRow2);
                        }
                    });
                }
                return true;
            }
            int iFindNextNavigableRow3 = findNextNavigableRow(iIndexOf2 - 1, -1);
            if (iFindNextNavigableRow3 < 0) {
                return false;
            }
            final BlockRow blockRow3 = (BlockRow) this.rows.get(iFindNextNavigableRow3);
            post(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$tryPlainArrowAcrossCells$54(blockRow3);
                }
            });
            return true;
        }
        BlockRow blockRowFindFocusedNavRow = findFocusedNavRow();
        if (blockRowFindFocusedNavRow == null || (iIndexOf = this.rows.indexOf(blockRowFindFocusedNavRow)) < 0) {
            return false;
        }
        View viewFindViewByItemObject = findViewByItemObject(blockRowFindFocusedNavRow);
        if (viewFindViewByItemObject instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) viewFindViewByItemObject;
            if (richTextCell.isAuthorVisible()) {
                if (z && !richTextCell.isAuthorFocused()) {
                    Layout layout3 = richTextCell.getEditText().getLayout();
                    if (layout3 == null || layout3.getLineForOffset(richTextCell.getEditText().getSelectionEnd()) >= layout3.getLineCount() - 1) {
                        richTextCell.focusAuthorFromBody();
                        return true;
                    }
                } else if (!z && richTextCell.isAuthorFocused() && ((layout2 = richTextCell.getAuthorEditText().getLayout()) == null || layout2.getLineForOffset(richTextCell.getAuthorEditText().getSelectionEnd()) <= 0)) {
                    richTextCell.focusBodyFromAuthor();
                    return true;
                }
            }
        }
        RichEditText richEditTextFocusedNavEditText = focusedNavEditText(viewFindViewByItemObject);
        if (richEditTextFocusedNavEditText == null || (layout = richEditTextFocusedNavEditText.getLayout()) == null) {
            return false;
        }
        int lineForOffset = layout.getLineForOffset(richEditTextFocusedNavEditText.getSelectionEnd());
        if (!z) {
            if (lineForOffset > 0 || (iFindNextNavigableRow = findNextNavigableRow(iIndexOf - 1, -1)) < 0) {
                return false;
            }
            final BlockRow blockRow4 = (BlockRow) this.rows.get(iFindNextNavigableRow);
            post(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$tryPlainArrowAcrossCells$57(blockRow4);
                }
            });
            return true;
        }
        if (lineForOffset < layout.getLineCount() - 1) {
            return false;
        }
        int iFindNextNavigableRow4 = findNextNavigableRow(iIndexOf + 1, 1);
        if (iFindNextNavigableRow4 < 0) {
            final BlockRow blockRow5 = new BlockRow(new TL_iv.pageBlockParagraph());
            this.rows.add(blockRow5);
            this.adapter.update(false);
            post(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$tryPlainArrowAcrossCells$55(blockRow5);
                }
            });
        } else {
            final BlockRow blockRow6 = (BlockRow) this.rows.get(iFindNextNavigableRow4);
            post(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$tryPlainArrowAcrossCells$56(blockRow6);
                }
            });
        }
        return true;
    }

    public void lambda$tryPlainArrowAcrossCells$53(BlockRow blockRow) {
        focusNavRow(blockRow, false);
    }

    public void lambda$tryPlainArrowAcrossCells$54(BlockRow blockRow) {
        focusNavRow(blockRow, true);
    }

    public void lambda$tryPlainArrowAcrossCells$56(BlockRow blockRow) {
        focusNavRow(blockRow, false);
    }

    public void lambda$tryPlainArrowAcrossCells$57(BlockRow blockRow) {
        focusNavRow(blockRow, true);
    }

    private int findNextNavigableRow(int i, int i2) {
        while (i >= 0 && i < this.rows.size()) {
            BlockRow blockRow = (BlockRow) this.rows.get(i);
            if (!blockRow.detailsEnd && !isHiddenByCollapse(i)) {
                TL_iv.PageBlock pageBlock = blockRow.block;
                if (!isNonText(pageBlock) || hasCaption(pageBlock) || (pageBlock instanceof TL_iv.pageBlockTable)) {
                    return i;
                }
            }
            i += i2;
        }
        return -1;
    }

    private boolean isHiddenByCollapse(int i) {
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            BlockRow blockRow = (BlockRow) this.rows.get(i4);
            if (isDetailsHeader(blockRow)) {
                i3++;
                if (i2 == -1 && !((TL_iv.pageBlockDetails) blockRow.block).open) {
                    i2 = i3;
                }
            } else if (blockRow.detailsEnd) {
                if (i2 != -1 && i3 == i2) {
                    i2 = -1;
                }
                i3--;
            }
        }
        return i2 != -1;
    }

    private static boolean hasCaption(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockAudio) || isMedia(pageBlock);
    }

    private RichEditText navEditTextOf(View view) {
        if (view instanceof RichTextCell) {
            return ((RichTextCell) view).getEditText();
        }
        if (view instanceof RichCaptionHost) {
            return ((RichCaptionHost) view).getCaptionEditText();
        }
        if (view instanceof RichDetailsCell) {
            return ((RichDetailsCell) view).getEditText();
        }
        return null;
    }

    private RichEditText focusedNavEditText(View view) {
        if (view instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) view;
            return (richTextCell.isAuthorVisible() && richTextCell.isAuthorFocused()) ? richTextCell.getAuthorEditText() : richTextCell.getEditText();
        }
        return navEditTextOf(view);
    }

    private RichTableCell focusedTitleTable() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof RichTableCell) {
                RichTableCell richTableCell = (RichTableCell) childAt;
                if (richTableCell.getTitleEditText().isFocused()) {
                    return richTableCell;
                }
            }
        }
        return null;
    }

    private BlockRow findFocusedNavRow() {
        for (int i = 0; i < getChildCount(); i++) {
            KeyEvent.Callback childAt = getChildAt(i);
            if (childAt instanceof RichTextCell) {
                RichTextCell richTextCell = (RichTextCell) childAt;
                if (richTextCell.getEditText().isFocused() || (richTextCell.isAuthorVisible() && richTextCell.isAuthorFocused())) {
                    return richTextCell.getRow();
                }
            } else if (childAt instanceof RichCaptionHost) {
                RichCaptionHost richCaptionHost = (RichCaptionHost) childAt;
                if (richCaptionHost.getCaptionEditText().isFocused()) {
                    return richCaptionHost.getRow();
                }
            } else if (childAt instanceof RichDetailsCell) {
                RichDetailsCell richDetailsCell = (RichDetailsCell) childAt;
                if (richDetailsCell.getEditText().isFocused()) {
                    return richDetailsCell.getRow();
                }
            } else {
                continue;
            }
        }
        return null;
    }

    private void focusNavRow(BlockRow blockRow, boolean z) {
        View viewFindViewByItemObject = findViewByItemObject(blockRow);
        if (viewFindViewByItemObject instanceof RichTableCell) {
            ((RichTableCell) viewFindViewByItemObject).focusEdgeCell(z);
            return;
        }
        if (z && (viewFindViewByItemObject instanceof RichTextCell)) {
            RichTextCell richTextCell = (RichTextCell) viewFindViewByItemObject;
            if (richTextCell.isAuthorVisible()) {
                richTextCell.focusAuthorEnd();
                return;
            }
        }
        RichEditText richEditTextNavEditTextOf = navEditTextOf(viewFindViewByItemObject);
        if (richEditTextNavEditTextOf == null) {
            lambda$tryPlainArrowAcrossCells$55(blockRow);
            return;
        }
        richEditTextNavEditTextOf.requestEditFocus();
        if (z) {
            richEditTextNavEditTextOf.setSelection(richEditTextNavEditTextOf.length());
        }
    }

    private boolean tryEscalateSelectionFromCaret(int i) {
        int iIndexOf;
        boolean z;
        BlockRow blockRowFindFocusedRow = findFocusedRow();
        if (blockRowFindFocusedRow == null || (iIndexOf = this.rows.indexOf(blockRowFindFocusedRow)) < 0) {
            return false;
        }
        View viewFindViewByItemObject = findViewByItemObject(blockRowFindFocusedRow);
        if (!(viewFindViewByItemObject instanceof RichTextCell)) {
            return false;
        }
        RichTextCell richTextCell = (RichTextCell) viewFindViewByItemObject;
        RichEditText editText = richTextCell.getEditText();
        if (editText.getLayout() == null) {
            return false;
        }
        int selectionEnd = editText.getSelectionEnd();
        int length = editText.length();
        switch (i) {
            case 19:
            case 21:
                if (selectionEnd > 0) {
                    return false;
                }
                z = false;
                break;
            case 20:
            case 22:
                if (selectionEnd < length) {
                    return false;
                }
                z = true;
                break;
            default:
                return false;
        }
        int i2 = z ? iIndexOf + 1 : iIndexOf - 1;
        if (i2 < 0 || i2 >= this.rows.size()) {
            return false;
        }
        final BlockRow blockRow = (BlockRow) this.rows.get(i2);
        for (int i3 = 0; i3 < this.rows.size(); i3++) {
            this.textSelectionHelper.cacheText(i3, RichTextCell.readPlainText(((BlockRow) this.rows.get(i3)).block), null);
        }
        if (length == 0) {
            return false;
        }
        int iMax = Math.max(0, Math.min(editText.getSelectionStart(), length));
        if (z) {
            TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
            if (iMax >= length) {
                length--;
            }
            if (!articleTextSelectionHelper.selectRangeOf(richTextCell, iMax, length)) {
                return false;
            }
            KeyEvent.Callback callbackFindViewByItemObject = findViewByItemObject(blockRow);
            if (callbackFindViewByItemObject instanceof TextSelectionHelper.ArticleSelectableView) {
                this.textSelectionHelper.extendSelectionTo((TextSelectionHelper.ArticleSelectableView) callbackFindViewByItemObject, 0);
            } else {
                scrollToPosition(i2);
                post(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$tryEscalateSelectionFromCaret$58(blockRow);
                    }
                });
            }
        } else {
            if (!this.textSelectionHelper.selectRangeOf(richTextCell, iMax, iMax > 0 ? 0 : 1)) {
                return false;
            }
            KeyEvent.Callback callbackFindViewByItemObject2 = findViewByItemObject(blockRow);
            if (callbackFindViewByItemObject2 instanceof TextSelectionHelper.ArticleSelectableView) {
                this.textSelectionHelper.extendSelectionTo((TextSelectionHelper.ArticleSelectableView) callbackFindViewByItemObject2, callbackFindViewByItemObject2 instanceof RichTextCell ? ((RichTextCell) callbackFindViewByItemObject2).getEditText().length() : 0);
            } else {
                scrollToPosition(i2);
                post(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$tryEscalateSelectionFromCaret$59(blockRow);
                    }
                });
            }
        }
        return true;
    }

    public void lambda$tryEscalateSelectionFromCaret$58(BlockRow blockRow) {
        KeyEvent.Callback callbackFindViewByItemObject = findViewByItemObject(blockRow);
        if (callbackFindViewByItemObject instanceof TextSelectionHelper.ArticleSelectableView) {
            this.textSelectionHelper.extendSelectionTo((TextSelectionHelper.ArticleSelectableView) callbackFindViewByItemObject, 0);
        }
    }

    public void lambda$tryEscalateSelectionFromCaret$59(BlockRow blockRow) {
        KeyEvent.Callback callbackFindViewByItemObject = findViewByItemObject(blockRow);
        if (callbackFindViewByItemObject instanceof TextSelectionHelper.ArticleSelectableView) {
            this.textSelectionHelper.extendSelectionTo((TextSelectionHelper.ArticleSelectableView) callbackFindViewByItemObject, callbackFindViewByItemObject instanceof RichTextCell ? ((RichTextCell) callbackFindViewByItemObject).getEditText().length() : 0);
        }
    }

    private RichTableCell findTableCellAncestor(View view) {
        for (ViewParent parent = view == null ? null : view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof RichTableCell) {
                return (RichTableCell) parent;
            }
        }
        return null;
    }

    private RichTextCell cellAt(int i) {
        if (i < 0) {
            return null;
        }
        View viewFindViewByPosition = this.layoutManager.findViewByPosition(i);
        if (viewFindViewByPosition instanceof RichTextCell) {
            return (RichTextCell) viewFindViewByPosition;
        }
        return null;
    }

    private View selectableAt(int i) {
        if (i < 0) {
            return null;
        }
        return this.layoutManager.findViewByPosition(i);
    }

    private int prevTextOffset(int i) {
        Layout layout;
        View viewSelectableAt = selectableAt(i);
        if (!(viewSelectableAt instanceof RichTextCell) || (layout = ((RichTextCell) viewSelectableAt).getEditText().getLayout()) == null) {
            return 0;
        }
        return layout.getText().length();
    }

    private boolean tryExtendSelectionAcrossCells(int r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iv.RichEditorListView.tryExtendSelectionAcrossCells(int, boolean):boolean");
    }

    public void lambda$tryExtendSelectionAcrossCells$60(int i, int i2, int i3) {
        KeyEvent.Callback callbackSelectableAt = selectableAt(i);
        if (callbackSelectableAt instanceof TextSelectionHelper.ArticleSelectableView) {
            this.textSelectionHelper.extendSelectionTo((TextSelectionHelper.ArticleSelectableView) callbackSelectableAt, i2, i3);
        }
    }

    private int findTableAnchorBelow(TableModel tableModel, int i) {
        if (i < 0 || i >= tableModel.anchors().size()) {
            return -1;
        }
        TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) tableModel.anchors().get(i);
        int iAnchorRowOf = tableModel.anchorRowOf(pagetablecell);
        int iAnchorColOf = tableModel.anchorColOf(pagetablecell);
        int iMax = iAnchorRowOf + Math.max(1, TableModel.spanRow(pagetablecell));
        if (iMax >= tableModel.rowCount) {
            return -1;
        }
        return tableModel.flatIndexOfAnchor(tableModel.grid[iMax][Math.min(iAnchorColOf, tableModel.colCount - 1)]);
    }

    private int findTableAnchorAbove(TableModel tableModel, int i) {
        if (i < 0 || i >= tableModel.anchors().size()) {
            return -1;
        }
        TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) tableModel.anchors().get(i);
        int iAnchorRowOf = tableModel.anchorRowOf(pagetablecell);
        int iAnchorColOf = tableModel.anchorColOf(pagetablecell);
        int i2 = iAnchorRowOf - 1;
        if (i2 < 0) {
            return -1;
        }
        return tableModel.flatIndexOfAnchor(tableModel.grid[i2][Math.min(iAnchorColOf, tableModel.colCount - 1)]);
    }

    private static int wordRight(CharSequence charSequence, int i) {
        BreakIterator wordInstance = BreakIterator.getWordInstance();
        wordInstance.setText(charSequence.toString());
        int iFollowing = wordInstance.following(Math.min(i, charSequence.length()));
        return iFollowing == -1 ? charSequence.length() : iFollowing;
    }

    private static int wordLeft(CharSequence charSequence, int i) {
        BreakIterator wordInstance = BreakIterator.getWordInstance();
        wordInstance.setText(charSequence.toString());
        int iPreceding = wordInstance.preceding(Math.max(0, Math.min(i, charSequence.length())));
        if (iPreceding == -1) {
            return 0;
        }
        return iPreceding;
    }

    public boolean isWholeDocumentSelected() {
        int size;
        if (this.rows.isEmpty() || !this.textSelectionHelper.isInSelectionMode() || this.textSelectionHelper.getStartCell() != 0 || this.textSelectionHelper.getStartChildPosition() != 0 || this.textSelectionHelper.getStartOffset() > 0 || this.textSelectionHelper.getEndCell() != (size = this.rows.size() - 1)) {
            return false;
        }
        BlockRow blockRow = (BlockRow) this.rows.get(size);
        String authorPlain = RichTextCell.isQuoteBlock(blockRow.block) ? RichTextCell.readAuthorPlain(blockRow.block) : "";
        boolean z = !authorPlain.isEmpty();
        if (this.textSelectionHelper.getEndChildPosition() != z) {
            return false;
        }
        return this.textSelectionHelper.getEndOffset() >= (z ? authorPlain.length() : RichTextCell.readPlainText(blockRow.block).length());
    }

    public boolean tryEscalateSelectAll() {
        if (this.rows.isEmpty()) {
            return false;
        }
        if (!this.textSelectionHelper.isInSelectionMode()) {
            if (selectCurrentUnit()) {
                return true;
            }
        } else if (tryEscalateWithinTable()) {
            return true;
        }
        for (int i = 0; i < this.rows.size(); i++) {
            BlockRow blockRow = (BlockRow) this.rows.get(i);
            this.textSelectionHelper.cacheText(i, RichTextCell.readPlainText(blockRow.block), null);
            if (RichTextCell.isQuoteBlock(blockRow.block)) {
                String authorPlain = RichTextCell.readAuthorPlain(blockRow.block);
                if (!authorPlain.isEmpty()) {
                    this.textSelectionHelper.cacheChildText(i, 1, authorPlain);
                }
            }
        }
        int size = this.rows.size() - 1;
        BlockRow blockRow2 = (BlockRow) this.rows.get(size);
        String authorPlain2 = RichTextCell.isQuoteBlock(blockRow2.block) ? RichTextCell.readAuthorPlain(blockRow2.block) : "";
        if (!authorPlain2.isEmpty()) {
            this.textSelectionHelper.selectAllBlocksRange(0, size, 1, authorPlain2.length());
        } else {
            this.textSelectionHelper.selectAllBlocksRange(0, size);
        }
        return true;
    }

    private RichTextCell cellForEditText(RichEditText richEditText) {
        for (ViewParent parent = richEditText.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof RichTextCell) {
                return (RichTextCell) parent;
            }
        }
        return null;
    }

    private boolean selectCurrentUnit() {
        int length;
        int iChildPosForAnchor;
        RichEditText richEditTextFindFocusedEditText = findFocusedEditText();
        if (richEditTextFindFocusedEditText == null || richEditTextFindFocusedEditText.getText() == null || (length = richEditTextFindFocusedEditText.getText().length()) <= 0) {
            return false;
        }
        RichTableCell richTableCellFindTableCellAncestor = findTableCellAncestor(richEditTextFindFocusedEditText);
        if (richTableCellFindTableCellAncestor != null) {
            if (richEditTextFindFocusedEditText == richTableCellFindTableCellAncestor.getTitleEditText()) {
                iChildPosForAnchor = richTableCellFindTableCellAncestor.titleChildPos();
            } else {
                RichTableCellHost richTableCellHostFindHostContaining = richTableCellFindTableCellAncestor.findHostContaining(richEditTextFindFocusedEditText);
                iChildPosForAnchor = richTableCellHostFindHostContaining != null ? richTableCellFindTableCellAncestor.childPosForAnchor(richTableCellHostFindHostContaining.cell) : -1;
            }
            if (iChildPosForAnchor < 0) {
                return false;
            }
            richEditTextFindFocusedEditText.setSelection(richEditTextFindFocusedEditText.getSelectionEnd());
            return this.textSelectionHelper.selectRangeOf(richTableCellFindTableCellAncestor, iChildPosForAnchor, 0, length);
        }
        RichCaptionHost richCaptionHostFindCaptionHostAncestor = findCaptionHostAncestor(richEditTextFindFocusedEditText);
        if (richCaptionHostFindCaptionHostAncestor instanceof TextSelectionHelper.ArticleSelectableView) {
            richEditTextFindFocusedEditText.setSelection(richEditTextFindFocusedEditText.getSelectionEnd());
            return this.textSelectionHelper.selectRangeOf((TextSelectionHelper.ArticleSelectableView) richCaptionHostFindCaptionHostAncestor, 0, 0, length);
        }
        RichTextCell richTextCellCellForEditText = cellForEditText(richEditTextFindFocusedEditText);
        if (richTextCellCellForEditText != null) {
            int i = richEditTextFindFocusedEditText == richTextCellCellForEditText.getAuthorEditText() ? 1 : 0;
            richEditTextFindFocusedEditText.setSelection(richEditTextFindFocusedEditText.getSelectionEnd());
            return this.textSelectionHelper.selectRangeOf(richTextCellCellForEditText, i, 0, length);
        }
        return false;
    }

    private boolean tryEscalateWithinTable() {
        int startCell = this.textSelectionHelper.getStartCell();
        if (startCell != this.textSelectionHelper.getEndCell()) {
            return false;
        }
        View viewSelectableAt = selectableAt(startCell);
        if (!(viewSelectableAt instanceof RichTableCell)) {
            return false;
        }
        RichTableCell richTableCell = (RichTableCell) viewSelectableAt;
        if (isWholeTableSelected(richTableCell)) {
            return false;
        }
        return selectWholeTable(richTableCell);
    }

    private int[] wholeTableEnd(RichTableCell richTableCell) {
        for (int iChildCount = richTableCell.childCount() - 1; iChildCount >= 0; iChildCount--) {
            int iChildTextLength = richTableCell.childTextLength(iChildCount);
            if (iChildTextLength > 0) {
                return new int[]{iChildCount, iChildTextLength};
            }
        }
        return null;
    }

    private boolean selectWholeTable(RichTableCell richTableCell) {
        int[] iArrWholeTableEnd = wholeTableEnd(richTableCell);
        if (iArrWholeTableEnd == null) {
            return false;
        }
        return this.textSelectionHelper.selectChildRange(richTableCell, 0, 0, iArrWholeTableEnd[0], iArrWholeTableEnd[1]);
    }

    private boolean isWholeTableSelected(RichTableCell richTableCell) {
        int[] iArrWholeTableEnd = wholeTableEnd(richTableCell);
        return iArrWholeTableEnd != null && this.textSelectionHelper.getStartChildPosition() == 0 && this.textSelectionHelper.getStartOffset() == 0 && this.textSelectionHelper.getEndChildPosition() == iArrWholeTableEnd[0] && this.textSelectionHelper.getEndOffset() == iArrWholeTableEnd[1];
    }

    public void copyHelperSelection() {
        CharSequence selectedTextPublic = this.textSelectionHelper.getSelectedTextPublic();
        if (selectedTextPublic == null || selectedTextPublic.length() == 0) {
            return;
        }
        writeSelectionToClipboard(selectedTextPublic);
    }

    public void cutHelperSelection() {
        CharSequence selectedTextPublic = this.textSelectionHelper.getSelectedTextPublic();
        if (selectedTextPublic != null && selectedTextPublic.length() > 0) {
            writeSelectionToClipboard(selectedTextPublic);
        }
        deleteHelperSelection();
    }

    private void writeSelectionToClipboard(CharSequence charSequence) {
        ClipData clipDataNewPlainText;
        String strBuildSelectionHtml = buildSelectionHtml();
        try {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                return;
            }
            if (strBuildSelectionHtml != null) {
                clipDataNewPlainText = ClipData.newHtmlText("label", charSequence, strBuildSelectionHtml);
            } else {
                clipDataNewPlainText = ClipData.newPlainText("label", charSequence);
            }
            clipboardManager.setPrimaryClip(clipDataNewPlainText);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private String buildSelectionHtml() {
        int iIndexOf = this.rows.indexOf(rowForCell(this.textSelectionHelper.getStartCell()));
        int iIndexOf2 = this.rows.indexOf(rowForCell(this.textSelectionHelper.getEndCell()));
        int startOffset = this.textSelectionHelper.getStartOffset();
        int endOffset = this.textSelectionHelper.getEndOffset();
        if (iIndexOf >= 0 && iIndexOf2 >= 0 && iIndexOf < this.rows.size() && iIndexOf2 < this.rows.size()) {
            if (iIndexOf > iIndexOf2) {
                iIndexOf2 = iIndexOf;
                iIndexOf = iIndexOf2;
                endOffset = startOffset;
                startOffset = endOffset;
            } else if (iIndexOf == iIndexOf2 && startOffset > endOffset) {
                endOffset = startOffset;
                startOffset = endOffset;
            }
            try {
                String strSerialize = RichHtml.serialize(this.rows, iIndexOf, iIndexOf2, startOffset, endOffset);
                if (TextUtils.isEmpty(strSerialize)) {
                    return null;
                }
                return strSerialize;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return null;
    }

    public void pasteAtHelperSelection() {
        ClipData primaryClip;
        String htmlText;
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
            }
        }
        if (!TextUtils.isEmpty(htmlText)) {
            try {
                List listResolvePastedMedia = resolvePastedMedia(RichHtml.parse(htmlText));
                if (listResolvePastedMedia != null && !listResolvePastedMedia.isEmpty()) {
                    if (pasteBlocksAtSelection(listResolvePastedMedia)) {
                        return;
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        CharSequence charSequenceCoerceToText = itemAt.coerceToText(getContext());
        if (charSequenceCoerceToText == null) {
            charSequenceCoerceToText = "";
        }
        applyEditRange(this.textSelectionHelper.getStartCell(), this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndCell(), this.textSelectionHelper.getEndOffset(), charSequenceCoerceToText.toString().split("\n", -1));
    }

    private boolean pasteBlocksAtSelection(List list) {
        return spliceBlocksInto(this.rows.indexOf(rowForCell(this.textSelectionHelper.getStartCell())), this.rows.indexOf(rowForCell(this.textSelectionHelper.getEndCell())), this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset(), list);
    }

    public boolean onCellPaste(BlockRow blockRow, RichEditText richEditText) {
        ClipboardManager clipboardManager;
        ClipData primaryClip;
        int iIndexOf;
        if (blockRow != null && richEditText != null && (clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard")) != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() != 0 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
            try {
                String htmlText = primaryClip.getItemAt(0).getHtmlText();
                if (TextUtils.isEmpty(htmlText)) {
                    return false;
                }
                try {
                    List listResolvePastedMedia = resolvePastedMedia(RichHtml.parse(htmlText));
                    if (listResolvePastedMedia == null || listResolvePastedMedia.isEmpty()) {
                        return false;
                    }
                    if ((listResolvePastedMedia.size() == 1 && isPlainParagraphRow((BlockRow) listResolvePastedMedia.get(0))) || (iIndexOf = this.rows.indexOf(blockRow)) < 0) {
                        return false;
                    }
                    int iMax = Math.max(0, Math.min(richEditText.getSelectionStart(), richEditText.getSelectionEnd()));
                    return spliceBlocksInto(iIndexOf, iIndexOf, iMax, Math.max(iMax, Math.max(richEditText.getSelectionStart(), richEditText.getSelectionEnd())), listResolvePastedMedia);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private boolean spliceBlocksInto(int i, int i2, int i3, int i4, List list) {
        final int iCaretEndOf;
        if (i < 0 || i2 < 0 || i >= this.rows.size() || i2 >= this.rows.size()) {
            return false;
        }
        if (i > i2) {
            i2 = i;
            i = i2;
            i4 = i3;
            i3 = i4;
        } else if (i == i2 && i3 > i4) {
            i4 = i3;
            i3 = i4;
        }
        for (int i5 = i; i5 <= i2; i5++) {
            BlockRow blockRow = (BlockRow) this.rows.get(i5);
            if (blockRow.detailsEnd || isDetailsHeader(blockRow) || isNonText(blockRow.block) || hasCaption(blockRow.block) || (blockRow.block instanceof TL_iv.pageBlockTable)) {
                return false;
            }
        }
        final BlockRow blockRow2 = (BlockRow) this.rows.get(i);
        BlockRow blockRow3 = (BlockRow) this.rows.get(i2);
        CharSequence styledText = RichTextCell.readStyledText(blockRow2.block);
        CharSequence styledText2 = i == i2 ? styledText : RichTextCell.readStyledText(blockRow3.block);
        if (styledText == null) {
            styledText = "";
        }
        if (styledText2 == null) {
            styledText2 = "";
        }
        int iMax = Math.max(0, Math.min(i3, styledText.length()));
        int iMax2 = Math.max(0, Math.min(i4, styledText2.length()));
        CharSequence charSequenceSubSequence = styledText.subSequence(0, iMax);
        CharSequence charSequenceSubSequence2 = styledText2.subSequence(iMax2, styledText2.length());
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        if (list.size() == 1 && isPlainParagraphRow((BlockRow) list.get(0))) {
            ?? styledText3 = RichTextCell.readStyledText(((BlockRow) list.get(0)).block);
            String str = styledText3 != 0 ? styledText3 : "";
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceSubSequence);
            spannableStringBuilder.append((CharSequence) str);
            iCaretEndOf = spannableStringBuilder.length();
            spannableStringBuilder.append(charSequenceSubSequence2);
            RichTextCell.applyStyledTextToBlock(blockRow2.block, spannableStringBuilder);
            while (i2 > i) {
                this.rows.remove(i2);
                i2--;
            }
        } else {
            ArrayList arrayList = new ArrayList(list);
            if (charSequenceSubSequence.length() > 0) {
                TL_iv.PageBlock pageBlockNewSameTypeBlock = newSameTypeBlock(blockRow2.block);
                RichTextCell.applyStyledTextToBlock(pageBlockNewSameTypeBlock, charSequenceSubSequence);
                arrayList.add(0, new BlockRow(pageBlockNewSameTypeBlock, blockRow2.level, blockRow2.num));
            }
            blockRow2 = (BlockRow) list.get(list.size() - 1);
            iCaretEndOf = caretEndOf(blockRow2);
            if (charSequenceSubSequence2.length() > 0) {
                TL_iv.PageBlock pageBlockNewSameTypeBlock2 = newSameTypeBlock(blockRow3.block);
                RichTextCell.applyStyledTextToBlock(pageBlockNewSameTypeBlock2, charSequenceSubSequence2);
                arrayList.add(new BlockRow(pageBlockNewSameTypeBlock2, blockRow3.level, blockRow3.num));
            }
            while (i2 >= i) {
                this.rows.remove(i2);
                i2--;
            }
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                this.rows.add(i + i6, (BlockRow) arrayList.get(i6));
            }
        }
        renumberAllRuns();
        this.textSelectionHelper.clear();
        this.adapter.update(false);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        post(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$spliceBlocksInto$61(blockRow2, iCaretEndOf);
            }
        });
        return true;
    }

    public void lambda$spliceBlocksInto$61(BlockRow blockRow, int i) {
        View viewFindViewByItemObject = blockRow == null ? null : findViewByItemObject(blockRow);
        if (viewFindViewByItemObject instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) viewFindViewByItemObject;
            richTextCell.requestEditFocus();
            richTextCell.getEditText().setSelection(Math.min(i, richTextCell.getEditText().length()));
        }
    }

    private static boolean isPlainParagraphRow(BlockRow blockRow) {
        return (blockRow == null || blockRow.detailsEnd || isDetailsHeader(blockRow) || !(blockRow.block instanceof TL_iv.pageBlockParagraph) || blockRow.level != 0 || blockRow.num != 0 || blockRow.checkbox) ? false : true;
    }

    private static TL_iv.PageBlock newSameTypeBlock(TL_iv.PageBlock pageBlock) {
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

    private static int caretEndOf(BlockRow blockRow) {
        CharSequence styledText;
        if (blockRow == null) {
            return 0;
        }
        if (isDetailsHeader(blockRow)) {
            CharSequence spannable = RichTextStyle.toSpannable(((TL_iv.pageBlockDetails) blockRow.block).title);
            if (spannable == null) {
                return 0;
            }
            return spannable.length();
        }
        if (!isTextBearing(blockRow.block) || (styledText = RichTextCell.readStyledText(blockRow.block)) == null) {
            return 0;
        }
        return styledText.length();
    }

    private static boolean isTextBearing(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote) || isHeading(pageBlock);
    }

    private void deleteHelperSelection() {
        applyEditRange(this.textSelectionHelper.getStartCell(), this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndCell(), this.textSelectionHelper.getEndOffset(), new String[]{""});
    }

    public void replaceHelperSelectionWith(String str) {
        applyEditRange(this.textSelectionHelper.getStartCell(), this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndCell(), this.textSelectionHelper.getEndOffset(), str.split("\n", -1));
    }

    private void applyEditRange(int i, int i2, int i3, int i4, String[] strArr) {
        final int length;
        int iIndexOf = this.rows.indexOf(rowForCell(i));
        int iIndexOf2 = this.rows.indexOf(rowForCell(i3));
        if (iIndexOf < 0 || iIndexOf2 < 0 || iIndexOf >= this.rows.size() || iIndexOf2 >= this.rows.size()) {
            return;
        }
        BlockRow blockRow = (BlockRow) this.rows.get(iIndexOf);
        BlockRow blockRow2 = (BlockRow) this.rows.get(iIndexOf2);
        if (iIndexOf == iIndexOf2 && isDetailsHeader(blockRow)) {
            applyEditInsideDetails(blockRow, i2, i4, strArr);
            return;
        }
        for (int i5 = iIndexOf; i5 <= iIndexOf2; i5++) {
            if (((BlockRow) this.rows.get(i5)).detailsEnd || isDetailsHeader((BlockRow) this.rows.get(i5))) {
                deleteAcrossDetails(iIndexOf, i2, iIndexOf2, i4, strArr);
                return;
            }
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        TL_iv.PageBlock pageBlock = blockRow.block;
        boolean z = pageBlock instanceof TL_iv.pageBlockTable;
        boolean z2 = blockRow2.block instanceof TL_iv.pageBlockTable;
        if (z || z2) {
            if (z && z2 && iIndexOf == iIndexOf2) {
                applyEditInsideTable(blockRow, this.textSelectionHelper.getStartChildPosition(), i2, this.textSelectionHelper.getEndChildPosition(), i4, strArr);
                return;
            }
            return;
        }
        boolean zHasCaption = hasCaption(pageBlock);
        boolean zHasCaption2 = hasCaption(blockRow2.block);
        if (zHasCaption || zHasCaption2) {
            if (zHasCaption && zHasCaption2 && iIndexOf == iIndexOf2) {
                applyEditInsideCaption(blockRow, i2, i4, strArr);
                return;
            }
            return;
        }
        if (iIndexOf == iIndexOf2 && RichTextCell.isQuoteBlock(blockRow.block) && this.textSelectionHelper.getStartChildPosition() == 1 && this.textSelectionHelper.getEndChildPosition() == 1) {
            applyEditInsideAuthor(blockRow, i2, i4, strArr);
            return;
        }
        String plainText = RichTextCell.readPlainText(blockRow.block);
        String plainText2 = iIndexOf == iIndexOf2 ? plainText : RichTextCell.readPlainText(blockRow2.block);
        int iMax = Math.max(0, Math.min(i2, plainText.length()));
        int iMax2 = Math.max(0, Math.min(i4, plainText2.length()));
        String strSubstring = plainText.substring(0, iMax);
        String strSubstring2 = plainText2.substring(iMax2);
        if (strArr.length <= 1) {
            String str = strArr.length == 0 ? "" : strArr[0];
            RichTextCell.applyTextToBlock(blockRow.block, strSubstring + str + strSubstring2);
            if (iIndexOf2 > iIndexOf) {
                while (iIndexOf2 > iIndexOf) {
                    this.rows.remove(iIndexOf2);
                    iIndexOf2--;
                }
            }
            length = strSubstring.length() + str.length();
        } else {
            RichTextCell.applyTextToBlock(blockRow.block, strSubstring + strArr[0]);
            if (iIndexOf2 > iIndexOf) {
                while (iIndexOf2 > iIndexOf) {
                    this.rows.remove(iIndexOf2);
                    iIndexOf2--;
                }
            }
            for (int i6 = 1; i6 < strArr.length - 1; i6++) {
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                applyPlainText(pageblockparagraph, strArr[i6]);
                ArrayList arrayList = this.rows;
                int i7 = iIndexOf + i6;
                int i8 = blockRow.level;
                int i9 = blockRow.num;
                if (i9 > 0) {
                    i9 += i6;
                }
                arrayList.add(i7, new BlockRow(pageblockparagraph, i8, i9));
            }
            String str2 = strArr[strArr.length - 1];
            TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
            applyPlainText(pageblockparagraph2, str2 + strSubstring2);
            ArrayList arrayList2 = this.rows;
            int length2 = (strArr.length + iIndexOf) - 1;
            int i10 = blockRow.level;
            int length3 = blockRow.num;
            if (length3 > 0) {
                length3 = (length3 + strArr.length) - 1;
            }
            arrayList2.add(length2, new BlockRow(pageblockparagraph2, i10, length3));
            iIndexOf = (iIndexOf + strArr.length) - 1;
            length = str2.length();
        }
        renumberAllRuns();
        final BlockRow blockRow3 = (iIndexOf < 0 || iIndexOf >= this.rows.size()) ? null : (BlockRow) this.rows.get(iIndexOf);
        this.textSelectionHelper.clear();
        this.adapter.update(false);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        post(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$applyEditRange$62(blockRow3, length);
            }
        });
    }

    public void lambda$applyEditRange$62(BlockRow blockRow, int i) {
        View viewFindViewByItemObject = blockRow == null ? null : findViewByItemObject(blockRow);
        if (viewFindViewByItemObject instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) viewFindViewByItemObject;
            richTextCell.requestEditFocus();
            richTextCell.getEditText().setSelection(Math.min(i, richTextCell.getEditText().length()));
        }
    }

    private void applyEditInsideTableTitle(RichTableCell richTableCell, BlockRow blockRow, int i, int i2, String[] strArr) {
        TL_iv.PageBlock pageBlock = blockRow.block;
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock;
            RichEditorHistory richEditorHistory = this.history;
            if (richEditorHistory != null) {
                richEditorHistory.flush();
            }
            String strPlainOf = RichTextStyle.plainOf(pageblocktable.title);
            int iMax = Math.max(0, Math.min(Math.min(i, i2), strPlainOf.length()));
            int iMax2 = Math.max(0, Math.min(Math.max(i, i2), strPlainOf.length()));
            StringBuilder sb = new StringBuilder();
            for (int i3 = 0; i3 < strArr.length; i3++) {
                if (i3 > 0) {
                    sb.append(' ');
                }
                sb.append(strArr[i3]);
            }
            String string = sb.toString();
            String str = strPlainOf.substring(0, iMax) + string + strPlainOf.substring(iMax2);
            TL_iv.textPlain textplain = new TL_iv.textPlain();
            textplain.text = str;
            pageblocktable.title = textplain;
            final RichEditText titleEditText = richTableCell.getTitleEditText();
            titleEditText.setTextSilently(str);
            titleEditText.invalidateEffects();
            final int length = iMax + string.length();
            this.textSelectionHelper.clear();
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
            this.delegate.onContentChanged();
            post(new Runnable() {
                @Override
                public final void run() {
                    RichEditorListView.lambda$applyEditInsideTableTitle$63(titleEditText, length);
                }
            });
        }
    }

    public static void lambda$applyEditInsideTableTitle$63(RichEditText richEditText, int i) {
        richEditText.requestEditFocus();
        richEditText.setSelection(Math.max(0, Math.min(i, richEditText.length())));
    }

    private void applyEditInsideAuthor(BlockRow blockRow, int i, int i2, String[] strArr) {
        View viewFindViewByItemObject = findViewByItemObject(blockRow);
        if (viewFindViewByItemObject instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) viewFindViewByItemObject;
            final RichEditText authorEditText = richTextCell.getAuthorEditText();
            RichEditorHistory richEditorHistory = this.history;
            if (richEditorHistory != null) {
                richEditorHistory.flush();
            }
            StringBuilder sb = new StringBuilder();
            for (int i3 = 0; i3 < strArr.length; i3++) {
                if (i3 > 0) {
                    sb.append(' ');
                }
                sb.append(strArr[i3]);
            }
            String string = sb.toString();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(authorEditText.getText());
            int length = spannableStringBuilder.length();
            int iMax = Math.max(0, Math.min(Math.min(i, i2), length));
            spannableStringBuilder.replace(iMax, Math.max(0, Math.min(Math.max(i, i2), length)), (CharSequence) string);
            authorEditText.setTextSilently(spannableStringBuilder);
            authorEditText.invalidateEffects();
            richTextCell.persistAuthor();
            final int length2 = iMax + string.length();
            this.textSelectionHelper.clear();
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
            this.delegate.onContentChanged();
            post(new Runnable() {
                @Override
                public final void run() {
                    RichEditorListView.lambda$applyEditInsideAuthor$64(authorEditText, length2);
                }
            });
        }
    }

    public static void lambda$applyEditInsideAuthor$64(RichEditText richEditText, int i) {
        richEditText.requestEditFocus();
        richEditText.setSelection(Math.max(0, Math.min(i, richEditText.length())));
    }

    RichEditText getFocusedEditTextOrNull() {
        View viewFindFocus = findFocus();
        if (viewFindFocus instanceof RichEditText) {
            return (RichEditText) viewFindFocus;
        }
        return null;
    }

    RichEditText findFocusedEditText() {
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

    private static void applyPlainText(TL_iv.PageBlock pageBlock, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
            ((TL_iv.pageBlockParagraph) pageBlock).text = textplain;
        }
    }

    private int detailsDepthBefore(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i && i3 < this.rows.size(); i3++) {
            if (isDetailsHeader((BlockRow) this.rows.get(i3))) {
                i2++;
            } else if (((BlockRow) this.rows.get(i3)).detailsEnd) {
                i2--;
            }
        }
        return i2;
    }

    private void deleteAcrossDetails(int i, int i2, int i3, int i4, String[] strArr) {
        int i5;
        final int length;
        String strSubstring;
        int i6 = i;
        while (i6 > 0 && detailsDepthBefore(i6) > 0) {
            i6--;
        }
        int i7 = i3;
        while (true) {
            i5 = i7 + 1;
            if (i5 >= this.rows.size() || detailsDepthBefore(i5) <= 0) {
                break;
            } else {
                i7 = i5;
            }
        }
        final BlockRow blockRow = (BlockRow) this.rows.get(i);
        BlockRow blockRow2 = (BlockRow) this.rows.get(i3);
        boolean z = i6 != i || isDetailsHeader(blockRow) || blockRow.detailsEnd;
        boolean z2 = i7 != i3 || isDetailsHeader(blockRow2) || blockRow2.detailsEnd;
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < strArr.length; i8++) {
            if (i8 > 0) {
                sb.append(' ');
            }
            sb.append(strArr[i8]);
        }
        String string = sb.toString();
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        if (!z) {
            String plainText = RichTextCell.readPlainText(blockRow.block);
            String strSubstring2 = plainText.substring(0, Math.max(0, Math.min(i2, plainText.length())));
            if (z2) {
                strSubstring = "";
            } else {
                String plainText2 = RichTextCell.readPlainText(blockRow2.block);
                strSubstring = plainText2.substring(Math.max(0, Math.min(i4, plainText2.length())));
            }
            RichTextCell.applyTextToBlock(blockRow.block, strSubstring2 + string + strSubstring);
            this.rows.subList(i6 + 1, i5).clear();
            length = strSubstring2.length() + string.length();
        } else if (!z2) {
            String plainText3 = RichTextCell.readPlainText(blockRow2.block);
            String strSubstring3 = plainText3.substring(Math.max(0, Math.min(i4, plainText3.length())));
            RichTextCell.applyTextToBlock(blockRow2.block, string + strSubstring3);
            this.rows.subList(i6, i7).clear();
            length = string.length();
            blockRow = blockRow2;
        } else {
            this.rows.subList(i6, i5).clear();
            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
            applyPlainText(pageblockparagraph, string);
            blockRow = new BlockRow(pageblockparagraph);
            ArrayList arrayList = this.rows;
            arrayList.add(Math.min(i6, arrayList.size()), blockRow);
            length = string.length();
        }
        if (this.rows.isEmpty()) {
            blockRow = new BlockRow(new TL_iv.pageBlockParagraph());
            this.rows.add(blockRow);
            length = 0;
        }
        renumberAllRuns();
        this.textSelectionHelper.clear();
        this.adapter.update(false);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        post(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$deleteAcrossDetails$65(blockRow, length);
            }
        });
    }

    public void lambda$deleteAcrossDetails$65(BlockRow blockRow, int i) {
        View viewFindViewByItemObject = findViewByItemObject(blockRow);
        if (viewFindViewByItemObject instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) viewFindViewByItemObject;
            richTextCell.requestEditFocus();
            richTextCell.getEditText().setSelection(Math.max(0, Math.min(i, richTextCell.getEditText().length())));
        }
    }

    private void applyEditInsideDetails(BlockRow blockRow, int i, int i2, String[] strArr) {
        View viewFindViewByItemObject = findViewByItemObject(blockRow);
        if ((viewFindViewByItemObject instanceof RichDetailsCell) && (blockRow.block instanceof TL_iv.pageBlockDetails)) {
            final RichEditText editText = ((RichDetailsCell) viewFindViewByItemObject).getEditText();
            RichEditorHistory richEditorHistory = this.history;
            if (richEditorHistory != null) {
                richEditorHistory.flush();
            }
            StringBuilder sb = new StringBuilder();
            for (int i3 = 0; i3 < strArr.length; i3++) {
                if (i3 > 0) {
                    sb.append(' ');
                }
                sb.append(strArr[i3]);
            }
            String string = sb.toString();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editText.getText());
            int length = spannableStringBuilder.length();
            int iMax = Math.max(0, Math.min(Math.min(i, i2), length));
            spannableStringBuilder.replace(iMax, Math.max(0, Math.min(Math.max(i, i2), length)), (CharSequence) string);
            editText.setTextSilently(spannableStringBuilder);
            editText.invalidateEffects();
            ((TL_iv.pageBlockDetails) blockRow.block).title = RichTextStyle.fromSpannable(spannableStringBuilder);
            final int length2 = iMax + string.length();
            this.textSelectionHelper.clear();
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
            post(new Runnable() {
                @Override
                public final void run() {
                    RichEditorListView.lambda$applyEditInsideDetails$66(editText, length2);
                }
            });
        }
    }

    public static void lambda$applyEditInsideDetails$66(RichEditText richEditText, int i) {
        richEditText.requestEditFocus();
        richEditText.setSelection(Math.max(0, Math.min(i, richEditText.length())));
    }

    private void applyEditInsideCaption(BlockRow blockRow, int i, int i2, String[] strArr) {
        KeyEvent.Callback callbackFindViewByItemObject = findViewByItemObject(blockRow);
        if (callbackFindViewByItemObject instanceof RichCaptionHost) {
            RichCaptionHost richCaptionHost = (RichCaptionHost) callbackFindViewByItemObject;
            final RichEditText captionEditText = richCaptionHost.getCaptionEditText();
            RichEditorHistory richEditorHistory = this.history;
            if (richEditorHistory != null) {
                richEditorHistory.flush();
            }
            StringBuilder sb = new StringBuilder();
            for (int i3 = 0; i3 < strArr.length; i3++) {
                if (i3 > 0) {
                    sb.append(' ');
                }
                sb.append(strArr[i3]);
            }
            String string = sb.toString();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(captionEditText.getText());
            int length = spannableStringBuilder.length();
            int iMax = Math.max(0, Math.min(Math.min(i, i2), length));
            spannableStringBuilder.replace(iMax, Math.max(0, Math.min(Math.max(i, i2), length)), (CharSequence) string);
            captionEditText.setTextSilently(spannableStringBuilder);
            captionEditText.invalidateEffects();
            richCaptionHost.persistCaption();
            final int length2 = iMax + string.length();
            this.textSelectionHelper.clear();
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
            post(new Runnable() {
                @Override
                public final void run() {
                    RichEditorListView.lambda$applyEditInsideCaption$67(captionEditText, length2);
                }
            });
        }
    }

    public static void lambda$applyEditInsideCaption$67(RichEditText richEditText, int i) {
        richEditText.requestEditFocus();
        richEditText.setSelection(Math.max(0, Math.min(i, richEditText.length())));
    }

    private void applyEditInsideTable(BlockRow blockRow, int i, int i2, int i3, int i4, String[] strArr) {
        final RichTableCell richTableCell;
        TableModel model;
        final int length;
        View viewFindViewByItemObject = findViewByItemObject(blockRow);
        if ((viewFindViewByItemObject instanceof RichTableCell) && (model = (richTableCell = (RichTableCell) viewFindViewByItemObject).getModel()) != null) {
            if (i == 0 && i3 == 0) {
                applyEditInsideTableTitle(richTableCell, blockRow, i2, i4, strArr);
                return;
            }
            int i5 = i - 1;
            int i6 = i3 - 1;
            int size = model.anchors().size();
            if (i5 < 0 || i5 >= size || i6 < 0 || i6 >= size) {
                return;
            }
            RichEditorHistory richEditorHistory = this.history;
            if (richEditorHistory != null) {
                richEditorHistory.flush();
            }
            int i7 = i2;
            int i8 = i4;
            if (i5 > i6 || (i5 == i6 && i7 > i8)) {
                i6 = i5;
                i5 = i6;
                i8 = i7;
                i7 = i8;
            }
            StringBuilder sb = new StringBuilder();
            for (int i9 = 0; i9 < strArr.length; i9++) {
                if (i9 > 0) {
                    sb.append('\n');
                }
                sb.append(strArr[i9]);
            }
            String string = sb.toString();
            final TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) model.anchors().get(i5);
            TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) model.anchors().get(i6);
            if (i5 == i6) {
                String plainText = TableModel.readPlainText(pagetablecell);
                int iMax = Math.max(0, Math.min(i7, plainText.length()));
                String str = plainText.substring(0, iMax) + string + plainText.substring(Math.max(0, Math.min(i8, plainText.length())));
                TableModel.applyPlainText(pagetablecell, str);
                RichTableCellHost richTableCellHostHostForAnchor = richTableCell.getGrid().hostForAnchor(pagetablecell);
                if (richTableCellHostHostForAnchor != null) {
                    richTableCellHostHostForAnchor.editText.setTextSilently(str);
                }
                length = iMax + string.length();
            } else {
                String plainText2 = TableModel.readPlainText(pagetablecell);
                int iMax2 = Math.max(0, Math.min(i7, plainText2.length()));
                String str2 = plainText2.substring(0, iMax2) + string;
                TableModel.applyPlainText(pagetablecell, str2);
                RichTableCellHost richTableCellHostHostForAnchor2 = richTableCell.getGrid().hostForAnchor(pagetablecell);
                if (richTableCellHostHostForAnchor2 != null) {
                    richTableCellHostHostForAnchor2.editText.setTextSilently(str2);
                }
                while (true) {
                    i5++;
                    if (i5 >= i6) {
                        break;
                    }
                    TL_iv.pageTableCell pagetablecell3 = (TL_iv.pageTableCell) model.anchors().get(i5);
                    TableModel.applyPlainText(pagetablecell3, "");
                    RichTableCellHost richTableCellHostHostForAnchor3 = richTableCell.getGrid().hostForAnchor(pagetablecell3);
                    if (richTableCellHostHostForAnchor3 != null) {
                        richTableCellHostHostForAnchor3.editText.setTextSilently("");
                    }
                }
                String plainText3 = TableModel.readPlainText(pagetablecell2);
                String strSubstring = plainText3.substring(Math.max(0, Math.min(i8, plainText3.length())));
                TableModel.applyPlainText(pagetablecell2, strSubstring);
                RichTableCellHost richTableCellHostHostForAnchor4 = richTableCell.getGrid().hostForAnchor(pagetablecell2);
                if (richTableCellHostHostForAnchor4 != null) {
                    richTableCellHostHostForAnchor4.editText.setTextSilently(strSubstring);
                }
                length = iMax2 + string.length();
            }
            this.textSelectionHelper.clear();
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
            post(new Runnable() {
                @Override
                public final void run() {
                    RichEditorListView.lambda$applyEditInsideTable$68(richTableCell, pagetablecell, length);
                }
            });
        }
    }

    public static void lambda$applyEditInsideTable$68(RichTableCell richTableCell, TL_iv.pageTableCell pagetablecell, int i) {
        RichTableCellHost richTableCellHostHostForAnchor = richTableCell.getGrid().hostForAnchor(pagetablecell);
        if (richTableCellHostHostForAnchor == null) {
            return;
        }
        richTableCellHostHostForAnchor.editText.requestEditFocus();
        richTableCellHostHostForAnchor.editText.setSelection(Math.max(0, Math.min(i, richTableCellHostHostForAnchor.editText.length())));
    }
}
