package org.telegram.ui;
public final class ci implements Runnable {
    public final int f44835a;
    public final di f44836b;
    public final int f44837c;
    public final boolean d;
    public final org.telegram.ui.Components.ii0 f44838e;
    public final float f44839f;
    public final float h;
    public final ch.o0 f44840n;

    public ci(di diVar, int i7, boolean z9, org.telegram.ui.Components.ii0 ii0Var, float f10, float f11, ch.o0 o0Var, int i10) {
        this.f44835a = i10;
        this.f44836b = diVar;
        this.f44837c = i7;
        this.d = z9;
        this.f44838e = ii0Var;
        this.f44839f = f10;
        this.h = f11;
        this.f44840n = o0Var;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f44835a) {
            case 0:
                org.telegram.messenger.g0.i3(new ci(this.f44836b, this.f44837c, this.d, this.f44838e, this.f44839f, this.h, this.f44840n, 1), 50L);
                return;
            default:
                an anVar = this.f44836b.f45080s;
                org.telegram.ui.Cells.z H8 = anVar.H8(this.f44837c, true);
                if (this.d) {
                    i7 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                    ch.k0.d(anVar, this.f44838e, H8, null, this.f44839f, this.h, this.f44840n, i7, 1);
                    ch.k0.f();
                    return;
                }
                return;
        }
    }
}
