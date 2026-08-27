package org.telegram.ui;

import org.telegram.messenger.Utilities;

public final class eh implements Utilities.Callback {

    public final int f37760a;

    public final long f37761b;

    public final long f37762c;
    public final Long d;

    public final Object f37763e;

    public eh(Object obj, long j10, long j11, Long l10, int i10) {
        this.f37760a = i10;
        this.f37763e = obj;
        this.f37761b = j10;
        this.f37762c = j11;
        this.d = l10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37760a) {
            case 0:
                rn.Y((rn) this.f37763e, this.f37761b, this.f37762c, this.d, (Boolean) obj);
                break;
            default:
                hh.u7.y(((org.telegram.ui.ActionBar.n2) ((dj) this.f37763e).f37415b).currentAccount, false).i0(this.f37761b, this.f37762c, this.d.longValue() > 0 && ((Boolean) obj).booleanValue(), true);
                break;
        }
    }
}
