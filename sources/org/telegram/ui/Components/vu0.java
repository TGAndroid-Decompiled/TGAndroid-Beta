package org.telegram.ui.Components;
public final class vu0 {
    public org.telegram.messenger.cp f41559a;
    public org.telegram.ui.ActionBar.h6 f41560b;
    public int f41561c;
    public int d;
    public float f41562e;

    public final void a(org.telegram.messenger.cp cpVar) {
        int b10;
        int i7;
        this.f41559a = cpVar;
        if (cpVar == null) {
            this.f41561c = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.A8, this.f41560b);
            this.d = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29661s8, this.f41560b);
            this.f41561c = i0.a.f(this.f41562e, this.f41561c, 603979776);
            this.d = i0.a.f(this.f41562e, this.d, -1);
            return;
        }
        int c10 = cpVar.c(org.telegram.ui.ActionBar.m6.I.q());
        int d = cpVar.d(org.telegram.ui.ActionBar.m6.I.q());
        org.telegram.ui.ActionBar.h6 h6Var = this.f41560b;
        int f10 = i0.a.f(0.75f, d, c10);
        if (org.telegram.messenger.g0.B(f10) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29716v6, h6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.m6.b(0.08f, -0.08f, f10);
        }
        this.f41561c = b10;
        if (org.telegram.messenger.g0.B(b10) > 0.721f) {
            i7 = -16777216;
        } else {
            i7 = -1;
        }
        this.d = i7;
        this.f41561c = i0.a.f(this.f41562e, this.f41561c, 603979776);
        this.d = i0.a.f(this.f41562e, this.d, -1);
    }
}
