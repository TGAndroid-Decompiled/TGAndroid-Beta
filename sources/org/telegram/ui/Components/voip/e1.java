package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class e1 extends AnimatorListenerAdapter {
    public final int f28929a;
    public final j1 f28930b;

    public e1(j1 j1Var, int i10) {
        this.f28929a = i10;
        this.f28930b = j1Var;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f28929a) {
            case 1:
                this.f28930b.L = null;
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator, boolean z10) {
        View view;
        switch (this.f28929a) {
            case 0:
                pf.e eVar = this.f28930b.O;
                if (eVar == null || (view = eVar.f40795j) == null) {
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
