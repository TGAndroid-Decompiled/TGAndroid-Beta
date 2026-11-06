package org.telegram.messenger;
public final class zb implements Runnable {
    public final int f26808a;
    public final bc f26809b;
    public final Boolean f26810c;

    public zb(bc bcVar, Boolean bool, int i7) {
        this.f26808a = i7;
        this.f26809b = bcVar;
        this.f26810c = bool;
    }

    @Override
    public final void run() {
        int i7 = this.f26808a;
        Boolean bool = this.f26810c;
        bc bcVar = this.f26809b;
        switch (i7) {
            case 0:
                bcVar.h.f22634u.remove(bcVar.f21608a.f25744e);
                g0.h3(new zb(bcVar, bool, 1));
                return;
            default:
                ub ubVar = bcVar.f21608a;
                if (bool.booleanValue()) {
                    qs.f(ubVar.f25753o).k(142, ubVar.f25744e, ubVar.f25754p);
                    return;
                } else {
                    qs.f(ubVar.f25753o).k(143, ubVar.f25744e, 2);
                    return;
                }
        }
    }
}
