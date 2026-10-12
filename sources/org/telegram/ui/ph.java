package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class ph implements Utilities.Callback {
    public final int f39225a;
    public final long f39226b;
    public final long f39227c;
    public final Long d;
    public final Object e;

    public ph(Object obj, long j10, long j11, Long l4, int i10) {
        this.f39225a = i10;
        this.e = obj;
        this.f39226b = j10;
        this.f39227c = j11;
        this.d = l4;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f39225a) {
            case 0:
                fo.e0((fo) this.e, this.f39226b, this.f39227c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i10 = ((org.telegram.ui.ActionBar.m2) ((sj) this.e).f40157b).currentAccount;
                boolean z10 = false;
                zh.n5 y3 = zh.n5.y(i10, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                }
                y3.i0(this.f39226b, this.f39227c, z10, true);
                return;
        }
    }
}
