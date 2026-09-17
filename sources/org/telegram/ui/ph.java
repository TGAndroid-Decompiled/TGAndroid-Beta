package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class ph implements Utilities.Callback {
    public final int f36629a;
    public final long f36630b;
    public final long f36631c;
    public final Long d;
    public final Object e;

    public ph(Object obj, long j3, long j10, Long l4, int i10) {
        this.f36629a = i10;
        this.e = obj;
        this.f36630b = j3;
        this.f36631c = j10;
        this.d = l4;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        boolean z10;
        switch (this.f36629a) {
            case 0:
                bo.Y((bo) this.e, this.f36630b, this.f36631c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i10 = ((org.telegram.ui.ActionBar.o2) ((oj) this.e).f36362b).currentAccount;
                yh.v5 y3 = yh.v5.y(i10, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                y3.i0(this.f36630b, this.f36631c, z10, true);
                return;
        }
    }
}
