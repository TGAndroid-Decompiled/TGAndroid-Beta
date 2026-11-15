package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class a9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f44968a;
    public final org.telegram.ui.Components.z70 f44969b;
    public final String f44970c;

    public a9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.z70 z70Var, String str) {
        this.f44968a = atomicBoolean;
        this.f44969b = z70Var;
        this.f44970c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f44968a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f44969b.setText(this.f44970c);
        }
    }
}
