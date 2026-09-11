package org.telegram.ui.ActionBar;

import android.transition.Transition;
public final class o0 implements Transition.TransitionListener {
    public final v0 f21249a;

    public o0(v0 v0Var) {
        this.f21249a = v0Var;
    }

    @Override
    public final void onTransitionCancel(Transition transition) {
        this.f21249a.f21389i0.unlock();
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f21249a.f21389i0.unlock();
    }

    @Override
    public final void onTransitionStart(Transition transition) {
        this.f21249a.f21389i0.lock();
    }

    @Override
    public final void onTransitionPause(Transition transition) {
    }

    @Override
    public final void onTransitionResume(Transition transition) {
    }
}
