package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class c1 extends AnimatorListenerAdapter {
    public final int f30135a;
    public final h1 f30136b;

    public c1(h1 h1Var, int i10) {
        this.f30135a = i10;
        this.f30136b = h1Var;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f30135a) {
            case 1:
                this.f30136b.L = null;
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator, boolean z10) {
        View view;
        switch (this.f30135a) {
            case 0:
                rf.d dVar = this.f30136b.O;
                if (dVar == null || (view = dVar.f44180j) == null) {
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
