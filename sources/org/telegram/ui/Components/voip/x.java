package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x extends AnimatorListenerAdapter {
    public final t f31946a;

    public x(t tVar) {
        this.f31946a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f31946a.E = false;
    }
}
