package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
public final class u implements Runnable {
    public final boolean f22292a;
    public final p2 f22293b;
    public final p2 f22294c;
    public final boolean d;
    public final ActionBarLayout f22295e;

    public u(ActionBarLayout actionBarLayout, boolean z4, p2 p2Var, p2 p2Var2, boolean z10) {
        this.f22295e = actionBarLayout;
        this.f22292a = z4;
        this.f22293b = p2Var;
        this.f22294c = p2Var2;
        this.d = z10;
    }

    @Override
    public final void run() {
        ActionBarLayout actionBarLayout = this.f22295e;
        if (actionBarLayout.d == this) {
            actionBarLayout.d = null;
            if (this.f22292a) {
                p2 p2Var = this.f22293b;
                if (p2Var != null) {
                    p2Var.onTransitionAnimationStart(false, false);
                }
                this.f22294c.onTransitionAnimationStart(true, false);
                actionBarLayout.d0(true, true, this.d);
                return;
            }
            Runnable runnable = actionBarLayout.f21119e;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                if (actionBarLayout.O0) {
                    actionBarLayout.f21119e.run();
                } else {
                    AndroidUtilities.runOnUIThread(actionBarLayout.f21119e, 200L);
                }
            }
        }
    }
}
