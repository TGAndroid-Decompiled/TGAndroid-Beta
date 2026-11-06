package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k1 extends AnimatorListenerAdapter {
    public final int f39292a;
    public final float f39293b;
    public final float f39294c;
    public final Object d;

    public k1(Object obj, float f10, float f11, int i7) {
        this.f39292a = i7;
        this.d = obj;
        this.f39293b = f10;
        this.f39294c = f11;
    }

    public void a() {
        te.c cVar = (te.c) this.d;
        if (cVar.h) {
            cVar.d(this.f39293b + this.f39294c, 1.0f);
            if (cVar.h) {
                cVar.h = false;
            }
            cVar.f55397b.F(cVar.f55400f, cVar.f55396a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f39292a) {
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
        switch (this.f39292a) {
            case 0:
                n1 n1Var = (n1) this.d;
                n1Var.O = false;
                n1Var.M = true;
                n1Var.W = this.f39293b;
                n1Var.f39361a0 = this.f39294c;
                n1Var.requestLayout();
                return;
            default:
                a();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f39292a) {
            case 1:
                ((te.c) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
