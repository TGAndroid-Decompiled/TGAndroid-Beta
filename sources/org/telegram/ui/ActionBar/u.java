package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
public final class u implements Runnable {
    public final boolean f21724a;
    public final n2 f21725b;
    public final n2 f21726c;
    public final boolean d;
    public final ActionBarLayout e;

    public u(ActionBarLayout actionBarLayout, boolean z10, n2 n2Var, n2 n2Var2, boolean z11) {
        this.e = actionBarLayout;
        this.f21724a = z10;
        this.f21725b = n2Var;
        this.f21726c = n2Var2;
        this.d = z11;
    }

    @Override
    public final void run() {
        ActionBarLayout actionBarLayout = this.e;
        if (actionBarLayout.d == this) {
            actionBarLayout.d = null;
            if (this.f21724a) {
                n2 n2Var = this.f21725b;
                if (n2Var != null) {
                    n2Var.onTransitionAnimationStart(false, false);
                }
                this.f21726c.onTransitionAnimationStart(true, false);
                actionBarLayout.d0(true, true, this.d);
                return;
            }
            Runnable runnable = actionBarLayout.e;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                if (actionBarLayout.R0) {
                    actionBarLayout.e.run();
                } else {
                    AndroidUtilities.runOnUIThread(actionBarLayout.e, 200L);
                }
            }
        }
    }
}
