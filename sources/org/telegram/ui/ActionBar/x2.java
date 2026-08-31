package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class x2 implements Runnable {
    public final int f22403a;
    public final Object f22404b;

    public x2(Object obj, int i10) {
        this.f22403a = i10;
        this.f22404b = obj;
    }

    @Override
    public final void run() {
        switch (this.f22403a) {
            case 0:
                h3 h3Var = (h3) this.f22404b;
                if (h3Var.startAnimationRunnable == this && !h3.access$000(h3Var)) {
                    h3Var.startAnimationRunnable = null;
                    h3.access$2400(h3Var);
                    return;
                }
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f22404b;
                if (actionBarLayout.d == this) {
                    actionBarLayout.d = null;
                    actionBarLayout.d0(false, true, false);
                    return;
                }
                return;
            case 2:
                r1 r1Var = (r1) this.f22404b;
                ValueAnimator valueAnimator = r1Var.f22260m;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    r1Var.f22260m.start();
                    return;
                }
                return;
            default:
                x4 x4Var = (x4) this.f22404b;
                x4Var.k();
                x4Var.j();
                x4Var.f22427f.setAlpha(1.0f);
                return;
        }
    }
}
