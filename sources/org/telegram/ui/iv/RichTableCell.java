package org.telegram.ui.iv;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import com.google.android.gms.internal.mlkit_vision_common.zzkv;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline1;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.IArticleViewer;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda19;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda3;

public final class RichTableCell extends RichBlockCell implements Theme.Colorable, TextSelectionHelper.ArticleSelectableView {
    public boolean blockRtl;
    public CellSelectionListener cellSelectionListener;
    public RichEditorListView.AnonymousClass12 delegate;
    public final RichEditor$$ExternalSyntheticLambda14 focusInvalidator;
    public final RichTableCellGrid grid;
    public boolean hijackingSelection;
    public TableModel model;
    public final Theme.ResourcesProvider resourcesProvider;
    public final ScrollContent scrollContent;
    public final AnonymousClass2 scrollView;
    public final LinkedHashSet selectedCells;
    public final RichEditText titleEditText;
    public final ArrayList tmpBlocks;

    public final class AnonymousClass2 extends HorizontalScrollView {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass2(FrameLayout frameLayout, Context context, int i) {
            super(context);
            this.$r8$classId = i;
            this.this$0 = frameLayout;
        }

        @Override
        public void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 2:
                    int mode = View.MeasureSpec.getMode(i);
                    if (mode != 1073741824) {
                        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0), i2);
                        int measuredWidth = getMeasuredWidth();
                        int iMin = ((RichEditorToolbar) this.this$0).formattingScrollMaxWidth;
                        if (mode == Integer.MIN_VALUE) {
                            iMin = Math.min(iMin, View.MeasureSpec.getSize(i));
                        }
                        setMeasuredDimension(Math.min(measuredWidth, iMin), getMeasuredHeight());
                    } else {
                        super.onMeasure(i, i2);
                    }
                    break;
                default:
                    super.onMeasure(i, i2);
                    break;
            }
        }

        @Override
        public void onScrollChanged(int i, int i2, int i3, int i4) {
            TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper;
            switch (this.$r8$classId) {
                case 0:
                    super.onScrollChanged(i, i2, i3, i4);
                    RichEditorListView.AnonymousClass12 anonymousClass12 = ((RichTableCell) this.this$0).delegate;
                    if (anonymousClass12 != null && (textSelectionHelper = RichEditorListView.this.getTextSelectionHelper()) != null && textSelectionHelper.isInSelectionMode()) {
                        textSelectionHelper.invalidate();
                    }
                    invalidate();
                    break;
                case 1:
                    super.onScrollChanged(i, i2, i3, i4);
                    IArticleViewer iArticleViewer = (IArticleViewer) this.this$0;
                    if (iArticleViewer.pressedLinkOwnerLayout != null) {
                        iArticleViewer.pressedLinkOwnerLayout = null;
                        iArticleViewer.pressedLinkOwnerView = null;
                    }
                    break;
                default:
                    super.onScrollChanged(i, i2, i3, i4);
                    break;
            }
        }

        public AnonymousClass2(Activity activity, IArticleViewer iArticleViewer) {
            super(activity);
            this.$r8$classId = 1;
            this.this$0 = iArticleViewer;
        }
    }

    public final class AnonymousClass3 implements RichEditText.Listener {
        public final RichTableCellHost val$host;

        public AnonymousClass3(RichTableCellHost richTableCellHost) {
            this.val$host = richTableCellHost;
        }

        @Override
        public final boolean onBackspaceAtStart(RichEditText richEditText) {
            return false;
        }

        @Override
        public final void onBackspaceOnEmpty() {
        }

        @Override
        public final void onEnterPressed(RichEditText richEditText) {
        }

        @Override
        public final void onLockedInsert(CharSequence charSequence) {
            RichEditorListView.AnonymousClass12 anonymousClass12 = RichTableCell.this.delegate;
            if (anonymousClass12 == null || charSequence == null || charSequence.length() <= 0) {
                return;
            }
            RichEditorListView.this.replaceHelperSelectionWith(charSequence.toString());
        }

        @Override
        public final boolean onPaste(RichEditText richEditText) {
            return false;
        }

        @Override
        public final void onRequestWindowFocusable(RichEditText richEditText) {
            RichEditorListView.AnonymousClass12 anonymousClass12 = RichTableCell.this.delegate;
            if (anonymousClass12 != null) {
                RichEditorListView richEditorListView = RichEditorListView.this;
                richEditorListView.prepareEditText(richEditText);
                richEditorListView.delegate.makeEditTextFocusable(richEditText);
            }
        }

        @Override
        public final boolean onSelectAll() {
            RichTableCell richTableCell = RichTableCell.this;
            RichEditorListView.AnonymousClass12 anonymousClass12 = richTableCell.delegate;
            if (anonymousClass12 == null || richTableCell.currentRow == null) {
                return false;
            }
            return RichEditorListView.this.tryEscalateSelectAll();
        }

        @Override
        public final void onSelectionChanged(final RichEditText richEditText, final int i, final int i2) {
            RichEditorListView.AnonymousClass12 anonymousClass12;
            final TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper;
            int iIndexOf;
            RichTableCell richTableCell = RichTableCell.this;
            if (richTableCell.hijackingSelection || i == i2 || (anonymousClass12 = richTableCell.delegate) == null || (textSelectionHelper = RichEditorListView.this.getTextSelectionHelper()) == null) {
                return;
            }
            if (textSelectionHelper.isInSelectionMode() && textSelectionHelper.selectedView == richTableCell) {
                return;
            }
            TL_iv.pageTableCell pagetablecell = this.val$host.cell;
            TableModel tableModel = richTableCell.model;
            final int i3 = (tableModel != null && (iIndexOf = tableModel.anchorsRowMajor.indexOf(pagetablecell)) >= 0) ? iIndexOf + 1 : -1;
            if (i3 < 0) {
                return;
            }
            richTableCell.post(new Runnable() {
                @Override
                public final void run() {
                    RichTableCell.AnonymousClass3 anonymousClass3 = this.f$0;
                    anonymousClass3.getClass();
                    RichEditText richEditText2 = richEditText;
                    int length = richEditText2.length();
                    int i4 = i2;
                    if (length < i4 || richEditText2.getSelectionStart() == richEditText2.getSelectionEnd()) {
                        return;
                    }
                    TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = textSelectionHelper;
                    RichTableCell richTableCell2 = RichTableCell.this;
                    if (articleTextSelectionHelper.selectRangeOf(richTableCell2, i3, i, i4)) {
                        richTableCell2.hijackingSelection = true;
                        richEditText2.setSelection(i4);
                        richTableCell2.hijackingSelection = false;
                    }
                }
            });
        }

        @Override
        public final void onTab(boolean z) {
            RichTableCell.this.moveFocusByTab(this.val$host, z);
        }

        @Override
        public final void onTextChanged(Editable editable) {
            TL_iv.pageTableCell pagetablecell = this.val$host.cell;
            if (pagetablecell != null) {
                TableModel.applyStyledText(pagetablecell, editable);
            }
            RichTableCell richTableCell = RichTableCell.this;
            richTableCell.grid.requestLayout();
            RichEditorListView.AnonymousClass12 anonymousClass12 = richTableCell.delegate;
            if (anonymousClass12 == null || richTableCell.currentRow == null) {
                return;
            }
            anonymousClass12.onTextChanged();
        }

        @Override
        public final void onTextWillChange(int i, int i2) {
            RichEditorHistory richEditorHistory;
            RichTableCell richTableCell = RichTableCell.this;
            RichEditorListView.AnonymousClass12 anonymousClass12 = richTableCell.delegate;
            if (anonymousClass12 == null || richTableCell.currentRow == null || (richEditorHistory = RichEditorListView.this.history) == null) {
                return;
            }
            richEditorHistory.onBeforeChange(i, i2);
        }
    }

    public interface CellSelectionListener {
    }

    public final class Factory extends UItem.UItemFactory {
        public static final int $r8$clinit = 0;

        static {
            UItem.UItemFactory.setup(new Factory());
        }

        @Override
        public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            RichTableCell richTableCell = (RichTableCell) view;
            BlockRow blockRow = (BlockRow) uItem.object;
            RichEditorListView.AnonymousClass12 anonymousClass12 = (RichEditorListView.AnonymousClass12) uItem.object2;
            boolean z2 = true;
            boolean z3 = richTableCell.currentRow != blockRow;
            richTableCell.currentRow = blockRow;
            richTableCell.delegate = anonymousClass12;
            richTableCell.blockRtl = LocaleController.isRTL;
            richTableCell.bindBlockInset(blockRow);
            TL_iv.PageBlock pageBlock = blockRow.block;
            if (pageBlock instanceof TL_iv.pageBlockTable) {
                TableModel tableModel = new TableModel((TL_iv.pageBlockTable) pageBlock);
                richTableCell.model = tableModel;
                RichTableCellGrid richTableCellGrid = richTableCell.grid;
                richTableCellGrid.setModel(tableModel);
                LinkedHashSet linkedHashSet = richTableCell.selectedCells;
                Objects.requireNonNull(linkedHashSet);
                richTableCellGrid.setSelectionProvider(new TodoItemMenu$$ExternalSyntheticLambda3(linkedHashSet, 17));
                richTableCell.wireCellListeners();
                BlockRow blockRow2 = richTableCell.currentRow;
                if (blockRow2 != null) {
                    TL_iv.PageBlock pageBlock2 = blockRow2.block;
                    if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                        TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                        if (pageblocktable.title == null) {
                            pageblocktable.title = new TL_iv.textEmpty();
                        }
                        String strPlainOf = RichTextStyle.plainOf(pageblocktable.title);
                        SpannableStringBuilder spannable = RichTextStyle.toSpannable(pageblocktable.title, null);
                        BlockRow blockRow3 = richTableCell.currentRow;
                        if (!blockRow3.titleAutoBoldInitialized) {
                            blockRow3.titleAutoBoldInitialized = true;
                            if (spannable.length() != 0 && (RichTextStyle.stylesFullyCovering(0, spannable.length(), spannable) & 1) == 0) {
                                z2 = false;
                            }
                            blockRow3.titleAutoBold = z2;
                        }
                        boolean z4 = richTableCell.currentRow.titleAutoBold;
                        RichEditText richEditText = richTableCell.titleEditText;
                        richEditText.setAutoBold(z4);
                        if (z3 || !String.valueOf(richEditText.getText()).equals(strPlainOf)) {
                            richEditText.setTextSilently(Emoji.replaceEmoji(spannable, richEditText.getPaint().getFontMetricsInt(), false));
                            richEditText.invalidateEffects();
                        }
                    }
                }
                richTableCell.updateColors$1();
                richTableCell.scrollContent.requestLayout();
            }
        }

        @Override
        public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            RichTableCell richTableCell = new RichTableCell(context, resourcesProvider);
            richTableCell.setBackground(new RichEditor.DraggingDrawable(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider)));
            return richTableCell;
        }

        @Override
        public final boolean isClickable() {
            return false;
        }
    }

    public final class ScrollContent extends ViewGroup {
        public final int startHandleOffset;

        public ScrollContent(Context context) {
            super(context);
            this.startHandleOffset = AndroidUtilities.dp(16.0f);
            setClipChildren(false);
            setClipToPadding(false);
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            RichTableCell richTableCell = RichTableCell.this;
            int measuredWidth = richTableCell.grid.getMeasuredWidth();
            int measuredHeight = richTableCell.grid.getMeasuredHeight();
            RichTableCellGrid richTableCellGrid = richTableCell.grid;
            int i5 = this.startHandleOffset;
            richTableCellGrid.layout(-i5, 0, measuredWidth - i5, measuredHeight);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int i3 = this.startHandleOffset;
            int iMax = Math.max(0, size + i3);
            RichTableCell richTableCell = RichTableCell.this;
            richTableCell.grid.measure(View.MeasureSpec.makeMeasureSpec(iMax, Integer.MIN_VALUE), i2);
            int measuredWidth = richTableCell.grid.getMeasuredWidth();
            setMeasuredDimension(Math.max(0, measuredWidth - i3), richTableCell.grid.getMeasuredHeight());
        }
    }

    public RichTableCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.tmpBlocks = new ArrayList();
        this.selectedCells = new LinkedHashSet();
        this.focusInvalidator = new RichEditor$$ExternalSyntheticLambda14(this, 4);
        this.resourcesProvider = resourcesProvider;
        setClipChildren(false);
        setClipToPadding(false);
        RichEditText richEditText = new RichEditText(context, resourcesProvider);
        this.titleEditText = richEditText;
        richEditText.setAllowNewlines(false);
        richEditText.setInputType(147457);
        richEditText.setGravity(49);
        richEditText.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        richEditText.setIncludeFontPadding(false);
        richEditText.setMinHeight(0);
        richEditText.setBackground(null);
        richEditText.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), 0);
        richEditText.setHint(LocaleController.getString(R.string.ArticleTableTitleHint));
        richEditText.setCenterEmptyHint(true);
        richEditText.setListener(new PhotoViewer.AnonymousClass49(this, 19));
        richEditText.setDelegate(new TodoItemMenu$$ExternalSyntheticLambda3(this, 16));
        addView(richEditText);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this, context, 0);
        this.scrollView = anonymousClass2;
        anonymousClass2.setClipChildren(false);
        anonymousClass2.setClipToPadding(false);
        anonymousClass2.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(anonymousClass2, LayoutHelper.createFrame(-1, -2.0f, 51, 0.0f, 6.0f, 0.0f, 0.0f));
        RichTableCellGrid richTableCellGrid = new RichTableCellGrid(context, resourcesProvider);
        this.grid = richTableCellGrid;
        ScrollContent scrollContent = new ScrollContent(context);
        this.scrollContent = scrollContent;
        scrollContent.addView(richTableCellGrid);
        anonymousClass2.addView(scrollContent, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    public final void applyInsertColumnFromSelection(boolean z) {
        int iMax;
        int i;
        int i2;
        if (this.model != null) {
            LinkedHashSet<TL_iv.pageTableCell> linkedHashSet = this.selectedCells;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            if (z) {
                Iterator it = linkedHashSet.iterator();
                iMax = Integer.MAX_VALUE;
                while (it.hasNext()) {
                    iMax = Math.min(iMax, this.model.anchorColOf((TL_iv.pageTableCell) it.next()));
                }
            } else {
                iMax = 0;
                for (TL_iv.pageTableCell pagetablecell : linkedHashSet) {
                    int iAnchorColOf = this.model.anchorColOf(pagetablecell);
                    int i3 = pagetablecell.colspan;
                    if (i3 == 0) {
                        i3 = 1;
                    }
                    iMax = Math.max(iMax, iAnchorColOf + i3);
                }
            }
            linkedHashSet.clear();
            TableModel tableModel = this.model;
            if (tableModel.rowCount == 0 || (i = tableModel.colCount) == 0) {
                TL_iv.pageBlockTable pageblocktable = tableModel.block;
                if (pageblocktable.rows.isEmpty()) {
                    TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                    ArrayList<TL_iv.pageTableCell> arrayList = new ArrayList<>();
                    pagetablerow.cells = arrayList;
                    TL_iv.pageTableCell pagetablecell2 = new TL_iv.pageTableCell();
                    TableModel.applyPlainText(pagetablecell2, "");
                    arrayList.add(pagetablecell2);
                    pageblocktable.rows.add(pagetablerow);
                } else {
                    ArrayList<TL_iv.pageTableRow> arrayList2 = pageblocktable.rows;
                    int size = arrayList2.size();
                    int i4 = 0;
                    while (i4 < size) {
                        TL_iv.pageTableRow pagetablerow2 = arrayList2.get(i4);
                        i4++;
                        TL_iv.pageTableRow pagetablerow3 = pagetablerow2;
                        if (pagetablerow3.cells == null) {
                            pagetablerow3.cells = new ArrayList<>();
                        }
                        ArrayList<TL_iv.pageTableCell> arrayList3 = pagetablerow3.cells;
                        TL_iv.pageTableCell pagetablecell3 = new TL_iv.pageTableCell();
                        TableModel.applyPlainText(pagetablecell3, "");
                        arrayList3.add(pagetablecell3);
                    }
                }
                tableModel.rebuildFromBlock();
            } else {
                int i5 = iMax < 0 ? 0 : iMax;
                if (i5 <= i) {
                    i = i5;
                }
                IdentityHashMap identityHashMap = new IdentityHashMap();
                boolean[] zArr = new boolean[tableModel.rowCount];
                ArrayList arrayList4 = tableModel.anchorsRowMajor;
                int size2 = arrayList4.size();
                int i6 = 0;
                while (i6 < size2) {
                    Object obj = arrayList4.get(i6);
                    i6++;
                    TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                    int iAnchorRowOf = tableModel.anchorRowOf(pagetablecell4);
                    int iAnchorColOf2 = tableModel.anchorColOf(pagetablecell4);
                    int i7 = pagetablecell4.rowspan;
                    if (i7 == 0) {
                        i7 = 1;
                    }
                    int i8 = pagetablecell4.colspan;
                    if (i8 == 0) {
                        i8 = 1;
                    }
                    int i9 = iAnchorColOf2 >= i ? iAnchorColOf2 + 1 : iAnchorColOf2;
                    if (iAnchorColOf2 < i && iAnchorColOf2 + i8 > i) {
                        int i10 = i8 + 1;
                        for (int i11 = iAnchorRowOf; i11 < iAnchorRowOf + i7 && i11 < tableModel.rowCount; i11++) {
                            zArr[i11] = true;
                        }
                        i8 = i10;
                    }
                    identityHashMap.put(pagetablecell4, new int[]{iAnchorRowOf, i9, i7, i8});
                }
                int i12 = 0;
                while (true) {
                    i2 = tableModel.rowCount;
                    if (i12 >= i2) {
                        break;
                    }
                    if (!zArr[i12]) {
                        TL_iv.pageTableCell pagetablecell5 = new TL_iv.pageTableCell();
                        TableModel.applyPlainText(pagetablecell5, "");
                        identityHashMap.put(pagetablecell5, new int[]{i12, i, 1, 1});
                    }
                    i12++;
                }
                tableModel.rewriteBlockRows(identityHashMap, i2);
                tableModel.rebuildFromBlock();
            }
            refreshAfterModelChange();
            focusCellAt(0, iMax);
            notifyCellSelectionChanged();
        }
    }

    public final void applyInsertRowFromSelection(boolean z) {
        int iMax;
        boolean[] zArr;
        if (this.model != null) {
            LinkedHashSet<TL_iv.pageTableCell> linkedHashSet = this.selectedCells;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            if (z) {
                Iterator it = linkedHashSet.iterator();
                iMax = Integer.MAX_VALUE;
                while (it.hasNext()) {
                    iMax = Math.min(iMax, this.model.anchorRowOf((TL_iv.pageTableCell) it.next()));
                }
            } else {
                iMax = 0;
                for (TL_iv.pageTableCell pagetablecell : linkedHashSet) {
                    int iAnchorRowOf = this.model.anchorRowOf(pagetablecell);
                    int i = pagetablecell.rowspan;
                    if (i == 0) {
                        i = 1;
                    }
                    iMax = Math.max(iMax, iAnchorRowOf + i);
                }
            }
            linkedHashSet.clear();
            TableModel tableModel = this.model;
            int i2 = tableModel.rowCount;
            if (i2 == 0 || tableModel.colCount == 0) {
                TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                pagetablerow.cells = new ArrayList<>();
                int iMax2 = Math.max(tableModel.colCount, 1);
                for (int i3 = 0; i3 < iMax2; i3++) {
                    ArrayList<TL_iv.pageTableCell> arrayList = pagetablerow.cells;
                    TL_iv.pageTableCell pagetablecell2 = new TL_iv.pageTableCell();
                    TableModel.applyPlainText(pagetablecell2, "");
                    arrayList.add(pagetablecell2);
                }
                tableModel.block.rows.add(pagetablerow);
                tableModel.rebuildFromBlock();
            } else {
                int i4 = iMax < 0 ? 0 : iMax;
                if (i4 <= i2) {
                    i2 = i4;
                }
                IdentityHashMap identityHashMap = new IdentityHashMap();
                boolean[] zArr2 = new boolean[tableModel.colCount];
                ArrayList arrayList2 = tableModel.anchorsRowMajor;
                int size = arrayList2.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList2.get(i5);
                    i5++;
                    TL_iv.pageTableCell pagetablecell3 = (TL_iv.pageTableCell) obj;
                    int iAnchorRowOf2 = tableModel.anchorRowOf(pagetablecell3);
                    int iAnchorColOf = tableModel.anchorColOf(pagetablecell3);
                    int i6 = pagetablecell3.rowspan;
                    if (i6 == 0) {
                        i6 = 1;
                    }
                    int i7 = pagetablecell3.colspan;
                    if (i7 == 0) {
                        i7 = 1;
                    }
                    int i8 = iAnchorRowOf2 >= i2 ? iAnchorRowOf2 + 1 : iAnchorRowOf2;
                    if (iAnchorRowOf2 >= i2 || iAnchorRowOf2 + i6 <= i2) {
                        zArr = zArr2;
                    } else {
                        i6++;
                        zArr = zArr2;
                        for (int i9 = iAnchorColOf; i9 < iAnchorColOf + i7 && i9 < tableModel.colCount; i9++) {
                            zArr[i9] = true;
                        }
                    }
                    identityHashMap.put(pagetablecell3, new int[]{i8, iAnchorColOf, i6, i7});
                    zArr2 = zArr;
                }
                boolean[] zArr3 = zArr2;
                for (int i10 = 0; i10 < tableModel.colCount; i10++) {
                    if (!zArr3[i10]) {
                        TL_iv.pageTableCell pagetablecell4 = new TL_iv.pageTableCell();
                        TableModel.applyPlainText(pagetablecell4, "");
                        identityHashMap.put(pagetablecell4, new int[]{i2, i10, 1, 1});
                    }
                }
                tableModel.rewriteBlockRows(identityHashMap, tableModel.rowCount + 1);
                tableModel.rebuildFromBlock();
            }
            refreshAfterModelChange();
            focusCellAt(iMax, 0);
            notifyCellSelectionChanged();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.model == null) {
            return;
        }
        RichEditorListView.AnonymousClass12 anonymousClass12 = this.delegate;
        TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper = anonymousClass12 != null ? RichEditorListView.this.getTextSelectionHelper() : null;
        if (textSelectionHelper == null) {
            return;
        }
        ArrayList arrayList = this.tmpBlocks;
        arrayList.clear();
        fillTextLayoutBlocks(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            TextSelectionHelper.TextLayoutBlock textLayoutBlock = (TextSelectionHelper.TextLayoutBlock) arrayList.get(i);
            canvas.save();
            canvas.translate(textLayoutBlock.getX(), textLayoutBlock.getY());
            textSelectionHelper.draw(canvas, this, i);
            canvas.restore();
        }
    }

    public final RichEditText editTextForChildPos(int i) {
        RichTableCellHost richTableCellHostHostForAnchor;
        int i2;
        if (i == 0) {
            return this.titleEditText;
        }
        TableModel tableModel = this.model;
        TL_iv.pageTableCell pagetablecell = (tableModel == null || i <= 0 || (i2 = i + (-1)) >= tableModel.anchorsRowMajor.size()) ? null : (TL_iv.pageTableCell) this.model.anchorsRowMajor.get(i2);
        if (pagetablecell == null || (richTableCellHostHostForAnchor = this.grid.hostForAnchor(pagetablecell)) == null) {
            return null;
        }
        return richTableCellHostHostForAnchor.editText;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        RichEditText richEditText;
        final Layout layout;
        if (this.model == null) {
            return;
        }
        RichEditText richEditText2 = this.titleEditText;
        final Layout layout2 = richEditText2.getLayout();
        if (layout2 != null) {
            final int paddingLeft = richEditText2.getPaddingLeft() + richEditText2.getLeft();
            final int paddingTop = richEditText2.getPaddingTop() + richEditText2.getTop();
            arrayList.add(new TextSelectionHelper.TextLayoutBlock() {
                @Override
                public final Layout getLayout() {
                    return layout2;
                }

                @Override
                public final CharSequence getPrefix() {
                    return null;
                }

                @Override
                public final int getRow() {
                    return 0;
                }

                @Override
                public final Rect getSelectionBounds() {
                    return null;
                }

                @Override
                public final CharSequence getText() {
                    TL_iv.RichText richText;
                    BlockRow blockRow = RichTableCell.this.currentRow;
                    if (blockRow == null) {
                        return "";
                    }
                    TL_iv.PageBlock pageBlock = blockRow.block;
                    return (!(pageBlock instanceof TL_iv.pageBlockTable) || (richText = ((TL_iv.pageBlockTable) pageBlock).title) == null) ? "" : RichTextStyle.toSpannable(richText, null);
                }

                @Override
                public final int getX() {
                    return paddingLeft;
                }

                @Override
                public final int getY() {
                    return paddingTop;
                }
            });
        }
        int size = this.model.anchorsRowMajor.size();
        for (int i = 0; i < size; i++) {
            final TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.model.anchorsRowMajor.get(i);
            RichTableCellGrid richTableCellGrid = this.grid;
            RichTableCellHost richTableCellHostHostForAnchor = richTableCellGrid.hostForAnchor(pagetablecell);
            if (richTableCellHostHostForAnchor != null && (layout = (richEditText = richTableCellHostHostForAnchor.editText).getLayout()) != null) {
                AnonymousClass2 anonymousClass2 = this.scrollView;
                int left = anonymousClass2.getLeft();
                ScrollContent scrollContent = this.scrollContent;
                final int paddingLeft2 = richEditText.getPaddingLeft() + richEditText.getLeft() + richTableCellHostHostForAnchor.getLeft() + ((richTableCellGrid.getLeft() + (scrollContent.getLeft() + left)) - anonymousClass2.getScrollX());
                final int paddingTop2 = richEditText.getPaddingTop() + richEditText.getTop() + richTableCellHostHostForAnchor.getTop() + richTableCellGrid.getTop() + scrollContent.getTop() + anonymousClass2.getTop();
                final int iAnchorRowOf = this.model.anchorRowOf(pagetablecell) + 10;
                arrayList.add(new TextSelectionHelper.TextLayoutBlock() {
                    @Override
                    public final Layout getLayout() {
                        return layout;
                    }

                    @Override
                    public final CharSequence getPrefix() {
                        return null;
                    }

                    @Override
                    public final int getRow() {
                        return iAnchorRowOf;
                    }

                    @Override
                    public final Rect getSelectionBounds() {
                        return null;
                    }

                    @Override
                    public final CharSequence getText() {
                        TL_iv.RichText richText;
                        TL_iv.pageTableCell pagetablecell2 = pagetablecell;
                        return (pagetablecell2 == null || (richText = pagetablecell2.text) == null) ? "" : RichTextStyle.toSpannable(richText, null);
                    }

                    @Override
                    public final int getX() {
                        return paddingLeft2;
                    }

                    @Override
                    public final int getY() {
                        return paddingTop2;
                    }
                });
            }
        }
    }

    public final TL_iv.pageTableCell findCellAt(int i, int i2) {
        if (this.model == null) {
            return null;
        }
        AnonymousClass2 anonymousClass2 = this.scrollView;
        int left = i - anonymousClass2.getLeft();
        ScrollContent scrollContent = this.scrollContent;
        int left2 = left - scrollContent.getLeft();
        RichTableCellGrid richTableCellGrid = this.grid;
        int scrollX = anonymousClass2.getScrollX() + (left2 - richTableCellGrid.getLeft());
        int top = ((i2 - anonymousClass2.getTop()) - scrollContent.getTop()) - richTableCellGrid.getTop();
        for (int i3 = 0; i3 < richTableCellGrid.getChildCount(); i3++) {
            View childAt = richTableCellGrid.getChildAt(i3);
            if (childAt instanceof RichTableCellHost) {
                RichTableCellHost richTableCellHost = (RichTableCellHost) childAt;
                if (scrollX >= richTableCellHost.getLeft() && scrollX < richTableCellHost.getRight() && top >= richTableCellHost.getTop() && top < richTableCellHost.getBottom()) {
                    return richTableCellHost.cell;
                }
            }
        }
        return null;
    }

    public final int findColHandleAt(int i, int i2) {
        int i3;
        int iAnchorColOf;
        if (this.model == null) {
            return -1;
        }
        AnonymousClass2 anonymousClass2 = this.scrollView;
        int left = i - anonymousClass2.getLeft();
        ScrollContent scrollContent = this.scrollContent;
        int left2 = left - scrollContent.getLeft();
        RichTableCellGrid richTableCellGrid = this.grid;
        int scrollX = anonymousClass2.getScrollX() + (left2 - richTableCellGrid.getLeft());
        int top = ((i2 - anonymousClass2.getTop()) - scrollContent.getTop()) - richTableCellGrid.getTop();
        TableModel tableModel = richTableCellGrid.model;
        if (tableModel != null && top >= (i3 = richTableCellGrid.rowStarts[tableModel.rowCount])) {
            if (top < AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(16.0f) + i3) {
                if (richTableCellGrid.useCombinedColHandle()) {
                    int iFirstSelectedCol = richTableCellGrid.firstSelectedCol();
                    int iLastSelectedCol = richTableCellGrid.lastSelectedCol();
                    if (iFirstSelectedCol >= 0) {
                        int[] iArr = richTableCellGrid.colStarts;
                        if (scrollX >= iArr[iFirstSelectedCol] && scrollX < iArr[iLastSelectedCol + 1]) {
                            return iFirstSelectedCol;
                        }
                    }
                    return -1;
                }
                TL_iv.pageTableCell pagetablecellActiveCell = richTableCellGrid.activeCell();
                if (pagetablecellActiveCell == null || (iAnchorColOf = richTableCellGrid.model.anchorColOf(pagetablecellActiveCell)) < 0) {
                    return -1;
                }
                int i4 = pagetablecellActiveCell.colspan;
                int i5 = i4 != 0 ? i4 : 1;
                int[] iArr2 = richTableCellGrid.colStarts;
                int i6 = iArr2[iAnchorColOf];
                int i7 = iArr2[Math.min(i5 + iAnchorColOf, richTableCellGrid.model.colCount)];
                if (scrollX >= i6 && scrollX < i7) {
                    return iAnchorColOf;
                }
            }
        }
        return -1;
    }

    public final RichTableCellHost findHostContaining(RichEditText richEditText) {
        if (richEditText == null) {
            return null;
        }
        for (ViewParent parent = richEditText.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof RichTableCellHost) {
                return (RichTableCellHost) parent;
            }
            if (parent == this) {
                return null;
            }
        }
        return null;
    }

    public final int findRowHandleAt(int i, int i2) {
        int iAnchorRowOf;
        if (this.model == null) {
            return -1;
        }
        AnonymousClass2 anonymousClass2 = this.scrollView;
        int left = i - anonymousClass2.getLeft();
        ScrollContent scrollContent = this.scrollContent;
        int left2 = left - scrollContent.getLeft();
        RichTableCellGrid richTableCellGrid = this.grid;
        int scrollX = anonymousClass2.getScrollX() + (left2 - richTableCellGrid.getLeft());
        int top = ((i2 - anonymousClass2.getTop()) - scrollContent.getTop()) - richTableCellGrid.getTop();
        if (richTableCellGrid.model != null && scrollX >= (richTableCellGrid.colStarts[0] - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(4.0f) && scrollX < richTableCellGrid.colStarts[0]) {
            if (richTableCellGrid.useCombinedRowHandle()) {
                int iFirstSelectedRow = richTableCellGrid.firstSelectedRow();
                int iLastSelectedRow = richTableCellGrid.lastSelectedRow();
                if (iFirstSelectedRow >= 0) {
                    int[] iArr = richTableCellGrid.rowStarts;
                    if (top >= iArr[iFirstSelectedRow] && top < iArr[iLastSelectedRow + 1]) {
                        return iFirstSelectedRow;
                    }
                }
                return -1;
            }
            TL_iv.pageTableCell pagetablecellActiveCell = richTableCellGrid.activeCell();
            if (pagetablecellActiveCell == null || (iAnchorRowOf = richTableCellGrid.model.anchorRowOf(pagetablecellActiveCell)) < 0) {
                return -1;
            }
            int i3 = pagetablecellActiveCell.rowspan;
            int i4 = i3 != 0 ? i3 : 1;
            int[] iArr2 = richTableCellGrid.rowStarts;
            int i5 = iArr2[iAnchorRowOf];
            int i6 = iArr2[Math.min(i4 + iAnchorRowOf, richTableCellGrid.model.rowCount)];
            if (top >= i5 && top < i6) {
                return iAnchorRowOf;
            }
        }
        return -1;
    }

    public final void focusCellAt(int i, int i2) {
        int i3;
        TableModel tableModel = this.model;
        if (tableModel == null || (i3 = tableModel.rowCount) == 0 || tableModel.colCount == 0) {
            return;
        }
        TL_iv.pageTableCell pagetablecell = this.model.grid[Math.max(0, Math.min(i, i3 - 1))][Math.max(0, Math.min(i2, this.model.colCount - 1))];
        if (pagetablecell == null) {
            return;
        }
        post(new RichTableCell$$ExternalSyntheticLambda3(0, this, pagetablecell));
    }

    public final boolean focusFirstCell() {
        TableModel tableModel = this.model;
        if (tableModel == null || tableModel.anchorsRowMajor.isEmpty()) {
            return false;
        }
        RichTableCellHost richTableCellHostHostForAnchor = this.grid.hostForAnchor((TL_iv.pageTableCell) this.model.anchorsRowMajor.get(0));
        if (richTableCellHostHostForAnchor == null) {
            return false;
        }
        RichEditText richEditText = richTableCellHostHostForAnchor.editText;
        richEditText.requestEditFocus();
        richEditText.setSelection(0);
        return true;
    }

    public int[] getColorKeys() {
        return null;
    }

    public RichTableCellGrid getGrid() {
        return this.grid;
    }

    public TableModel getModel() {
        return this.model;
    }

    public BlockRow getRow() {
        return this.currentRow;
    }

    public Set<TL_iv.pageTableCell> getSelectedCells() {
        return this.selectedCells;
    }

    public RichEditText getTitleEditText() {
        return this.titleEditText;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        RichTableCellGrid richTableCellGrid = this.grid;
        if (richTableCellGrid != null) {
            richTableCellGrid.invalidate();
        }
    }

    public final boolean moveFocusByTab(RichTableCellHost richTableCellHost, boolean z) {
        int iIndexOf;
        TableModel tableModel = this.model;
        if (tableModel == null || (iIndexOf = tableModel.anchorsRowMajor.indexOf(richTableCellHost.cell)) < 0) {
            return false;
        }
        int i = z ? iIndexOf - 1 : iIndexOf + 1;
        if (i < 0 || i >= this.model.anchorsRowMajor.size()) {
            return false;
        }
        RichTableCellHost richTableCellHostHostForAnchor = this.grid.hostForAnchor((TL_iv.pageTableCell) this.model.anchorsRowMajor.get(i));
        if (richTableCellHostHostForAnchor == null) {
            return false;
        }
        RichEditText richEditText = richTableCellHostHostForAnchor.editText;
        richEditText.requestEditFocus();
        richEditText.setSelection(richEditText.length());
        return true;
    }

    public final void notifyCellSelectionChanged() {
        LinkedHashSet linkedHashSet = this.selectedCells;
        setTranslationZ((!linkedHashSet.isEmpty() || this.grid.hasFocus()) ? AndroidUtilities.dp(1.0f) : 0.0f);
        invalidate();
        this.scrollView.invalidate();
        Object parent = getParent();
        if (parent instanceof View) {
            ((View) parent).invalidate();
        }
        CellSelectionListener cellSelectionListener = this.cellSelectionListener;
        if (cellSelectionListener != null) {
            RichEditorListView richEditorListView = ((RichEditorListView$$ExternalSyntheticLambda37) cellSelectionListener).f$0;
            if (this != richEditorListView.activeCellSelectionTable) {
                return;
            }
            if (linkedHashSet.isEmpty()) {
                richEditorListView.exitCellSelectionMode();
            } else {
                if (richEditorListView.cellSelectionDragActive) {
                    return;
                }
                richEditorListView.showTableCellMenu(this);
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.focusInvalidator);
    }

    @Override
    public final void onBlockInsetChanged(int i) {
        requestLayout();
    }

    @Override
    public final void onDetachedFromWindow() {
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.focusInvalidator);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = i3 - i;
        int i7 = this.blockInset;
        int iQuoteInsetEnd = RichBlockChrome.quoteInsetEnd(this.currentRow);
        boolean z2 = this.blockRtl;
        int i8 = z2 ? iQuoteInsetEnd : i7;
        if (!z2) {
            i7 = iQuoteInsetEnd;
        }
        RichEditText richEditText = this.titleEditText;
        int measuredHeight = richEditText.getMeasuredHeight();
        BlockRow blockRow = this.currentRow;
        int iDp = (blockRow != null && (i5 = blockRow.quoteTopEdge) > 0) ? AndroidUtilities.dp(zzkv.m(i5, 1, 16, 10)) : 0;
        int i9 = i6 - i7;
        int i10 = measuredHeight + iDp;
        richEditText.layout(AndroidUtilities.dp(16.0f) + i8, iDp, BotFullscreenButtons$$ExternalSyntheticOutline1.m(i9, 16.0f, AndroidUtilities.dp(16.0f) + i8), i10);
        int iDp2 = AndroidUtilities.dp(9.0f) + i10;
        AnonymousClass2 anonymousClass2 = this.scrollView;
        anonymousClass2.layout(i8, iDp2, i9, anonymousClass2.getMeasuredHeight() + iDp2);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        int iDp = 0;
        int iMax = Math.max(0, (size - this.blockInset) - RichBlockChrome.quoteInsetEnd(this.currentRow));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, iMax - (AndroidUtilities.dp(16.0f) * 2)), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        RichEditText richEditText = this.titleEditText;
        richEditText.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredHeight = richEditText.getMeasuredHeight();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0);
        AnonymousClass2 anonymousClass2 = this.scrollView;
        anonymousClass2.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
        BlockRow blockRow = this.currentRow;
        int iDp2 = (blockRow != null && (i4 = blockRow.quoteTopEdge) > 0) ? AndroidUtilities.dp(zzkv.m(i4, 1, 16, 10)) : 0;
        BlockRow blockRow2 = this.currentRow;
        if (blockRow2 != null && (i3 = blockRow2.quoteBottomEdge) > 0) {
            iDp = AndroidUtilities.dp(zzkv.m(i3, 1, 16, 10));
        }
        setMeasuredDimension(size, anonymousClass2.getMeasuredHeight() + AndroidUtilities.dp(9.0f) + iDp + iDp2 + measuredHeight);
    }

    public final void refreshAfterModelChange() {
        RichTableCellGrid richTableCellGrid = this.grid;
        richTableCellGrid.rebuildHosts();
        richTableCellGrid.requestLayout();
        richTableCellGrid.invalidate();
        wireCellListeners();
        RichEditorListView.AnonymousClass12 anonymousClass12 = this.delegate;
        if (anonymousClass12 == null || this.currentRow == null) {
            return;
        }
        anonymousClass12.onTextChanged();
    }

    public final void selectCellRectangle(TL_iv.pageTableCell pagetablecell, TL_iv.pageTableCell pagetablecell2) {
        int i;
        TableModel tableModel = this.model;
        if (tableModel == null || pagetablecell == null) {
            return;
        }
        int iAnchorRowOf = tableModel.anchorRowOf(pagetablecell);
        int iAnchorColOf = this.model.anchorColOf(pagetablecell);
        int iAnchorRowOf2 = this.model.anchorRowOf(pagetablecell2);
        int iAnchorColOf2 = this.model.anchorColOf(pagetablecell2);
        if (iAnchorRowOf < 0 || iAnchorColOf < 0 || iAnchorRowOf2 < 0 || iAnchorColOf2 < 0) {
            return;
        }
        int iMin = Math.min(iAnchorRowOf, iAnchorRowOf2);
        int iMin2 = Math.min(iAnchorColOf, iAnchorColOf2);
        int i2 = this.model.rowCount - 1;
        int i3 = pagetablecell.rowspan;
        if (i3 == 0) {
            i3 = 1;
        }
        int i4 = (iAnchorRowOf + i3) - 1;
        int i5 = pagetablecell2.rowspan;
        if (i5 == 0) {
            i5 = 1;
        }
        int iMin3 = Math.min(i2, Math.max(i4, (iAnchorRowOf2 + i5) - 1));
        int i6 = this.model.colCount - 1;
        int i7 = pagetablecell.colspan;
        if (i7 == 0) {
            i7 = 1;
        }
        int i8 = (iAnchorColOf + i7) - 1;
        int i9 = pagetablecell2.colspan;
        if (i9 == 0) {
            i9 = 1;
        }
        int iMin4 = Math.min(i6, Math.max(i8, (iAnchorColOf2 + i9) - 1));
        while (true) {
            boolean z = false;
            i = iMin;
            while (iMin <= iMin3) {
                int i10 = iMin2;
                while (iMin2 <= iMin4) {
                    TableModel tableModel2 = this.model;
                    TL_iv.pageTableCell pagetablecell3 = tableModel2.grid[iMin][iMin2];
                    int i11 = tableModel2.anchorR[iMin][iMin2];
                    int i12 = tableModel2.anchorC[iMin][iMin2];
                    int i13 = tableModel2.rowCount - 1;
                    int i14 = pagetablecell3.rowspan;
                    if (i14 == 0) {
                        i14 = 1;
                    }
                    int iMin5 = Math.min(i13, (i14 + i11) - 1);
                    int i15 = this.model.colCount - 1;
                    int i16 = pagetablecell3.colspan;
                    if (i16 == 0) {
                        i16 = 1;
                    }
                    int iMin6 = Math.min(i15, (i16 + i12) - 1);
                    if (i11 < i) {
                        i = i11;
                        z = true;
                    }
                    if (i12 < i10) {
                        i10 = i12;
                        z = true;
                    }
                    if (iMin5 > iMin3) {
                        iMin3 = iMin5;
                        z = true;
                    }
                    if (iMin6 > iMin4) {
                        iMin4 = iMin6;
                        z = true;
                    }
                    iMin2++;
                }
                iMin++;
                iMin2 = i10;
            }
            if (!z) {
                break;
            } else {
                iMin = i;
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (i <= iMin3) {
            for (int i17 = iMin2; i17 <= iMin4; i17++) {
                linkedHashSet.add(this.model.grid[i][i17]);
            }
            i++;
        }
        LinkedHashSet linkedHashSet2 = this.selectedCells;
        if (linkedHashSet2.equals(linkedHashSet)) {
            return;
        }
        linkedHashSet2.clear();
        linkedHashSet2.addAll(linkedHashSet);
        this.grid.invalidate();
        notifyCellSelectionChanged();
    }

    public void setCellSelectionListener(CellSelectionListener cellSelectionListener) {
        this.cellSelectionListener = cellSelectionListener;
    }

    public void setLocked(boolean z) {
        this.titleEditText.setLocked(z);
        int i = 0;
        while (true) {
            RichTableCellGrid richTableCellGrid = this.grid;
            if (i >= richTableCellGrid.getChildCount()) {
                return;
            }
            View childAt = richTableCellGrid.getChildAt(i);
            if (childAt instanceof RichTableCellHost) {
                ((RichTableCellHost) childAt).setLocked(z);
            }
            i++;
        }
    }

    @Override
    public final void updateColors$1() {
        RichEditText richEditText = this.titleEditText;
        richEditText.updateColors();
        int color = Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider);
        richEditText.setTextColor(color);
        richEditText.setHintTextColor(Theme.multAlpha(0.35f, color));
        int i = 0;
        while (true) {
            RichTableCellGrid richTableCellGrid = this.grid;
            if (i >= richTableCellGrid.getChildCount()) {
                richTableCellGrid.applyColors();
                return;
            }
            View childAt = richTableCellGrid.getChildAt(i);
            if (childAt instanceof RichTableCellHost) {
                ((RichTableCellHost) childAt).editText.updateColors();
            }
            i++;
        }
    }

    public final void wireCellListeners() {
        int i = 0;
        while (true) {
            RichTableCellGrid richTableCellGrid = this.grid;
            if (i >= richTableCellGrid.getChildCount()) {
                return;
            }
            View childAt = richTableCellGrid.getChildAt(i);
            if (childAt instanceof RichTableCellHost) {
                RichTableCellHost richTableCellHost = (RichTableCellHost) childAt;
                richTableCellHost.editText.setListener(new AnonymousClass3(richTableCellHost));
                richTableCellHost.editText.setDelegate(new TodoItemMenu$$ExternalSyntheticLambda19(12, this, richTableCellHost));
            }
            i++;
        }
    }
}
