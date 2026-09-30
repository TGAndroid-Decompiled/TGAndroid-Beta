package org.telegram.ui;

import org.telegram.messenger.R;
public final class fc implements Runnable {
    public final int f33707a;
    public final ad f33708b;

    public fc(ad adVar, int i10) {
        this.f33707a = i10;
        this.f33708b = adVar;
    }

    @Override
    public final void run() {
        switch (this.f33707a) {
            case 0:
                ad.U(this.f33708b);
                return;
            default:
                org.telegram.messenger.f0.p(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.yc.a0(this.f33708b), R.raw.done, 36);
                return;
        }
    }
}
