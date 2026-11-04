package org.telegram.ui;

import android.transition.Transition;
public final class lx0 implements Transition.TransitionListener {
    public final Runnable f47464a;

    public lx0(Runnable runnable) {
        this.f47464a = runnable;
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f47464a.run();
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
