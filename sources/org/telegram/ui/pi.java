package org.telegram.ui;
public final class pi extends org.telegram.ui.ActionBar.n1 {
    public final org.telegram.ui.Components.qk0 f36492o;
    public final zn f36493p;

    public pi(zn znVar, eb ebVar, org.telegram.ui.Components.qk0 qk0Var) {
        super(ebVar, -2, -2);
        this.f36493p = znVar;
        this.f36492o = qk0Var;
    }

    @Override
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.qk0 qk0Var = this.f36492o;
        if (qk0Var != null) {
            qk0Var.d();
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        zn znVar = this.f36493p;
        if (znVar.Q8 == this) {
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f27543w;
            org.telegram.ui.Components.qc qcVar2 = znVar.f40363n1;
            if (qcVar == qcVar2 && qcVar2 != null) {
                qcVar2.b();
                znVar.f40363n1 = null;
            }
            znVar.Q8 = null;
            znVar.T8 = null;
            znVar.S8 = null;
            znVar.f40513z0.R = true;
            if (znVar.R8) {
                znVar.g8(false, true, 0.0f);
            } else {
                znVar.R8 = true;
            }
            lk lkVar = znVar.Y;
            if (lkVar != null && lkVar.getEditField() != null) {
                znVar.Y.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
