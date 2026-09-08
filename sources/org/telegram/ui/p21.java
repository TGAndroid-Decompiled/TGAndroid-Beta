package org.telegram.ui;

import android.transition.Transition;
public final class p21 implements Transition.TransitionListener {
    public final Runnable f39419a;

    public p21(Runnable runnable) {
        this.f39419a = runnable;
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f39419a.run();
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
