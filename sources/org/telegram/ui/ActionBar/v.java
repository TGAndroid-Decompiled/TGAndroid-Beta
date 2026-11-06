package org.telegram.ui.ActionBar;
public final class v implements Runnable {
    public final boolean f28604a;
    public final f2 f28605b;
    public final f2 f28606c;
    public final boolean d;
    public final ActionBarLayout f28607e;

    public v(ActionBarLayout actionBarLayout, boolean z9, f2 f2Var, f2 f2Var2, boolean z10) {
        this.f28607e = actionBarLayout;
        this.f28604a = z9;
        this.f28605b = f2Var;
        this.f28606c = f2Var2;
        this.d = z10;
    }

    @Override
    public final void run() {
        ActionBarLayout actionBarLayout = this.f28607e;
        if (actionBarLayout.d == this) {
            actionBarLayout.d = null;
            if (this.f28604a) {
                f2 f2Var = this.f28605b;
                if (f2Var != null) {
                    f2Var.onTransitionAnimationStart(false, false);
                }
                this.f28606c.onTransitionAnimationStart(true, false);
                actionBarLayout.h0(true, true, this.d);
                return;
            }
            Runnable runnable = actionBarLayout.f27238e;
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
                if (actionBarLayout.X0) {
                    actionBarLayout.f27238e.run();
                } else {
                    org.telegram.messenger.g0.i3(actionBarLayout.f27238e, 200L);
                }
            }
        }
    }
}
