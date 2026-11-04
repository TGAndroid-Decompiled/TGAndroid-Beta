package org.telegram.ui;

import android.content.Intent;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class a80 implements org.telegram.ui.Components.xb0, org.telegram.ui.ActionBar.p1 {
    public final LaunchActivity f43683a;

    public a80(LaunchActivity launchActivity) {
        this.f43683a = launchActivity;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        String str = LaunchActivity.E1;
        org.telegram.messenger.hp.s1(this.f43683a.P).A3(2);
    }

    @Override
    public void q(org.telegram.ui.Components.zb0 zb0Var) {
        String str = LaunchActivity.E1;
        org.telegram.messenger.az.C = false;
        LaunchActivity launchActivity = this.f43683a;
        Intent intent = launchActivity.M0;
        if (intent != null) {
            launchActivity.W(intent, launchActivity.N0, launchActivity.O0, true, null, false, true);
            launchActivity.M0 = null;
        }
        launchActivity.f41314r0.getView().setVisibility(0);
        launchActivity.f41314r0.X(true, true);
        ActionBarLayout actionBarLayout = launchActivity.f41314r0;
        org.telegram.ui.ActionBar.d2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment != null) {
            lastFragment.setTitleOverlayText(actionBarLayout.N0, actionBarLayout.O0, actionBarLayout.P0);
        }
        if (org.telegram.messenger.g0.Q1()) {
            ActionBarLayout actionBarLayout2 = launchActivity.f41316s0;
            if (actionBarLayout2 != null) {
                actionBarLayout2.X(true, true);
                if (launchActivity.f41316s0.getView().getVisibility() == 4) {
                    launchActivity.f41316s0.getView().setVisibility(0);
                }
            }
            ActionBarLayout actionBarLayout3 = launchActivity.f41318t0;
            if (actionBarLayout3 != null) {
                actionBarLayout3.X(true, true);
                launchActivity.f41318t0.getView().setVisibility(0);
            }
        }
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23274o0, zb0Var);
        try {
            org.telegram.messenger.us.t(org.telegram.messenger.h10.f22829t0).Y();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
