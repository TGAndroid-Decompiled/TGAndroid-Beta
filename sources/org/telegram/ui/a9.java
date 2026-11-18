package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class a9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f45502a;
    public final org.telegram.ui.Components.k80 f45503b;
    public final String f45504c;

    public a9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.k80 k80Var, String str) {
        this.f45502a = atomicBoolean;
        this.f45503b = k80Var;
        this.f45504c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f45502a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f45503b.setText(this.f45504c);
        }
    }
}
