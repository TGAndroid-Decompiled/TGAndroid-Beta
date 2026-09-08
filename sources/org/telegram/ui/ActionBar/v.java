package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
public final class v implements Runnable {
    public final boolean f21399a;
    public final n2 f21400b;
    public final n2 f21401c;
    public final boolean d;
    public final ActionBarLayout f21402e;

    public v(ActionBarLayout actionBarLayout, boolean z10, n2 n2Var, n2 n2Var2, boolean z11) {
        this.f21402e = actionBarLayout;
        this.f21399a = z10;
        this.f21400b = n2Var;
        this.f21401c = n2Var2;
        this.d = z11;
    }

    @Override
    public final void run() {
        ActionBarLayout actionBarLayout = this.f21402e;
        if (actionBarLayout.d == this) {
            actionBarLayout.d = null;
            if (this.f21399a) {
                n2 n2Var = this.f21400b;
                if (n2Var != null) {
                    n2Var.onTransitionAnimationStart(false, false);
                }
                this.f21401c.onTransitionAnimationStart(true, false);
                actionBarLayout.d0(true, true, this.d);
                return;
            }
            Runnable runnable = actionBarLayout.f20175e;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                if (actionBarLayout.R0) {
                    actionBarLayout.f20175e.run();
                } else {
                    AndroidUtilities.runOnUIThread(actionBarLayout.f20175e, 200L);
                }
            }
        }
    }
}
