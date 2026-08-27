package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;

public final class u implements Runnable {

    public final boolean f23809a;

    public final n2 f23810b;

    public final n2 f23811c;
    public final boolean d;

    public final ActionBarLayout f23812e;

    public u(ActionBarLayout actionBarLayout, boolean z10, n2 n2Var, n2 n2Var2, boolean z11) {
        this.f23812e = actionBarLayout;
        this.f23809a = z10;
        this.f23810b = n2Var;
        this.f23811c = n2Var2;
        this.d = z11;
    }

    @Override
    public final void run() {
        ActionBarLayout actionBarLayout = this.f23812e;
        if (actionBarLayout.d != this) {
            return;
        }
        actionBarLayout.d = null;
        if (this.f23809a) {
            n2 n2Var = this.f23810b;
            if (n2Var != null) {
                n2Var.onTransitionAnimationStart(false, false);
            }
            this.f23811c.onTransitionAnimationStart(true, false);
            actionBarLayout.d0(true, true, this.d);
            return;
        }
        Runnable runnable = actionBarLayout.f22655e;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            if (actionBarLayout.N0) {
                actionBarLayout.f22655e.run();
            } else {
                AndroidUtilities.runOnUIThread(actionBarLayout.f22655e, 200L);
            }
        }
    }
}
