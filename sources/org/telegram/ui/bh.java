package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class bh implements Utilities.Callback {
    public final int f36100a;
    public final long f36101b;
    public final long f36102c;
    public final Long d;
    public final Object e;

    public bh(Object obj, long j10, long j11, Long l4, int i10) {
        this.f36100a = i10;
        this.e = obj;
        this.f36101b = j10;
        this.f36102c = j11;
        this.d = l4;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f36100a) {
            case 0:
                sn.e0((sn) this.e, this.f36101b, this.f36102c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i10 = ((org.telegram.ui.ActionBar.o2) ((fj) this.e).f37343b).currentAccount;
                boolean z10 = false;
                ai.ha y3 = ai.ha.y(i10, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                }
                y3.i0(this.f36101b, this.f36102c, z10, true);
                return;
        }
    }
}
