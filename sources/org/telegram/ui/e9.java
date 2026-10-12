package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class e9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f35485a;
    public final org.telegram.ui.Components.da0 f35486b;
    public final String f35487c;

    public e9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.da0 da0Var, String str) {
        this.f35485a = atomicBoolean;
        this.f35486b = da0Var;
        this.f35487c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f35485a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f35486b.setText(this.f35487c);
        }
    }
}
