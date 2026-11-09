package org.telegram.ui.Components;
public final class qn implements org.telegram.messenger.c20 {
    public final l60 f37441a;
    public final int f37442b;
    public final long f37443c;
    public final long d;
    public final org.telegram.ui.ActionBar.f2 f37444e;
    public final org.telegram.ui.ActionBar.g6 f37445f;

    public qn(l60 l60Var, int i7, long j3, long j10, org.telegram.ui.cn cnVar, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f37441a = l60Var;
        this.f37442b = i7;
        this.f37443c = j3;
        this.d = j10;
        this.f37444e = cnVar;
        this.f37445f = g6Var;
    }

    @Override
    public final void a(Object obj) {
        Integer num = (Integer) obj;
        this.f37441a.u();
        int intValue = num.intValue();
        int i7 = this.f37442b;
        long j3 = this.f37443c;
        long j10 = this.d;
        org.telegram.ui.ActionBar.f2 f2Var = this.f37444e;
        org.telegram.ui.ActionBar.g6 g6Var = this.f37445f;
        if (intValue == 0) {
            if (org.telegram.messenger.qp.s1(i7).r2(j3, j10, null)) {
                org.telegram.messenger.dt.t(i7).G(j3, j10, false);
            }
            if (hc.a(f2Var)) {
                hc.z(f2Var, 4, num.intValue(), g6Var).j();
                return;
            }
            return;
        }
        org.telegram.messenger.dt.t(i7).H(j3, num.intValue(), j10);
        if (hc.a(f2Var)) {
            hc.z(f2Var, 5, num.intValue(), g6Var).j();
        }
    }
}
