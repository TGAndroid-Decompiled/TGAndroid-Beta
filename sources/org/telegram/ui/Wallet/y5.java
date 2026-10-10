package org.telegram.ui.Wallet;
public final class y5 implements o1.f {
    public final int f35759a;
    public final Object f35760b;

    public y5(Object obj, int i10) {
        this.f35759a = i10;
        this.f35760b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f35759a) {
            case 0:
                d6.b((d6) this.f35760b, z10, f7);
                return;
            default:
                k8 k8Var = (k8) this.f35760b;
                k8Var.X = null;
                k8Var.Y = 1.0f;
                k8Var.A0();
                return;
        }
    }
}
