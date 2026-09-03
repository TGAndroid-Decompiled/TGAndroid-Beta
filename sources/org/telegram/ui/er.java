package org.telegram.ui;

import org.telegram.messenger.AnimationNotificationsLocker;
public final class er extends f2.l {
    public final AnimationNotificationsLocker F = new AnimationNotificationsLocker();
    public final rr G;

    public er(rr rrVar) {
        this.G = rrVar;
    }

    @Override
    public final void N() {
        this.F.unlock();
    }

    @Override
    public final void O() {
        this.G.f37961c.invalidate();
    }

    @Override
    public final void P(f2.l1 l1Var) {
        this.G.f37961c.invalidate();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f5763p.isEmpty();
        boolean isEmpty2 = this.f5765r.isEmpty();
        boolean isEmpty3 = this.f5766s.isEmpty();
        boolean isEmpty4 = this.f5764q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            this.F.lock();
        }
        super.m();
    }
}
