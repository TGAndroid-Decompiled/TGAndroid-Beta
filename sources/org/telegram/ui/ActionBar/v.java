package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
public final class v implements Runnable {
    public final boolean f23142a;
    public final r2 f23143b;
    public final r2 f23144c;
    public final boolean d;
    public final ActionBarLayout e;

    public v(ActionBarLayout actionBarLayout, boolean z10, r2 r2Var, r2 r2Var2, boolean z11) {
        this.e = actionBarLayout;
        this.f23142a = z10;
        this.f23143b = r2Var;
        this.f23144c = r2Var2;
        this.d = z11;
    }

    @Override
    public final void run() {
        ActionBarLayout actionBarLayout = this.e;
        if (actionBarLayout.d == this) {
            actionBarLayout.d = null;
            if (this.f23142a) {
                r2 r2Var = this.f23143b;
                if (r2Var != null) {
                    r2Var.onTransitionAnimationStart(false, false);
                }
                this.f23144c.onTransitionAnimationStart(true, false);
                actionBarLayout.g0(true, true, this.d);
                return;
            }
            Runnable runnable = actionBarLayout.e;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                if (actionBarLayout.X0) {
                    actionBarLayout.e.run();
                } else {
                    AndroidUtilities.runOnUIThread(actionBarLayout.e, 200L);
                }
            }
        }
    }
}
