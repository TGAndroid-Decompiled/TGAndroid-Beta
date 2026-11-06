package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ThemeActivity;
public final class dd implements Runnable {
    public final int f32815a;
    public final org.telegram.ui.ActionBar.f2 f32816b;

    public dd(int i7, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f32815a = i7;
        this.f32816b = f2Var;
    }

    @Override
    public final void run() {
        int i7 = this.f32815a;
        org.telegram.ui.ActionBar.f2 f2Var = this.f32816b;
        switch (i7) {
            case 0:
                int i10 = ChatActivityEnterView.s5;
                if (f2Var != null) {
                    new ug.w0(f2Var, 11, false).show();
                    return;
                } else if (f2Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) f2Var.getContext()).t0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                f2Var.presentFragment(new StickersActivity(0, null));
                return;
            default:
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                f2Var.presentFragment(themeActivity);
                return;
        }
    }
}
