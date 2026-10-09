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
        this.G.f42058c.invalidate();
    }

    @Override
    public final void P(s4.d1 d1Var) {
        this.G.f42058c.invalidate();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f47719p.isEmpty();
        boolean isEmpty2 = this.f47721r.isEmpty();
        boolean isEmpty3 = this.f47722s.isEmpty();
        boolean isEmpty4 = this.f47720q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            this.F.lock();
        }
        super.m();
    }
}
