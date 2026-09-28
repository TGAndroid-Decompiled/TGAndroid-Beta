package org.telegram.ui.Components;
public final class cp0 implements o1.f {
    public final int f23360a;
    public final kp0 f23361b;
    public final o1.k f23362c;

    public cp0(kp0 kp0Var, o1.k kVar, int i10) {
        this.f23360a = i10;
        this.f23361b = kp0Var;
        this.f23362c = kVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f23360a) {
            case 0:
                if (!z10) {
                    this.f23361b.f25791z.remove(this.f23362c);
                    hVar.c();
                    return;
                }
                return;
            default:
                kp0 kp0Var = this.f23361b;
                if (!z10) {
                    kp0Var.f25791z.remove(this.f23362c);
                    hVar.c();
                    return;
                }
                kp0Var.getClass();
                return;
        }
    }
}
