package org.telegram.ui;
public final class fi implements Runnable {
    public final boolean f45721a;
    public final boolean f45722b;
    public final int f45723c;
    public final boolean d;
    public final org.telegram.ui.Components.ji0 f45724e;
    public final float f45725f;
    public final float h;
    public final ch.o0 f45726n;
    public final org.telegram.messenger.ij f45727r;
    public final cn f45728s;

    public fi(cn cnVar, boolean z9, boolean z10, int i7, boolean z11, org.telegram.ui.Components.ji0 ji0Var, float f10, float f11, ch.o0 o0Var, org.telegram.messenger.ij ijVar) {
        this.f45728s = cnVar;
        this.f45721a = z9;
        this.f45722b = z10;
        this.f45723c = i7;
        this.d = z11;
        this.f45724e = ji0Var;
        this.f45725f = f10;
        this.h = f11;
        this.f45726n = o0Var;
        this.f45727r = ijVar;
    }

    @Override
    public final void run() {
        if (!this.f45721a) {
            cn cnVar = this.f45728s;
            if (cnVar.Hc != null) {
                cnVar.Hc = null;
                if (this.f45722b) {
                    cnVar.x8(new ei(this, this.f45723c, this.d, this.f45724e, this.f45725f, this.h, this.f45726n, 0));
                } else {
                    cnVar.x8(new rf(15, this, this.f45727r));
                }
                cnVar.P7(true);
            }
        }
    }
}
