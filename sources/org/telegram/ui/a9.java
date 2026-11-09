package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class a9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f43643a;
    public final org.telegram.ui.Components.x70 f43644b;
    public final String f43645c;

    public a9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.x70 x70Var, String str) {
        this.f43643a = atomicBoolean;
        this.f43644b = x70Var;
        this.f43645c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f43643a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f43644b.setText(this.f43645c);
        }
    }
}
