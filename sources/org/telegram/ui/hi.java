package org.telegram.ui;
public final class hi extends vf.b {
    public final int d;
    public final int f48402e;
    public final org.telegram.ui.Cells.q1 f48403f;
    public final bn f48404g;

    public hi(bn bnVar, int i7, org.telegram.ui.Cells.q1 q1Var, int i10) {
        this.d = i10;
        this.f48404g = bnVar;
        this.f48402e = i7;
        this.f48403f = q1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new ai.w0(this, this.f48402e, 26), 240L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new ai.w0(this, this.f48402e, 29), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new ii(this, this.f48402e, 0), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i7 = this.f48402e;
                bn bnVar = this.f48404g;
                bnVar.f45944ac = i7;
                bnVar.f45959bc = 6;
                this.f48403f.invalidate();
                return;
            case 1:
                int i10 = this.f48402e;
                bn bnVar2 = this.f48404g;
                bnVar2.f45944ac = i10;
                bnVar2.f45959bc = 5;
                bnVar2.dc = null;
                this.f48403f.invalidate();
                return;
            default:
                int i11 = this.f48402e;
                bn bnVar3 = this.f48404g;
                bnVar3.f45944ac = i11;
                bnVar3.f45959bc = 7;
                this.f48403f.invalidate();
                return;
        }
    }
}
