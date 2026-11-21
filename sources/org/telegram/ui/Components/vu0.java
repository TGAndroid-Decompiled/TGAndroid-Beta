package org.telegram.ui.Components;
public final class vu0 {
    public org.telegram.messenger.bp f41558a;
    public org.telegram.ui.ActionBar.h6 f41559b;
    public int f41560c;
    public int d;
    public float f41561e;

    public final void a(org.telegram.messenger.bp bpVar) {
        int b10;
        int i7;
        this.f41558a = bpVar;
        if (bpVar == null) {
            this.f41560c = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.A8, this.f41559b);
            this.d = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29658s8, this.f41559b);
            this.f41560c = i0.a.f(this.f41561e, this.f41560c, 603979776);
            this.d = i0.a.f(this.f41561e, this.d, -1);
            return;
        }
        int c10 = bpVar.c(org.telegram.ui.ActionBar.m6.I.q());
        int d = bpVar.d(org.telegram.ui.ActionBar.m6.I.q());
        org.telegram.ui.ActionBar.h6 h6Var = this.f41559b;
        int f10 = i0.a.f(0.75f, d, c10);
        if (org.telegram.messenger.g0.B(f10) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29713v6, h6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.m6.b(0.08f, -0.08f, f10);
        }
        this.f41560c = b10;
        if (org.telegram.messenger.g0.B(b10) > 0.721f) {
            i7 = -16777216;
        } else {
            i7 = -1;
        }
        this.d = i7;
        this.f41560c = i0.a.f(this.f41561e, this.f41560c, 603979776);
        this.d = i0.a.f(this.f41561e, this.d, -1);
    }
}
