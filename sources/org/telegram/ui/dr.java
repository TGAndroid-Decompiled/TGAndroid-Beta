package org.telegram.ui;

import org.telegram.messenger.AnimationNotificationsLocker;
public final class dr extends s4.j {
    public final AnimationNotificationsLocker F = new AnimationNotificationsLocker();
    public final qr G;

    public dr(qr qrVar) {
        this.G = qrVar;
    }

    @Override
    public final void N() {
        this.F.unlock();
    }

    @Override
    public final void O() {
        this.G.f36551c.invalidate();
    }

    @Override
    public final void P(s4.c1 c1Var) {
        this.G.f36551c.invalidate();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f42685p.isEmpty();
        boolean isEmpty2 = this.f42687r.isEmpty();
        boolean isEmpty3 = this.f42688s.isEmpty();
        boolean isEmpty4 = this.f42686q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            this.F.lock();
        }
        super.m();
    }
}
