package org.telegram.ui.Components;
public final class pn implements org.telegram.messenger.c20 {
    public final k60 f37040a;
    public final int f37041b;
    public final long f37042c;
    public final long d;
    public final org.telegram.ui.ActionBar.f2 f37043e;
    public final org.telegram.ui.ActionBar.h6 f37044f;

    public pn(k60 k60Var, int i7, long j3, long j10, org.telegram.ui.cn cnVar, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f37040a = k60Var;
        this.f37041b = i7;
        this.f37042c = j3;
        this.d = j10;
        this.f37043e = cnVar;
        this.f37044f = h6Var;
    }

    @Override
    public final void a(Object obj) {
        Integer num = (Integer) obj;
        this.f37040a.u();
        int intValue = num.intValue();
        int i7 = this.f37041b;
        long j3 = this.f37042c;
        long j10 = this.d;
        org.telegram.ui.ActionBar.f2 f2Var = this.f37043e;
        org.telegram.ui.ActionBar.h6 h6Var = this.f37044f;
        if (intValue == 0) {
            if (org.telegram.messenger.qp.s1(i7).r2(j3, j10, null)) {
                org.telegram.messenger.dt.t(i7).G(j3, j10, false);
            }
            if (gc.a(f2Var)) {
                gc.z(f2Var, 4, num.intValue(), h6Var).j();
                return;
            }
            return;
        }
        org.telegram.messenger.dt.t(i7).H(j3, num.intValue(), j10);
        if (gc.a(f2Var)) {
            gc.z(f2Var, 5, num.intValue(), h6Var).j();
        }
    }
}
