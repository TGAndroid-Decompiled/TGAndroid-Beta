package org.telegram.ui.Components;

import android.transition.Transition;
public final class k20 implements Transition.TransitionListener {
    public final m20 f29782a;

    public k20(m20 m20Var) {
        this.f29782a = m20Var;
    }

    @Override
    public final void onTransitionCancel(Transition transition) {
        this.f29782a.E.unlock();
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f29782a.E.unlock();
    }

    @Override
    public final void onTransitionStart(Transition transition) {
        this.f29782a.E.lock();
    }

    @Override
    public final void onTransitionPause(Transition transition) {
    }

    @Override
    public final void onTransitionResume(Transition transition) {
    }
}
