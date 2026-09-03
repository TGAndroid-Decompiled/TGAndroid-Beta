package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
public final class u implements Runnable {
    public final boolean f22294a;
    public final p2 f22295b;
    public final p2 f22296c;
    public final boolean d;
    public final ActionBarLayout f22297e;

    public u(ActionBarLayout actionBarLayout, boolean z4, p2 p2Var, p2 p2Var2, boolean z10) {
        this.f22297e = actionBarLayout;
        this.f22294a = z4;
        this.f22295b = p2Var;
        this.f22296c = p2Var2;
        this.d = z10;
    }

    @Override
    public final void run() {
        ActionBarLayout actionBarLayout = this.f22297e;
        if (actionBarLayout.d == this) {
            actionBarLayout.d = null;
            if (this.f22294a) {
                p2 p2Var = this.f22295b;
                if (p2Var != null) {
                    p2Var.onTransitionAnimationStart(false, false);
                }
                this.f22296c.onTransitionAnimationStart(true, false);
                actionBarLayout.d0(true, true, this.d);
                return;
            }
            Runnable runnable = actionBarLayout.f21121e;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                if (actionBarLayout.O0) {
                    actionBarLayout.f21121e.run();
                } else {
                    AndroidUtilities.runOnUIThread(actionBarLayout.f21121e, 200L);
                }
            }
        }
    }
}
