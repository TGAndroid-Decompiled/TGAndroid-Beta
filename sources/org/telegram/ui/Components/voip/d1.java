package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class d1 extends AnimatorListenerAdapter {
    public final int f33756a;
    public final i1 f33757b;

    public d1(i1 i1Var, int i10) {
        this.f33756a = i10;
        this.f33757b = i1Var;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f33756a) {
            case 1:
                this.f33757b.L = null;
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator, boolean z10) {
        View view;
        switch (this.f33756a) {
            case 0:
                sf.d dVar = this.f33757b.O;
                if (dVar == null || (view = dVar.f48131j) == null) {
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
