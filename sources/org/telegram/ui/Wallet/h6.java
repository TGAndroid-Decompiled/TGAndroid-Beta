package org.telegram.ui.Wallet;
public final class h6 implements o1.f {
    public final int f36660a;
    public final Object f36661b;

    public h6(Object obj, int i10) {
        this.f36660a = i10;
        this.f36661b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f36660a) {
            case 0:
                m6.b((m6) this.f36661b, z10, f7);
                return;
            default:
                i9 i9Var = (i9) this.f36661b;
                i9Var.f36716a0 = null;
                i9Var.f36717b0 = 1.0f;
                i9Var.C0();
                return;
        }
    }
}
