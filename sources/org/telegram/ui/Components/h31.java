package org.telegram.ui.Components;
public final class h31 implements rt0 {
    public int f35158a;
    public boolean f35159b;
    public final i31 f35160c;

    public h31(i31 i31Var) {
        this.f35160c = i31Var;
    }

    @Override
    public final void L(int i7, boolean z10) {
        if (this.f35158a != i7 || this.f35159b != z10) {
            this.f35158a = i7;
            this.f35159b = z10;
            if (i7 > org.telegram.messenger.g0.L(20.0f)) {
                i31 i31Var = this.f35160c;
                if (!i31Var.f35437h0) {
                    i31Var.f35443o0.f29713r0 = false;
                    i31Var.f35437h0 = true;
                }
            }
        }
    }
}
