package org.telegram.messenger;
public final class yb implements Runnable {
    public final int f26628a;
    public final bc f26629b;

    public yb(bc bcVar, int i7) {
        this.f26628a = i7;
        this.f26629b = bcVar;
    }

    @Override
    public final void run() {
        int i7 = this.f26628a;
        bc bcVar = this.f26629b;
        switch (i7) {
            case 0:
                gc gcVar = bcVar.h;
                ThreadLocal threadLocal = gc.I;
                gcVar.V(true);
                return;
            case 1:
                bcVar.h.f22657u.remove(bcVar.f21640a.f25754e);
                g0.h3(new yb(bcVar, 3));
                return;
            case 2:
                gc gcVar2 = bcVar.h;
                ThreadLocal threadLocal2 = gc.I;
                gcVar2.V(true);
                return;
            default:
                ub ubVar = bcVar.f21640a;
                qs.f(ubVar.f25763o).k(143, ubVar.f25754e, 1);
                return;
        }
    }
}
