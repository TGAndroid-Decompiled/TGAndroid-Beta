package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
public final class v implements Runnable {
    public final boolean f21569a;
    public final n2 f21570b;
    public final n2 f21571c;
    public final boolean d;
    public final ActionBarLayout f21572e;

    public v(ActionBarLayout actionBarLayout, boolean z10, n2 n2Var, n2 n2Var2, boolean z11) {
        this.f21572e = actionBarLayout;
        this.f21569a = z10;
        this.f21570b = n2Var;
        this.f21571c = n2Var2;
        this.d = z11;
    }

    @Override
    public final void run() {
        ActionBarLayout actionBarLayout = this.f21572e;
        if (actionBarLayout.d == this) {
            actionBarLayout.d = null;
            if (this.f21569a) {
                n2 n2Var = this.f21570b;
                if (n2Var != null) {
                    n2Var.onTransitionAnimationStart(false, false);
                }
                this.f21571c.onTransitionAnimationStart(true, false);
                actionBarLayout.d0(true, true, this.d);
                return;
            }
            Runnable runnable = actionBarLayout.f20322e;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                if (actionBarLayout.R0) {
                    actionBarLayout.f20322e.run();
                } else {
                    AndroidUtilities.runOnUIThread(actionBarLayout.f20322e, 200L);
                }
            }
        }
    }
}
