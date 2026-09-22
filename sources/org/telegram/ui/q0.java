package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q0 extends AnimatorListenerAdapter {
    public final int f36752a;
    public final Runnable f36753b;

    public q0(int i10, Runnable runnable) {
        this.f36752a = i10;
        this.f36753b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36752a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f36753b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f36753b.run();
                return;
        }
    }
}
