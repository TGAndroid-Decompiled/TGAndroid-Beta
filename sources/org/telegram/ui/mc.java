package org.telegram.ui;

import org.telegram.messenger.R;
public final class mc implements Runnable {
    public final int f38215a;
    public final hd f38216b;

    public mc(hd hdVar, int i10) {
        this.f38215a = i10;
        this.f38216b = hdVar;
    }

    @Override
    public final void run() {
        switch (this.f38215a) {
            case 0:
                hd.U(this.f38216b);
                return;
            default:
                org.telegram.messenger.q.r(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.zc.a0(this.f38216b), R.raw.done, 36);
                return;
        }
    }
}
