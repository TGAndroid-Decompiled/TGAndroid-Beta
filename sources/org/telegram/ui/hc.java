package org.telegram.ui;

import org.telegram.messenger.R;
public final class hc implements Runnable {
    public final int f34228a;
    public final cd f34229b;

    public hc(cd cdVar, int i10) {
        this.f34228a = i10;
        this.f34229b = cdVar;
    }

    @Override
    public final void run() {
        switch (this.f34228a) {
            case 0:
                cd.U(this.f34229b);
                return;
            default:
                org.telegram.messenger.w1.o(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.vc.a0(this.f34229b), R.raw.done, 36);
                return;
        }
    }
}
