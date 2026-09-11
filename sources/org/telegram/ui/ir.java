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
        this.G.f41635c.invalidate();
    }

    @Override
    public final void P(s4.c1 c1Var) {
        this.G.f41635c.invalidate();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f45804p.isEmpty();
        boolean isEmpty2 = this.f45806r.isEmpty();
        boolean isEmpty3 = this.f45807s.isEmpty();
        boolean isEmpty4 = this.f45805q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            this.F.lock();
        }
        super.m();
    }
}
