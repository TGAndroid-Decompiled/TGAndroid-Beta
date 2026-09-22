package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class nh implements Utilities.Callback {
    public final int f35988a;
    public final long f35989b;
    public final long f35990c;
    public final Long d;
    public final Object e;

    public nh(Object obj, long j3, long j10, Long l4, int i10) {
        this.f35988a = i10;
        this.e = obj;
        this.f35989b = j3;
        this.f35990c = j10;
        this.d = l4;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        boolean z10;
        switch (this.f35988a) {
            case 0:
                bo.Y((bo) this.e, this.f35989b, this.f35990c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i10 = ((org.telegram.ui.ActionBar.n2) ((nj) this.e).f35998b).currentAccount;
                yh.u5 y3 = yh.u5.y(i10, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                y3.i0(this.f35989b, this.f35990c, z10, true);
                return;
        }
    }
}
