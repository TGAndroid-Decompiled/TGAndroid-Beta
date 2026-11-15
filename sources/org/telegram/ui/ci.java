package org.telegram.ui;
public final class ci implements Runnable {
    public final int f46169a;
    public final di f46170b;
    public final int f46171c;
    public final boolean d;
    public final org.telegram.ui.Components.mi0 f46172e;
    public final float f46173f;
    public final float h;
    public final ch.p0 f46174n;

    public ci(di diVar, int i7, boolean z10, org.telegram.ui.Components.mi0 mi0Var, float f10, float f11, ch.p0 p0Var, int i10) {
        this.f46169a = i10;
        this.f46170b = diVar;
        this.f46171c = i7;
        this.d = z10;
        this.f46172e = mi0Var;
        this.f46173f = f10;
        this.h = f11;
        this.f46174n = p0Var;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f46169a) {
            case 0:
                org.telegram.messenger.g0.i3(new ci(this.f46170b, this.f46171c, this.d, this.f46172e, this.f46173f, this.h, this.f46174n, 1), 50L);
                return;
            default:
                an anVar = this.f46170b.f46410s;
                org.telegram.ui.Cells.z J8 = anVar.J8(this.f46171c, true);
                if (this.d) {
                    i7 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                    ch.l0.d(anVar, this.f46172e, J8, null, this.f46173f, this.h, this.f46174n, i7, 1);
                    ch.l0.f();
                    return;
                }
                return;
        }
    }
}
