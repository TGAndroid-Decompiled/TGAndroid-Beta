package org.telegram.ui.Wallet;
public final class n6 implements o1.f {
    public final int f34642a;
    public final Object f34643b;

    public n6(Object obj, int i10) {
        this.f34642a = i10;
        this.f34643b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f34642a) {
            case 0:
                s6.b((s6) this.f34643b, z10, f7);
                return;
            default:
                o9 o9Var = (o9) this.f34643b;
                o9Var.X = null;
                o9Var.Y = 1.0f;
                o9Var.A0();
                return;
        }
    }
}
