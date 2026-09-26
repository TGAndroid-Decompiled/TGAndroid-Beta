package org.telegram.ui;

import org.telegram.messenger.R;
public final class fc implements Runnable {
    public final int f33622a;
    public final ad f33623b;

    public fc(ad adVar, int i10) {
        this.f33622a = i10;
        this.f33623b = adVar;
    }

    @Override
    public final void run() {
        switch (this.f33622a) {
            case 0:
                ad.U(this.f33623b);
                return;
            default:
                org.telegram.messenger.f0.p(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.xc.a0(this.f33623b), R.raw.done, 36);
                return;
        }
    }
}
