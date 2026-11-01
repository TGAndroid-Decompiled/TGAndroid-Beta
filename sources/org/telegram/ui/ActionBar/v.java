package org.telegram.ui.ActionBar;
public final class v implements Runnable {
    public final boolean f21399a;
    public final k2 f21400b;
    public final k2 f21401c;
    public final boolean d;
    public final ActionBarLayout e;

    public v(ActionBarLayout actionBarLayout, boolean z10, k2 k2Var, k2 k2Var2, boolean z11) {
        this.e = actionBarLayout;
        this.f21399a = z10;
        this.f21400b = k2Var;
        this.f21401c = k2Var2;
        this.d = z11;
    }

    @Override
    public final void run() {
        ActionBarLayout actionBarLayout = this.e;
        if (actionBarLayout.d == this) {
            actionBarLayout.d = null;
            if (this.f21399a) {
                k2 k2Var = this.f21400b;
                if (k2Var != null) {
                    k2Var.onTransitionAnimationStart(false, false);
                }
                this.f21401c.onTransitionAnimationStart(true, false);
                actionBarLayout.g0(true, true, this.d);
                return;
            }
            Runnable runnable = actionBarLayout.e;
            if (runnable != null) {
                org.telegram.messenger.i0.r(runnable);
                if (actionBarLayout.X0) {
                    actionBarLayout.e.run();
                } else {
                    org.telegram.messenger.i0.h3(actionBarLayout.e, 200L);
                }
            }
        }
    }
}
