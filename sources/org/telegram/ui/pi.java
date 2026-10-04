package org.telegram.ui;
public final class pi extends org.telegram.ui.ActionBar.n1 {
    public final org.telegram.ui.Components.sk0 f39494o;
    public final yn f39495p;

    public pi(yn ynVar, fb fbVar, org.telegram.ui.Components.sk0 sk0Var) {
        super(fbVar, -2, -2);
        this.f39495p = ynVar;
        this.f39494o = sk0Var;
    }

    @Override
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.sk0 sk0Var = this.f39494o;
        if (sk0Var != null) {
            sk0Var.d();
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        yn ynVar = this.f39495p;
        if (ynVar.O8 == this) {
            org.telegram.ui.Components.rc rcVar = org.telegram.ui.Components.rc.f30330w;
            org.telegram.ui.Components.rc rcVar2 = ynVar.l1;
            if (rcVar == rcVar2 && rcVar2 != null) {
                rcVar2.b();
                ynVar.l1 = null;
            }
            ynVar.O8 = null;
            ynVar.R8 = null;
            ynVar.Q8 = null;
            ynVar.f43551x0.R = true;
            if (ynVar.P8) {
                ynVar.g8(false, true, 0.0f);
            } else {
                ynVar.P8 = true;
            }
            jk jkVar = ynVar.W;
            if (jkVar != null && jkVar.getEditField() != null) {
                ynVar.W.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
