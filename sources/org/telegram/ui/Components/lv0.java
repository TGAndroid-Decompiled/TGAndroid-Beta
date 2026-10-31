package org.telegram.ui.Components;
public final class lv0 {
    public org.telegram.messenger.kp f28204a;
    public org.telegram.ui.ActionBar.p6 f28205b;
    public int f28206c;
    public int d;
    public float e;

    public final void a(org.telegram.messenger.kp kpVar) {
        int b10;
        int i10;
        this.f28204a = kpVar;
        if (kpVar == null) {
            this.f28206c = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.A8, this.f28205b);
            this.d = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21206s8, this.f28205b);
            this.f28206c = i0.b.f(this.e, this.f28206c, 603979776);
            this.d = i0.b.f(this.e, this.d, -1);
            return;
        }
        int c10 = kpVar.c(org.telegram.ui.ActionBar.t6.I.q());
        int d = kpVar.d(org.telegram.ui.ActionBar.t6.I.q());
        org.telegram.ui.ActionBar.p6 p6Var = this.f28205b;
        int f7 = i0.b.f(0.75f, d, c10);
        if (org.telegram.messenger.i0.B(f7) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21259v6, p6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.t6.b(0.08f, -0.08f, f7);
        }
        this.f28206c = b10;
        if (org.telegram.messenger.i0.B(b10) > 0.721f) {
            i10 = -16777216;
        } else {
            i10 = -1;
        }
        this.d = i10;
        this.f28206c = i0.b.f(this.e, this.f28206c, 603979776);
        this.d = i0.b.f(this.e, this.d, -1);
    }
}
