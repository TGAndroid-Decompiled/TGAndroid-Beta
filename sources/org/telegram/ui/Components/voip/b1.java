package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class b1 extends AnimatorListenerAdapter {
    public final int f29544a;
    public final g1 f29545b;

    public b1(g1 g1Var, int i10) {
        this.f29544a = i10;
        this.f29545b = g1Var;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f29544a) {
            case 1:
                this.f29545b.I = null;
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator, boolean z4) {
        View view;
        switch (this.f29544a) {
            case 0:
                bf.f fVar = this.f29545b.L;
                if (fVar == null || (view = fVar.f1823j) == null) {
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
