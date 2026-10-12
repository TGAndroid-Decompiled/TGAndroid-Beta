package org.telegram.ui.Components;

import android.transition.Transition;
public final class t20 implements Transition.TransitionListener {
    public final v20 f30736a;

    public t20(v20 v20Var) {
        this.f30736a = v20Var;
    }

    @Override
    public final void onTransitionCancel(Transition transition) {
        this.f30736a.E.unlock();
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f30736a.E.unlock();
    }

    @Override
    public final void onTransitionStart(Transition transition) {
        this.f30736a.E.lock();
    }

    @Override
    public final void onTransitionPause(Transition transition) {
    }

    @Override
    public final void onTransitionResume(Transition transition) {
    }
}
