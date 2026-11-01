package org.telegram.ui.Components;
public final class ek implements Runnable {
    public final int f25853a;
    public final kk f25854b;

    public ek(kk kkVar, int i10) {
        this.f25853a = i10;
        this.f25854b = kkVar;
    }

    @Override
    public final void run() {
        switch (this.f25853a) {
            case 0:
                this.f25854b.Z();
                return;
            case 1:
                kk kkVar = this.f25854b;
                EditTextBoldCursor editTextBoldCursor = kkVar.S;
                if (!kkVar.K && !kkVar.N0 && !kkVar.f30964b.I && kkVar.L0 && kkVar.T0 == null && editTextBoldCursor.hasFocus() && kkVar.isShown()) {
                    org.telegram.messenger.i0.J3(editTextBoldCursor);
                    return;
                }
                return;
            case 2:
                kk kkVar2 = this.f25854b;
                if (!kkVar2.K && kkVar2.L0 && kkVar2.isShown()) {
                    kkVar2.c0();
                    return;
                }
                return;
            case 3:
                kk kkVar3 = this.f25854b;
                if (!kkVar3.K) {
                    float f7 = kkVar3.m0;
                    if (f7 < 1.0f && kkVar3.f27871l0 == null) {
                        o1.j jVar = new o1.j(new o1.i(f7));
                        kkVar3.f27871l0 = jVar;
                        o1.k kVar = new o1.k(1.0f);
                        kVar.a(0.55f);
                        kVar.b(65.0f);
                        jVar.f13958m = kVar;
                        kkVar3.f27871l0.f(0.001f);
                        kkVar3.f27871l0.b(new a7(kkVar3, 4));
                        kkVar3.f27871l0.a(new na(kkVar3, 2));
                        kkVar3.f27871l0.h();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                kk kkVar4 = this.f25854b;
                if (kkVar4.L0 && !kkVar4.K) {
                    kkVar4.b0();
                    if (kkVar4.M0) {
                        kkVar4.c0();
                        return;
                    }
                    return;
                }
                return;
            default:
                kk kkVar5 = this.f25854b;
                if (!kkVar5.f27875p0) {
                    kkVar5.f27874o0.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
