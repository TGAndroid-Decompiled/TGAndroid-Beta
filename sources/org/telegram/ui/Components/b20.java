package org.telegram.ui.Components;

import android.transition.Transition;
public final class b20 implements Transition.TransitionListener {
    public final d20 f25476a;

    public b20(d20 d20Var) {
        this.f25476a = d20Var;
    }

    @Override
    public final void onTransitionCancel(Transition transition) {
        this.f25476a.B.unlock();
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f25476a.B.unlock();
    }

    @Override
    public final void onTransitionStart(Transition transition) {
        this.f25476a.B.lock();
    }

    @Override
    public final void onTransitionPause(Transition transition) {
    }

    @Override
    public final void onTransitionResume(Transition transition) {
    }
}
