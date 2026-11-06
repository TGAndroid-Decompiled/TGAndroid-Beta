package org.telegram.ui;
public final class di implements Runnable {
    public final boolean f45073a;
    public final boolean f45074b;
    public final int f45075c;
    public final boolean d;
    public final org.telegram.ui.Components.ii0 f45076e;
    public final float f45077f;
    public final float h;
    public final ch.o0 f45078n;
    public final org.telegram.messenger.ij f45079r;
    public final an f45080s;

    public di(an anVar, boolean z9, boolean z10, int i7, boolean z11, org.telegram.ui.Components.ii0 ii0Var, float f10, float f11, ch.o0 o0Var, org.telegram.messenger.ij ijVar) {
        this.f45080s = anVar;
        this.f45073a = z9;
        this.f45074b = z10;
        this.f45075c = i7;
        this.d = z11;
        this.f45076e = ii0Var;
        this.f45077f = f10;
        this.h = f11;
        this.f45078n = o0Var;
        this.f45079r = ijVar;
    }

    @Override
    public final void run() {
        if (!this.f45073a) {
            an anVar = this.f45080s;
            if (anVar.Fc != null) {
                anVar.Fc = null;
                if (this.f45074b) {
                    anVar.w8(new ci(this, this.f45075c, this.d, this.f45076e, this.f45077f, this.h, this.f45078n, 0));
                } else {
                    anVar.w8(new qf(15, this, this.f45079r));
                }
                anVar.O7(true);
            }
        }
    }
}
