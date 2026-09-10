package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z extends AnimatorListenerAdapter {
    public final t f28552a;

    public z(t tVar) {
        this.f28552a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f28552a.E = false;
    }
}
