package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class a71 extends AnimatorListenerAdapter {
    public boolean f33406a;
    public final View f33407b;
    public final float f33408c;
    public final j71 d;

    public a71(j71 j71Var, View view, float f10) {
        this.d = j71Var;
        this.f33407b = view;
        this.f33408c = f10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f33406a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f33406a) {
            this.d.B(this.f33407b, this.f33408c);
        }
    }
}
