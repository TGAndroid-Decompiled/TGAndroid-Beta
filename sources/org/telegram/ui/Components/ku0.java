package org.telegram.ui.Components;
public final class ku0 {
    public org.telegram.messenger.fp f35446a;
    public org.telegram.ui.ActionBar.h6 f35447b;
    public int f35448c;
    public int d;
    public float f35449e;

    public final void a(org.telegram.messenger.fp fpVar) {
        int b10;
        int i7;
        this.f35446a = fpVar;
        if (fpVar == null) {
            this.f35448c = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.A8, this.f35447b);
            this.d = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28170s8, this.f35447b);
            this.f35448c = i0.a.f(this.f35449e, this.f35448c, 603979776);
            this.d = i0.a.f(this.f35449e, this.d, -1);
            return;
        }
        int c10 = fpVar.c(org.telegram.ui.ActionBar.m6.I.q());
        int d = fpVar.d(org.telegram.ui.ActionBar.m6.I.q());
        org.telegram.ui.ActionBar.h6 h6Var = this.f35447b;
        int f10 = i0.a.f(0.75f, d, c10);
        if (org.telegram.messenger.g0.B(f10) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28225v6, h6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.m6.b(0.08f, -0.08f, f10);
        }
        this.f35448c = b10;
        if (org.telegram.messenger.g0.B(b10) > 0.721f) {
            i7 = -16777216;
        } else {
            i7 = -1;
        }
        this.d = i7;
        this.f35448c = i0.a.f(this.f35449e, this.f35448c, 603979776);
        this.d = i0.a.f(this.f35449e, this.d, -1);
    }
}
