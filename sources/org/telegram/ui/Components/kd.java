package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ThemeActivity;
public final class kd implements Runnable {
    public final int f36703a;
    public final org.telegram.ui.ActionBar.g2 f36704b;

    public kd(int i7, org.telegram.ui.ActionBar.g2 g2Var) {
        this.f36703a = i7;
        this.f36704b = g2Var;
    }

    @Override
    public final void run() {
        int i7 = this.f36703a;
        org.telegram.ui.ActionBar.g2 g2Var = this.f36704b;
        switch (i7) {
            case 0:
                int i10 = ChatActivityEnterView.f32633s7;
                if (g2Var != null) {
                    new ug.y0(g2Var, 11, false).show();
                    return;
                } else if (g2Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) g2Var.getContext()).t0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                g2Var.presentFragment(new StickersActivity(0, null));
                return;
            default:
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.V0 = true;
                g2Var.presentFragment(themeActivity);
                return;
        }
    }
}
