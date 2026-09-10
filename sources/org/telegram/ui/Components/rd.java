package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ThemeActivity;
public final class rd implements Runnable {
    public final int f26653a;
    public final org.telegram.ui.ActionBar.p2 f26654b;

    public rd(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f26653a = i10;
        this.f26654b = p2Var;
    }

    @Override
    public final void run() {
        int i10 = this.f26653a;
        org.telegram.ui.ActionBar.p2 p2Var = this.f26654b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f20816m5;
                if (p2Var != null) {
                    new qg.a1(p2Var, 11, false).show();
                    return;
                } else if (p2Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) p2Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                p2Var.presentFragment(new StickersActivity(0, null));
                return;
            default:
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                p2Var.presentFragment(themeActivity);
                return;
        }
    }
}
