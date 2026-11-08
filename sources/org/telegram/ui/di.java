package org.telegram.ui;
public final class di implements Runnable {
    public final boolean f45067a;
    public final boolean f45068b;
    public final int f45069c;
    public final boolean d;
    public final org.telegram.ui.Components.ii0 f45070e;
    public final float f45071f;
    public final float h;
    public final ch.o0 f45072n;
    public final org.telegram.messenger.ij f45073r;
    public final an f45074s;

    public di(an anVar, boolean z9, boolean z10, int i7, boolean z11, org.telegram.ui.Components.ii0 ii0Var, float f10, float f11, ch.o0 o0Var, org.telegram.messenger.ij ijVar) {
        this.f45074s = anVar;
        this.f45067a = z9;
        this.f45068b = z10;
        this.f45069c = i7;
        this.d = z11;
        this.f45070e = ii0Var;
        this.f45071f = f10;
        this.h = f11;
        this.f45072n = o0Var;
        this.f45073r = ijVar;
    }

    @Override
    public final void run() {
        if (!this.f45067a) {
            an anVar = this.f45074s;
            if (anVar.Fc != null) {
                anVar.Fc = null;
                if (this.f45068b) {
                    anVar.w8(new ci(this, this.f45069c, this.d, this.f45070e, this.f45071f, this.h, this.f45072n, 0));
                } else {
                    anVar.w8(new qf(15, this, this.f45073r));
                }
                anVar.O7(true);
            }
        }
    }
}
