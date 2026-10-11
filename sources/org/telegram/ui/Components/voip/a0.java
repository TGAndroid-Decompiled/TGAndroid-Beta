package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a0 extends AnimatorListenerAdapter {
    public final v f31883a;

    public a0(v vVar) {
        this.f31883a = vVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f31883a.E = false;
    }
}
