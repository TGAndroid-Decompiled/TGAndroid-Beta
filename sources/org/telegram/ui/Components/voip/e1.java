package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class e1 extends AnimatorListenerAdapter {
    public final int f28909a;
    public final j1 f28910b;

    public e1(j1 j1Var, int i10) {
        this.f28909a = i10;
        this.f28910b = j1Var;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f28909a) {
            case 1:
                this.f28910b.L = null;
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator, boolean z10) {
        View view;
        switch (this.f28909a) {
            case 0:
                pf.e eVar = this.f28910b.O;
                if (eVar == null || (view = eVar.f40821j) == null) {
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
