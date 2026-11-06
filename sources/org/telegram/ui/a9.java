package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class a9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f43600a;
    public final org.telegram.ui.Components.w70 f43601b;
    public final String f43602c;

    public a9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.w70 w70Var, String str) {
        this.f43600a = atomicBoolean;
        this.f43601b = w70Var;
        this.f43602c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f43600a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f43601b.setText(this.f43602c);
        }
    }
}
