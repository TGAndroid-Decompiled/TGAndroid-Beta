package org.telegram.ui;
public final class di implements Runnable {
    public final boolean f45048a;
    public final boolean f45049b;
    public final int f45050c;
    public final boolean d;
    public final org.telegram.ui.Components.ii0 f45051e;
    public final float f45052f;
    public final float h;
    public final ch.o0 f45053n;
    public final org.telegram.messenger.ij f45054r;
    public final an f45055s;

    public di(an anVar, boolean z9, boolean z10, int i7, boolean z11, org.telegram.ui.Components.ii0 ii0Var, float f10, float f11, ch.o0 o0Var, org.telegram.messenger.ij ijVar) {
        this.f45055s = anVar;
        this.f45048a = z9;
        this.f45049b = z10;
        this.f45050c = i7;
        this.d = z11;
        this.f45051e = ii0Var;
        this.f45052f = f10;
        this.h = f11;
        this.f45053n = o0Var;
        this.f45054r = ijVar;
    }

    @Override
    public final void run() {
        if (!this.f45048a) {
            an anVar = this.f45055s;
            if (anVar.Fc != null) {
                anVar.Fc = null;
                if (this.f45049b) {
                    anVar.w8(new ci(this, this.f45050c, this.d, this.f45051e, this.f45052f, this.h, this.f45053n, 0));
                } else {
                    anVar.w8(new qf(15, this, this.f45054r));
                }
                anVar.O7(true);
            }
        }
    }
}
