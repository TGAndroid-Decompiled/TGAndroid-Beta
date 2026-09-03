package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class e9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f33744a;
    public final org.telegram.ui.Components.f90 f33745b;
    public final String f33746c;

    public e9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.f90 f90Var, String str) {
        this.f33744a = atomicBoolean;
        this.f33745b = f90Var;
        this.f33746c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f33744a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f33745b.setText(this.f33746c);
        }
    }
}
