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
        this.G.f41663c.invalidate();
    }

    @Override
    public final void P(s4.c1 c1Var) {
        this.G.f41663c.invalidate();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f45833p.isEmpty();
        boolean isEmpty2 = this.f45835r.isEmpty();
        boolean isEmpty3 = this.f45836s.isEmpty();
        boolean isEmpty4 = this.f45834q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            this.F.lock();
        }
        super.m();
    }
}
