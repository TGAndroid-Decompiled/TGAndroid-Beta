package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class x extends AnimatorListenerAdapter {

    public final t f33978a;

    public x(t tVar) {
        this.f33978a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f33978a.A = false;
    }
}
