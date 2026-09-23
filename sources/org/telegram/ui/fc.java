package org.telegram.ui;

import org.telegram.messenger.R;
public final class fc implements Runnable {
    public final int f33279a;
    public final ad f33280b;

    public fc(ad adVar, int i10) {
        this.f33279a = i10;
        this.f33280b = adVar;
    }

    @Override
    public final void run() {
        switch (this.f33279a) {
            case 0:
                ad.U(this.f33280b);
                return;
            default:
                org.telegram.messenger.z0.o(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.xc.a0(this.f33280b), R.raw.done, 36);
                return;
        }
    }
}
