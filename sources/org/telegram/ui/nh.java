package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class nh implements Utilities.Callback {
    public final int f38978a;
    public final long f38979b;
    public final long f38980c;
    public final Long d;
    public final Object f38981e;

    public nh(Object obj, long j3, long j10, Long l4, int i10) {
        this.f38978a = i10;
        this.f38981e = obj;
        this.f38979b = j3;
        this.f38980c = j10;
        this.d = l4;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        boolean z10;
        switch (this.f38978a) {
            case 0:
                yn.Z((yn) this.f38981e, this.f38979b, this.f38980c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i10 = ((org.telegram.ui.ActionBar.n2) ((lj) this.f38981e).f38279b).currentAccount;
                yh.t5 y3 = yh.t5.y(i10, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                y3.i0(this.f38979b, this.f38980c, z10, true);
                return;
        }
    }
}
