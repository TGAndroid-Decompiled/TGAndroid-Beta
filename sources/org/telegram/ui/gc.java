package org.telegram.ui;

import org.telegram.messenger.R;
public final class gc implements Runnable {
    public final int f33801a;
    public final bd f33802b;

    public gc(bd bdVar, int i10) {
        this.f33801a = i10;
        this.f33802b = bdVar;
    }

    @Override
    public final void run() {
        switch (this.f33801a) {
            case 0:
                bd.U(this.f33802b);
                return;
            default:
                org.telegram.messenger.q.q(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.xc.a0(this.f33802b), R.raw.done, 36);
                return;
        }
    }
}
