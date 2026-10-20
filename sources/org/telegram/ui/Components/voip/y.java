package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y extends AnimatorListenerAdapter {
    public final t f31831a;

    public y(t tVar) {
        this.f31831a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f31831a.E = false;
    }
}
