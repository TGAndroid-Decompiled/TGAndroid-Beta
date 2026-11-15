package org.telegram.ui;
public final class di implements Runnable {
    public final boolean f46375a;
    public final boolean f46376b;
    public final int f46377c;
    public final boolean d;
    public final org.telegram.ui.Components.mi0 f46378e;
    public final float f46379f;
    public final float h;
    public final ch.p0 f46380n;
    public final org.telegram.messenger.gj f46381r;
    public final an f46382s;

    public di(an anVar, boolean z10, boolean z11, int i7, boolean z12, org.telegram.ui.Components.mi0 mi0Var, float f10, float f11, ch.p0 p0Var, org.telegram.messenger.gj gjVar) {
        this.f46382s = anVar;
        this.f46375a = z10;
        this.f46376b = z11;
        this.f46377c = i7;
        this.d = z12;
        this.f46378e = mi0Var;
        this.f46379f = f10;
        this.h = f11;
        this.f46380n = p0Var;
        this.f46381r = gjVar;
    }

    @Override
    public final void run() {
        if (!this.f46375a) {
            an anVar = this.f46382s;
            if (anVar.Ic != null) {
                anVar.Ic = null;
                if (this.f46376b) {
                    anVar.y8(new ci(this, this.f46377c, this.d, this.f46378e, this.f46379f, this.h, this.f46380n, 0));
                } else {
                    anVar.y8(new zg(4, this, this.f46381r));
                }
                anVar.P7(true);
            }
        }
    }
}
