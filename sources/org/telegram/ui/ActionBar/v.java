package org.telegram.ui.ActionBar;
public final class v implements Runnable {
    public final boolean f30085a;
    public final h2 f30086b;
    public final h2 f30087c;
    public final boolean d;
    public final ActionBarLayout f30088e;

    public v(ActionBarLayout actionBarLayout, boolean z10, h2 h2Var, h2 h2Var2, boolean z11) {
        this.f30088e = actionBarLayout;
        this.f30085a = z10;
        this.f30086b = h2Var;
        this.f30087c = h2Var2;
        this.d = z11;
    }

    @Override
    public final void run() {
        ActionBarLayout actionBarLayout = this.f30088e;
        if (actionBarLayout.d == this) {
            actionBarLayout.d = null;
            if (this.f30085a) {
                h2 h2Var = this.f30086b;
                if (h2Var != null) {
                    h2Var.onTransitionAnimationStart(false, false);
                }
                this.f30087c.onTransitionAnimationStart(true, false);
                actionBarLayout.h0(true, true, this.d);
                return;
            }
            Runnable runnable = actionBarLayout.f28688e;
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
                if (actionBarLayout.Y0) {
                    actionBarLayout.f28688e.run();
                } else {
                    org.telegram.messenger.g0.h3(actionBarLayout.f28688e, 200L);
                }
            }
        }
    }
}
