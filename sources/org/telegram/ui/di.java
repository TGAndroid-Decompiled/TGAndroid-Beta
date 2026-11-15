package org.telegram.ui;
public final class di implements Runnable {
    public final boolean f46403a;
    public final boolean f46404b;
    public final int f46405c;
    public final boolean d;
    public final org.telegram.ui.Components.mi0 f46406e;
    public final float f46407f;
    public final float h;
    public final ch.p0 f46408n;
    public final org.telegram.messenger.gj f46409r;
    public final an f46410s;

    public di(an anVar, boolean z10, boolean z11, int i7, boolean z12, org.telegram.ui.Components.mi0 mi0Var, float f10, float f11, ch.p0 p0Var, org.telegram.messenger.gj gjVar) {
        this.f46410s = anVar;
        this.f46403a = z10;
        this.f46404b = z11;
        this.f46405c = i7;
        this.d = z12;
        this.f46406e = mi0Var;
        this.f46407f = f10;
        this.h = f11;
        this.f46408n = p0Var;
        this.f46409r = gjVar;
    }

    @Override
    public final void run() {
        if (!this.f46403a) {
            an anVar = this.f46410s;
            if (anVar.Ic != null) {
                anVar.Ic = null;
                if (this.f46404b) {
                    anVar.y8(new ci(this, this.f46405c, this.d, this.f46406e, this.f46407f, this.h, this.f46408n, 0));
                } else {
                    anVar.y8(new zg(4, this, this.f46409r));
                }
                anVar.P7(true);
            }
        }
    }
}
