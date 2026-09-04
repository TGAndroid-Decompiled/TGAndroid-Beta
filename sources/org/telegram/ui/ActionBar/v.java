package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
public final class v implements Runnable {
    public final boolean f21372a;
    public final n2 f21373b;
    public final n2 f21374c;
    public final boolean d;
    public final ActionBarLayout f21375e;

    public v(ActionBarLayout actionBarLayout, boolean z10, n2 n2Var, n2 n2Var2, boolean z11) {
        this.f21375e = actionBarLayout;
        this.f21372a = z10;
        this.f21373b = n2Var;
        this.f21374c = n2Var2;
        this.d = z11;
    }

    @Override
    public final void run() {
        ActionBarLayout actionBarLayout = this.f21375e;
        if (actionBarLayout.d == this) {
            actionBarLayout.d = null;
            if (this.f21372a) {
                n2 n2Var = this.f21373b;
                if (n2Var != null) {
                    n2Var.onTransitionAnimationStart(false, false);
                }
                this.f21374c.onTransitionAnimationStart(true, false);
                actionBarLayout.d0(true, true, this.d);
                return;
            }
            Runnable runnable = actionBarLayout.f20148e;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                if (actionBarLayout.R0) {
                    actionBarLayout.f20148e.run();
                } else {
                    AndroidUtilities.runOnUIThread(actionBarLayout.f20148e, 200L);
                }
            }
        }
    }
}
