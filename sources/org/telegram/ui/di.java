package org.telegram.ui;
public final class di extends sf.b {
    public final int d;
    public final int f44715e;
    public final org.telegram.ui.Cells.q1 f44716f;
    public final wm f44717g;

    public di(wm wmVar, int i3, org.telegram.ui.Cells.q1 q1Var, int i10) {
        this.d = i10;
        this.f44717g = wmVar;
        this.f44715e = i3;
        this.f44716f = q1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new cg.l0(this, this.f44715e, 22), 240L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new cg.l0(this, this.f44715e, 25), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new cg.l0(this, this.f44715e, 26), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i3 = this.f44715e;
                wm wmVar = this.f44717g;
                wmVar.Xb = i3;
                wmVar.Yb = 6;
                this.f44716f.invalidate();
                return;
            case 1:
                int i10 = this.f44715e;
                wm wmVar2 = this.f44717g;
                wmVar2.Xb = i10;
                wmVar2.Yb = 5;
                wmVar2.ac = null;
                this.f44716f.invalidate();
                return;
            default:
                int i11 = this.f44715e;
                wm wmVar3 = this.f44717g;
                wmVar3.Xb = i11;
                wmVar3.Yb = 7;
                this.f44716f.invalidate();
                return;
        }
    }
}
