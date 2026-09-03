package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q1 extends AnimatorListenerAdapter {
    public final int f32293a;
    public final float f32294b;
    public final float f32295c;
    public final Object d;

    public q1(Object obj, float f10, float f11, int i10) {
        this.f32293a = i10;
        this.d = obj;
        this.f32294b = f10;
        this.f32295c = f11;
    }

    public void a() {
        xd.c cVar = (xd.c) this.d;
        if (cVar.f50548g) {
            cVar.d(this.f32294b + this.f32295c, 1.0f);
            if (cVar.f50548g) {
                cVar.f50548g = false;
            }
            cVar.f50544b.z(cVar.f50546e, cVar.f50543a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f32293a) {
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
        switch (this.f32293a) {
            case 0:
                t1 t1Var = (t1) this.d;
                t1Var.L = false;
                t1Var.J = true;
                t1Var.T = this.f32294b;
                t1Var.U = this.f32295c;
                t1Var.requestLayout();
                return;
            default:
                a();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f32293a) {
            case 1:
                ((xd.c) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
