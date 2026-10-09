package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class a9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f35875a;
    public final org.telegram.ui.Components.ea0 f35876b;
    public final String f35877c;

    public a9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.ea0 ea0Var, String str) {
        this.f35875a = atomicBoolean;
        this.f35876b = ea0Var;
        this.f35877c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f35875a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f35876b.setText(this.f35877c);
        }
    }
}
