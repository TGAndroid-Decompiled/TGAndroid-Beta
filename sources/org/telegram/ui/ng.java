package org.telegram.ui;
public final class ng implements org.telegram.messenger.u10 {
    public final int f47987a;
    public final long f47988b;
    public final long f47989c;
    public final Long d;
    public final Object f47990e;

    public ng(Object obj, long j10, long j11, Long l10, int i3) {
        this.f47987a = i3;
        this.f47990e = obj;
        this.f47988b = j10;
        this.f47989c = j11;
        this.d = l10;
    }

    @Override
    public final void a(Object obj) {
        int i3;
        switch (this.f47987a) {
            case 0:
                wm.q1((wm) this.f47990e, this.f47988b, this.f47989c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i3 = ((org.telegram.ui.ActionBar.d2) ((oi) this.f47990e).f48298b).currentAccount;
                boolean z10 = false;
                ci.e9 y9 = ci.e9.y(i3, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                }
                y9.g0(this.f47988b, this.f47989c, z10, true);
                return;
        }
    }
}
