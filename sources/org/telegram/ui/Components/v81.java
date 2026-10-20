package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class v81 extends AnimatorListenerAdapter {
    public boolean f31197a;
    public final View f31198b;
    public final float f31199c;
    public final e91 d;

    public v81(e91 e91Var, View view, float f7) {
        this.d = e91Var;
        this.f31198b = view;
        this.f31199c = f7;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f31197a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f31197a) {
            this.d.E(this.f31198b, this.f31199c);
        }
    }
}
