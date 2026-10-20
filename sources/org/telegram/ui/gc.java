package org.telegram.ui;

import org.telegram.messenger.R;
public final class gc implements Runnable {
    public final int f37275a;
    public final bd f37276b;

    public gc(bd bdVar, int i10) {
        this.f37275a = i10;
        this.f37276b = bdVar;
    }

    @Override
    public final void run() {
        switch (this.f37275a) {
            case 0:
                bd.U(this.f37276b);
                return;
            default:
                org.telegram.messenger.g0.q(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.xc.a0(this.f37276b), R.raw.done, 36);
                return;
        }
    }
}
