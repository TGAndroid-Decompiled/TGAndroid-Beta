package org.telegram.ui;
public final class oi extends org.telegram.ui.ActionBar.m1 {
    public final org.telegram.ui.Components.tk0 f36386o;
    public final wn f36387p;

    public oi(wn wnVar, db dbVar, org.telegram.ui.Components.tk0 tk0Var) {
        super(dbVar, -2, -2);
        this.f36387p = wnVar;
        this.f36386o = tk0Var;
    }

    @Override
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.tk0 tk0Var = this.f36386o;
        if (tk0Var != null) {
            tk0Var.d();
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        wn wnVar = this.f36387p;
        if (wnVar.Q8 == this) {
            org.telegram.ui.Components.rc rcVar = org.telegram.ui.Components.rc.f27939w;
            org.telegram.ui.Components.rc rcVar2 = wnVar.f39663n1;
            if (rcVar == rcVar2 && rcVar2 != null) {
                rcVar2.b();
                wnVar.f39663n1 = null;
            }
            wnVar.Q8 = null;
            wnVar.T8 = null;
            wnVar.S8 = null;
            wnVar.f39813z0.R = true;
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
