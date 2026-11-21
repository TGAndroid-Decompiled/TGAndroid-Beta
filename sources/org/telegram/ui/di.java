package org.telegram.ui;
public final class di implements Runnable {
    public final boolean f46969a;
    public final boolean f46970b;
    public final int f46971c;
    public final boolean d;
    public final org.telegram.ui.Components.xi0 f46972e;
    public final float f46973f;
    public final float h;
    public final ch.p0 f46974n;
    public final org.telegram.messenger.fj f46975r;
    public final bn f46976s;

    public di(bn bnVar, boolean z10, boolean z11, int i7, boolean z12, org.telegram.ui.Components.xi0 xi0Var, float f10, float f11, ch.p0 p0Var, org.telegram.messenger.fj fjVar) {
        this.f46976s = bnVar;
        this.f46969a = z10;
        this.f46970b = z11;
        this.f46971c = i7;
        this.d = z12;
        this.f46972e = xi0Var;
        this.f46973f = f10;
        this.h = f11;
        this.f46974n = p0Var;
        this.f46975r = fjVar;
    }

    @Override
    public final void run() {
        if (!this.f46969a) {
            bn bnVar = this.f46976s;
            if (bnVar.Jc != null) {
                bnVar.Jc = null;
                if (this.f46970b) {
                    bnVar.y8(new ci(this, this.f46971c, this.d, this.f46972e, this.f46973f, this.h, this.f46974n, 0));
                } else {
                    bnVar.y8(new eh(2, this, this.f46975r));
                }
                bnVar.P7(true);
            }
        }
    }
}
