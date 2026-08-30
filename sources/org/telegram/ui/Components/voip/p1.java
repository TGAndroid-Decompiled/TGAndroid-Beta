package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p1 extends AnimatorListenerAdapter {
    public final int f29853a;
    public final float f29854b;
    public final float f29855c;
    public final Object d;

    public p1(Object obj, float f10, float f11, int i10) {
        this.f29853a = i10;
        this.d = obj;
        this.f29854b = f10;
        this.f29855c = f11;
    }

    public void a() {
        xd.c cVar = (xd.c) this.d;
        if (cVar.f46898g) {
            cVar.d(this.f29854b + this.f29855c, 1.0f);
            if (cVar.f46898g) {
                cVar.f46898g = false;
            }
            cVar.f46895b.z(cVar.e, cVar.f46894a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f29853a) {
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
        switch (this.f29853a) {
            case 0:
                s1 s1Var = (s1) this.d;
                s1Var.L = false;
                s1Var.J = true;
                s1Var.T = this.f29854b;
                s1Var.U = this.f29855c;
                s1Var.requestLayout();
                return;
            default:
                a();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f29853a) {
            case 1:
                ((xd.c) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
