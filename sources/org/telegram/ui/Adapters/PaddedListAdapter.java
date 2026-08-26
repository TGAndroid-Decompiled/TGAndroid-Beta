package org.telegram.ui.Adapters;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Stories.MuteButton;

public final class PaddedListAdapter extends RecyclerListView.SelectionAdapter {
    public int lastPadding;
    public MuteButton.AnonymousClass1 paddingView;
    public final MentionsAdapter wrappedAdapter;
    public Integer padding = null;
    public boolean paddingViewAttached = false;

    public PaddedListAdapter(MentionsAdapter mentionsAdapter) {
        RecyclerView.AdapterDataObserver adapterDataObserver = new RecyclerView.AdapterDataObserver() {
            @Override
            public final void onChanged() {
                PaddedListAdapter.this.notifyDataSetChanged();
            }

            @Override
            public final void onItemRangeChanged(int i, int i2) {
                super.onItemRangeChanged(i, i2);
                PaddedListAdapter.this.notifyItemRangeChanged(i + 1, i2);
            }

            @Override
            public final void onItemRangeInserted(int i, int i2) {
                PaddedListAdapter.this.notifyItemRangeInserted(i + 1, i2);
            }

            @Override
            public final void onItemRangeMoved(int i, int i2, int i3) {
                super.onItemRangeMoved(i, i2, i3);
                int i4 = i2 + 1 + i3;
                PaddedListAdapter.this.notifyItemRangeChanged(i + 1, i4);
            }

            @Override
            public final void onItemRangeRemoved(int i, int i2) {
                PaddedListAdapter.this.notifyItemRangeRemoved(i + 1, i2);
            }
        };
        this.wrappedAdapter = mentionsAdapter;
        mentionsAdapter.registerAdapterDataObserver(adapterDataObserver);
    }

    @Override
    public final int getItemCount() {
        MentionsAdapter mentionsAdapter = this.wrappedAdapter;
        int itemCountInternal = mentionsAdapter.getItemCountInternal();
        mentionsAdapter.lastItemCount = itemCountInternal;
        return itemCountInternal + 1;
    }

    @Override
    public final int getItemViewType(int i) {
        if (i == 0) {
            return -983904;
        }
        return this.wrappedAdapter.getItemViewType(i - 1);
    }

    @Override
    public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder.getAdapterPosition() == 0) {
            return false;
        }
        return this.wrappedAdapter.isEnabled(viewHolder);
    }

    @Override
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (i > 0) {
            this.wrappedAdapter.onBindViewHolder(viewHolder, i - 1);
        }
    }

    @Override
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != -983904) {
            return this.wrappedAdapter.onCreateViewHolder(viewGroup, i);
        }
        MuteButton.AnonymousClass1 anonymousClass1 = new MuteButton.AnonymousClass1(this, viewGroup.getContext(), 2);
        this.paddingView = anonymousClass1;
        return new RecyclerListView.Holder(anonymousClass1);
    }
}
