package org.telegram.ui;

import org.telegram.messenger.R;
public final class gc implements Runnable {
    public final int f37535a;
    public final bd f37536b;

    public gc(bd bdVar, int i10) {
        this.f37535a = i10;
        this.f37536b = bdVar;
    }

    @Override
    public final void run() {
        switch (this.f37535a) {
            case 0:
                bd.U(this.f37536b);
                return;
            default:
                org.telegram.messenger.v0.p(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.vc.a0(this.f37536b), R.raw.done, 36);
                return;
        }
    }
}
