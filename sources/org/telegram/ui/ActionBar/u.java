package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
public final class u implements Runnable {
    public final boolean f21870a;
    public final o2 f21871b;
    public final o2 f21872c;
    public final boolean d;
    public final ActionBarLayout e;

    public u(ActionBarLayout actionBarLayout, boolean z10, o2 o2Var, o2 o2Var2, boolean z11) {
        this.e = actionBarLayout;
        this.f21870a = z10;
        this.f21871b = o2Var;
        this.f21872c = o2Var2;
        this.d = z11;
    }

    @Override
    public final void run() {
        ActionBarLayout actionBarLayout = this.e;
        if (actionBarLayout.d == this) {
            actionBarLayout.d = null;
            if (this.f21870a) {
                o2 o2Var = this.f21871b;
                if (o2Var != null) {
                    o2Var.onTransitionAnimationStart(false, false);
                }
                this.f21872c.onTransitionAnimationStart(true, false);
                actionBarLayout.f0(true, true, this.d);
                return;
            }
            Runnable runnable = actionBarLayout.e;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                if (actionBarLayout.X0) {
                    actionBarLayout.e.run();
                } else {
                    AndroidUtilities.runOnUIThread(actionBarLayout.e, 200L);
                }
            }
        }
    }
}
