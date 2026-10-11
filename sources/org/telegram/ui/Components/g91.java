package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class g91 extends AnimatorListenerAdapter {
    public boolean f26649a;
    public final View f26650b;
    public final float f26651c;
    public final q91 d;

    public g91(q91 q91Var, View view, float f7) {
        this.d = q91Var;
        this.f26650b = view;
        this.f26651c = f7;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f26649a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f26649a) {
            this.d.E(this.f26650b, this.f26651c);
        }
    }
}
