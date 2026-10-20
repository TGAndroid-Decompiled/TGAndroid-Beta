package org.telegram.ui;
public final class ii extends org.telegram.ui.ActionBar.m1 {
    public final org.telegram.ui.Components.dl0 f38012o;
    public final qn f38013p;

    public ii(qn qnVar, eb ebVar, org.telegram.ui.Components.dl0 dl0Var) {
        super(ebVar, -2, -2);
        this.f38013p = qnVar;
        this.f38012o = dl0Var;
    }

    @Override
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.dl0 dl0Var = this.f38012o;
        if (dl0Var != null) {
            dl0Var.d();
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        qn qnVar = this.f38013p;
        if (qnVar.Q8 == this) {
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f29523w;
            org.telegram.ui.Components.qc qcVar2 = qnVar.f40775n1;
            if (qcVar == qcVar2 && qcVar2 != null) {
                qcVar2.b();
                qnVar.f40775n1 = null;
            }
            qnVar.Q8 = null;
            qnVar.T8 = null;
            qnVar.S8 = null;
            qnVar.f40926z0.R = true;
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
