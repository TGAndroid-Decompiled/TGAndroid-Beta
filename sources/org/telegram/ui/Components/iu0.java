package org.telegram.ui.Components;
public final class iu0 {
    public org.telegram.messenger.wo f34829a;
    public org.telegram.ui.ActionBar.e6 f34830b;
    public int f34831c;
    public int d;
    public float f34832e;

    public final void a(org.telegram.messenger.wo woVar) {
        int b10;
        int i3;
        this.f34829a = woVar;
        if (woVar == null) {
            this.f34831c = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, this.f34830b);
            this.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28160s8, this.f34830b);
            this.f34831c = i0.a.f(this.f34832e, this.f34831c, 603979776);
            this.d = i0.a.f(this.f34832e, this.d, -1);
            return;
        }
        int c2 = woVar.c(org.telegram.ui.ActionBar.k6.I.q());
        int d = woVar.d(org.telegram.ui.ActionBar.k6.I.q());
        org.telegram.ui.ActionBar.e6 e6Var = this.f34830b;
        int f10 = i0.a.f(0.75f, d, c2);
        if (org.telegram.messenger.g0.B(f10) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28214v6, e6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.k6.b(0.08f, -0.08f, f10);
        }
        this.f34831c = b10;
        if (org.telegram.messenger.g0.B(b10) > 0.721f) {
            i3 = -16777216;
        } else {
            i3 = -1;
        }
        this.d = i3;
        this.f34831c = i0.a.f(this.f34832e, this.f34831c, 603979776);
        this.d = i0.a.f(this.f34832e, this.d, -1);
    }
}
