package org.telegram.ui;

import org.telegram.messenger.R;
public final class gc implements Runnable {
    public final int f33886a;
    public final bd f33887b;

    public gc(bd bdVar, int i10) {
        this.f33886a = i10;
        this.f33887b = bdVar;
    }

    @Override
    public final void run() {
        switch (this.f33886a) {
            case 0:
                bd.U(this.f33887b);
                return;
            default:
                org.telegram.messenger.l0.o(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.xc.a0(this.f33887b), R.raw.done, 36);
                return;
        }
    }
}
