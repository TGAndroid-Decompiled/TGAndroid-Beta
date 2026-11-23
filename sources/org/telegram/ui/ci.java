package org.telegram.ui;
public final class ci implements Runnable {
    public final int f46799a;
    public final di f46800b;
    public final int f46801c;
    public final boolean d;
    public final org.telegram.ui.Components.xi0 f46802e;
    public final float f46803f;
    public final float h;
    public final ch.p0 f46804n;

    public ci(di diVar, int i7, boolean z10, org.telegram.ui.Components.xi0 xi0Var, float f10, float f11, ch.p0 p0Var, int i10) {
        this.f46799a = i10;
        this.f46800b = diVar;
        this.f46801c = i7;
        this.d = z10;
        this.f46802e = xi0Var;
        this.f46803f = f10;
        this.h = f11;
        this.f46804n = p0Var;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f46799a) {
            case 0:
                org.telegram.messenger.g0.h3(new ci(this.f46800b, this.f46801c, this.d, this.f46802e, this.f46803f, this.h, this.f46804n, 1), 50L);
                return;
            default:
                bn bnVar = this.f46800b.f47149s;
                org.telegram.ui.Cells.z J8 = bnVar.J8(this.f46801c, true);
                if (this.d) {
                    i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                    ch.l0.d(bnVar, this.f46802e, J8, null, this.f46803f, this.h, this.f46804n, i7, 1);
                    ch.l0.f();
                    return;
                }
                return;
        }
    }
}
