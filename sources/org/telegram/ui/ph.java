package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class ph implements Utilities.Callback {
    public final int f38923a;
    public final long f38924b;
    public final long f38925c;
    public final Long d;
    public final Object e;

    public ph(Object obj, long j10, long j11, Long l4, int i10) {
        this.f38923a = i10;
        this.e = obj;
        this.f38924b = j10;
        this.f38925c = j11;
        this.d = l4;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f38923a) {
            case 0:
                fo.e0((fo) this.e, this.f38924b, this.f38925c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i10 = ((org.telegram.ui.ActionBar.m2) ((sj) this.e).f39833b).currentAccount;
                boolean z10 = false;
                zh.n5 y3 = zh.n5.y(i10, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                }
                y3.i0(this.f38924b, this.f38925c, z10, true);
                return;
        }
    }
}
