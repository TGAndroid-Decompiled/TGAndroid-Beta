package org.telegram.ui;
public final class di implements Runnable {
    public final boolean f47142a;
    public final boolean f47143b;
    public final int f47144c;
    public final boolean d;
    public final org.telegram.ui.Components.xi0 f47145e;
    public final float f47146f;
    public final float h;
    public final ch.p0 f47147n;
    public final org.telegram.messenger.fj f47148r;
    public final bn f47149s;

    public di(bn bnVar, boolean z10, boolean z11, int i7, boolean z12, org.telegram.ui.Components.xi0 xi0Var, float f10, float f11, ch.p0 p0Var, org.telegram.messenger.fj fjVar) {
        this.f47149s = bnVar;
        this.f47142a = z10;
        this.f47143b = z11;
        this.f47144c = i7;
        this.d = z12;
        this.f47145e = xi0Var;
        this.f47146f = f10;
        this.h = f11;
        this.f47147n = p0Var;
        this.f47148r = fjVar;
    }

    @Override
    public final void run() {
        if (!this.f47142a) {
            bn bnVar = this.f47149s;
            if (bnVar.Jc != null) {
                bnVar.Jc = null;
                if (this.f47143b) {
                    bnVar.y8(new ci(this, this.f47144c, this.d, this.f47145e, this.f47146f, this.h, this.f47147n, 0));
                } else {
                    bnVar.y8(new ah(4, this, this.f47148r));
                }
                bnVar.P7(true);
            }
        }
    }
}
