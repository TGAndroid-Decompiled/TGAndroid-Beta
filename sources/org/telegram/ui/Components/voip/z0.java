package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z0 extends AnimatorListenerAdapter {
    public final int f39727a;
    public final float f39728b;
    public final float f39729c;
    public final Object d;

    public z0(Object obj, float f10, float f11, int i3) {
        this.f39727a = i3;
        this.d = obj;
        this.f39728b = f10;
        this.f39729c = f11;
    }

    public void a() {
        qe.c cVar = (qe.c) this.d;
        if (cVar.h) {
            cVar.d(this.f39728b + this.f39729c, 1.0f);
            if (cVar.h) {
                cVar.h = false;
            }
            cVar.f53843b.F(cVar.f53846f, cVar.f53842a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f39727a) {
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
        switch (this.f39727a) {
            case 0:
                c1 c1Var = (c1) this.d;
                c1Var.P = false;
                c1Var.N = true;
                c1Var.f39251a0 = this.f39728b;
                c1Var.f39253b0 = this.f39729c;
                c1Var.requestLayout();
                return;
            default:
                a();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f39727a) {
            case 1:
                ((qe.c) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
