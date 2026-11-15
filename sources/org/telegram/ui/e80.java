package org.telegram.ui;

import android.content.Intent;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class e80 implements org.telegram.ui.Components.dc0, org.telegram.ui.ActionBar.q1 {
    public final LaunchActivity f46629a;

    public e80(LaunchActivity launchActivity) {
        this.f46629a = launchActivity;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        String str = LaunchActivity.C1;
        org.telegram.messenger.np.s1(this.f46629a.P).A3(2);
    }

    @Override
    public void q(org.telegram.ui.Components.fc0 fc0Var) {
        String str = LaunchActivity.C1;
        org.telegram.messenger.gz.C = false;
        LaunchActivity launchActivity = this.f46629a;
        Intent intent = launchActivity.K0;
        if (intent != null) {
            launchActivity.W(intent, launchActivity.L0, launchActivity.M0, true, null, false, true);
            launchActivity.K0 = null;
        }
        launchActivity.f42649p0.getView().setVisibility(0);
        launchActivity.f42649p0.X(true, true);
        ActionBarLayout actionBarLayout = launchActivity.f42649p0;
        org.telegram.ui.ActionBar.e2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment != null) {
            lastFragment.setTitleOverlayText(actionBarLayout.N0, actionBarLayout.O0, actionBarLayout.P0);
        }
        if (org.telegram.messenger.g0.Q1()) {
            ActionBarLayout actionBarLayout2 = launchActivity.f42651q0;
            if (actionBarLayout2 != null) {
                actionBarLayout2.X(true, true);
                if (launchActivity.f42651q0.getView().getVisibility() == 4) {
                    launchActivity.f42651q0.getView().setVisibility(0);
                }
            }
            ActionBarLayout actionBarLayout3 = launchActivity.f42653r0;
            if (actionBarLayout3 != null) {
                actionBarLayout3.X(true, true);
                launchActivity.f42653r0.getView().setVisibility(0);
            }
        }
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25542o0, fc0Var);
        try {
            org.telegram.messenger.at.t(org.telegram.messenger.m10.f24934t0).Y();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
