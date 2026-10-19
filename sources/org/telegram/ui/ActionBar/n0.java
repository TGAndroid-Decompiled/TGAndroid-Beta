package org.telegram.ui.ActionBar;

import android.transition.Transition;
public final class n0 implements Transition.TransitionListener {
    public final u0 f21608a;

    public n0(u0 u0Var) {
        this.f21608a = u0Var;
    }

    @Override
    public final void onTransitionCancel(Transition transition) {
        this.f21608a.f21739i0.unlock();
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f21608a.f21739i0.unlock();
    }

    @Override
    public final void onTransitionStart(Transition transition) {
        this.f21608a.f21739i0.lock();
    }

    @Override
    public final void onTransitionPause(Transition transition) {
    }

    @Override
    public final void onTransitionResume(Transition transition) {
    }
}
