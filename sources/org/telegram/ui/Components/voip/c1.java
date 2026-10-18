package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class c1 extends AnimatorListenerAdapter {
    public final int f31413a;
    public final h1 f31414b;

    public c1(h1 h1Var, int i10) {
        this.f31413a = i10;
        this.f31414b = h1Var;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f31413a) {
            case 1:
                this.f31414b.L = null;
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator, boolean z10) {
        View view;
        switch (this.f31413a) {
            case 0:
                rf.d dVar = this.f31414b.O;
                if (dVar == null || (view = dVar.f45315j) == null) {
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
