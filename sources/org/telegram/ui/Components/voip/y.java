package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y extends AnimatorListenerAdapter {
    public final t f31832a;

    public y(t tVar) {
        this.f31832a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f31832a.E = false;
    }
}
