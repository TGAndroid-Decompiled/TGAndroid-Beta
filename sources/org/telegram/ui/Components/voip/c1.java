package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class c1 extends AnimatorListenerAdapter {
    public final int f31992a;
    public final h1 f31993b;

    public c1(h1 h1Var, int i10) {
        this.f31992a = i10;
        this.f31993b = h1Var;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f31992a) {
            case 1:
                this.f31993b.I = null;
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator, boolean z4) {
        View view;
        switch (this.f31992a) {
            case 0:
                cf.f fVar = this.f31993b.L;
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
