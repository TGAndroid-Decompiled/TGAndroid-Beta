package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y extends AnimatorListenerAdapter {
    public final u f29356a;

    public y(u uVar) {
        this.f29356a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f29356a.E = false;
    }
}
