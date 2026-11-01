package org.telegram.ui.Components;
public final class yn implements org.telegram.messenger.r20 {
    public final z60 f32877a;
    public final int f32878b;
    public final long f32879c;
    public final long d;
    public final org.telegram.ui.ActionBar.k2 e;
    public final org.telegram.ui.ActionBar.p6 f32880f;

    public yn(z60 z60Var, int i10, long j10, long j11, org.telegram.ui.un unVar, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f32877a = z60Var;
        this.f32878b = i10;
        this.f32879c = j10;
        this.d = j11;
        this.e = unVar;
        this.f32880f = p6Var;
    }

    @Override
    public final void a(Object obj) {
        Integer num = (Integer) obj;
        this.f32877a.u();
        int intValue = num.intValue();
        int i10 = this.f32878b;
        long j10 = this.f32879c;
        long j11 = this.d;
        org.telegram.ui.ActionBar.k2 k2Var = this.e;
        org.telegram.ui.ActionBar.p6 p6Var = this.f32880f;
        if (intValue == 0) {
            if (org.telegram.messenger.wp.r1(i10).q2(j10, j11, null)) {
                org.telegram.messenger.pt.t(i10).G(j10, j11, false);
            }
            if (cc.a(k2Var)) {
                cc.z(k2Var, 4, num.intValue(), p6Var).j();
                return;
            }
            return;
        }
        org.telegram.messenger.pt.t(i10).H(j10, num.intValue(), j11);
        if (cc.a(k2Var)) {
            cc.z(k2Var, 5, num.intValue(), p6Var).j();
        }
    }
}
