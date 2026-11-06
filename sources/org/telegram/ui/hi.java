package org.telegram.ui;
public final class hi extends vf.b {
    public final int d;
    public final int f46385e;
    public final org.telegram.ui.Cells.q1 f46386f;
    public final an f46387g;

    public hi(an anVar, int i7, org.telegram.ui.Cells.q1 q1Var, int i10) {
        this.d = i10;
        this.f46387g = anVar;
        this.f46385e = i7;
        this.f46386f = q1Var;
    }

    @Override
    public final void c(boolean z9) {
        switch (this.d) {
            case 0:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new bg.m0(this, this.f46385e, 22), 240L);
                    return;
                }
                return;
            case 1:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new bg.m0(this, this.f46385e, 25), 240L);
                    return;
                }
                return;
            default:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new bg.m0(this, this.f46385e, 26), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i7 = this.f46385e;
                an anVar = this.f46387g;
                anVar.Wb = i7;
                anVar.Xb = 6;
                this.f46386f.invalidate();
                return;
            case 1:
                int i10 = this.f46385e;
                an anVar2 = this.f46387g;
                anVar2.Wb = i10;
                anVar2.Xb = 5;
                anVar2.Zb = null;
                this.f46386f.invalidate();
                return;
            default:
                int i11 = this.f46385e;
                an anVar3 = this.f46387g;
                anVar3.Wb = i11;
                anVar3.Xb = 7;
                this.f46386f.invalidate();
                return;
        }
    }
}
