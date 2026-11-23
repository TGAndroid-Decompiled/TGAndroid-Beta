package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class b9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f45818a;
    public final org.telegram.ui.Components.m80 f45819b;
    public final String f45820c;

    public b9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.m80 m80Var, String str) {
        this.f45818a = atomicBoolean;
        this.f45819b = m80Var;
        this.f45820c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f45818a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f45819b.setText(this.f45820c);
        }
    }
}
