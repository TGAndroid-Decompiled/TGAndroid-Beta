package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ThemeActivity;
public final class bd implements Runnable {
    public final int f32160a;
    public final org.telegram.ui.ActionBar.d2 f32161b;

    public bd(int i3, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f32160a = i3;
        this.f32161b = d2Var;
    }

    @Override
    public final void run() {
        int i3 = this.f32160a;
        org.telegram.ui.ActionBar.d2 d2Var = this.f32161b;
        switch (i3) {
            case 0:
                int i10 = ChatActivityEnterView.f31082t5;
                if (d2Var != null) {
                    new vg.v0(d2Var, 11, false).show();
                    return;
                } else if (d2Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) d2Var.getContext()).t0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                d2Var.presentFragment(new StickersActivity(0, null));
                return;
            default:
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.U0 = true;
                d2Var.presentFragment(themeActivity);
                return;
        }
    }
}
