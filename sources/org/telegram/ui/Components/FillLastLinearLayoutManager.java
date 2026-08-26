package org.telegram.ui.Components;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class FillLastLinearLayoutManager extends LinearLayoutManager {
    public int additionalHeight;
    public boolean bind;
    public final boolean canScrollVertically;
    public boolean fixedLastItemHeight;
    public final SparseArray heights;
    public int lastItemHeight;
    public int listHeight;
    public final RecyclerListView listView;
    public int listWidth;
    public int minimumHeight;
    public final boolean setMeassuredHeightToLastItem;
    public boolean skipFirstItem;

    public FillLastLinearLayoutManager(int i, int i2, RecyclerListView recyclerListView) {
        super(1, false);
        this.heights = new SparseArray();
        this.lastItemHeight = -1;
        this.bind = true;
        this.canScrollVertically = true;
        this.setMeassuredHeightToLastItem = true;
        this.listView = recyclerListView;
        this.additionalHeight = i;
    }

    public final void calcLastItemHeight$1() {
        RecyclerListView recyclerListView;
        ?? adapter;
        ?? r3;
        if (this.listHeight > 0 && (adapter = (recyclerListView = this.listView).getAdapter()) != 0) {
            int itemCount = adapter.getItemCount() - 1;
            boolean z = this.skipFirstItem;
            int measuredHeight = 0;
            int measuredHeight2 = 0;
            while (true) {
                if (r3 >= itemCount) {
                    r3 = z;
                    break;
                }
                int itemViewType = adapter.getItemViewType(r3);
                SparseArray sparseArray = this.heights;
                RecyclerView.ViewHolder viewHolderCreateViewHolder = (RecyclerView.ViewHolder) sparseArray.get(itemViewType, null);
                if (viewHolderCreateViewHolder == null) {
                    viewHolderCreateViewHolder = adapter.createViewHolder(recyclerListView, itemViewType);
                    sparseArray.put(itemViewType, viewHolderCreateViewHolder);
                    View view = viewHolderCreateViewHolder.itemView;
                    if (view.getLayoutParams() == null) {
                        r3 = z;
                        view.setLayoutParams(new RecyclerView.LayoutParams(-2, -2));
                    }
                }
                r3 = z;
                r3 = z;
                if (this.bind) {
                    adapter.onBindViewHolder(viewHolderCreateViewHolder, r3);
                }
                View view2 = viewHolderCreateViewHolder.itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view2.getLayoutParams();
                view2.measure(RecyclerView.LayoutManager.getChildMeasureSpec(canScrollHorizontally(), this.listWidth, this.mWidthMode, getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).width), RecyclerView.LayoutManager.getChildMeasureSpec(this.canScrollVertically, this.listHeight, this.mHeightMode, getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams).height));
                measuredHeight += view2.getMeasuredHeight();
                if (r3 == 0) {
                    measuredHeight2 = view2.getMeasuredHeight();
                }
                if (this.fixedLastItemHeight) {
                    if (measuredHeight >= this.listHeight + measuredHeight2) {
                        break;
                    } else {
                        r3++;
                    }
                } else if (measuredHeight >= this.listHeight) {
                    break;
                } else {
                    r3++;
                }
            }
            if (this.fixedLastItemHeight) {
                this.lastItemHeight = Math.max(this.minimumHeight, (((this.listHeight - measuredHeight) - this.additionalHeight) - recyclerListView.getPaddingBottom()) + measuredHeight2);
            } else {
                this.lastItemHeight = Math.max(this.minimumHeight, ((this.listHeight - measuredHeight) - this.additionalHeight) - recyclerListView.getPaddingBottom());
            }
        }
    }

    @Override
    public final boolean canScrollVertically() {
        return this.canScrollVertically;
    }

    @Override
    public final void measureChildWithMargins(View view) {
        if (this.setMeassuredHeightToLastItem) {
            RecyclerListView recyclerListView = this.listView;
            View viewFindContainingItemView = recyclerListView.findContainingItemView(view);
            if ((viewFindContainingItemView == null ? null : recyclerListView.getChildViewHolder(viewFindContainingItemView)).getAdapterPosition() == getItemCount() - 1) {
                ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).height = Math.max(this.lastItemHeight, 0);
            }
        }
        super.measureChildWithMargins(view);
    }

    @Override
    public final void onAdapterChanged() {
        this.heights.clear();
        calcLastItemHeight$1();
    }

    @Override
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        calcLastItemHeight$1();
    }

    @Override
    public final void onItemsChanged(RecyclerView recyclerView) {
        this.heights.clear();
        calcLastItemHeight$1();
    }

    @Override
    public final void onItemsMoved(RecyclerView recyclerView, int i, int i2) {
        calcLastItemHeight$1();
    }

    @Override
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        calcLastItemHeight$1();
    }

    @Override
    public final void onItemsUpdated() {
        calcLastItemHeight$1();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3 = this.listHeight;
        this.listWidth = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.listHeight = size;
        if (i3 != size) {
            calcLastItemHeight$1();
        }
        this.mRecyclerView.defaultOnMeasure(i, i2);
    }

    @Override
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        calcLastItemHeight$1();
        calcLastItemHeight$1();
    }

    public FillLastLinearLayoutManager(RecyclerListView recyclerListView, int i) {
        super(1, false);
        this.heights = new SparseArray();
        this.lastItemHeight = -1;
        this.bind = true;
        this.canScrollVertically = true;
        this.setMeassuredHeightToLastItem = true;
        this.listView = recyclerListView;
        this.additionalHeight = i;
    }
}
