package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class FillLastGridLayoutManager extends GridLayoutManager {
    private int additionalHeight;
    private boolean bind;
    private boolean canScrollVertically;
    private SparseArray<RecyclerView.ViewHolder> heights;
    protected int lastItemHeight;
    private int listHeight;
    private RecyclerView listView;
    private int listWidth;

    public FillLastGridLayoutManager(Context context, int i, int i2, RecyclerView recyclerView) {
        super(i);
        this.heights = new SparseArray<>();
        this.lastItemHeight = -1;
        this.bind = true;
        this.canScrollVertically = true;
        this.listView = recyclerView;
        this.additionalHeight = i2;
    }

    public void calcLastItemHeight() {
        RecyclerView.Adapter adapter;
        if (this.listHeight <= 0 || !shouldCalcLastItemHeight() || (adapter = this.listView.getAdapter()) == null) {
            return;
        }
        int spanCount = getSpanCount();
        int itemCount = adapter.getItemCount() - 1;
        GridLayoutManager.SpanSizeLookup spanSizeLookup = getSpanSizeLookup();
        int i = 0;
        boolean z = true;
        int measuredHeight = 0;
        for (int i2 = 0; i2 < itemCount; i2++) {
            int spanSize = spanSizeLookup.getSpanSize(i2);
            i += spanSize;
            if (spanSize == spanCount || i > spanCount) {
                i = spanSize;
                z = true;
            }
            if (z) {
                int itemViewType = adapter.getItemViewType(i2);
                RecyclerView.ViewHolder viewHolderCreateViewHolder = this.heights.get(itemViewType, null);
                if (viewHolderCreateViewHolder == null) {
                    viewHolderCreateViewHolder = adapter.createViewHolder(this.listView, itemViewType);
                    this.heights.put(itemViewType, viewHolderCreateViewHolder);
                    if (viewHolderCreateViewHolder.itemView.getLayoutParams() == null) {
                        viewHolderCreateViewHolder.itemView.setLayoutParams(generateDefaultLayoutParams());
                    }
                }
                if (this.bind) {
                    adapter.onBindViewHolder(viewHolderCreateViewHolder, i2);
                }
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewHolderCreateViewHolder.itemView.getLayoutParams();
                viewHolderCreateViewHolder.itemView.measure(RecyclerView.LayoutManager.getChildMeasureSpec(this.listWidth, getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).width, canScrollHorizontally()), RecyclerView.LayoutManager.getChildMeasureSpec(this.listHeight, getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams).height, canScrollVertically()));
                measuredHeight += viewHolderCreateViewHolder.itemView.getMeasuredHeight();
                if (measuredHeight >= (this.listHeight - this.additionalHeight) - this.listView.getPaddingBottom()) {
                    break;
                } else {
                    z = false;
                }
            }
        }
        this.lastItemHeight = Math.max(0, ((this.listHeight - measuredHeight) - this.additionalHeight) - this.listView.getPaddingBottom());
    }

    @Override
    public boolean canScrollVertically() {
        return this.canScrollVertically;
    }

    @Override
    public void measureChild(View view, int i, boolean z) {
        if (this.listView.findContainingViewHolder(view).getAdapterPosition() == getItemCount() - 1) {
            ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).height = Math.max(this.lastItemHeight, 0);
        }
        super.measureChild(view, i, z);
    }

    @Override
    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        this.heights.clear();
        calcLastItemHeight();
        super.onAdapterChanged(adapter, adapter2);
    }

    @Override
    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        super.onItemsAdded(recyclerView, i, i2);
        calcLastItemHeight();
    }

    @Override
    public void onItemsChanged(RecyclerView recyclerView) {
        this.heights.clear();
        calcLastItemHeight();
        super.onItemsChanged(recyclerView);
    }

    @Override
    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        super.onItemsMoved(recyclerView, i, i2, i3);
        calcLastItemHeight();
    }

    @Override
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        super.onItemsRemoved(recyclerView, i, i2);
        calcLastItemHeight();
    }

    @Override
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
        super.onItemsUpdated(recyclerView, i, i2);
        calcLastItemHeight();
    }

    @Override
    public void onMeasure(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2) {
        int i3 = this.listHeight;
        this.listWidth = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.listHeight = size;
        if (i3 != size) {
            calcLastItemHeight();
        }
        super.onMeasure(recycler, state, i, i2);
    }

    public void setAdditionalHeight(int i) {
        this.additionalHeight = i;
        calcLastItemHeight();
    }

    public void setBind(boolean z) {
        this.bind = z;
    }

    public void setCanScrollVertically(boolean z) {
        this.canScrollVertically = z;
    }

    public boolean shouldCalcLastItemHeight() {
        return true;
    }

    @Override
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        super.onItemsUpdated(recyclerView, i, i2, obj);
        calcLastItemHeight();
    }

    public FillLastGridLayoutManager(Context context, int i, int i2, boolean z, int i3, RecyclerView recyclerView) {
        super(i, i2, z);
        this.heights = new SparseArray<>();
        this.lastItemHeight = -1;
        this.bind = true;
        this.canScrollVertically = true;
        this.listView = recyclerView;
        this.additionalHeight = i3;
    }
}
