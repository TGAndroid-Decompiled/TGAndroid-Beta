package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class c1 extends AnimatorListenerAdapter {
    public final int f31987a;
    public final h1 f31988b;

    public c1(h1 h1Var, int i10) {
        this.f31987a = i10;
        this.f31988b = h1Var;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f31987a) {
            case 1:
                this.f31988b.I = null;
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator, boolean z4) {
        View view;
        switch (this.f31987a) {
            case 0:
                cf.f fVar = this.f31988b.L;
                if (fVar == null || (view = fVar.f2498j) == null) {
                    return;
                }
                fVar.e(view);
                return;
            default:
                super.onAnimationEnd(animator, z4);
                return;
        }
    }
}
