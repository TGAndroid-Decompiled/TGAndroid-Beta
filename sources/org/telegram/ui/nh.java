package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class nh implements Utilities.Callback {
    public final int f38977a;
    public final long f38978b;
    public final long f38979c;
    public final Long d;
    public final Object f38980e;

    public nh(Object obj, long j3, long j10, Long l4, int i10) {
        this.f38977a = i10;
        this.f38980e = obj;
        this.f38978b = j3;
        this.f38979c = j10;
        this.d = l4;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        boolean z10;
        switch (this.f38977a) {
            case 0:
                yn.Z((yn) this.f38980e, this.f38978b, this.f38979c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i10 = ((org.telegram.ui.ActionBar.n2) ((lj) this.f38980e).f38278b).currentAccount;
                yh.t5 y3 = yh.t5.y(i10, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                y3.i0(this.f38978b, this.f38979c, z10, true);
                return;
        }
    }
}
