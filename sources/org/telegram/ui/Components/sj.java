package org.telegram.ui.Components;
public final class sj implements Runnable {
    public final int f39560a;
    public final uj f39561b;

    public sj(uj ujVar, int i7) {
        this.f39560a = i7;
        this.f39561b = ujVar;
    }

    @Override
    public final void run() {
        switch (this.f39560a) {
            case 0:
                uj ujVar = this.f39561b;
                if (ujVar.f40444f != null) {
                    ujVar.f40448w = org.telegram.messenger.o10.h(new StringBuilder("+"), ujVar.f40444f.phone, pf.b.c());
                    ujVar.f40447s = ujVar.f40444f;
                    org.telegram.messenger.g0.g3(new sj(ujVar, 1));
                    return;
                }
                return;
            default:
                uj ujVar2 = this.f39561b;
                ujVar2.f40442c.l(ujVar2.f40448w, false);
                return;
        }
    }
}
