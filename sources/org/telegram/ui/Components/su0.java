package org.telegram.ui.Components;
public final class su0 {
    public org.telegram.messenger.bp f39846a;
    public org.telegram.ui.ActionBar.i6 f39847b;
    public int f39848c;
    public int d;
    public float f39849e;

    public final void a(org.telegram.messenger.bp bpVar) {
        int b10;
        int i7;
        this.f39846a = bpVar;
        if (bpVar == null) {
            this.f39848c = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.A8, this.f39847b);
            this.d = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29676s8, this.f39847b);
            this.f39848c = i0.a.f(this.f39849e, this.f39848c, 603979776);
            this.d = i0.a.f(this.f39849e, this.d, -1);
            return;
        }
        int c10 = bpVar.c(org.telegram.ui.ActionBar.n6.I.q());
        int d = bpVar.d(org.telegram.ui.ActionBar.n6.I.q());
        org.telegram.ui.ActionBar.i6 i6Var = this.f39847b;
        int f10 = i0.a.f(0.75f, d, c10);
        if (org.telegram.messenger.g0.B(f10) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29731v6, i6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.n6.b(0.08f, -0.08f, f10);
        }
        this.f39848c = b10;
        if (org.telegram.messenger.g0.B(b10) > 0.721f) {
            i7 = -16777216;
        } else {
            i7 = -1;
        }
        this.d = i7;
        this.f39848c = i0.a.f(this.f39849e, this.f39848c, 603979776);
        this.d = i0.a.f(this.f39849e, this.d, -1);
    }
}
