package org.telegram.p009ui.Adapters;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.p009ui.Components.RecyclerListView;

public class PaddedListAdapter extends RecyclerListView.SelectionAdapter {
    private GetPaddingRunnable getPaddingRunnable;
    private int lastPadding;
    private RecyclerView.AdapterDataObserver mDataObserver;
    public View paddingView;
    private RecyclerListView.SelectionAdapter wrappedAdapter;
    private Integer padding = null;
    public boolean paddingViewAttached = false;

    public interface GetPaddingRunnable {
        int run(int i);
    }

    public PaddedListAdapter(RecyclerListView.SelectionAdapter selectionAdapter) {
        RecyclerView.AdapterDataObserver adapterDataObserver = new RecyclerView.AdapterDataObserver() {
            @Override
            public void onChanged() {
                super.onChanged();
                PaddedListAdapter.this.notifyDataSetChanged();
            }

            @Override
            public void onItemRangeChanged(int i, int i2) {
                super.onItemRangeChanged(i, i2);
                PaddedListAdapter.this.notifyItemRangeChanged(i + 1, i2);
            }

            @Override
            public void onItemRangeInserted(int i, int i2) {
                super.onItemRangeInserted(i, i2);
                PaddedListAdapter.this.notifyItemRangeInserted(i + 1, i2);
            }

            @Override
            public void onItemRangeRemoved(int i, int i2) {
                super.onItemRangeRemoved(i, i2);
                PaddedListAdapter.this.notifyItemRangeRemoved(i + 1, i2);
            }

            @Override
            public void onItemRangeMoved(int i, int i2, int i3) {
                super.onItemRangeMoved(i, i2, i3);
                PaddedListAdapter.this.notifyItemRangeChanged(i + 1, i2 + 1 + i3);
            }
        };
        this.mDataObserver = adapterDataObserver;
        this.wrappedAdapter = selectionAdapter;
        selectionAdapter.registerAdapterDataObserver(adapterDataObserver);
    }

    @Override
    public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder.getAdapterPosition() == 0) {
            return false;
        }
        return this.wrappedAdapter.isEnabled(viewHolder);
    }

    public void setPadding(int i) {
        this.padding = Integer.valueOf(i);
        View view = this.paddingView;
        if (view != null) {
            view.requestLayout();
        }
    }

    public int getPadding(int i) {
        Integer num = this.padding;
        if (num != null) {
            int intValue = num.intValue();
            this.lastPadding = intValue;
            return intValue;
        }
        GetPaddingRunnable getPaddingRunnable = this.getPaddingRunnable;
        if (getPaddingRunnable != null) {
            int run = getPaddingRunnable.run(i);
            this.lastPadding = run;
            return run;
        }
        this.lastPadding = 0;
        return 0;
    }

    public int getPadding() {
        return this.lastPadding;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != -983904) {
            return this.wrappedAdapter.onCreateViewHolder(viewGroup, i);
        }
        View view = new View(viewGroup.getContext()) {
            @Override
            protected void onMeasure(int i2, int i3) {
                super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(PaddedListAdapter.this.getPadding(((View) getParent()).getMeasuredHeight()), 1073741824));
            }

            @Override
            protected void onAttachedToWindow() {
                super.onAttachedToWindow();
                PaddedListAdapter.this.paddingViewAttached = true;
            }

            @Override
            protected void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                PaddedListAdapter.this.paddingViewAttached = false;
            }
        };
        this.paddingView = view;
        return new RecyclerListView.Holder(view);
    }

    @Override
    public int getItemViewType(int i) {
        if (i == 0) {
            return -983904;
        }
        return this.wrappedAdapter.getItemViewType(i - 1);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (i > 0) {
            this.wrappedAdapter.onBindViewHolder(viewHolder, i - 1);
        }
    }

    @Override
    public int getItemCount() {
        return this.wrappedAdapter.getItemCount() + 1;
    }
}
