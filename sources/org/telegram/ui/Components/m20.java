package org.telegram.ui.Components;

import android.transition.Transition;
public final class m20 implements Transition.TransitionListener {
    public final o20 f26890a;

    public m20(o20 o20Var) {
        this.f26890a = o20Var;
    }

    @Override
    public final void onTransitionCancel(Transition transition) {
        this.f26890a.E.unlock();
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f26890a.E.unlock();
    }

    @Override
    public final void onTransitionStart(Transition transition) {
        this.f26890a.E.lock();
    }

    @Override
    public final void onTransitionPause(Transition transition) {
    }

    @Override
    public final void onTransitionResume(Transition transition) {
    }
}
