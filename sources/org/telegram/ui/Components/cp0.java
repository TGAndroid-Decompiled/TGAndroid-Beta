package org.telegram.ui.Components;
public final class cp0 implements o1.f {
    public final int f23419a;
    public final kp0 f23420b;
    public final o1.k f23421c;

    public cp0(kp0 kp0Var, o1.k kVar, int i10) {
        this.f23419a = i10;
        this.f23420b = kp0Var;
        this.f23421c = kVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f23419a) {
            case 0:
                if (!z10) {
                    this.f23420b.f25796z.remove(this.f23421c);
                    hVar.c();
                    return;
                }
                return;
            default:
                kp0 kp0Var = this.f23420b;
                if (!z10) {
                    kp0Var.f25796z.remove(this.f23421c);
                    hVar.c();
                    return;
                }
                kp0Var.getClass();
                return;
        }
    }
}
