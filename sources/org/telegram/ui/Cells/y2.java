package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y2 extends AnimatorListenerAdapter {
    public final int f32452a;
    public final z2 f32453b;

    public y2(z2 z2Var, int i7) {
        this.f32452a = i7;
        this.f32453b = z2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32452a) {
            case 0:
                z2 z2Var = this.f32453b;
                Runnable runnable = z2Var.f32488b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == z2Var.f32490e) {
                    z2Var.f32490e = null;
                    return;
                }
                return;
            default:
                z2 z2Var2 = this.f32453b;
                Runnable runnable2 = z2Var2.f32488b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (animator == z2Var2.f32490e) {
                    z2Var2.f32490e = null;
                    return;
                }
                return;
        }
    }
}
