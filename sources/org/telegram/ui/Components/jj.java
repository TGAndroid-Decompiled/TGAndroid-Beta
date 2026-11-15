package org.telegram.ui.Components;
public final class jj implements Runnable {
    public final int f36019a;
    public final lj f36020b;

    public jj(lj ljVar, int i7) {
        this.f36019a = i7;
        this.f36020b = ljVar;
    }

    @Override
    public final void run() {
        switch (this.f36019a) {
            case 0:
                lj ljVar = this.f36020b;
                if (ljVar.f36819f != null) {
                    ljVar.f36823w = org.telegram.messenger.k5.h(new StringBuilder("+"), ljVar.f36819f.phone, pf.b.c());
                    ljVar.f36822s = ljVar.f36819f;
                    org.telegram.messenger.g0.h3(new jj(ljVar, 1));
                    return;
                }
                return;
            default:
                lj ljVar2 = this.f36020b;
                ljVar2.f36817c.l(ljVar2.f36823w, false);
                return;
        }
    }
}
