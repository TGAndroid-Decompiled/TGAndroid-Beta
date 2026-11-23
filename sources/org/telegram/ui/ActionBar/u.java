package org.telegram.ui.ActionBar;
public final class u implements Runnable {
    public final boolean f30071a;
    public final g2 f30072b;
    public final g2 f30073c;
    public final boolean d;
    public final ActionBarLayout f30074e;

    public u(ActionBarLayout actionBarLayout, boolean z10, g2 g2Var, g2 g2Var2, boolean z11) {
        this.f30074e = actionBarLayout;
        this.f30071a = z10;
        this.f30072b = g2Var;
        this.f30073c = g2Var2;
        this.d = z11;
    }

    @Override
    public final void run() {
        ActionBarLayout actionBarLayout = this.f30074e;
        if (actionBarLayout.d == this) {
            actionBarLayout.d = null;
            if (this.f30071a) {
                g2 g2Var = this.f30072b;
                if (g2Var != null) {
                    g2Var.onTransitionAnimationStart(false, false);
                }
                this.f30073c.onTransitionAnimationStart(true, false);
                actionBarLayout.h0(true, true, this.d);
                return;
            }
            Runnable runnable = actionBarLayout.f28721e;
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
                if (actionBarLayout.Y0) {
                    actionBarLayout.f28721e.run();
                } else {
                    org.telegram.messenger.g0.h3(actionBarLayout.f28721e, 200L);
                }
            }
        }
    }
}
