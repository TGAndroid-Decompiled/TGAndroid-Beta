package org.telegram.ui.Components;

import android.transition.Transition;
public final class z10 implements Transition.TransitionListener {
    public final b20 f33046a;

    public z10(b20 b20Var) {
        this.f33046a = b20Var;
    }

    @Override
    public final void onTransitionCancel(Transition transition) {
        this.f33046a.E.unlock();
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f33046a.E.unlock();
    }

    @Override
    public final void onTransitionStart(Transition transition) {
        this.f33046a.E.lock();
    }

    @Override
    public final void onTransitionPause(Transition transition) {
    }

    @Override
    public final void onTransitionResume(Transition transition) {
    }
}
