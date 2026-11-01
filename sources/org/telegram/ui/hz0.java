package org.telegram.ui;

import android.transition.Transition;
public final class hz0 implements Transition.TransitionListener {
    public final Runnable f37906a;

    public hz0(Runnable runnable) {
        this.f37906a = runnable;
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f37906a.run();
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
