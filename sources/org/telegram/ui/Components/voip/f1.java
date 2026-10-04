package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class f1 extends AnimatorListenerAdapter {
    public final int f31848a;
    public final k1 f31849b;

    public f1(k1 k1Var, int i10) {
        this.f31848a = i10;
        this.f31849b = k1Var;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f31848a) {
            case 1:
                this.f31849b.L = null;
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator, boolean z10) {
        View view;
        switch (this.f31848a) {
            case 0:
                pf.e eVar = this.f31849b.O;
                if (eVar == null || (view = eVar.f44416j) == null) {
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
