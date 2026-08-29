package org.telegram.ui;
public final class ii extends org.telegram.ui.ActionBar.o1 {
    public final org.telegram.ui.Components.fk0 f39276o;
    public final tn f39277p;

    public ii(tn tnVar, wa waVar, org.telegram.ui.Components.fk0 fk0Var) {
        super(waVar, -2, -2);
        this.f39277p = tnVar;
        this.f39276o = fk0Var;
    }

    @Override
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.fk0 fk0Var = this.f39276o;
        if (fk0Var != null) {
            fk0Var.d();
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        tn tnVar = this.f39277p;
        if (tnVar.M8 == this) {
            org.telegram.ui.Components.mc mcVar = org.telegram.ui.Components.mc.f30644w;
            org.telegram.ui.Components.mc mcVar2 = tnVar.f42852j1;
            if (mcVar == mcVar2 && mcVar2 != null) {
                mcVar2.b();
                tnVar.f42852j1 = null;
            }
            tnVar.M8 = null;
            tnVar.P8 = null;
            tnVar.O8 = null;
            tnVar.f42999v0.R = true;
            if (tnVar.N8) {
                tnVar.g8(false, true, 0.0f);
            } else {
                tnVar.N8 = true;
            }
            dk dkVar = tnVar.U;
            if (dkVar != null && dkVar.getEditField() != null) {
                tnVar.U.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
