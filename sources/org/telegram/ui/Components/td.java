package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ThemeActivity;
public final class td implements Runnable {
    public final int f32969a;
    public final org.telegram.ui.ActionBar.r2 f32970b;

    public td(int i10, org.telegram.ui.ActionBar.r2 r2Var) {
        this.f32969a = i10;
        this.f32970b = r2Var;
    }

    @Override
    public final void run() {
        int i10 = this.f32969a;
        org.telegram.ui.ActionBar.r2 r2Var = this.f32970b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f25843r5;
                if (r2Var != null) {
                    new tg.y0(r2Var, 11, false).show();
                    return;
                } else if (r2Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) r2Var.getContext()).u0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                r2Var.presentFragment(new StickersActivity(0, null));
                return;
            default:
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                r2Var.presentFragment(themeActivity);
                return;
        }
    }
}
