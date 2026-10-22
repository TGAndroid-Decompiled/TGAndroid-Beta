package org.telegram.ui.Components;

import android.transition.Transition;
public final class i20 implements Transition.TransitionListener {
    public final k20 f27100a;

    public i20(k20 k20Var) {
        this.f27100a = k20Var;
    }

    @Override
    public final void onTransitionCancel(Transition transition) {
        this.f27100a.E.unlock();
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f27100a.E.unlock();
    }

    @Override
    public final void onTransitionStart(Transition transition) {
        this.f27100a.E.lock();
    }

    @Override
    public final void onTransitionPause(Transition transition) {
    }

    @Override
    public final void onTransitionResume(Transition transition) {
    }
}
