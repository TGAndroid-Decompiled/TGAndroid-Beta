package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class ih implements Utilities.Callback {
    public final int f34929a;
    public final long f34930b;
    public final long f34931c;
    public final Long d;
    public final Object e;

    public ih(Object obj, long j10, long j11, Long l10, int i10) {
        this.f34929a = i10;
        this.e = obj;
        this.f34930b = j10;
        this.f34931c = j11;
        this.d = l10;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        boolean z4;
        switch (this.f34929a) {
            case 0:
                zn.Y((zn) this.e, this.f34930b, this.f34931c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i10 = ((org.telegram.ui.ActionBar.p2) ((lj) this.e).f35790b).currentAccount;
                lh.t7 y10 = lh.t7.y(i10, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                y10.i0(this.f34930b, this.f34931c, z4, true);
                return;
        }
    }
}
