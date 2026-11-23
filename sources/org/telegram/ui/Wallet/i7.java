package org.telegram.ui.Wallet;
public final class i7 implements r1.c {
    public final int f44483a;
    public final Object f44484b;

    public i7(Object obj, int i7) {
        this.f44483a = i7;
        this.f44484b = obj;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f44483a) {
            case 0:
                n7.b((n7) this.f44484b, z10, f10);
                return;
            default:
                ea eaVar = (ea) this.f44484b;
                eaVar.f44226b0 = null;
                eaVar.f44227c0 = 1.0f;
                eaVar.G0();
                return;
        }
    }
}
