package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class b9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f34661a;
    public final org.telegram.ui.Components.d90 f34662b;
    public final String f34663c;

    public b9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.d90 d90Var, String str) {
        this.f34661a = atomicBoolean;
        this.f34662b = d90Var;
        this.f34663c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f34661a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f34662b.setText(this.f34663c);
        }
    }
}
