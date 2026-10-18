package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class t81 extends AnimatorListenerAdapter {
    public boolean f30489a;
    public final View f30490b;
    public final float f30491c;
    public final c91 d;

    public t81(c91 c91Var, View view, float f7) {
        this.d = c91Var;
        this.f30490b = view;
        this.f30491c = f7;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f30489a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f30489a) {
            this.d.E(this.f30490b, this.f30491c);
        }
    }
}
