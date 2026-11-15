package org.telegram.ui;
public final class hi extends vf.b {
    public final int d;
    public final int f47703e;
    public final org.telegram.ui.Cells.q1 f47704f;
    public final an f47705g;

    public hi(an anVar, int i7, org.telegram.ui.Cells.q1 q1Var, int i10) {
        this.d = i10;
        this.f47705g = anVar;
        this.f47703e = i7;
        this.f47704f = q1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new ai.w0(this, this.f47703e, 23), 240L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new ai.w0(this, this.f47703e, 26), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new ai.w0(this, this.f47703e, 27), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i7 = this.f47703e;
                an anVar = this.f47705g;
                anVar.Zb = i7;
                anVar.f45129ac = 6;
                this.f47704f.invalidate();
                return;
            case 1:
                int i10 = this.f47703e;
                an anVar2 = this.f47705g;
                anVar2.Zb = i10;
                anVar2.f45129ac = 5;
                anVar2.f45158cc = null;
                this.f47704f.invalidate();
                return;
            default:
                int i11 = this.f47703e;
                an anVar3 = this.f47705g;
                anVar3.Zb = i11;
                anVar3.f45129ac = 7;
                this.f47704f.invalidate();
                return;
        }
    }
}
