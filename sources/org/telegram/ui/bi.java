package org.telegram.ui;
public final class bi implements Runnable {
    public final int f45859a;
    public final di f45860b;
    public final int f45861c;
    public final boolean d;
    public final org.telegram.ui.Components.vi0 f45862e;
    public final float f45863f;
    public final float h;
    public final ch.p0 f45864n;

    public bi(di diVar, int i7, boolean z10, org.telegram.ui.Components.vi0 vi0Var, float f10, float f11, ch.p0 p0Var, int i10) {
        this.f45859a = i10;
        this.f45860b = diVar;
        this.f45861c = i7;
        this.d = z10;
        this.f45862e = vi0Var;
        this.f45863f = f10;
        this.h = f11;
        this.f45864n = p0Var;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f45859a) {
            case 0:
                org.telegram.messenger.g0.h3(new bi(this.f45860b, this.f45861c, this.d, this.f45862e, this.f45863f, this.h, this.f45864n, 1), 50L);
                return;
            default:
                bn bnVar = this.f45860b.f46910s;
                org.telegram.ui.Cells.z J8 = bnVar.J8(this.f45861c, true);
                if (this.d) {
                    i7 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                    ch.l0.d(bnVar, this.f45862e, J8, null, this.f45863f, this.h, this.f45864n, i7, 1);
                    ch.l0.f();
                    return;
                }
                return;
        }
    }
}
