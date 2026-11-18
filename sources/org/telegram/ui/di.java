package org.telegram.ui;
public final class di implements Runnable {
    public final boolean f46980a;
    public final boolean f46981b;
    public final int f46982c;
    public final boolean d;
    public final org.telegram.ui.Components.vi0 f46983e;
    public final float f46984f;
    public final float h;
    public final ch.p0 f46985n;
    public final org.telegram.messenger.fj f46986r;
    public final bn f46987s;

    public di(bn bnVar, boolean z10, boolean z11, int i7, boolean z12, org.telegram.ui.Components.vi0 vi0Var, float f10, float f11, ch.p0 p0Var, org.telegram.messenger.fj fjVar) {
        this.f46987s = bnVar;
        this.f46980a = z10;
        this.f46981b = z11;
        this.f46982c = i7;
        this.d = z12;
        this.f46983e = vi0Var;
        this.f46984f = f10;
        this.h = f11;
        this.f46985n = p0Var;
        this.f46986r = fjVar;
    }

    @Override
    public final void run() {
        if (!this.f46980a) {
            bn bnVar = this.f46987s;
            if (bnVar.Jc != null) {
                bnVar.Jc = null;
                if (this.f46981b) {
                    bnVar.y8(new bi(this, this.f46982c, this.d, this.f46983e, this.f46984f, this.h, this.f46985n, 0));
                } else {
                    bnVar.y8(new ci(0, this, this.f46986r));
                }
                bnVar.P7(true);
            }
        }
    }
}
