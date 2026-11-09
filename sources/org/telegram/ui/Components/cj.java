package org.telegram.ui.Components;
public final class cj implements Runnable {
    public final int f32700a;
    public final ej f32701b;

    public cj(ej ejVar, int i7) {
        this.f32700a = i7;
        this.f32701b = ejVar;
    }

    @Override
    public final void run() {
        switch (this.f32700a) {
            case 0:
                ej ejVar = this.f32701b;
                if (ejVar.f33420f != null) {
                    ejVar.f33424w = org.telegram.messenger.k5.i(new StringBuilder("+"), ejVar.f33420f.phone, pf.b.c());
                    ejVar.f33423s = ejVar.f33420f;
                    org.telegram.messenger.g0.h3(new cj(ejVar, 1));
                    return;
                }
                return;
            default:
                ej ejVar2 = this.f32701b;
                ejVar2.f33418c.l(ejVar2.f33424w, false);
                return;
        }
    }
}
