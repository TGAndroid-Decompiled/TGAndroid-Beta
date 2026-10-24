package org.telegram.ui.Wallet;
public final class h6 implements o1.f {
    public final int f34576a;
    public final Object f34577b;

    public h6(Object obj, int i10) {
        this.f34576a = i10;
        this.f34577b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f34576a) {
            case 0:
                m6.b((m6) this.f34577b, z10, f7);
                return;
            default:
                j9 j9Var = (j9) this.f34577b;
                j9Var.Z = null;
                j9Var.f34659a0 = 1.0f;
                j9Var.B0();
                return;
        }
    }
}
