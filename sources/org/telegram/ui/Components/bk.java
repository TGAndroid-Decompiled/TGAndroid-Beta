package org.telegram.ui.Components;
public final class bk implements Runnable {
    public final int f32278a;
    public final hk f32279b;

    public bk(hk hkVar, int i7) {
        this.f32278a = i7;
        this.f32279b = hkVar;
    }

    @Override
    public final void run() {
        switch (this.f32278a) {
            case 0:
                this.f32279b.b0();
                return;
            case 1:
                hk hkVar = this.f32279b;
                EditTextBoldCursor editTextBoldCursor = hkVar.S;
                if (!hkVar.K && !hkVar.N0 && !hkVar.f38656b.I && hkVar.L0 && hkVar.T0 == null && editTextBoldCursor.hasFocus() && hkVar.isShown()) {
                    org.telegram.messenger.g0.K3(editTextBoldCursor);
                    return;
                }
                return;
            case 2:
                hk hkVar2 = this.f32279b;
                if (!hkVar2.K && hkVar2.L0 && hkVar2.isShown()) {
                    hkVar2.e0();
                    return;
                }
                return;
            case 3:
                hk hkVar3 = this.f32279b;
                if (!hkVar3.K) {
                    float f10 = hkVar3.m0;
                    if (f10 < 1.0f && hkVar3.f34379l0 == null) {
                        r1.g gVar = new r1.g(new r1.f(f10));
                        hkVar3.f34379l0 = gVar;
                        r1.h hVar = new r1.h(1.0f);
                        hVar.a(0.55f);
                        hVar.b(65.0f);
                        gVar.f54279m = hVar;
                        hkVar3.f34379l0.f(0.001f);
                        hkVar3.f34379l0.b(new d7(hkVar3, 4));
                        hkVar3.f34379l0.a(new sa(hkVar3, 2));
                        hkVar3.f34379l0.h();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                hk hkVar4 = this.f32279b;
                if (hkVar4.L0 && !hkVar4.K) {
                    hkVar4.d0();
                    if (hkVar4.M0) {
                        hkVar4.e0();
                        return;
                    }
                    return;
                }
                return;
            default:
                hk hkVar5 = this.f32279b;
                if (!hkVar5.f34383p0) {
                    hkVar5.f34382o0.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
