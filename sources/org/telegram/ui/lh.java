package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class lh implements Utilities.Callback {
    public final int f39578a;
    public final long f39579b;
    public final long f39580c;
    public final Long d;
    public final Object f39581e;

    public lh(Object obj, long j3, long j10, Long l4, int i10) {
        this.f39578a = i10;
        this.f39581e = obj;
        this.f39579b = j3;
        this.f39580c = j10;
        this.d = l4;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f39578a) {
            case 0:
                zn.e0((zn) this.f39581e, this.f39579b, this.f39580c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i10 = ((org.telegram.ui.ActionBar.n2) ((oj) this.f39581e).f40545b).currentAccount;
                boolean z10 = false;
                yh.m5 y3 = yh.m5.y(i10, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                }
                y3.i0(this.f39579b, this.f39580c, z10, true);
                return;
        }
    }
}
