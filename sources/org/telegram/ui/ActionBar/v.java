package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
public final class v implements Runnable {
    public final boolean f21577a;
    public final n2 f21578b;
    public final n2 f21579c;
    public final boolean d;
    public final ActionBarLayout f21580e;

    public v(ActionBarLayout actionBarLayout, boolean z10, n2 n2Var, n2 n2Var2, boolean z11) {
        this.f21580e = actionBarLayout;
        this.f21577a = z10;
        this.f21578b = n2Var;
        this.f21579c = n2Var2;
        this.d = z11;
    }

    @Override
    public final void run() {
        ActionBarLayout actionBarLayout = this.f21580e;
        if (actionBarLayout.d == this) {
            actionBarLayout.d = null;
            if (this.f21577a) {
                n2 n2Var = this.f21578b;
                if (n2Var != null) {
                    n2Var.onTransitionAnimationStart(false, false);
                }
                this.f21579c.onTransitionAnimationStart(true, false);
                actionBarLayout.d0(true, true, this.d);
                return;
            }
            Runnable runnable = actionBarLayout.f20328e;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                if (actionBarLayout.R0) {
                    actionBarLayout.f20328e.run();
                } else {
                    AndroidUtilities.runOnUIThread(actionBarLayout.f20328e, 200L);
                }
            }
        }
    }
}
