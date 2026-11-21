package org.telegram.ui;
public final class ci implements Runnable {
    public final int f46566a;
    public final di f46567b;
    public final int f46568c;
    public final boolean d;
    public final org.telegram.ui.Components.xi0 f46569e;
    public final float f46570f;
    public final float h;
    public final ch.p0 f46571n;

    public ci(di diVar, int i7, boolean z10, org.telegram.ui.Components.xi0 xi0Var, float f10, float f11, ch.p0 p0Var, int i10) {
        this.f46566a = i10;
        this.f46567b = diVar;
        this.f46568c = i7;
        this.d = z10;
        this.f46569e = xi0Var;
        this.f46570f = f10;
        this.h = f11;
        this.f46571n = p0Var;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f46566a) {
            case 0:
                org.telegram.messenger.g0.h3(new ci(this.f46567b, this.f46568c, this.d, this.f46569e, this.f46570f, this.h, this.f46571n, 1), 50L);
                return;
            default:
                bn bnVar = this.f46567b.f46976s;
                org.telegram.ui.Cells.z J8 = bnVar.J8(this.f46568c, true);
                if (this.d) {
                    i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                    ch.l0.d(bnVar, this.f46569e, J8, null, this.f46570f, this.h, this.f46571n, i7, 1);
                    ch.l0.f();
                    return;
                }
                return;
        }
    }
}
