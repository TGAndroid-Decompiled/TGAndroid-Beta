package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class gh implements Utilities.Callback {
    public final int f34618a;
    public final long f34619b;
    public final long f34620c;
    public final Long d;
    public final Object e;

    public gh(Object obj, long j10, long j11, Long l10, int i10) {
        this.f34618a = i10;
        this.e = obj;
        this.f34619b = j10;
        this.f34620c = j11;
        this.d = l10;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        boolean z4;
        switch (this.f34618a) {
            case 0:
                xn.Y((xn) this.e, this.f34619b, this.f34620c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i10 = ((org.telegram.ui.ActionBar.p2) ((jj) this.e).f35363b).currentAccount;
                lh.t7 y10 = lh.t7.y(i10, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                y10.i0(this.f34619b, this.f34620c, z4, true);
                return;
        }
    }
}
