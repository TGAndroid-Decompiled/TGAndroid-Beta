package org.telegram.ui;
public final class ci implements Runnable {
    public final int f46158a;
    public final di f46159b;
    public final int f46160c;
    public final boolean d;
    public final org.telegram.ui.Components.mi0 f46161e;
    public final float f46162f;
    public final float h;
    public final ch.p0 f46163n;

    public ci(di diVar, int i7, boolean z10, org.telegram.ui.Components.mi0 mi0Var, float f10, float f11, ch.p0 p0Var, int i10) {
        this.f46158a = i10;
        this.f46159b = diVar;
        this.f46160c = i7;
        this.d = z10;
        this.f46161e = mi0Var;
        this.f46162f = f10;
        this.h = f11;
        this.f46163n = p0Var;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f46158a) {
            case 0:
                org.telegram.messenger.g0.i3(new ci(this.f46159b, this.f46160c, this.d, this.f46161e, this.f46162f, this.h, this.f46163n, 1), 50L);
                return;
            default:
                an anVar = this.f46159b.f46382s;
                org.telegram.ui.Cells.z J8 = anVar.J8(this.f46160c, true);
                if (this.d) {
                    i7 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                    ch.l0.d(anVar, this.f46161e, J8, null, this.f46162f, this.h, this.f46163n, i7, 1);
                    ch.l0.f();
                    return;
                }
                return;
        }
    }
}
