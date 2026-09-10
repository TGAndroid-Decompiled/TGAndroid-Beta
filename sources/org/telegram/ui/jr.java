package org.telegram.ui;

import org.telegram.messenger.AnimationNotificationsLocker;
public final class jr extends s4.j {
    public final AnimationNotificationsLocker F = new AnimationNotificationsLocker();
    public final wr G;

    public jr(wr wrVar) {
        this.G = wrVar;
    }

    @Override
    public final void N() {
        this.F.unlock();
    }

    @Override
    public final void O() {
        this.G.f38323c.invalidate();
    }

    @Override
    public final void P(s4.c1 c1Var) {
        this.G.f38323c.invalidate();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f41668p.isEmpty();
        boolean isEmpty2 = this.f41670r.isEmpty();
        boolean isEmpty3 = this.f41671s.isEmpty();
        boolean isEmpty4 = this.f41669q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            this.F.lock();
        }
        super.m();
    }
}
