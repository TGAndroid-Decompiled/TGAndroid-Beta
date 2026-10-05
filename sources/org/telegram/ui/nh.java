package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class nh implements Utilities.Callback {
    public final int f38964a;
    public final long f38965b;
    public final long f38966c;
    public final Long d;
    public final Object f38967e;

    public nh(Object obj, long j3, long j10, Long l4, int i10) {
        this.f38964a = i10;
        this.f38967e = obj;
        this.f38965b = j3;
        this.f38966c = j10;
        this.d = l4;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        boolean z10;
        switch (this.f38964a) {
            case 0:
                yn.Z((yn) this.f38967e, this.f38965b, this.f38966c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i10 = ((org.telegram.ui.ActionBar.n2) ((lj) this.f38967e).f38338b).currentAccount;
                yh.u5 y3 = yh.u5.y(i10, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                y3.i0(this.f38965b, this.f38966c, z10, true);
                return;
        }
    }
}
