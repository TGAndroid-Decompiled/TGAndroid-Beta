package org.telegram.ui.ActionBar;
public final class v implements Runnable {
    public final boolean f28612a;
    public final f2 f28613b;
    public final f2 f28614c;
    public final boolean d;
    public final ActionBarLayout f28615e;

    public v(ActionBarLayout actionBarLayout, boolean z9, f2 f2Var, f2 f2Var2, boolean z10) {
        this.f28615e = actionBarLayout;
        this.f28612a = z9;
        this.f28613b = f2Var;
        this.f28614c = f2Var2;
        this.d = z10;
    }

    @Override
    public final void run() {
        ActionBarLayout actionBarLayout = this.f28615e;
        if (actionBarLayout.d == this) {
            actionBarLayout.d = null;
            if (this.f28612a) {
                f2 f2Var = this.f28613b;
                if (f2Var != null) {
                    f2Var.onTransitionAnimationStart(false, false);
                }
                this.f28614c.onTransitionAnimationStart(true, false);
                actionBarLayout.h0(true, true, this.d);
                return;
            }
            Runnable runnable = actionBarLayout.f27241e;
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
                if (actionBarLayout.X0) {
                    actionBarLayout.f27241e.run();
                } else {
                    org.telegram.messenger.g0.i3(actionBarLayout.f27241e, 200L);
                }
            }
        }
    }
}
