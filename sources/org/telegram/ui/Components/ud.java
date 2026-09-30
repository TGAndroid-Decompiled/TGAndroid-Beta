package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ThemeActivity;
public final class ud implements Runnable {
    public final int f28797a;
    public final org.telegram.ui.ActionBar.m2 f28798b;

    public ud(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f28797a = i10;
        this.f28798b = m2Var;
    }

    @Override
    public final void run() {
        int i10 = this.f28797a;
        org.telegram.ui.ActionBar.m2 m2Var = this.f28798b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f21954n5;
                if (m2Var != null) {
                    new rg.x0(m2Var, 11, false).show();
                    return;
                } else if (m2Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) m2Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                m2Var.presentFragment(new StickersActivity(0, null));
                return;
            default:
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                m2Var.presentFragment(themeActivity);
                return;
        }
    }
}
