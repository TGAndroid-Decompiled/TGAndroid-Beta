package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class b9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f35999a;
    public final org.telegram.ui.Components.p80 f36000b;
    public final String f36001c;

    public b9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.p80 p80Var, String str) {
        this.f35999a = atomicBoolean;
        this.f36000b = p80Var;
        this.f36001c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f35999a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f36000b.setText(this.f36001c);
        }
    }
}
