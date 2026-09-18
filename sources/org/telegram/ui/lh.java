package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class lh implements Utilities.Callback {
    public final int f35381a;
    public final long f35382b;
    public final long f35383c;
    public final Long d;
    public final Object e;

    public lh(Object obj, long j3, long j10, Long l4, int i10) {
        this.f35381a = i10;
        this.e = obj;
        this.f35382b = j3;
        this.f35383c = j10;
        this.d = l4;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        boolean z10;
        switch (this.f35381a) {
            case 0:
                zn.a0((zn) this.e, this.f35382b, this.f35383c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i10 = ((org.telegram.ui.ActionBar.n2) ((mj) this.e).f35681b).currentAccount;
                yh.t5 y3 = yh.t5.y(i10, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                y3.i0(this.f35382b, this.f35383c, z10, true);
                return;
        }
    }
}
