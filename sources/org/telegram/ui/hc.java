package org.telegram.ui;

import org.telegram.messenger.R;
public final class hc implements Runnable {
    public final int f37057a;
    public final cd f37058b;

    public hc(cd cdVar, int i10) {
        this.f37057a = i10;
        this.f37058b = cdVar;
    }

    @Override
    public final void run() {
        switch (this.f37057a) {
            case 0:
                cd.S(this.f37058b);
                return;
            default:
                org.telegram.messenger.q.p(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.yc.a0(this.f37058b), R.raw.done, 36);
                return;
        }
    }
}
