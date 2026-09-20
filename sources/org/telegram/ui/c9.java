package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class c9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f32669a;
    public final org.telegram.ui.Components.k90 f32670b;
    public final String f32671c;

    public c9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.k90 k90Var, String str) {
        this.f32669a = atomicBoolean;
        this.f32670b = k90Var;
        this.f32671c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f32669a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f32670b.setText(this.f32671c);
        }
    }
}
