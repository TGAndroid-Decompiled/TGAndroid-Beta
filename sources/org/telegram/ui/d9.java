package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class d9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f36687a;
    public final org.telegram.ui.Components.ia0 f36688b;
    public final String f36689c;

    public d9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.ia0 ia0Var, String str) {
        this.f36687a = atomicBoolean;
        this.f36688b = ia0Var;
        this.f36689c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f36687a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f36688b.setText(this.f36689c);
        }
    }
}
