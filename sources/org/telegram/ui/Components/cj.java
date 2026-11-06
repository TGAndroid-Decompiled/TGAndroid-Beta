package org.telegram.ui.Components;
public final class cj implements Runnable {
    public final int f32583a;
    public final ej f32584b;

    public cj(ej ejVar, int i7) {
        this.f32583a = i7;
        this.f32584b = ejVar;
    }

    @Override
    public final void run() {
        switch (this.f32583a) {
            case 0:
                ej ejVar = this.f32584b;
                if (ejVar.f33257f != null) {
                    ejVar.f33261w = org.telegram.messenger.k5.i(new StringBuilder("+"), ejVar.f33257f.phone, pf.b.c());
                    ejVar.f33260s = ejVar.f33257f;
                    org.telegram.messenger.g0.h3(new cj(ejVar, 1));
                    return;
                }
                return;
            default:
                ej ejVar2 = this.f32584b;
                ejVar2.f33255c.l(ejVar2.f33261w, false);
                return;
        }
    }
}
