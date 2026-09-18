package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class c9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f32589a;
    public final org.telegram.ui.Components.l90 f32590b;
    public final String f32591c;

    public c9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.l90 l90Var, String str) {
        this.f32589a = atomicBoolean;
        this.f32590b = l90Var;
        this.f32591c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f32589a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f32590b.setText(this.f32591c);
        }
    }
}
