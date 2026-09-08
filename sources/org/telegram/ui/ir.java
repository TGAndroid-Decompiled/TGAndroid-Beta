package org.telegram.ui;

import org.telegram.messenger.AnimationNotificationsLocker;
public final class ir extends s4.j {
    public final AnimationNotificationsLocker F = new AnimationNotificationsLocker();
    public final vr G;

    public ir(vr vrVar) {
        this.G = vrVar;
    }

    @Override
    public final void N() {
        this.F.unlock();
    }

    @Override
    public final void O() {
        this.G.f41662c.invalidate();
    }

    @Override
    public final void P(s4.c1 c1Var) {
        this.G.f41662c.invalidate();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f45832p.isEmpty();
        boolean isEmpty2 = this.f45834r.isEmpty();
        boolean isEmpty3 = this.f45835s.isEmpty();
        boolean isEmpty4 = this.f45833q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            this.F.lock();
        }
        super.m();
    }
}
