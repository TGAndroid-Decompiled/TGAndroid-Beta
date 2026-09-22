package org.telegram.ui;

import android.transition.Transition;
public final class o21 implements Transition.TransitionListener {
    public final Runnable f36101a;

    public o21(Runnable runnable) {
        this.f36101a = runnable;
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f36101a.run();
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
