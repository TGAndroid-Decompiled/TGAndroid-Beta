package org.telegram.ui;

import org.telegram.messenger.AnimationNotificationsLocker;
public final class lr extends s4.k {
    public final AnimationNotificationsLocker F = new AnimationNotificationsLocker();
    public final yr G;

    public lr(yr yrVar) {
        this.G = yrVar;
    }

    @Override
    public final void N() {
        this.F.unlock();
    }

    @Override
    public final void O() {
        this.G.f41895c.invalidate();
    }

    @Override
    public final void P(s4.b1 b1Var) {
        this.G.f41895c.invalidate();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f44902p.isEmpty();
        boolean isEmpty2 = this.f44904r.isEmpty();
        boolean isEmpty3 = this.f44905s.isEmpty();
        boolean isEmpty4 = this.f44903q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            this.F.lock();
        }
        super.m();
    }
}
