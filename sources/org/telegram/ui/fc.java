package org.telegram.ui;

import org.telegram.messenger.R;
public final class fc implements Runnable {
    public final int f33621a;
    public final ad f33622b;

    public fc(ad adVar, int i10) {
        this.f33621a = i10;
        this.f33622b = adVar;
    }

    @Override
    public final void run() {
        switch (this.f33621a) {
            case 0:
                ad.U(this.f33622b);
                return;
            default:
                org.telegram.messenger.f0.p(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.xc.a0(this.f33622b), R.raw.done, 36);
                return;
        }
    }
}
