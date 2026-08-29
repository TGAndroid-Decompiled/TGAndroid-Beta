package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y extends AnimatorListenerAdapter {
    public final u f34127a;

    public y(u uVar) {
        this.f34127a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f34127a.A = false;
    }
}
