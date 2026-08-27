package org.telegram.ui.ActionBar;

import android.transition.Transition;

public final class o0 implements Transition.TransitionListener {

    public final v0 f23694a;

    public o0(v0 v0Var) {
        this.f23694a = v0Var;
    }

    @Override
    public final void onTransitionCancel(Transition transition) {
        this.f23694a.f23860e0.unlock();
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f23694a.f23860e0.unlock();
    }

    @Override
    public final void onTransitionStart(Transition transition) {
        this.f23694a.f23860e0.lock();
    }

    @Override
    public final void onTransitionPause(Transition transition) {
    }

    @Override
    public final void onTransitionResume(Transition transition) {
    }
}
