package org.telegram.ui.Wallet;
public final class k6 implements o1.f {
    public final int f34439a;
    public final Object f34440b;

    public k6(Object obj, int i10) {
        this.f34439a = i10;
        this.f34440b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f34439a) {
            case 0:
                p6.b((p6) this.f34440b, z10, f7);
                return;
            default:
                l9 l9Var = (l9) this.f34440b;
                l9Var.X = null;
                l9Var.Y = 1.0f;
                l9Var.A0();
                return;
        }
    }
}
