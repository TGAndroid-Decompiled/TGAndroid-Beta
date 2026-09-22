package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class c9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f32689a;
    public final org.telegram.ui.Components.n90 f32690b;
    public final String f32691c;

    public c9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.n90 n90Var, String str) {
        this.f32689a = atomicBoolean;
        this.f32690b = n90Var;
        this.f32691c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f32689a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f32690b.setText(this.f32691c);
        }
    }
}
