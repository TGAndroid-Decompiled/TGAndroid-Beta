package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class a9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f43613a;
    public final org.telegram.ui.Components.w70 f43614b;
    public final String f43615c;

    public a9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.w70 w70Var, String str) {
        this.f43613a = atomicBoolean;
        this.f43614b = w70Var;
        this.f43615c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f43613a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f43614b.setText(this.f43615c);
        }
    }
}
