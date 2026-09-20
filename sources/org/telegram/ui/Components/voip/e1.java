package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class e1 extends AnimatorListenerAdapter {
    public final int f29335a;
    public final j1 f29336b;

    public e1(j1 j1Var, int i10) {
        this.f29335a = i10;
        this.f29336b = j1Var;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f29335a) {
            case 1:
                this.f29336b.L = null;
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator, boolean z10) {
        View view;
        switch (this.f29335a) {
            case 0:
                pf.e eVar = this.f29336b.O;
                if (eVar == null || (view = eVar.f41095j) == null) {
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
