package org.telegram.ui.Components;
public final class ku0 {
    public org.telegram.messenger.cp f36616a;
    public org.telegram.ui.ActionBar.e6 f36617b;
    public int f36618c;
    public int d;
    public float f36619e;

    public final void a(org.telegram.messenger.cp cpVar) {
        int b10;
        int i7;
        this.f36616a = cpVar;
        if (cpVar == null) {
            this.f36618c = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.A8, this.f36617b);
            this.d = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29129s8, this.f36617b);
            this.f36618c = i0.a.f(this.f36619e, this.f36618c, 603979776);
            this.d = i0.a.f(this.f36619e, this.d, -1);
            return;
        }
        int c10 = cpVar.c(org.telegram.ui.ActionBar.j6.I.q());
        int d = cpVar.d(org.telegram.ui.ActionBar.j6.I.q());
        org.telegram.ui.ActionBar.e6 e6Var = this.f36617b;
        int f10 = i0.a.f(0.75f, d, c10);
        if (org.telegram.messenger.g0.B(f10) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29184v6, e6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.j6.b(0.08f, -0.08f, f10);
        }
        this.f36618c = b10;
        if (org.telegram.messenger.g0.B(b10) > 0.721f) {
            i7 = -16777216;
        } else {
            i7 = -1;
        }
        this.d = i7;
        this.f36618c = i0.a.f(this.f36619e, this.f36618c, 603979776);
        this.d = i0.a.f(this.f36619e, this.d, -1);
    }
}
