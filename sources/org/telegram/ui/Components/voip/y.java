package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y extends AnimatorListenerAdapter {
    public final t f30261a;

    public y(t tVar) {
        this.f30261a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f30261a.E = false;
    }
}
