package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o1 extends AnimatorListenerAdapter {
    public final int f40826a;
    public final float f40827b;
    public final float f40828c;
    public final Object d;

    public o1(Object obj, float f10, float f11, int i7) {
        this.f40826a = i7;
        this.d = obj;
        this.f40827b = f10;
        this.f40828c = f11;
    }

    public void a() {
        te.c cVar = (te.c) this.d;
        if (cVar.h) {
            cVar.d(this.f40827b + this.f40828c, 1.0f);
            if (cVar.h) {
                cVar.h = false;
            }
            cVar.f57088b.E(cVar.f57091f, cVar.f57087a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f40826a) {
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
        switch (this.f40826a) {
            case 0:
                r1 r1Var = (r1) this.d;
                r1Var.P = false;
                r1Var.N = true;
                r1Var.f40898a0 = this.f40827b;
                r1Var.f40900b0 = this.f40828c;
                r1Var.requestLayout();
                return;
            default:
                a();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f40826a) {
            case 1:
                ((te.c) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
