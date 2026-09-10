package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class d1 extends AnimatorListenerAdapter {
    public final int f28093a;
    public final i1 f28094b;

    public d1(i1 i1Var, int i10) {
        this.f28093a = i10;
        this.f28094b = i1Var;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f28093a) {
            case 1:
                this.f28094b.L = null;
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator, boolean z10) {
        View view;
        switch (this.f28093a) {
            case 0:
                pf.e eVar = this.f28094b.O;
                if (eVar == null || (view = eVar.f39925j) == null) {
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
