package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p1 extends AnimatorListenerAdapter {
    public final int f33749a;
    public final float f33750b;
    public final float f33751c;
    public final Object d;

    public p1(Object obj, float f10, float f11, int i9) {
        this.f33749a = i9;
        this.d = obj;
        this.f33750b = f10;
        this.f33751c = f11;
    }

    public void a() {
        td.c cVar = (td.c) this.d;
        if (cVar.f47782g) {
            cVar.d(this.f33750b + this.f33751c, 1.0f);
            if (cVar.f47782g) {
                cVar.f47782g = false;
            }
            cVar.f47778b.B(cVar.f47780e, cVar.f47777a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f33749a) {
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
        switch (this.f33749a) {
            case 0:
                s1 s1Var = (s1) this.d;
                s1Var.K = false;
                s1Var.I = true;
                s1Var.S = this.f33750b;
                s1Var.T = this.f33751c;
                s1Var.requestLayout();
                return;
            default:
                a();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f33749a) {
            case 1:
                ((td.c) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
