package org.telegram.ui.Components;

import android.transition.Transition;
public final class v10 implements Transition.TransitionListener {
    public final x10 f33418a;

    public v10(x10 x10Var) {
        this.f33418a = x10Var;
    }

    @Override
    public final void onTransitionCancel(Transition transition) {
        this.f33418a.A.unlock();
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f33418a.A.unlock();
    }

    @Override
    public final void onTransitionStart(Transition transition) {
        this.f33418a.A.lock();
    }

    @Override
    public final void onTransitionPause(Transition transition) {
    }

    @Override
    public final void onTransitionResume(Transition transition) {
    }
}
