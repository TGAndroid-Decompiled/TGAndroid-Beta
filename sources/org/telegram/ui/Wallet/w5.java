package org.telegram.ui.Wallet;
public final class w5 implements o1.f {
    public final int f35595a;
    public final Object f35596b;

    public w5(Object obj, int i10) {
        this.f35595a = i10;
        this.f35596b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f35595a) {
            case 0:
                b6.b((b6) this.f35596b, z10, f7);
                return;
            default:
                i8 i8Var = (i8) this.f35596b;
                i8Var.X = null;
                i8Var.Y = 1.0f;
                i8Var.A0();
                return;
        }
    }
}
