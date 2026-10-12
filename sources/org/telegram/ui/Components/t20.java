package org.telegram.ui.Components;

import android.transition.Transition;
public final class t20 implements Transition.TransitionListener {
    public final v20 f30733a;

    public t20(v20 v20Var) {
        this.f30733a = v20Var;
    }

    @Override
    public final void onTransitionCancel(Transition transition) {
        this.f30733a.E.unlock();
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f30733a.E.unlock();
    }

    @Override
    public final void onTransitionStart(Transition transition) {
        this.f30733a.E.lock();
    }

    @Override
    public final void onTransitionPause(Transition transition) {
    }

    @Override
    public final void onTransitionResume(Transition transition) {
    }
}
