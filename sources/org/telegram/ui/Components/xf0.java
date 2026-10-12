package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xf0 extends AnimatorListenerAdapter {
    public final int f32752a;
    public final zf0 f32753b;

    public xf0(zf0 zf0Var, int i10) {
        this.f32752a = i10;
        this.f32753b = zf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32752a) {
            case 0:
                this.f32753b.f33348s = null;
                return;
            default:
                this.f32753b.v = null;
                return;
        }
    }
}
