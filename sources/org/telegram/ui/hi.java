package org.telegram.ui;
public final class hi extends vf.b {
    public final int d;
    public final int f48557e;
    public final org.telegram.ui.Cells.r1 f48558f;
    public final bn f48559g;

    public hi(bn bnVar, int i7, org.telegram.ui.Cells.r1 r1Var, int i10) {
        this.d = i10;
        this.f48559g = bnVar;
        this.f48557e = i7;
        this.f48558f = r1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new ai.u0(this, this.f48557e, 28), 240L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new ii(this, this.f48557e, 1), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new ii(this, this.f48557e, 2), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i7 = this.f48557e;
                bn bnVar = this.f48559g;
                bnVar.f46130ac = i7;
                bnVar.f46145bc = 6;
                this.f48558f.invalidate();
                return;
            case 1:
                int i10 = this.f48557e;
                bn bnVar2 = this.f48559g;
                bnVar2.f46130ac = i10;
                bnVar2.f46145bc = 5;
                bnVar2.dc = null;
                this.f48558f.invalidate();
                return;
            default:
                int i11 = this.f48557e;
                bn bnVar3 = this.f48559g;
                bnVar3.f46130ac = i11;
                bnVar3.f46145bc = 7;
                this.f48558f.invalidate();
                return;
        }
    }
}
