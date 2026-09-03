package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
public final class u implements Runnable {
    public final boolean f20559a;
    public final p2 f20560b;
    public final p2 f20561c;
    public final boolean d;
    public final ActionBarLayout e;

    public u(ActionBarLayout actionBarLayout, boolean z4, p2 p2Var, p2 p2Var2, boolean z10) {
        this.e = actionBarLayout;
        this.f20559a = z4;
        this.f20560b = p2Var;
        this.f20561c = p2Var2;
        this.d = z10;
    }

    @Override
    public final void run() {
        ActionBarLayout actionBarLayout = this.e;
        if (actionBarLayout.d == this) {
            actionBarLayout.d = null;
            if (this.f20559a) {
                p2 p2Var = this.f20560b;
                if (p2Var != null) {
                    p2Var.onTransitionAnimationStart(false, false);
                }
                this.f20561c.onTransitionAnimationStart(true, false);
                actionBarLayout.d0(true, true, this.d);
                return;
            }
            Runnable runnable = actionBarLayout.e;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                if (actionBarLayout.O0) {
                    actionBarLayout.e.run();
                } else {
                    AndroidUtilities.runOnUIThread(actionBarLayout.e, 200L);
                }
            }
        }
    }
}
