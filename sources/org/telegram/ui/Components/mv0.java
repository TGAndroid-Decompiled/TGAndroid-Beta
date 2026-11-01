package org.telegram.ui.Components;
public final class mv0 {
    public org.telegram.messenger.lp f28585a;
    public org.telegram.ui.ActionBar.p6 f28586b;
    public int f28587c;
    public int d;
    public float e;

    public final void a(org.telegram.messenger.lp lpVar) {
        int b10;
        int i10;
        this.f28585a = lpVar;
        if (lpVar == null) {
            this.f28587c = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.A8, this.f28586b);
            this.d = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21207s8, this.f28586b);
            this.f28587c = i0.b.f(this.e, this.f28587c, 603979776);
            this.d = i0.b.f(this.e, this.d, -1);
            return;
        }
        int c10 = lpVar.c(org.telegram.ui.ActionBar.t6.I.q());
        int d = lpVar.d(org.telegram.ui.ActionBar.t6.I.q());
        org.telegram.ui.ActionBar.p6 p6Var = this.f28586b;
        int f7 = i0.b.f(0.75f, d, c10);
        if (org.telegram.messenger.i0.B(f7) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21260v6, p6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.t6.b(0.08f, -0.08f, f7);
        }
        this.f28587c = b10;
        if (org.telegram.messenger.i0.B(b10) > 0.721f) {
            i10 = -16777216;
        } else {
            i10 = -1;
        }
        this.d = i10;
        this.f28587c = i0.b.f(this.e, this.f28587c, 603979776);
        this.d = i0.b.f(this.e, this.d, -1);
    }
}
