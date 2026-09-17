package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q0 extends AnimatorListenerAdapter {
    public final int f36766a;
    public final Runnable f36767b;

    public q0(int i10, Runnable runnable) {
        this.f36766a = i10;
        this.f36767b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36766a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f36767b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f36767b.run();
                return;
        }
    }
}
