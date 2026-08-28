package org.telegram.ui;

import android.transition.Transition;
public final class j11 implements Transition.TransitionListener {
    public final Runnable f39340a;

    public j11(Runnable runnable) {
        this.f39340a = runnable;
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f39340a.run();
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
