package org.telegram.ui;

import org.telegram.messenger.AnimationNotificationsLocker;
public final class cr extends s4.j {
    public final AnimationNotificationsLocker F = new AnimationNotificationsLocker();
    public final pr G;

    public cr(pr prVar) {
        this.G = prVar;
    }

    @Override
    public final void N() {
        this.F.unlock();
    }

    @Override
    public final void O() {
        this.G.f36615c.invalidate();
    }

    @Override
    public final void P(s4.c1 c1Var) {
        this.G.f36615c.invalidate();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f43018p.isEmpty();
        boolean isEmpty2 = this.f43020r.isEmpty();
        boolean isEmpty3 = this.f43021s.isEmpty();
        boolean isEmpty4 = this.f43019q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            this.F.lock();
        }
        super.m();
    }
}
