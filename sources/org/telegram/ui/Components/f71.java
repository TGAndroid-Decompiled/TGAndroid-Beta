package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public final class f71 extends AnimatorListenerAdapter {

    public boolean f28291a;

    public final View f28292b;

    public final float f28293c;
    public final p71 d;

    public f71(p71 p71Var, View view, float f10) {
        this.d = p71Var;
        this.f28292b = view;
        this.f28293c = f10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f28291a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f28291a) {
            return;
        }
        this.d.E(this.f28292b, this.f28293c);
    }
}
