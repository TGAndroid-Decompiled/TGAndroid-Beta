package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ThemeActivity;
public final class md implements Runnable {
    public final int f30664a;
    public final org.telegram.ui.ActionBar.o2 f30665b;

    public md(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f30664a = i10;
        this.f30665b = o2Var;
    }

    @Override
    public final void run() {
        int i10 = this.f30664a;
        org.telegram.ui.ActionBar.o2 o2Var = this.f30665b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f26085i5;
                if (o2Var != null) {
                    new cg.p1(o2Var, 11, false).show();
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
                themeActivity.P0 = true;
                o2Var.presentFragment(themeActivity);
                return;
        }
    }
}
