package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q0 extends AnimatorListenerAdapter {
    public final int f39661a;
    public final Runnable f39662b;

    public q0(int i10, Runnable runnable) {
        this.f39661a = i10;
        this.f39662b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39661a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f39662b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f39662b.run();
                return;
        }
    }
}
