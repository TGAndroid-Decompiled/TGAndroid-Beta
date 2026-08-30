package org.telegram.ui.Components;

import android.transition.Transition;
public final class a20 implements Transition.TransitionListener {
    public final c20 f23271a;

    public a20(c20 c20Var) {
        this.f23271a = c20Var;
    }

    @Override
    public final void onTransitionCancel(Transition transition) {
        this.f23271a.B.unlock();
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f23271a.B.unlock();
    }

    @Override
    public final void onTransitionStart(Transition transition) {
        this.f23271a.B.lock();
    }

    @Override
    public final void onTransitionPause(Transition transition) {
    }

    @Override
    public final void onTransitionResume(Transition transition) {
    }
}
