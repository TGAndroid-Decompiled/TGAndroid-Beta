package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class lh implements Utilities.Callback {
    public final int f35349a;
    public final long f35350b;
    public final long f35351c;
    public final Long d;
    public final Object e;

    public lh(Object obj, long j3, long j10, Long l4, int i10) {
        this.f35349a = i10;
        this.e = obj;
        this.f35350b = j3;
        this.f35351c = j10;
        this.d = l4;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        boolean z10;
        switch (this.f35349a) {
            case 0:
                xn.Z((xn) this.e, this.f35350b, this.f35351c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i10 = ((org.telegram.ui.ActionBar.o2) ((mj) this.e).f35714b).currentAccount;
                yh.s5 y3 = yh.s5.y(i10, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                y3.i0(this.f35350b, this.f35351c, z10, true);
                return;
        }
    }
}
