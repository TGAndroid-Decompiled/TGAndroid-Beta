package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y extends AnimatorListenerAdapter {
    public final u f32445a;

    public y(u uVar) {
        this.f32445a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f32445a.E = false;
    }
}
