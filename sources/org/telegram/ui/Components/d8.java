package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d8 extends AnimatorListenerAdapter {
    public final int f25362a;
    public final o8 f25363b;

    public d8(o8 o8Var, int i10) {
        this.f25362a = i10;
        this.f25363b = o8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f25362a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f25363b.f28992f = false;
                return;
            default:
                o8 o8Var = this.f25363b;
                if (o8Var.F) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                o8Var.m0(false, f7);
                o8Var.F = false;
                return;
        }
    }
}
