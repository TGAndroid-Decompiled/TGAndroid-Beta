package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p1 extends AnimatorListenerAdapter {
    public final int f29825a;
    public final float f29826b;
    public final float f29827c;
    public final Object d;

    public p1(Object obj, float f10, float f11, int i10) {
        this.f29825a = i10;
        this.d = obj;
        this.f29826b = f10;
        this.f29827c = f11;
    }

    public void a() {
        xd.c cVar = (xd.c) this.d;
        if (cVar.f46966g) {
            cVar.d(this.f29826b + this.f29827c, 1.0f);
            if (cVar.f46966g) {
                cVar.f46966g = false;
            }
            cVar.f46963b.z(cVar.e, cVar.f46962a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f29825a) {
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
        switch (this.f29825a) {
            case 0:
                s1 s1Var = (s1) this.d;
                s1Var.L = false;
                s1Var.J = true;
                s1Var.T = this.f29826b;
                s1Var.U = this.f29827c;
                s1Var.requestLayout();
                return;
            default:
                a();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f29825a) {
            case 1:
                ((xd.c) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
