package org.telegram.ui;

import org.telegram.messenger.R;
public final class hc implements Runnable {
    public final int f34188a;
    public final cd f34189b;

    public hc(cd cdVar, int i10) {
        this.f34188a = i10;
        this.f34189b = cdVar;
    }

    @Override
    public final void run() {
        switch (this.f34188a) {
            case 0:
                cd.U(this.f34189b);
                return;
            default:
                org.telegram.messenger.l0.o(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.xc.a0(this.f34189b), R.raw.done, 36);
                return;
        }
    }
}
