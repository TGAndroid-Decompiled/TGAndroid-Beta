package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class b9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f32080a;
    public final org.telegram.ui.Components.c90 f32081b;
    public final String f32082c;

    public b9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.c90 c90Var, String str) {
        this.f32080a = atomicBoolean;
        this.f32081b = c90Var;
        this.f32082c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f32080a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f32081b.setText(this.f32082c);
        }
    }
}
