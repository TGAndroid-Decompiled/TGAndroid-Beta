package org.telegram.ui;

import org.telegram.messenger.R;
public final class hc implements Runnable {
    public final int f37032a;
    public final cd f37033b;

    public hc(cd cdVar, int i10) {
        this.f37032a = i10;
        this.f37033b = cdVar;
    }

    @Override
    public final void run() {
        switch (this.f37032a) {
            case 0:
                cd.S(this.f37033b);
                return;
            default:
                org.telegram.messenger.f0.p(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.yc.a0(this.f37033b), R.raw.done, 36);
                return;
        }
    }
}
