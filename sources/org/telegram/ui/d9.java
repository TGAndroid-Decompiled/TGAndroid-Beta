package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class d9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f35716a;
    public final org.telegram.ui.Components.q90 f35717b;
    public final String f35718c;

    public d9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.q90 q90Var, String str) {
        this.f35716a = atomicBoolean;
        this.f35717b = q90Var;
        this.f35718c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f35716a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f35717b.setText(this.f35718c);
        }
    }
}
