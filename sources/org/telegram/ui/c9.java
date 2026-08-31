package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class c9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f35713a;
    public final org.telegram.ui.Components.g90 f35714b;
    public final String f35715c;

    public c9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.g90 g90Var, String str) {
        this.f35713a = atomicBoolean;
        this.f35714b = g90Var;
        this.f35715c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f35713a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f35714b.setText(this.f35715c);
        }
    }
}
