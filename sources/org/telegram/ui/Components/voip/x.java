package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x extends AnimatorListenerAdapter {
    public final t f34197a;

    public x(t tVar) {
        this.f34197a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f34197a.E = false;
    }
}
