package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
public final class v implements Runnable {
    public final boolean f18657a;
    public final p2 f18658b;
    public final p2 f18659c;
    public final boolean d;
    public final ActionBarLayout e;

    public v(ActionBarLayout actionBarLayout, boolean z10, p2 p2Var, p2 p2Var2, boolean z11) {
        this.e = actionBarLayout;
        this.f18657a = z10;
        this.f18658b = p2Var;
        this.f18659c = p2Var2;
        this.d = z11;
    }

    @Override
    public final void run() {
        ActionBarLayout actionBarLayout = this.e;
        if (actionBarLayout.d == this) {
            actionBarLayout.d = null;
            if (this.f18657a) {
                p2 p2Var = this.f18658b;
                if (p2Var != null) {
                    p2Var.onTransitionAnimationStart(false, false);
                }
                this.f18659c.onTransitionAnimationStart(true, false);
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
