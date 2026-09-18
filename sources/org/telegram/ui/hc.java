package org.telegram.ui;

import org.telegram.messenger.R;
public final class hc implements Runnable {
    public final int f34233a;
    public final cd f34234b;

    public hc(cd cdVar, int i10) {
        this.f34233a = i10;
        this.f34234b = cdVar;
    }

    @Override
    public final void run() {
        switch (this.f34233a) {
            case 0:
                cd.U(this.f34234b);
                return;
            default:
                org.telegram.messenger.w1.o(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.vc.a0(this.f34234b), R.raw.done, 36);
                return;
        }
    }
}
