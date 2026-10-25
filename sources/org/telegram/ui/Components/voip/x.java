package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x extends AnimatorListenerAdapter {
    public final t f34194a;

    public x(t tVar) {
        this.f34194a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f34194a.E = false;
    }
}
