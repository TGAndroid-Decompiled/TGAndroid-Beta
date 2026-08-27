package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class w extends AnimatorListenerAdapter {

    public final t f33964a;

    public w(t tVar) {
        this.f33964a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f33964a.A = false;
    }
}
