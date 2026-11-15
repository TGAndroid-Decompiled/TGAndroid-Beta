package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ThemeActivity;
public final class bd implements Runnable {
    public final int f33248a;
    public final org.telegram.ui.ActionBar.e2 f33249b;

    public bd(int i7, org.telegram.ui.ActionBar.e2 e2Var) {
        this.f33248a = i7;
        this.f33249b = e2Var;
    }

    @Override
    public final void run() {
        int i7 = this.f33248a;
        org.telegram.ui.ActionBar.e2 e2Var = this.f33249b;
        switch (i7) {
            case 0:
                int i10 = ChatActivityEnterView.N6;
                if (e2Var != null) {
                    new ug.x0(e2Var, 11, false).show();
                    return;
                } else if (e2Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) e2Var.getContext()).t0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                e2Var.presentFragment(new StickersActivity(0, null));
                return;
            default:
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.V0 = true;
                e2Var.presentFragment(themeActivity);
                return;
        }
    }
}
