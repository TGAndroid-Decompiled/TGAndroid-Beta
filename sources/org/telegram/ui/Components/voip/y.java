package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y extends AnimatorListenerAdapter {
    public final t f31836a;

    public y(t tVar) {
        this.f31836a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f31836a.E = false;
    }
}
