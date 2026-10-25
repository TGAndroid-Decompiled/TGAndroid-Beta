package org.telegram.ui;

import org.telegram.messenger.R;
public final class hc implements Runnable {
    public final int f39976a;
    public final bd f39977b;

    public hc(bd bdVar, int i10) {
        this.f39976a = i10;
        this.f39977b = bdVar;
    }

    @Override
    public final void run() {
        switch (this.f39976a) {
            case 0:
                bd.V(this.f39977b);
                return;
            default:
                org.telegram.messenger.t.q(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.wc.b0(this.f39977b), R.raw.done, 36);
                return;
        }
    }
}
