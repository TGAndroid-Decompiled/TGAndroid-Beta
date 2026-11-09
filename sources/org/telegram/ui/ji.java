package org.telegram.ui;
public final class ji extends vf.b {
    public final int d;
    public final int f46972e;
    public final org.telegram.ui.Cells.q1 f46973f;
    public final cn f46974g;

    public ji(cn cnVar, int i7, org.telegram.ui.Cells.q1 q1Var, int i10) {
        this.d = i10;
        this.f46974g = cnVar;
        this.f46972e = i7;
        this.f46973f = q1Var;
    }

    @Override
    public final void c(boolean z9) {
        switch (this.d) {
            case 0:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new bg.m0(this, this.f46972e, 22), 240L);
                    return;
                }
                return;
            case 1:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new bg.m0(this, this.f46972e, 25), 240L);
                    return;
                }
                return;
            default:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new bg.m0(this, this.f46972e, 26), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i7 = this.f46972e;
                cn cnVar = this.f46974g;
                cnVar.Yb = i7;
                cnVar.Zb = 6;
                this.f46973f.invalidate();
                return;
            case 1:
                int i10 = this.f46972e;
                cn cnVar2 = this.f46974g;
                cnVar2.Yb = i10;
                cnVar2.Zb = 5;
                cnVar2.f44404bc = null;
                this.f46973f.invalidate();
                return;
            default:
                int i11 = this.f46972e;
                cn cnVar3 = this.f46974g;
                cnVar3.Yb = i11;
                cnVar3.Zb = 7;
                this.f46973f.invalidate();
                return;
        }
    }
}
