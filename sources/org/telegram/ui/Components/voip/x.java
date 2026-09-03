package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x extends AnimatorListenerAdapter {
    public final t f29994a;

    public x(t tVar) {
        this.f29994a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f29994a.B = false;
    }
}
