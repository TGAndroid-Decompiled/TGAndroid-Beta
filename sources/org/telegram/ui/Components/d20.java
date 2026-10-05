package org.telegram.ui.Components;

import android.transition.Transition;
public final class d20 implements Transition.TransitionListener {
    public final f20 f25594a;

    public d20(f20 f20Var) {
        this.f25594a = f20Var;
    }

    @Override
    public final void onTransitionCancel(Transition transition) {
        this.f25594a.E.unlock();
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f25594a.E.unlock();
    }

    @Override
    public final void onTransitionStart(Transition transition) {
        this.f25594a.E.lock();
    }

    @Override
    public final void onTransitionPause(Transition transition) {
    }

    @Override
    public final void onTransitionResume(Transition transition) {
    }
}
