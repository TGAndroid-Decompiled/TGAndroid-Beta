package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
public final class v implements Runnable {
    public final boolean f23855a;
    public final o2 f23856b;
    public final o2 f23857c;
    public final boolean d;
    public final ActionBarLayout f23858e;

    public v(ActionBarLayout actionBarLayout, boolean z10, o2 o2Var, o2 o2Var2, boolean z11) {
        this.f23858e = actionBarLayout;
        this.f23855a = z10;
        this.f23856b = o2Var;
        this.f23857c = o2Var2;
        this.d = z11;
    }

    @Override
    public final void run() {
        ActionBarLayout actionBarLayout = this.f23858e;
        if (actionBarLayout.d == this) {
            actionBarLayout.d = null;
            if (this.f23855a) {
                o2 o2Var = this.f23856b;
                if (o2Var != null) {
                    o2Var.onTransitionAnimationStart(false, false);
                }
                this.f23857c.onTransitionAnimationStart(true, false);
                actionBarLayout.d0(true, true, this.d);
                return;
            }
            Runnable runnable = actionBarLayout.f22667e;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                if (actionBarLayout.N0) {
                    actionBarLayout.f22667e.run();
                } else {
                    AndroidUtilities.runOnUIThread(actionBarLayout.f22667e, 200L);
                }
            }
        }
    }
}
