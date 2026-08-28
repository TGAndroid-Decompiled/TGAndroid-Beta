package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
public final class u implements Runnable {
    public final boolean f23798a;
    public final o2 f23799b;
    public final o2 f23800c;
    public final boolean d;
    public final ActionBarLayout f23801e;

    public u(ActionBarLayout actionBarLayout, boolean z10, o2 o2Var, o2 o2Var2, boolean z11) {
        this.f23801e = actionBarLayout;
        this.f23798a = z10;
        this.f23799b = o2Var;
        this.f23800c = o2Var2;
        this.d = z11;
    }

    @Override
    public final void run() {
        ActionBarLayout actionBarLayout = this.f23801e;
        if (actionBarLayout.d == this) {
            actionBarLayout.d = null;
            if (this.f23798a) {
                o2 o2Var = this.f23799b;
                if (o2Var != null) {
                    o2Var.onTransitionAnimationStart(false, false);
                }
                this.f23800c.onTransitionAnimationStart(true, false);
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
}
