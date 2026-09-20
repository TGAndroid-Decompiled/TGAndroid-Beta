package org.telegram.ui;
public final class pi extends org.telegram.ui.ActionBar.n1 {
    public final org.telegram.ui.Components.pk0 f36574o;
    public final zn f36575p;

    public pi(zn znVar, eb ebVar, org.telegram.ui.Components.pk0 pk0Var) {
        super(ebVar, -2, -2);
        this.f36575p = znVar;
        this.f36574o = pk0Var;
    }

    @Override
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.pk0 pk0Var = this.f36574o;
        if (pk0Var != null) {
            pk0Var.d();
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        zn znVar = this.f36575p;
        if (znVar.Q8 == this) {
            org.telegram.ui.Components.pc pcVar = org.telegram.ui.Components.pc.f27245w;
            org.telegram.ui.Components.pc pcVar2 = znVar.f40405n1;
            if (pcVar == pcVar2 && pcVar2 != null) {
                pcVar2.b();
                znVar.f40405n1 = null;
            }
            znVar.Q8 = null;
            znVar.T8 = null;
            znVar.S8 = null;
            znVar.f40555z0.R = true;
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
