package org.telegram.ui;

import android.transition.Transition;
public final class n21 implements Transition.TransitionListener {
    public final Runnable f35882a;

    public n21(Runnable runnable) {
        this.f35882a = runnable;
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f35882a.run();
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
