package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class lh implements Utilities.Callback {
    public final int f39576a;
    public final long f39577b;
    public final long f39578c;
    public final Long d;
    public final Object f39579e;

    public lh(Object obj, long j3, long j10, Long l4, int i10) {
        this.f39576a = i10;
        this.f39579e = obj;
        this.f39577b = j3;
        this.f39578c = j10;
        this.d = l4;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f39576a) {
            case 0:
                zn.e0((zn) this.f39579e, this.f39577b, this.f39578c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i10 = ((org.telegram.ui.ActionBar.n2) ((oj) this.f39579e).f40543b).currentAccount;
                boolean z10 = false;
                yh.m5 y3 = yh.m5.y(i10, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                }
                y3.i0(this.f39577b, this.f39578c, z10, true);
                return;
        }
    }
}
