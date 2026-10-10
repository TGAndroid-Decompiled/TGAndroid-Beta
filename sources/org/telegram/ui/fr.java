package org.telegram.ui;

import org.telegram.messenger.AnimationNotificationsLocker;
public final class fr extends s4.j {
    public final AnimationNotificationsLocker F = new AnimationNotificationsLocker();
    public final tr G;

    public fr(tr trVar) {
        this.G = trVar;
    }

    @Override
    public final void N() {
        this.F.unlock();
    }

    @Override
    public final void O() {
        this.G.f42102c.invalidate();
    }

    @Override
    public final void P(s4.d1 d1Var) {
        this.G.f42102c.invalidate();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f47763p.isEmpty();
        boolean isEmpty2 = this.f47765r.isEmpty();
        boolean isEmpty3 = this.f47766s.isEmpty();
        boolean isEmpty4 = this.f47764q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            this.F.lock();
        }
        super.m();
    }
}
