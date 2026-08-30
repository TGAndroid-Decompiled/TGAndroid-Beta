package org.telegram.ui;
public final class ni extends org.telegram.ui.ActionBar.p1 {
    public final org.telegram.ui.Components.pk0 f36670o;
    public final xn f36671p;

    public ni(xn xnVar, ab abVar, org.telegram.ui.Components.pk0 pk0Var) {
        super(abVar, -2, -2);
        this.f36671p = xnVar;
        this.f36670o = pk0Var;
    }

    @Override
    public final void d(boolean z4) {
        super.d(true);
        org.telegram.ui.Components.pk0 pk0Var = this.f36670o;
        if (pk0Var != null) {
            pk0Var.d();
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        xn xnVar = this.f36671p;
        if (xnVar.N8 == this) {
            org.telegram.ui.Components.ic icVar = org.telegram.ui.Components.ic.f25665w;
            org.telegram.ui.Components.ic icVar2 = xnVar.f40072k1;
            if (icVar == icVar2 && icVar2 != null) {
                icVar2.b();
                xnVar.f40072k1 = null;
            }
            xnVar.N8 = null;
            xnVar.Q8 = null;
            xnVar.P8 = null;
            xnVar.f40220w0.R = true;
            if (xnVar.O8) {
                xnVar.g8(false, true, 0.0f);
            } else {
                xnVar.O8 = true;
            }
            jk jkVar = xnVar.V;
            if (jkVar != null && jkVar.getEditField() != null) {
                xnVar.V.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
