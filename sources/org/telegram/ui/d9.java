package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class d9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f36290a;
    public final org.telegram.ui.Components.x90 f36291b;
    public final String f36292c;

    public d9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.x90 x90Var, String str) {
        this.f36290a = atomicBoolean;
        this.f36291b = x90Var;
        this.f36292c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f36290a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f36291b.setText(this.f36292c);
        }
    }
}
