package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l8 extends AnimatorListenerAdapter {
    public final int f28679a;
    public final w8 f28680b;

    public l8(w8 w8Var, int i10) {
        this.f28679a = i10;
        this.f28680b = w8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f28679a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f28680b.f32679f = false;
                return;
            default:
                w8 w8Var = this.f28680b;
                if (w8Var.C) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                w8Var.i0(f10, false);
                w8Var.C = false;
                return;
        }
    }
}
