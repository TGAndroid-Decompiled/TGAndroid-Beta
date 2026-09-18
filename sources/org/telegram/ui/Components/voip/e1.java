package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class e1 extends AnimatorListenerAdapter {
    public final int f28912a;
    public final j1 f28913b;

    public e1(j1 j1Var, int i10) {
        this.f28912a = i10;
        this.f28913b = j1Var;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f28912a) {
            case 1:
                this.f28913b.L = null;
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator, boolean z10) {
        View view;
        switch (this.f28912a) {
            case 0:
                pf.e eVar = this.f28913b.O;
                if (eVar == null || (view = eVar.f40826j) == null) {
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
