package org.telegram.ui.Components;
public final class ju0 {
    public org.telegram.messenger.fp f35087a;
    public org.telegram.ui.ActionBar.f6 f35088b;
    public int f35089c;
    public int d;
    public float f35090e;

    public final void a(org.telegram.messenger.fp fpVar) {
        int b10;
        int i7;
        this.f35087a = fpVar;
        if (fpVar == null) {
            this.f35089c = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, this.f35088b);
            this.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28128s8, this.f35088b);
            this.f35089c = i0.a.f(this.f35090e, this.f35089c, 603979776);
            this.d = i0.a.f(this.f35090e, this.d, -1);
            return;
        }
        int c10 = fpVar.c(org.telegram.ui.ActionBar.k6.I.q());
        int d = fpVar.d(org.telegram.ui.ActionBar.k6.I.q());
        org.telegram.ui.ActionBar.f6 f6Var = this.f35088b;
        int f10 = i0.a.f(0.75f, d, c10);
        if (org.telegram.messenger.g0.B(f10) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28183v6, f6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.k6.b(0.08f, -0.08f, f10);
        }
        this.f35089c = b10;
        if (org.telegram.messenger.g0.B(b10) > 0.721f) {
            i7 = -16777216;
        } else {
            i7 = -1;
        }
        this.d = i7;
        this.f35089c = i0.a.f(this.f35090e, this.f35089c, 603979776);
        this.d = i0.a.f(this.f35090e, this.d, -1);
    }
}
