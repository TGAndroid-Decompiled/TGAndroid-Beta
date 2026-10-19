package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class c1 extends AnimatorListenerAdapter {
    public final int f31415a;
    public final h1 f31416b;

    public c1(h1 h1Var, int i10) {
        this.f31415a = i10;
        this.f31416b = h1Var;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f31415a) {
            case 1:
                this.f31416b.L = null;
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator, boolean z10) {
        View view;
        switch (this.f31415a) {
            case 0:
                rf.d dVar = this.f31416b.O;
                if (dVar == null || (view = dVar.f45269j) == null) {
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
