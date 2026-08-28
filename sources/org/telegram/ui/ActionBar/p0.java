package org.telegram.ui.ActionBar;

import android.transition.Transition;
public final class p0 implements Transition.TransitionListener {
    public final w0 f23701a;

    public p0(w0 w0Var) {
        this.f23701a = w0Var;
    }

    @Override
    public final void onTransitionCancel(Transition transition) {
        this.f23701a.f23907e0.unlock();
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f23701a.f23907e0.unlock();
    }

    @Override
    public final void onTransitionStart(Transition transition) {
        this.f23701a.f23907e0.lock();
    }

    @Override
    public final void onTransitionPause(Transition transition) {
    }

    @Override
    public final void onTransitionResume(Transition transition) {
    }
}
