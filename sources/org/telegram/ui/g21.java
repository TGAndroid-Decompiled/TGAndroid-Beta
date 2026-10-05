package org.telegram.ui;

import android.transition.Transition;
public final class g21 implements Transition.TransitionListener {
    public final Runnable f36492a;

    public g21(Runnable runnable) {
        this.f36492a = runnable;
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f36492a.run();
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
