package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class f1 extends AnimatorListenerAdapter {
    public final int f29343a;
    public final k1 f29344b;

    public f1(k1 k1Var, int i10) {
        this.f29343a = i10;
        this.f29344b = k1Var;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f29343a) {
            case 1:
                this.f29344b.L = null;
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator, boolean z10) {
        View view;
        switch (this.f29343a) {
            case 0:
                pf.e eVar = this.f29344b.O;
                if (eVar == null || (view = eVar.f41066j) == null) {
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
