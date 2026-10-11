package org.telegram.ui;

import android.transition.Transition;
public final class l21 implements Transition.TransitionListener {
    public final Runnable f39494a;

    public l21(Runnable runnable) {
        this.f39494a = runnable;
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f39494a.run();
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
