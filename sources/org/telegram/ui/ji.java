package org.telegram.ui;
public final class ji extends vf.b {
    public final int d;
    public final int f47015e;
    public final org.telegram.ui.Cells.q1 f47016f;
    public final cn f47017g;

    public ji(cn cnVar, int i7, org.telegram.ui.Cells.q1 q1Var, int i10) {
        this.d = i10;
        this.f47017g = cnVar;
        this.f47015e = i7;
        this.f47016f = q1Var;
    }

    @Override
    public final void c(boolean z9) {
        switch (this.d) {
            case 0:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new bg.m0(this, this.f47015e, 22), 240L);
                    return;
                }
                return;
            case 1:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new bg.m0(this, this.f47015e, 25), 240L);
                    return;
                }
                return;
            default:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new bg.m0(this, this.f47015e, 26), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i7 = this.f47015e;
                cn cnVar = this.f47017g;
                cnVar.Yb = i7;
                cnVar.Zb = 6;
                this.f47016f.invalidate();
                return;
            case 1:
                int i10 = this.f47015e;
                cn cnVar2 = this.f47017g;
                cnVar2.Yb = i10;
                cnVar2.Zb = 5;
                cnVar2.f44445bc = null;
                this.f47016f.invalidate();
                return;
            default:
                int i11 = this.f47015e;
                cn cnVar3 = this.f47017g;
                cnVar3.Yb = i11;
                cnVar3.Zb = 7;
                this.f47016f.invalidate();
                return;
        }
    }
}
