package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class e1 extends AnimatorListenerAdapter {
    public final int f31919a;
    public final j1 f31920b;

    public e1(j1 j1Var, int i10) {
        this.f31919a = i10;
        this.f31920b = j1Var;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f31919a) {
            case 1:
                this.f31920b.L = null;
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator, boolean z10) {
        View view;
        switch (this.f31919a) {
            case 0:
                qf.e eVar = this.f31920b.O;
                if (eVar == null || (view = eVar.f46167j) == null) {
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
