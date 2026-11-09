package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k1 extends AnimatorListenerAdapter {
    public final int f39416a;
    public final float f39417b;
    public final float f39418c;
    public final Object d;

    public k1(Object obj, float f10, float f11, int i7) {
        this.f39416a = i7;
        this.d = obj;
        this.f39417b = f10;
        this.f39418c = f11;
    }

    public void a() {
        te.c cVar = (te.c) this.d;
        if (cVar.h) {
            cVar.d(this.f39417b + this.f39418c, 1.0f);
            if (cVar.h) {
                cVar.h = false;
            }
            cVar.f55502b.F(cVar.f55505f, cVar.f55501a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f39416a) {
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
        switch (this.f39416a) {
            case 0:
                n1 n1Var = (n1) this.d;
                n1Var.O = false;
                n1Var.M = true;
                n1Var.W = this.f39417b;
                n1Var.f39485a0 = this.f39418c;
                n1Var.requestLayout();
                return;
            default:
                a();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f39416a) {
            case 1:
                ((te.c) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
