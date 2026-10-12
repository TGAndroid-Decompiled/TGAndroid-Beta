package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
public final class u implements Runnable {
    public final boolean f21303a;
    public final m2 f21304b;
    public final m2 f21305c;
    public final boolean d;
    public final ActionBarLayout f21306e;

    public u(ActionBarLayout actionBarLayout, boolean z10, m2 m2Var, m2 m2Var2, boolean z11) {
        this.f21306e = actionBarLayout;
        this.f21303a = z10;
        this.f21304b = m2Var;
        this.f21305c = m2Var2;
        this.d = z11;
    }

    @Override
    public final void run() {
        ActionBarLayout actionBarLayout = this.f21306e;
        if (actionBarLayout.d == this) {
            actionBarLayout.d = null;
            if (this.f21303a) {
                m2 m2Var = this.f21304b;
                if (m2Var != null) {
                    m2Var.onTransitionAnimationStart(false, false);
                }
                this.f21305c.onTransitionAnimationStart(true, false);
                actionBarLayout.d0(true, true, this.d);
                return;
            }
            Runnable runnable = actionBarLayout.f20091e;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                if (actionBarLayout.R0) {
                    actionBarLayout.f20091e.run();
                } else {
                    AndroidUtilities.runOnUIThread(actionBarLayout.f20091e, 200L);
                }
            }
        }
    }
}
