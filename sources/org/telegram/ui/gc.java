package org.telegram.ui;

import org.telegram.messenger.R;
public final class gc implements Runnable {
    public final int f38017a;
    public final bd f38018b;

    public gc(bd bdVar, int i10) {
        this.f38017a = i10;
        this.f38018b = bdVar;
    }

    @Override
    public final void run() {
        switch (this.f38017a) {
            case 0:
                bd.U(this.f38018b);
                return;
            default:
                org.telegram.messenger.q.q(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.ad.a0(this.f38018b), R.raw.done, 36);
                return;
        }
    }
}
