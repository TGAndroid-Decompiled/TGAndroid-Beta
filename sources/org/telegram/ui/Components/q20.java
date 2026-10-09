package org.telegram.ui.Components;

import android.transition.Transition;
public final class q20 implements Transition.TransitionListener {
    public final s20 f30001a;

    public q20(s20 s20Var) {
        this.f30001a = s20Var;
    }

    @Override
    public final void onTransitionCancel(Transition transition) {
        this.f30001a.E.unlock();
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f30001a.E.unlock();
    }

    @Override
    public final void onTransitionStart(Transition transition) {
        this.f30001a.E.lock();
    }

    @Override
    public final void onTransitionPause(Transition transition) {
    }

    @Override
    public final void onTransitionResume(Transition transition) {
    }
}
