package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class b9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f36136a;
    public final org.telegram.ui.Components.p80 f36137b;
    public final String f36138c;

    public b9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.p80 p80Var, String str) {
        this.f36136a = atomicBoolean;
        this.f36137b = p80Var;
        this.f36138c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f36136a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f36137b.setText(this.f36138c);
        }
    }
}
