package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class f1 extends AnimatorListenerAdapter {
    public final int f31849a;
    public final k1 f31850b;

    public f1(k1 k1Var, int i10) {
        this.f31849a = i10;
        this.f31850b = k1Var;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f31849a) {
            case 1:
                this.f31850b.L = null;
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator, boolean z10) {
        View view;
        switch (this.f31849a) {
            case 0:
                pf.e eVar = this.f31850b.O;
                if (eVar == null || (view = eVar.f44417j) == null) {
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
