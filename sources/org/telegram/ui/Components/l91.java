package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class l91 extends AnimatorListenerAdapter {
    public boolean f30132a;
    public final View f30133b;
    public final float f30134c;
    public final u91 d;

    public l91(u91 u91Var, View view, float f7) {
        this.d = u91Var;
        this.f30133b = view;
        this.f30134c = f7;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f30132a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f30132a) {
            this.d.F(this.f30133b, this.f30134c);
        }
    }
}
