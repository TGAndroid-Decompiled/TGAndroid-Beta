package org.telegram.ui.ActionBar;
public final class u implements Runnable {
    public final boolean f30037a;
    public final g2 f30038b;
    public final g2 f30039c;
    public final boolean d;
    public final ActionBarLayout f30040e;

    public u(ActionBarLayout actionBarLayout, boolean z10, g2 g2Var, g2 g2Var2, boolean z11) {
        this.f30040e = actionBarLayout;
        this.f30037a = z10;
        this.f30038b = g2Var;
        this.f30039c = g2Var2;
        this.d = z11;
    }

    @Override
    public final void run() {
        ActionBarLayout actionBarLayout = this.f30040e;
        if (actionBarLayout.d == this) {
            actionBarLayout.d = null;
            if (this.f30037a) {
                g2 g2Var = this.f30038b;
                if (g2Var != null) {
                    g2Var.onTransitionAnimationStart(false, false);
                }
                this.f30039c.onTransitionAnimationStart(true, false);
                actionBarLayout.h0(true, true, this.d);
                return;
            }
            Runnable runnable = actionBarLayout.f28687e;
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
                if (actionBarLayout.Y0) {
                    actionBarLayout.f28687e.run();
                } else {
                    org.telegram.messenger.g0.h3(actionBarLayout.f28687e, 200L);
                }
            }
        }
    }
}
