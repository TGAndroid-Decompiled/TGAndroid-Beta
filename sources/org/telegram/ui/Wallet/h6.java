package org.telegram.ui.Wallet;
public final class h6 implements o1.f {
    public final int f34281a;
    public final Object f34282b;

    public h6(Object obj, int i10) {
        this.f34281a = i10;
        this.f34282b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f34281a) {
            case 0:
                m6.b((m6) this.f34282b, z10, f7);
                return;
            default:
                i9 i9Var = (i9) this.f34282b;
                i9Var.X = null;
                i9Var.Y = 1.0f;
                i9Var.A0();
                return;
        }
    }
}
