package org.telegram.ui.ActionBar;

import android.transition.Transition;
public final class p0 implements Transition.TransitionListener {
    public final w0 f18528a;

    public p0(w0 w0Var) {
        this.f18528a = w0Var;
    }

    @Override
    public final void onTransitionCancel(Transition transition) {
        this.f18528a.f18696i0.unlock();
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f18528a.f18696i0.unlock();
    }

    @Override
    public final void onTransitionStart(Transition transition) {
        this.f18528a.f18696i0.lock();
    }

    @Override
    public final void onTransitionPause(Transition transition) {
    }

    @Override
    public final void onTransitionResume(Transition transition) {
    }
}
