package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class d9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f35705a;
    public final org.telegram.ui.Components.q90 f35706b;
    public final String f35707c;

    public d9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.q90 q90Var, String str) {
        this.f35705a = atomicBoolean;
        this.f35706b = q90Var;
        this.f35707c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f35705a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f35706b.setText(this.f35707c);
        }
    }
}
