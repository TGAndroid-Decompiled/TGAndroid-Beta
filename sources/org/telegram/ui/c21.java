package org.telegram.ui;

import android.transition.Transition;
public final class c21 implements Transition.TransitionListener {
    public final Runnable f35670a;

    public c21(Runnable runnable) {
        this.f35670a = runnable;
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f35670a.run();
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
