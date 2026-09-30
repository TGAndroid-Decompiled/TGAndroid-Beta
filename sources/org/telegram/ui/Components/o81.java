package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class o81 extends AnimatorListenerAdapter {
    public boolean f27007a;
    public final View f27008b;
    public final float f27009c;
    public final y81 d;

    public o81(y81 y81Var, View view, float f7) {
        this.d = y81Var;
        this.f27008b = view;
        this.f27009c = f7;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f27007a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f27007a) {
            this.d.E(this.f27008b, this.f27009c);
        }
    }
}
