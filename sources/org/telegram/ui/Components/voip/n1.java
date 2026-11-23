package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n1 extends AnimatorListenerAdapter {
    public final int f41169a;
    public final float f41170b;
    public final float f41171c;
    public final Object d;

    public n1(Object obj, float f10, float f11, int i7) {
        this.f41169a = i7;
        this.d = obj;
        this.f41170b = f10;
        this.f41171c = f11;
    }

    public void a() {
        te.c cVar = (te.c) this.d;
        if (cVar.h) {
            cVar.d(this.f41170b + this.f41171c, 1.0f);
            if (cVar.h) {
                cVar.h = false;
            }
            cVar.f57668b.D(cVar.f57671f, cVar.f57667a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f41169a) {
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
        switch (this.f41169a) {
            case 0:
                q1 q1Var = (q1) this.d;
                q1Var.P = false;
                q1Var.N = true;
                q1Var.f41238a0 = this.f41170b;
                q1Var.f41240b0 = this.f41171c;
                q1Var.requestLayout();
                return;
            default:
                a();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f41169a) {
            case 1:
                ((te.c) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
