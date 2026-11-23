package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class a9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f45512a;
    public final org.telegram.ui.Components.m80 f45513b;
    public final String f45514c;

    public a9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.m80 m80Var, String str) {
        this.f45512a = atomicBoolean;
        this.f45513b = m80Var;
        this.f45514c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f45512a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f45513b.setText(this.f45514c);
        }
    }
}
