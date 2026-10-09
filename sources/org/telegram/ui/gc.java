package org.telegram.ui;

import org.telegram.messenger.R;
public final class gc implements Runnable {
    public final int f37973a;
    public final bd f37974b;

    public gc(bd bdVar, int i10) {
        this.f37973a = i10;
        this.f37974b = bdVar;
    }

    @Override
    public final void run() {
        switch (this.f37973a) {
            case 0:
                bd.U(this.f37974b);
                return;
            default:
                org.telegram.messenger.q.q(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.ad.a0(this.f37974b), R.raw.done, 36);
                return;
        }
    }
}
