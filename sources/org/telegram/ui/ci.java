package org.telegram.ui;
public final class ci implements Runnable {
    public final int f44839a;
    public final di f44840b;
    public final int f44841c;
    public final boolean d;
    public final org.telegram.ui.Components.ii0 f44842e;
    public final float f44843f;
    public final float h;
    public final ch.o0 f44844n;

    public ci(di diVar, int i7, boolean z9, org.telegram.ui.Components.ii0 ii0Var, float f10, float f11, ch.o0 o0Var, int i10) {
        this.f44839a = i10;
        this.f44840b = diVar;
        this.f44841c = i7;
        this.d = z9;
        this.f44842e = ii0Var;
        this.f44843f = f10;
        this.h = f11;
        this.f44844n = o0Var;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f44839a) {
            case 0:
                org.telegram.messenger.g0.i3(new ci(this.f44840b, this.f44841c, this.d, this.f44842e, this.f44843f, this.h, this.f44844n, 1), 50L);
                return;
            default:
                an anVar = this.f44840b.f45074s;
                org.telegram.ui.Cells.z H8 = anVar.H8(this.f44841c, true);
                if (this.d) {
                    i7 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                    ch.k0.d(anVar, this.f44842e, H8, null, this.f44843f, this.h, this.f44844n, i7, 1);
                    ch.k0.f();
                    return;
                }
                return;
        }
    }
}
