package org.telegram.ui.Components;
public final class sj implements Runnable {
    public final int f39612a;
    public final uj f39613b;

    public sj(uj ujVar, int i7) {
        this.f39612a = i7;
        this.f39613b = ujVar;
    }

    @Override
    public final void run() {
        switch (this.f39612a) {
            case 0:
                uj ujVar = this.f39613b;
                if (ujVar.f40467f != null) {
                    ujVar.f40471w = org.telegram.messenger.n10.h(new StringBuilder("+"), ujVar.f40467f.phone, pf.b.c());
                    ujVar.f40470s = ujVar.f40467f;
                    org.telegram.messenger.g0.g3(new sj(ujVar, 1));
                    return;
                }
                return;
            default:
                uj ujVar2 = this.f39613b;
                ujVar2.f40465c.l(ujVar2.f40471w, false);
                return;
        }
    }
}
