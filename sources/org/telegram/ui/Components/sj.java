package org.telegram.ui.Components;
public final class sj implements Runnable {
    public final int f39605a;
    public final uj f39606b;

    public sj(uj ujVar, int i7) {
        this.f39605a = i7;
        this.f39606b = ujVar;
    }

    @Override
    public final void run() {
        switch (this.f39605a) {
            case 0:
                uj ujVar = this.f39606b;
                if (ujVar.f40460f != null) {
                    ujVar.f40464w = org.telegram.messenger.o10.h(new StringBuilder("+"), ujVar.f40460f.phone, pf.b.c());
                    ujVar.f40463s = ujVar.f40460f;
                    org.telegram.messenger.g0.g3(new sj(ujVar, 1));
                    return;
                }
                return;
            default:
                uj ujVar2 = this.f39606b;
                ujVar2.f40458c.l(ujVar2.f40464w, false);
                return;
        }
    }
}
