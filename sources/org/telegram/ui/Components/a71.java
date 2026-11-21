package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class a71 extends AnimatorListenerAdapter {
    public boolean f33393a;
    public final View f33394b;
    public final float f33395c;
    public final j71 d;

    public a71(j71 j71Var, View view, float f10) {
        this.d = j71Var;
        this.f33394b = view;
        this.f33395c = f10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f33393a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f33393a) {
            this.d.B(this.f33394b, this.f33395c);
        }
    }
}
