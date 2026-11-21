package org.telegram.ui.ActionBar;
public final class u implements Runnable {
    public final boolean f30068a;
    public final g2 f30069b;
    public final g2 f30070c;
    public final boolean d;
    public final ActionBarLayout f30071e;

    public u(ActionBarLayout actionBarLayout, boolean z10, g2 g2Var, g2 g2Var2, boolean z11) {
        this.f30071e = actionBarLayout;
        this.f30068a = z10;
        this.f30069b = g2Var;
        this.f30070c = g2Var2;
        this.d = z11;
    }

    @Override
    public final void run() {
        ActionBarLayout actionBarLayout = this.f30071e;
        if (actionBarLayout.d == this) {
            actionBarLayout.d = null;
            if (this.f30068a) {
                g2 g2Var = this.f30069b;
                if (g2Var != null) {
                    g2Var.onTransitionAnimationStart(false, false);
                }
                this.f30070c.onTransitionAnimationStart(true, false);
                actionBarLayout.h0(true, true, this.d);
                return;
            }
            Runnable runnable = actionBarLayout.f28718e;
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
                if (actionBarLayout.Y0) {
                    actionBarLayout.f28718e.run();
                } else {
                    org.telegram.messenger.g0.h3(actionBarLayout.f28718e, 200L);
                }
            }
        }
    }
}
