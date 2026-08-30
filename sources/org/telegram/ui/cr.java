package org.telegram.ui;

import org.telegram.messenger.AnimationNotificationsLocker;
public final class cr extends f2.l {
    public final AnimationNotificationsLocker F = new AnimationNotificationsLocker();
    public final pr G;

    public cr(pr prVar) {
        this.G = prVar;
    }

    @Override
    public final void N() {
        this.F.unlock();
    }

    @Override
    public final void O() {
        this.G.f37450c.invalidate();
    }

    @Override
    public final void P(f2.l1 l1Var) {
        this.G.f37450c.invalidate();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f5774p.isEmpty();
        boolean isEmpty2 = this.f5776r.isEmpty();
        boolean isEmpty3 = this.f5777s.isEmpty();
        boolean isEmpty4 = this.f5775q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            this.F.lock();
        }
        super.m();
    }
}
