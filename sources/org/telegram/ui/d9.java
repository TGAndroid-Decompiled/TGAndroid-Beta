package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class d9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f36121a;
    public final org.telegram.ui.Components.x90 f36122b;
    public final String f36123c;

    public d9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.x90 x90Var, String str) {
        this.f36121a = atomicBoolean;
        this.f36122b = x90Var;
        this.f36123c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f36121a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f36122b.setText(this.f36123c);
        }
    }
}
