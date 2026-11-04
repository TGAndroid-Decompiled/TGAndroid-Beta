package org.telegram.ui;
public final class dm extends sf.b {
    public final org.telegram.ui.Cells.q1 d;
    public final hm f44779e;

    public dm(hm hmVar, org.telegram.ui.Cells.q1 q1Var) {
        this.f44779e = hmVar;
        this.d = q1Var;
    }

    @Override
    public final void c(boolean z10) {
        if (!z10) {
            org.telegram.messenger.g0.i3(new aj(this.f44779e.f45934a, 9), 250L);
        }
    }

    @Override
    public final void d() {
        hm hmVar = this.f44779e;
        wm wmVar = hmVar.f45934a;
        org.telegram.ui.Cells.q1 q1Var = this.d;
        wmVar.Xb = q1Var.getMessageObject().f1();
        wm wmVar2 = hmVar.f45934a;
        wmVar2.Yb = 2;
        wmVar2.Zb = null;
        q1Var.invalidate();
    }
}
