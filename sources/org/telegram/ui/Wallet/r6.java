package org.telegram.ui.Wallet;
public final class r6 implements r1.c {
    public final int f43100a;
    public final Object f43101b;

    public r6(Object obj, int i7) {
        this.f43100a = i7;
        this.f43101b = obj;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.f43100a) {
            case 0:
                w6.b((w6) this.f43101b, z9, f10);
                return;
            default:
                n9 n9Var = (n9) this.f43101b;
                n9Var.f42845a0 = null;
                n9Var.f42846b0 = 1.0f;
                n9Var.G0();
                return;
        }
    }
}
