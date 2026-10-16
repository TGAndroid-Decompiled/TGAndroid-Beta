package org.telegram.ui;

import org.telegram.messenger.R;
public final class lc implements Runnable {
    public final int f37677a;
    public final gd f37678b;

    public lc(gd gdVar, int i10) {
        this.f37677a = i10;
        this.f37678b = gdVar;
    }

    @Override
    public final void run() {
        switch (this.f37677a) {
            case 0:
                gd.U(this.f37678b);
                return;
            default:
                org.telegram.messenger.g0.q(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.zc.a0(this.f37678b), R.raw.done, 36);
                return;
        }
    }
}
