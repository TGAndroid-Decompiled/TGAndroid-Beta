package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class d9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f33049a;
    public final org.telegram.ui.Components.c90 f33050b;
    public final String f33051c;

    public d9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.c90 c90Var, String str) {
        this.f33049a = atomicBoolean;
        this.f33050b = c90Var;
        this.f33051c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f33049a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f33050b.setText(this.f33051c);
        }
    }
}
