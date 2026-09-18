package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class d9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f33053a;
    public final org.telegram.ui.Components.c90 f33054b;
    public final String f33055c;

    public d9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.c90 c90Var, String str) {
        this.f33053a = atomicBoolean;
        this.f33054b = c90Var;
        this.f33055c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f33053a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f33054b.setText(this.f33055c);
        }
    }
}
