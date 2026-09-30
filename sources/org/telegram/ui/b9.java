package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class b9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f32356a;
    public final org.telegram.ui.Components.p90 f32357b;
    public final String f32358c;

    public b9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.p90 p90Var, String str) {
        this.f32356a = atomicBoolean;
        this.f32357b = p90Var;
        this.f32358c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f32356a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f32357b.setText(this.f32358c);
        }
    }
}
