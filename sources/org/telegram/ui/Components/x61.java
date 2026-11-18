package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class x61 extends AnimatorListenerAdapter {
    public boolean f41925a;
    public final View f41926b;
    public final float f41927c;
    public final g71 d;

    public x61(g71 g71Var, View view, float f10) {
        this.d = g71Var;
        this.f41926b = view;
        this.f41927c = f10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f41925a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f41925a) {
            this.d.B(this.f41926b, this.f41927c);
        }
    }
}
