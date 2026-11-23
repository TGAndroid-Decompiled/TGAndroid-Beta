package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o1 extends AnimatorListenerAdapter {
    public final int f41103a;
    public final float f41104b;
    public final float f41105c;
    public final Object d;

    public o1(Object obj, float f10, float f11, int i7) {
        this.f41103a = i7;
        this.d = obj;
        this.f41104b = f10;
        this.f41105c = f11;
    }

    public void a() {
        te.c cVar = (te.c) this.d;
        if (cVar.h) {
            cVar.d(this.f41104b + this.f41105c, 1.0f);
            if (cVar.h) {
                cVar.h = false;
            }
            cVar.f57782b.G(cVar.f57785f, cVar.f57781a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f41103a) {
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
        switch (this.f41103a) {
            case 0:
                r1 r1Var = (r1) this.d;
                r1Var.P = false;
                r1Var.N = true;
                r1Var.f41172a0 = this.f41104b;
                r1Var.f41174b0 = this.f41105c;
                r1Var.requestLayout();
                return;
            default:
                a();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f41103a) {
            case 1:
                ((te.c) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
