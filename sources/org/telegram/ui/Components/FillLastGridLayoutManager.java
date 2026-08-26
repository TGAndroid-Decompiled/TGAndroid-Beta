package org.telegram.ui.Components;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.BaseMenuWrapper;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.GroupCallActivity;

public class FillLastGridLayoutManager extends GridLayoutManager {
    public final int additionalHeight;
    public boolean bind;
    public boolean canScrollVertically;
    public final SparseArray heights;
    public int lastItemHeight;
    public int listHeight;
    public final RecyclerListView listView;
    public int listWidth;

    public FillLastGridLayoutManager(int i, int i2, RecyclerListView recyclerListView) {
        super(i);
        this.heights = new SparseArray();
        this.lastItemHeight = -1;
        this.bind = true;
        this.canScrollVertically = true;
        this.listView = recyclerListView;
        this.additionalHeight = i2;
    }

    public final void calcLastItemHeight() {
        RecyclerListView recyclerListView;
        RecyclerView.Adapter adapter;
        int i;
        RecyclerListView recyclerListView2;
        if (this.listHeight <= 0 || !shouldCalcLastItemHeight() || (adapter = (recyclerListView = this.listView).getAdapter()) == null) {
            return;
        }
        int i2 = this.mSpanCount;
        int itemCount = adapter.getItemCount() - 1;
        BaseMenuWrapper baseMenuWrapper = this.mSpanSizeLookup;
        int i3 = 0;
        int i4 = 0;
        boolean z = true;
        int measuredHeight = 0;
        while (true) {
            i = this.additionalHeight;
            if (i3 >= itemCount) {
                recyclerListView2 = recyclerListView;
                break;
            }
            int spanSize = baseMenuWrapper.getSpanSize(i3);
            i4 += spanSize;
            if (spanSize == i2 || i4 > i2) {
                i4 = spanSize;
                z = true;
            }
            if (z) {
                int itemViewType = adapter.getItemViewType(i3);
                SparseArray sparseArray = this.heights;
                RecyclerView.ViewHolder viewHolderCreateViewHolder = (RecyclerView.ViewHolder) sparseArray.get(itemViewType, null);
                if (viewHolderCreateViewHolder == null) {
                    viewHolderCreateViewHolder = adapter.createViewHolder(recyclerListView, itemViewType);
                    sparseArray.put(itemViewType, viewHolderCreateViewHolder);
                    View view = viewHolderCreateViewHolder.itemView;
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(generateDefaultLayoutParams());
                    }
                }
                if (this.bind) {
                    adapter.onBindViewHolder(viewHolderCreateViewHolder, i3);
                }
                View view2 = viewHolderCreateViewHolder.itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view2.getLayoutParams();
                recyclerListView2 = recyclerListView;
                view2.measure(RecyclerView.LayoutManager.getChildMeasureSpec(canScrollHorizontally(), this.listWidth, this.mWidthMode, getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).width), RecyclerView.LayoutManager.getChildMeasureSpec(this.canScrollVertically, this.listHeight, this.mHeightMode, getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams).height));
                measuredHeight += view2.getMeasuredHeight();
                if (measuredHeight >= (this.listHeight - i) - recyclerListView2.getPaddingBottom()) {
                    break;
                } else {
                    z = false;
                }
            } else {
                recyclerListView2 = recyclerListView;
            }
            i3++;
            recyclerListView = recyclerListView2;
        }
        this.lastItemHeight = Math.max(0, ((this.listHeight - measuredHeight) - i) - recyclerListView2.getPaddingBottom());
    }

    @Override
    public final boolean canScrollVertically() {
        return this.canScrollVertically;
    }

    @Override
    public final void measureChild(View view, int i, boolean z) {
        if (this.listView.findContainingViewHolder(view).getAdapterPosition() == getItemCount() - 1) {
            ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).height = Math.max(this.lastItemHeight, 0);
        }
        super.measureChild(view, i, z);
    }

    @Override
    public final void onAdapterChanged() {
        this.heights.clear();
        calcLastItemHeight();
    }

    @Override
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        super.onItemsAdded(recyclerView, i, i2);
        calcLastItemHeight();
    }

    @Override
    public final void onItemsChanged(RecyclerView recyclerView) {
        this.heights.clear();
        calcLastItemHeight();
        super.onItemsChanged(recyclerView);
    }

    @Override
    public final void onItemsMoved(RecyclerView recyclerView, int i, int i2) {
        super.onItemsMoved(recyclerView, i, i2);
        calcLastItemHeight();
    }

    @Override
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        super.onItemsRemoved(recyclerView, i, i2);
        calcLastItemHeight();
    }

    @Override
    public final void onItemsUpdated() {
        calcLastItemHeight();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3 = this.listHeight;
        this.listWidth = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.listHeight = size;
        if (i3 != size) {
            calcLastItemHeight();
        }
        this.mRecyclerView.defaultOnMeasure(i, i2);
    }

    public final void setBind() {
        this.bind = false;
    }

    public boolean shouldCalcLastItemHeight() {
        return true;
    }

    @Override
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        super.onItemsUpdated(recyclerView, i, i2, obj);
        calcLastItemHeight();
    }

    public FillLastGridLayoutManager(int i, GroupCallActivity.AnonymousClass9 anonymousClass9) {
        super(i, false);
        this.heights = new SparseArray();
        this.lastItemHeight = -1;
        this.bind = true;
        this.canScrollVertically = true;
        this.listView = anonymousClass9;
        this.additionalHeight = 0;
    }
}
