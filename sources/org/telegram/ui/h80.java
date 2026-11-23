package org.telegram.ui;

import android.content.Intent;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class h80 implements org.telegram.ui.Components.oc0, org.telegram.ui.ActionBar.q1 {
    public final LaunchActivity f48259a;

    public h80(LaunchActivity launchActivity) {
        this.f48259a = launchActivity;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        String str = LaunchActivity.C1;
        org.telegram.messenger.np.u1(this.f48259a.P).H3(2);
    }

    @Override
    public void p(org.telegram.ui.Components.qc0 qc0Var) {
        String str = LaunchActivity.C1;
        org.telegram.messenger.cz.C = false;
        LaunchActivity launchActivity = this.f48259a;
        Intent intent = launchActivity.K0;
        if (intent != null) {
            launchActivity.W(intent, launchActivity.L0, launchActivity.M0, true, null, false, true);
            launchActivity.K0 = null;
        }
        launchActivity.f43104p0.getView().setVisibility(0);
        launchActivity.f43104p0.X(true, true);
        ActionBarLayout actionBarLayout = launchActivity.f43104p0;
        org.telegram.ui.ActionBar.g2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment != null) {
            lastFragment.setTitleOverlayText(actionBarLayout.N0, actionBarLayout.O0, actionBarLayout.P0);
        }
        if (org.telegram.messenger.g0.Q1()) {
            ActionBarLayout actionBarLayout2 = launchActivity.f43106q0;
            if (actionBarLayout2 != null) {
                actionBarLayout2.X(true, true);
                if (launchActivity.f43106q0.getView().getVisibility() == 4) {
                    launchActivity.f43106q0.getView().setVisibility(0);
                }
            }
            ActionBarLayout actionBarLayout3 = launchActivity.f43108r0;
            if (actionBarLayout3 != null) {
                actionBarLayout3.X(true, true);
                launchActivity.f43108r0.getView().setVisibility(0);
            }
        }
        org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.f25318o0, qc0Var);
        try {
            org.telegram.messenger.ys.t(org.telegram.messenger.k10.f24932t0).Y();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
