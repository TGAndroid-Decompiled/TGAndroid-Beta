package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class e9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f35223a;
    public final org.telegram.ui.Components.da0 f35224b;
    public final String f35225c;

    public e9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.da0 da0Var, String str) {
        this.f35223a = atomicBoolean;
        this.f35224b = da0Var;
        this.f35225c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f35223a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f35224b.setText(this.f35225c);
        }
    }
}
