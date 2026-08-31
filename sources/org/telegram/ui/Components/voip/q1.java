package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q1 extends AnimatorListenerAdapter {
    public final int f32288a;
    public final float f32289b;
    public final float f32290c;
    public final Object d;

    public q1(Object obj, float f10, float f11, int i10) {
        this.f32288a = i10;
        this.d = obj;
        this.f32289b = f10;
        this.f32290c = f11;
    }

    public void a() {
        xd.c cVar = (xd.c) this.d;
        if (cVar.f50511g) {
            cVar.d(this.f32289b + this.f32290c, 1.0f);
            if (cVar.f50511g) {
                cVar.f50511g = false;
            }
            cVar.f50507b.z(cVar.f50509e, cVar.f50506a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f32288a) {
            case 1:
                a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32288a) {
            case 0:
                t1 t1Var = (t1) this.d;
                t1Var.L = false;
                t1Var.J = true;
                t1Var.T = this.f32289b;
                t1Var.U = this.f32290c;
                t1Var.requestLayout();
                return;
            default:
                a();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f32288a) {
            case 1:
                ((xd.c) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
