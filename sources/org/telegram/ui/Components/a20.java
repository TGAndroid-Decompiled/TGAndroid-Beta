package org.telegram.ui.Components;

import android.transition.Transition;
public final class a20 implements Transition.TransitionListener {
    public final c20 f22566a;

    public a20(c20 c20Var) {
        this.f22566a = c20Var;
    }

    @Override
    public final void onTransitionCancel(Transition transition) {
        this.f22566a.E.unlock();
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f22566a.E.unlock();
    }

    @Override
    public final void onTransitionStart(Transition transition) {
        this.f22566a.E.lock();
    }

    @Override
    public final void onTransitionPause(Transition transition) {
    }

    @Override
    public final void onTransitionResume(Transition transition) {
    }
}
