package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class ph implements Utilities.Callback {
    public final int f40962a;
    public final long f40963b;
    public final long f40964c;
    public final Long d;
    public final Object f40965e;

    public ph(Object obj, long j3, long j10, Long l4, int i10) {
        this.f40962a = i10;
        this.f40965e = obj;
        this.f40963b = j3;
        this.f40964c = j10;
        this.d = l4;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f40962a) {
            case 0:
                eo.e0((eo) this.f40965e, this.f40963b, this.f40964c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i10 = ((org.telegram.ui.ActionBar.m2) ((sj) this.f40965e).f41941b).currentAccount;
                boolean z10 = false;
                yh.n5 y3 = yh.n5.y(i10, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                }
                y3.i0(this.f40963b, this.f40964c, z10, true);
                return;
        }
    }
}
