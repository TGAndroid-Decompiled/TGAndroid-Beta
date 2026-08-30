package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class c9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f33228a;
    public final org.telegram.ui.Components.e90 f33229b;
    public final String f33230c;

    public c9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.e90 e90Var, String str) {
        this.f33228a = atomicBoolean;
        this.f33229b = e90Var;
        this.f33230c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f33228a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f33229b.setText(this.f33230c);
        }
    }
}
