package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class de0 extends AnimatorListenerAdapter {
    public final int f32940a;
    public final ee0 f32941b;

    public de0(ee0 ee0Var, int i7) {
        this.f32940a = i7;
        this.f32941b = ee0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32940a) {
            case 0:
                ee0 ee0Var = this.f32941b;
                ee0Var.h = false;
                ee0Var.f33367a = ee0Var.f33369c;
                ee0Var.invalidate();
                int i7 = ee0Var.J;
                if (i7 >= 0) {
                    ee0Var.b(i7);
                    ee0Var.J = -1;
                    return;
                }
                return;
            default:
                ee0 ee0Var2 = this.f32941b;
                ee0Var2.f33372n = false;
                ee0Var2.h = false;
                ee0Var2.invalidate();
                int i10 = ee0Var2.J;
                if (i10 >= 0) {
                    ee0Var2.b(i10);
                    ee0Var2.J = -1;
                }
                ee0Var2.a();
                return;
        }
    }
}
