package org.telegram.ui.Components;
public final class cj implements Runnable {
    public final int f32574a;
    public final ej f32575b;

    public cj(ej ejVar, int i7) {
        this.f32574a = i7;
        this.f32575b = ejVar;
    }

    @Override
    public final void run() {
        switch (this.f32574a) {
            case 0:
                ej ejVar = this.f32575b;
                if (ejVar.f33272f != null) {
                    ejVar.f33276w = org.telegram.messenger.k5.i(new StringBuilder("+"), ejVar.f33272f.phone, pf.b.c());
                    ejVar.f33275s = ejVar.f33272f;
                    org.telegram.messenger.g0.h3(new cj(ejVar, 1));
                    return;
                }
                return;
            default:
                ej ejVar2 = this.f32575b;
                ejVar2.f33270c.l(ejVar2.f33276w, false);
                return;
        }
    }
}
