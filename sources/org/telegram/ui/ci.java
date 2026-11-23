package org.telegram.ui;
public final class ci implements Runnable {
    public final int f46569a;
    public final di f46570b;
    public final int f46571c;
    public final boolean d;
    public final org.telegram.ui.Components.xi0 f46572e;
    public final float f46573f;
    public final float h;
    public final ch.p0 f46574n;

    public ci(di diVar, int i7, boolean z10, org.telegram.ui.Components.xi0 xi0Var, float f10, float f11, ch.p0 p0Var, int i10) {
        this.f46569a = i10;
        this.f46570b = diVar;
        this.f46571c = i7;
        this.d = z10;
        this.f46572e = xi0Var;
        this.f46573f = f10;
        this.h = f11;
        this.f46574n = p0Var;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f46569a) {
            case 0:
                org.telegram.messenger.g0.h3(new ci(this.f46570b, this.f46571c, this.d, this.f46572e, this.f46573f, this.h, this.f46574n, 1), 50L);
                return;
            default:
                bn bnVar = this.f46570b.f46979s;
                org.telegram.ui.Cells.z J8 = bnVar.J8(this.f46571c, true);
                if (this.d) {
                    i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                    ch.l0.d(bnVar, this.f46572e, J8, null, this.f46573f, this.h, this.f46574n, i7, 1);
                    ch.l0.f();
                    return;
                }
                return;
        }
    }
}
