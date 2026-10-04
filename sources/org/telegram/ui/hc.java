package org.telegram.ui;

import org.telegram.messenger.R;
public final class hc implements Runnable {
    public final int f37033a;
    public final cd f37034b;

    public hc(cd cdVar, int i10) {
        this.f37033a = i10;
        this.f37034b = cdVar;
    }

    @Override
    public final void run() {
        switch (this.f37033a) {
            case 0:
                cd.S(this.f37034b);
                return;
            default:
                org.telegram.messenger.f0.p(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.yc.a0(this.f37034b), R.raw.done, 36);
                return;
        }
    }
}
