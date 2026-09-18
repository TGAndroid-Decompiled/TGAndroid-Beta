package org.telegram.ui;

import android.transition.Transition;
public final class p21 implements Transition.TransitionListener {
    public final Runnable f36507a;

    public p21(Runnable runnable) {
        this.f36507a = runnable;
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f36507a.run();
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
