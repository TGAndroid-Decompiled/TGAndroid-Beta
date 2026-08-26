package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

public final class ViewPagerFixed$TabsView$$ExternalSyntheticLambda0 implements RecyclerListView.OnItemClickListenerExtended, RecyclerListView.OnItemLongClickListener {
    public final ViewPagerFixed.AnonymousClass3 f$0;

    public ViewPagerFixed$TabsView$$ExternalSyntheticLambda0(ViewPagerFixed.AnonymousClass3 anonymousClass3) {
        this.f$0 = anonymousClass3;
    }

    @Override
    public boolean hasDoubleTap(View view) {
        return false;
    }

    @Override
    public void onDoubleTap(View view, float f, float f2) {
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        ViewPagerFixed.AnonymousClass3 anonymousClass3 = this.f$0;
        ViewPagerFixed.TabsView.TabsViewDelegate tabsViewDelegate = anonymousClass3.delegate;
        if (tabsViewDelegate != null) {
            ViewPagerFixed viewPagerFixed = ViewPagerFixed.this;
            if (viewPagerFixed.tabsAnimationInProgress || viewPagerFixed.startedTracking) {
                return;
            }
        }
        ViewPagerFixed.TabsView.TabView tabView = (ViewPagerFixed.TabsView.TabView) view;
        if (i != anonymousClass3.currentPosition || tabsViewDelegate == null) {
            Utilities.Callback2Return callback2Return = anonymousClass3.preTabClick;
            if (callback2Return == null || !((Boolean) callback2Return.run(Integer.valueOf(tabView.currentTab.id), Integer.valueOf(i))).booleanValue()) {
                anonymousClass3.scrollToTab(tabView.currentTab.id, i);
            }
        }
    }

    @Override
    public boolean onItemClick(int i, View view) {
        Utilities.Callback2Return callback2Return = this.f$0.onTabLongClick;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((ViewPagerFixed.TabsView.TabView) view).currentTab.id), view)).booleanValue();
    }
}
