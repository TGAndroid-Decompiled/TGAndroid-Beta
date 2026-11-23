package org.telegram.ui.ActionBar;
public final class u implements Runnable {
    public final boolean f30130a;
    public final g2 f30131b;
    public final g2 f30132c;
    public final boolean d;
    public final ActionBarLayout f30133e;

    public u(ActionBarLayout actionBarLayout, boolean z10, g2 g2Var, g2 g2Var2, boolean z11) {
        this.f30133e = actionBarLayout;
        this.f30130a = z10;
        this.f30131b = g2Var;
        this.f30132c = g2Var2;
        this.d = z11;
    }

    @Override
    public final void run() {
        ActionBarLayout actionBarLayout = this.f30133e;
        if (actionBarLayout.d == this) {
            actionBarLayout.d = null;
            if (this.f30130a) {
                g2 g2Var = this.f30131b;
                if (g2Var != null) {
                    g2Var.onTransitionAnimationStart(false, false);
                }
                this.f30132c.onTransitionAnimationStart(true, false);
                actionBarLayout.h0(true, true, this.d);
                return;
            }
            Runnable runnable = actionBarLayout.f28779e;
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
                if (actionBarLayout.Y0) {
                    actionBarLayout.f28779e.run();
                } else {
                    org.telegram.messenger.g0.h3(actionBarLayout.f28779e, 200L);
                }
            }
        }
    }
}
