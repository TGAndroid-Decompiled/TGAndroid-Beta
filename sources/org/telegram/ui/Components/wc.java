package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ThemeActivity;
public final class wc implements Runnable {
    public final int f32147a;
    public final org.telegram.ui.ActionBar.k2 f32148b;

    public wc(int i10, org.telegram.ui.ActionBar.k2 k2Var) {
        this.f32147a = i10;
        this.f32148b = k2Var;
    }

    @Override
    public final void run() {
        int i10 = this.f32147a;
        org.telegram.ui.ActionBar.k2 k2Var = this.f32148b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f23672s5;
                if (k2Var != null) {
                    new kg.i1(k2Var, 11, false).show();
                    return;
                } else if (k2Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) k2Var.getContext()).t0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                k2Var.presentFragment(new StickersActivity(0, null));
                return;
            default:
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                k2Var.presentFragment(themeActivity);
                return;
        }
    }
}
