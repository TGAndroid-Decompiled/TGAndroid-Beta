package org.telegram.messenger;
public final class yb implements Runnable {
    public final int f28007a;
    public final ac f28008b;
    public final Boolean f28009c;

    public yb(ac acVar, Boolean bool, int i7) {
        this.f28007a = i7;
        this.f28008b = acVar;
        this.f28009c = bool;
    }

    @Override
    public final void run() {
        int i7 = this.f28007a;
        Boolean bool = this.f28009c;
        ac acVar = this.f28008b;
        switch (i7) {
            case 0:
                acVar.h.f23867u.remove(acVar.f22859a.f26957e);
                g0.g3(new yb(acVar, bool, 1));
                return;
            default:
                tb tbVar = acVar.f22859a;
                if (bool.booleanValue()) {
                    ls.f(tbVar.f26966o).k(142, tbVar.f26957e, tbVar.f26967p);
                    return;
                } else {
                    ls.f(tbVar.f26966o).k(143, tbVar.f26957e, 2);
                    return;
                }
        }
    }
}
