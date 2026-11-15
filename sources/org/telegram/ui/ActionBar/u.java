package org.telegram.ui.ActionBar;
public final class u implements Runnable {
    public final boolean f29671a;
    public final e2 f29672b;
    public final e2 f29673c;
    public final boolean d;
    public final ActionBarLayout f29674e;

    public u(ActionBarLayout actionBarLayout, boolean z10, e2 e2Var, e2 e2Var2, boolean z11) {
        this.f29674e = actionBarLayout;
        this.f29671a = z10;
        this.f29672b = e2Var;
        this.f29673c = e2Var2;
        this.d = z11;
    }

    @Override
    public final void run() {
        ActionBarLayout actionBarLayout = this.f29674e;
        if (actionBarLayout.d == this) {
            actionBarLayout.d = null;
            if (this.f29671a) {
                e2 e2Var = this.f29672b;
                if (e2Var != null) {
                    e2Var.onTransitionAnimationStart(false, false);
                }
                this.f29673c.onTransitionAnimationStart(true, false);
                actionBarLayout.h0(true, true, this.d);
                return;
            }
            Runnable runnable = actionBarLayout.f28336e;
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
                if (actionBarLayout.Y0) {
                    actionBarLayout.f28336e.run();
                } else {
                    org.telegram.messenger.g0.i3(actionBarLayout.f28336e, 200L);
                }
            }
        }
    }
}
