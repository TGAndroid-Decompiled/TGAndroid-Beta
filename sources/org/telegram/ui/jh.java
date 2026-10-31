package org.telegram.ui;
public final class jh implements org.telegram.messenger.q20 {
    public final int f38524a;
    public final long f38525b;
    public final long f38526c;
    public final Long d;
    public final Object e;

    public jh(Object obj, long j10, long j11, Long l4, int i10) {
        this.f38524a = i10;
        this.e = obj;
        this.f38525b = j10;
        this.f38526c = j11;
        this.d = l4;
    }

    @Override
    public final void a(Object obj) {
        int i10;
        switch (this.f38524a) {
            case 0:
                un.d0((un) this.e, this.f38525b, this.f38526c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i10 = ((org.telegram.ui.ActionBar.k2) ((nj) this.e).f39956b).currentAccount;
                boolean z10 = false;
                rh.e6 y3 = rh.e6.y(i10, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                }
                y3.g0(this.f38525b, this.f38526c, z10, true);
                return;
        }
    }
}
