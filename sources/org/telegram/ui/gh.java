package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class gh implements Utilities.Callback {
    public final int f39685a;
    public final long f39686b;
    public final long f39687c;
    public final Long d;
    public final Object e;

    public gh(Object obj, long j10, long j11, Long l4, int i10) {
        this.f39685a = i10;
        this.e = obj;
        this.f39686b = j10;
        this.f39687c = j11;
        this.d = l4;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f39685a) {
            case 0:
                un.z1((un) this.e, this.f39686b, this.f39687c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i10 = ((org.telegram.ui.ActionBar.r2) ((gj) this.e).f39709b).currentAccount;
                boolean z10 = false;
                bi.ca y3 = bi.ca.y(i10, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                }
                y3.i0(this.f39686b, this.f39687c, z10, true);
                return;
        }
    }
}
