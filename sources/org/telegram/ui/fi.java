package org.telegram.ui;
public final class fi extends org.telegram.ui.ActionBar.o1 {
    public final org.telegram.ui.Components.uj0 f38294o;
    public final qn f38295p;

    public fi(qn qnVar, xa xaVar, org.telegram.ui.Components.uj0 uj0Var) {
        super(xaVar, -2, -2);
        this.f38295p = qnVar;
        this.f38294o = uj0Var;
    }

    @Override
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.uj0 uj0Var = this.f38294o;
        if (uj0Var != null) {
            uj0Var.d();
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        qn qnVar = this.f38295p;
        if (qnVar.M8 == this) {
            org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.f28729w;
            org.telegram.ui.Components.gc gcVar2 = qnVar.f41955j1;
            if (gcVar == gcVar2 && gcVar2 != null) {
                gcVar2.b();
                qnVar.f41955j1 = null;
            }
            qnVar.M8 = null;
            qnVar.P8 = null;
            qnVar.O8 = null;
            qnVar.f42103v0.R = true;
            if (qnVar.N8) {
                qnVar.g8(false, true, 0.0f);
            } else {
                qnVar.N8 = true;
            }
            ak akVar = qnVar.U;
            if (akVar != null && akVar.getEditField() != null) {
                qnVar.U.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
