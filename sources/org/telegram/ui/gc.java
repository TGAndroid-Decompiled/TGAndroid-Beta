package org.telegram.ui;

import org.telegram.messenger.R;
public final class gc implements Runnable {
    public final int f37971a;
    public final bd f37972b;

    public gc(bd bdVar, int i10) {
        this.f37971a = i10;
        this.f37972b = bdVar;
    }

    @Override
    public final void run() {
        switch (this.f37971a) {
            case 0:
                bd.U(this.f37972b);
                return;
            default:
                org.telegram.messenger.q.q(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.ad.a0(this.f37972b), R.raw.done, 36);
                return;
        }
    }
}
