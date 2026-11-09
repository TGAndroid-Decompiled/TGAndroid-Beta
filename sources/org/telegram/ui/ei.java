package org.telegram.ui;
public final class ei implements Runnable {
    public final int f45448a;
    public final fi f45449b;
    public final int f45450c;
    public final boolean d;
    public final org.telegram.ui.Components.ji0 f45451e;
    public final float f45452f;
    public final float h;
    public final ch.o0 f45453n;

    public ei(fi fiVar, int i7, boolean z9, org.telegram.ui.Components.ji0 ji0Var, float f10, float f11, ch.o0 o0Var, int i10) {
        this.f45448a = i10;
        this.f45449b = fiVar;
        this.f45450c = i7;
        this.d = z9;
        this.f45451e = ji0Var;
        this.f45452f = f10;
        this.h = f11;
        this.f45453n = o0Var;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f45448a) {
            case 0:
                org.telegram.messenger.g0.i3(new ei(this.f45449b, this.f45450c, this.d, this.f45451e, this.f45452f, this.h, this.f45453n, 1), 50L);
                return;
            default:
                cn cnVar = this.f45449b.f45728s;
                org.telegram.ui.Cells.z I8 = cnVar.I8(this.f45450c, true);
                if (this.d) {
                    i7 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                    ch.k0.d(cnVar, this.f45451e, I8, null, this.f45452f, this.h, this.f45453n, i7, 1);
                    ch.k0.f();
                    return;
                }
                return;
        }
    }
}
