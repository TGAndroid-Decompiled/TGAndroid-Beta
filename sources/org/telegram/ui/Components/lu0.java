package org.telegram.ui.Components;
public final class lu0 {
    public org.telegram.messenger.fp f35854a;
    public org.telegram.ui.ActionBar.g6 f35855b;
    public int f35856c;
    public int d;
    public float f35857e;

    public final void a(org.telegram.messenger.fp fpVar) {
        int b10;
        int i7;
        this.f35854a = fpVar;
        if (fpVar == null) {
            this.f35856c = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.A8, this.f35855b);
            this.d = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28145s8, this.f35855b);
            this.f35856c = i0.a.f(this.f35857e, this.f35856c, 603979776);
            this.d = i0.a.f(this.f35857e, this.d, -1);
            return;
        }
        int c10 = fpVar.c(org.telegram.ui.ActionBar.l6.I.q());
        int d = fpVar.d(org.telegram.ui.ActionBar.l6.I.q());
        org.telegram.ui.ActionBar.g6 g6Var = this.f35855b;
        int f10 = i0.a.f(0.75f, d, c10);
        if (org.telegram.messenger.g0.B(f10) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28200v6, g6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.l6.b(0.08f, -0.08f, f10);
        }
        this.f35856c = b10;
        if (org.telegram.messenger.g0.B(b10) > 0.721f) {
            i7 = -16777216;
        } else {
            i7 = -1;
        }
        this.d = i7;
        this.f35856c = i0.a.f(this.f35857e, this.f35856c, 603979776);
        this.d = i0.a.f(this.f35857e, this.d, -1);
    }
}
