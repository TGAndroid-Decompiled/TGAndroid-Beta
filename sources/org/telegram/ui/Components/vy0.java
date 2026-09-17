package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vy0 extends AnimatorListenerAdapter {
    public final int f29429a;
    public final Switch f29430b;

    public vy0(Switch r12, int i10) {
        this.f29429a = i10;
        this.f29430b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29429a) {
            case 0:
                this.f29430b.d = null;
                return;
            default:
                this.f29430b.e = null;
                return;
        }
    }
}
