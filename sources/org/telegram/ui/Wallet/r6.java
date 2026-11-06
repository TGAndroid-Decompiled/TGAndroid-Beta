package org.telegram.ui.Wallet;
public final class r6 implements r1.c {
    public final int f43099a;
    public final Object f43100b;

    public r6(Object obj, int i7) {
        this.f43099a = i7;
        this.f43100b = obj;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.f43099a) {
            case 0:
                w6.b((w6) this.f43100b, z9, f10);
                return;
            default:
                n9 n9Var = (n9) this.f43100b;
                n9Var.f42844a0 = null;
                n9Var.f42845b0 = 1.0f;
                n9Var.G0();
                return;
        }
    }
}
