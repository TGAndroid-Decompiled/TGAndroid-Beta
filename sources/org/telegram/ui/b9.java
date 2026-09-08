package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class b9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f34688a;
    public final org.telegram.ui.Components.d90 f34689b;
    public final String f34690c;

    public b9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.d90 d90Var, String str) {
        this.f34688a = atomicBoolean;
        this.f34689b = d90Var;
        this.f34690c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f34688a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f34689b.setText(this.f34690c);
        }
    }
}
