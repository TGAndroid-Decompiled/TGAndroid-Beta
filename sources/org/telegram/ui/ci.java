package org.telegram.ui;
public final class ci implements Runnable {
    public final int f44834a;
    public final di f44835b;
    public final int f44836c;
    public final boolean d;
    public final org.telegram.ui.Components.ii0 f44837e;
    public final float f44838f;
    public final float h;
    public final ch.o0 f44839n;

    public ci(di diVar, int i7, boolean z9, org.telegram.ui.Components.ii0 ii0Var, float f10, float f11, ch.o0 o0Var, int i10) {
        this.f44834a = i10;
        this.f44835b = diVar;
        this.f44836c = i7;
        this.d = z9;
        this.f44837e = ii0Var;
        this.f44838f = f10;
        this.h = f11;
        this.f44839n = o0Var;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f44834a) {
            case 0:
                org.telegram.messenger.g0.i3(new ci(this.f44835b, this.f44836c, this.d, this.f44837e, this.f44838f, this.h, this.f44839n, 1), 50L);
                return;
            default:
                an anVar = this.f44835b.f45079s;
                org.telegram.ui.Cells.z H8 = anVar.H8(this.f44836c, true);
                if (this.d) {
                    i7 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                    ch.k0.d(anVar, this.f44837e, H8, null, this.f44838f, this.h, this.f44839n, i7, 1);
                    ch.k0.f();
                    return;
                }
                return;
        }
    }
}
