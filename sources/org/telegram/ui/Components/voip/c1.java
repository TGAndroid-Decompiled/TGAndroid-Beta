package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class c1 extends AnimatorListenerAdapter {
    public final int f33651a;
    public final h1 f33652b;

    public c1(h1 h1Var, int i10) {
        this.f33651a = i10;
        this.f33652b = h1Var;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f33651a) {
            case 1:
                this.f33652b.H = null;
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator, boolean z10) {
        View view;
        switch (this.f33651a) {
            case 0:
                af.g gVar = this.f33652b.K;
                if (gVar == null || (view = gVar.f404j) == null) {
                    return;
                }
                gVar.e(view);
                return;
            default:
                super.onAnimationEnd(animator, z10);
                return;
        }
    }
}
