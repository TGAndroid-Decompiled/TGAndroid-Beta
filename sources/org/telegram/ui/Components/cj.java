package org.telegram.ui.Components;
public final class cj implements Runnable {
    public final int f32605a;
    public final ej f32606b;

    public cj(ej ejVar, int i7) {
        this.f32605a = i7;
        this.f32606b = ejVar;
    }

    @Override
    public final void run() {
        switch (this.f32605a) {
            case 0:
                ej ejVar = this.f32606b;
                if (ejVar.f33303f != null) {
                    ejVar.f33307w = org.telegram.messenger.k5.i(new StringBuilder("+"), ejVar.f33303f.phone, pf.b.c());
                    ejVar.f33306s = ejVar.f33303f;
                    org.telegram.messenger.g0.h3(new cj(ejVar, 1));
                    return;
                }
                return;
            default:
                ej ejVar2 = this.f32606b;
                ejVar2.f33301c.l(ejVar2.f33307w, false);
                return;
        }
    }
}
