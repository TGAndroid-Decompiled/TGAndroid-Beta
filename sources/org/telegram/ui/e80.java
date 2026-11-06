package org.telegram.ui;

import android.content.Intent;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class e80 implements org.telegram.ui.Components.cc0, org.telegram.ui.ActionBar.r1 {
    public final LaunchActivity f45237a;

    public e80(LaunchActivity launchActivity) {
        this.f45237a = launchActivity;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        String str = LaunchActivity.B1;
        org.telegram.messenger.qp.s1(this.f45237a.O).A3(2);
    }

    @Override
    public void p(org.telegram.ui.Components.ec0 ec0Var) {
        String str = LaunchActivity.B1;
        org.telegram.messenger.iz.C = false;
        LaunchActivity launchActivity = this.f45237a;
        Intent intent = launchActivity.J0;
        if (intent != null) {
            launchActivity.W(intent, launchActivity.K0, launchActivity.L0, true, null, false, true);
            launchActivity.J0 = null;
        }
        launchActivity.f41275o0.getView().setVisibility(0);
        launchActivity.f41275o0.X(true, true);
        ActionBarLayout actionBarLayout = launchActivity.f41275o0;
        org.telegram.ui.ActionBar.f2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment != null) {
            lastFragment.setTitleOverlayText(actionBarLayout.M0, actionBarLayout.N0, actionBarLayout.O0);
        }
        if (org.telegram.messenger.g0.Q1()) {
            ActionBarLayout actionBarLayout2 = launchActivity.f41277p0;
            if (actionBarLayout2 != null) {
                actionBarLayout2.X(true, true);
                if (launchActivity.f41277p0.getView().getVisibility() == 4) {
                    launchActivity.f41277p0.getView().setVisibility(0);
                }
            }
            ActionBarLayout actionBarLayout3 = launchActivity.f41279q0;
            if (actionBarLayout3 != null) {
                actionBarLayout3.X(true, true);
                launchActivity.f41279q0.getView().setVisibility(0);
            }
        }
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25037o0, ec0Var);
        try {
            org.telegram.messenger.dt.t(org.telegram.messenger.p10.f24467s0).Y();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
