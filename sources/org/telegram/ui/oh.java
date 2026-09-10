package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class oh implements Utilities.Callback {
    public final int f35495a;
    public final long f35496b;
    public final long f35497c;
    public final Long d;
    public final Object e;

    public oh(Object obj, long j3, long j10, Long l4, int i10) {
        this.f35495a = i10;
        this.e = obj;
        this.f35496b = j3;
        this.f35497c = j10;
        this.d = l4;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        boolean z10;
        switch (this.f35495a) {
            case 0:
                eo.Y((eo) this.e, this.f35496b, this.f35497c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i10 = ((org.telegram.ui.ActionBar.p2) ((pj) this.e).f35851b).currentAccount;
                xh.v5 y3 = xh.v5.y(i10, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                y3.i0(this.f35496b, this.f35497c, z10, true);
                return;
        }
    }
}
