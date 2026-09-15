package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class b9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f32090a;
    public final org.telegram.ui.Components.c90 f32091b;
    public final String f32092c;

    public b9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.c90 c90Var, String str) {
        this.f32090a = atomicBoolean;
        this.f32091b = c90Var;
        this.f32092c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f32090a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f32091b.setText(this.f32092c);
        }
    }
}
