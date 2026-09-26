package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class b9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f32353a;
    public final org.telegram.ui.Components.n90 f32354b;
    public final String f32355c;

    public b9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.n90 n90Var, String str) {
        this.f32353a = atomicBoolean;
        this.f32354b = n90Var;
        this.f32355c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f32353a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f32354b.setText(this.f32355c);
        }
    }
}
