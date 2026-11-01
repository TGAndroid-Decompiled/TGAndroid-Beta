package org.telegram.ui;

import android.content.Intent;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class e90 implements org.telegram.ui.Components.xc0, org.telegram.ui.ActionBar.u1 {
    public final LaunchActivity f36782a;

    public e90(LaunchActivity launchActivity) {
        this.f36782a = launchActivity;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        Pattern pattern = LaunchActivity.D1;
        org.telegram.messenger.wp.r1(this.f36782a.O).x3(2);
    }

    @Override
    public void o(org.telegram.ui.Components.zc0 zc0Var) {
        Pattern pattern = LaunchActivity.D1;
        org.telegram.messenger.uz.C = false;
        LaunchActivity launchActivity = this.f36782a;
        Intent intent = launchActivity.L0;
        if (intent != null) {
            launchActivity.W(intent, launchActivity.M0, launchActivity.N0, true, null, false, true);
            launchActivity.L0 = null;
        }
        launchActivity.f33384q0.getView().setVisibility(0);
        launchActivity.f33384q0.W(true, true);
        ActionBarLayout actionBarLayout = launchActivity.f33384q0;
        org.telegram.ui.ActionBar.k2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment != null) {
            lastFragment.setTitleOverlayText(actionBarLayout.M0, actionBarLayout.N0, actionBarLayout.O0);
        }
        if (org.telegram.messenger.i0.Q1()) {
            ActionBarLayout actionBarLayout2 = launchActivity.f33386r0;
            if (actionBarLayout2 != null) {
                actionBarLayout2.W(true, true);
                if (launchActivity.f33386r0.getView().getVisibility() == 4) {
                    launchActivity.f33386r0.getView().setVisibility(0);
                }
            }
            ActionBarLayout actionBarLayout3 = launchActivity.f33388s0;
            if (actionBarLayout3 != null) {
                actionBarLayout3.W(true, true);
                launchActivity.f33388s0.getView().setVisibility(0);
            }
        }
        org.telegram.messenger.at.e().k(org.telegram.messenger.at.f14755o0, zc0Var);
        try {
            org.telegram.messenger.pt.t(org.telegram.messenger.e20.f15506s0).Y();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
