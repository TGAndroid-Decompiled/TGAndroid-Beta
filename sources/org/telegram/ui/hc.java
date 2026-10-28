package org.telegram.ui;

import org.telegram.messenger.R;
public final class hc implements Runnable {
    public final int f39849a;
    public final bd f39850b;

    public hc(bd bdVar, int i10) {
        this.f39849a = i10;
        this.f39850b = bdVar;
    }

    @Override
    public final void run() {
        switch (this.f39849a) {
            case 0:
                bd.V(this.f39850b);
                return;
            default:
                org.telegram.messenger.t.q(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.wc.b0(this.f39850b), R.raw.done, 36);
                return;
        }
    }
}
