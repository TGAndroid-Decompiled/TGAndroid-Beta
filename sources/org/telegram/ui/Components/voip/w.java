package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w extends AnimatorListenerAdapter {
    public final t f33914a;

    public w(t tVar) {
        this.f33914a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f33914a.A = false;
    }
}
