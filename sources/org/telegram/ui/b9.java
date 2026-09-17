package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class b9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f34662a;
    public final org.telegram.ui.Components.d90 f34663b;
    public final String f34664c;

    public b9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.d90 d90Var, String str) {
        this.f34662a = atomicBoolean;
        this.f34663b = d90Var;
        this.f34664c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f34662a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f34663b.setText(this.f34664c);
        }
    }
}
