package org.telegram.ui;
public final class hi extends vf.b {
    public final int d;
    public final int f47713e;
    public final org.telegram.ui.Cells.q1 f47714f;
    public final an f47715g;

    public hi(an anVar, int i7, org.telegram.ui.Cells.q1 q1Var, int i10) {
        this.d = i10;
        this.f47715g = anVar;
        this.f47713e = i7;
        this.f47714f = q1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new ai.v0(this, this.f47713e, 23), 240L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new ai.v0(this, this.f47713e, 26), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new ai.v0(this, this.f47713e, 27), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i7 = this.f47713e;
                an anVar = this.f47715g;
                anVar.Zb = i7;
                anVar.f45130ac = 6;
                this.f47714f.invalidate();
                return;
            case 1:
                int i10 = this.f47713e;
                an anVar2 = this.f47715g;
                anVar2.Zb = i10;
                anVar2.f45130ac = 5;
                anVar2.f45159cc = null;
                this.f47714f.invalidate();
                return;
            default:
                int i11 = this.f47713e;
                an anVar3 = this.f47715g;
                anVar3.Zb = i11;
                anVar3.f45130ac = 7;
                this.f47714f.invalidate();
                return;
        }
    }
}
