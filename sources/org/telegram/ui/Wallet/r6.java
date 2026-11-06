package org.telegram.ui.Wallet;
public final class r6 implements r1.c {
    public final int f43075a;
    public final Object f43076b;

    public r6(Object obj, int i7) {
        this.f43075a = i7;
        this.f43076b = obj;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.f43075a) {
            case 0:
                w6.b((w6) this.f43076b, z9, f10);
                return;
            default:
                n9 n9Var = (n9) this.f43076b;
                n9Var.f42820a0 = null;
                n9Var.f42821b0 = 1.0f;
                n9Var.G0();
                return;
        }
    }
}
