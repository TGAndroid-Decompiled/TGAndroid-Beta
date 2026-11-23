package org.telegram.ui;
public final class bi implements Runnable {
    public final int f45839a;
    public final di f45840b;
    public final int f45841c;
    public final boolean d;
    public final org.telegram.ui.Components.xi0 f45842e;
    public final float f45843f;
    public final float h;
    public final ch.p0 f45844n;

    public bi(di diVar, int i7, boolean z10, org.telegram.ui.Components.xi0 xi0Var, float f10, float f11, ch.p0 p0Var, int i10) {
        this.f45839a = i10;
        this.f45840b = diVar;
        this.f45841c = i7;
        this.d = z10;
        this.f45842e = xi0Var;
        this.f45843f = f10;
        this.h = f11;
        this.f45844n = p0Var;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f45839a) {
            case 0:
                org.telegram.messenger.g0.h3(new bi(this.f45840b, this.f45841c, this.d, this.f45842e, this.f45843f, this.h, this.f45844n, 1), 50L);
                return;
            default:
                bn bnVar = this.f45840b.f46939s;
                org.telegram.ui.Cells.z J8 = bnVar.J8(this.f45841c, true);
                if (this.d) {
                    i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                    ch.l0.d(bnVar, this.f45842e, J8, null, this.f45843f, this.h, this.f45844n, i7, 1);
                    ch.l0.f();
                    return;
                }
                return;
        }
    }
}
