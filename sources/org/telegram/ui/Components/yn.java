package org.telegram.ui.Components;
public final class yn implements org.telegram.messenger.q20 {
    public final z60 f32763a;
    public final int f32764b;
    public final long f32765c;
    public final long d;
    public final org.telegram.ui.ActionBar.k2 e;
    public final org.telegram.ui.ActionBar.p6 f32766f;

    public yn(z60 z60Var, int i10, long j10, long j11, org.telegram.ui.un unVar, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f32763a = z60Var;
        this.f32764b = i10;
        this.f32765c = j10;
        this.d = j11;
        this.e = unVar;
        this.f32766f = p6Var;
    }

    @Override
    public final void a(Object obj) {
        Integer num = (Integer) obj;
        this.f32763a.u();
        int intValue = num.intValue();
        int i10 = this.f32764b;
        long j10 = this.f32765c;
        long j11 = this.d;
        org.telegram.ui.ActionBar.k2 k2Var = this.e;
        org.telegram.ui.ActionBar.p6 p6Var = this.f32766f;
        if (intValue == 0) {
            if (org.telegram.messenger.vp.r1(i10).q2(j10, j11, null)) {
                org.telegram.messenger.ot.t(i10).G(j10, j11, false);
            }
            if (cc.a(k2Var)) {
                cc.z(k2Var, 4, num.intValue(), p6Var).j();
                return;
            }
            return;
        }
        org.telegram.messenger.ot.t(i10).H(j10, num.intValue(), j11);
        if (cc.a(k2Var)) {
            cc.z(k2Var, 5, num.intValue(), p6Var).j();
        }
    }
}
