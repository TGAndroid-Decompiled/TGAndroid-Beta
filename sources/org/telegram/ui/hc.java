package org.telegram.ui;

import org.telegram.messenger.R;
public final class hc implements Runnable {
    public final int f37038a;
    public final cd f37039b;

    public hc(cd cdVar, int i10) {
        this.f37038a = i10;
        this.f37039b = cdVar;
    }

    @Override
    public final void run() {
        switch (this.f37038a) {
            case 0:
                cd.S(this.f37039b);
                return;
            default:
                org.telegram.messenger.q.p(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.yc.a0(this.f37039b), R.raw.done, 36);
                return;
        }
    }
}
