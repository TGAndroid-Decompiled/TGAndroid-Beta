package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class d9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f36536a;
    public final org.telegram.ui.Components.y90 f36537b;
    public final String f36538c;

    public d9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.y90 y90Var, String str) {
        this.f36536a = atomicBoolean;
        this.f36537b = y90Var;
        this.f36538c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f36536a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f36537b.setText(this.f36538c);
        }
    }
}
