package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class f9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f39304a;
    public final org.telegram.ui.Components.z90 f39305b;
    public final String f39306c;

    public f9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.z90 z90Var, String str) {
        this.f39304a = atomicBoolean;
        this.f39305b = z90Var;
        this.f39306c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f39304a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f39305b.setText(this.f39306c);
        }
    }
}
