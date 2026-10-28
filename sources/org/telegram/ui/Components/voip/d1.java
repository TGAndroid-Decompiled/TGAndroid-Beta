package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class d1 extends AnimatorListenerAdapter {
    public final int f33864a;
    public final i1 f33865b;

    public d1(i1 i1Var, int i10) {
        this.f33864a = i10;
        this.f33865b = i1Var;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f33864a) {
            case 1:
                this.f33865b.L = null;
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator, boolean z10) {
        View view;
        switch (this.f33864a) {
            case 0:
                sf.d dVar = this.f33865b.O;
                if (dVar == null || (view = dVar.f48172j) == null) {
                    return;
                }
                dVar.e(view);
                return;
            default:
                super.onAnimationEnd(animator, z10);
                return;
        }
    }
}
