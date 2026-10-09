package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class e91 extends AnimatorListenerAdapter {
    public boolean f26001a;
    public final View f26002b;
    public final float f26003c;
    public final o91 d;

    public e91(o91 o91Var, View view, float f7) {
        this.d = o91Var;
        this.f26002b = view;
        this.f26003c = f7;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f26001a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f26001a) {
            this.d.E(this.f26002b, this.f26003c);
        }
    }
}
