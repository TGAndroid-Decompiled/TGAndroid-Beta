package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class d9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f36296a;
    public final org.telegram.ui.Components.x90 f36297b;
    public final String f36298c;

    public d9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.x90 x90Var, String str) {
        this.f36296a = atomicBoolean;
        this.f36297b = x90Var;
        this.f36298c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f36296a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f36297b.setText(this.f36298c);
        }
    }
}
