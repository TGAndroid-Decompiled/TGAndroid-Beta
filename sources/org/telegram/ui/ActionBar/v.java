package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
public final class v implements Runnable {
    public final boolean f21373a;
    public final n2 f21374b;
    public final n2 f21375c;
    public final boolean d;
    public final ActionBarLayout f21376e;

    public v(ActionBarLayout actionBarLayout, boolean z10, n2 n2Var, n2 n2Var2, boolean z11) {
        this.f21376e = actionBarLayout;
        this.f21373a = z10;
        this.f21374b = n2Var;
        this.f21375c = n2Var2;
        this.d = z11;
    }

    @Override
    public final void run() {
        ActionBarLayout actionBarLayout = this.f21376e;
        if (actionBarLayout.d == this) {
            actionBarLayout.d = null;
            if (this.f21373a) {
                n2 n2Var = this.f21374b;
                if (n2Var != null) {
                    n2Var.onTransitionAnimationStart(false, false);
                }
                this.f21375c.onTransitionAnimationStart(true, false);
                actionBarLayout.d0(true, true, this.d);
                return;
            }
            Runnable runnable = actionBarLayout.f20149e;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                if (actionBarLayout.R0) {
                    actionBarLayout.f20149e.run();
                } else {
                    AndroidUtilities.runOnUIThread(actionBarLayout.f20149e, 200L);
                }
            }
        }
    }
}
