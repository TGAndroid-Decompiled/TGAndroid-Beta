package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class f1 extends AnimatorListenerAdapter {
    public final int f31677a;
    public final k1 f31678b;

    public f1(k1 k1Var, int i10) {
        this.f31677a = i10;
        this.f31678b = k1Var;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f31677a) {
            case 1:
                this.f31678b.L = null;
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator, boolean z10) {
        View view;
        switch (this.f31677a) {
            case 0:
                qf.e eVar = this.f31678b.O;
                if (eVar == null || (view = eVar.f46106j) == null) {
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
