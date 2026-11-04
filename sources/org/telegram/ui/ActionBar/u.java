package org.telegram.ui.ActionBar;
public final class u implements Runnable {
    public final boolean f28668a;
    public final d2 f28669b;
    public final d2 f28670c;
    public final boolean d;
    public final ActionBarLayout f28671e;

    public u(ActionBarLayout actionBarLayout, boolean z10, d2 d2Var, d2 d2Var2, boolean z11) {
        this.f28671e = actionBarLayout;
        this.f28668a = z10;
        this.f28669b = d2Var;
        this.f28670c = d2Var2;
        this.d = z11;
    }

    @Override
    public final void run() {
        ActionBarLayout actionBarLayout = this.f28671e;
        if (actionBarLayout.d == this) {
            actionBarLayout.d = null;
            if (this.f28668a) {
                d2 d2Var = this.f28669b;
                if (d2Var != null) {
                    d2Var.onTransitionAnimationStart(false, false);
                }
                this.f28670c.onTransitionAnimationStart(true, false);
                actionBarLayout.h0(true, true, this.d);
                return;
            }
            Runnable runnable = actionBarLayout.f27287e;
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
                if (actionBarLayout.Y0) {
                    actionBarLayout.f27287e.run();
                } else {
                    org.telegram.messenger.g0.i3(actionBarLayout.f27287e, 200L);
                }
            }
        }
    }
}
