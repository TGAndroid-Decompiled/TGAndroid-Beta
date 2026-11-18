package org.telegram.ui;
public final class di implements Runnable {
    public final boolean f46903a;
    public final boolean f46904b;
    public final int f46905c;
    public final boolean d;
    public final org.telegram.ui.Components.vi0 f46906e;
    public final float f46907f;
    public final float h;
    public final ch.p0 f46908n;
    public final org.telegram.messenger.fj f46909r;
    public final bn f46910s;

    public di(bn bnVar, boolean z10, boolean z11, int i7, boolean z12, org.telegram.ui.Components.vi0 vi0Var, float f10, float f11, ch.p0 p0Var, org.telegram.messenger.fj fjVar) {
        this.f46910s = bnVar;
        this.f46903a = z10;
        this.f46904b = z11;
        this.f46905c = i7;
        this.d = z12;
        this.f46906e = vi0Var;
        this.f46907f = f10;
        this.h = f11;
        this.f46908n = p0Var;
        this.f46909r = fjVar;
    }

    @Override
    public final void run() {
        if (!this.f46903a) {
            bn bnVar = this.f46910s;
            if (bnVar.Jc != null) {
                bnVar.Jc = null;
                if (this.f46904b) {
                    bnVar.y8(new bi(this, this.f46905c, this.d, this.f46906e, this.f46907f, this.h, this.f46908n, 0));
                } else {
                    bnVar.y8(new ci(0, this, this.f46909r));
                }
                bnVar.P7(true);
            }
        }
    }
}
