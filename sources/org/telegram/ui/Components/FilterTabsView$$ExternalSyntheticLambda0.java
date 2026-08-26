package org.telegram.ui.Components;

import android.view.View;

public final class FilterTabsView$$ExternalSyntheticLambda0 implements RecyclerListView.OnItemClickListenerExtended, RecyclerListView.OnItemLongClickListener {
    public final FilterTabsView f$0;

    public FilterTabsView$$ExternalSyntheticLambda0(FilterTabsView filterTabsView) {
        this.f$0 = filterTabsView;
    }

    @Override
    public boolean hasDoubleTap(View view, int i) {
        return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i);
    }

    @Override
    public void onDoubleTap(View view, int i, float f, float f2) {
        RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i, f, f2);
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        this.f$0.lambda$new$0(view, i, f, f2);
    }

    @Override
    public boolean onItemClick(View view, int i) {
        return this.f$0.lambda$new$1(view, i);
    }
}
