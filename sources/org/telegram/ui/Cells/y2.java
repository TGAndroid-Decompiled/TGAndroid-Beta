package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y2 extends AnimatorListenerAdapter {
    public final int f32054a;
    public final z2 f32055b;

    public y2(z2 z2Var, int i7) {
        this.f32054a = i7;
        this.f32055b = z2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32054a) {
            case 0:
                z2 z2Var = this.f32055b;
                Runnable runnable = z2Var.f32100b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == z2Var.f32102e) {
                    z2Var.f32102e = null;
                    return;
                }
                return;
            default:
                z2 z2Var2 = this.f32055b;
                Runnable runnable2 = z2Var2.f32100b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (animator == z2Var2.f32102e) {
                    z2Var2.f32102e = null;
                    return;
                }
                return;
        }
    }
}
