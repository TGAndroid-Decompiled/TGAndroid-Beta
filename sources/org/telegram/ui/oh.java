package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class oh implements Utilities.Callback {
    public final int f39273a;
    public final long f39274b;
    public final long f39275c;
    public final Long d;
    public final Object f39276e;

    public oh(Object obj, long j3, long j10, Long l4, int i10) {
        this.f39273a = i10;
        this.f39276e = obj;
        this.f39274b = j3;
        this.f39275c = j10;
        this.d = l4;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        boolean z10;
        switch (this.f39273a) {
            case 0:
                co.Y((co) this.f39276e, this.f39274b, this.f39275c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i10 = ((org.telegram.ui.ActionBar.n2) ((nj) this.f39276e).f38994b).currentAccount;
                zh.s5 y3 = zh.s5.y(i10, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                y3.i0(this.f39274b, this.f39275c, z10, true);
                return;
        }
    }
}
