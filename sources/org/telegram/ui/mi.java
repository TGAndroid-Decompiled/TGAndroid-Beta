package org.telegram.ui;
public final class mi extends org.telegram.ui.ActionBar.o1 {
    public final org.telegram.ui.Components.gl0 f41448o;
    public final wn f41449p;

    public mi(wn wnVar, fb fbVar, org.telegram.ui.Components.gl0 gl0Var) {
        super(fbVar, -2, -2);
        this.f41449p = wnVar;
        this.f41448o = gl0Var;
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        org.telegram.ui.Components.gl0 gl0Var = this.f41448o;
        if (gl0Var != null) {
            gl0Var.d(z10);
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        wn wnVar = this.f41449p;
        if (wnVar.f45134g9 == this) {
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f31854x;
            org.telegram.ui.Components.qc qcVar2 = wnVar.f45365z1;
            if (qcVar == qcVar2 && qcVar2 != null) {
                qcVar2.b();
                wnVar.f45365z1 = null;
            }
            wnVar.f45134g9 = null;
            wnVar.f45171j9 = null;
            wnVar.f45159i9 = null;
            wnVar.f45364z0.R = true;
            if (wnVar.f45146h9) {
                wnVar.p8(false, true, 0.0f);
            } else {
                wnVar.f45146h9 = true;
            }
            jk jkVar = wnVar.Y;
            if (jkVar != null && jkVar.getEditField() != null) {
                wnVar.Y.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
