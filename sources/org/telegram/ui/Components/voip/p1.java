package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class p1 extends AnimatorListenerAdapter {

    public final int f33799a;

    public final float f33800b;

    public final float f33801c;
    public final Object d;

    public p1(Object obj, float f10, float f11, int i10) {
        this.f33799a = i10;
        this.d = obj;
        this.f33800b = f10;
        this.f33801c = f11;
    }

    public void a() {
        ud.c cVar = (ud.c) this.d;
        if (cVar.f48504g) {
            cVar.d(this.f33800b + this.f33801c, 1.0f);
            if (cVar.f48504g) {
                cVar.f48504g = false;
            }
            cVar.f48500b.A(cVar.f48502e, cVar.f48499a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f33799a) {
            case 1:
                a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33799a) {
            case 0:
                s1 s1Var = (s1) this.d;
                s1Var.K = false;
                s1Var.I = true;
                s1Var.S = this.f33800b;
                s1Var.T = this.f33801c;
                s1Var.requestLayout();
                break;
            default:
                a();
                break;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f33799a) {
            case 1:
                ((ud.c) this.d).getClass();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
