package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k1 extends AnimatorListenerAdapter {
    public final int f39271a;
    public final float f39272b;
    public final float f39273c;
    public final Object d;

    public k1(Object obj, float f10, float f11, int i7) {
        this.f39271a = i7;
        this.d = obj;
        this.f39272b = f10;
        this.f39273c = f11;
    }

    public void a() {
        te.c cVar = (te.c) this.d;
        if (cVar.h) {
            cVar.d(this.f39272b + this.f39273c, 1.0f);
            if (cVar.h) {
                cVar.h = false;
            }
            cVar.f55398b.F(cVar.f55401f, cVar.f55397a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f39271a) {
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
        switch (this.f39271a) {
            case 0:
                n1 n1Var = (n1) this.d;
                n1Var.O = false;
                n1Var.M = true;
                n1Var.W = this.f39272b;
                n1Var.f39340a0 = this.f39273c;
                n1Var.requestLayout();
                return;
            default:
                a();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f39271a) {
            case 1:
                ((te.c) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
