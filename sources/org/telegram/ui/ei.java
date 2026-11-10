package org.telegram.ui;
public final class ei implements Runnable {
    public final int f45307a;
    public final fi f45308b;
    public final int f45309c;
    public final boolean d;
    public final org.telegram.ui.Components.ii0 f45310e;
    public final float f45311f;
    public final float h;
    public final ch.o0 f45312n;

    public ei(fi fiVar, int i7, boolean z9, org.telegram.ui.Components.ii0 ii0Var, float f10, float f11, ch.o0 o0Var, int i10) {
        this.f45307a = i10;
        this.f45308b = fiVar;
        this.f45309c = i7;
        this.d = z9;
        this.f45310e = ii0Var;
        this.f45311f = f10;
        this.h = f11;
        this.f45312n = o0Var;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f45307a) {
            case 0:
                org.telegram.messenger.g0.i3(new ei(this.f45308b, this.f45309c, this.d, this.f45310e, this.f45311f, this.h, this.f45312n, 1), 50L);
                return;
            default:
                cn cnVar = this.f45308b.f45782s;
                org.telegram.ui.Cells.z I8 = cnVar.I8(this.f45309c, true);
                if (this.d) {
                    i7 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                    ch.k0.d(cnVar, this.f45310e, I8, null, this.f45311f, this.h, this.f45312n, i7, 1);
                    ch.k0.f();
                    return;
                }
                return;
        }
    }
}
