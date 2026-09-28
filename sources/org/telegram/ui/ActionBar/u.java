package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
public final class u implements Runnable {
    public final boolean f19783a;
    public final m2 f19784b;
    public final m2 f19785c;
    public final boolean d;
    public final ActionBarLayout e;

    public u(ActionBarLayout actionBarLayout, boolean z10, m2 m2Var, m2 m2Var2, boolean z11) {
        this.e = actionBarLayout;
        this.f19783a = z10;
        this.f19784b = m2Var;
        this.f19785c = m2Var2;
        this.d = z11;
    }

    @Override
    public final void run() {
        ActionBarLayout actionBarLayout = this.e;
        if (actionBarLayout.d == this) {
            actionBarLayout.d = null;
            if (this.f19783a) {
                m2 m2Var = this.f19784b;
                if (m2Var != null) {
                    m2Var.onTransitionAnimationStart(false, false);
                }
                this.f19785c.onTransitionAnimationStart(true, false);
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
