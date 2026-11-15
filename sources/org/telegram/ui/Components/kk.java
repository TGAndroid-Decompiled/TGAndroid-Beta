package org.telegram.ui.Components;
public final class kk implements Runnable {
    public final int f36538a;
    public final qk f36539b;

    public kk(qk qkVar, int i7) {
        this.f36538a = i7;
        this.f36539b = qkVar;
    }

    @Override
    public final void run() {
        switch (this.f36538a) {
            case 0:
                this.f36539b.b0();
                return;
            case 1:
                qk qkVar = this.f36539b;
                EditTextBoldCursor editTextBoldCursor = qkVar.T;
                if (!qkVar.L && !qkVar.O0 && !qkVar.f33607b.J && qkVar.M0 && qkVar.U0 == null && editTextBoldCursor.hasFocus() && qkVar.isShown()) {
                    org.telegram.messenger.g0.J3(editTextBoldCursor);
                    return;
                }
                return;
            case 2:
                qk qkVar2 = this.f36539b;
                if (!qkVar2.L && qkVar2.M0 && qkVar2.isShown()) {
                    qkVar2.e0();
                    return;
                }
                return;
            case 3:
                qk qkVar3 = this.f36539b;
                if (!qkVar3.L) {
                    float f10 = qkVar3.f38679n0;
                    if (f10 < 1.0f && qkVar3.m0 == null) {
                        r1.g gVar = new r1.g(new r1.f(f10));
                        qkVar3.m0 = gVar;
                        r1.h hVar = new r1.h(1.0f);
                        hVar.a(0.55f);
                        hVar.b(65.0f);
                        gVar.f55748m = hVar;
                        qkVar3.m0.f(0.001f);
                        qkVar3.m0.b(new c7(qkVar3, 4));
                        qkVar3.m0.a(new pa(qkVar3, 2));
                        qkVar3.m0.h();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                qk qkVar4 = this.f36539b;
                if (qkVar4.M0 && !qkVar4.L) {
                    qkVar4.d0();
                    if (qkVar4.N0) {
                        qkVar4.e0();
                        return;
                    }
                    return;
                }
                return;
            default:
                qk qkVar5 = this.f36539b;
                if (!qkVar5.f38682q0) {
                    qkVar5.f38681p0.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
