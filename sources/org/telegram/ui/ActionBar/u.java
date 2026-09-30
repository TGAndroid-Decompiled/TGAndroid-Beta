package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
public final class u implements Runnable {
    public final boolean f19800a;
    public final m2 f19801b;
    public final m2 f19802c;
    public final boolean d;
    public final ActionBarLayout e;

    public u(ActionBarLayout actionBarLayout, boolean z10, m2 m2Var, m2 m2Var2, boolean z11) {
        this.e = actionBarLayout;
        this.f19800a = z10;
        this.f19801b = m2Var;
        this.f19802c = m2Var2;
        this.d = z11;
    }

    @Override
    public final void run() {
        ActionBarLayout actionBarLayout = this.e;
        if (actionBarLayout.d == this) {
            actionBarLayout.d = null;
            if (this.f19800a) {
                m2 m2Var = this.f19801b;
                if (m2Var != null) {
                    m2Var.onTransitionAnimationStart(false, false);
                }
                this.f19802c.onTransitionAnimationStart(true, false);
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
