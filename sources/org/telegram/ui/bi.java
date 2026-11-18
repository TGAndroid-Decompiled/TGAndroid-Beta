package org.telegram.ui;
public final class bi implements Runnable {
    public final int f45868a;
    public final di f45869b;
    public final int f45870c;
    public final boolean d;
    public final org.telegram.ui.Components.vi0 f45871e;
    public final float f45872f;
    public final float h;
    public final ch.p0 f45873n;

    public bi(di diVar, int i7, boolean z10, org.telegram.ui.Components.vi0 vi0Var, float f10, float f11, ch.p0 p0Var, int i10) {
        this.f45868a = i10;
        this.f45869b = diVar;
        this.f45870c = i7;
        this.d = z10;
        this.f45871e = vi0Var;
        this.f45872f = f10;
        this.h = f11;
        this.f45873n = p0Var;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f45868a) {
            case 0:
                org.telegram.messenger.g0.h3(new bi(this.f45869b, this.f45870c, this.d, this.f45871e, this.f45872f, this.h, this.f45873n, 1), 50L);
                return;
            default:
                bn bnVar = this.f45869b.f46987s;
                org.telegram.ui.Cells.z J8 = bnVar.J8(this.f45870c, true);
                if (this.d) {
                    i7 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                    ch.l0.d(bnVar, this.f45871e, J8, null, this.f45872f, this.h, this.f45873n, i7, 1);
                    ch.l0.f();
                    return;
                }
                return;
        }
    }
}
