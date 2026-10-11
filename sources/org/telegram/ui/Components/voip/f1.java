package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class f1 extends AnimatorListenerAdapter {
    public final int f32040a;
    public final k1 f32041b;

    public f1(k1 k1Var, int i10) {
        this.f32040a = i10;
        this.f32041b = k1Var;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f32040a) {
            case 1:
                this.f32041b.L = null;
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator, boolean z10) {
        View view;
        switch (this.f32040a) {
            case 0:
                qf.e eVar = this.f32041b.O;
                if (eVar == null || (view = eVar.f46281j) == null) {
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
