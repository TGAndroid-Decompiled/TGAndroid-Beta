package org.telegram.messenger;
public final class yb implements Runnable {
    public final int f26607a;
    public final bc f26608b;

    public yb(bc bcVar, int i7) {
        this.f26607a = i7;
        this.f26608b = bcVar;
    }

    @Override
    public final void run() {
        int i7 = this.f26607a;
        bc bcVar = this.f26608b;
        switch (i7) {
            case 0:
                gc gcVar = bcVar.h;
                ThreadLocal threadLocal = gc.I;
                gcVar.V(true);
                return;
            case 1:
                bcVar.h.f22627u.remove(bcVar.f21607a.f25736e);
                g0.h3(new yb(bcVar, 3));
                return;
            case 2:
                gc gcVar2 = bcVar.h;
                ThreadLocal threadLocal2 = gc.I;
                gcVar2.V(true);
                return;
            default:
                ub ubVar = bcVar.f21607a;
                qs.f(ubVar.f25745o).k(143, ubVar.f25736e, 1);
                return;
        }
    }
}
