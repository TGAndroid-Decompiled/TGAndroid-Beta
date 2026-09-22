package org.telegram.ui;

import org.telegram.messenger.R;
public final class fc implements Runnable {
    public final int f33561a;
    public final ad f33562b;

    public fc(ad adVar, int i10) {
        this.f33561a = i10;
        this.f33562b = adVar;
    }

    @Override
    public final void run() {
        switch (this.f33561a) {
            case 0:
                ad.U(this.f33562b);
                return;
            default:
                org.telegram.messenger.y0.o(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.vc.a0(this.f33562b), R.raw.done, 36);
                return;
        }
    }
}
