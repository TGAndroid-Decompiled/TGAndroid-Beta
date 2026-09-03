package org.telegram.ui;
public final class ni extends org.telegram.ui.ActionBar.p1 {
    public final org.telegram.ui.Components.qk0 f39380o;
    public final xn f39381p;

    public ni(xn xnVar, ab abVar, org.telegram.ui.Components.qk0 qk0Var) {
        super(abVar, -2, -2);
        this.f39381p = xnVar;
        this.f39380o = qk0Var;
    }

    @Override
    public final void d(boolean z4) {
        super.d(true);
        org.telegram.ui.Components.qk0 qk0Var = this.f39380o;
        if (qk0Var != null) {
            qk0Var.d();
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        xn xnVar = this.f39381p;
        if (xnVar.N8 == this) {
            org.telegram.ui.Components.ic icVar = org.telegram.ui.Components.ic.f27770w;
            org.telegram.ui.Components.ic icVar2 = xnVar.f43219k1;
            if (icVar == icVar2 && icVar2 != null) {
                icVar2.b();
                xnVar.f43219k1 = null;
            }
            xnVar.N8 = null;
            xnVar.Q8 = null;
            xnVar.P8 = null;
            xnVar.f43367w0.R = true;
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
