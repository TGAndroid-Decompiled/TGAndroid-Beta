package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class b9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f34689a;
    public final org.telegram.ui.Components.d90 f34690b;
    public final String f34691c;

    public b9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.d90 d90Var, String str) {
        this.f34689a = atomicBoolean;
        this.f34690b = d90Var;
        this.f34691c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f34689a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f34690b.setText(this.f34691c);
        }
    }
}
