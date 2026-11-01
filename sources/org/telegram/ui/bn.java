package org.telegram.ui;
public final class bn extends gf.e {
    public final org.telegram.ui.Cells.q1 d;
    public final fn e;

    public bn(fn fnVar, org.telegram.ui.Cells.q1 q1Var) {
        this.e = fnVar;
        this.d = q1Var;
    }

    @Override
    public final void c(boolean z10) {
        if (!z10) {
            org.telegram.messenger.i0.h3(new zj(this.e.f37191a, 8), 250L);
        }
    }

    @Override
    public final void d() {
        fn fnVar = this.e;
        un unVar = fnVar.f37191a;
        org.telegram.ui.Cells.q1 q1Var = this.d;
        unVar.Sb = q1Var.getMessageObject().f1();
        un unVar2 = fnVar.f37191a;
        unVar2.Tb = 2;
        unVar2.Ub = null;
        q1Var.invalidate();
    }
}
