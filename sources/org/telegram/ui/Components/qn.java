package org.telegram.ui.Components;
public final class qn implements org.telegram.messenger.c20 {
    public final k60 f37364a;
    public final int f37365b;
    public final long f37366c;
    public final long d;
    public final org.telegram.ui.ActionBar.f2 f37367e;
    public final org.telegram.ui.ActionBar.f6 f37368f;

    public qn(k60 k60Var, int i7, long j3, long j10, org.telegram.ui.an anVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f37364a = k60Var;
        this.f37365b = i7;
        this.f37366c = j3;
        this.d = j10;
        this.f37367e = anVar;
        this.f37368f = f6Var;
    }

    @Override
    public final void a(Object obj) {
        Integer num = (Integer) obj;
        this.f37364a.u();
        int intValue = num.intValue();
        int i7 = this.f37365b;
        long j3 = this.f37366c;
        long j10 = this.d;
        org.telegram.ui.ActionBar.f2 f2Var = this.f37367e;
        org.telegram.ui.ActionBar.f6 f6Var = this.f37368f;
        if (intValue == 0) {
            if (org.telegram.messenger.qp.s1(i7).r2(j3, j10, null)) {
                org.telegram.messenger.dt.t(i7).G(j3, j10, false);
            }
            if (hc.a(f2Var)) {
                hc.z(f2Var, 4, num.intValue(), f6Var).j();
                return;
            }
            return;
        }
        org.telegram.messenger.dt.t(i7).H(j3, num.intValue(), j10);
        if (hc.a(f2Var)) {
            hc.z(f2Var, 5, num.intValue(), f6Var).j();
        }
    }
}
