package org.telegram.ui;

import org.telegram.messenger.R;
public final class ic implements Runnable {
    public final int f37843a;
    public final dd f37844b;

    public ic(dd ddVar, int i10) {
        this.f37843a = i10;
        this.f37844b = ddVar;
    }

    @Override
    public final void run() {
        switch (this.f37843a) {
            case 0:
                dd.U(this.f37844b);
                return;
            default:
                org.telegram.messenger.q.q(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.xc.a0(this.f37844b), R.raw.done, 36);
                return;
        }
    }
}
