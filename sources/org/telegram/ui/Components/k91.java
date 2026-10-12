package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class k91 extends AnimatorListenerAdapter {
    public boolean f27796a;
    public final View f27797b;
    public final float f27798c;
    public final u91 d;

    public k91(u91 u91Var, View view, float f7) {
        this.d = u91Var;
        this.f27797b = view;
        this.f27798c = f7;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f27796a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f27796a) {
            this.d.E(this.f27797b, this.f27798c);
        }
    }
}
