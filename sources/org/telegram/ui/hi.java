package org.telegram.ui;
public final class hi extends vf.b {
    public final int d;
    public final int f48369e;
    public final org.telegram.ui.Cells.r1 f48370f;
    public final bn f48371g;

    public hi(bn bnVar, int i7, org.telegram.ui.Cells.r1 r1Var, int i10) {
        this.d = i10;
        this.f48371g = bnVar;
        this.f48369e = i7;
        this.f48370f = r1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new ai.t0(this, this.f48369e, 28), 240L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new ii(this, this.f48369e, 1), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new ii(this, this.f48369e, 2), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i7 = this.f48369e;
                bn bnVar = this.f48371g;
                bnVar.f45915ac = i7;
                bnVar.f45930bc = 6;
                this.f48370f.invalidate();
                return;
            case 1:
                int i10 = this.f48369e;
                bn bnVar2 = this.f48371g;
                bnVar2.f45915ac = i10;
                bnVar2.f45930bc = 5;
                bnVar2.dc = null;
                this.f48370f.invalidate();
                return;
            default:
                int i11 = this.f48369e;
                bn bnVar3 = this.f48371g;
                bnVar3.f45915ac = i11;
                bnVar3.f45930bc = 7;
                this.f48370f.invalidate();
                return;
        }
    }
}
