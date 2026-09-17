package org.telegram.ui;

import org.telegram.messenger.AnimationNotificationsLocker;
public final class hr extends s4.j {
    public final AnimationNotificationsLocker F = new AnimationNotificationsLocker();
    public final ur G;

    public hr(ur urVar) {
        this.G = urVar;
    }

    @Override
    public final void N() {
        this.F.unlock();
    }

    @Override
    public final void O() {
        this.G.f38123c.invalidate();
    }

    @Override
    public final void P(s4.c1 c1Var) {
        this.G.f38123c.invalidate();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f42755p.isEmpty();
        boolean isEmpty2 = this.f42757r.isEmpty();
        boolean isEmpty3 = this.f42758s.isEmpty();
        boolean isEmpty4 = this.f42756q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            this.F.lock();
        }
        super.m();
    }
}
