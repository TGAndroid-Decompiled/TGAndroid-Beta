package org.telegram.ui;

import android.content.Intent;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class h80 implements org.telegram.ui.Components.nc0, org.telegram.ui.ActionBar.r1 {
    public final LaunchActivity f48216a;

    public h80(LaunchActivity launchActivity) {
        this.f48216a = launchActivity;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        String str = LaunchActivity.C1;
        org.telegram.messenger.mp.u1(this.f48216a.P).H3(2);
    }

    @Override
    public void p(org.telegram.ui.Components.pc0 pc0Var) {
        String str = LaunchActivity.C1;
        org.telegram.messenger.bz.C = false;
        LaunchActivity launchActivity = this.f48216a;
        Intent intent = launchActivity.K0;
        if (intent != null) {
            launchActivity.W(intent, launchActivity.L0, launchActivity.M0, true, null, false, true);
            launchActivity.K0 = null;
        }
        launchActivity.f43094p0.getView().setVisibility(0);
        launchActivity.f43094p0.X(true, true);
        ActionBarLayout actionBarLayout = launchActivity.f43094p0;
        org.telegram.ui.ActionBar.h2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment != null) {
            lastFragment.setTitleOverlayText(actionBarLayout.N0, actionBarLayout.O0, actionBarLayout.P0);
        }
        if (org.telegram.messenger.g0.Q1()) {
            ActionBarLayout actionBarLayout2 = launchActivity.f43096q0;
            if (actionBarLayout2 != null) {
                actionBarLayout2.X(true, true);
                if (launchActivity.f43096q0.getView().getVisibility() == 4) {
                    launchActivity.f43096q0.getView().setVisibility(0);
                }
            }
            ActionBarLayout actionBarLayout3 = launchActivity.f43098r0;
            if (actionBarLayout3 != null) {
                actionBarLayout3.X(true, true);
                launchActivity.f43098r0.getView().setVisibility(0);
            }
        }
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25160o0, pc0Var);
        try {
            org.telegram.messenger.xs.t(org.telegram.messenger.j10.f24770t0).Y();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
