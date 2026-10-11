package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
public final class u implements Runnable {
    public final boolean f21565a;
    public final m2 f21566b;
    public final m2 f21567c;
    public final boolean d;
    public final ActionBarLayout f21568e;

    public u(ActionBarLayout actionBarLayout, boolean z10, m2 m2Var, m2 m2Var2, boolean z11) {
        this.f21568e = actionBarLayout;
        this.f21565a = z10;
        this.f21566b = m2Var;
        this.f21567c = m2Var2;
        this.d = z11;
    }

    @Override
    public final void run() {
        ActionBarLayout actionBarLayout = this.f21568e;
        if (actionBarLayout.d == this) {
            actionBarLayout.d = null;
            if (this.f21565a) {
                m2 m2Var = this.f21566b;
                if (m2Var != null) {
                    m2Var.onTransitionAnimationStart(false, false);
                }
                this.f21567c.onTransitionAnimationStart(true, false);
                actionBarLayout.d0(true, true, this.d);
                return;
            }
            Runnable runnable = actionBarLayout.f20354e;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                if (actionBarLayout.R0) {
                    actionBarLayout.f20354e.run();
                } else {
                    AndroidUtilities.runOnUIThread(actionBarLayout.f20354e, 200L);
                }
            }
        }
    }
}
