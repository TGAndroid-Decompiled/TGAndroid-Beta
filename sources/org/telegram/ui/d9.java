package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class d9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f36502a;
    public final org.telegram.ui.Components.w90 f36503b;
    public final String f36504c;

    public d9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.w90 w90Var, String str) {
        this.f36502a = atomicBoolean;
        this.f36503b = w90Var;
        this.f36504c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f36502a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f36503b.setText(this.f36504c);
        }
    }
}
