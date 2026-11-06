package org.telegram.ui.Components;
public final class ck implements Runnable {
    public final int f32589a;
    public final ik f32590b;

    public ck(ik ikVar, int i7) {
        this.f32589a = i7;
        this.f32590b = ikVar;
    }

    @Override
    public final void run() {
        switch (this.f32589a) {
            case 0:
                this.f32590b.b0();
                return;
            case 1:
                ik ikVar = this.f32590b;
                EditTextBoldCursor editTextBoldCursor = ikVar.S;
                if (!ikVar.K && !ikVar.N0 && !ikVar.f38948b.I && ikVar.L0 && ikVar.T0 == null && editTextBoldCursor.hasFocus() && ikVar.isShown()) {
                    org.telegram.messenger.g0.K3(editTextBoldCursor);
                    return;
                }
                return;
            case 2:
                ik ikVar2 = this.f32590b;
                if (!ikVar2.K && ikVar2.L0 && ikVar2.isShown()) {
                    ikVar2.e0();
                    return;
                }
                return;
            case 3:
                ik ikVar3 = this.f32590b;
                if (!ikVar3.K) {
                    float f10 = ikVar3.m0;
                    if (f10 < 1.0f && ikVar3.f34667l0 == null) {
                        r1.g gVar = new r1.g(new r1.f(f10));
                        ikVar3.f34667l0 = gVar;
                        r1.h hVar = new r1.h(1.0f);
                        hVar.a(0.55f);
                        hVar.b(65.0f);
                        gVar.f54175m = hVar;
                        ikVar3.f34667l0.f(0.001f);
                        ikVar3.f34667l0.b(new e7(ikVar3, 4));
                        ikVar3.f34667l0.a(new ta(ikVar3, 2));
                        ikVar3.f34667l0.h();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ik ikVar4 = this.f32590b;
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
                ik ikVar5 = this.f32590b;
                if (!ikVar5.f34671p0) {
                    ikVar5.f34670o0.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
