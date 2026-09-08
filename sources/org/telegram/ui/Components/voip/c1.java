package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class c1 extends AnimatorListenerAdapter {
    public final int f31464a;
    public final h1 f31465b;

    public c1(h1 h1Var, int i10) {
        this.f31464a = i10;
        this.f31465b = h1Var;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f31464a) {
            case 1:
                this.f31465b.L = null;
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator, boolean z10) {
        View view;
        switch (this.f31464a) {
            case 0:
                qf.e eVar = this.f31465b.O;
                if (eVar == null || (view = eVar.f44388j) == null) {
                    return;
                }
                eVar.e(view);
                return;
            default:
                super.onAnimationEnd(animator, z10);
                return;
        }
    }
}
