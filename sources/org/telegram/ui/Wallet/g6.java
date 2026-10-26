package org.telegram.ui.Wallet;
public final class g6 implements o1.f {
    public final int f36600a;
    public final Object f36601b;

    public g6(Object obj, int i10) {
        this.f36600a = i10;
        this.f36601b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f36600a) {
            case 0:
                l6.b((l6) this.f36601b, z10, f7);
                return;
            default:
                i9 i9Var = (i9) this.f36601b;
                i9Var.f36691a0 = null;
                i9Var.f36692b0 = 1.0f;
                i9Var.C0();
                return;
        }
    }
}
