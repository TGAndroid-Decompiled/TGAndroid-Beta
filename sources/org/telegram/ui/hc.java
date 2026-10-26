package org.telegram.ui;

import org.telegram.messenger.R;
public final class hc implements Runnable {
    public final int f39979a;
    public final bd f39980b;

    public hc(bd bdVar, int i10) {
        this.f39979a = i10;
        this.f39980b = bdVar;
    }

    @Override
    public final void run() {
        switch (this.f39979a) {
            case 0:
                bd.V(this.f39980b);
                return;
            default:
                org.telegram.messenger.t.q(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.wc.b0(this.f39980b), R.raw.done, 36);
                return;
        }
    }
}
