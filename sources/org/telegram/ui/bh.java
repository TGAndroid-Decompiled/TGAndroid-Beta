package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class bh implements Utilities.Callback {
    public final int f36072a;
    public final long f36073b;
    public final long f36074c;
    public final Long d;
    public final Object e;

    public bh(Object obj, long j10, long j11, Long l4, int i10) {
        this.f36072a = i10;
        this.e = obj;
        this.f36073b = j10;
        this.f36074c = j11;
        this.d = l4;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f36072a) {
            case 0:
                sn.e0((sn) this.e, this.f36073b, this.f36074c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i10 = ((org.telegram.ui.ActionBar.o2) ((fj) this.e).f37347b).currentAccount;
                boolean z10 = false;
                ai.ha y3 = ai.ha.y(i10, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                }
                y3.i0(this.f36073b, this.f36074c, z10, true);
                return;
        }
    }
}
