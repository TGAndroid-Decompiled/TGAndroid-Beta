package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y extends AnimatorListenerAdapter {
    public final t f34212a;

    public y(t tVar) {
        this.f34212a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f34212a.E = false;
    }
}
