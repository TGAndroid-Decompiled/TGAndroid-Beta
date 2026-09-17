package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y extends AnimatorListenerAdapter {
    public final t f31941a;

    public y(t tVar) {
        this.f31941a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f31941a.E = false;
    }
}
