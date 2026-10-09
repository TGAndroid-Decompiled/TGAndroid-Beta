package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ThemeActivity;
public final class wd implements Runnable {
    public final int f32601a;
    public final org.telegram.ui.ActionBar.n2 f32602b;

    public wd(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f32601a = i10;
        this.f32602b = n2Var;
    }

    @Override
    public final void run() {
        int i10 = this.f32601a;
        org.telegram.ui.ActionBar.n2 n2Var = this.f32602b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f23850n5;
                if (n2Var != null) {
                    new rg.y0(n2Var, 11, false).show();
                    return;
                } else if (n2Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) n2Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                n2Var.presentFragment(new StickersActivity(0, null));
                return;
            default:
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                n2Var.presentFragment(themeActivity);
                return;
        }
    }
}
