package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class w2 implements Runnable {
    public final int f21937a;
    public final Object f21938b;

    public w2(Object obj, int i10) {
        this.f21937a = i10;
        this.f21938b = obj;
    }

    @Override
    public final void run() {
        switch (this.f21937a) {
            case 0:
                h3 h3Var = (h3) this.f21938b;
                if (h3Var.startAnimationRunnable == this && !h3.access$100(h3Var)) {
                    h3Var.startAnimationRunnable = null;
                    h3.access$2500(h3Var);
                    return;
                }
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f21938b;
                if (actionBarLayout.d == this) {
                    actionBarLayout.d = null;
                    actionBarLayout.f0(false, true, false);
                    return;
                }
                return;
            case 2:
                o1 o1Var = (o1) this.f21938b;
                ValueAnimator valueAnimator = o1Var.f21727m;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    o1Var.f21727m.start();
                    return;
                }
                return;
            default:
                y4 y4Var = (y4) this.f21938b;
                y4Var.k();
                y4Var.j();
                y4Var.f21994f.setAlpha(1.0f);
                return;
        }
    }
}
