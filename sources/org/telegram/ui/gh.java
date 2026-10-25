package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class gh implements Utilities.Callback {
    public final int f39682a;
    public final long f39683b;
    public final long f39684c;
    public final Long d;
    public final Object e;

    public gh(Object obj, long j10, long j11, Long l4, int i10) {
        this.f39682a = i10;
        this.e = obj;
        this.f39683b = j10;
        this.f39684c = j11;
        this.d = l4;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f39682a) {
            case 0:
                un.z1((un) this.e, this.f39683b, this.f39684c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i10 = ((org.telegram.ui.ActionBar.r2) ((gj) this.e).f39706b).currentAccount;
                boolean z10 = false;
                bi.ca y3 = bi.ca.y(i10, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                }
                y3.i0(this.f39683b, this.f39684c, z10, true);
                return;
        }
    }
}
