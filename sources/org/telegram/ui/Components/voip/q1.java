package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q1 extends AnimatorListenerAdapter {
    public final int f33939a;
    public final float f33940b;
    public final float f33941c;
    public final Object d;

    public q1(Object obj, float f9, float f10, int i10) {
        this.f33939a = i10;
        this.d = obj;
        this.f33940b = f9;
        this.f33941c = f10;
    }

    public void a() {
        vd.c cVar = (vd.c) this.d;
        if (cVar.f49512g) {
            cVar.d(this.f33940b + this.f33941c, 1.0f);
            if (cVar.f49512g) {
                cVar.f49512g = false;
            }
            cVar.f49508b.z(cVar.f49510e, cVar.f49507a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f33939a) {
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
        switch (this.f33939a) {
            case 0:
                t1 t1Var = (t1) this.d;
                t1Var.K = false;
                t1Var.I = true;
                t1Var.S = this.f33940b;
                t1Var.T = this.f33941c;
                t1Var.requestLayout();
                return;
            default:
                a();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f33939a) {
            case 1:
                ((vd.c) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
