package org.telegram.ui.ActionBar;
public final class v implements Runnable {
    public final boolean f30087a;
    public final h2 f30088b;
    public final h2 f30089c;
    public final boolean d;
    public final ActionBarLayout f30090e;

    public v(ActionBarLayout actionBarLayout, boolean z10, h2 h2Var, h2 h2Var2, boolean z11) {
        this.f30090e = actionBarLayout;
        this.f30087a = z10;
        this.f30088b = h2Var;
        this.f30089c = h2Var2;
        this.d = z11;
    }

    @Override
    public final void run() {
        ActionBarLayout actionBarLayout = this.f30090e;
        if (actionBarLayout.d == this) {
            actionBarLayout.d = null;
            if (this.f30087a) {
                h2 h2Var = this.f30088b;
                if (h2Var != null) {
                    h2Var.onTransitionAnimationStart(false, false);
                }
                this.f30089c.onTransitionAnimationStart(true, false);
                actionBarLayout.h0(true, true, this.d);
                return;
            }
            Runnable runnable = actionBarLayout.f28690e;
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
                if (actionBarLayout.Y0) {
                    actionBarLayout.f28690e.run();
                } else {
                    org.telegram.messenger.g0.h3(actionBarLayout.f28690e, 200L);
                }
            }
        }
    }
}
