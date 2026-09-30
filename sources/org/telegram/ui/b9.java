package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class b9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f32428a;
    public final org.telegram.ui.Components.q90 f32429b;
    public final String f32430c;

    public b9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.q90 q90Var, String str) {
        this.f32428a = atomicBoolean;
        this.f32429b = q90Var;
        this.f32430c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f32428a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f32429b.setText(this.f32430c);
        }
    }
}
