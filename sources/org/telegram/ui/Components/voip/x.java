package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x extends AnimatorListenerAdapter {
    public final t f34302a;

    public x(t tVar) {
        this.f34302a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f34302a.E = false;
    }
}
