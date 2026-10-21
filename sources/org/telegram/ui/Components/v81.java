package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class v81 extends AnimatorListenerAdapter {
    public boolean f31198a;
    public final View f31199b;
    public final float f31200c;
    public final e91 d;

    public v81(e91 e91Var, View view, float f7) {
        this.d = e91Var;
        this.f31199b = view;
        this.f31200c = f7;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f31198a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f31198a) {
            this.d.E(this.f31199b, this.f31200c);
        }
    }
}
