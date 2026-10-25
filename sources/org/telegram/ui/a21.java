package org.telegram.ui;

import android.transition.Transition;
public final class a21 implements Transition.TransitionListener {
    public final Runnable f37624a;

    public a21(Runnable runnable) {
        this.f37624a = runnable;
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f37624a.run();
    }

    @Override
    public final void onTransitionCancel(Transition transition) {
    }

    @Override
    public final void onTransitionPause(Transition transition) {
    }

    @Override
    public final void onTransitionResume(Transition transition) {
    }

    @Override
    public final void onTransitionStart(Transition transition) {
    }
}
