package org.telegram.ui;
public final class pi extends org.telegram.ui.ActionBar.p1 {
    public final org.telegram.ui.Components.pk0 f37170o;
    public final zn f37171p;

    public pi(zn znVar, cb cbVar, org.telegram.ui.Components.pk0 pk0Var) {
        super(cbVar, -2, -2);
        this.f37171p = znVar;
        this.f37170o = pk0Var;
    }

    @Override
    public final void d(boolean z4) {
        super.d(true);
        org.telegram.ui.Components.pk0 pk0Var = this.f37170o;
        if (pk0Var != null) {
            pk0Var.d();
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        zn znVar = this.f37171p;
        if (znVar.N8 == this) {
            org.telegram.ui.Components.ic icVar = org.telegram.ui.Components.ic.f25664w;
            org.telegram.ui.Components.ic icVar2 = znVar.f40638k1;
            if (icVar == icVar2 && icVar2 != null) {
                icVar2.b();
                znVar.f40638k1 = null;
            }
            znVar.N8 = null;
            znVar.Q8 = null;
            znVar.P8 = null;
            znVar.f40786w0.R = true;
            if (znVar.O8) {
                znVar.g8(false, true, 0.0f);
            } else {
                znVar.O8 = true;
            }
            lk lkVar = znVar.V;
            if (lkVar != null && lkVar.getEditField() != null) {
                znVar.V.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
