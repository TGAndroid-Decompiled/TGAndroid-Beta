package org.telegram.ui;
public final class di implements Runnable {
    public final boolean f46932a;
    public final boolean f46933b;
    public final int f46934c;
    public final boolean d;
    public final org.telegram.ui.Components.xi0 f46935e;
    public final float f46936f;
    public final float h;
    public final ch.p0 f46937n;
    public final org.telegram.messenger.gj f46938r;
    public final bn f46939s;

    public di(bn bnVar, boolean z10, boolean z11, int i7, boolean z12, org.telegram.ui.Components.xi0 xi0Var, float f10, float f11, ch.p0 p0Var, org.telegram.messenger.gj gjVar) {
        this.f46939s = bnVar;
        this.f46932a = z10;
        this.f46933b = z11;
        this.f46934c = i7;
        this.d = z12;
        this.f46935e = xi0Var;
        this.f46936f = f10;
        this.h = f11;
        this.f46937n = p0Var;
        this.f46938r = gjVar;
    }

    @Override
    public final void run() {
        if (!this.f46932a) {
            bn bnVar = this.f46939s;
            if (bnVar.Jc != null) {
                bnVar.Jc = null;
                if (this.f46933b) {
                    bnVar.y8(new bi(this, this.f46934c, this.d, this.f46935e, this.f46936f, this.h, this.f46937n, 0));
                } else {
                    bnVar.y8(new ci(0, this, this.f46938r));
                }
                bnVar.P7(true);
            }
        }
    }
}
