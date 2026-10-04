package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class nh implements Utilities.Callback {
    public final int f38983a;
    public final long f38984b;
    public final long f38985c;
    public final Long d;
    public final Object f38986e;

    public nh(Object obj, long j3, long j10, Long l4, int i10) {
        this.f38983a = i10;
        this.f38986e = obj;
        this.f38984b = j3;
        this.f38985c = j10;
        this.d = l4;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        boolean z10;
        switch (this.f38983a) {
            case 0:
                yn.Z((yn) this.f38986e, this.f38984b, this.f38985c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i10 = ((org.telegram.ui.ActionBar.n2) ((lj) this.f38986e).f38284b).currentAccount;
                yh.t5 y3 = yh.t5.y(i10, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                y3.i0(this.f38984b, this.f38985c, z10, true);
                return;
        }
    }
}
