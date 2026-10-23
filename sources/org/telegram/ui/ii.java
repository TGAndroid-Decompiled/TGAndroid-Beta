package org.telegram.ui;
public final class ii extends org.telegram.ui.ActionBar.m1 {
    public final org.telegram.ui.Components.gl0 f38235o;
    public final sn f38236p;

    public ii(sn snVar, eb ebVar, org.telegram.ui.Components.gl0 gl0Var) {
        super(ebVar, -2, -2);
        this.f38236p = snVar;
        this.f38235o = gl0Var;
    }

    @Override
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.gl0 gl0Var = this.f38235o;
        if (gl0Var != null) {
            gl0Var.d();
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        sn snVar = this.f38236p;
        if (snVar.f41484c9 == this) {
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f29825w;
            org.telegram.ui.Components.qc qcVar2 = snVar.f41763z1;
            if (qcVar == qcVar2 && qcVar2 != null) {
                qcVar2.b();
                snVar.f41763z1 = null;
            }
            snVar.f41484c9 = null;
            snVar.f41521f9 = null;
            snVar.f41508e9 = null;
            snVar.f41762z0.R = true;
            if (snVar.f41497d9) {
                snVar.j8(false, true, 0.0f);
            } else {
                snVar.f41497d9 = true;
            }
            gk gkVar = snVar.Y;
            if (gkVar != null && gkVar.getEditField() != null) {
                snVar.Y.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
