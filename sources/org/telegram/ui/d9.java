package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class d9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f35699a;
    public final org.telegram.ui.Components.q90 f35700b;
    public final String f35701c;

    public d9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.q90 q90Var, String str) {
        this.f35699a = atomicBoolean;
        this.f35700b = q90Var;
        this.f35701c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f35699a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f35700b.setText(this.f35701c);
        }
    }
}
