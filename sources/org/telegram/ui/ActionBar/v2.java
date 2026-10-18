package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class v2 implements Runnable {
    public final int f21780a;
    public final Object f21781b;

    public v2(Object obj, int i10) {
        this.f21780a = i10;
        this.f21781b = obj;
    }

    @Override
    public final void run() {
        switch (this.f21780a) {
            case 0:
                f3 f3Var = (f3) this.f21781b;
                if (f3Var.startAnimationRunnable == this && !f3.access$000(f3Var)) {
                    f3Var.startAnimationRunnable = null;
                    f3.access$2400(f3Var);
                    return;
                }
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f21781b;
                if (actionBarLayout.d == this) {
                    actionBarLayout.d = null;
                    actionBarLayout.d0(false, true, false);
                    return;
                }
                return;
            case 2:
                o1 o1Var = (o1) this.f21781b;
                ValueAnimator valueAnimator = o1Var.f21638m;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    o1Var.f21638m.start();
                    return;
                }
                return;
            default:
                v4 v4Var = (v4) this.f21781b;
                v4Var.k();
                v4Var.j();
                v4Var.f21800f.setAlpha(1.0f);
                return;
        }
    }
}
