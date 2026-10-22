package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class d9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f36300a;
    public final org.telegram.ui.Components.x90 f36301b;
    public final String f36302c;

    public d9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.x90 x90Var, String str) {
        this.f36300a = atomicBoolean;
        this.f36301b = x90Var;
        this.f36302c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f36300a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f36301b.setText(this.f36302c);
        }
    }
}
