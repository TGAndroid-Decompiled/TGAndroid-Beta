package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class b9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f32352a;
    public final org.telegram.ui.Components.o90 f32353b;
    public final String f32354c;

    public b9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.o90 o90Var, String str) {
        this.f32352a = atomicBoolean;
        this.f32353b = o90Var;
        this.f32354c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f32352a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f32353b.setText(this.f32354c);
        }
    }
}
