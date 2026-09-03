package org.telegram.ui.ActionBar;

import android.transition.Transition;
public final class p0 implements Transition.TransitionListener {
    public final w0 f20485a;

    public p0(w0 w0Var) {
        this.f20485a = w0Var;
    }

    @Override
    public final void onTransitionCancel(Transition transition) {
        this.f20485a.f20631f0.unlock();
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f20485a.f20631f0.unlock();
    }

    @Override
    public final void onTransitionStart(Transition transition) {
        this.f20485a.f20631f0.lock();
    }

    @Override
    public final void onTransitionPause(Transition transition) {
    }

    @Override
    public final void onTransitionResume(Transition transition) {
    }
}
