package org.telegram.ui;

import android.transition.Transition;
public final class iz0 implements Transition.TransitionListener {
    public final Runnable f38388a;

    public iz0(Runnable runnable) {
        this.f38388a = runnable;
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f38388a.run();
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
