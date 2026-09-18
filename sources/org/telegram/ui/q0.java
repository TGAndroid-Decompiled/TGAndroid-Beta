package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q0 extends AnimatorListenerAdapter {
    public final int f36649a;
    public final Runnable f36650b;

    public q0(int i10, Runnable runnable) {
        this.f36649a = i10;
        this.f36650b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36649a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f36650b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f36650b.run();
                return;
        }
    }
}
