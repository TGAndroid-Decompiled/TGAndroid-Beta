package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
public final class u implements Runnable {
    public final boolean f21304a;
    public final m2 f21305b;
    public final m2 f21306c;
    public final boolean d;
    public final ActionBarLayout f21307e;

    public u(ActionBarLayout actionBarLayout, boolean z10, m2 m2Var, m2 m2Var2, boolean z11) {
        this.f21307e = actionBarLayout;
        this.f21304a = z10;
        this.f21305b = m2Var;
        this.f21306c = m2Var2;
        this.d = z11;
    }

    @Override
    public final void run() {
        ActionBarLayout actionBarLayout = this.f21307e;
        if (actionBarLayout.d == this) {
            actionBarLayout.d = null;
            if (this.f21304a) {
                m2 m2Var = this.f21305b;
                if (m2Var != null) {
                    m2Var.onTransitionAnimationStart(false, false);
                }
                this.f21306c.onTransitionAnimationStart(true, false);
                actionBarLayout.d0(true, true, this.d);
                return;
            }
            Runnable runnable = actionBarLayout.f20092e;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                if (actionBarLayout.R0) {
                    actionBarLayout.f20092e.run();
                } else {
                    AndroidUtilities.runOnUIThread(actionBarLayout.f20092e, 200L);
                }
            }
        }
    }
}
