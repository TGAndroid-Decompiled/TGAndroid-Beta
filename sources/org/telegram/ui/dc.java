package org.telegram.ui;

import org.telegram.messenger.R;
public final class dc implements Runnable {
    public final int f36150a;
    public final bd f36151b;

    public dc(bd bdVar, int i10) {
        this.f36150a = i10;
        this.f36151b = bdVar;
    }

    @Override
    public final void run() {
        switch (this.f36150a) {
            case 0:
                bd.U(this.f36151b);
                return;
            default:
                l.d.v(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.qc.a0(this.f36151b), R.raw.done, 36);
                return;
        }
    }
}
