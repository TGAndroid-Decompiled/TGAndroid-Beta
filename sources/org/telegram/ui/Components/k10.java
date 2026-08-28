package org.telegram.ui.Components;

import android.transition.Transition;
public final class k10 implements Transition.TransitionListener {
    public final m10 f29907a;

    public k10(m10 m10Var) {
        this.f29907a = m10Var;
    }

    @Override
    public final void onTransitionCancel(Transition transition) {
        this.f29907a.A.unlock();
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f29907a.A.unlock();
    }

    @Override
    public final void onTransitionStart(Transition transition) {
        this.f29907a.A.lock();
    }

    @Override
    public final void onTransitionPause(Transition transition) {
    }

    @Override
    public final void onTransitionResume(Transition transition) {
    }
}
