package org.telegram.ui;
public final class ci implements Runnable {
    public final int f44814a;
    public final di f44815b;
    public final int f44816c;
    public final boolean d;
    public final org.telegram.ui.Components.ii0 f44817e;
    public final float f44818f;
    public final float h;
    public final ch.o0 f44819n;

    public ci(di diVar, int i7, boolean z9, org.telegram.ui.Components.ii0 ii0Var, float f10, float f11, ch.o0 o0Var, int i10) {
        this.f44814a = i10;
        this.f44815b = diVar;
        this.f44816c = i7;
        this.d = z9;
        this.f44817e = ii0Var;
        this.f44818f = f10;
        this.h = f11;
        this.f44819n = o0Var;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f44814a) {
            case 0:
                org.telegram.messenger.g0.i3(new ci(this.f44815b, this.f44816c, this.d, this.f44817e, this.f44818f, this.h, this.f44819n, 1), 50L);
                return;
            default:
                an anVar = this.f44815b.f45055s;
                org.telegram.ui.Cells.z H8 = anVar.H8(this.f44816c, true);
                if (this.d) {
                    i7 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                    ch.k0.d(anVar, this.f44817e, H8, null, this.f44818f, this.h, this.f44819n, i7, 1);
                    ch.k0.f();
                    return;
                }
                return;
        }
    }
}
