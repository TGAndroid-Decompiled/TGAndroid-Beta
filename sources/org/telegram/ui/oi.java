package org.telegram.ui;
public final class oi extends org.telegram.ui.ActionBar.n1 {
    public final org.telegram.ui.Components.gk0 f35884o;
    public final xn f35885p;

    public oi(xn xnVar, db dbVar, org.telegram.ui.Components.gk0 gk0Var) {
        super(dbVar, -2, -2);
        this.f35885p = xnVar;
        this.f35884o = gk0Var;
    }

    @Override
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.gk0 gk0Var = this.f35884o;
        if (gk0Var != null) {
            gk0Var.d();
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        xn xnVar = this.f35885p;
        if (xnVar.Q8 == this) {
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f27299w;
            org.telegram.ui.Components.qc qcVar2 = xnVar.f39471n1;
            if (qcVar == qcVar2 && qcVar2 != null) {
                qcVar2.b();
                xnVar.f39471n1 = null;
            }
            xnVar.Q8 = null;
            xnVar.T8 = null;
            xnVar.S8 = null;
            xnVar.f39621z0.R = true;
            if (xnVar.R8) {
                xnVar.g8(false, true, 0.0f);
            } else {
                xnVar.R8 = true;
            }
            jk jkVar = xnVar.Y;
            if (jkVar != null && jkVar.getEditField() != null) {
                xnVar.Y.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
