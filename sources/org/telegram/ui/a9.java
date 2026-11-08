package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class a9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f43604a;
    public final org.telegram.ui.Components.w70 f43605b;
    public final String f43606c;

    public a9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.w70 w70Var, String str) {
        this.f43604a = atomicBoolean;
        this.f43605b = w70Var;
        this.f43606c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f43604a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f43605b.setText(this.f43606c);
        }
    }
}
