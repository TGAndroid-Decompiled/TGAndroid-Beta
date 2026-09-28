package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y extends AnimatorListenerAdapter {
    public final u f29680a;

    public y(u uVar) {
        this.f29680a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f29680a.E = false;
    }
}
