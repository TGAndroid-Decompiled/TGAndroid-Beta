package org.telegram.ui;
public final class ni extends org.telegram.ui.ActionBar.p1 {
    public final org.telegram.ui.Components.rk0 f39461o;
    public final xn f39462p;

    public ni(xn xnVar, ab abVar, org.telegram.ui.Components.rk0 rk0Var) {
        super(abVar, -2, -2);
        this.f39462p = xnVar;
        this.f39461o = rk0Var;
    }

    @Override
    public final void d(boolean z4) {
        super.d(true);
        org.telegram.ui.Components.rk0 rk0Var = this.f39461o;
        if (rk0Var != null) {
            rk0Var.d();
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        xn xnVar = this.f39462p;
        if (xnVar.N8 == this) {
            org.telegram.ui.Components.ic icVar = org.telegram.ui.Components.ic.f27737w;
            org.telegram.ui.Components.ic icVar2 = xnVar.f43241k1;
            if (icVar == icVar2 && icVar2 != null) {
                icVar2.b();
                xnVar.f43241k1 = null;
            }
            xnVar.N8 = null;
            xnVar.Q8 = null;
            xnVar.P8 = null;
            xnVar.f43389w0.R = true;
            if (xnVar.O8) {
                xnVar.g8(false, true, 0.0f);
            } else {
                xnVar.O8 = true;
            }
            jk jkVar = xnVar.V;
            if (jkVar != null && jkVar.getEditField() != null) {
                xnVar.V.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
