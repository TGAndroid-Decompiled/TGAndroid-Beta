package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class ah implements Utilities.Callback {
    public final int f37778a;
    public final long f37779b;
    public final long f37780c;
    public final Long d;
    public final Object e;

    public ah(Object obj, long j10, long j11, Long l4, int i10) {
        this.f37778a = i10;
        this.e = obj;
        this.f37779b = j10;
        this.f37780c = j11;
        this.d = l4;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f37778a) {
            case 0:
                wn.u1((wn) this.e, this.f37779b, this.f37780c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i10 = ((org.telegram.ui.ActionBar.r2) ((jj) this.e).f40550b).currentAccount;
                boolean z10 = false;
                bi.ca y3 = bi.ca.y(i10, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                }
                y3.i0(this.f37779b, this.f37780c, z10, true);
                return;
        }
    }
}
