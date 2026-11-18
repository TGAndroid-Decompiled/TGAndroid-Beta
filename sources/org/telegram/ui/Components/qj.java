package org.telegram.ui.Components;
public final class qj implements Runnable {
    public final int f38816a;
    public final sj f38817b;

    public qj(sj sjVar, int i7) {
        this.f38816a = i7;
        this.f38817b = sjVar;
    }

    @Override
    public final void run() {
        switch (this.f38816a) {
            case 0:
                sj sjVar = this.f38817b;
                if (sjVar.f39751f != null) {
                    sjVar.f39755w = org.telegram.messenger.n10.h(new StringBuilder("+"), sjVar.f39751f.phone, pf.b.c());
                    sjVar.f39754s = sjVar.f39751f;
                    org.telegram.messenger.g0.g3(new qj(sjVar, 1));
                    return;
                }
                return;
            default:
                sj sjVar2 = this.f38817b;
                sjVar2.f39749c.l(sjVar2.f39755w, false);
                return;
        }
    }
}
