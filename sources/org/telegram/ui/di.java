package org.telegram.ui;
public final class di implements Runnable {
    public final boolean f46972a;
    public final boolean f46973b;
    public final int f46974c;
    public final boolean d;
    public final org.telegram.ui.Components.xi0 f46975e;
    public final float f46976f;
    public final float h;
    public final ch.p0 f46977n;
    public final org.telegram.messenger.gj f46978r;
    public final bn f46979s;

    public di(bn bnVar, boolean z10, boolean z11, int i7, boolean z12, org.telegram.ui.Components.xi0 xi0Var, float f10, float f11, ch.p0 p0Var, org.telegram.messenger.gj gjVar) {
        this.f46979s = bnVar;
        this.f46972a = z10;
        this.f46973b = z11;
        this.f46974c = i7;
        this.d = z12;
        this.f46975e = xi0Var;
        this.f46976f = f10;
        this.h = f11;
        this.f46977n = p0Var;
        this.f46978r = gjVar;
    }

    @Override
    public final void run() {
        if (!this.f46972a) {
            bn bnVar = this.f46979s;
            if (bnVar.Jc != null) {
                bnVar.Jc = null;
                if (this.f46973b) {
                    bnVar.y8(new ci(this, this.f46974c, this.d, this.f46975e, this.f46976f, this.h, this.f46977n, 0));
                } else {
                    bnVar.y8(new eh(2, this, this.f46978r));
                }
                bnVar.P7(true);
            }
        }
    }
}
