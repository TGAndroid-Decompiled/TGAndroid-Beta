package org.telegram.ui.ActionBar;
public final class v implements Runnable {
    public final boolean f28603a;
    public final f2 f28604b;
    public final f2 f28605c;
    public final boolean d;
    public final ActionBarLayout f28606e;

    public v(ActionBarLayout actionBarLayout, boolean z9, f2 f2Var, f2 f2Var2, boolean z10) {
        this.f28606e = actionBarLayout;
        this.f28603a = z9;
        this.f28604b = f2Var;
        this.f28605c = f2Var2;
        this.d = z10;
    }

    @Override
    public final void run() {
        ActionBarLayout actionBarLayout = this.f28606e;
        if (actionBarLayout.d == this) {
            actionBarLayout.d = null;
            if (this.f28603a) {
                f2 f2Var = this.f28604b;
                if (f2Var != null) {
                    f2Var.onTransitionAnimationStart(false, false);
                }
                this.f28605c.onTransitionAnimationStart(true, false);
                actionBarLayout.h0(true, true, this.d);
                return;
            }
            Runnable runnable = actionBarLayout.f27237e;
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
                if (actionBarLayout.X0) {
                    actionBarLayout.f27237e.run();
                } else {
                    org.telegram.messenger.g0.i3(actionBarLayout.f27237e, 200L);
                }
            }
        }
    }
}
