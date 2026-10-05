package org.telegram.ui;

import org.telegram.messenger.AnimationNotificationsLocker;
public final class er extends s4.j {
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
        this.G.f40170c.invalidate();
    }

    @Override
    public final void P(s4.c1 c1Var) {
        this.G.f40170c.invalidate();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f46604p.isEmpty();
        boolean isEmpty2 = this.f46606r.isEmpty();
        boolean isEmpty3 = this.f46607s.isEmpty();
        boolean isEmpty4 = this.f46605q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            this.F.lock();
        }
        super.m();
    }
}
