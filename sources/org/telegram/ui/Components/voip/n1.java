package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n1 extends AnimatorListenerAdapter {
    public final int f41208a;
    public final float f41209b;
    public final float f41210c;
    public final Object d;

    public n1(Object obj, float f10, float f11, int i7) {
        this.f41208a = i7;
        this.d = obj;
        this.f41209b = f10;
        this.f41210c = f11;
    }

    public void a() {
        te.c cVar = (te.c) this.d;
        if (cVar.h) {
            cVar.d(this.f41209b + this.f41210c, 1.0f);
            if (cVar.h) {
                cVar.h = false;
            }
            cVar.f57703b.D(cVar.f57706f, cVar.f57702a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f41208a) {
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
        switch (this.f41208a) {
            case 0:
                q1 q1Var = (q1) this.d;
                q1Var.P = false;
                q1Var.N = true;
                q1Var.f41277a0 = this.f41209b;
                q1Var.f41279b0 = this.f41210c;
                q1Var.requestLayout();
                return;
            default:
                a();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f41208a) {
            case 1:
                ((te.c) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
