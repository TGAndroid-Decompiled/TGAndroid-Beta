package org.telegram.ui.ActionBar;
public final class v implements Runnable {
    public final boolean f28607a;
    public final f2 f28608b;
    public final f2 f28609c;
    public final boolean d;
    public final ActionBarLayout f28610e;

    public v(ActionBarLayout actionBarLayout, boolean z9, f2 f2Var, f2 f2Var2, boolean z10) {
        this.f28610e = actionBarLayout;
        this.f28607a = z9;
        this.f28608b = f2Var;
        this.f28609c = f2Var2;
        this.d = z10;
    }

    @Override
    public final void run() {
        ActionBarLayout actionBarLayout = this.f28610e;
        if (actionBarLayout.d == this) {
            actionBarLayout.d = null;
            if (this.f28607a) {
                f2 f2Var = this.f28608b;
                if (f2Var != null) {
                    f2Var.onTransitionAnimationStart(false, false);
                }
                this.f28609c.onTransitionAnimationStart(true, false);
                actionBarLayout.h0(true, true, this.d);
                return;
            }
            Runnable runnable = actionBarLayout.f27245e;
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
                if (actionBarLayout.X0) {
                    actionBarLayout.f27245e.run();
                } else {
                    org.telegram.messenger.g0.i3(actionBarLayout.f27245e, 200L);
                }
            }
        }
    }
}
