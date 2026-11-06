package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class a9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f43599a;
    public final org.telegram.ui.Components.w70 f43600b;
    public final String f43601c;

    public a9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.w70 w70Var, String str) {
        this.f43599a = atomicBoolean;
        this.f43600b = w70Var;
        this.f43601c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f43599a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f43600b.setText(this.f43601c);
        }
    }
}
