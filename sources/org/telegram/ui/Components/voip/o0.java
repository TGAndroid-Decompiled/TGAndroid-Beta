package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class o0 extends AnimatorListenerAdapter {
    public final int f31631a;
    public final t0 f31632b;

    public o0(t0 t0Var, int i10) {
        this.f31631a = i10;
        this.f31632b = t0Var;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f31631a) {
            case 1:
                this.f31632b.L = null;
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator, boolean z10) {
        View view;
        switch (this.f31631a) {
            case 0:
                jf.f fVar = this.f31632b.O;
                if (fVar == null || (view = fVar.f9869j) == null) {
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
