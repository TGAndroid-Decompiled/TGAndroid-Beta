package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class ch implements Utilities.Callback {
    public final int f37121a;
    public final long f37122b;
    public final long f37123c;
    public final Long d;
    public final Object f37124e;

    public ch(Object obj, long j10, long j11, Long l10, int i10) {
        this.f37121a = i10;
        this.f37124e = obj;
        this.f37122b = j10;
        this.f37123c = j11;
        this.d = l10;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        boolean z10;
        switch (this.f37121a) {
            case 0:
                tn.Y((tn) this.f37124e, this.f37122b, this.f37123c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i10 = ((org.telegram.ui.ActionBar.o2) ((ej) this.f37124e).f37848b).currentAccount;
                jh.s7 y8 = jh.s7.y(i10, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                y8.i0(this.f37122b, this.f37123c, z10, true);
                return;
        }
    }
}
