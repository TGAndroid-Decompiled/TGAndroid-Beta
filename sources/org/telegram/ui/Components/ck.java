package org.telegram.ui.Components;
public final class ck implements Runnable {
    public final int f32607a;
    public final ik f32608b;

    public ck(ik ikVar, int i7) {
        this.f32607a = i7;
        this.f32608b = ikVar;
    }

    @Override
    public final void run() {
        switch (this.f32607a) {
            case 0:
                this.f32608b.b0();
                return;
            case 1:
                ik ikVar = this.f32608b;
                EditTextBoldCursor editTextBoldCursor = ikVar.S;
                if (!ikVar.K && !ikVar.N0 && !ikVar.f39004b.I && ikVar.L0 && ikVar.T0 == null && editTextBoldCursor.hasFocus() && ikVar.isShown()) {
                    org.telegram.messenger.g0.K3(editTextBoldCursor);
                    return;
                }
                return;
            case 2:
                ik ikVar2 = this.f32608b;
                if (!ikVar2.K && ikVar2.L0 && ikVar2.isShown()) {
                    ikVar2.e0();
                    return;
                }
                return;
            case 3:
                ik ikVar3 = this.f32608b;
                if (!ikVar3.K) {
                    float f10 = ikVar3.m0;
                    if (f10 < 1.0f && ikVar3.f34741l0 == null) {
                        r1.g gVar = new r1.g(new r1.f(f10));
                        ikVar3.f34741l0 = gVar;
                        r1.h hVar = new r1.h(1.0f);
                        hVar.a(0.55f);
                        hVar.b(65.0f);
                        gVar.f54268m = hVar;
                        ikVar3.f34741l0.f(0.001f);
                        ikVar3.f34741l0.b(new e7(ikVar3, 4));
                        ikVar3.f34741l0.a(new ta(ikVar3, 2));
                        ikVar3.f34741l0.h();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ik ikVar4 = this.f32608b;
                if (ikVar4.L0 && !ikVar4.K) {
                    ikVar4.d0();
                    if (ikVar4.M0) {
                        ikVar4.e0();
                        return;
                    }
                    return;
                }
                return;
            default:
                ik ikVar5 = this.f32608b;
                if (!ikVar5.f34745p0) {
                    ikVar5.f34744o0.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
