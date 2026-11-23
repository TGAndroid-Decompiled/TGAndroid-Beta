package org.telegram.ui.Components;
public final class vu0 {
    public org.telegram.messenger.cp f41560a;
    public org.telegram.ui.ActionBar.h6 f41561b;
    public int f41562c;
    public int d;
    public float f41563e;

    public final void a(org.telegram.messenger.cp cpVar) {
        int b10;
        int i7;
        this.f41560a = cpVar;
        if (cpVar == null) {
            this.f41562c = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.A8, this.f41561b);
            this.d = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29661s8, this.f41561b);
            this.f41562c = i0.a.f(this.f41563e, this.f41562c, 603979776);
            this.d = i0.a.f(this.f41563e, this.d, -1);
            return;
        }
        int c10 = cpVar.c(org.telegram.ui.ActionBar.m6.I.q());
        int d = cpVar.d(org.telegram.ui.ActionBar.m6.I.q());
        org.telegram.ui.ActionBar.h6 h6Var = this.f41561b;
        int f10 = i0.a.f(0.75f, d, c10);
        if (org.telegram.messenger.g0.B(f10) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29716v6, h6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.m6.b(0.08f, -0.08f, f10);
        }
        this.f41562c = b10;
        if (org.telegram.messenger.g0.B(b10) > 0.721f) {
            i7 = -16777216;
        } else {
            i7 = -1;
        }
        this.d = i7;
        this.f41562c = i0.a.f(this.f41563e, this.f41562c, 603979776);
        this.d = i0.a.f(this.f41563e, this.d, -1);
    }
}
