package org.telegram.ui.Wallet;
public final class v6 implements o1.f {
    public final int f35313a;
    public final Object f35314b;

    public v6(Object obj, int i10) {
        this.f35313a = i10;
        this.f35314b = obj;
    }

    @Override
    public final void a(o1.j jVar, boolean z10, float f7, float f10) {
        switch (this.f35313a) {
            case 0:
                a7.b((a7) this.f35314b, z10, f7);
                return;
            default:
                r9 r9Var = (r9) this.f35314b;
                r9Var.f35125a0 = null;
                r9Var.f35126b0 = 1.0f;
                r9Var.F0();
                return;
        }
    }
}
