package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
public final class w implements Runnable {
    public final boolean f19833a;
    public final o2 f19834b;
    public final o2 f19835c;
    public final boolean d;
    public final ActionBarLayout e;

    public w(ActionBarLayout actionBarLayout, boolean z10, o2 o2Var, o2 o2Var2, boolean z11) {
        this.e = actionBarLayout;
        this.f19833a = z10;
        this.f19834b = o2Var;
        this.f19835c = o2Var2;
        this.d = z11;
    }

    @Override
    public final void run() {
        ActionBarLayout actionBarLayout = this.e;
        if (actionBarLayout.d == this) {
            actionBarLayout.d = null;
            if (this.f19833a) {
                o2 o2Var = this.f19834b;
                if (o2Var != null) {
                    o2Var.onTransitionAnimationStart(false, false);
                }
                this.f19835c.onTransitionAnimationStart(true, false);
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
