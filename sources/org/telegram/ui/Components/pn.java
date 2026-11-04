package org.telegram.ui.Components;
public final class pn implements org.telegram.messenger.u10 {
    public final f60 f37201a;
    public final int f37202b;
    public final long f37203c;
    public final long d;
    public final org.telegram.ui.ActionBar.d2 f37204e;
    public final org.telegram.ui.ActionBar.e6 f37205f;

    public pn(f60 f60Var, int i3, long j10, long j11, org.telegram.ui.wm wmVar, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f37201a = f60Var;
        this.f37202b = i3;
        this.f37203c = j10;
        this.d = j11;
        this.f37204e = wmVar;
        this.f37205f = e6Var;
    }

    @Override
    public final void a(Object obj) {
        Integer num = (Integer) obj;
        this.f37201a.u();
        int intValue = num.intValue();
        int i3 = this.f37202b;
        long j10 = this.f37203c;
        long j11 = this.d;
        org.telegram.ui.ActionBar.d2 d2Var = this.f37204e;
        org.telegram.ui.ActionBar.e6 e6Var = this.f37205f;
        if (intValue == 0) {
            if (org.telegram.messenger.hp.s1(i3).r2(j10, j11, null)) {
                org.telegram.messenger.us.t(i3).G(j10, j11, false);
            }
            if (fc.a(d2Var)) {
                fc.z(d2Var, 4, num.intValue(), e6Var).j();
                return;
            }
            return;
        }
        org.telegram.messenger.us.t(i3).H(j10, num.intValue(), j11);
        if (fc.a(d2Var)) {
            fc.z(d2Var, 5, num.intValue(), e6Var).j();
        }
    }
}
