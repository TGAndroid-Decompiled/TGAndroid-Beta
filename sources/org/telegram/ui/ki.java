package org.telegram.ui;
public final class ki extends org.telegram.ui.ActionBar.m1 {
    public final org.telegram.ui.Components.cl0 f38562o;
    public final sn f38563p;

    public ki(sn snVar, gb gbVar, org.telegram.ui.Components.cl0 cl0Var) {
        super(gbVar, -2, -2);
        this.f38563p = snVar;
        this.f38562o = cl0Var;
    }

    @Override
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.cl0 cl0Var = this.f38562o;
        if (cl0Var != null) {
            cl0Var.d();
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        sn snVar = this.f38563p;
        if (snVar.Q8 == this) {
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f29632w;
            org.telegram.ui.Components.qc qcVar2 = snVar.f41307n1;
            if (qcVar == qcVar2 && qcVar2 != null) {
                qcVar2.b();
                snVar.f41307n1 = null;
            }
            snVar.Q8 = null;
            snVar.T8 = null;
            snVar.S8 = null;
            snVar.f41458z0.R = true;
            if (snVar.R8) {
                snVar.j8(false, true, 0.0f);
            } else {
                snVar.R8 = true;
            }
            hk hkVar = snVar.Y;
            if (hkVar != null && hkVar.getEditField() != null) {
                snVar.Y.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
