package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class b9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f32354a;
    public final org.telegram.ui.Components.n90 f32355b;
    public final String f32356c;

    public b9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.n90 n90Var, String str) {
        this.f32354a = atomicBoolean;
        this.f32355b = n90Var;
        this.f32356c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f32354a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f32355b.setText(this.f32356c);
        }
    }
}
