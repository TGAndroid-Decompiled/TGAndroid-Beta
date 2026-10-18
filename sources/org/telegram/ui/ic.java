package org.telegram.ui;

import org.telegram.messenger.R;
public final class ic implements Runnable {
    public final int f37819a;
    public final dd f37820b;

    public ic(dd ddVar, int i10) {
        this.f37819a = i10;
        this.f37820b = ddVar;
    }

    @Override
    public final void run() {
        switch (this.f37819a) {
            case 0:
                dd.U(this.f37820b);
                return;
            default:
                org.telegram.messenger.g0.q(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.xc.a0(this.f37820b), R.raw.done, 36);
                return;
        }
    }
}
