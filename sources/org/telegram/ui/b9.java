package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class b9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f32020a;
    public final org.telegram.ui.Components.d90 f32021b;
    public final String f32022c;

    public b9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.d90 d90Var, String str) {
        this.f32020a = atomicBoolean;
        this.f32021b = d90Var;
        this.f32022c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f32020a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f32021b.setText(this.f32022c);
        }
    }
}
