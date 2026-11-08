package org.telegram.ui.Wallet;
public final class q6 implements r1.c {
    public final int f43068a;
    public final Object f43069b;

    public q6(Object obj, int i7) {
        this.f43068a = i7;
        this.f43069b = obj;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.f43068a) {
            case 0:
                v6.b((v6) this.f43069b, z9, f10);
                return;
            default:
                m9 m9Var = (m9) this.f43069b;
                m9Var.f42814a0 = null;
                m9Var.f42815b0 = 1.0f;
                m9Var.G0();
                return;
        }
    }
}
