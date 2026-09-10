package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class b9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f31183a;
    public final org.telegram.ui.Components.m90 f31184b;
    public final String f31185c;

    public b9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.m90 m90Var, String str) {
        this.f31183a = atomicBoolean;
        this.f31184b = m90Var;
        this.f31185c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f31183a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f31184b.setText(this.f31185c);
        }
    }
}
