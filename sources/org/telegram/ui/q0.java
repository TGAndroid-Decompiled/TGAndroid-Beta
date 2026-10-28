package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q0 extends AnimatorListenerAdapter {
    public final int f42553a;
    public final Runnable f42554b;

    public q0(int i10, Runnable runnable) {
        this.f42553a = i10;
        this.f42554b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42553a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f42554b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f42554b.run();
                return;
        }
    }
}
