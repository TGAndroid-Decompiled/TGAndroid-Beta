package org.telegram.ui.Wallet;
public final class z5 implements o1.f {
    public final int f35601a;
    public final Object f35602b;

    public z5(Object obj, int i10) {
        this.f35601a = i10;
        this.f35602b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f35601a) {
            case 0:
                e6.b((e6) this.f35602b, z10, f7);
                return;
            default:
                l8 l8Var = (l8) this.f35602b;
                l8Var.X = null;
                l8Var.Y = 1.0f;
                l8Var.A0();
                return;
        }
    }
}
