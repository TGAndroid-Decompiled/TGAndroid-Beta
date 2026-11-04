package org.telegram.ui.Components;
public final class bk implements Runnable {
    public final int f32305a;
    public final hk f32306b;

    public bk(hk hkVar, int i3) {
        this.f32305a = i3;
        this.f32306b = hkVar;
    }

    @Override
    public final void run() {
        switch (this.f32305a) {
            case 0:
                this.f32306b.b0();
                return;
            case 1:
                hk hkVar = this.f32306b;
                EditTextBoldCursor editTextBoldCursor = hkVar.T;
                if (!hkVar.L && !hkVar.O0 && !hkVar.f38416b.J && hkVar.M0 && hkVar.U0 == null && editTextBoldCursor.hasFocus() && hkVar.isShown()) {
                    org.telegram.messenger.g0.K3(editTextBoldCursor);
                    return;
                }
                return;
            case 2:
                hk hkVar2 = this.f32306b;
                if (!hkVar2.L && hkVar2.M0 && hkVar2.isShown()) {
                    hkVar2.e0();
                    return;
                }
                return;
            case 3:
                hk hkVar3 = this.f32306b;
                if (!hkVar3.L) {
                    float f10 = hkVar3.f34417n0;
                    if (f10 < 1.0f && hkVar3.m0 == null) {
                        q1.g gVar = new q1.g(new q1.f(f10));
                        hkVar3.m0 = gVar;
                        q1.h hVar = new q1.h(1.0f);
                        hVar.a(0.55f);
                        hVar.b(65.0f);
                        gVar.f53653m = hVar;
                        hkVar3.m0.f(0.001f);
                        hkVar3.m0.b(new c7(hkVar3, 4));
                        hkVar3.m0.a(new sa(hkVar3, 2));
                        hkVar3.m0.h();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                hk hkVar4 = this.f32306b;
                if (hkVar4.M0 && !hkVar4.L) {
                    hkVar4.d0();
                    if (hkVar4.N0) {
                        hkVar4.e0();
                        return;
                    }
                    return;
                }
                return;
            default:
                hk hkVar5 = this.f32306b;
                if (!hkVar5.f34420q0) {
                    hkVar5.f34419p0.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
