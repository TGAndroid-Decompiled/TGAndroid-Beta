package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
public final class u implements Runnable {
    public final boolean f21529a;
    public final m2 f21530b;
    public final m2 f21531c;
    public final boolean d;
    public final ActionBarLayout f21532e;

    public u(ActionBarLayout actionBarLayout, boolean z10, m2 m2Var, m2 m2Var2, boolean z11) {
        this.f21532e = actionBarLayout;
        this.f21529a = z10;
        this.f21530b = m2Var;
        this.f21531c = m2Var2;
        this.d = z11;
    }

    @Override
    public final void run() {
        ActionBarLayout actionBarLayout = this.f21532e;
        if (actionBarLayout.d == this) {
            actionBarLayout.d = null;
            if (this.f21529a) {
                m2 m2Var = this.f21530b;
                if (m2Var != null) {
                    m2Var.onTransitionAnimationStart(false, false);
                }
                this.f21531c.onTransitionAnimationStart(true, false);
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
