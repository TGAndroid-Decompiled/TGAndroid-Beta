package org.telegram.ui.Components;
public final class cp0 implements o1.f {
    public final int f23361a;
    public final kp0 f23362b;
    public final o1.k f23363c;

    public cp0(kp0 kp0Var, o1.k kVar, int i10) {
        this.f23361a = i10;
        this.f23362b = kp0Var;
        this.f23363c = kVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f23361a) {
            case 0:
                if (!z10) {
                    this.f23362b.f25792z.remove(this.f23363c);
                    hVar.c();
                    return;
                }
                return;
            default:
                kp0 kp0Var = this.f23362b;
                if (!z10) {
                    kp0Var.f25792z.remove(this.f23363c);
                    hVar.c();
                    return;
                }
                kp0Var.getClass();
                return;
        }
    }
}
