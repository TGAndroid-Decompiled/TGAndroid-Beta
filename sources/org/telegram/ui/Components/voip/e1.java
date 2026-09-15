package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class e1 extends AnimatorListenerAdapter {
    public final int f28932a;
    public final j1 f28933b;

    public e1(j1 j1Var, int i10) {
        this.f28932a = i10;
        this.f28933b = j1Var;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f28932a) {
            case 1:
                this.f28933b.L = null;
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator, boolean z10) {
        View view;
        switch (this.f28932a) {
            case 0:
                pf.e eVar = this.f28933b.O;
                if (eVar == null || (view = eVar.f40799j) == null) {
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
