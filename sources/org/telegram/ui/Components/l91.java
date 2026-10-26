package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class l91 extends AnimatorListenerAdapter {
    public boolean f30134a;
    public final View f30135b;
    public final float f30136c;
    public final u91 d;

    public l91(u91 u91Var, View view, float f7) {
        this.d = u91Var;
        this.f30135b = view;
        this.f30136c = f7;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f30134a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f30134a) {
            this.d.F(this.f30135b, this.f30136c);
        }
    }
}
