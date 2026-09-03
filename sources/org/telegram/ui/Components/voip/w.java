package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w extends AnimatorListenerAdapter {
    public final t f29979a;

    public w(t tVar) {
        this.f29979a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f29979a.B = false;
    }
}
