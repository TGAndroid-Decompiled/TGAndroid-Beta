package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y extends AnimatorListenerAdapter {
    public final t f32017a;

    public y(t tVar) {
        this.f32017a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f32017a.E = false;
    }
}
