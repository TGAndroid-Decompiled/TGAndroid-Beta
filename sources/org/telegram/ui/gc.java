package org.telegram.ui;

import org.telegram.messenger.R;
public final class gc implements Runnable {
    public final int f37565a;
    public final bd f37566b;

    public gc(bd bdVar, int i10) {
        this.f37565a = i10;
        this.f37566b = bdVar;
    }

    @Override
    public final void run() {
        switch (this.f37565a) {
            case 0:
                bd.U(this.f37566b);
                return;
            default:
                org.telegram.messenger.v0.p(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.xc.a0(this.f37566b), R.raw.done, 36);
                return;
        }
    }
}
