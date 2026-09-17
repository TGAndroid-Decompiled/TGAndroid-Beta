package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
public final class v implements Runnable {
    public final boolean f21400a;
    public final n2 f21401b;
    public final n2 f21402c;
    public final boolean d;
    public final ActionBarLayout f21403e;

    public v(ActionBarLayout actionBarLayout, boolean z10, n2 n2Var, n2 n2Var2, boolean z11) {
        this.f21403e = actionBarLayout;
        this.f21400a = z10;
        this.f21401b = n2Var;
        this.f21402c = n2Var2;
        this.d = z11;
    }

    @Override
    public final void run() {
        ActionBarLayout actionBarLayout = this.f21403e;
        if (actionBarLayout.d == this) {
            actionBarLayout.d = null;
            if (this.f21400a) {
                n2 n2Var = this.f21401b;
                if (n2Var != null) {
                    n2Var.onTransitionAnimationStart(false, false);
                }
                this.f21402c.onTransitionAnimationStart(true, false);
                actionBarLayout.d0(true, true, this.d);
                return;
            }
            Runnable runnable = actionBarLayout.f20176e;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                if (actionBarLayout.R0) {
                    actionBarLayout.f20176e.run();
                } else {
                    AndroidUtilities.runOnUIThread(actionBarLayout.f20176e, 200L);
                }
            }
        }
    }
}
