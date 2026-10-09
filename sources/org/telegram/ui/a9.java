package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class a9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f35873a;
    public final org.telegram.ui.Components.ea0 f35874b;
    public final String f35875c;

    public a9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.ea0 ea0Var, String str) {
        this.f35873a = atomicBoolean;
        this.f35874b = ea0Var;
        this.f35875c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f35873a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f35874b.setText(this.f35875c);
        }
    }
}
