package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class a9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f45508a;
    public final org.telegram.ui.Components.k80 f45509b;
    public final String f45510c;

    public a9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.k80 k80Var, String str) {
        this.f45508a = atomicBoolean;
        this.f45509b = k80Var;
        this.f45510c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f45508a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f45509b.setText(this.f45510c);
        }
    }
}
