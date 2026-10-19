package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class d9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f36318a;
    public final org.telegram.ui.Components.x90 f36319b;
    public final String f36320c;

    public d9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.x90 x90Var, String str) {
        this.f36318a = atomicBoolean;
        this.f36319b = x90Var;
        this.f36320c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f36318a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f36319b.setText(this.f36320c);
        }
    }
}
