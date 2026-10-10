package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class lh implements Utilities.Callback {
    public final int f39622a;
    public final long f39623b;
    public final long f39624c;
    public final Long d;
    public final Object f39625e;

    public lh(Object obj, long j3, long j10, Long l4, int i10) {
        this.f39622a = i10;
        this.f39625e = obj;
        this.f39623b = j3;
        this.f39624c = j10;
        this.d = l4;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f39622a) {
            case 0:
                zn.e0((zn) this.f39625e, this.f39623b, this.f39624c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i10 = ((org.telegram.ui.ActionBar.n2) ((oj) this.f39625e).f40589b).currentAccount;
                boolean z10 = false;
                yh.m5 y3 = yh.m5.y(i10, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                }
                y3.i0(this.f39623b, this.f39624c, z10, true);
                return;
        }
    }
}
