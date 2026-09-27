package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class e9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f33173a;
    public final org.telegram.ui.Components.p90 f33174b;
    public final String f33175c;

    public e9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.p90 p90Var, String str) {
        this.f33173a = atomicBoolean;
        this.f33174b = p90Var;
        this.f33175c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f33173a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f33174b.setText(this.f33175c);
        }
    }
}
