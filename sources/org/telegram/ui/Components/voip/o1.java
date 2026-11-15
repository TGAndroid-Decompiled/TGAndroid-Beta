package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o1 extends AnimatorListenerAdapter {
    public final int f40823a;
    public final float f40824b;
    public final float f40825c;
    public final Object d;

    public o1(Object obj, float f10, float f11, int i7) {
        this.f40823a = i7;
        this.d = obj;
        this.f40824b = f10;
        this.f40825c = f11;
    }

    public void a() {
        te.c cVar = (te.c) this.d;
        if (cVar.h) {
            cVar.d(this.f40824b + this.f40825c, 1.0f);
            if (cVar.h) {
                cVar.h = false;
            }
            cVar.f57084b.E(cVar.f57087f, cVar.f57083a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f40823a) {
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
        switch (this.f40823a) {
            case 0:
                r1 r1Var = (r1) this.d;
                r1Var.P = false;
                r1Var.N = true;
                r1Var.f40895a0 = this.f40824b;
                r1Var.f40897b0 = this.f40825c;
                r1Var.requestLayout();
                return;
            default:
                a();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f40823a) {
            case 1:
                ((te.c) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
