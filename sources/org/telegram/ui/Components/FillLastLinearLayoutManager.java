package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class FillLastLinearLayoutManager extends LinearLayoutManager {
    private int additionalHeight;
    private boolean bind;
    private boolean canScrollVertically;
    boolean fixedLastItemHeight;
    private SparseArray heights;
    private int lastItemHeight;
    private int listHeight;
    private RecyclerView listView;
    private int listWidth;
    private int minimumHeight;
    private boolean setMeassuredHeightToLastItem;
    private boolean skipFirstItem;

    public FillLastLinearLayoutManager(Context context, int i, RecyclerView recyclerView) {
        super(context);
        this.heights = new SparseArray();
        this.lastItemHeight = -1;
        this.bind = true;
        this.canScrollVertically = true;
        this.setMeassuredHeightToLastItem = true;
        this.listView = recyclerView;
        this.additionalHeight = i;
    }

    public FillLastLinearLayoutManager(Context context, int i, boolean z, int i2, RecyclerView recyclerView) {
        super(context, i, z);
        this.heights = new SparseArray();
        this.lastItemHeight = -1;
        this.bind = true;
        this.canScrollVertically = true;
        this.setMeassuredHeightToLastItem = true;
        this.listView = recyclerView;
        this.additionalHeight = i2;
    }

    private void calcLastItemHeight() {
        RecyclerView.Adapter adapter;
        if (this.listHeight > 0 && (adapter = this.listView.getAdapter()) != null) {
            int itemCount = adapter.getItemCount() - 1;
            int i = 0;
            int i2 = 0;
            for (int i3 = this.skipFirstItem; i3 < itemCount; i3++) {
                int itemViewType = adapter.getItemViewType(i3);
                RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) this.heights.get(itemViewType, null);
                if (viewHolder == null) {
                    viewHolder = adapter.createViewHolder(this.listView, itemViewType);
                    this.heights.put(itemViewType, viewHolder);
                    if (viewHolder.itemView.getLayoutParams() == null) {
                        viewHolder.itemView.setLayoutParams(generateDefaultLayoutParams());
                    }
                }
                if (this.bind) {
                    adapter.onBindViewHolder(viewHolder, i3);
                }
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewHolder.itemView.getLayoutParams();
                viewHolder.itemView.measure(RecyclerView.LayoutManager.getChildMeasureSpec(this.listWidth, getWidthMode(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).width, canScrollHorizontally()), RecyclerView.LayoutManager.getChildMeasureSpec(this.listHeight, getHeightMode(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams).height, canScrollVertically()));
                i += viewHolder.itemView.getMeasuredHeight();
                if (i3 == 0) {
                    i2 = viewHolder.itemView.getMeasuredHeight();
                }
                if (this.fixedLastItemHeight) {
                    if (i >= this.listHeight + i2) {
                        break;
                    }
                } else {
                    if (i >= this.listHeight) {
                        break;
                    }
                }
            }
            this.lastItemHeight = this.fixedLastItemHeight ? Math.max(this.minimumHeight, i2 + (((this.listHeight - i) - this.additionalHeight) - this.listView.getPaddingBottom())) : Math.max(this.minimumHeight, ((this.listHeight - i) - this.additionalHeight) - this.listView.getPaddingBottom());
        }
    }

    @Override
    public boolean canScrollVertically() {
        return this.canScrollVertically;
    }

    public int getLastItemHeight() {
        return this.lastItemHeight;
    }

    @Override
    public void measureChildWithMargins(View view, int i, int i2) {
        if (this.setMeassuredHeightToLastItem && this.listView.findContainingViewHolder(view).getAdapterPosition() == getItemCount() - 1) {
            ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).height = Math.max(this.lastItemHeight, 0);
        }
        super.measureChildWithMargins(view, 0, 0);
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
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        super.onItemsUpdated(recyclerView, i, i2, obj);
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

    public void setFixedLastItemHeight() {
        this.fixedLastItemHeight = true;
    }

    public void setMinimumLastViewHeight(int i) {
        this.minimumHeight = i;
    }

    public void setSkipFirstItem() {
        this.skipFirstItem = true;
    }
}
