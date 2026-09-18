package org.telegram.ui;

import org.telegram.messenger.AnimationNotificationsLocker;
public final class fr extends s4.j {
    public final AnimationNotificationsLocker F = new AnimationNotificationsLocker();
    public final sr G;

    public fr(sr srVar) {
        this.G = srVar;
    }

    @Override
    public final void N() {
        this.F.unlock();
    }

    @Override
    public final void O() {
        this.G.f37398c.invalidate();
    }

    @Override
    public final void P(s4.c1 c1Var) {
        this.G.f37398c.invalidate();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f42987p.isEmpty();
        boolean isEmpty2 = this.f42989r.isEmpty();
        boolean isEmpty3 = this.f42990s.isEmpty();
        boolean isEmpty4 = this.f42988q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            this.F.lock();
        }
        super.m();
    }
}
