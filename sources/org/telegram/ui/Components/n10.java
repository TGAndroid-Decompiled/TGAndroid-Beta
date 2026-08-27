package org.telegram.ui.Components;

import android.transition.Transition;

public final class n10 implements Transition.TransitionListener {

    public final p10 f30812a;

    public n10(p10 p10Var) {
        this.f30812a = p10Var;
    }

    @Override
    public final void onTransitionCancel(Transition transition) {
        this.f30812a.A.unlock();
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f30812a.A.unlock();
    }

    @Override
    public final void onTransitionStart(Transition transition) {
        this.f30812a.A.lock();
    }

    @Override
    public final void onTransitionPause(Transition transition) {
    }

    @Override
    public final void onTransitionResume(Transition transition) {
    }
}
