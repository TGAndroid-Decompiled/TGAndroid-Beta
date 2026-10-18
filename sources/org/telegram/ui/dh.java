package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class dh implements Utilities.Callback {
    public final int f36220a;
    public final long f36221b;
    public final long f36222c;
    public final Long d;
    public final Object e;

    public dh(Object obj, long j10, long j11, Long l4, int i10) {
        this.f36220a = i10;
        this.e = obj;
        this.f36221b = j10;
        this.f36222c = j11;
        this.d = l4;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f36220a) {
            case 0:
                sn.e0((sn) this.e, this.f36221b, this.f36222c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i10 = ((org.telegram.ui.ActionBar.n2) ((hj) this.e).f37584b).currentAccount;
                boolean z10 = false;
                ai.ga y3 = ai.ga.y(i10, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                }
                y3.i0(this.f36221b, this.f36222c, z10, true);
                return;
        }
    }
}
