package org.telegram.ui.ActionBar;

import android.transition.Transition;
public final class o0 implements Transition.TransitionListener {
    public final v0 f21277a;

    public o0(v0 v0Var) {
        this.f21277a = v0Var;
    }

    @Override
    public final void onTransitionCancel(Transition transition) {
        this.f21277a.f21417i0.unlock();
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f21277a.f21417i0.unlock();
    }

    @Override
    public final void onTransitionStart(Transition transition) {
        this.f21277a.f21417i0.lock();
    }

    @Override
    public final void onTransitionPause(Transition transition) {
    }

    @Override
    public final void onTransitionResume(Transition transition) {
    }
}
