package org.telegram.ui;
public final class qi extends org.telegram.ui.ActionBar.o1 {
    public final org.telegram.ui.Components.sk0 f36751o;
    public final xn f36752p;

    public qi(xn xnVar, fb fbVar, org.telegram.ui.Components.sk0 sk0Var) {
        super(fbVar, -2, -2);
        this.f36752p = xnVar;
        this.f36751o = sk0Var;
    }

    @Override
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.sk0 sk0Var = this.f36751o;
        if (sk0Var != null) {
            sk0Var.d();
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        xn xnVar = this.f36752p;
        if (xnVar.Q8 == this) {
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f27684w;
            org.telegram.ui.Components.qc qcVar2 = xnVar.f39852n1;
            if (qcVar == qcVar2 && qcVar2 != null) {
                qcVar2.b();
                xnVar.f39852n1 = null;
            }
            xnVar.Q8 = null;
            xnVar.T8 = null;
            xnVar.S8 = null;
            xnVar.f40002z0.R = true;
            if (xnVar.R8) {
                xnVar.g8(false, true, 0.0f);
            } else {
                xnVar.R8 = true;
            }
            lk lkVar = xnVar.Y;
            if (lkVar != null && lkVar.getEditField() != null) {
                xnVar.Y.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
