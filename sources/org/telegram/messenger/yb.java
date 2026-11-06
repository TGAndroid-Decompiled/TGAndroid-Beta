package org.telegram.messenger;
public final class yb implements Runnable {
    public final int f26615a;
    public final bc f26616b;

    public yb(bc bcVar, int i7) {
        this.f26615a = i7;
        this.f26616b = bcVar;
    }

    @Override
    public final void run() {
        int i7 = this.f26615a;
        bc bcVar = this.f26616b;
        switch (i7) {
            case 0:
                gc gcVar = bcVar.h;
                ThreadLocal threadLocal = gc.I;
                gcVar.V(true);
                return;
            case 1:
                bcVar.h.f22634u.remove(bcVar.f21608a.f25744e);
                g0.h3(new yb(bcVar, 3));
                return;
            case 2:
                gc gcVar2 = bcVar.h;
                ThreadLocal threadLocal2 = gc.I;
                gcVar2.V(true);
                return;
            default:
                ub ubVar = bcVar.f21608a;
                qs.f(ubVar.f25753o).k(143, ubVar.f25744e, 1);
                return;
        }
    }
}
