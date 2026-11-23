package org.telegram.ui.Components;
public final class sj implements Runnable {
    public final int f39604a;
    public final uj f39605b;

    public sj(uj ujVar, int i7) {
        this.f39604a = i7;
        this.f39605b = ujVar;
    }

    @Override
    public final void run() {
        switch (this.f39604a) {
            case 0:
                uj ujVar = this.f39605b;
                if (ujVar.f40459f != null) {
                    ujVar.f40463w = org.telegram.messenger.o10.h(new StringBuilder("+"), ujVar.f40459f.phone, pf.b.c());
                    ujVar.f40462s = ujVar.f40459f;
                    org.telegram.messenger.g0.g3(new sj(ujVar, 1));
                    return;
                }
                return;
            default:
                uj ujVar2 = this.f39605b;
                ujVar2.f40457c.l(ujVar2.f40463w, false);
                return;
        }
    }
}
