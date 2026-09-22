package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class mh implements Utilities.Callback {
    public final int f35755a;
    public final long f35756b;
    public final long f35757c;
    public final Long d;
    public final Object e;

    public mh(Object obj, long j3, long j10, Long l4, int i10) {
        this.f35755a = i10;
        this.e = obj;
        this.f35756b = j3;
        this.f35757c = j10;
        this.d = l4;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        boolean z10;
        switch (this.f35755a) {
            case 0:
                zn.a0((zn) this.e, this.f35756b, this.f35757c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i10 = ((org.telegram.ui.ActionBar.n2) ((nj) this.e).f36059b).currentAccount;
                yh.u5 y3 = yh.u5.y(i10, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                y3.i0(this.f35756b, this.f35757c, z10, true);
                return;
        }
    }
}
