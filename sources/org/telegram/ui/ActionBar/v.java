package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
public final class v implements Runnable {
    public final boolean f19792a;
    public final n2 f19793b;
    public final n2 f19794c;
    public final boolean d;
    public final ActionBarLayout e;

    public v(ActionBarLayout actionBarLayout, boolean z10, n2 n2Var, n2 n2Var2, boolean z11) {
        this.e = actionBarLayout;
        this.f19792a = z10;
        this.f19793b = n2Var;
        this.f19794c = n2Var2;
        this.d = z11;
    }

    @Override
    public final void run() {
        ActionBarLayout actionBarLayout = this.e;
        if (actionBarLayout.d == this) {
            actionBarLayout.d = null;
            if (this.f19792a) {
                n2 n2Var = this.f19793b;
                if (n2Var != null) {
                    n2Var.onTransitionAnimationStart(false, false);
                }
                this.f19794c.onTransitionAnimationStart(true, false);
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
