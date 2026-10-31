package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class n0 extends AnimatorListenerAdapter {
    public final int f31553a;
    public final s0 f31554b;

    public n0(s0 s0Var, int i10) {
        this.f31553a = i10;
        this.f31554b = s0Var;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f31553a) {
            case 1:
                this.f31554b.L = null;
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator, boolean z10) {
        View view;
        switch (this.f31553a) {
            case 0:
                jf.f fVar = this.f31554b.O;
                if (fVar == null || (view = fVar.f9868j) == null) {
                    return;
                }
                fVar.e(view);
                return;
            default:
                super.onAnimationEnd(animator, z10);
                return;
        }
    }
}
