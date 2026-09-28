package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class o81 extends AnimatorListenerAdapter {
    public boolean f27009a;
    public final View f27010b;
    public final float f27011c;
    public final y81 d;

    public o81(y81 y81Var, View view, float f7) {
        this.d = y81Var;
        this.f27010b = view;
        this.f27011c = f7;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f27009a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f27009a) {
            this.d.E(this.f27010b, this.f27011c);
        }
    }
}
