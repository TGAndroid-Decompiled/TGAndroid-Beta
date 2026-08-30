package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w extends AnimatorListenerAdapter {
    public final t f30007a;

    public w(t tVar) {
        this.f30007a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f30007a.B = false;
    }
}
