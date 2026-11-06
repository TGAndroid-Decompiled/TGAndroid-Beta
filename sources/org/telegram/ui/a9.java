package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class a9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f43575a;
    public final org.telegram.ui.Components.w70 f43576b;
    public final String f43577c;

    public a9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.w70 w70Var, String str) {
        this.f43575a = atomicBoolean;
        this.f43576b = w70Var;
        this.f43577c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f43575a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f43576b.setText(this.f43577c);
        }
    }
}
