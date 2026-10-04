package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
public final class v implements Runnable {
    public final boolean f21565a;
    public final n2 f21566b;
    public final n2 f21567c;
    public final boolean d;
    public final ActionBarLayout f21568e;

    public v(ActionBarLayout actionBarLayout, boolean z10, n2 n2Var, n2 n2Var2, boolean z11) {
        this.f21568e = actionBarLayout;
        this.f21565a = z10;
        this.f21566b = n2Var;
        this.f21567c = n2Var2;
        this.d = z11;
    }

    @Override
    public final void run() {
        ActionBarLayout actionBarLayout = this.f21568e;
        if (actionBarLayout.d == this) {
            actionBarLayout.d = null;
            if (this.f21565a) {
                n2 n2Var = this.f21566b;
                if (n2Var != null) {
                    n2Var.onTransitionAnimationStart(false, false);
                }
                this.f21567c.onTransitionAnimationStart(true, false);
                actionBarLayout.d0(true, true, this.d);
                return;
            }
            Runnable runnable = actionBarLayout.f20318e;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                if (actionBarLayout.R0) {
                    actionBarLayout.f20318e.run();
                } else {
                    AndroidUtilities.runOnUIThread(actionBarLayout.f20318e, 200L);
                }
            }
        }
    }
}
