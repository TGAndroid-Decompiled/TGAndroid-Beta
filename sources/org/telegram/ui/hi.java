package org.telegram.ui;
public final class hi extends vf.b {
    public final int d;
    public final int f46384e;
    public final org.telegram.ui.Cells.q1 f46385f;
    public final an f46386g;

    public hi(an anVar, int i7, org.telegram.ui.Cells.q1 q1Var, int i10) {
        this.d = i10;
        this.f46386g = anVar;
        this.f46384e = i7;
        this.f46385f = q1Var;
    }

    @Override
    public final void c(boolean z9) {
        switch (this.d) {
            case 0:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new bg.m0(this, this.f46384e, 22), 240L);
                    return;
                }
                return;
            case 1:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new bg.m0(this, this.f46384e, 25), 240L);
                    return;
                }
                return;
            default:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new bg.m0(this, this.f46384e, 26), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i7 = this.f46384e;
                an anVar = this.f46386g;
                anVar.Wb = i7;
                anVar.Xb = 6;
                this.f46385f.invalidate();
                return;
            case 1:
                int i10 = this.f46384e;
                an anVar2 = this.f46386g;
                anVar2.Wb = i10;
                anVar2.Xb = 5;
                anVar2.Zb = null;
                this.f46385f.invalidate();
                return;
            default:
                int i11 = this.f46384e;
                an anVar3 = this.f46386g;
                anVar3.Wb = i11;
                anVar3.Xb = 7;
                this.f46385f.invalidate();
                return;
        }
    }
}
