package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y extends AnimatorListenerAdapter {
    public final t f28541a;

    public y(t tVar) {
        this.f28541a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f28541a.E = false;
    }
}
