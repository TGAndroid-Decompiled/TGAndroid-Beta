package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
public final class d9 extends AnimatorListenerAdapter {
    public final AtomicBoolean f36100a;
    public final org.telegram.ui.Components.x90 f36101b;
    public final String f36102c;

    public d9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.x90 x90Var, String str) {
        this.f36100a = atomicBoolean;
        this.f36101b = x90Var;
        this.f36102c = str;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.f36100a;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.f36101b.setText(this.f36102c);
        }
    }
}
