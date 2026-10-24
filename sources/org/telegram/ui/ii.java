package org.telegram.ui;
public final class ii extends org.telegram.ui.ActionBar.m1 {
    public final org.telegram.ui.Components.fl0 f38311o;
    public final sn f38312p;

    public ii(sn snVar, eb ebVar, org.telegram.ui.Components.fl0 fl0Var) {
        super(ebVar, -2, -2);
        this.f38312p = snVar;
        this.f38311o = fl0Var;
    }

    @Override
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.fl0 fl0Var = this.f38311o;
        if (fl0Var != null) {
            fl0Var.d();
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        sn snVar = this.f38312p;
        if (snVar.f41481c9 == this) {
            org.telegram.ui.Components.oc ocVar = org.telegram.ui.Components.oc.f29196w;
            org.telegram.ui.Components.oc ocVar2 = snVar.f41760z1;
            if (ocVar == ocVar2 && ocVar2 != null) {
                ocVar2.b();
                snVar.f41760z1 = null;
            }
            snVar.f41481c9 = null;
            snVar.f41518f9 = null;
            snVar.f41505e9 = null;
            snVar.f41759z0.R = true;
            if (snVar.f41494d9) {
                snVar.j8(false, true, 0.0f);
            } else {
                snVar.f41494d9 = true;
            }
            gk gkVar = snVar.Y;
            if (gkVar != null && gkVar.getEditField() != null) {
                snVar.Y.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
