package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class a9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f35919a;
    public final org.telegram.ui.Components.fa0 f35920b;
    public final String f35921c;

    public a9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.fa0 fa0Var, String str) {
        this.f35919a = atomicBoolean;
        this.f35920b = fa0Var;
        this.f35921c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f35919a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f35920b.setText(this.f35921c);
        }
    }
}
