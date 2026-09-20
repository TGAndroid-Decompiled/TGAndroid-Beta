package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class mh implements Utilities.Callback {
    public final int f35732a;
    public final long f35733b;
    public final long f35734c;
    public final Long d;
    public final Object e;

    public mh(Object obj, long j3, long j10, Long l4, int i10) {
        this.f35732a = i10;
        this.e = obj;
        this.f35733b = j3;
        this.f35734c = j10;
        this.d = l4;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        boolean z10;
        switch (this.f35732a) {
            case 0:
                zn.a0((zn) this.e, this.f35733b, this.f35734c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i10 = ((org.telegram.ui.ActionBar.n2) ((mj) this.e).f35746b).currentAccount;
                yh.u5 y3 = yh.u5.y(i10, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                y3.i0(this.f35733b, this.f35734c, z10, true);
                return;
        }
    }
}
