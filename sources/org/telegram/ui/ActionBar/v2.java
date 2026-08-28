package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class v2 implements Runnable {
    public final int f23851a;
    public final Object f23852b;

    public v2(Object obj, int i9) {
        this.f23851a = i9;
        this.f23852b = obj;
    }

    @Override
    public final void run() {
        switch (this.f23851a) {
            case 0:
                f3 f3Var = (f3) this.f23852b;
                if (f3Var.startAnimationRunnable == this && !f3.access$000(f3Var)) {
                    f3Var.startAnimationRunnable = null;
                    f3.access$2400(f3Var);
                    return;
                }
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f23852b;
                if (actionBarLayout.d == this) {
                    actionBarLayout.d = null;
                    actionBarLayout.d0(false, true, false);
                    return;
                }
                return;
            case 2:
                q1 q1Var = (q1) this.f23852b;
                ValueAnimator valueAnimator = q1Var.f23724m;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    q1Var.f23724m.start();
                    return;
                }
                return;
            default:
                t4 t4Var = (t4) this.f23852b;
                t4Var.k();
                t4Var.j();
                t4Var.f23774f.setAlpha(1.0f);
                return;
        }
    }
}
