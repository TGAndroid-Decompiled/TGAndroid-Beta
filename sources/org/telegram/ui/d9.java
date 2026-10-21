package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class d9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f36297a;
    public final org.telegram.ui.Components.x90 f36298b;
    public final String f36299c;

    public d9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.x90 x90Var, String str) {
        this.f36297a = atomicBoolean;
        this.f36298b = x90Var;
        this.f36299c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f36297a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f36298b.setText(this.f36299c);
        }
    }
}
