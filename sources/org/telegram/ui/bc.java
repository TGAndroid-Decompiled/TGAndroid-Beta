package org.telegram.ui;

import org.telegram.messenger.R;

public final class bc implements Runnable {

    public final int f36773a;

    public final xc f36774b;

    public bc(xc xcVar, int i10) {
        this.f36773a = i10;
        this.f36774b = xcVar;
    }

    @Override
    public final void run() {
        switch (this.f36773a) {
            case 0:
                xc.U(this.f36774b);
                break;
            default:
                org.telegram.messenger.y1.q(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.mc.a0(this.f36774b), R.raw.done, 36);
                break;
        }
    }
}
