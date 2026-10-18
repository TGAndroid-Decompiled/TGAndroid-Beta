package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class d9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f36093a;
    public final org.telegram.ui.Components.x90 f36094b;
    public final String f36095c;

    public d9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.x90 x90Var, String str) {
        this.f36093a = atomicBoolean;
        this.f36094b = x90Var;
        this.f36095c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f36093a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f36094b.setText(this.f36095c);
        }
    }
}
