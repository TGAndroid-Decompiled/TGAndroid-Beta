package org.telegram.ui;

import org.telegram.messenger.AnimationNotificationsLocker;
public final class dr extends f2.l {
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
        this.G.f40573c.invalidate();
    }

    @Override
    public final void P(f2.m1 m1Var) {
        this.G.f40573c.invalidate();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f5853p.isEmpty();
        boolean isEmpty2 = this.f5855r.isEmpty();
        boolean isEmpty3 = this.f5856s.isEmpty();
        boolean isEmpty4 = this.f5854q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            this.F.lock();
        }
        super.m();
    }
}
