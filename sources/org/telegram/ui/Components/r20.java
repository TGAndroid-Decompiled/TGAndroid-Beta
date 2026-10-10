package org.telegram.ui.Components;

import android.transition.Transition;
public final class r20 implements Transition.TransitionListener {
    public final t20 f30346a;

    public r20(t20 t20Var) {
        this.f30346a = t20Var;
    }

    @Override
    public final void onTransitionCancel(Transition transition) {
        this.f30346a.E.unlock();
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f30346a.E.unlock();
    }

    @Override
    public final void onTransitionStart(Transition transition) {
        this.f30346a.E.lock();
    }

    @Override
    public final void onTransitionPause(Transition transition) {
    }

    @Override
    public final void onTransitionResume(Transition transition) {
    }
}
