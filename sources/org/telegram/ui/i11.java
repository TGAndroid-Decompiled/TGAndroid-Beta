package org.telegram.ui;

import android.transition.Transition;

public final class i11 implements Transition.TransitionListener {

    public final Runnable f38958a;

    public i11(Runnable runnable) {
        this.f38958a = runnable;
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f38958a.run();
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
