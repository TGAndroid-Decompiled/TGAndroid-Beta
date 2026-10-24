package org.telegram.ui.Components;

import android.transition.Transition;
public final class g20 implements Transition.TransitionListener {
    public final i20 f26533a;

    public g20(i20 i20Var) {
        this.f26533a = i20Var;
    }

    @Override
    public final void onTransitionCancel(Transition transition) {
        this.f26533a.E.unlock();
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f26533a.E.unlock();
    }

    @Override
    public final void onTransitionStart(Transition transition) {
        this.f26533a.E.lock();
    }

    @Override
    public final void onTransitionPause(Transition transition) {
    }

    @Override
    public final void onTransitionResume(Transition transition) {
    }
}
