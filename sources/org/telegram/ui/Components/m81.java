package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class m81 extends AnimatorListenerAdapter {
    public boolean f25182a;
    public final View f25183b;
    public final float f25184c;
    public final v81 d;

    public m81(v81 v81Var, View view, float f7) {
        this.d = v81Var;
        this.f25183b = view;
        this.f25184c = f7;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f25182a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f25182a) {
            this.d.E(this.f25183b, this.f25184c);
        }
    }
}
