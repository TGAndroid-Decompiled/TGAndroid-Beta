package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y extends AnimatorListenerAdapter {
    public final u f29750a;

    public y(u uVar) {
        this.f29750a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f29750a.E = false;
    }
}
