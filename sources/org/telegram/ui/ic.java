package org.telegram.ui;

import org.telegram.messenger.R;
public final class ic implements Runnable {
    public final int f37857a;
    public final dd f37858b;

    public ic(dd ddVar, int i10) {
        this.f37857a = i10;
        this.f37858b = ddVar;
    }

    @Override
    public final void run() {
        switch (this.f37857a) {
            case 0:
                dd.U(this.f37858b);
                return;
            default:
                org.telegram.messenger.g0.q(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.xc.a0(this.f37858b), R.raw.done, 36);
                return;
        }
    }
}
