package org.telegram.ui;

import org.telegram.messenger.AnimationNotificationsLocker;
public final class ir extends s4.j {
    public final AnimationNotificationsLocker F = new AnimationNotificationsLocker();
    public final wr G;

    public ir(wr wrVar) {
        this.G = wrVar;
    }

    @Override
    public final void N() {
        this.F.unlock();
    }

    @Override
    public final void O() {
        this.G.f43614c.invalidate();
    }

    @Override
    public final void P(s4.d1 d1Var) {
        this.G.f43614c.invalidate();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f47950p.isEmpty();
        boolean isEmpty2 = this.f47952r.isEmpty();
        boolean isEmpty3 = this.f47953s.isEmpty();
        boolean isEmpty4 = this.f47951q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            this.F.lock();
        }
        super.m();
    }
}
