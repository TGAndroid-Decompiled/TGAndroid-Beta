package org.telegram.ui.Wallet;
public final class h7 implements r1.c {
    public final int f44312a;
    public final Object f44313b;

    public h7(Object obj, int i7) {
        this.f44312a = i7;
        this.f44313b = obj;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f44312a) {
            case 0:
                m7.b((m7) this.f44313b, z10, f10);
                return;
            default:
                da daVar = (da) this.f44313b;
                daVar.f44054b0 = null;
                daVar.f44055c0 = 1.0f;
                daVar.G0();
                return;
        }
    }
}
