package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class jh implements Utilities.Callback {
    public final int f34788a;
    public final long f34789b;
    public final long f34790c;
    public final Long d;
    public final Object e;

    public jh(Object obj, long j3, long j10, Long l4, int i10) {
        this.f34788a = i10;
        this.e = obj;
        this.f34789b = j3;
        this.f34790c = j10;
        this.d = l4;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        boolean z10;
        switch (this.f34788a) {
            case 0:
                wn.Z((wn) this.e, this.f34789b, this.f34790c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i10 = ((org.telegram.ui.ActionBar.m2) ((kj) this.e).f35064b).currentAccount;
                yh.t5 y3 = yh.t5.y(i10, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                y3.i0(this.f34789b, this.f34790c, z10, true);
                return;
        }
    }
}
