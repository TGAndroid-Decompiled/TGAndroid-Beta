package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class f9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f39301a;
    public final org.telegram.ui.Components.z90 f39302b;
    public final String f39303c;

    public f9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.z90 z90Var, String str) {
        this.f39301a = atomicBoolean;
        this.f39302b = z90Var;
        this.f39303c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f39301a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f39302b.setText(this.f39303c);
        }
    }
}
