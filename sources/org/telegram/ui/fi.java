package org.telegram.ui;
public final class fi implements Runnable {
    public final boolean f45775a;
    public final boolean f45776b;
    public final int f45777c;
    public final boolean d;
    public final org.telegram.ui.Components.ii0 f45778e;
    public final float f45779f;
    public final float h;
    public final ch.o0 f45780n;
    public final org.telegram.messenger.ij f45781r;
    public final cn f45782s;

    public fi(cn cnVar, boolean z9, boolean z10, int i7, boolean z11, org.telegram.ui.Components.ii0 ii0Var, float f10, float f11, ch.o0 o0Var, org.telegram.messenger.ij ijVar) {
        this.f45782s = cnVar;
        this.f45775a = z9;
        this.f45776b = z10;
        this.f45777c = i7;
        this.d = z11;
        this.f45778e = ii0Var;
        this.f45779f = f10;
        this.h = f11;
        this.f45780n = o0Var;
        this.f45781r = ijVar;
    }

    @Override
    public final void run() {
        if (!this.f45775a) {
            cn cnVar = this.f45782s;
            if (cnVar.Hc != null) {
                cnVar.Hc = null;
                if (this.f45776b) {
                    cnVar.x8(new ei(this, this.f45777c, this.d, this.f45778e, this.f45779f, this.h, this.f45780n, 0));
                } else {
                    cnVar.x8(new oe(16, this, this.f45781r));
                }
                cnVar.P7(true);
            }
        }
    }
}
