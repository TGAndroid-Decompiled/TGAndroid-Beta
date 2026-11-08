package org.telegram.messenger;
public final class yb implements Runnable {
    public final int f26624a;
    public final bc f26625b;

    public yb(bc bcVar, int i7) {
        this.f26624a = i7;
        this.f26625b = bcVar;
    }

    @Override
    public final void run() {
        int i7 = this.f26624a;
        bc bcVar = this.f26625b;
        switch (i7) {
            case 0:
                gc gcVar = bcVar.h;
                ThreadLocal threadLocal = gc.I;
                gcVar.V(true);
                return;
            case 1:
                bcVar.h.f22653u.remove(bcVar.f21635a.f25750e);
                g0.h3(new yb(bcVar, 3));
                return;
            case 2:
                gc gcVar2 = bcVar.h;
                ThreadLocal threadLocal2 = gc.I;
                gcVar2.V(true);
                return;
            default:
                ub ubVar = bcVar.f21635a;
                qs.f(ubVar.f25759o).k(143, ubVar.f25750e, 1);
                return;
        }
    }
}
