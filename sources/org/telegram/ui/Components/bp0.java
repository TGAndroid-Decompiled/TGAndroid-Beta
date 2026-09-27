package org.telegram.ui.Components;
public final class bp0 implements o1.f {
    public final int f23104a;
    public final kp0 f23105b;
    public final o1.k f23106c;

    public bp0(kp0 kp0Var, o1.k kVar, int i10) {
        this.f23104a = i10;
        this.f23105b = kp0Var;
        this.f23106c = kVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f23104a) {
            case 0:
                if (!z10) {
                    this.f23105b.f25821z.remove(this.f23106c);
                    hVar.c();
                    return;
                }
                return;
            default:
                kp0 kp0Var = this.f23105b;
                if (!z10) {
                    kp0Var.f25821z.remove(this.f23106c);
                    hVar.c();
                    return;
                }
                kp0Var.getClass();
                return;
        }
    }
}
