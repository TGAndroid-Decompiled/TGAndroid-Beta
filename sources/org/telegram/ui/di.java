package org.telegram.ui;
public final class di implements Runnable {
    public final boolean f45072a;
    public final boolean f45073b;
    public final int f45074c;
    public final boolean d;
    public final org.telegram.ui.Components.ii0 f45075e;
    public final float f45076f;
    public final float h;
    public final ch.o0 f45077n;
    public final org.telegram.messenger.ij f45078r;
    public final an f45079s;

    public di(an anVar, boolean z9, boolean z10, int i7, boolean z11, org.telegram.ui.Components.ii0 ii0Var, float f10, float f11, ch.o0 o0Var, org.telegram.messenger.ij ijVar) {
        this.f45079s = anVar;
        this.f45072a = z9;
        this.f45073b = z10;
        this.f45074c = i7;
        this.d = z11;
        this.f45075e = ii0Var;
        this.f45076f = f10;
        this.h = f11;
        this.f45077n = o0Var;
        this.f45078r = ijVar;
    }

    @Override
    public final void run() {
        if (!this.f45072a) {
            an anVar = this.f45079s;
            if (anVar.Fc != null) {
                anVar.Fc = null;
                if (this.f45073b) {
                    anVar.w8(new ci(this, this.f45074c, this.d, this.f45075e, this.f45076f, this.h, this.f45077n, 0));
                } else {
                    anVar.w8(new qf(15, this, this.f45078r));
                }
                anVar.O7(true);
            }
        }
    }
}
