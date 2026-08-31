package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x extends AnimatorListenerAdapter {
    public final u f32454a;

    public x(u uVar) {
        this.f32454a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f32454a.B = false;
    }
}
