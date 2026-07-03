package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Editable;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.iv.RichEditText;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.iv.RichTableCellGrid;

public class RichTableCell extends FrameLayout implements Theme.Colorable, TextSelectionHelper.ArticleSelectableView {
    private CellSelectionListener cellSelectionListener;
    private BlockRow currentRow;
    private Delegate delegate;
    private final ViewTreeObserver.OnGlobalFocusChangeListener focusInvalidator;
    private final RichTableCellGrid grid;
    private boolean hijackingSelection;
    private TableModel model;
    private final Theme.ResourcesProvider resourcesProvider;
    private final ScrollContent scrollContent;
    private final HorizontalScrollView scrollView;
    private final LinkedHashSet selectedCells;
    private final RichEditText titleEditText;
    private final ArrayList tmpBlocks;

    public interface CellSelectionListener {
        void onCellSelectionChanged(RichTableCell richTableCell);
    }

    public interface Delegate {
        TextSelectionHelper.ArticleTextSelectionHelper getSelectionHelper();

        void onLockedInsert(CharSequence charSequence);

        void onRequestWindowFocusable(RichEditText richEditText, boolean z);

        boolean onSelectAll(BlockRow blockRow);

        void onSpansChanged(BlockRow blockRow);

        void onTextChanged(BlockRow blockRow);

        void onTextWillChange(BlockRow blockRow, int i, int i2);
    }

    public int titleChildPos() {
        return 0;
    }

    public RichTableCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.tmpBlocks = new ArrayList();
        this.selectedCells = new LinkedHashSet();
        this.focusInvalidator = new ViewTreeObserver.OnGlobalFocusChangeListener() {
            @Override
            public final void onGlobalFocusChanged(View view, View view2) {
                this.f$0.lambda$new$1(view, view2);
            }
        };
        this.resourcesProvider = resourcesProvider;
        RichEditText richEditText = new RichEditText(context, resourcesProvider);
        this.titleEditText = richEditText;
        richEditText.setAllowNewlines(false);
        richEditText.setInputType(147457);
        richEditText.setGravity(49);
        richEditText.setTextSize(1, Math.max(8, SharedConfig.fontSize));
        richEditText.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        richEditText.setHint("Add title…");
        richEditText.setCenterEmptyHint(true);
        richEditText.setListener(new AnonymousClass1());
        richEditText.setDelegate(new EditTextCaption.EditTextCaptionDelegate() {
            @Override
            public final void onSpansChanged() {
                this.f$0.lambda$new$0();
            }
        });
        addView(richEditText);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context) {
            @Override
            protected void onScrollChanged(int i, int i2, int i3, int i4) {
                TextSelectionHelper.ArticleTextSelectionHelper selectionHelper;
                super.onScrollChanged(i, i2, i3, i4);
                if (RichTableCell.this.delegate != null && (selectionHelper = RichTableCell.this.delegate.getSelectionHelper()) != null && selectionHelper.isInSelectionMode()) {
                    selectionHelper.invalidate();
                }
                invalidate();
            }
        };
        this.scrollView = horizontalScrollView;
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setPadding(AndroidUtilities.dp(16.0f) - AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        addView(horizontalScrollView, LayoutHelper.createFrame(-1, -2.0f, 51, 0.0f, 6.0f, 0.0f, 0.0f));
        RichTableCellGrid richTableCellGrid = new RichTableCellGrid(context, resourcesProvider);
        this.grid = richTableCellGrid;
        ScrollContent scrollContent = new ScrollContent(context);
        this.scrollContent = scrollContent;
        scrollContent.addView(richTableCellGrid);
        horizontalScrollView.addView(scrollContent, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    class AnonymousClass1 implements RichEditText.Listener {
        @Override
        public boolean onBackspaceAtStart(RichEditText richEditText) {
            return RichEditText.Listener.CC.$default$onBackspaceAtStart(this, richEditText);
        }

        @Override
        public void onBackspaceOnEmpty(RichEditText richEditText) {
            RichEditText.Listener.CC.$default$onBackspaceOnEmpty(this, richEditText);
        }

        @Override
        public void onEnterPressed(RichEditText richEditText) {
            RichEditText.Listener.CC.$default$onEnterPressed(this, richEditText);
        }

        @Override
        public boolean onPaste(RichEditText richEditText) {
            return RichEditText.Listener.CC.$default$onPaste(this, richEditText);
        }

        @Override
        public boolean onTab(RichEditText richEditText, boolean z) {
            return RichEditText.Listener.CC.$default$onTab(this, richEditText, z);
        }

        AnonymousClass1() {
        }

        @Override
        public void onTextWillChange(RichEditText richEditText, int i, int i2) {
            if (RichTableCell.this.delegate == null || RichTableCell.this.currentRow == null) {
                return;
            }
            RichTableCell.this.delegate.onTextWillChange(RichTableCell.this.currentRow, i, i2);
        }

        @Override
        public void onTextChanged(RichEditText richEditText, Editable editable) {
            RichTableCell.this.persistTitle();
            if (RichTableCell.this.delegate == null || RichTableCell.this.currentRow == null) {
                return;
            }
            RichTableCell.this.delegate.onTextChanged(RichTableCell.this.currentRow);
        }

        @Override
        public void onRequestWindowFocusable(RichEditText richEditText, boolean z) {
            if (RichTableCell.this.delegate != null) {
                RichTableCell.this.delegate.onRequestWindowFocusable(richEditText, z);
            }
        }

        @Override
        public void onLockedInsert(RichEditText richEditText, CharSequence charSequence) {
            if (RichTableCell.this.delegate != null) {
                RichTableCell.this.delegate.onLockedInsert(charSequence);
            }
        }

        @Override
        public boolean onSelectAll(RichEditText richEditText) {
            if (RichTableCell.this.delegate == null || RichTableCell.this.currentRow == null) {
                return false;
            }
            return RichTableCell.this.delegate.onSelectAll(RichTableCell.this.currentRow);
        }

        @Override
        public void onSelectionChanged(final RichEditText richEditText, final int i, final int i2) {
            final TextSelectionHelper.ArticleTextSelectionHelper selectionHelper;
            final int iTitleChildPos;
            if (RichTableCell.this.hijackingSelection || i == i2 || RichTableCell.this.delegate == null || (selectionHelper = RichTableCell.this.delegate.getSelectionHelper()) == null) {
                return;
            }
            if (!(selectionHelper.isInSelectionMode() && selectionHelper.getSelectedCell() == RichTableCell.this) && (iTitleChildPos = RichTableCell.this.titleChildPos()) >= 0) {
                RichTableCell.this.post(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onSelectionChanged$0(richEditText, i2, selectionHelper, iTitleChildPos, i);
                    }
                });
            }
        }

        public void lambda$onSelectionChanged$0(RichEditText richEditText, int i, TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper, int i2, int i3) {
            if (richEditText.length() < i || richEditText.getSelectionStart() == richEditText.getSelectionEnd() || !articleTextSelectionHelper.selectRangeOf(RichTableCell.this, i2, i3, i)) {
                return;
            }
            RichTableCell.this.hijackingSelection = true;
            richEditText.setSelection(i);
            RichTableCell.this.hijackingSelection = false;
        }
    }

    public void lambda$new$0() {
        BlockRow blockRow;
        persistTitle();
        Delegate delegate = this.delegate;
        if (delegate == null || (blockRow = this.currentRow) == null) {
            return;
        }
        delegate.onSpansChanged(blockRow);
    }

    private final class ScrollContent extends ViewGroup {
        ScrollContent(Context context) {
            super(context);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            RichTableCell.this.grid.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, View.MeasureSpec.getSize(i)), Integer.MIN_VALUE), i2);
            setMeasuredDimension(RichTableCell.this.grid.getMeasuredWidth(), RichTableCell.this.grid.getMeasuredHeight());
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            RichTableCell.this.grid.layout(0, 0, RichTableCell.this.grid.getMeasuredWidth(), RichTableCell.this.grid.getMeasuredHeight());
        }
    }

    public void bind(BlockRow blockRow, Delegate delegate) {
        this.currentRow = blockRow;
        this.delegate = delegate;
        TL_iv.PageBlock pageBlock = blockRow.block;
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            TableModel tableModel = new TableModel((TL_iv.pageBlockTable) pageBlock);
            this.model = tableModel;
            this.grid.setModel(tableModel);
            RichTableCellGrid richTableCellGrid = this.grid;
            final LinkedHashSet linkedHashSet = this.selectedCells;
            Objects.requireNonNull(linkedHashSet);
            richTableCellGrid.setSelectionProvider(new RichTableCellGrid.CellSelectionProvider() {
                @Override
                public final boolean isSelected(TL_iv.pageTableCell pagetablecell) {
                    return linkedHashSet.contains(pagetablecell);
                }
            });
            wireCellListeners();
            bindTitle();
            updateColors();
            this.scrollContent.requestLayout();
        }
    }

    private void bindTitle() {
        BlockRow blockRow = this.currentRow;
        if (blockRow != null) {
            TL_iv.PageBlock pageBlock = blockRow.block;
            if (pageBlock instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock;
                if (pageblocktable.title == null) {
                    pageblocktable.title = new TL_iv.textEmpty();
                }
                if (String.valueOf(this.titleEditText.getText()).equals(RichTextStyle.plainOf(pageblocktable.title))) {
                    return;
                }
                this.titleEditText.setTextSilently(Emoji.replaceEmoji(RichTextStyle.toSpannable(pageblocktable.title), this.titleEditText.getPaint().getFontMetricsInt(), false));
                this.titleEditText.invalidateEffects();
            }
        }
    }

    public void persistTitle() {
        BlockRow blockRow = this.currentRow;
        if (blockRow != null) {
            TL_iv.PageBlock pageBlock = blockRow.block;
            if (pageBlock instanceof TL_iv.pageBlockTable) {
                ((TL_iv.pageBlockTable) pageBlock).title = RichTextStyle.fromSpannable(this.titleEditText.getText());
            }
        }
    }

    public int childCount() {
        TableModel tableModel = this.model;
        return (tableModel != null ? tableModel.anchors().size() : 0) + 1;
    }

    public TL_iv.pageTableCell anchorForChildPos(int i) {
        int i2;
        TableModel tableModel = this.model;
        if (tableModel == null || i <= 0 || i - 1 >= tableModel.anchors().size()) {
            return null;
        }
        return (TL_iv.pageTableCell) this.model.anchors().get(i2);
    }

    public int childPosForAnchor(TL_iv.pageTableCell pagetablecell) {
        int iFlatIndexOfAnchor;
        TableModel tableModel = this.model;
        if (tableModel != null && (iFlatIndexOfAnchor = tableModel.flatIndexOfAnchor(pagetablecell)) >= 0) {
            return iFlatIndexOfAnchor + 1;
        }
        return -1;
    }

    public RichEditText editTextForChildPos(int i) {
        RichTableCellHost richTableCellHostHostForAnchor;
        if (i == 0) {
            return this.titleEditText;
        }
        TL_iv.pageTableCell pagetablecellAnchorForChildPos = anchorForChildPos(i);
        if (pagetablecellAnchorForChildPos == null || (richTableCellHostHostForAnchor = this.grid.hostForAnchor(pagetablecellAnchorForChildPos)) == null) {
            return null;
        }
        return richTableCellHostHostForAnchor.editText;
    }

    public RichEditText getTitleEditText() {
        return this.titleEditText;
    }

    public int childTextLength(int i) {
        RichEditText richEditTextEditTextForChildPos = editTextForChildPos(i);
        if (richEditTextEditTextForChildPos != null) {
            return richEditTextEditTextForChildPos.length();
        }
        return 0;
    }

    public void persistTitleFromEditor() {
        persistTitle();
    }

    public boolean isPressOnTitle(int i, int i2) {
        int lineForVertical;
        Layout layout = this.titleEditText.getLayout();
        if (layout == null) {
            return false;
        }
        int left = i - (this.titleEditText.getLeft() + this.titleEditText.getPaddingLeft());
        int top = i2 - (this.titleEditText.getTop() + this.titleEditText.getPaddingTop());
        if (top < 0 || top >= layout.getHeight() || (lineForVertical = layout.getLineForVertical(top)) < 0 || lineForVertical >= layout.getLineCount()) {
            return false;
        }
        float f = left;
        return f >= layout.getLineLeft(lineForVertical) && f <= layout.getLineRight(lineForVertical);
    }

    public Set<TL_iv.pageTableCell> getSelectedCells() {
        return this.selectedCells;
    }

    public boolean hasCellSelection() {
        return !this.selectedCells.isEmpty();
    }

    public void clearCellSelection() {
        if (this.selectedCells.isEmpty()) {
            return;
        }
        this.selectedCells.clear();
        this.grid.invalidate();
        notifyCellSelectionChanged();
    }

    public void toggleCellSelection(TL_iv.pageTableCell pagetablecell) {
        if (pagetablecell == null) {
            return;
        }
        if (!this.selectedCells.remove(pagetablecell)) {
            this.selectedCells.add(pagetablecell);
        }
        this.grid.invalidate();
        notifyCellSelectionChanged();
    }

    public void addCellToSelection(TL_iv.pageTableCell pagetablecell) {
        if (pagetablecell != null && this.selectedCells.add(pagetablecell)) {
            this.grid.invalidate();
            notifyCellSelectionChanged();
        }
    }

    public void setCellSelectionListener(CellSelectionListener cellSelectionListener) {
        this.cellSelectionListener = cellSelectionListener;
    }

    private void notifyCellSelectionChanged() {
        CellSelectionListener cellSelectionListener = this.cellSelectionListener;
        if (cellSelectionListener != null) {
            cellSelectionListener.onCellSelectionChanged(this);
        }
    }

    public TL_iv.pageTableCell findCellAt(int i, int i2) {
        if (this.model == null) {
            return null;
        }
        int left = (((i - this.scrollView.getLeft()) - this.scrollContent.getLeft()) - this.grid.getLeft()) + this.scrollView.getScrollX();
        int top = ((i2 - this.scrollView.getTop()) - this.scrollContent.getTop()) - this.grid.getTop();
        for (int i3 = 0; i3 < this.grid.getChildCount(); i3++) {
            View childAt = this.grid.getChildAt(i3);
            if (childAt instanceof RichTableCellHost) {
                RichTableCellHost richTableCellHost = (RichTableCellHost) childAt;
                if (left >= richTableCellHost.getLeft() && left < richTableCellHost.getRight() && top >= richTableCellHost.getTop() && top < richTableCellHost.getBottom()) {
                    return richTableCellHost.cell;
                }
            }
        }
        return null;
    }

    private int gridX(int i) {
        return (((i - this.scrollView.getLeft()) - this.scrollContent.getLeft()) - this.grid.getLeft()) + this.scrollView.getScrollX();
    }

    private int gridY(int i) {
        return ((i - this.scrollView.getTop()) - this.scrollContent.getTop()) - this.grid.getTop();
    }

    public int findRowHandleAt(int i, int i2) {
        if (this.model == null) {
            return -1;
        }
        return this.grid.rowHandleAtGrid(gridX(i), gridY(i2));
    }

    public int findColHandleAt(int i, int i2) {
        if (this.model == null) {
            return -1;
        }
        return this.grid.colHandleAtGrid(gridX(i), gridY(i2));
    }

    public void selectWholeRow(int i) {
        TableModel tableModel = this.model;
        if (tableModel == null || i < 0 || i >= tableModel.rowCount) {
            return;
        }
        this.selectedCells.clear();
        int i2 = 0;
        while (true) {
            TableModel tableModel2 = this.model;
            if (i2 < tableModel2.colCount) {
                TL_iv.pageTableCell pagetablecell = tableModel2.grid[i][i2];
                if (pagetablecell != null) {
                    this.selectedCells.add(pagetablecell);
                }
                i2++;
            } else {
                this.grid.invalidate();
                notifyCellSelectionChanged();
                return;
            }
        }
    }

    public void selectWholeColumn(int i) {
        TableModel tableModel = this.model;
        if (tableModel == null || i < 0 || i >= tableModel.colCount) {
            return;
        }
        this.selectedCells.clear();
        int i2 = 0;
        while (true) {
            TableModel tableModel2 = this.model;
            if (i2 < tableModel2.rowCount) {
                TL_iv.pageTableCell pagetablecell = tableModel2.grid[i2][i];
                if (pagetablecell != null) {
                    this.selectedCells.add(pagetablecell);
                }
                i2++;
            } else {
                this.grid.invalidate();
                notifyCellSelectionChanged();
                return;
            }
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        this.titleEditText.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - (AndroidUtilities.dp(16.0f) * 2)), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = this.titleEditText.getMeasuredHeight();
        this.scrollView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        setMeasuredDimension(size, measuredHeight + AndroidUtilities.dp(2.0f) + this.scrollView.getMeasuredHeight());
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int measuredHeight = this.titleEditText.getMeasuredHeight();
        this.titleEditText.layout(AndroidUtilities.dp(16.0f), 0, Math.max(AndroidUtilities.dp(16.0f), i5 - AndroidUtilities.dp(16.0f)), measuredHeight);
        int iDp = measuredHeight + AndroidUtilities.dp(2.0f);
        HorizontalScrollView horizontalScrollView = this.scrollView;
        horizontalScrollView.layout(0, iDp, i5, horizontalScrollView.getMeasuredHeight() + iDp);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.focusInvalidator);
    }

    @Override
    protected void onDetachedFromWindow() {
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.focusInvalidator);
        super.onDetachedFromWindow();
    }

    public void lambda$new$1(View view, View view2) {
        invalidateGridForFocus();
    }

    private void invalidateGridForFocus() {
        RichTableCellGrid richTableCellGrid = this.grid;
        if (richTableCellGrid != null) {
            richTableCellGrid.invalidate();
        }
    }

    public boolean isPressOnText(int i, int i2) {
        RichTableCellHost richTableCellHostHostForAnchor;
        int lineForVertical;
        TL_iv.pageTableCell pagetablecellFindCellAt = findCellAt(i, i2);
        if (pagetablecellFindCellAt == null || (richTableCellHostHostForAnchor = this.grid.hostForAnchor(pagetablecellFindCellAt)) == null) {
            return false;
        }
        int left = (((i - this.scrollView.getLeft()) - this.scrollContent.getLeft()) - this.grid.getLeft()) + this.scrollView.getScrollX();
        int top = ((i2 - this.scrollView.getTop()) - this.scrollContent.getTop()) - this.grid.getTop();
        int left2 = (left - richTableCellHostHostForAnchor.getLeft()) - richTableCellHostHostForAnchor.editText.getLeft();
        int top2 = (top - richTableCellHostHostForAnchor.getTop()) - richTableCellHostHostForAnchor.editText.getTop();
        Layout layout = richTableCellHostHostForAnchor.editText.getLayout();
        if (layout == null) {
            return false;
        }
        int paddingTop = top2 - richTableCellHostHostForAnchor.editText.getPaddingTop();
        int paddingLeft = left2 - richTableCellHostHostForAnchor.editText.getPaddingLeft();
        if (paddingTop < 0 || paddingTop >= layout.getHeight() || (lineForVertical = layout.getLineForVertical(paddingTop)) < 0 || lineForVertical >= layout.getLineCount()) {
            return false;
        }
        float f = paddingLeft;
        return f >= layout.getLineLeft(lineForVertical) && f <= layout.getLineRight(lineForVertical);
    }

    public void applyHeaderToggle(boolean z) {
        BlockRow blockRow;
        Iterator it = this.selectedCells.iterator();
        while (it.hasNext()) {
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it.next();
            TableModel.setHeader(pagetablecell, z);
            RichTableCellHost richTableCellHostHostForAnchor = this.grid.hostForAnchor(pagetablecell);
            if (richTableCellHostHostForAnchor != null) {
                richTableCellHostHostForAnchor.refreshFromCell();
            }
        }
        this.grid.invalidate();
        Delegate delegate = this.delegate;
        if (delegate == null || (blockRow = this.currentRow) == null) {
            return;
        }
        delegate.onTextChanged(blockRow);
    }

    public void applyHorizontalAlign(int i) {
        BlockRow blockRow;
        Iterator it = this.selectedCells.iterator();
        while (it.hasNext()) {
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it.next();
            TableModel.setAlign(pagetablecell, i);
            RichTableCellHost richTableCellHostHostForAnchor = this.grid.hostForAnchor(pagetablecell);
            if (richTableCellHostHostForAnchor != null) {
                richTableCellHostHostForAnchor.refreshFromCell();
            }
        }
        this.grid.invalidate();
        Delegate delegate = this.delegate;
        if (delegate == null || (blockRow = this.currentRow) == null) {
            return;
        }
        delegate.onTextChanged(blockRow);
    }

    public void applyVerticalAlign(int i) {
        BlockRow blockRow;
        Iterator it = this.selectedCells.iterator();
        while (it.hasNext()) {
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it.next();
            TableModel.setVAlign(pagetablecell, i);
            RichTableCellHost richTableCellHostHostForAnchor = this.grid.hostForAnchor(pagetablecell);
            if (richTableCellHostHostForAnchor != null) {
                richTableCellHostHostForAnchor.refreshFromCell();
            }
        }
        this.grid.invalidate();
        Delegate delegate = this.delegate;
        if (delegate == null || (blockRow = this.currentRow) == null) {
            return;
        }
        delegate.onTextChanged(blockRow);
    }

    public int commonHorizontalAlign() {
        Iterator it = this.selectedCells.iterator();
        int i = -1;
        while (it.hasNext()) {
            int iAlignOf = TableModel.alignOf((TL_iv.pageTableCell) it.next());
            if (i == -1) {
                i = iAlignOf;
            } else if (i != iAlignOf) {
                return -1;
            }
        }
        return i;
    }

    public int commonVerticalAlign() {
        Iterator it = this.selectedCells.iterator();
        int i = -1;
        while (it.hasNext()) {
            int iValignOf = TableModel.valignOf((TL_iv.pageTableCell) it.next());
            if (i == -1) {
                i = iValignOf;
            } else if (i != iValignOf) {
                return -1;
            }
        }
        return i;
    }

    public void refreshAfterModelChange() {
        BlockRow blockRow;
        this.grid.rebindAfterModelChange();
        wireCellListeners();
        Delegate delegate = this.delegate;
        if (delegate == null || (blockRow = this.currentRow) == null) {
            return;
        }
        delegate.onTextChanged(blockRow);
    }

    public boolean applyMergeFromSelection() {
        if (this.model == null || this.selectedCells.size() < 2) {
            return false;
        }
        HashSet hashSet = new HashSet(this.selectedCells);
        Iterator it = hashSet.iterator();
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        while (it.hasNext()) {
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it.next();
            iMin2 = Math.min(iMin2, this.model.anchorRowOf(pagetablecell));
            iMin = Math.min(iMin, this.model.anchorColOf(pagetablecell));
        }
        this.selectedCells.clear();
        boolean zMergeCells = this.model.mergeCells(hashSet);
        if (zMergeCells) {
            refreshAfterModelChange();
            this.grid.invalidate();
            focusCellAt(iMin2, iMin);
            notifyCellSelectionChanged();
        } else {
            this.selectedCells.addAll(hashSet);
        }
        return zMergeCells;
    }

    public boolean applyUnmergeFromSelection() {
        if (this.model == null || this.selectedCells.size() != 1) {
            return false;
        }
        TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.selectedCells.iterator().next();
        if (TableModel.spanCol(pagetablecell) <= 1 && TableModel.spanRow(pagetablecell) <= 1) {
            return false;
        }
        int iAnchorRowOf = this.model.anchorRowOf(pagetablecell);
        int iAnchorColOf = this.model.anchorColOf(pagetablecell);
        this.selectedCells.clear();
        boolean zUnmergeCell = this.model.unmergeCell(pagetablecell);
        if (zUnmergeCell) {
            refreshAfterModelChange();
            this.grid.invalidate();
            focusCellAt(iAnchorRowOf, iAnchorColOf);
            notifyCellSelectionChanged();
        } else {
            this.selectedCells.add(pagetablecell);
        }
        return zUnmergeCell;
    }

    public boolean applyDeleteRowsFromSelection() {
        if (this.model == null || this.selectedCells.isEmpty()) {
            return false;
        }
        HashSet hashSet = new HashSet();
        Iterator it = this.selectedCells.iterator();
        int iMin = Integer.MAX_VALUE;
        while (it.hasNext()) {
            int iAnchorRowOf = this.model.anchorRowOf((TL_iv.pageTableCell) it.next());
            hashSet.add(Integer.valueOf(iAnchorRowOf));
            iMin = Math.min(iMin, iAnchorRowOf);
        }
        this.selectedCells.clear();
        boolean zDeleteRows = this.model.deleteRows(hashSet);
        refreshAfterModelChange();
        if (zDeleteRows) {
            focusCellAt(iMin, 0);
        }
        return zDeleteRows;
    }

    public boolean applyDeleteColumnsFromSelection() {
        if (this.model == null || this.selectedCells.isEmpty()) {
            return false;
        }
        HashSet hashSet = new HashSet();
        Iterator it = this.selectedCells.iterator();
        int iMin = Integer.MAX_VALUE;
        while (it.hasNext()) {
            int iAnchorColOf = this.model.anchorColOf((TL_iv.pageTableCell) it.next());
            hashSet.add(Integer.valueOf(iAnchorColOf));
            iMin = Math.min(iMin, iAnchorColOf);
        }
        this.selectedCells.clear();
        boolean zDeleteColumns = this.model.deleteColumns(hashSet);
        refreshAfterModelChange();
        if (zDeleteColumns) {
            focusCellAt(0, iMin);
        }
        return zDeleteColumns;
    }

    public boolean applyInsertRowFromSelection(boolean z) {
        int iMax;
        if (this.model == null || this.selectedCells.isEmpty()) {
            return false;
        }
        if (z) {
            Iterator it = this.selectedCells.iterator();
            iMax = Integer.MAX_VALUE;
            while (it.hasNext()) {
                iMax = Math.min(iMax, this.model.anchorRowOf((TL_iv.pageTableCell) it.next()));
            }
        } else {
            Iterator it2 = this.selectedCells.iterator();
            iMax = 0;
            while (it2.hasNext()) {
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it2.next();
                iMax = Math.max(iMax, this.model.anchorRowOf(pagetablecell) + TableModel.spanRow(pagetablecell));
            }
        }
        this.selectedCells.clear();
        boolean zInsertRowAt = this.model.insertRowAt(iMax);
        refreshAfterModelChange();
        if (zInsertRowAt) {
            focusCellAt(iMax, 0);
        }
        notifyCellSelectionChanged();
        return zInsertRowAt;
    }

    public boolean applyInsertColumnFromSelection(boolean z) {
        int iMax;
        if (this.model == null || this.selectedCells.isEmpty()) {
            return false;
        }
        if (z) {
            Iterator it = this.selectedCells.iterator();
            iMax = Integer.MAX_VALUE;
            while (it.hasNext()) {
                iMax = Math.min(iMax, this.model.anchorColOf((TL_iv.pageTableCell) it.next()));
            }
        } else {
            Iterator it2 = this.selectedCells.iterator();
            iMax = 0;
            while (it2.hasNext()) {
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it2.next();
                iMax = Math.max(iMax, this.model.anchorColOf(pagetablecell) + TableModel.spanCol(pagetablecell));
            }
        }
        this.selectedCells.clear();
        boolean zInsertColumnAt = this.model.insertColumnAt(iMax);
        refreshAfterModelChange();
        if (zInsertColumnAt) {
            focusCellAt(0, iMax);
        }
        notifyCellSelectionChanged();
        return zInsertColumnAt;
    }

    public boolean focusEdgeCell(boolean z) {
        TableModel tableModel = this.model;
        if (tableModel == null) {
            return false;
        }
        if (!z) {
            this.titleEditText.requestEditFocus();
            this.titleEditText.setSelection(0);
            return true;
        }
        if (tableModel.anchors().isEmpty()) {
            return false;
        }
        RichTableCellHost richTableCellHostHostForAnchor = this.grid.hostForAnchor((TL_iv.pageTableCell) this.model.anchors().get(this.model.anchors().size() - 1));
        if (richTableCellHostHostForAnchor == null) {
            return false;
        }
        richTableCellHostHostForAnchor.editText.requestEditFocus();
        RichEditText richEditText = richTableCellHostHostForAnchor.editText;
        richEditText.setSelection(richEditText.length());
        return true;
    }

    public boolean focusFirstCell() {
        RichTableCellHost richTableCellHostHostForAnchor;
        TableModel tableModel = this.model;
        if (tableModel == null || tableModel.anchors().isEmpty() || (richTableCellHostHostForAnchor = this.grid.hostForAnchor((TL_iv.pageTableCell) this.model.anchors().get(0))) == null) {
            return false;
        }
        richTableCellHostHostForAnchor.editText.requestEditFocus();
        richTableCellHostHostForAnchor.editText.setSelection(0);
        return true;
    }

    private void focusCellAt(int i, int i2) {
        int i3;
        TableModel tableModel = this.model;
        if (tableModel == null || (i3 = tableModel.rowCount) == 0 || tableModel.colCount == 0) {
            return;
        }
        final TL_iv.pageTableCell pagetablecell = this.model.grid[Math.max(0, Math.min(i, i3 - 1))][Math.max(0, Math.min(i2, this.model.colCount - 1))];
        if (pagetablecell == null) {
            return;
        }
        post(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$focusCellAt$2(pagetablecell);
            }
        });
    }

    public void lambda$focusCellAt$2(TL_iv.pageTableCell pagetablecell) {
        RichTableCellHost richTableCellHostHostForAnchor = this.grid.hostForAnchor(pagetablecell);
        if (richTableCellHostHostForAnchor == null) {
            return;
        }
        richTableCellHostHostForAnchor.editText.requestEditFocus();
        RichEditText richEditText = richTableCellHostHostForAnchor.editText;
        richEditText.setSelection(richEditText.length());
    }

    public boolean allSelectedHeader() {
        if (this.selectedCells.isEmpty()) {
            return false;
        }
        Iterator it = this.selectedCells.iterator();
        while (it.hasNext()) {
            if (!((TL_iv.pageTableCell) it.next()).header) {
                return false;
            }
        }
        return true;
    }

    public BlockRow getRow() {
        return this.currentRow;
    }

    public TableModel getModel() {
        return this.model;
    }

    public RichTableCellGrid getGrid() {
        return this.grid;
    }

    public void setLocked(boolean z) {
        this.titleEditText.setLocked(z);
        for (int i = 0; i < this.grid.getChildCount(); i++) {
            View childAt = this.grid.getChildAt(i);
            if (childAt instanceof RichTableCellHost) {
                ((RichTableCellHost) childAt).setLocked(z);
            }
        }
    }

    public void hideActionModes() {
        this.titleEditText.hideActionMode();
        for (int i = 0; i < this.grid.getChildCount(); i++) {
            View childAt = this.grid.getChildAt(i);
            if (childAt instanceof RichTableCellHost) {
                ((RichTableCellHost) childAt).editText.hideActionMode();
            }
        }
    }

    private void wireCellListeners() {
        for (int i = 0; i < this.grid.getChildCount(); i++) {
            View childAt = this.grid.getChildAt(i);
            if (childAt instanceof RichTableCellHost) {
                final RichTableCellHost richTableCellHost = (RichTableCellHost) childAt;
                richTableCellHost.editText.setListener(new AnonymousClass3(richTableCellHost));
                richTableCellHost.editText.setDelegate(new EditTextCaption.EditTextCaptionDelegate() {
                    @Override
                    public final void onSpansChanged() {
                        this.f$0.lambda$wireCellListeners$3(richTableCellHost);
                    }
                });
            }
        }
    }

    class AnonymousClass3 implements RichEditText.Listener {
        final RichTableCellHost val$host;

        @Override
        public boolean onBackspaceAtStart(RichEditText richEditText) {
            return RichEditText.Listener.CC.$default$onBackspaceAtStart(this, richEditText);
        }

        @Override
        public void onBackspaceOnEmpty(RichEditText richEditText) {
            RichEditText.Listener.CC.$default$onBackspaceOnEmpty(this, richEditText);
        }

        @Override
        public void onEnterPressed(RichEditText richEditText) {
            RichEditText.Listener.CC.$default$onEnterPressed(this, richEditText);
        }

        @Override
        public boolean onPaste(RichEditText richEditText) {
            return RichEditText.Listener.CC.$default$onPaste(this, richEditText);
        }

        AnonymousClass3(RichTableCellHost richTableCellHost) {
            this.val$host = richTableCellHost;
        }

        @Override
        public void onTextWillChange(RichEditText richEditText, int i, int i2) {
            if (RichTableCell.this.delegate == null || RichTableCell.this.currentRow == null) {
                return;
            }
            RichTableCell.this.delegate.onTextWillChange(RichTableCell.this.currentRow, i, i2);
        }

        @Override
        public void onTextChanged(RichEditText richEditText, Editable editable) {
            TL_iv.pageTableCell pagetablecell = this.val$host.cell;
            if (pagetablecell != null) {
                TableModel.applyStyledText(pagetablecell, editable);
            }
            if (RichTableCell.this.delegate == null || RichTableCell.this.currentRow == null) {
                return;
            }
            RichTableCell.this.delegate.onTextChanged(RichTableCell.this.currentRow);
        }

        @Override
        public boolean onTab(RichEditText richEditText, boolean z) {
            return RichTableCell.this.moveFocusByTab(this.val$host, z);
        }

        @Override
        public void onRequestWindowFocusable(RichEditText richEditText, boolean z) {
            if (RichTableCell.this.delegate != null) {
                RichTableCell.this.delegate.onRequestWindowFocusable(richEditText, z);
            }
        }

        @Override
        public void onLockedInsert(RichEditText richEditText, CharSequence charSequence) {
            if (RichTableCell.this.delegate != null) {
                RichTableCell.this.delegate.onLockedInsert(charSequence);
            }
        }

        @Override
        public boolean onSelectAll(RichEditText richEditText) {
            if (RichTableCell.this.delegate == null || RichTableCell.this.currentRow == null) {
                return false;
            }
            return RichTableCell.this.delegate.onSelectAll(RichTableCell.this.currentRow);
        }

        @Override
        public void onSelectionChanged(final RichEditText richEditText, final int i, final int i2) {
            final TextSelectionHelper.ArticleTextSelectionHelper selectionHelper;
            final int iChildPosForAnchor;
            if (RichTableCell.this.hijackingSelection || i == i2 || RichTableCell.this.delegate == null || (selectionHelper = RichTableCell.this.delegate.getSelectionHelper()) == null) {
                return;
            }
            if (!(selectionHelper.isInSelectionMode() && selectionHelper.getSelectedCell() == RichTableCell.this) && (iChildPosForAnchor = RichTableCell.this.childPosForAnchor(this.val$host.cell)) >= 0) {
                RichTableCell.this.post(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onSelectionChanged$0(richEditText, i2, selectionHelper, iChildPosForAnchor, i);
                    }
                });
            }
        }

        public void lambda$onSelectionChanged$0(RichEditText richEditText, int i, TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper, int i2, int i3) {
            if (richEditText.length() < i || richEditText.getSelectionStart() == richEditText.getSelectionEnd() || !articleTextSelectionHelper.selectRangeOf(RichTableCell.this, i2, i3, i)) {
                return;
            }
            RichTableCell.this.hijackingSelection = true;
            richEditText.setSelection(i);
            RichTableCell.this.hijackingSelection = false;
        }
    }

    public void lambda$wireCellListeners$3(RichTableCellHost richTableCellHost) {
        BlockRow blockRow;
        TL_iv.pageTableCell pagetablecell = richTableCellHost.cell;
        if (pagetablecell != null) {
            TableModel.applyStyledText(pagetablecell, richTableCellHost.editText.getText());
        }
        Delegate delegate = this.delegate;
        if (delegate == null || (blockRow = this.currentRow) == null) {
            return;
        }
        delegate.onSpansChanged(blockRow);
    }

    public boolean moveFocusByTab(RichTableCellHost richTableCellHost, boolean z) {
        int iIndexOf;
        RichTableCellHost richTableCellHostHostForAnchor;
        TableModel tableModel = this.model;
        if (tableModel == null || (iIndexOf = tableModel.anchors().indexOf(richTableCellHost.cell)) < 0) {
            return false;
        }
        int i = z ? iIndexOf - 1 : iIndexOf + 1;
        if (i < 0 || i >= this.model.anchors().size() || (richTableCellHostHostForAnchor = this.grid.hostForAnchor((TL_iv.pageTableCell) this.model.anchors().get(i))) == null) {
            return false;
        }
        richTableCellHostHostForAnchor.editText.requestEditFocus();
        RichEditText richEditText = richTableCellHostHostForAnchor.editText;
        richEditText.setSelection(richEditText.length());
        return true;
    }

    public RichTableCellHost findHostContaining(View view) {
        if (view == null) {
            return null;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof RichTableCellHost) {
                return (RichTableCellHost) parent;
            }
            if (parent == this) {
                return null;
            }
        }
        return null;
    }

    @Override
    public void updateColors() {
        this.titleEditText.updateColors();
        int color = Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider);
        this.titleEditText.setTextColor(color);
        this.titleEditText.setHintTextColor(Theme.multAlpha(color, 0.35f));
        for (int i = 0; i < this.grid.getChildCount(); i++) {
            View childAt = this.grid.getChildAt(i);
            if (childAt instanceof RichTableCellHost) {
                ((RichTableCellHost) childAt).editText.updateColors();
            }
        }
        this.grid.applyColors();
    }

    @Override
    public void fillTextLayoutBlocks(ArrayList arrayList) {
        final Layout layout;
        if (this.model == null) {
            return;
        }
        final Layout layout2 = this.titleEditText.getLayout();
        if (layout2 != null) {
            final int left = this.titleEditText.getLeft() + this.titleEditText.getPaddingLeft();
            final int top = this.titleEditText.getTop() + this.titleEditText.getPaddingTop();
            arrayList.add(new TextSelectionHelper.TextLayoutBlock() {
                @Override
                public CharSequence getPrefix() {
                    return TextSelectionHelper.TextLayoutBlock.CC.$default$getPrefix(this);
                }

                @Override
                public int getRow() {
                    return 0;
                }

                @Override
                public Rect getSelectionBounds() {
                    return TextSelectionHelper.TextLayoutBlock.CC.$default$getSelectionBounds(this);
                }

                @Override
                public Layout getLayout() {
                    return layout2;
                }

                @Override
                public int getX() {
                    return left;
                }

                @Override
                public int getY() {
                    return top;
                }

                @Override
                public CharSequence getText() {
                    return (RichTableCell.this.currentRow == null || !(RichTableCell.this.currentRow.block instanceof TL_iv.pageBlockTable) || ((TL_iv.pageBlockTable) RichTableCell.this.currentRow.block).title == null) ? "" : RichTextStyle.toSpannable(((TL_iv.pageBlockTable) RichTableCell.this.currentRow.block).title);
                }
            });
        }
        int size = this.model.anchors().size();
        for (int i = 0; i < size; i++) {
            final TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.model.anchors().get(i);
            RichTableCellHost richTableCellHostHostForAnchor = this.grid.hostForAnchor(pagetablecell);
            if (richTableCellHostHostForAnchor != null && (layout = richTableCellHostHostForAnchor.editText.getLayout()) != null) {
                final int left2 = (((this.scrollView.getLeft() + this.scrollContent.getLeft()) + this.grid.getLeft()) - this.scrollView.getScrollX()) + richTableCellHostHostForAnchor.getLeft() + richTableCellHostHostForAnchor.editText.getLeft() + richTableCellHostHostForAnchor.editText.getPaddingLeft();
                final int top2 = this.scrollView.getTop() + this.scrollContent.getTop() + this.grid.getTop() + richTableCellHostHostForAnchor.getTop() + richTableCellHostHostForAnchor.editText.getTop() + richTableCellHostHostForAnchor.editText.getPaddingTop();
                final int iAnchorRowOf = this.model.anchorRowOf(pagetablecell) + 10;
                arrayList.add(new TextSelectionHelper.TextLayoutBlock() {
                    @Override
                    public CharSequence getPrefix() {
                        return TextSelectionHelper.TextLayoutBlock.CC.$default$getPrefix(this);
                    }

                    @Override
                    public Rect getSelectionBounds() {
                        return TextSelectionHelper.TextLayoutBlock.CC.$default$getSelectionBounds(this);
                    }

                    @Override
                    public Layout getLayout() {
                        return layout;
                    }

                    @Override
                    public int getX() {
                        return left2;
                    }

                    @Override
                    public int getY() {
                        return top2;
                    }

                    @Override
                    public int getRow() {
                        return iAnchorRowOf;
                    }

                    @Override
                    public CharSequence getText() {
                        return TableModel.readStyledText(pagetablecell);
                    }
                });
            }
        }
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.model == null) {
            return;
        }
        Delegate delegate = this.delegate;
        TextSelectionHelper.ArticleTextSelectionHelper selectionHelper = delegate != null ? delegate.getSelectionHelper() : null;
        if (selectionHelper == null) {
            return;
        }
        this.tmpBlocks.clear();
        fillTextLayoutBlocks(this.tmpBlocks);
        for (int i = 0; i < this.tmpBlocks.size(); i++) {
            TextSelectionHelper.TextLayoutBlock textLayoutBlock = (TextSelectionHelper.TextLayoutBlock) this.tmpBlocks.get(i);
            canvas.save();
            canvas.translate(textLayoutBlock.getX(), textLayoutBlock.getY());
            selectionHelper.draw(canvas, this, i);
            canvas.restore();
        }
    }

    @Override
    public void invalidate() {
        super.invalidate();
        RichTableCellGrid richTableCellGrid = this.grid;
        if (richTableCellGrid != null) {
            richTableCellGrid.invalidate();
        }
    }

    public static final class Factory extends UItem.UItemFactory {
        @Override
        public boolean isClickable() {
            return false;
        }

        static {
            UItem.UItemFactory.setup(new Factory());
        }

        @Override
        public RichTableCell createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            RichTableCell richTableCell = new RichTableCell(context, resourcesProvider);
            richTableCell.setBackground(new RichEditor.DraggingDrawable(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider)));
            return richTableCell;
        }

        @Override
        public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            ((RichTableCell) view).bind((BlockRow) uItem.object, (Delegate) uItem.object2);
        }

        public static UItem of(BlockRow blockRow, Delegate delegate) {
            UItem uItemOfFactory = UItem.ofFactory(Factory.class);
            uItemOfFactory.object = blockRow;
            uItemOfFactory.object2 = delegate;
            return uItemOfFactory;
        }
    }
}
