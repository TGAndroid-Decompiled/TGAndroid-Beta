package org.telegram.ui;

import org.telegram.messenger.R;
public final class fc implements Runnable {
    public final int f34025a;
    public final dd f34026b;

    public fc(dd ddVar, int i10) {
        this.f34025a = i10;
        this.f34026b = ddVar;
    }

    @Override
    public final void run() {
        switch (this.f34025a) {
            case 0:
                dd.U(this.f34026b);
                return;
            default:
                kf.k0.v(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.qc.a0(this.f34026b), R.raw.done, 36);
                return;
        }
    }
}
