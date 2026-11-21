package org.telegram.ui;
public final class hi extends vf.b {
    public final int d;
    public final int f48401e;
    public final org.telegram.ui.Cells.r1 f48402f;
    public final bn f48403g;

    public hi(bn bnVar, int i7, org.telegram.ui.Cells.r1 r1Var, int i10) {
        this.d = i10;
        this.f48403g = bnVar;
        this.f48401e = i7;
        this.f48402f = r1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new ai.y0(this, this.f48401e, 26), 240L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new ai.y0(this, this.f48401e, 29), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new ii(this, this.f48401e, 0), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i7 = this.f48401e;
                bn bnVar = this.f48403g;
                bnVar.f45958ac = i7;
                bnVar.f45973bc = 6;
                this.f48402f.invalidate();
                return;
            case 1:
                int i10 = this.f48401e;
                bn bnVar2 = this.f48403g;
                bnVar2.f45958ac = i10;
                bnVar2.f45973bc = 5;
                bnVar2.dc = null;
                this.f48402f.invalidate();
                return;
            default:
                int i11 = this.f48401e;
                bn bnVar3 = this.f48403g;
                bnVar3.f45958ac = i11;
                bnVar3.f45973bc = 7;
                this.f48402f.invalidate();
                return;
        }
    }
}
