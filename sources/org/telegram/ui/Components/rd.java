package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ThemeActivity;
public final class rd implements Runnable {
    public final int f27595a;
    public final org.telegram.ui.ActionBar.o2 f27596b;

    public rd(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f27595a = i10;
        this.f27596b = o2Var;
    }

    @Override
    public final void run() {
        int i10 = this.f27595a;
        org.telegram.ui.ActionBar.o2 o2Var = this.f27596b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f21741m5;
                if (o2Var != null) {
                    new rg.x0(o2Var, 11, false).show();
                    return;
                } else if (o2Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) o2Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                o2Var.presentFragment(new StickersActivity(0, null));
                return;
            default:
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                o2Var.presentFragment(themeActivity);
                return;
        }
    }
}
