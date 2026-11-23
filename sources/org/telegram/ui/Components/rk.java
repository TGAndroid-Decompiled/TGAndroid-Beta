package org.telegram.ui.Components;
public final class rk implements Runnable {
    public final int f39325a;
    public final xk f39326b;

    public rk(xk xkVar, int i7) {
        this.f39325a = i7;
        this.f39326b = xkVar;
    }

    @Override
    public final void run() {
        switch (this.f39325a) {
            case 0:
                this.f39326b.b0();
                return;
            case 1:
                xk xkVar = this.f39326b;
                EditTextBoldCursor editTextBoldCursor = xkVar.T;
                if (!xkVar.L && !xkVar.O0 && !xkVar.f37135b.J && xkVar.M0 && xkVar.U0 == null && editTextBoldCursor.hasFocus() && xkVar.isShown()) {
                    org.telegram.messenger.g0.I3(editTextBoldCursor);
                    return;
                }
                return;
            case 2:
                xk xkVar2 = this.f39326b;
                if (!xkVar2.L && xkVar2.M0 && xkVar2.isShown()) {
                    xkVar2.e0();
                    return;
                }
                return;
            case 3:
                xk xkVar3 = this.f39326b;
                if (!xkVar3.L) {
                    float f10 = xkVar3.f42072n0;
                    if (f10 < 1.0f && xkVar3.m0 == null) {
                        r1.g gVar = new r1.g(new r1.f(f10));
                        xkVar3.m0 = gVar;
                        r1.h hVar = new r1.h(1.0f);
                        hVar.a(0.55f);
                        hVar.b(65.0f);
                        gVar.f56446m = hVar;
                        xkVar3.m0.f(0.001f);
                        xkVar3.m0.b(new i7(xkVar3, 4));
                        xkVar3.m0.a(new xa(xkVar3, 2));
                        xkVar3.m0.h();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                xk xkVar4 = this.f39326b;
                if (xkVar4.M0 && !xkVar4.L) {
                    xkVar4.d0();
                    if (xkVar4.N0) {
                        xkVar4.e0();
                        return;
                    }
                    return;
                }
                return;
            default:
                xk xkVar5 = this.f39326b;
                if (!xkVar5.f42075q0) {
                    xkVar5.f42074p0.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
