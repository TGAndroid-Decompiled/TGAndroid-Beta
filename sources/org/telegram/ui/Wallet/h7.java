package org.telegram.ui.Wallet;
public final class h7 implements r1.c {
    public final int f44322a;
    public final Object f44323b;

    public h7(Object obj, int i7) {
        this.f44322a = i7;
        this.f44323b = obj;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f44322a) {
            case 0:
                m7.b((m7) this.f44323b, z10, f10);
                return;
            default:
                da daVar = (da) this.f44323b;
                daVar.f44064b0 = null;
                daVar.f44065c0 = 1.0f;
                daVar.G0();
                return;
        }
    }
}
