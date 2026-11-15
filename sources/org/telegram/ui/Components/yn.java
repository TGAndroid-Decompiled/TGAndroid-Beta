package org.telegram.ui.Components;
public final class yn implements org.telegram.messenger.z10 {
    public final m60 f42043a;
    public final int f42044b;
    public final long f42045c;
    public final long d;
    public final org.telegram.ui.ActionBar.e2 f42046e;
    public final org.telegram.ui.ActionBar.e6 f42047f;

    public yn(m60 m60Var, int i7, long j3, long j10, org.telegram.ui.an anVar, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f42043a = m60Var;
        this.f42044b = i7;
        this.f42045c = j3;
        this.d = j10;
        this.f42046e = anVar;
        this.f42047f = e6Var;
    }

    @Override
    public final void a(Object obj) {
        Integer num = (Integer) obj;
        this.f42043a.u();
        int intValue = num.intValue();
        int i7 = this.f42044b;
        long j3 = this.f42045c;
        long j10 = this.d;
        org.telegram.ui.ActionBar.e2 e2Var = this.f42046e;
        org.telegram.ui.ActionBar.e6 e6Var = this.f42047f;
        if (intValue == 0) {
            if (org.telegram.messenger.np.s1(i7).r2(j3, j10, null)) {
                org.telegram.messenger.at.t(i7).G(j3, j10, false);
            }
            if (cc.a(e2Var)) {
                cc.z(e2Var, 4, num.intValue(), e6Var).j();
                return;
            }
            return;
        }
        org.telegram.messenger.at.t(i7).H(j3, num.intValue(), j10);
        if (cc.a(e2Var)) {
            cc.z(e2Var, 5, num.intValue(), e6Var).j();
        }
    }
}
