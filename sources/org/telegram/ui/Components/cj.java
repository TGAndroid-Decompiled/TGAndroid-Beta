package org.telegram.ui.Components;
public final class cj implements Runnable {
    public final int f32587a;
    public final ej f32588b;

    public cj(ej ejVar, int i7) {
        this.f32587a = i7;
        this.f32588b = ejVar;
    }

    @Override
    public final void run() {
        switch (this.f32587a) {
            case 0:
                ej ejVar = this.f32588b;
                if (ejVar.f33253f != null) {
                    ejVar.f33257w = org.telegram.messenger.k5.i(new StringBuilder("+"), ejVar.f33253f.phone, pf.b.c());
                    ejVar.f33256s = ejVar.f33253f;
                    org.telegram.messenger.g0.h3(new cj(ejVar, 1));
                    return;
                }
                return;
            default:
                ej ejVar2 = this.f32588b;
                ejVar2.f33251c.l(ejVar2.f33257w, false);
                return;
        }
    }
}
