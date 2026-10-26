package org.telegram.ui;
public final class ji extends org.telegram.ui.ActionBar.o1 {
    public final org.telegram.ui.Components.fl0 f40675o;
    public final un f40676p;

    public ji(un unVar, fb fbVar, org.telegram.ui.Components.fl0 fl0Var) {
        super(fbVar, -2, -2);
        this.f40676p = unVar;
        this.f40675o = fl0Var;
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        org.telegram.ui.Components.fl0 fl0Var = this.f40675o;
        if (fl0Var != null) {
            fl0Var.d(z10);
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        un unVar = this.f40676p;
        if (unVar.f44216c9 == this) {
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f31882x;
            org.telegram.ui.Components.qc qcVar2 = unVar.f44497z1;
            if (qcVar == qcVar2 && qcVar2 != null) {
                qcVar2.b();
                unVar.f44497z1 = null;
            }
            unVar.f44216c9 = null;
            unVar.f44254f9 = null;
            unVar.f44242e9 = null;
            unVar.f44496z0.R = true;
            if (unVar.f44229d9) {
                unVar.n8(false, true, 0.0f);
            } else {
                unVar.f44229d9 = true;
            }
            hk hkVar = unVar.Y;
            if (hkVar != null && hkVar.getEditField() != null) {
                unVar.Y.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
