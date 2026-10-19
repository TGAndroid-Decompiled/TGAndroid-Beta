package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class bh implements Utilities.Callback {
    public final int f35629a;
    public final long f35630b;
    public final long f35631c;
    public final Long d;
    public final Object e;

    public bh(Object obj, long j10, long j11, Long l4, int i10) {
        this.f35629a = i10;
        this.e = obj;
        this.f35630b = j10;
        this.f35631c = j11;
        this.d = l4;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f35629a) {
            case 0:
                qn.e0((qn) this.e, this.f35630b, this.f35631c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i10 = ((org.telegram.ui.ActionBar.n2) ((fj) this.e).f37013b).currentAccount;
                boolean z10 = false;
                ai.ga y3 = ai.ga.y(i10, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                }
                y3.i0(this.f35630b, this.f35631c, z10, true);
                return;
        }
    }
}
