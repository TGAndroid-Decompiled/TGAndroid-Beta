package org.telegram.messenger;
public final class yb implements Runnable {
    public final int f27694a;
    public final ac f27695b;
    public final Boolean f27696c;

    public yb(ac acVar, Boolean bool, int i7) {
        this.f27694a = i7;
        this.f27695b = acVar;
        this.f27696c = bool;
    }

    @Override
    public final void run() {
        int i7 = this.f27694a;
        Boolean bool = this.f27696c;
        ac acVar = this.f27695b;
        switch (i7) {
            case 0:
                acVar.h.f23481u.remove(acVar.f22486a.f26646e);
                g0.h3(new yb(acVar, bool, 1));
                return;
            default:
                tb tbVar = acVar.f22486a;
                if (bool.booleanValue()) {
                    ns.f(tbVar.f26655o).k(142, tbVar.f26646e, tbVar.f26656p);
                    return;
                } else {
                    ns.f(tbVar.f26655o).k(143, tbVar.f26646e, 2);
                    return;
                }
        }
    }
}
