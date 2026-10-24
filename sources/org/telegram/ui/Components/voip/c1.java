package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class c1 extends AnimatorListenerAdapter {
    public final int f31522a;
    public final h1 f31523b;

    public c1(h1 h1Var, int i10) {
        this.f31522a = i10;
        this.f31523b = h1Var;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f31522a) {
            case 1:
                this.f31523b.L = null;
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator, boolean z10) {
        View view;
        switch (this.f31522a) {
            case 0:
                rf.d dVar = this.f31523b.O;
                if (dVar == null || (view = dVar.f45692j) == null) {
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
