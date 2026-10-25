package org.telegram.ui;
public final class ji extends org.telegram.ui.ActionBar.o1 {
    public final org.telegram.ui.Components.fl0 f40672o;
    public final un f40673p;

    public ji(un unVar, fb fbVar, org.telegram.ui.Components.fl0 fl0Var) {
        super(fbVar, -2, -2);
        this.f40673p = unVar;
        this.f40672o = fl0Var;
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        org.telegram.ui.Components.fl0 fl0Var = this.f40672o;
        if (fl0Var != null) {
            fl0Var.d(z10);
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        un unVar = this.f40673p;
        if (unVar.f44213c9 == this) {
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f31880x;
            org.telegram.ui.Components.qc qcVar2 = unVar.f44494z1;
            if (qcVar == qcVar2 && qcVar2 != null) {
                qcVar2.b();
                unVar.f44494z1 = null;
            }
            unVar.f44213c9 = null;
            unVar.f44251f9 = null;
            unVar.f44239e9 = null;
            unVar.f44493z0.R = true;
            if (unVar.f44226d9) {
                unVar.n8(false, true, 0.0f);
            } else {
                unVar.f44226d9 = true;
            }
            hk hkVar = unVar.Y;
            if (hkVar != null && hkVar.getEditField() != null) {
                unVar.Y.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
