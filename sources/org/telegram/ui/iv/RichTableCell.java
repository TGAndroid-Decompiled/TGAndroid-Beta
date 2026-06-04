package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.iv.RichEditText;
import org.telegram.ui.iv.RichTableCellGrid;

public class RichTableCell extends FrameLayout implements Theme.Colorable, TextSelectionHelper.ArticleSelectableView {
    private final TextView addColumnButton;
    private final TextView addRowButton;
    private CellSelectionListener cellSelectionListener;
    private BlockRow currentRow;
    private Delegate delegate;
    private final RichTableCellGrid grid;
    private boolean hijackingSelection;
    private TableModel model;
    private final Theme.ResourcesProvider resourcesProvider;
    private final ScrollContent scrollContent;
    private final HorizontalScrollView scrollView;
    private final LinkedHashSet selectedCells;
    private final ArrayList tmpBlocks;

    public interface CellSelectionListener {
        void onCellSelectionChanged(RichTableCell richTableCell);
    }

    public interface Delegate {
        TextSelectionHelper.ArticleTextSelectionHelper getSelectionHelper();

        void onRequestWindowFocusable(RichEditText richEditText, boolean z);

        void onTextChanged(BlockRow blockRow);
    }

    public RichTableCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.tmpBlocks = new ArrayList();
        this.selectedCells = new LinkedHashSet();
        this.resourcesProvider = resourcesProvider;
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
        horizontalScrollView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        addView(horizontalScrollView, LayoutHelper.createFrame(-1, -2.0f, 51, 0.0f, 6.0f, 0.0f, 6.0f));
        RichTableCellGrid richTableCellGrid = new RichTableCellGrid(context, resourcesProvider);
        this.grid = richTableCellGrid;
        TextView textViewMakeAddButton = makeAddButton(context, new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$0(view);
            }
        });
        this.addRowButton = textViewMakeAddButton;
        TextView textViewMakeAddButton2 = makeAddButton(context, new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$1(view);
            }
        });
        this.addColumnButton = textViewMakeAddButton2;
        ScrollContent scrollContent = new ScrollContent(context);
        this.scrollContent = scrollContent;
        scrollContent.addView(richTableCellGrid);
        scrollContent.addView(textViewMakeAddButton2);
        scrollContent.addView(textViewMakeAddButton);
        horizontalScrollView.addView(scrollContent, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    public void lambda$new$0(View view) {
        addRow();
    }

    public void lambda$new$1(View view) {
        addColumn();
    }

    private TextView makeAddButton(Context context, View.OnClickListener onClickListener) {
        TextView textView = new TextView(context);
        textView.setText("+");
        textView.setGravity(17);
        textView.setIncludeFontPadding(false);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, this.resourcesProvider));
        textView.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, this.resourcesProvider), 2));
        textView.setOnClickListener(onClickListener);
        return textView;
    }

    private final class ScrollContent extends ViewGroup {
        ScrollContent(Context context) {
            super(context);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int iDp = AndroidUtilities.dp(32.0f);
            RichTableCell.this.grid.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, View.MeasureSpec.getSize(i) - iDp), Integer.MIN_VALUE), i2);
            int measuredWidth = RichTableCell.this.grid.getMeasuredWidth();
            int measuredHeight = RichTableCell.this.grid.getMeasuredHeight();
            RichTableCell.this.addColumnButton.measure(View.MeasureSpec.makeMeasureSpec(iDp, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            RichTableCell.this.addRowButton.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(iDp, 1073741824));
            setMeasuredDimension(measuredWidth + iDp, measuredHeight + iDp);
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int measuredWidth = RichTableCell.this.grid.getMeasuredWidth();
            int measuredHeight = RichTableCell.this.grid.getMeasuredHeight();
            RichTableCell.this.grid.layout(0, 0, measuredWidth, measuredHeight);
            RichTableCell.this.addColumnButton.layout(measuredWidth, 0, RichTableCell.this.addColumnButton.getMeasuredWidth() + measuredWidth, measuredHeight);
            RichTableCell.this.addRowButton.layout(0, measuredHeight, measuredWidth, RichTableCell.this.addRowButton.getMeasuredHeight() + measuredHeight);
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
            updateColors();
            this.scrollContent.requestLayout();
        }
    }

    public void addRow() {
        TableModel tableModel = this.model;
        if (tableModel == null) {
            return;
        }
        tableModel.addRow();
        refreshAfterModelChange();
    }

    public void addColumn() {
        TableModel tableModel = this.model;
        if (tableModel == null) {
            return;
        }
        tableModel.addColumn();
        refreshAfterModelChange();
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
        int left = ((i - this.scrollView.getLeft()) - this.grid.getLeft()) + this.scrollView.getScrollX();
        int top = (i2 - this.scrollView.getTop()) - this.grid.getTop();
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

    public boolean isPressOnText(int i, int i2) {
        RichTableCellHost richTableCellHostHostForAnchor;
        int lineForVertical;
        TL_iv.pageTableCell pagetablecellFindCellAt = findCellAt(i, i2);
        if (pagetablecellFindCellAt == null || (richTableCellHostHostForAnchor = this.grid.hostForAnchor(pagetablecellFindCellAt)) == null) {
            return false;
        }
        int left = ((i - this.scrollView.getLeft()) - this.grid.getLeft()) + this.scrollView.getScrollX();
        int top = (i2 - this.scrollView.getTop()) - this.grid.getTop();
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
        this.selectedCells.clear();
        boolean zMergeCells = this.model.mergeCells(hashSet);
        if (zMergeCells) {
            refreshAfterModelChange();
            this.grid.invalidate();
            notifyCellSelectionChanged();
        } else {
            this.selectedCells.addAll(hashSet);
        }
        return zMergeCells;
    }

    public boolean applyUnmergeFromSelection() {
        boolean zUnmergeCell = false;
        if (this.model != null && this.selectedCells.size() == 1) {
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.selectedCells.iterator().next();
            if (TableModel.spanCol(pagetablecell) <= 1 && TableModel.spanRow(pagetablecell) <= 1) {
                return false;
            }
            this.selectedCells.clear();
            zUnmergeCell = this.model.unmergeCell(pagetablecell);
            if (zUnmergeCell) {
                refreshAfterModelChange();
                this.grid.invalidate();
                notifyCellSelectionChanged();
            } else {
                this.selectedCells.add(pagetablecell);
            }
        }
        return zUnmergeCell;
    }

    public boolean applyDeleteRowsFromSelection() {
        if (this.model == null || this.selectedCells.isEmpty()) {
            return false;
        }
        HashSet hashSet = new HashSet();
        Iterator it = this.selectedCells.iterator();
        while (it.hasNext()) {
            hashSet.add(Integer.valueOf(this.model.anchorRowOf((TL_iv.pageTableCell) it.next())));
        }
        this.selectedCells.clear();
        boolean zDeleteRows = this.model.deleteRows(hashSet);
        refreshAfterModelChange();
        return zDeleteRows;
    }

    public boolean applyDeleteColumnsFromSelection() {
        if (this.model == null || this.selectedCells.isEmpty()) {
            return false;
        }
        HashSet hashSet = new HashSet();
        Iterator it = this.selectedCells.iterator();
        while (it.hasNext()) {
            hashSet.add(Integer.valueOf(this.model.anchorColOf((TL_iv.pageTableCell) it.next())));
        }
        this.selectedCells.clear();
        boolean zDeleteColumns = this.model.deleteColumns(hashSet);
        refreshAfterModelChange();
        return zDeleteColumns;
    }

    public boolean isEmpty() {
        TableModel tableModel = this.model;
        return tableModel == null || tableModel.rowCount == 0 || tableModel.colCount == 0;
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
        for (int i = 0; i < this.grid.getChildCount(); i++) {
            View childAt = this.grid.getChildAt(i);
            if (childAt instanceof RichTableCellHost) {
                ((RichTableCellHost) childAt).setLocked(z);
            }
        }
    }

    private void wireCellListeners() {
        for (int i = 0; i < this.grid.getChildCount(); i++) {
            View childAt = this.grid.getChildAt(i);
            if (childAt instanceof RichTableCellHost) {
                RichTableCellHost richTableCellHost = (RichTableCellHost) childAt;
                richTableCellHost.editText.setListener(new AnonymousClass2(richTableCellHost));
            }
        }
    }

    class AnonymousClass2 implements RichEditText.Listener {
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

        AnonymousClass2(RichTableCellHost richTableCellHost) {
            this.val$host = richTableCellHost;
        }

        @Override
        public void onTextChanged(RichEditText richEditText, Editable editable) {
            TL_iv.pageTableCell pagetablecell = this.val$host.cell;
            if (pagetablecell != null) {
                TableModel.applyPlainText(pagetablecell, editable.toString());
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
        public void onSelectionChanged(final RichEditText richEditText, final int i, final int i2) {
            final TextSelectionHelper.ArticleTextSelectionHelper selectionHelper;
            if (RichTableCell.this.hijackingSelection || i == i2 || RichTableCell.this.delegate == null || (selectionHelper = RichTableCell.this.delegate.getSelectionHelper()) == null) {
                return;
            }
            if (selectionHelper.isInSelectionMode() && selectionHelper.getSelectedCell() == RichTableCell.this) {
                return;
            }
            final int iFlatIndexOfAnchor = RichTableCell.this.model == null ? 0 : RichTableCell.this.model.flatIndexOfAnchor(this.val$host.cell);
            if (iFlatIndexOfAnchor < 0) {
                return;
            }
            RichTableCell.this.post(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onSelectionChanged$0(richEditText, i2, selectionHelper, iFlatIndexOfAnchor, i);
                }
            });
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
        for (int i = 0; i < this.grid.getChildCount(); i++) {
            View childAt = this.grid.getChildAt(i);
            if (childAt instanceof RichTableCellHost) {
                ((RichTableCellHost) childAt).editText.applyColors();
            }
        }
        this.grid.applyColors();
    }

    @Override
    public void fillTextLayoutBlocks(ArrayList arrayList) {
        final Layout layout;
        TableModel tableModel = this.model;
        if (tableModel == null) {
            return;
        }
        int size = tableModel.anchors().size();
        for (int i = 0; i < size; i++) {
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.model.anchors().get(i);
            RichTableCellHost richTableCellHostHostForAnchor = this.grid.hostForAnchor(pagetablecell);
            if (richTableCellHostHostForAnchor != null && (layout = richTableCellHostHostForAnchor.editText.getLayout()) != null) {
                final int left = ((this.scrollView.getLeft() + this.grid.getLeft()) - this.scrollView.getScrollX()) + richTableCellHostHostForAnchor.getLeft() + richTableCellHostHostForAnchor.editText.getLeft() + richTableCellHostHostForAnchor.editText.getPaddingLeft();
                final int top = this.scrollView.getTop() + this.grid.getTop() + richTableCellHostHostForAnchor.getTop() + richTableCellHostHostForAnchor.editText.getTop() + richTableCellHostHostForAnchor.editText.getPaddingTop();
                final int iAnchorRowOf = this.model.anchorRowOf(pagetablecell) + 10;
                arrayList.add(new TextSelectionHelper.TextLayoutBlock() {
                    @Override
                    public CharSequence getPrefix() {
                        return TextSelectionHelper.TextLayoutBlock.CC.$default$getPrefix(this);
                    }

                    @Override
                    public Layout getLayout() {
                        return layout;
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
                    public int getRow() {
                        return iAnchorRowOf;
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
            return new RichTableCell(context, resourcesProvider);
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
