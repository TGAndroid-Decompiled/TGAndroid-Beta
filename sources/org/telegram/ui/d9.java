package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class d9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f36689a;
    public final org.telegram.ui.Components.ia0 f36690b;
    public final String f36691c;

    public d9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.ia0 ia0Var, String str) {
        this.f36689a = atomicBoolean;
        this.f36690b = ia0Var;
        this.f36691c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f36689a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f36690b.setText(this.f36691c);
        }
    }
}
