package org.telegram.ui;

import org.telegram.messenger.R;
public final class fc implements Runnable {
    public final int f33532a;
    public final ad f33533b;

    public fc(ad adVar, int i10) {
        this.f33532a = i10;
        this.f33533b = adVar;
    }

    @Override
    public final void run() {
        switch (this.f33532a) {
            case 0:
                ad.U(this.f33533b);
                return;
            default:
                org.telegram.messenger.w1.o(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.vc.a0(this.f33533b), R.raw.done, 36);
                return;
        }
    }
}
