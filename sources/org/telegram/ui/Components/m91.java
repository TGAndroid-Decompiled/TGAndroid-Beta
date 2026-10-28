package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class m91 extends AnimatorListenerAdapter {
    public boolean f30475a;
    public final View f30476b;
    public final float f30477c;
    public final v91 d;

    public m91(v91 v91Var, View view, float f7) {
        this.d = v91Var;
        this.f30476b = view;
        this.f30477c = f7;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f30475a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f30475a) {
            this.d.F(this.f30476b, this.f30477c);
        }
    }
}
