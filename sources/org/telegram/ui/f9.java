package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class f9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f39272a;
    public final org.telegram.ui.Components.aa0 f39273b;
    public final String f39274c;

    public f9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.aa0 aa0Var, String str) {
        this.f39272a = atomicBoolean;
        this.f39273b = aa0Var;
        this.f39274c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f39272a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f39273b.setText(this.f39274c);
        }
    }
}
