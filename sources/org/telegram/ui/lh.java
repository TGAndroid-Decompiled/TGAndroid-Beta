package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class lh implements Utilities.Callback {
    public final int f39664a;
    public final long f39665b;
    public final long f39666c;
    public final Long d;
    public final Object f39667e;

    public lh(Object obj, long j3, long j10, Long l4, int i10) {
        this.f39664a = i10;
        this.f39667e = obj;
        this.f39665b = j3;
        this.f39666c = j10;
        this.d = l4;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f39664a) {
            case 0:
                zn.e0((zn) this.f39667e, this.f39665b, this.f39666c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i10 = ((org.telegram.ui.ActionBar.m2) ((oj) this.f39667e).f40556b).currentAccount;
                boolean z10 = false;
                yh.n5 y3 = yh.n5.y(i10, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                }
                y3.i0(this.f39665b, this.f39666c, z10, true);
                return;
        }
    }
}
