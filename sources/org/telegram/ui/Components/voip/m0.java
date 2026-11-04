package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class m0 extends AnimatorListenerAdapter {
    public final int f39468a;
    public final s0 f39469b;

    public m0(s0 s0Var, int i3) {
        this.f39468a = i3;
        this.f39469b = s0Var;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f39468a) {
            case 1:
                this.f39469b.M = null;
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator, boolean z10) {
        View view;
        switch (this.f39468a) {
            case 0:
                uf.d dVar = this.f39469b.P;
                if (dVar == null || (view = dVar.f55856j) == null) {
                    return;
                }
                dVar.e(view);
                return;
            default:
                super.onAnimationEnd(animator, z10);
                return;
        }
    }
}
