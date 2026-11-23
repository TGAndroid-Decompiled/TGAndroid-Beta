package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class b9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f45986a;
    public final org.telegram.ui.Components.j80 f45987b;
    public final String f45988c;

    public b9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.j80 j80Var, String str) {
        this.f45986a = atomicBoolean;
        this.f45987b = j80Var;
        this.f45988c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f45986a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f45987b.setText(this.f45988c);
        }
    }
}
