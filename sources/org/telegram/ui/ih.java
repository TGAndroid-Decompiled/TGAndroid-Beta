package org.telegram.ui;
public final class ih implements org.telegram.messenger.r20 {
    public final int f38055a;
    public final long f38056b;
    public final long f38057c;
    public final Long d;
    public final Object e;

    public ih(Object obj, long j10, long j11, Long l4, int i10) {
        this.f38055a = i10;
        this.e = obj;
        this.f38056b = j10;
        this.f38057c = j11;
        this.d = l4;
    }

    @Override
    public final void a(Object obj) {
        int i10;
        switch (this.f38055a) {
            case 0:
                un.A0((un) this.e, this.f38056b, this.f38057c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i10 = ((org.telegram.ui.ActionBar.k2) ((nj) this.e).f39917b).currentAccount;
                boolean z10 = false;
                rh.e6 y3 = rh.e6.y(i10, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                }
                y3.g0(this.f38056b, this.f38057c, z10, true);
                return;
        }
    }
}
