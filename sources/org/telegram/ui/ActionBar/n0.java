package org.telegram.ui.ActionBar;

import android.transition.Transition;
public final class n0 implements Transition.TransitionListener {
    public final u0 f21615a;

    public n0(u0 u0Var) {
        this.f21615a = u0Var;
    }

    @Override
    public final void onTransitionCancel(Transition transition) {
        this.f21615a.f21746i0.unlock();
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f21615a.f21746i0.unlock();
    }

    @Override
    public final void onTransitionStart(Transition transition) {
        this.f21615a.f21746i0.lock();
    }

    @Override
    public final void onTransitionPause(Transition transition) {
    }

    @Override
    public final void onTransitionResume(Transition transition) {
    }
}
