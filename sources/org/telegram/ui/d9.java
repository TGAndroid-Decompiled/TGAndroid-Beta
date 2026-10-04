package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class d9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f35700a;
    public final org.telegram.ui.Components.q90 f35701b;
    public final String f35702c;

    public d9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.q90 q90Var, String str) {
        this.f35700a = atomicBoolean;
        this.f35701b = q90Var;
        this.f35702c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f35700a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f35701b.setText(this.f35702c);
        }
    }
}
