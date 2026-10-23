package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ThemeActivity;
public final class sd implements Runnable {
    public final int f30460a;
    public final org.telegram.ui.ActionBar.o2 f30461b;

    public sd(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f30460a = i10;
        this.f30461b = o2Var;
    }

    @Override
    public final void run() {
        int i10 = this.f30460a;
        org.telegram.ui.ActionBar.o2 o2Var = this.f30461b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f24050r5;
                if (o2Var != null) {
                    new sg.y0(o2Var, 11, false).show();
                    return;
                } else if (o2Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) o2Var.getContext()).u0(new PremiumPreviewFragment(0, null));
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
