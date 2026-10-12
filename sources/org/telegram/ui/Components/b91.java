package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class b91 extends AnimatorListenerAdapter {
    public boolean f23722a;
    public final View f23723b;
    public final float f23724c;
    public final k91 d;

    public b91(k91 k91Var, View view, float f7) {
        this.d = k91Var;
        this.f23723b = view;
        this.f23724c = f7;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f23722a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f23722a) {
            this.d.E(this.f23723b, this.f23724c);
        }
    }
}
