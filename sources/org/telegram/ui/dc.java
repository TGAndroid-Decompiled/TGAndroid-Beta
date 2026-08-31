package org.telegram.ui;

import org.telegram.messenger.R;
public final class dc implements Runnable {
    public final int f36175a;
    public final bd f36176b;

    public dc(bd bdVar, int i10) {
        this.f36175a = i10;
        this.f36176b = bdVar;
    }

    @Override
    public final void run() {
        switch (this.f36175a) {
            case 0:
                bd.U(this.f36176b);
                return;
            default:
                l.d.v(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.qc.a0(this.f36176b), R.raw.done, 36);
                return;
        }
    }
}
