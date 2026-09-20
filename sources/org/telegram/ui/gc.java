package org.telegram.ui;

import org.telegram.messenger.R;
public final class gc implements Runnable {
    public final int f33858a;
    public final bd f33859b;

    public gc(bd bdVar, int i10) {
        this.f33858a = i10;
        this.f33859b = bdVar;
    }

    @Override
    public final void run() {
        switch (this.f33858a) {
            case 0:
                bd.U(this.f33859b);
                return;
            default:
                org.telegram.messenger.l0.o(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.xc.a0(this.f33859b), R.raw.done, 36);
                return;
        }
    }
}
