package org.telegram.ui.Wallet;
public final class p6 implements r1.c {
    public final int f42986a;
    public final Object f42987b;

    public p6(Object obj, int i7) {
        this.f42986a = i7;
        this.f42987b = obj;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.f42986a) {
            case 0:
                u6.b((u6) this.f42987b, z9, f10);
                return;
            default:
                l9 l9Var = (l9) this.f42987b;
                l9Var.f42732a0 = null;
                l9Var.f42733b0 = 1.0f;
                l9Var.G0();
                return;
        }
    }
}
