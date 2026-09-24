package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class b9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f32340a;
    public final org.telegram.ui.Components.n90 f32341b;
    public final String f32342c;

    public b9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.n90 n90Var, String str) {
        this.f32340a = atomicBoolean;
        this.f32341b = n90Var;
        this.f32342c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f32340a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f32341b.setText(this.f32342c);
        }
    }
}
