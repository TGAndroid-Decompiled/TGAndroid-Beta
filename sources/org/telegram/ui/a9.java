package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a9 extends AnimatorListenerAdapter {

    public final AtomicBoolean f36454a;

    public final org.telegram.ui.Components.p80 f36455b;

    public final String f36456c;

    public a9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.p80 p80Var, String str) {
        this.f36454a = atomicBoolean;
        this.f36455b = p80Var;
        this.f36456c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f36454a;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.f36455b.setText(this.f36456c);
    }
}
