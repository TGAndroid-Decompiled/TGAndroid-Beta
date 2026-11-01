package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class o71 extends AnimatorListenerAdapter {
    public boolean f29039a;
    public final View f29040b;
    public final float f29041c;
    public final x71 d;

    public o71(x71 x71Var, View view, float f7) {
        this.d = x71Var;
        this.f29040b = view;
        this.f29041c = f7;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f29039a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f29039a) {
            this.d.F(this.f29040b, this.f29041c);
        }
    }
}
