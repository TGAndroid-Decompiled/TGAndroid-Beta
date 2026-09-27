package org.telegram.ui.Components;

import android.transition.Transition;
public final class c20 implements Transition.TransitionListener {
    public final e20 f23191a;

    public c20(e20 e20Var) {
        this.f23191a = e20Var;
    }

    @Override
    public final void onTransitionCancel(Transition transition) {
        this.f23191a.E.unlock();
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f23191a.E.unlock();
    }

    @Override
    public final void onTransitionStart(Transition transition) {
        this.f23191a.E.lock();
    }

    @Override
    public final void onTransitionPause(Transition transition) {
    }

    @Override
    public final void onTransitionResume(Transition transition) {
    }
}
