package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q0 extends AnimatorListenerAdapter {
    public final int f39660a;
    public final Runnable f39661b;

    public q0(int i10, Runnable runnable) {
        this.f39660a = i10;
        this.f39661b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39660a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f39661b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f39661b.run();
                return;
        }
    }
}
