package org.telegram.ui.Components;

import android.view.View;

public final class ViewPagerFixed$TabsView$$ExternalSyntheticLambda4 implements RecyclerListView.OnItemClickListenerExtended, RecyclerListView.OnItemLongClickListener {
    public final ViewPagerFixed.TabsView f$0;

    public ViewPagerFixed$TabsView$$ExternalSyntheticLambda4(ViewPagerFixed.TabsView tabsView) {
        this.f$0 = tabsView;
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
