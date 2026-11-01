package org.telegram.ui.Wallet;
public final class v6 implements o1.f {
    public final int f35317a;
    public final Object f35318b;

    public v6(Object obj, int i10) {
        this.f35317a = i10;
        this.f35318b = obj;
    }

    @Override
    public final void a(o1.j jVar, boolean z10, float f7, float f10) {
        switch (this.f35317a) {
            case 0:
                a7.b((a7) this.f35318b, z10, f7);
                return;
            default:
                r9 r9Var = (r9) this.f35318b;
                r9Var.f35130a0 = null;
                r9Var.f35131b0 = 1.0f;
                r9Var.G0();
                return;
        }
    }
}
