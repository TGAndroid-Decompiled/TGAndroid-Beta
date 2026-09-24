package org.telegram.ui;
public final class oi extends org.telegram.ui.ActionBar.m1 {
    public final org.telegram.ui.Components.qk0 f36225o;
    public final wn f36226p;

    public oi(wn wnVar, db dbVar, org.telegram.ui.Components.qk0 qk0Var) {
        super(dbVar, -2, -2);
        this.f36226p = wnVar;
        this.f36225o = qk0Var;
    }

    @Override
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.qk0 qk0Var = this.f36225o;
        if (qk0Var != null) {
            qk0Var.d();
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        wn wnVar = this.f36226p;
        if (wnVar.Q8 == this) {
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f27564w;
            org.telegram.ui.Components.qc qcVar2 = wnVar.f39555n1;
            if (qcVar == qcVar2 && qcVar2 != null) {
                qcVar2.b();
                wnVar.f39555n1 = null;
            }
            wnVar.Q8 = null;
            wnVar.T8 = null;
            wnVar.S8 = null;
            wnVar.f39705z0.R = true;
            if (wnVar.R8) {
                wnVar.g8(false, true, 0.0f);
            } else {
                wnVar.R8 = true;
            }
            jk jkVar = wnVar.Y;
            if (jkVar != null && jkVar.getEditField() != null) {
                wnVar.Y.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
