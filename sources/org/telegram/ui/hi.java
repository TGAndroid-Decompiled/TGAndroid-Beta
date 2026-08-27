package org.telegram.ui;

public final class hi extends org.telegram.ui.ActionBar.n1 {

    public final org.telegram.ui.Components.wj0 f38837o;

    public final rn f38838p;

    public hi(rn rnVar, ya yaVar, org.telegram.ui.Components.wj0 wj0Var) {
        super(yaVar, -2, -2);
        this.f38838p = rnVar;
        this.f38837o = wj0Var;
    }

    @Override
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.wj0 wj0Var = this.f38837o;
        if (wj0Var != null) {
            wj0Var.d();
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        rn rnVar = this.f38838p;
        if (rnVar.M8 != this) {
            return;
        }
        org.telegram.ui.Components.ec ecVar = org.telegram.ui.Components.ec.f28012w;
        org.telegram.ui.Components.ec ecVar2 = rnVar.f42091j1;
        if (ecVar == ecVar2 && ecVar2 != null) {
            ecVar2.b();
            rnVar.f42091j1 = null;
        }
        rnVar.M8 = null;
        rnVar.P8 = null;
        rnVar.O8 = null;
        rnVar.f42239v0.R = true;
        if (rnVar.N8) {
            rnVar.g8(false, true, 0.0f);
        } else {
            rnVar.N8 = true;
        }
        ck ckVar = rnVar.U;
        if (ckVar == null || ckVar.getEditField() == null) {
            return;
        }
        rnVar.U.getEditField().setAllowDrawCursor(true);
    }
}
