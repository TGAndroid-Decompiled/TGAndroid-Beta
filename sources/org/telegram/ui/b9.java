package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class b9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f45814a;
    public final org.telegram.ui.Components.m80 f45815b;
    public final String f45816c;

    public b9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.m80 m80Var, String str) {
        this.f45814a = atomicBoolean;
        this.f45815b = m80Var;
        this.f45816c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f45814a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f45815b.setText(this.f45816c);
        }
    }
}
