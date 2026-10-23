package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class c1 extends AnimatorListenerAdapter {
    public final int f31552a;
    public final h1 f31553b;

    public c1(h1 h1Var, int i10) {
        this.f31552a = i10;
        this.f31553b = h1Var;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f31552a) {
            case 1:
                this.f31553b.L = null;
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator, boolean z10) {
        View view;
        switch (this.f31552a) {
            case 0:
                rf.d dVar = this.f31553b.O;
                if (dVar == null || (view = dVar.f45693j) == null) {
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
