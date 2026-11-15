package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yw0 extends AnimatorListenerAdapter {
    public final int f42171a;
    public final Switch f42172b;

    public yw0(Switch r12, int i7) {
        this.f42171a = i7;
        this.f42172b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42171a) {
            case 0:
                this.f42172b.d = null;
                return;
            default:
                this.f42172b.f32739e = null;
                return;
        }
    }
}
