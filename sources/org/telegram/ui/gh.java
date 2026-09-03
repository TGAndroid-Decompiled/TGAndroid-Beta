package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class gh implements Utilities.Callback {
    public final int f37101a;
    public final long f37102b;
    public final long f37103c;
    public final Long d;
    public final Object f37104e;

    public gh(Object obj, long j10, long j11, Long l10, int i10) {
        this.f37101a = i10;
        this.f37104e = obj;
        this.f37102b = j10;
        this.f37103c = j11;
        this.d = l10;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        boolean z4;
        switch (this.f37101a) {
            case 0:
                xn.Y((xn) this.f37104e, this.f37102b, this.f37103c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i10 = ((org.telegram.ui.ActionBar.p2) ((jj) this.f37104e).f38068b).currentAccount;
                mh.t7 y10 = mh.t7.y(i10, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                y10.i0(this.f37102b, this.f37103c, z4, true);
                return;
        }
    }
}
