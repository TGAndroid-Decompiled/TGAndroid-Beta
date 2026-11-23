package org.telegram.ui.Components;
public final class vu0 {
    public org.telegram.messenger.cp f41532a;
    public org.telegram.ui.ActionBar.h6 f41533b;
    public int f41534c;
    public int d;
    public float f41535e;

    public final void a(org.telegram.messenger.cp cpVar) {
        int b10;
        int i7;
        this.f41532a = cpVar;
        if (cpVar == null) {
            this.f41534c = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.A8, this.f41533b);
            this.d = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29627s8, this.f41533b);
            this.f41534c = i0.a.f(this.f41535e, this.f41534c, 603979776);
            this.d = i0.a.f(this.f41535e, this.d, -1);
            return;
        }
        int c10 = cpVar.c(org.telegram.ui.ActionBar.m6.I.q());
        int d = cpVar.d(org.telegram.ui.ActionBar.m6.I.q());
        org.telegram.ui.ActionBar.h6 h6Var = this.f41533b;
        int f10 = i0.a.f(0.75f, d, c10);
        if (org.telegram.messenger.g0.B(f10) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29682v6, h6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.m6.b(0.08f, -0.08f, f10);
        }
        this.f41534c = b10;
        if (org.telegram.messenger.g0.B(b10) > 0.721f) {
            i7 = -16777216;
        } else {
            i7 = -1;
        }
        this.d = i7;
        this.f41534c = i0.a.f(this.f41535e, this.f41534c, 603979776);
        this.d = i0.a.f(this.f41535e, this.d, -1);
    }
}
