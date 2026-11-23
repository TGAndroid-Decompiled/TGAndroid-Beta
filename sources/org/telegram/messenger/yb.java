package org.telegram.messenger;
public final class yb implements Runnable {
    public final int f28043a;
    public final ac f28044b;
    public final Boolean f28045c;

    public yb(ac acVar, Boolean bool, int i7) {
        this.f28043a = i7;
        this.f28044b = acVar;
        this.f28045c = bool;
    }

    @Override
    public final void run() {
        int i7 = this.f28043a;
        Boolean bool = this.f28045c;
        ac acVar = this.f28044b;
        switch (i7) {
            case 0:
                acVar.h.f23903u.remove(acVar.f22895a.f26993e);
                g0.g3(new yb(acVar, bool, 1));
                return;
            default:
                tb tbVar = acVar.f22895a;
                if (bool.booleanValue()) {
                    ls.f(tbVar.f27002o).k(142, tbVar.f26993e, tbVar.f27003p);
                    return;
                } else {
                    ls.f(tbVar.f27002o).k(143, tbVar.f26993e, 2);
                    return;
                }
        }
    }
}
