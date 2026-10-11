package org.telegram.ui;

import org.telegram.messenger.R;
public final class fc implements Runnable {
    public final int f37635a;
    public final ad f37636b;

    public fc(ad adVar, int i10) {
        this.f37635a = i10;
        this.f37636b = adVar;
    }

    @Override
    public final void run() {
        switch (this.f37635a) {
            case 0:
                ad.U(this.f37636b);
                return;
            default:
                org.telegram.messenger.q.q(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.ad.a0(this.f37636b), R.raw.done, 36);
                return;
        }
    }
}
