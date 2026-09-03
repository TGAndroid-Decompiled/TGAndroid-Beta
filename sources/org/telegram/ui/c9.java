package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class c9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f35717a;
    public final org.telegram.ui.Components.g90 f35718b;
    public final String f35719c;

    public c9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.g90 g90Var, String str) {
        this.f35717a = atomicBoolean;
        this.f35718b = g90Var;
        this.f35719c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f35717a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f35718b.setText(this.f35719c);
        }
    }
}
