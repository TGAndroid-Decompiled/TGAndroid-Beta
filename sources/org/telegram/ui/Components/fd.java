package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ThemeActivity;

public final class fd implements Runnable {

    public final int f28375a;

    public final org.telegram.ui.ActionBar.n2 f28376b;

    public fd(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f28375a = i10;
        this.f28376b = n2Var;
    }

    @Override
    public final void run() {
        int i10 = this.f28375a;
        org.telegram.ui.ActionBar.n2 n2Var = this.f28376b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f26070i5;
                if (n2Var != null) {
                    new ag.g2(n2Var, 11, false).show();
                } else if (n2Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) n2Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                }
                break;
            case 1:
                n2Var.presentFragment(new StickersActivity(0, null));
                break;
            default:
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.P0 = true;
                n2Var.presentFragment(themeActivity);
                break;
        }
    }
}
