package org.telegram.ui;
public final class hi extends vf.b {
    public final int d;
    public final int f48405e;
    public final org.telegram.ui.Cells.r1 f48406f;
    public final bn f48407g;

    public hi(bn bnVar, int i7, org.telegram.ui.Cells.r1 r1Var, int i10) {
        this.d = i10;
        this.f48407g = bnVar;
        this.f48405e = i7;
        this.f48406f = r1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new ai.c1(this, this.f48405e, 26), 240L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new ai.c1(this, this.f48405e, 29), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new ii(this, this.f48405e, 0), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i7 = this.f48405e;
                bn bnVar = this.f48407g;
                bnVar.f45962ac = i7;
                bnVar.f45977bc = 6;
                this.f48406f.invalidate();
                return;
            case 1:
                int i10 = this.f48405e;
                bn bnVar2 = this.f48407g;
                bnVar2.f45962ac = i10;
                bnVar2.f45977bc = 5;
                bnVar2.dc = null;
                this.f48406f.invalidate();
                return;
            default:
                int i11 = this.f48405e;
                bn bnVar3 = this.f48407g;
                bnVar3.f45962ac = i11;
                bnVar3.f45977bc = 7;
                this.f48406f.invalidate();
                return;
        }
    }
}
