package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class o81 extends AnimatorListenerAdapter {
    public boolean f27008a;
    public final View f27009b;
    public final float f27010c;
    public final y81 d;

    public o81(y81 y81Var, View view, float f7) {
        this.d = y81Var;
        this.f27009b = view;
        this.f27010c = f7;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f27008a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f27008a) {
            this.d.E(this.f27009b, this.f27010c);
        }
    }
}
