package org.telegram.ui;
public final class ii extends org.telegram.ui.ActionBar.m1 {
    public final org.telegram.ui.Components.cl0 f38006o;
    public final qn f38007p;

    public ii(qn qnVar, eb ebVar, org.telegram.ui.Components.cl0 cl0Var) {
        super(ebVar, -2, -2);
        this.f38007p = qnVar;
        this.f38006o = cl0Var;
    }

    @Override
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.cl0 cl0Var = this.f38006o;
        if (cl0Var != null) {
            cl0Var.d();
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        qn qnVar = this.f38007p;
        if (qnVar.Q8 == this) {
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f29587w;
            org.telegram.ui.Components.qc qcVar2 = qnVar.f40769n1;
            if (qcVar == qcVar2 && qcVar2 != null) {
                qcVar2.b();
                qnVar.f40769n1 = null;
            }
            qnVar.Q8 = null;
            qnVar.T8 = null;
            qnVar.S8 = null;
            qnVar.f40920z0.R = true;
            if (qnVar.R8) {
                qnVar.j8(false, true, 0.0f);
            } else {
                qnVar.R8 = true;
            }
            fk fkVar = qnVar.Y;
            if (fkVar != null && fkVar.getEditField() != null) {
                qnVar.Y.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
