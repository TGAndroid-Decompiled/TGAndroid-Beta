package org.telegram.ui;

import org.telegram.messenger.R;
public final class gc implements Runnable {
    public final int f37276a;
    public final bd f37277b;

    public gc(bd bdVar, int i10) {
        this.f37276a = i10;
        this.f37277b = bdVar;
    }

    @Override
    public final void run() {
        switch (this.f37276a) {
            case 0:
                bd.U(this.f37277b);
                return;
            default:
                org.telegram.messenger.g0.q(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.xc.a0(this.f37277b), R.raw.done, 36);
                return;
        }
    }
}
