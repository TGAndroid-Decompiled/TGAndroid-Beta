package org.telegram.ui.Components;
public final class yo0 implements Runnable {
    public final int f40797a;
    public final ws0 f40798b;
    public final int f40799c;

    public yo0(ws0 ws0Var, int i3, int i10) {
        this.f40797a = i10;
        this.f40798b = ws0Var;
        this.f40799c = i3;
    }

    @Override
    public final void run() {
        switch (this.f40797a) {
            case 0:
                this.f40798b.q1(this.f40799c);
                return;
            case 1:
                ws0 ws0Var = this.f40798b;
                ws0Var.Y0(ws0Var.f40142y1, ws0Var.m1, this.f40799c);
                return;
            case 2:
                this.f40798b.p1(this.f40799c, false);
                return;
            case 3:
                this.f40798b.q1(this.f40799c);
                return;
            default:
                ws0 ws0Var2 = this.f40798b;
                ws0Var2.Z0(ws0Var2.f40142y1, ws0Var2.m1, this.f40799c);
                return;
        }
    }
}
