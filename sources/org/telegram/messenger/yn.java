package org.telegram.messenger;

import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ThemeActivity;
public final class yn implements Runnable {
    public final int f19604a;
    public final org.telegram.ui.ActionBar.k2 f19605b;

    public yn(int i10, org.telegram.ui.ActionBar.k2 k2Var) {
        this.f19604a = i10;
        this.f19605b = k2Var;
    }

    @Override
    public final void run() {
        switch (this.f19604a) {
            case 0:
                org.telegram.ui.ActionBar.k2 k2Var = this.f19605b;
                if (k2Var != null) {
                    ThemeActivity themeActivity = new ThemeActivity(0);
                    themeActivity.T0 = true;
                    k2Var.presentFragment(themeActivity);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.s4.s0(7, this.f19605b, null);
                return;
            case 2:
                org.telegram.ui.Components.s4.s0(8, this.f19605b, null);
                return;
            default:
                this.f19605b.presentFragment(new PremiumPreviewFragment(0, "summarize_limit"));
                return;
        }
    }
}
