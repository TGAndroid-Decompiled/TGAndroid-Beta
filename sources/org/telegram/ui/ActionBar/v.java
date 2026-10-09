package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
public final class v implements Runnable {
    public final boolean f21573a;
    public final n2 f21574b;
    public final n2 f21575c;
    public final boolean d;
    public final ActionBarLayout f21576e;

    public v(ActionBarLayout actionBarLayout, boolean z10, n2 n2Var, n2 n2Var2, boolean z11) {
        this.f21576e = actionBarLayout;
        this.f21573a = z10;
        this.f21574b = n2Var;
        this.f21575c = n2Var2;
        this.d = z11;
    }

    @Override
    public final void run() {
        ActionBarLayout actionBarLayout = this.f21576e;
        if (actionBarLayout.d == this) {
            actionBarLayout.d = null;
            if (this.f21573a) {
                n2 n2Var = this.f21574b;
                if (n2Var != null) {
                    n2Var.onTransitionAnimationStart(false, false);
                }
                this.f21575c.onTransitionAnimationStart(true, false);
                actionBarLayout.d0(true, true, this.d);
                return;
            }
            Runnable runnable = actionBarLayout.f20324e;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                if (actionBarLayout.R0) {
                    actionBarLayout.f20324e.run();
                } else {
                    AndroidUtilities.runOnUIThread(actionBarLayout.f20324e, 200L);
                }
            }
        }
    }
}
