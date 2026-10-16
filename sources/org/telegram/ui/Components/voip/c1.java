package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class c1 extends AnimatorListenerAdapter {
    public final int f29804a;
    public final h1 f29805b;

    public c1(h1 h1Var, int i10) {
        this.f29804a = i10;
        this.f29805b = h1Var;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f29804a) {
            case 1:
                this.f29805b.L = null;
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator, boolean z10) {
        View view;
        switch (this.f29804a) {
            case 0:
                rf.d dVar = this.f29805b.O;
                if (dVar == null || (view = dVar.f43939j) == null) {
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
