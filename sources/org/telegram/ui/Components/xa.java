package org.telegram.ui.Components;
public final class xa implements r1.c {
    public final int f41957a;
    public final Object f41958b;

    public xa(Object obj, int i7) {
        this.f41957a = i7;
        this.f41958b = obj;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f41957a) {
            case 0:
                fc fcVar = (fc) this.f41958b;
                if (fcVar.d == gVar) {
                    fcVar.d = null;
                    return;
                }
                return;
            case 1:
                ta taVar = (ta) this.f41958b;
                if (!z10) {
                    taVar.run();
                    return;
                }
                return;
            case 2:
                xk xkVar = (xk) this.f41958b;
                xkVar.m0 = null;
                xkVar.f42072n0 = 1.0f;
                xkVar.m0();
                return;
            case 3:
                pn0 pn0Var = (pn0) this.f41958b;
                pn0Var.f38517q = false;
                pn0Var.dismiss();
                return;
            case 4:
                qn0 qn0Var = (qn0) this.f41958b;
                qn0Var.f38964s = false;
                qn0Var.f38963r = false;
                if (!z10) {
                    gVar.d();
                }
                if (gVar == qn0Var.f38961f) {
                    qn0Var.f38961f = null;
                    return;
                }
                return;
            case 5:
                zo0 zo0Var = (zo0) this.f41958b;
                zo0Var.A1.setVisibility(8);
                zo0Var.f42999v2.setVisibility(8);
                xo0 xo0Var = zo0Var.H1;
                xo0Var.f42132f = null;
                xo0Var.f();
                zo0Var.f43003x2 = null;
                zo0Var.I2 = false;
                return;
            default:
                zo0 zo0Var2 = ((io0) this.f41958b).d;
                zo0Var2.B1.setVisibility(8);
                zo0Var2.C1.setVisibility(8);
                zo0Var2.f42997u2.setVisibility(8);
                zo0Var2.f43003x2 = null;
                return;
        }
    }
}
