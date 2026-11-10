package org.telegram.messenger;
public final class zb implements Runnable {
    public final int f26836a;
    public final bc f26837b;
    public final Boolean f26838c;

    public zb(bc bcVar, Boolean bool, int i7) {
        this.f26836a = i7;
        this.f26837b = bcVar;
        this.f26838c = bool;
    }

    @Override
    public final void run() {
        int i7 = this.f26836a;
        Boolean bool = this.f26838c;
        bc bcVar = this.f26837b;
        switch (i7) {
            case 0:
                bcVar.h.f22657u.remove(bcVar.f21640a.f25754e);
                g0.h3(new zb(bcVar, bool, 1));
                return;
            default:
                ub ubVar = bcVar.f21640a;
                if (bool.booleanValue()) {
                    qs.f(ubVar.f25763o).k(142, ubVar.f25754e, ubVar.f25764p);
                    return;
                } else {
                    qs.f(ubVar.f25763o).k(143, ubVar.f25754e, 2);
                    return;
                }
        }
    }
}
