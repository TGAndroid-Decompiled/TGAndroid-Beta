package org.telegram.messenger;
public final class yb implements Runnable {
    public final int f27692a;
    public final ac f27693b;
    public final Boolean f27694c;

    public yb(ac acVar, Boolean bool, int i7) {
        this.f27692a = i7;
        this.f27693b = acVar;
        this.f27694c = bool;
    }

    @Override
    public final void run() {
        int i7 = this.f27692a;
        Boolean bool = this.f27694c;
        ac acVar = this.f27693b;
        switch (i7) {
            case 0:
                acVar.h.f23478u.remove(acVar.f22486a.f26637e);
                g0.h3(new yb(acVar, bool, 1));
                return;
            default:
                tb tbVar = acVar.f22486a;
                if (bool.booleanValue()) {
                    ns.f(tbVar.f26646o).k(142, tbVar.f26637e, tbVar.f26647p);
                    return;
                } else {
                    ns.f(tbVar.f26646o).k(143, tbVar.f26637e, 2);
                    return;
                }
        }
    }
}
