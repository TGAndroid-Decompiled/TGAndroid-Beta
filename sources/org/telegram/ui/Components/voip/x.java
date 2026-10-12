package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x extends AnimatorListenerAdapter {
    public final t f30581a;

    public x(t tVar) {
        this.f30581a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f30581a.E = false;
    }
}
