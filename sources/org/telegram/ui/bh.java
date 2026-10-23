package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class bh implements Utilities.Callback {
    public final int f35640a;
    public final long f35641b;
    public final long f35642c;
    public final Long d;
    public final Object e;

    public bh(Object obj, long j10, long j11, Long l4, int i10) {
        this.f35640a = i10;
        this.e = obj;
        this.f35641b = j10;
        this.f35642c = j11;
        this.d = l4;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f35640a) {
            case 0:
                qn.e0((qn) this.e, this.f35641b, this.f35642c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i10 = ((org.telegram.ui.ActionBar.n2) ((fj) this.e).f37024b).currentAccount;
                boolean z10 = false;
                ai.ga y3 = ai.ga.y(i10, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                }
                y3.i0(this.f35641b, this.f35642c, z10, true);
                return;
        }
    }
}
