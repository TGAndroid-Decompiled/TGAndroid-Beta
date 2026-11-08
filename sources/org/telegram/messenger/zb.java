package org.telegram.messenger;
public final class zb implements Runnable {
    public final int f26832a;
    public final bc f26833b;
    public final Boolean f26834c;

    public zb(bc bcVar, Boolean bool, int i7) {
        this.f26832a = i7;
        this.f26833b = bcVar;
        this.f26834c = bool;
    }

    @Override
    public final void run() {
        int i7 = this.f26832a;
        Boolean bool = this.f26834c;
        bc bcVar = this.f26833b;
        switch (i7) {
            case 0:
                bcVar.h.f22653u.remove(bcVar.f21635a.f25750e);
                g0.h3(new zb(bcVar, bool, 1));
                return;
            default:
                ub ubVar = bcVar.f21635a;
                if (bool.booleanValue()) {
                    qs.f(ubVar.f25759o).k(142, ubVar.f25750e, ubVar.f25760p);
                    return;
                } else {
                    qs.f(ubVar.f25759o).k(143, ubVar.f25750e, 2);
                    return;
                }
        }
    }
}
