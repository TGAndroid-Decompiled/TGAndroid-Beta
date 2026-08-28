package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class ch implements Utilities.Callback {
    public final int f37207a;
    public final long f37208b;
    public final long f37209c;
    public final Long d;
    public final Object f37210e;

    public ch(Object obj, long j10, long j11, Long l10, int i9) {
        this.f37207a = i9;
        this.f37210e = obj;
        this.f37208b = j10;
        this.f37209c = j11;
        this.d = l10;
    }

    @Override
    public final void run(Object obj) {
        int i9;
        boolean z10;
        switch (this.f37207a) {
            case 0:
                qn.X((qn) this.f37210e, this.f37208b, this.f37209c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i9 = ((org.telegram.ui.ActionBar.o2) ((bj) this.f37210e).f36877b).currentAccount;
                gh.v7 y10 = gh.v7.y(i9, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                y10.i0(this.f37208b, this.f37209c, z10, true);
                return;
        }
    }
}
